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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLog;
import org.smeup.sys.os.core.jobs.QJobLogEntry;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.core.jobs.QJobReference;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsFactory;

public class BaseJobLogManagerImpl implements QJobLogManager {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJobManager jobManager;
	@Inject
	private QThreadManager threadManager;
	
	private ExecutorService jobLogExecutor;
	
	@PostConstruct
	private void init() {
		jobLogExecutor = Executors.newCachedThreadPool(new JobLogThreadFactory(threadManager));		
	}
	
	@Override
	public void info(QJob job, String message) {
		addEntry(job, 10, message);
	}

	@Override
	public void warning(QJob job, String message) {
		addEntry(job, 20, message);
	}

	@Override
	public void error(QJob job, String message) {
		addEntry(job, 30, message);
	}

	@Override
	public void addEntry(QJob job, int gravity, String message) {
		jobLogExecutor.submit(taskFor(job, gravity, message));
	}

	private Runnable taskFor(final QJob job, final int gravity, final String message) {
		return new Runnable() {
			@Override
			public void run() {
				// job log
				QJobLog jobLog = lookup(job);
				if (jobLog == null) {
					jobLog = QOperatingSystemJobsFactory.eINSTANCE.createJobLog();
					jobLog.setJob(job);

					job.getContext().set(QJobLog.class, jobLog);
				}

				// entry
				QJobLogEntry entry = QOperatingSystemJobsFactory.eINSTANCE.createJobLogEntry();
				entry.setGravity(gravity);
				entry.setMessage(message);
				entry.setCreationDate(QOperatingSystemCoreHelper.now());

				// TODO
//				jobLog.getEntries().add(entry);

				// save
				QResourceWriter<QJobLog> jobLogWriter = resourceManager.getResourceWriter(job, QJobLog.class, Scope.SYSTEM_LIBRARY);
				jobLogWriter.save(jobLog, true);
			}
		};
	}

	@Override
	public QJobLog lookup(QJob job) {
		QJobLog jobLog = null;

		if (job.getContext() != null)
			jobLog = job.getContext().get(QJobLog.class);

		return jobLog;
	}


	@Override
	public QJobLog lookup(String contextID, QJobReference jobReference) {
		return lookup(contextID, jobReference.getJobName(), jobReference.getJobUser(), jobReference.getJobNumber());
	}

	@Override
	public QJobLog lookup(String contextID, String name, String user, int number) {
		QJob jobCaller = jobManager.lookup(contextID);

		QJob jobTarget = jobManager.lookup(contextID, name, user, number);
		if (jobTarget == null)
			return null;

		QResourceReader<QJobLog> jobLogReader = resourceManager.getResourceReader(jobCaller, QJobLog.class, Scope.SYSTEM_LIBRARY);
		QJobLog jobLog = jobLogReader.lookup(jobTarget.getJobID());

		return jobLog;
	}
	
	private class JobLogThreadFactory implements ThreadFactory {

		private QThreadManager threadManager;
		
		public JobLogThreadFactory(QThreadManager threadManager) {
			this.threadManager = threadManager;
		}
		
		@Override
		public Thread newThread(Runnable runnable) {
			QThread thread = threadManager.createThread("job-logger", runnable);
			return thread.getJavaThread();
		}

	}

	@Override
	public QObjectIterator<QJobLogEntry> getEntries(QJobLog jobLog) {
		// TODO Auto-generated method stub
		return null;
	}
}
