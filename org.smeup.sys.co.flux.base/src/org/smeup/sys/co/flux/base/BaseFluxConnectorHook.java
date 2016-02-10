/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.co.flux.base;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.flux.core.Repository;
import org.smeup.sys.rt.core.ComponentStarted;
import org.smeup.sys.rt.core.QApplication;


public class BaseFluxConnectorHook {

	@ComponentStarted
	public void start(QApplication application) throws Exception {

		initProjectConnections();		
//		ResourcesPlugin.getWorkspace().addResourceChangeListener(new WorkspaceClientListener());		
		
		BaseFluxComponent fluxComponent = new BaseFluxComponent();
		fluxComponent.activate();
	}

	private void initProjectConnections() {
				
		/** 
		 * Lists the projects in active workspace and adds those not already connected to flux  
		 */
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject[] projects = root.getProjects();
		
		for (IProject project : projects) {
			
			String projectName = project.getName();
			
			if (project.isOpen()) {

				Repository repository = org.eclipse.flux.core.Activator.getDefault().getRepository();

				if (repository.getProject(projectName) == null) {
					repository.addProject(project);
				}
			}
		}
	}

}
