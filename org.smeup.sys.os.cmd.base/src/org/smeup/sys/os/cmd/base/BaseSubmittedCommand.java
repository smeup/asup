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
package org.smeup.sys.os.cmd.base;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.core.jobs.QJobMessage;
import org.smeup.sys.os.core.jobs.impl.OperatingSystemJobsFactoryImpl;

public class BaseSubmittedCommand implements Runnable {

	private QJobManager jobManager;
	private QCommandManager commandManager;
	private QJobCapability jobCapability;
	private QDataContext dataContext;
	private String commandString;
	private Object caller;
	private QJob job;

	protected BaseSubmittedCommand(QJobManager jobManager, QCommandManager commandManager, QJobCapability jobCapability, QDataContext dataContext, String commandString, Object caller) {
		this.jobManager = jobManager;
		this.commandManager = commandManager;
		this.jobCapability = jobCapability;
		this.dataContext = dataContext;
		this.commandString = commandString;
		this.caller = caller;
		this.job = jobManager.lookup(jobCapability);
	}

	@Override
	public void run() {

		while (true) { 

			if(!job.getJobThread().checkRunnable()){
				try {
					Thread.sleep(1000);
					continue;
				} catch (InterruptedException e) {
					break;
				}
			}
			
			Map<String, Object> variables = null;
			if (caller != null) {

				variables = new HashMap<>();

				for (Field field : caller.getClass().getDeclaredFields()) {

					Type type = field.getGenericType();

					Class<?> fieldKlass = null;

					if (type instanceof ParameterizedType)
						fieldKlass = (Class<?>) ((ParameterizedType) type).getRawType();
					else
						fieldKlass = (Class<?>) type;

					if (QBufferedData.class.isAssignableFrom(fieldKlass)) {
						QBufferedData variable;
						try {
							field.setAccessible(true);
							variable = (QBufferedData) field.get(caller);
							variable = dataContext.copy(variable);
							variables.put(field.getName(), variable);
						} catch (IllegalArgumentException | IllegalAccessException e) {
							e.printStackTrace();
						} finally {
							field.setAccessible(false);
						}

					}
				}
			}

			try {
				commandManager.executeCommand(jobCapability, commandString, variables);
				jobManager.close(jobCapability);
				break;
		} catch (Exception e) {
				QJobMessage qJobMessage = OperatingSystemJobsFactoryImpl.eINSTANCE.createJobMessage();
				qJobMessage.setMessageId("ERRORJOB");	
				qJobMessage.setMessageText(e.getMessage() + " " + e.getStackTrace().toString());				
				job.getMessages().add(qJobMessage);
				throw(e);
			}
		}
	}
}