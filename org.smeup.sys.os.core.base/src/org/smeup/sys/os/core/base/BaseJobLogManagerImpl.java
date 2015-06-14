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
package org.smeup.sys.os.core.base;

import javax.inject.Inject;

import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLog;
import org.smeup.sys.os.core.jobs.QJobLogEntry;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsFactory;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.core.resources.QResourceWriter;

public class BaseJobLogManagerImpl implements QJobLogManager {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJobManager jobManager;

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

	private void addEntry(QJob job, int gravity, String message) {

		// job log
		QJobLog jobLog = lookup(job);
		if (jobLog == null) {
			jobLog = QOperatingSystemJobsFactory.eINSTANCE.createJobLog();
			jobLog.setJobID(job.getJobID());

			job.getContext().set(QJobLog.class, jobLog);
		}

		// entry
		QJobLogEntry entry = QOperatingSystemJobsFactory.eINSTANCE.createJobLogEntry();
		entry.setGravity(gravity);
		entry.setMessage(message);
		entry.setCreationDate(QOperatingSystemCoreHelper.now());

		// add
		jobLog.getEntries().add(entry);

		// save
		QResourceWriter<QJobLog> jobLogWriter = resourceManager.getResourceWriter(job, QJobLog.class, job.getSystem().getSystemLibrary());
		jobLogWriter.save(jobLog, true);
	}

	@Override
	public QJobLog lookup(QJob job) {
		QJobLog jobLog = null;

		if (job.getContext() != null)
			jobLog = job.getContext().get(QJobLog.class);

		return jobLog;
	}

	@Override
	public QJobLog lookup(String contextID, String name, String user, int number) {
		QJob jobCaller = jobManager.lookup(contextID);

		QJob jobTarget = jobManager.lookup(contextID, name, user, number);
		if (jobTarget == null)
			return null;

		QResourceReader<QJobLog> jobLogReader = resourceManager.getResourceReader(jobCaller, QJobLog.class, jobCaller.getSystem().getSystemLibrary());
		QJobLog jobLog = jobLogReader.lookup(jobTarget.getJobID());

		return jobLog;
	}
}
