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

import java.security.SecureRandom;
import java.util.UUID;

import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.ResourceEventType;
import org.smeup.sys.os.scde.QScheduleEntry;

public class CronResourceWriterImpl extends CronResourceReaderImpl implements QResourceWriter<QScheduleEntry>{
	
	public CronResourceWriterImpl(QContextProvider contextProvider, String container) {
		super(contextProvider, container);		
	}

	@Override
	public synchronized void delete(QScheduleEntry scheduleEntry) {
		fireEvent(resourceEvent, ResourceEventType.PRE_DELETE, scheduleEntry);
		
		cronWrapper.removeCronTask(scheduleEntry.getEntryNumber());
		
		fireEvent(resourceEvent, ResourceEventType.POST_DELETE, scheduleEntry);
	}

	@Override
	public synchronized void save(QScheduleEntry scheduleEntry) {
		save(scheduleEntry, false);
	}

	@Override
	public synchronized void save(QScheduleEntry scheduleEntry, boolean replace) {
		
		fireEvent(resourceEvent, ResourceEventType.PRE_SAVE, scheduleEntry);
		
		if (exists(scheduleEntry.getName())) {
			if (replace) {
				delete(scheduleEntry);
			} else {
				return;
			}
		}
		
		String cronMap = cronAdapter.getCronTimeMask(scheduleEntry);
		
		String entryNumber = buildUniqueID(6);
		scheduleEntry.setEntryNumber(entryNumber);
		
		cronWrapper.addCronTask(scheduleEntry.getName(),
								scheduleEntry.getEntryNumber(),
								cronMap, 
								scheduleEntry.getUser(), 
								scheduleEntry.getCommandToRun(),
								scheduleEntry.getDescription());	
		
		fireEvent(resourceEvent, ResourceEventType.POST_SAVE, scheduleEntry);
	}
	
	private String buildUniqueID(int length) {
	  UUID idOne = UUID.randomUUID();
	  UUID idTwo = UUID.randomUUID();
	  UUID idThree = UUID.randomUUID();
	  UUID idFour = UUID.randomUUID();

	  String time = idOne.toString().replace("-", "");
	  String time2 = idTwo.toString().replace("-", "");
	  String time3 = idThree.toString().replace("-", "");
	  String time4 = idFour.toString().replace("-", "");

	  StringBuffer data = new StringBuffer();
	  data.append(time);
	  data.append(time2);
	  data.append(time3);
	  data.append(time4);

	  SecureRandom random = new SecureRandom();
	  int beginIndex = random.nextInt(100);       
	  int endIndex = beginIndex + length;            

	  return data.substring(beginIndex, endIndex);	  
	}

	@Override
	public void rename(QScheduleEntry oldObject, QScheduleEntry newObject) {
		throw new UnsupportedOperationException();
	}
}
