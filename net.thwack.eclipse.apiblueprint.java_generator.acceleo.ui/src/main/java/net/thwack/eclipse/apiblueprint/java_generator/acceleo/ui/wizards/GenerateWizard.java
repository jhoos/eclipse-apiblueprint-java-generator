package net.thwack.eclipse.apiblueprint.java_generator.acceleo.ui.wizards;

import net.thwack.eclipse.apiblueprint.java_generator.acceleo.ui.common.GenerationParameters;
import net.thwack.eclipse.apiblueprint.java_generator.acceleo.ui.popupMenus.AcceleoGenerateGenerateJavaCodeAction;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

/**
 * This is a sample new wizard. Its role is to create a new file resource in the
 * provided container. If the container resource (a folder or a project) is
 * selected in the workspace when the wizard is opened, it will accept it as the
 * target container. The wizard creates one file with the extension "mpe". If a
 * sample multi-page editor (also available as a template) is registered for the
 * same extension, it will be able to open it.
 */

public class GenerateWizard extends Wizard implements INewWizard {
	private ResourceClassesPage resourcePage;
	private RepresentationTestsPage representationTestPage;
	private ISelection selection;
	private AcceleoGenerateGenerateJavaCodeAction parentAction;
	
	/**
	 * Constructor for SampleNewWizard.
	 */
	public GenerateWizard(AcceleoGenerateGenerateJavaCodeAction parentAction) {
		super();
		setNeedsProgressMonitor(true);
		this.parentAction = parentAction;
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		resourcePage = new ResourceClassesPage(selection);
		addPage(resourcePage);
		representationTestPage = new RepresentationTestsPage(selection);
		addPage(representationTestPage);
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish() {
		GenerationParameters params = new GenerationParameters();
		params.setResourceTarget(resourcePage.getPackageFragmentRoot()
				.getResource());
		params.setResourceJavaPackage(resourcePage.getPackageText());
		params.setRepresentationJavaPackage(representationTestPage.getPackageText());
		params.setRepresentationTestTarget(representationTestPage.getPackageFragmentRoot().getResource());

		parentAction.doGeneration(params);

		return true;
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}