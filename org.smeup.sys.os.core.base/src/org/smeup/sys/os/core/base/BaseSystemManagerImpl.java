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

import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextDescription;
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QOperatingSystemCoreFactory;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.QSystemEvent;
import org.smeup.sys.os.core.QSystemListener;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.SystemEventType;
import org.smeup.sys.os.core.SystemStatus;
import org.smeup.sys.os.core.env.QEnvironmentVariableContainer;
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
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QThreadManager threadManager;
	
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
	
	protected synchronized int nextJobID(JobType jobType, QSystem system, QJob job) {

		int lastNumber = 0;
		
		if(jobType.equals(jobType.KERNEL)){
			lastNumber = nextJobNumber++;
		} else {
			lastNumber = system.getLastJobNumber();
			lastNumber++;

			QResourceWriter<QSystem> systemWriter = resourceManager.getResourceWriter(job, QSystem.class, Scope.SYSTEM_LIBRARY);
			system.setLastJobNumber(lastNumber);
			systemWriter.save(system, true);
		}
		return lastNumber;
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

		// acquire system lock
		QObjectLocker<QSystem> locker = lockManager.getLocker(system.getContext(), system);
		while (!locker.tryLock(QSystem.LOCK_TIMEOUT, LockType.WRITE));

		try {
			QSystemEvent systemEvent = QOperatingSystemCoreFactory.eINSTANCE.createSystemEvent();
			systemEvent.setSource(system);
			systemEvent.setType(SystemEventType.STARTING);
			fireEvent(systemEvent);
		
			jobKernel = createJob(system, JobType.KERNEL, principal, "KERNEL");

			QResourceWriter<QSystem> systemWriter = resourceManager.getResourceWriter(jobKernel, QSystem.class, Scope.SYSTEM_LIBRARY);
			QSystem persistedSystem = systemWriter.lookup(system.getName());
			if (persistedSystem != null) {
				QEnvironmentVariableContainer variableContainer = persistedSystem.getVariableContainer();
				if (variableContainer != null) 
					system.setVariableContainer(variableContainer);

				system.setLastJobNumber(persistedSystem.getLastJobNumber());
			}
			system.setStatus(SystemStatus.STARTED);
			systemWriter.save(system, true);

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
		
		// TODO system not able to stop
		if (!QOperatingSystemCoreHelper.isStoppable(system))
			return;

		// acquire system lock
		QObjectLocker<QSystem> locker = lockManager.getLocker(jobKernel.getContext(), system);
		locker.lock(LockType.WRITE);
		
		try {
			
			QSystemEvent systemEvent = QOperatingSystemCoreFactory.eINSTANCE.createSystemEvent();
			systemEvent.setSource(system);
			systemEvent.setType(SystemEventType.STOPPING);
			fireEvent(systemEvent);
	
			systemEvent = QOperatingSystemCoreFactory.eINSTANCE.createSystemEvent();
			systemEvent.setSource(system);
			systemEvent.setType(SystemEventType.STOPPED);
			fireEvent(systemEvent);
		}
		finally {
			locker.unlock(LockType.WRITE);
		}
	}

	protected QJob createJob(JobType jobType, Principal principal, String jobName) {
		return createJob(jobKernel.getSystem(), jobType, principal, jobName);
	}
	
	@SuppressWarnings("resource")
	protected QJob createJob(QSystem system, JobType jobType, Principal principal, String jobName) {

		// job
		final QJob job = QOperatingSystemJobsFactory.eINSTANCE.createJob();

		job.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(system));
		job.setJobType(jobType);
		job.setSystem(system);

		// reference
		QJobReference jobReference = QOperatingSystemJobsFactory.eINSTANCE.createJobReference();
		jobReference.setJobUser(principal.getName());
		jobReference.setJobNumber(nextJobID(jobType, system, jobKernel));
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

			@Override
			public String getTemporaryArea() {
				return System.getProperty("osgi.instance.area")+"QTEMP";
			}
		};

		QContext jobContext = system.getContext().createChildContext(contextDescription);
		job.setJobID(jobContext.getID());
		job.setContext(jobContext);
		
		// Thread
		job.setJobThread(threadManager.currentThread());
		
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
