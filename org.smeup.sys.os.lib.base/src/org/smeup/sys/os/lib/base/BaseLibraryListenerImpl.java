/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * 
 * Contributors: 
 *   Mattia Rocchi - Initial API and implementation 
 */
package org.smeup.sys.os.lib.base;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.dk.source.QDevelopmentKitSourceFactory;
import org.smeup.sys.dk.source.QProject;
import org.smeup.sys.dk.source.QProjectDef;
import org.smeup.sys.dk.source.QSourceManager;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.QResourceListener;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.lib.QLibrary;

public class BaseLibraryListenerImpl implements QResourceListener<QLibrary> {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QSourceManager sourceManager;
	
	@PostConstruct
	public void init() {
		resourceManager.registerListener(QLibrary.class, this);
	}
	
	@Override
	public void handleEvent(QResourceEvent<QLibrary> event) {

		QContextProvider contextProvider = event.getResource().getContextProvider();
		QLibrary library = event.getSource();

		switch (event.getType()) {
		case PRE_SAVE:
			
			QProject project = sourceManager.getProject(contextProvider.getContext(), library.getName());
			if (project == null) {
				QProjectDef projectDef = QDevelopmentKitSourceFactory.eINSTANCE.createProjectDef();
				projectDef.setText(library.getText());
				projectDef.setName(library.getName());
				try {
					project = sourceManager.createProject(contextProvider.getContext(), projectDef, false);					
					
/*					Repository repository = org.eclipse.flux.core.Activator.getDefault().getRepository();
					if (repository.getProject(project.getName()) == null) {
						repository.addProject(ResourcesPlugin.getWorkspace().getRoot().getProject(project.getName()));
					}
*/
				} catch (IOException e) {
					throw new OperatingSystemRuntimeException(e);
				}
			}

			break;

		default:
			break;
		}
	}
	

}
