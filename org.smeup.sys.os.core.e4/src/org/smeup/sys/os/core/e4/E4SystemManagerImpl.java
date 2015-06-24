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
import javax.inject.Inject;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.os.core.QOperatingSystemCoreFactory;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.base.BaseSystemManagerImpl;
import org.smeup.sys.os.core.jobs.JobType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QOperatingSystemLibraryFactory;
import org.smeup.sys.rt.core.QApplication;

public class E4SystemManagerImpl extends BaseSystemManagerImpl {

	@Inject
	private QApplication application;
	@Inject
	private QResourceManager resourceManager;
	
	private QSystem system;

	private QJob startupJob;

	private QContext systemContext;

	private int nextJobNumber = Integer.parseInt(HHMMSS.format(Calendar.getInstance().getTime()));

	@PostConstruct
	private void init() {

		// QSystem
		this.system = QOperatingSystemCoreFactory.eINSTANCE.createSystem();
		this.system.setName("localhost");
		this.system.setSystemUser("QASUP");
		this.system.setSystemLibrary("QSYS");
		this.system.setInstallPath(System.getProperty("osgi.instance.area"));

		QJob qJob = start();

		application.getContext().set(QSystem.class, getSystem());

		application.getContext().set(QJob.class, qJob);
		
		// Library
		QResourceWriter<QLibrary> resourceLibrary = resourceManager.getResourceWriter(qJob, QLibrary.class, this.system.getSystemLibrary());
		if (!resourceLibrary.exists(this.system.getSystemLibrary())) {
			QLibrary library = QOperatingSystemLibraryFactory.eINSTANCE.createLibrary();
			library.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(this.system));
			library.setName(this.system.getSystemLibrary());
			library.setText("As.UP System Library");
			resourceLibrary.save(library);
		}

	}

	@Override
	public QSystem getSystem() {
		return system;
	}

	@Override
	public QJob start() {

		this.systemContext = this.application.getContext().createChildContext(this.system.getName());

		this.startupJob = createJob(JobType.KERNEL, "QASUP");

		getSystem().setContext(systemContext);

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

	@Override
	protected QContext createContext(String name) {
		return this.systemContext.createChildContext(name);
	}
}