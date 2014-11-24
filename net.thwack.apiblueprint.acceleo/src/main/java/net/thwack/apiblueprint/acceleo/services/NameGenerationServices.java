package net.thwack.apiblueprint.acceleo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import net.thwack.apiblueprint.model.Action;
import net.thwack.apiblueprint.model.Base;
import net.thwack.apiblueprint.model.Parameter;
import net.thwack.apiblueprint.model.Request;
import net.thwack.apiblueprint.model.Resource;
import net.thwack.apiblueprint.model.Response;
import net.thwack.apiblueprint.model.TransactionExample;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

public class NameGenerationServices {
	public String toJavaName(String text, boolean upperFirst) {
		List<String> words = Splitter.on(Pattern.compile("\\s+")).splitToList(text.replaceAll("[^A-Za-z0-9_]+", " "));
		StringBuilder sb = new StringBuilder();
		for (String w: words) {
			if (w.equalsIgnoreCase("a") || w.equalsIgnoreCase("the") || w.equalsIgnoreCase("an")) {
				continue;
			}
			if (upperFirst) {
				sb.append(w.substring(0, 1).toUpperCase() + w.substring(1));
			} else {
				sb.append(w.substring(0, 1).toLowerCase() + w.substring(1));
			}
			upperFirst = true;
		}
		return sb.toString();
	}

	public String getJavaComment(Base s, String prefix) {
		String out = s.getDescription().trim();
		out = out.replaceAll("(?m)^(.*)$", prefix + " * $1");
		out = out.replaceAll("`(.*)`", "{@code $1}");
		out = out.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
		out = out.replaceAll("\\[([^\\]]+)\\]\\(([^\\)]+)\\)", "<a href=\"$2\">$1</a>");
		out = out.replaceAll("([^'\"])(http|https)://(\\S+)", "$1<a href=\"$2://$3\">$2://$3</a>");
		out = out.replaceAll("(?m)^(\\s*\\*\\s*)$", "$1<p/>");
		out = out.replaceAll("(?s)(?:\n\\s*\\* <p/>)*((?:\n\\s*\\*     [^\n]*)+)(?:\n\\s*\\* <p/>)*", prefix + "\n * <pre>$1\n" + prefix + " * </pre>");
		if (out.length() > 0) {
			out = "\n" + out ;
		}
		return out;
	}

	public String getJavaComment(Action a, Resource r) {
		StringBuilder sb = new StringBuilder();
		sb.append(getJavaComment((Base) a, "\t"));

		StringBuilder sb2 = new StringBuilder();
		sb2.append(getJavaParamComment(r.getParameters()));
		sb2.append(getJavaParamComment(a.getParameters()));
		String t = getRequestType(a, r);
		if (t != null) {
			sb2.append("\t * @param " + toJavaName(t, false) + " input entity");
		}
		
		if (sb2.length() > 0) {
			sb.append("\n\t *\n").append(sb2);
		}
		
//		if (sb.length() > 0) {
//			sb.append("\n\t");
//		}
		
		return sb.toString();
	}

	public String getRequestType(Action a, Resource res) {
		for (TransactionExample ex : a.getExamples()) {
			for (Request r : ex.getRequests()) {
				if (r.getReference() != null) {
					return r.getReference().getId();
				}
				else if (r.getBody() != null && r.getBody().trim().startsWith("{")) {
					return toJavaName(res.getName(), true) + "Request";
				}
			}
		}

		return null;
	}

	public String getResponseType(Action a, Resource res) {
		for (TransactionExample ex : a.getExamples()) {
			for (Response r : ex.getResponses()) {
				if (r.getReference() != null) {
					return r.getReference().getId();
				}
				else if (r.getBody() != null && r.getBody().trim().startsWith("{")) {
					return toJavaName(res.getName(), true) + "Response";
				}
			}
		}

		return null;
	}

	private String getJavaParamComment(List<Parameter> params) {
		StringBuilder sb = new StringBuilder();
		for (Parameter p : params) {
			sb.append("\t * @param ");
			sb.append(toJavaName(p.getName(), false));
			sb.append(" ");
			sb.append(getJavaComment(p, "\t").substring(4));
		}
		return sb.toString();
	}

	private String parameterTypeToJavaType(String type) {
		if (type.equalsIgnoreCase("number")) {
			return "int";
		}
		if (type.equalsIgnoreCase("string")) {
			return "string";
		}
		if (type.equalsIgnoreCase("boolean")) {
			return "boolean";
		}
		throw new RuntimeException("Unknown parameter type '" + type
				+ "' in blueprint");
	}

	private List<String> getParameters(List<Parameter> params, String type) {
		ArrayList<String> paramStrings = new ArrayList<>();
		for (Parameter param : params) {
			StringBuilder sb = new StringBuilder();
			sb.append("@");
			sb.append(type);
			sb.append("(\"");
			sb.append(param.getName());
			sb.append("\") ");
			if (param.getDefault() != null) {
				sb.append("@DefaultValue(\"");
				sb.append(param.getDefault());
				sb.append("\") ");
			}
			sb.append(parameterTypeToJavaType(param.getType()));
			sb.append(" ");
			sb.append(toJavaName(param.getName(), false));
			paramStrings.add(sb.toString());
		}

		return paramStrings;
	}

	public String getParameters(Action a, Resource r) {
		List<String> params = getParameters(r.getParameters(), "PathParam");
		params.addAll(getParameters(a.getParameters(), "QueryParam"));
		
		String t = getRequestType(a, r);
		if (t != null) {
			params.add(toJavaName(t, true) + " " + toJavaName(t, false));
		}
		
		StringBuilder sb = new StringBuilder();
		Joiner.on(", ").appendTo(sb, params);
		return sb.toString();
	}
}
