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
import java.util.Date;

import org.smeup.sys.os.core.jobs.QJobManager;

public abstract class BaseJobManagerImpl implements QJobManager {
	
	private static final int MILLIS_IN_ONE_DAY = 1000 * 60 * 60 * 24;
	
	@Override
	public void delay(long millis) {
		if(millis <= 0)
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
		if(resumeDate == null)
			throw new RuntimeException("You must specify resume time");
		
		delay(nrOfMillisUntilTime(resumeDate));
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