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
package org.smeup.sys.os.core.base;

import java.security.Principal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.ctx.ContextInjectionStrategy;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextDescription;
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.os.core.QOperatingSystemCoreFactory;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.QSystemEvent;
import org.smeup.sys.os.core.QSystemListener;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.SystemEventType;
import org.smeup.sys.os.core.SystemStatus;
import org.smeup.sys.os.core.jobs.JobType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobReference;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsFactory;

public class BaseSystemManagerImpl implements QSystemManager {

	protected static final SimpleDateFormat YYMMDD = new SimpleDateFormat("yyMMdd");
	protected static final SimpleDateFormat YYYYMMDD = new SimpleDateFormat("yyyyMMdd");
	protected static final SimpleDateFormat HHMMSS = new SimpleDateFormat("HHmmss");

	private List<QSystemListener> listeners = new ArrayList<QSystemListener>();
	private QJob jobKernel;
	
	@Inject
	private QLockManager lockManager;

	@Override
	public void registerListener(QSystemListener listener) {
		this.listeners.add(listener);
	}

	protected void fireEvent(QSystemEvent systemEvent) {
		for (QSystemListener jobListener : this.listeners)
			jobListener.handleEvent(systemEvent);
	}

	private int nextJobNumber = Integer.parseInt(HHMMSS.format(Calendar.getInstance().getTime()));

	protected QJob getJobKernel() {
		return this.jobKernel;
	}
	
	protected synchronized int nextJobID() {
		nextJobNumber++;
		return nextJobNumber;
	}

	@Override
	public QJob start(QSystem system) {

		// create job kernel
		Principal principal = new Principal() {
			@Override
			public String getName() {
				return system.getSystemUser();
			}
		};

		jobKernel = createJob(system, JobType.KERNEL, principal, "KERNEL");

		// acquire system lock
		QObjectLocker<QSystem> locker = lockManager.getLocker(jobKernel.getContext(), system);

		while (!locker.tryLock(QSystem.LOCK_TIMEOUT, LockType.WRITE));

		try {
			QSystemEvent systemEvent = QOperatingSystemCoreFactory.eINSTANCE.createSystemEvent();
			systemEvent.setSource(system);
			systemEvent.setType(SystemEventType.STARTING);
			fireEvent(systemEvent);
			
			
			
			systemEvent = QOperatingSystemCoreFactory.eINSTANCE.createSystemEvent();
			systemEvent.setSource(system);
			systemEvent.setType(SystemEventType.STARTED);
			fireEvent(systemEvent);
		} finally {
			locker.unlock(LockType.WRITE);
		}

		return jobKernel;
	}

	@Override
	public void stop() {

		QSystem system = jobKernel.getSystem();
		// acquire system lock
		QObjectLocker<QSystem> locker = lockManager.getLocker(jobKernel.getContext(), system);

		// system not able to stop
		if (!QOperatingSystemCoreHelper.isStoppable(system)) {
			locker.unlock(LockType.WRITE);
			return;
		}

		QSystemEvent systemEvent = QOperatingSystemCoreFactory.eINSTANCE.createSystemEvent();
		systemEvent.setSource(system);
		systemEvent.setType(SystemEventType.STOPPING);
		fireEvent(systemEvent);

		systemEvent = QOperatingSystemCoreFactory.eINSTANCE.createSystemEvent();
		systemEvent.setSource(system);
		systemEvent.setType(SystemEventType.STOPPED);
		fireEvent(systemEvent);
	}

	protected QJob createJob(JobType jobType, Principal principal, String jobName) {
		return createJob(jobKernel.getSystem(), jobType, principal, jobName);
	}
	
	protected QJob createJob(QSystem system, JobType jobType, Principal principal, String jobName) {

		// job
		final QJob job = QOperatingSystemJobsFactory.eINSTANCE.createJob();

		job.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(system));
		job.setJobType(jobType);
		job.setSystem(system);

		// reference
		QJobReference jobReference = QOperatingSystemJobsFactory.eINSTANCE.createJobReference();
		jobReference.setJobUser(principal.getName());
		jobReference.setJobNumber(nextJobID());
		if (jobName == null)
			jobReference.setJobName("QAS" + new DecimalFormat("000000").format(jobReference.getJobNumber()));
		else
			jobReference.setJobName(jobName);
		job.setJobReference(jobReference);

		// system libraries
		job.getLibraries().add(system.getSystemLibrary());

		// job context
		QContextDescription contextDescription = new QContextDescription() {

			@Override
			public String getSystemLibrary() {
				return job.getSystem().getSystemLibrary();
			}

			@Override
			public String getName() {
				return job.getJobReference().getJobName();
			}

			@Override
			public List<String> getLibraryPath() {
				return job.getLibraries();
			}

			@Override
			public String getCurrentLibrary() {
				return job.getCurrentLibrary();
			}

			@Override
			public String getTemporaryLibrary() {
				return "QTMP" + new DecimalFormat("000000").format(job.getJobReference().getJobNumber());
			}
		};

		QContext jobContext = system.getContext().createChildContext(contextDescription, ContextInjectionStrategy.LOCAL);
		job.setJobID(jobContext.getID());
		job.setContext(jobContext);
		jobContext.set(QJob.class, job);

		return job;
	}

	@Override
	public void updateStatus(SystemStatus status) {

		QSystemEvent systemEvent = QOperatingSystemCoreFactory.eINSTANCE.createSystemEvent();
		systemEvent.setSource(jobKernel.getSystem());
		systemEvent.setType(SystemEventType.STATUS_CHANGED);
		fireEvent(systemEvent);
	}
}
