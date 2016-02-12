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

import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.ctx.CapabilityRight;
import org.smeup.sys.il.core.ctx.QIdentity;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.os.core.jobs.JobEventType;
import org.smeup.sys.os.core.jobs.JobStatus;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobEvent;
import org.smeup.sys.os.core.jobs.QJobListener;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.core.jobs.QJobReference;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsFactory;

public abstract class BaseJobManagerImpl implements QJobManager {

	private static final int MILLIS_IN_ONE_DAY = 1000 * 60 * 60 * 24;

	@Inject
	private QOutputManager outputManager;
	
	private List<QJobListener> listeners = new ArrayList<QJobListener>();

	@Override
	public void registerListener(QJobListener listener) {
		this.listeners.add(listener);
	}

	protected void fireEvent(QJobEvent jobEvent) {
		for (QJobListener jobListener : this.listeners)
			jobListener.handleEvent(jobEvent);
	}

	@Override
	public QJobCapability spawn(QJob credential) {		
		return spawn(credential, null);
	}
	
	@Override
	public QJobCapability spawn(final QJob parent, String jobName) {
		
		QIdentity<?>  identity= parent.getContext().get(QIdentity.class);
		QJobCapability jobCapability = create(identity, jobName);
		
		return jobCapability;
	}

	@Override
	public QJob lookup(QJobCapability capability) {
		return lookup(URI.create(capability.getObjectURI()).getFragment());
	}

	@Override
	public QJob lookup(String contextID, QJobReference jobReference) {
		return lookup(contextID, jobReference.getJobName(),jobReference.getJobUser(), jobReference.getJobNumber());
	}

	@Override
	public QJob lookup(String contextID, String name, String user, String number) {
		return lookup(contextID, name, user, Integer.parseInt(number));
	}

	@Override
	public void delay(long millis) {
		if (millis <= 0)
			throw new RuntimeException("You must specify millis");

		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void delay(String resumeTime) {
		Date resumeDate = toDate(resumeTime);
		if (resumeDate == null)
			throw new RuntimeException("You must specify resume time");

		delay(nrOfMillisUntilTime(resumeDate));
	}

	@Override
	public QJob close(QJobCapability jobCapability) {

		QJob job = lookup(jobCapability);
		close(job);
		
		return job;
	}

	@Override
	public void close(QJob job) {
		
		QJobEvent jobEvent = QOperatingSystemJobsFactory.eINSTANCE.createJobEvent();
		jobEvent.setSource(job);
		jobEvent.setType(JobEventType.STOPPING);

		for (QJobListener jobListener : this.listeners)
			jobListener.handleEvent(jobEvent);

		job.getContext().close();

		jobEvent.setType(JobEventType.STOPPED);

		for (QJobListener jobListener : this.listeners)
			jobListener.handleEvent(jobEvent);
	}
	
	@Override
	public void updateStatus(QJob job, JobStatus status) {
		
		QJobEvent jobEvent = QOperatingSystemJobsFactory.eINSTANCE.createJobEvent();
		jobEvent.setSource(job);
		jobEvent.setType(JobEventType.STATUS_CHANGED);
		
		fireEvent(jobEvent);
	}

	protected QJobCapability createJobCapability(QJob job, List<CapabilityRight> rights) {
		
		// capability		
		QJobCapability jobCapability = new BaseJobCapabilityImpl(job.getJobReference(), job.qURI(), rights);
		return jobCapability;
	}

	private Date toDate(String resumeTime) {
		try {
			String resumeTimeString = resumeTime.replaceAll("[^\\d.]", ""); // Just
																			// numeric
																			// chars
			Date todayHour = hourFormatter().parse(todayString() + resumeTimeString);
			if (todayHour.after(new Date())) {
				return todayHour;
			} else {
				return addOneDay(todayHour);
			}
		} catch (ParseException e) {
			return null;
		}
	}

	private Date addOneDay(Date date) {
		return new Date(date.getTime() + MILLIS_IN_ONE_DAY);
	}

	private String todayString() {
		return new SimpleDateFormat("ddMMyyyy").format(new Date());
	}

	private SimpleDateFormat hourFormatter() {
		SimpleDateFormat dfOre = new SimpleDateFormat("ddMMyyyyHHmmss");
		dfOre.setLenient(false);
		return dfOre;
	}

	private long nrOfMillisUntilTime(Date resumeDate) {
		return (resumeDate.getTime() - new Date().getTime());
	}

	@Override
	public void registerWriter(QJobCapability capability, String name, QObjectWriter writer) {

		QJob job = lookup(capability);
		outputManager.registerWriter(job.getContext(), name, writer);
	}

	@Override
	public void setDefaultWriter(QJobCapability capability, String name) {
		
		QJob job = lookup(capability);
		outputManager.setDefaultWriter(job.getContext(), name);
	}
}