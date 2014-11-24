/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package net.thwack.apiblueprint.acceleo.ui.popupMenus;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

import net.thwack.apiblueprint.acceleo.ui.Activator;
import net.thwack.apiblueprint.acceleo.ui.common.GenerateAll;
import net.thwack.apiblueprint.acceleo.ui.wizards.GenerateWizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * Generate Java Code code generation.
 */
public class AcceleoGenerateGenerateJavaCodeAction extends ActionDelegate
		implements IActionDelegate {

	/**
	 * Selected model files.
	 */
	protected IStructuredSelection selection;

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 * @generated
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			this.selection = (IStructuredSelection) selection;
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#run(org.eclipse.jface.action.IAction)
	 * @generated
	 */
	public void run(IAction action) {
		GenerateWizard wizard = new GenerateWizard(this);
		wizard.init(PlatformUI.getWorkbench(), selection);
		WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getShell(), wizard);
		dialog.open();
	}

	@SuppressWarnings("unchecked")
	public void doGeneration(final IResource target, final String javaPackage) {
		final List<IFile> files = selection.toList();
		if (files != null) {
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					try {
						Iterator<IFile> filesIt = files.iterator();
						while (filesIt.hasNext()) {
							IFile model = (IFile) filesIt.next();
							try {
								GenerateAll generator = new GenerateAll(model,
										target, javaPackage);
								generator.doGenerate(monitor);
							} finally {
								model.getProject().refreshLocal(
										IResource.DEPTH_INFINITE, monitor);
							}
						}
					} catch (IOException e) {
						IStatus status = new Status(IStatus.ERROR,
								Activator.PLUGIN_ID, e.getMessage(), e);
						StatusManager.getManager().handle(status,
								StatusManager.SHOW | StatusManager.LOG);
					} catch (CoreException e) {
						StatusManager.getManager().handle(e,
								Activator.PLUGIN_ID);
					}
				}
			};
			try {
				PlatformUI.getWorkbench().getProgressService()
						.run(true, true, operation);
			} catch (InvocationTargetException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
						e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			} catch (InterruptedException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
						e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			}
		}
	}
}