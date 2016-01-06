/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation 
 *   Mattia Rocchi   - Further implementation
 */
package org.smeup.sys.os.core.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.smeup.sys.il.core.ctx.QCredentials;
import org.smeup.sys.os.core.jobs.JobEventType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobEvent;
import org.smeup.sys.os.core.jobs.QJobListener;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsFactory;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.auth.QAuthenticationManager;
import org.smeup.sys.rt.core.auth.QAuthenticationToken;

public abstract class BaseJobManagerImpl implements QJobManager, QAuthenticationManager {

	private static final int MILLIS_IN_ONE_DAY = 1000 * 60 * 60 * 24;

	private List<QJobListener> listeners = new ArrayList<QJobListener>();

	public BaseJobManagerImpl(QApplication application) {
		application.getContext().set(QAuthenticationManager.class, this);
	}

	@Override
	public void registerListener(QJobListener listener) {
		this.listeners.add(listener);
	}

	protected void fireEvent(QJobEvent jobEvent) {
		for (QJobListener jobListener : this.listeners)
			jobListener.handleEvent(jobEvent);
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
	public QAuthenticationToken createAuthenticationToken(QCredentials credentials) {
		final QJob job = create(credentials.getUser(), credentials.getPassword());

		return new QAuthenticationToken() {

			@Override
			public String getID() {
				return job.getJobID();
			}

			@Override
			public Boolean isValid() {
				return job != null && lookup(job.getJobID()) != null;
			}
		};
	}

	@Override
	public void deleteAuthenticationToken(QAuthenticationToken authToken) {
		// TODO Auto-generated method stub
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
}