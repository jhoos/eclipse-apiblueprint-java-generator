package net.thwack.apiblueprint.acceleo.ui.wizards;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * Asks for the source folder and package name to use when creating the Java
 * classes for the REST API Blueprint.
 */
public class RepresentationTestsPage extends NewTypeWizardPage {
	/**
	 * Constructor
	 * 
	 * @param selection
	 *            the selection from the action that is triggering this dialog
	 */
	public RepresentationTestsPage(ISelection selection) {
		super(CLASS_TYPE, "wizardPage");
		setTitle("Generate Java From REST API Blueprint");
		setDescription("Specify where to generate REST Representation unit tests");
		setDefaultPackageFragmentRoot(selection);
	}

	/**
	 * Set the initial source folder selection to the first source folder of the
	 * project that contains the blueprint.
	 * 
	 * @param selection
	 *            the selected blueprint
	 */
	private void setDefaultPackageFragmentRoot(ISelection selection) {
		if (!(selection instanceof IStructuredSelection)) {
			return;
		}
		IStructuredSelection isel = (IStructuredSelection) selection;
		@SuppressWarnings("unchecked")
		List<IFile> files = isel.toList();
		if (files.isEmpty()) {
			return;
		}
		IProject project = files.get(0).getProject();
		try {
			if (!project.hasNature(JavaCore.NATURE_ID)) {
				return;
			}
		} catch (CoreException e1) {
			return;
		}
		IJavaProject jproj = JavaCore.create(project);
		try {
			IPackageFragmentRoot[] allPackageFragmentRoots = jproj
					.getAllPackageFragmentRoots();
			for (IPackageFragmentRoot root : allPackageFragmentRoots) {
				if (root.getKind() == IPackageFragmentRoot.K_SOURCE) {
					setPackageFragmentRoot(root, true);
					return;
				}
			}
		} catch (JavaModelException e) {
			return;
		}
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout(4, false);
		container.setLayout(layout);
		layout.verticalSpacing = 9;

		createContainerControls(container, 4);
		createPackageControls(container, 4);

		setControl(container);
	}

	/**
	 * The base class handles changes to the source folder. This class needs to
	 * handle changes to the Java package, as well as updating the status with
	 * the relevant pieces from the base class that we're actually using.
	 */
	@Override
	protected void handleFieldChanged(String fieldName) {
		// TODO Auto-generated method stub
		if (fieldName == NewTypeWizardPage.PACKAGE) {
			packageChanged();
		}
		super.handleFieldChanged(fieldName);
		updateStatus(new IStatus[] { fContainerStatus, fPackageStatus });
	}
}