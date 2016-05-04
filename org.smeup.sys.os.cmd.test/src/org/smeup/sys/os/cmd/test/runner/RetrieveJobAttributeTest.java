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
package org.smeup.sys.os.cmd.test.runner;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.jobs.QJob;

@Test(object = "Rtvjoba Test")
public class RetrieveJobAttributeTest {

	@Inject
	private QCommandManager commandManager;
	@Inject
	private QJob job;
	@Inject
	private QTestAsserter testAsserter;
	@DataDef(length = 1)
	private QCharacter jobtyp;
	@DataDef(precision = 5, packed = true)
	private QDecimal ccsid;
	@DataDef(precision = 5, packed = true)
	private QDecimal dftccsid;

	@TestStarted
	public void main() throws IOException {

		Map<String, Object> variables = new HashMap<String, Object>();

		String cmd = "RTVJOBA TYPE(&JOBTYP) CCSID(&CCSID) DFTCCSID(&DFTCCSID)";

		loadVariables(RetrieveJobAttributeTest.class, this, variables);

		QCallableCommand callableCommand = commandManager.prepareCommand(job, cmd, variables, true);
		commandManager.executeCommand(job, callableCommand);
		callableCommand.close();
		testAsserter.assertTrue(cmd + " jobtyp='0'", jobtyp.eq("0"));
		testAsserter.assertTrue(cmd + " CCSID=13496", ccsid.eq(13496));
		testAsserter.assertTrue(cmd + " DFTCCSID=13496", dftccsid.eq(13496));
	}

	private void loadVariables(Class<?> klass, Object caller, Map<String, Object> variables) {

		// recursively on superClass
		if (klass.getSuperclass().getAnnotation(Program.class) != null)
			loadVariables(klass.getSuperclass(), caller, variables);

		for (Field field : klass.getDeclaredFields()) {

			// TODO
			if (field.getName().startsWith("$SWITCH_TABLE"))
				continue;

			if (Modifier.isStatic(field.getModifiers()))
				if (Modifier.isFinal(field.getModifiers()))
					continue;

			Class<?> fieldClass = null;

			Type fieldType = field.getGenericType();

			ParameterizedType parType = null;
			if (fieldType instanceof ParameterizedType) {
				parType = (ParameterizedType) fieldType;
				fieldClass = (Class<?>) parType.getRawType();
			} else
				fieldClass = (Class<?>) fieldType;

			if (QData.class.isAssignableFrom(fieldClass)) {
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