/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial implementation
 */

package org.smeup.sys.os.scde.cron;

import org.smeup.sys.os.scde.QScheduleEntry;

public class CronAdapter {
	
	public String getCronTimeMask(QScheduleEntry scheduleEntry){
		
		String cronMask = "";
		
		if (scheduleEntry.getScheduledDate() != null) {
			
			
			
			
		} else {
			scheduleEntry.getScheduledDay();
		}
		
		
			
				
		throw new UnsupportedOperationException();
	}
	
	public QScheduleEntry getScheduleEntry(String cronTask) {
		
		//TODO		
		throw new UnsupportedOperationException();	
		
		
	}

}
