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

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.smeup.sys.il.core.ctx.ContextInjectionStrategy;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextDescription;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.jobs.JobType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsFactory;

public abstract class BaseSystemManagerImpl implements QSystemManager {

	protected static final SimpleDateFormat YYMMDD = new SimpleDateFormat("yyMMdd");
	protected static final SimpleDateFormat YYYYMMDD = new SimpleDateFormat("yyyyMMdd");
	protected static final SimpleDateFormat HHMMSS = new SimpleDateFormat("HHmmss");

	protected QJob createJob(JobType jobType, String user, String jobName) {

		// job
		final QJob job = QOperatingSystemJobsFactory.eINSTANCE.createJob();

		job.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(getSystem()));
		job.setJobType(jobType);
		job.setSystem(getSystem());
		job.setJobUser(user);
		job.setJobNumber(nextJobID());
		// Calendar CALENDAR = Calendar.getInstance();
		// YYYYMMDD.format(CALENDAR.getTime())+"/"+HHMMSS.format(CALENDAR.getTime();
		NumberFormat numberFormat = new DecimalFormat("000000");
		if (jobName == null)
			job.setJobName("QAS" + numberFormat.format(job.getJobNumber()));
		else
			job.setJobName(jobName);

		// system libraries
		job.getLibraries().add(getSystem().getTemporaryLibrary());
		job.getLibraries().add(getSystem().getSystemLibrary());

		// job context

		QContextDescription contextDescription = new QContextDescription() {

			@Override
			public String getSystemLibrary() {
				return job.getSystem().getSystemLibrary();
			}

			@Override
			public String getName() {
				return job.getJobName();
			}

			@Override
			public List<String> getLibraryPath() {
				return job.getLibraries();
			}

			@Override
			public String getCurrentLibrary() {
				return job.getCurrentLibrary();
			}
		};

		QContext jobContext = getSystem().getContext().createChildContext(contextDescription, ContextInjectionStrategy.LOCAL);
		job.setJobID(jobContext.getID());
		job.setContext(jobContext);

		jobContext.set(QJob.class, job);

		//

		return job;
	}

	protected abstract int nextJobID();

}
