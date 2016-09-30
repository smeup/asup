/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.os.dtaq.test.runner;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.dtaq.DataQueueSearchType;
import org.smeup.sys.os.dtaq.DataQueueSequence;
import org.smeup.sys.os.dtaq.QDataQueue;
import org.smeup.sys.os.dtaq.QDataQueueManager;
import org.smeup.sys.os.lib.QLibrary;

@Test(object = "CRUD")
public class CRUDTest {

	@Inject
	private QDataQueueManager dataQueueManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QCommandManager commandManager;
	@Inject
	public transient QTestAsserter testAsserter;
	@Inject
	private QJob job;
	@Inject
	private QJobCapability jobCapability;

	@TestStarted
	public void doTest() {

		String testLib = "TSTLIB";
		String fifoDtaq = "FIFO_DTAQ";
		String lifoDtaq = "LIFO_DTAQ";
		String keyedDtaq = "KEY_DTAQ";

		try {

			// Create a test library (if none)
			if (checkObj(job, QLibrary.class, "QSYS", testLib) == false) {
				String cmd = "CRTLIB LIB(" + testLib + ")";
				QCallableCommand callableCommand = commandManager.prepareCommand(job, cmd, null, true);
				commandManager.executeCommand(job, callableCommand);
				callableCommand.close();
			}

			// Assert: create queues (if none else clear existent)
			if (checkObj(job, QDataQueue.class, testLib, fifoDtaq) == false) {
				createDataQueue(testLib, fifoDtaq, DataQueueSequence.FIFO, 32000);
				testAsserter.assertTrue("Create FIFO DTAQ ", checkObj(job, QDataQueue.class, testLib, fifoDtaq));
			} else
				dataQueueManager.clearDataQueue(jobCapability, testLib, fifoDtaq);

			if (checkObj(job, QDataQueue.class, testLib, lifoDtaq) == false) {
				createDataQueue(testLib, lifoDtaq, DataQueueSequence.LIFO, 32000);
				testAsserter.assertTrue("Create LIFO DTAQ ", checkObj(job, QDataQueue.class, testLib, lifoDtaq));
			} else
				dataQueueManager.clearDataQueue(jobCapability, testLib, lifoDtaq);

			if (checkObj(job, QDataQueue.class, testLib, keyedDtaq) == false) {
				createDataQueue(testLib, keyedDtaq, DataQueueSequence.KEYED, 32000);
				testAsserter.assertTrue("Create KEYED DTAQ ", checkObj(job, QDataQueue.class, testLib, keyedDtaq));
			} else
				dataQueueManager.clearDataQueue(jobCapability, testLib, keyedDtaq);

			String writeVal1 = "TEST DTAQ 1";
			String writeVal2 = "TEST DTAQ 2";

			// Write and read FIFO

			dataQueueManager.writeDataQueue(jobCapability, testLib, fifoDtaq, null, writeVal1);
			dataQueueManager.writeDataQueue(jobCapability, testLib, fifoDtaq, null, writeVal2);
			String readVal1 = dataQueueManager.readDataQueue(jobCapability, testLib, fifoDtaq, -1, null, null);
			String readVal2 = dataQueueManager.readDataQueue(jobCapability, testLib, fifoDtaq, -1, null, null);
			testAsserter.assertEquals("Read first DTAQ FIFO", writeVal1, readVal1);
			testAsserter.assertEquals("Read second DTAQ FIFO", writeVal2, readVal2);

			// Write and read LIFO

			dataQueueManager.writeDataQueue(jobCapability, testLib, lifoDtaq, null, writeVal1);
			dataQueueManager.writeDataQueue(jobCapability, testLib, lifoDtaq, null, writeVal2);
			readVal1 = dataQueueManager.readDataQueue(jobCapability, testLib, lifoDtaq, -1, null, null);
			readVal2 = dataQueueManager.readDataQueue(jobCapability, testLib, lifoDtaq, -1, null, null);

			testAsserter.assertEquals("Read DTAQ LIFO", writeVal2, readVal1);
			testAsserter.assertEquals("Read DTAQ LIFO", writeVal1, readVal2);

			// Write and read KEYED

			String key = "TSTKEY";

			dataQueueManager.writeDataQueue(jobCapability, testLib, keyedDtaq, key, writeVal1);
			dataQueueManager.writeDataQueue(jobCapability, testLib, keyedDtaq, key, writeVal2);
			readVal1 = dataQueueManager.readDataQueue(jobCapability, testLib, keyedDtaq, -1, key, DataQueueSearchType.EQUAL);
			readVal2 = dataQueueManager.readDataQueue(jobCapability, testLib, keyedDtaq, -1, key, DataQueueSearchType.EQUAL);
			testAsserter.assertEquals("Read DTAQ KEYED", writeVal1, readVal1);
			testAsserter.assertEquals("Read DTAQ KEYED", writeVal2, readVal2);

			// Delete queues
			deleteDataQueue(testLib, fifoDtaq);
			testAsserter.assertTrue("Delete FIFO DTAQ ", checkObj(job, QDataQueue.class, testLib, fifoDtaq) == false);

			deleteDataQueue(testLib, lifoDtaq);
			testAsserter.assertTrue("Delete LIFO DTAQ ", checkObj(job, QDataQueue.class, testLib, lifoDtaq) == false);

			deleteDataQueue(testLib, keyedDtaq);
			testAsserter.assertTrue("Delete KEYED DTAQ ", checkObj(job, QDataQueue.class, testLib, keyedDtaq) == false);
		} catch (Exception exc) {
			testAsserter.fail("Exception in CRUDTest class:" + exc.getMessage());
		}
	}

	private void createDataQueue(String library, String name, DataQueueSequence dataQueueSeq, int maxLength) {
		
		String sequence = null;
		switch (dataQueueSeq) {
		case FIFO:
			sequence = "*FIFO";
			break;
		case KEYED:
			sequence = "*KEYED";
			break;
		case LIFO:
			sequence = "*LIFO";
			break;
		}
		
		String cmd = "CRTDTAQ DTAQ(" + library + "/" + name + ") SEQ(" + sequence + ") MAXLEN(" + maxLength + ")";
		QCallableCommand callableCommand = commandManager.prepareCommand(job, cmd, null, true);
		commandManager.executeCommand(job, callableCommand);
		callableCommand.close();
	}

	private void deleteDataQueue(String library, String name) {
		String cmd = "DLTDTAQ DTAQ(" + library + "/" + name + ")";
		QCallableCommand callableCommand = commandManager.prepareCommand(job, cmd, null, true);
		commandManager.executeCommand(job, callableCommand);
		callableCommand.close();
	}

	private <T extends QObjectNameable> boolean checkObj(QJob job, Class<T> klass, String library, String name) {
		QResourceReader<?> resourceReader = resourceManager.getResourceReader(job, klass, library);
		return resourceReader.exists(name);
	}
}
