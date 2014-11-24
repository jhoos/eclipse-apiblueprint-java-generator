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
package net.thwack.apiblueprint.acceleo.ui.common;

import java.io.IOException;
import java.util.ArrayList;

import net.thwack.apiblueprint.acceleo.Activator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;

/**
 * Main entry point of the 'Generate Java Code' generation module.
 */
public class GenerateAll {

	/**
	 * The model file.
	 */
	private IFile model;

	/**
	 * The output folder.
	 */
	private IResource targetFolder;

	/**
	 * The other arguments.
	 */
	private String javaPackage;

	/**
	 * Constructor.
	 * 
	 * @param modelURI
	 *            is the URI of the model.
	 * @param targetFolder
	 *            is the output folder
	 * @param arguments
	 *            are the other arguments
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public GenerateAll(IFile model, IResource targetFolder, String javaPackage) {
		this.model = model;
		this.targetFolder = targetFolder;
		this.javaPackage = javaPackage;
	}

	/**
	 * Launches the generation.
	 *
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @throws CoreException
	 *             if somethign else blows up
	 * @generated
	 */
	public void doGenerate(IProgressMonitor monitor) throws IOException,
			CoreException {
		if (!targetFolder.getLocation().toFile().exists()) {
			targetFolder.getLocation().toFile().mkdirs();
		}

		monitor.subTask("Loading...");
		net.thwack.apiblueprint.acceleo.main.Generate gen0 = new net.thwack.apiblueprint.acceleo.main.Generate(
				model.getContents(), targetFolder.getLocation().toFile(),
				javaPackage);
		monitor.worked(1);
		try {
			String generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil
					.computeUIProjectID("net.thwack.apiblueprint.acceleo",
							"net.thwack.apiblueprint.acceleo.main.Generate",
							model.toString(), targetFolder.getFullPath()
									.toString(), new ArrayList<String>());
			gen0.setGenerationID(generationID);
			gen0.doGenerate(BasicMonitor.toMonitor(monitor));
		} catch (RuntimeException e) {
			throw new CoreException(new Status(Status.ERROR,
					Activator.PLUGIN_ID, e.getLocalizedMessage(), e));
		}

	}
}
