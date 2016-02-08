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
package org.smeup.sys.os.pgm.rpj;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.annotation.Module;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.jobs.QJob;

@Module(name="*CMD")
public class RPJCommandSupport {

	@Inject
	private QCommandManager commandManager;
	
	@Inject
	private QJob job;
	
	
	public void qExecute(Object caller, String command) {

		if(caller == null)
			return;
				
		Map<String, Object> variables = new HashMap<String, Object>();
		loadVariables(caller.getClass(), caller, variables);
		
		QCallableCommand callableCommand = commandManager.prepareCommand(job, command, variables, true);		
		commandManager.executeCommand(job, callableCommand);
		callableCommand.close();
	}
	
	private void loadVariables(Class<?> klass, Object caller, Map<String, Object> variables) {

		// recursively on superClass
		if(klass.getSuperclass().getAnnotation(Program.class) != null)
			loadVariables(klass.getSuperclass(), caller, variables);
		
		for(Field field: klass.getDeclaredFields()) {
			
			// TODO
			if (field.getName().startsWith("$SWITCH_TABLE"))
				continue;

			if (Modifier.isStatic(field.getModifiers())) {
				if (Modifier.isFinal(field.getModifiers()))
					continue;
			}

			Class<?> fieldClass = null;

			Type fieldType = field.getGenericType();

			ParameterizedType parType = null;
			if (fieldType instanceof ParameterizedType) {
				parType = (ParameterizedType) fieldType;
				fieldClass = (Class<?>) parType.getRawType();
			} else
				fieldClass = (Class<?>) fieldType;

			if(QData.class.isAssignableFrom(fieldClass)) {
				Object variable;
				try {
					field.setAccessible(true);
					variable = field.get(caller);
					field.setAccessible(false);
					variables.put(field.getName(), variable);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}
}