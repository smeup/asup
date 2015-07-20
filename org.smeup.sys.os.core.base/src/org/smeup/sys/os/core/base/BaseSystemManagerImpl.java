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

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.os.core.QOperatingSystemCoreHelper;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.jobs.JobType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsFactory;

public abstract class BaseSystemManagerImpl implements QSystemManager {

	protected static final SimpleDateFormat YYMMDD = new SimpleDateFormat("yyMMdd");
	protected static final SimpleDateFormat YYYYMMDD = new SimpleDateFormat("yyyyMMdd");
	protected static final SimpleDateFormat HHMMSS = new SimpleDateFormat("HHmmss");


	protected QJob createJob(JobType jobType, String user) {

		// job
		QJob job = QOperatingSystemJobsFactory.eINSTANCE.createJob();

		job.setCreationInfo(QOperatingSystemCoreHelper.buildCreationInfo(getSystem()));
		job.setJobType(jobType);
		job.setSystem(getSystem());
		job.setJobUser(user);
		job.setJobNumber(nextJobID());
		// Calendar CALENDAR = Calendar.getInstance();
		// YYYYMMDD.format(CALENDAR.getTime())+"/"+HHMMSS.format(CALENDAR.getTime();
		NumberFormat numberFormat = new DecimalFormat("000000");
		job.setJobName("QAS" + numberFormat.format(job.getJobNumber()));

		// system libraries
		job.getLibraries().add(getSystem().getSystemLibrary());

		// job context
		QContext jobContext = createContext(job.getJobName());
		job.setJobID(jobContext.getID());
		job.setContext(jobContext);
		
		jobContext.set(QJob.class, job);

		return job;
	}

	private QContext createContext(String name) {
		return getSystem().getContext().createChildContext(name);
	}

	protected abstract int nextJobID();

	
}
