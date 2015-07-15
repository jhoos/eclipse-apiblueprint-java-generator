package net.thwack.apiblueprint.acceleo.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import net.thwack.apiblueprint.acceleo.Activator;
import net.thwack.apiblueprint.model.APIBlueprint;

import org.codehaus.jackson.map.ObjectMapper;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Monitor;

public abstract class AbstractGenerator extends AbstractAcceleoGenerator {

	public AbstractGenerator() {
		super();
	}


	/**
	 * This allows clients to instantiates a generator with all required
	 * information.
	 * 
	 * @param model
	 *            input stream containing the model on which this generator will
	 *            be used
	 * @param targetFolder
	 *            This will be used as the output folder for this generation :
	 *            it will be the base path against which all file block URLs
	 *            will be resolved.
	 * @param javaPackage
	 *            Java package to generate code into.
	 * @throws CoreException
	 *             This can be thrown in three scenarios : the module cannot be
	 *             found, it cannot be loaded, or the model cannot be loaded.
	 */
	public AbstractGenerator(InputStream model, File targetFolder, String javaPackage)
			throws CoreException {
		try (InputStream jsonStream = blueprintToJson(model)) {
			ObjectMapper mapper = new ObjectMapper();
			APIBlueprint blueprint = mapper.readValue(jsonStream,
					APIBlueprint.class);
			List<String> args = new ArrayList<>();
			args.add(javaPackage);
			initialize(blueprint, targetFolder, args);
		} catch (Exception e) {
			throw new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID, e.getLocalizedMessage(), e));
		}
	}

	/**
	 * @throws IOException
	 */
	public InputStream blueprintToJson(final InputStream blueprintFile) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("/usr/local/bin/snowcrash",
				"--format=json");
		final Process proc = pb.start();
		Thread th = new Thread() {
			@Override
			public void run() {
				try (InputStream bpf = blueprintFile;
						OutputStream of = proc.getOutputStream()) {
					byte[] buffer = new byte[4096];
					int bytes;
					while ((bytes = bpf.read(buffer)) > 0) {
						of.write(buffer, 0, bytes);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		th.start();
		return proc.getInputStream();
	}


	/**
	 * Launches the generation described by this instance.
	 * 
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @throws IOException
	 *             This will be thrown if any of the output files cannot be
	 *             saved to disk.
	 */
	@Override
	public void doGenerate(Monitor monitor) throws IOException {
		org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(model);
	
		/*
		 * If you want to check for potential errors in your models before the
		 * launch of the generation, you use the code below.
		 */
	
		if (model != null && model.eResource() != null) {
			List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> errors = model
					.eResource().getErrors();
			for (org.eclipse.emf.ecore.resource.Resource.Diagnostic diagnostic : errors) {
				System.err.println(diagnostic.toString());
			}
		}
	
		super.doGenerate(monitor);
	}

}