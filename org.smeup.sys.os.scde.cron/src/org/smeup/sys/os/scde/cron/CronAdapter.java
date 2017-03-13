/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import org.smeup.sys.os.scde.QScheduleEntry;
import org.smeup.sys.os.scde.ScheduleState;

public class CronAdapter {
	
	public static String REBOOT = "@reboot";		// Lancia il comando all'avvio del sistema
	public static String YEARLY = "@yearly";		// Lancia il comando una volta all'anno. Uguale a "0 0 1 1 *"
	public static String ANNUALLY= "@annually"; 	// come @yearly
	public static String MONTLY = "@monthly";  		// Lancia il comando una volta al mese. Uguale a "0 0 1 * *"
	public static String WEEKLY = "@weekly";		// Lancia il comando una volta alla settimana. Uguale a "0 0 * * 0"
	public static String DAiLY = "@daily";			// Lancia il comando una volta al giorno. Uguale a "0 0 * * *"
	public static String MIDNIGHT = "@midnight";	// come @daily
	public static String HOURLY = "@hourly";		// Lancia il comando una volta all'ora. Uguale a "0 * * * *"
	
	//TODO: da completare
	public String getCronTimeMask(QScheduleEntry scheduleEntry){

		String minute 	= "*";
		String hour   	= "*";
		String monthDay = "*";
		String month	= "*";
		String weekDay	= "*";
		
		
		if (/*NONE*/ !"0000003".equalsIgnoreCase(scheduleEntry.getScheduleDate())) {
			
			if ("0000001".equalsIgnoreCase(scheduleEntry.getScheduleDate())) {
				//CURRENT
			} else if ("0000002".equalsIgnoreCase(scheduleEntry.getScheduleDate())) {
				//MONTHSTR
				monthDay = "L";
				month = "*";
				weekDay = "*";
			} else if ("0000003".equalsIgnoreCase(scheduleEntry.getScheduleDate())) {
				monthDay = "1";
				month = "*";
				weekDay = "*";
			} else if(scheduleEntry.getScheduleDate().trim().length() == 6){
				String data = scheduleEntry.getScheduleDate();
				monthDay = data.substring(0, 2);
				month = data.substring(2,4);
				weekDay = "*";
			}

		} else {
			List<String> ScheduleDays = scheduleEntry.getScheduleDay();

			boolean first = true;
			
			for(String day: ScheduleDays) {
				
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
		
		if ("999999".equalsIgnoreCase(scheduleEntry.getScheduleTime())){
			//CURRENT
		} else if (scheduleEntry.getScheduleTime().length() == 6){
			//HHMMSS
			String time = scheduleEntry.getScheduleTime();
			
			hour 	= time.substring(0, 2);
			minute 	= time.substring(2, 4);			
		}

		String cronMask = minute + " " + hour + " " + monthDay + " " + month + " " + weekDay;
		
		return cronMask;	
	}
	
	/*
	 * CronTask format:
	 * 
	 *  mm hh dayOfMonth month dayOfWeek sh call_ws wsip wsport system user pwd env "command" taskID taskName "taskDescription"
	 *
	 */
	@SuppressWarnings("unused")
	public QScheduleEntry getScheduleEntry(String cronTask) {
		
		//TODO: è corretto tornare un oggetto QCronScheduleEntry piuttosto che un QScheduleEntry?

		boolean parsed = false;
		QCronScheduleEntry scheduleEntry = null;
		boolean holded = false;
		
		if (cronTask.startsWith("#")) {
			holded = true;
			cronTask = cronTask.substring(1);
		}

		StringTokenizer tokenizer = new StringTokenizer(cronTask);
		try{
			String minute = tokenizer.nextToken();
			String hour = tokenizer.nextToken().toString();
			String monthDay = tokenizer.nextToken().toString();
			String month = tokenizer.nextToken().toString();
			String weekDay = tokenizer.nextToken().toString();			
			String sh	= tokenizer.nextToken().toString();
			String bash = tokenizer.nextToken().toString();
			String wsip = tokenizer.nextToken().toString();
			String wsport = tokenizer.nextToken().toString();			
			String system = tokenizer.nextToken().toString();
			String user = tokenizer.nextToken().toString();
			String pwd = tokenizer.nextToken().toString();
			String env = tokenizer.nextToken().toString();
			
			String cmd = tokenizer.nextToken().toString();
			while (cmd.endsWith("\"") == false) {
				cmd += " " + tokenizer.nextToken().toString();
			}
			
			String id = tokenizer.nextToken().toString();	
			String name = tokenizer.nextToken().toString();
			
			String description = "";
			
			if (tokenizer.hasMoreElements()) {
				description = tokenizer.nextToken().toString();
			}
			while (tokenizer.hasMoreElements()) {
				description += " " + tokenizer.nextToken().toString();
			}
			
			parsed = true;		
		
			if (parsed) {
				
				scheduleEntry = QOperativeSystemCronScheduleEntryFactory.eINSTANCE.createCronScheduleEntry();
				
				//TODO: manage month, monthDay and special values combinations
		
				// Manage minute-hour		
				if (minute.length() == 1) {
					minute = "0" + minute;
				}
				
				if (hour.length() == 1) {
					hour = "0" + hour;
				}
				scheduleEntry.setScheduleTime(hour + minute + "00");
			
				//Manage dayOfWeek		
				StringTokenizer dayOfWeekTokenizer= new StringTokenizer(weekDay, ",", false);
				
				String wDay = null;
				while (dayOfWeekTokenizer.hasMoreElements()) {
					
					wDay = dayOfWeekTokenizer.nextToken();
					
					if("*".equalsIgnoreCase(wDay)) {
						//ALL
						scheduleEntry.getScheduleDay().add("*");
						break;					
					} else if("mon".equalsIgnoreCase(wDay)) {
						//MON
						scheduleEntry.getScheduleDay().add("1");
					} else if("tue".equalsIgnoreCase(wDay)) {
						// TUE
						scheduleEntry.getScheduleDay().add("2");
					} else if("wed".equalsIgnoreCase(wDay)) {
						//WED
						scheduleEntry.getScheduleDay().add("3");
					} else if("thu".equalsIgnoreCase(wDay)) {
						//THU
						scheduleEntry.getScheduleDay().add("4");
					} else if("fri".equalsIgnoreCase(wDay)) {
						//FRI
						scheduleEntry.getScheduleDay().add("5");
					} else if("sat".equalsIgnoreCase(wDay)) {
						//SAT
						scheduleEntry.getScheduleDay().add("6");
					} else if("sun".equalsIgnoreCase(wDay)) {
						//SUN
						scheduleEntry.getScheduleDay().add("7");
					}
				}
				
				scheduleEntry.setWsip(wsip);
				scheduleEntry.setWsport(wsport);
				scheduleEntry.setSystem(system);
				scheduleEntry.setUser(user);
				scheduleEntry.setPassword(pwd);
				scheduleEntry.setEnvironment(env);
				scheduleEntry.setEntryNumber(id);
				scheduleEntry.setCommandToRun(cmd);
				scheduleEntry.setJobName(name);				
				scheduleEntry.setDescription(description);
				if (holded) {
					scheduleEntry.setState(ScheduleState.HOLDED);
				} else {
					scheduleEntry.setState(ScheduleState.SCHEDULED);
				}
			}
		} catch (NoSuchElementException exc) {
			
		}

		return scheduleEntry;
	}
}
