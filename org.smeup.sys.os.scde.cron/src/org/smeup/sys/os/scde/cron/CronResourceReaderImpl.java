/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
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

import java.util.ArrayList;
import java.util.List;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceHelper;
import org.smeup.sys.il.memo.impl.ResourceReaderImpl;
import org.smeup.sys.os.scde.QScheduleEntry;

public class CronResourceReaderImpl extends ResourceReaderImpl<QScheduleEntry> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected CronSystemWrapper cronWrapper;
	protected CronAdapter cronAdapter;
	private String resource;
	protected QCronSchedulerConfig config;
	
	public CronResourceReaderImpl(QContextProvider contextProvider, String resource, QCronSchedulerConfig config) {
		setContextProvider(contextProvider);
		this.resource = resource;
		this.config = config;
		
		this.cronAdapter = new CronAdapter();
		this.cronWrapper = new CronSystemWrapper();
		
	}

	public String getResourceName() {
		return this.resource;
	}
	
	@Override
	public boolean exists(String name) {
		
		boolean result = false;
		if (cronWrapper.lookupCronTask(name) != null) {
			result = true;
		}
		
		return result;
	}

	@Override
	public QObjectIterator<QScheduleEntry> find(String nameFilter) {
		
		List<String> listCronTasks = cronWrapper.listCronTasks(nameFilter);
		
		List<QScheduleEntry> listScheduleEntry = new ArrayList<QScheduleEntry>();
		
		for (String cronTask: listCronTasks) {
			listScheduleEntry.add(cronAdapter.getScheduleEntry(cronTask));
		}
		
		return QResourceHelper.wrapIterator(listScheduleEntry);	
	}

	@Override
	public QScheduleEntry lookup(String name) {
		
		QScheduleEntry entry = null;
		
		String cronTask = cronWrapper.lookupCronTask(name);
		
		if (cronTask != null) {
			entry = cronAdapter.getScheduleEntry(cronTask);
		}
		
		return entry;		
	}
}