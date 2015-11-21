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

import java.util.List;

import org.smeup.sys.os.scde.QScheduleEntry;

public class CronAdapter {
	
	public static String REBOOT = "@reboot";		// Lancia il comando all'avvio del sistema
	public static String YEARLY = "@yearly";		// Lancia il comando una volta all'anno. Uguale a "0 0 1 1 *"
	public static String ANNUALLY= "@annually"; 	// come @yearly
	public static String MONTLY = "@monthly";  		// Lancia il comando una volta al mese. Uguale a "0 0 1 * *"
	public static String WEEKLY = "@weekly";		// Lancia il comando una volta alla settimana. Uguale a "0 0 * * 0"
	public static String DAiLY = "@daily";			// Lancia il comando una volta al giorno. Uguale a "0 0 * * *"
	public static String MIDNIGHT = "@midnight";	// come @daily
	public static String HOURLY = "@hourly";		// Lancia il comando una volta all'ora. Uguale a "0 * * * *"
	
	public String getCronTimeMask(QScheduleEntry scheduleEntry){

		String minute 	= "*";
		String hour   	= "*";
		String monthDay = "*";
		String month	= "*";
		String weekDay	= "*";
		
		
		if (/*NONE*/ !"0000003".equalsIgnoreCase(scheduleEntry.getScheduledDate())) {
			
			if ("0000001".equalsIgnoreCase(scheduleEntry.getScheduledDate())) {
				//CURRENT
			} else if ("0000002".equalsIgnoreCase(scheduleEntry.getScheduledDate())) {
				//MONTHSTR
				monthDay = "L";
				month = "*";
				weekDay = "*";
			} else if ("0000003".equalsIgnoreCase(scheduleEntry.getScheduledDate())) {
				monthDay = "1";
				month = "*";
				weekDay = "*";
			} else if(scheduleEntry.getScheduledDate().trim().length() == 6){
				String data = scheduleEntry.getScheduledDate();
				monthDay = data.substring(0, 2);
				month = data.substring(2,4);
				weekDay = "*";
			}

		} else {
			List<String> scheduledDays = scheduleEntry.getScheduledDay();

			boolean first = true;
			
			for(String day: scheduledDays) {
				
				if("8".equalsIgnoreCase(day)) {
					//ALL
					weekDay = "*";
					break;					
				} else if("1".equalsIgnoreCase(day)) {
					//MON
					weekDay += first==false?",mon":"mon";
				} else if("2".equalsIgnoreCase(day)) {
					// TUE
					weekDay += first==false?",tue":"tue";
				} else if("3".equalsIgnoreCase(day)) {
					//WED
					weekDay += first==false?",web":"web";
				} else if("4".equalsIgnoreCase(day)) {
					//THU
					weekDay += first==false?",thu":"thu";
				} else if("5".equalsIgnoreCase(day)) {
					//FRI
					weekDay += first==false?",fri":"fri";
				} else if("6".equalsIgnoreCase(day)) {
					//SAT
					weekDay += first==false?",sat":"sat";
				} else if("7".equalsIgnoreCase(day)) {
					//SUN
					weekDay += first==false?",sun":"sun";
				}         	
				
				first = false;
			}
		}
		
		if ("999999".equalsIgnoreCase(scheduleEntry.getScheduledTime())){
			//CURRENT
		} else if (scheduleEntry.getScheduledTime().length() == 6){
			//HHMMSS
			String time = scheduleEntry.getScheduledTime();
			
			hour 	= time.substring(0, 2);
			minute 	= time.substring(2, 4);			
		}

		String cronMask = minute + " " + hour + " " + monthDay + " " + month + " " + weekDay;
		
		return cronMask;	
	}
	
	public QScheduleEntry getScheduleEntry(String cronTask) {
		
		//TODO		
		throw new UnsupportedOperationException();	
		
		
	}

}
