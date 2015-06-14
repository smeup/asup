/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core;

import java.util.Date;

import org.smeup.sys.os.core.jobs.QJob;

public class QOperatingSystemCoreHelper {


	public static boolean isStartable(QSystem system) {

		boolean startable = false;

		// check system status
		switch (system.getStatus()) {
		case STOPPED:
			startable = true;
			break;
		case STARTED:
			break;
		case ACTIVATING:
			break;
		case ENDING:
			break;
		default:
			break;
		}

		return startable;
	}

	public static boolean isStoppable(QSystem system) {

		boolean stoppable = false;

		// check system status
		switch (system.getStatus()) {
		case STOPPED:
			break;
		case STARTED:
			stoppable = true;
			break;
		case ACTIVATING:
			break;
		case ENDING:
			break;
		default:
			break;
		}

		return stoppable;
	}

	public static QCreationInfo buildCreationInfo(QJob job) {

		QCreationInfo creationInfo = QOperatingSystemCoreFactory.eINSTANCE.createCreationInfo();
		creationInfo.setCreationDate(new Date());
		creationInfo.setCreationSystem(job.getSystem().getName());
		creationInfo.setCreationUser(job.getJobUser());
		
		return creationInfo;

	}

	public static Date now() {
		return new Date();
	}

	public static QCreationInfo buildCreationInfo(QSystem system) {
		QCreationInfo creationInfo = QOperatingSystemCoreFactory.eINSTANCE.createCreationInfo();
		creationInfo.setCreationDate(new Date());
		creationInfo.setCreationSystem(system.getName());
		creationInfo.setCreationUser(system.getSystemUser());
		return creationInfo;
	}

}
