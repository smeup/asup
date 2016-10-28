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
package org.smeup.sys.os.core.test.runner;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLog;
import org.smeup.sys.os.core.jobs.QJobLogEntry;
import org.smeup.sys.os.core.jobs.QJobLogManager;

@Test(object = "JobLog")
public class JobLogTest {

	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManger;
	@Inject
	public transient QTestAsserter testAsserter;

	@TestStarted
	public void doTest() {

		jobLogManger.info(job, "Test INFO");

		QJobLog jobLog = jobLogManger.lookup(job);

		String lastMessage = null;

		for (QJobLogEntry jobLogEntry : jobLogManger.getEntries(jobLog))
			lastMessage = jobLogEntry.getMessage();

		testAsserter.assertEquals("Test JOBLOG", "Test INFO", lastMessage);

	}
}
