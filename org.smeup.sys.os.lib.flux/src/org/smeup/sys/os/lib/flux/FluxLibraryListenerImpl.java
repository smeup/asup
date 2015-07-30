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
package org.smeup.sys.os.lib.flux;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.flux.core.Repository;
import org.smeup.sys.os.core.resources.QResourceEvent;
import org.smeup.sys.os.core.resources.QResourceListener;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.lib.QLibrary;

public class FluxLibraryListenerImpl implements QResourceListener<QLibrary> {

	@Inject
	private QResourceManager resourceManager;
	
	@PostConstruct
	public void init() {
		resourceManager.registerListener(QLibrary.class, this);
	}
	
	@Override
	public void handleEvent(QResourceEvent<QLibrary> event) {
		
		QLibrary library = event.getSource();
		
		switch (event.getType()) {
		case PRE_SAVE:
			
			Repository repository = org.eclipse.flux.core.Activator.getDefault().getRepository();
			if (repository != null && repository.getProject(library.getName()) == null && library.isSynchronized()) {
				repository.addProject(ResourcesPlugin.getWorkspace().getRoot().getProject(library.getName()));
			}
			
			break;

		default:
			break;
		}
	}
}