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
package org.smeup.sys.os.core.e4;

import java.util.Calendar;

import javax.annotation.PostConstruct;

import org.smeup.sys.os.core.QOperatingSystemCoreFactory;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.base.BaseSystemManagerImpl;
import org.smeup.sys.os.core.jobs.JobType;
import org.smeup.sys.os.core.jobs.QJob;

public class E4SystemManagerImpl extends BaseSystemManagerImpl {
	
	private QSystem system;

	private QJob startupJob;

	private int nextJobNumber = Integer.parseInt(HHMMSS.format(Calendar.getInstance().getTime()));

	@PostConstruct
	private void init() {

		// QSystem
		this.system = QOperatingSystemCoreFactory.eINSTANCE.createSystem();
		this.system.setName("localhost");
		this.system.setSystemUser("QASUP");
		this.system.setSystemLibrary("QSYS");
		this.system.setInstallPath(System.getProperty("osgi.instance.area"));

	}

	@Override
	public QSystem getSystem() {
		return system;
	}

	@Override
	public QJob start() {

		this.startupJob = createJob(JobType.KERNEL, "QASUP");
		
		return startupJob;
	}

	@Override
	public void stop() {

		this.system = null;

	}

	protected QJob getStartupJob() {
		return startupJob;
	}

	@Override
	protected synchronized int nextJobID() {
		nextJobNumber++;
		return nextJobNumber;
	}

	@Override
	protected QJob createJob(JobType jobType, String user) {
		return super.createJob(jobType, user);
	}
}