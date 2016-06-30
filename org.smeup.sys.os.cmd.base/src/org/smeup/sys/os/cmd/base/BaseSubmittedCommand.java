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
import org.smeup.sys.os.core.jobs.QJobCapability;

public class BaseSubmittedCommand implements Runnable {

	private QCommandManager commandManager;
	private QJobCapability jobCapability;
	private QDataContext dataContext;
	private String commandString;
	private Object caller;

	protected BaseSubmittedCommand(QCommandManager commandManager, QJobCapability jobCapability, QDataContext dataContext, String commandString, Object caller) {
		this.commandManager = commandManager;
		this.jobCapability = jobCapability;
		this.dataContext = dataContext;
		this.commandString = commandString;
		this.caller = caller;
	}

	@Override
	public void run() {
		
		Map<String, Object> variables = null;
		if (caller != null) {

			variables = new HashMap<String, Object>();

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
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						field.setAccessible(false);
					}

				}
			}
		}

		commandManager.executeCommand(jobCapability, commandString, variables);
	}
}