/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.core.test;

import javax.inject.Inject;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLog;
import org.smeup.sys.os.core.jobs.QJobLogEntry;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;

public class TestJobLog extends AbstractCommandProviderImpl {

	@Inject
	private QTestManager testManager;
	@Inject
	private QJobManager jobManager;

	public void _testJOBLOG(CommandInterpreter interpreter) throws Exception {

		String user = interpreter.nextArgument();

		QJob job = jobManager.create(user, null);

		QContext testContext = job.getContext().createChildContext("Test JOBLOG");
		testContext.set(QJob.class, job);

		try {
			// JobLog
			QTestRunner testRunner = testManager.prepareRunner(testContext, JobLog.class);
			QTestResult testResult = testRunner.call();

			printTestResult(testResult);
		} finally {

			testContext.close();

			jobManager.close(job);
		}

	}

	@Test(category = "OSCORE", object = "JOBLOG")
	public static class JobLog {

		@Inject
		private QJob job;
		@Inject
		private QJobLogManager jobLogManger;
		@Inject
		private QTestAsserter testAsserter;

		@TestStarted
		public void doTest() {

			jobLogManger.info(job, "Test INFO");

			QJobLog jobLog = jobLogManger.lookup(job);

			String lastMessage = null;

			for (QJobLogEntry jobLogEntry : jobLog.getEntries())
				lastMessage = jobLogEntry.getMessage();

			testAsserter.assertEquals("Test JOBLOG", "Test INFO", lastMessage);

		}
	}
}
