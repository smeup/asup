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
import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.os.core.jobs.QJobEvent;
import org.smeup.sys.os.core.jobs.QJobListener;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.lib.QLibraryManager;


public class BaseTemporaryLibraryListenerImpl implements QJobListener {

	@Inject
	private QLibraryManager libraryManager;
	
	@PostConstruct
	private void init(QJobManager jobManager) {
		jobManager.registerListener(this);
	}
	
	@Override
	public void handleEvent(QJobEvent event) {

		switch (event.getType()) {
		case STARTED:
			break;
		case STARTING:
			libraryManager.createTemporaryLibrary(event.getSource());
			break;
		case STATUS_CHANGED:
			break;
		case STOPPED:
			break;
		case STOPPING:
			libraryManager.destroyTemporaryLibrary(event.getSource());
			break;
		}
	}
}