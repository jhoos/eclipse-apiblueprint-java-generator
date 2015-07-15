package net.thwack.apiblueprint.acceleo.ui.common;

import org.eclipse.core.resources.IResource;

public class GenerationParameters {
	private IResource resourceTarget;
	private String resourceJavaPackage;
	private IResource representationTarget;
	private String representationJavaPackage;
	private IResource representationTestTarget;

	public IResource getResourceTarget() {
		return resourceTarget;
	}

	public void setResourceTarget(IResource resourceTarget) {
		this.resourceTarget = resourceTarget;
	}

	public String getResourceJavaPackage() {
		return resourceJavaPackage;
	}

	public void setResourceJavaPackage(String resourceJavaPackage) {
		this.resourceJavaPackage = resourceJavaPackage;
	}

	public IResource getRepresentationTarget() {
		return representationTarget;
	}

	public void setRepresentationTarget(IResource representationTarget) {
		this.representationTarget = representationTarget;
	}

	public String getRepresentationJavaPackage() {
		return representationJavaPackage;
	}

	public void setRepresentationJavaPackage(String representationJavaPackage) {
		this.representationJavaPackage = representationJavaPackage;
	}

	public IResource getRepresentationTestTarget() {
		return representationTestTarget;
	}

	public void setRepresentationTestTarget(IResource representationTestTarget) {
		this.representationTestTarget = representationTestTarget;
	}
}
