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
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.def.DecimalType;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.jobs.QJob;

@Test(object = "Rtvjoba Test")
public class JobAttributeRetrieveTest {

	@Inject
	private QCommandManager commandManager;
	@Inject
	private QJob job;
	@Inject
	private QTestAsserter testAsserter;
	@Inject
	private QDataManager dataManager;

	private QDataContext dataContext = null;

	@TestStarted
	public void main() throws IOException {

		dataContext = dataManager.createDataContext(job.getContext(), null);

		Map<String, Object> variables = new HashMap<String, Object>();

		QCharacter jobtyp = dataContext.getDataFactory().createCharacter(10, false, true);
		jobtyp.clear();
		QDecimal ccsid = dataContext.getDataFactory().createDecimal(5, 0, DecimalType.PACKED, true);
		ccsid.clear();
		QDecimal dftccsid = dataContext.getDataFactory().createDecimal(5, 0, DecimalType.PACKED, true);
		dftccsid.clear();

		variables.put("jobtyp", jobtyp);
		variables.put("ccsid", ccsid);
		variables.put("dftccsid", dftccsid);

		String cmd = "RTVJOBA TYPE(&JOBTYP) CCSID(&CCSID) DFTCCSID(&DFTCCSID)";

		QCallableCommand callableCommand = commandManager.prepareCommand(job, cmd, variables, true);
		commandManager.executeCommand(job, callableCommand);
		callableCommand.close();
		testAsserter.assertTrue(cmd + " jobtyp='0'", jobtyp.eq("0"));
		testAsserter.assertTrue(cmd + " CCSID=13496", ccsid.eq(13496));
		testAsserter.assertTrue(cmd + " DFTCCSID=13496", dftccsid.eq(13496));
	}
}