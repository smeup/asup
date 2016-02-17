/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.QSystemEvent;
import org.smeup.sys.os.core.QSystemListener;
import org.smeup.sys.os.core.QSystemManager;

public class BaseSystemListenerImpl implements QSystemListener {

	@Inject
	private QSystemManager systemManager;
	@Inject
	private QSourceManager sourceManager;
	
	@PostConstruct
	public void init() {
		systemManager.registerListener(this);
	}

	@Override
	public void handleEvent(QSystemEvent event) {

		QSystem system = event.getSource();
		
		switch (event.getType()) {
		case STARTED:
			break;
		case STARTING:
			QProject project = sourceManager.getProject(system.getContext(), system.getSystemLibrary());
			if(project == null) {
				QProjectDef projectDef = QDevelopmentKitSourceFactory.eINSTANCE.createProjectDef();
				projectDef.setName(system.getSystemLibrary());
				projectDef.setText("As.UP System Library");
				try {
					project = sourceManager.createProject(system.getContext(), projectDef, false);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			sourceManager.refreshNode(system.getContext(), project);
			break;
		case STATUS_CHANGED:
			break;
		case STOPPED:
			break;
		case STOPPING:
			break;
		}

	}
}
