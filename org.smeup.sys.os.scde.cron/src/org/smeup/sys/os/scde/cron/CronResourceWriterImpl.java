/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Dario Foresti				- Initial API and implementation   
 *
 */
package org.smeup.sys.os.scde.cron;

import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.os.scde.QScheduleEntry;
import org.smeup.sys.os.scde.base.SCDEBaseResourceWriterImpl;

public class CronResourceWriterImpl extends SCDEBaseResourceWriterImpl {

	private CronSystemWrapper cronWrapper;
	private CronAdapter cronAdapter;

	public CronResourceWriterImpl(QContextProvider contextProvider, String container) {
		super(contextProvider, container);
		cronWrapper = new CronSystemWrapper();
		cronAdapter = new CronAdapter();
	}

	@Override
	public synchronized void delete(QScheduleEntry scheduleEntry) {
		cronWrapper.removeCronTask(scheduleEntry.getEntryNumber());
	}

	@Override
	public synchronized void save(QScheduleEntry scheduleEntry) {
		save(scheduleEntry, false);
	}

	@Override
	public synchronized void save(QScheduleEntry scheduleEntry, boolean replace) {
		
		String cronMap = cronAdapter.getCronTimeMask(scheduleEntry);
		
		String entryNumber = buildID();
		scheduleEntry.setEntryNumber(entryNumber);
		
		cronWrapper.addCronTask(scheduleEntry.getName(),
								scheduleEntry.getEntryNumber(),
								cronMap, 
								scheduleEntry.getUser(), 
								scheduleEntry.getCommandToRun());	
	}
	
	//TODO: buildID doesn't return unique ID
	private String buildID() {
		return "" + Math.round(Math.random()*1000000);
	}
	
}
