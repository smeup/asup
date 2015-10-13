/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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
import org.smeup.sys.os.core.OperatingSystemException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.dtaq.DataQueueSearchType;
import org.smeup.sys.os.dtaq.DataQueueType;
import org.smeup.sys.os.dtaq.QDataQueue;
import org.smeup.sys.os.dtaq.QDataQueueManager;
import org.smeup.sys.os.lib.QLibrary;

@Test(category = "OSDTAQ", object = "KEYED")
public class KeyedQueueTest {

	@Inject
	private QDataQueueManager dataQueueManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QCommandManager commandManager;
	@Inject
	private QTestAsserter testAsserter;
	@Inject
	private QJob job;

	@TestStarted
	public void runTest() throws OperatingSystemException {
		doTest1();
		doTest2();
	}

	/**
	 * Tests:
	 *
	 * 1) Reading by key 2) Reading by key with multiple value for single key
	 * 
	 * @throws OperatingSystemException
	 */
	public void doTest1() throws OperatingSystemException {

		String testLib = "TSTLIB";
		String keyedDtaq = "KEY_DTAQ";

		// Create a test library (if none)
		if (checkObj(job, QLibrary.class, "QSYS", testLib) == false) {
			String cmd = "CRTLIB LIB(" + testLib + ")";
			QCallableCommand callableCommand = commandManager.prepareCommand(job.getJobID(), cmd, null, true);
			commandManager.executeCommand(job.getJobID(), callableCommand);
			callableCommand.close();
		}

		// Create Keyed Queue
		if (checkObj(job, QDataQueue.class, testLib, keyedDtaq) == false) {
			dataQueueManager.createDataQueue(job.getJobID(), testLib, keyedDtaq, DataQueueType.KEYED, 32000);
			testAsserter.assertTrue("Create KEYED DTAQ ", checkObj(job, QDataQueue.class, testLib, keyedDtaq));
		} else
			dataQueueManager.clearDataQueue(job.getJobID(), testLib, keyedDtaq);

		// Test Data
		String key1 = "TEST_KEY_1";
		String key2 = "TEST_KEY_2";
		String writeVal1 = "A - TEST DTAQ 1";
		String writeVal2 = "B - TEST DTAQ 2";
		String writeVal3 = "C - TEST DTAQ 3";

		// Write in queue

		dataQueueManager.writeDataQueue(job.getJobID(), testLib, keyedDtaq, key1, writeVal1);
		dataQueueManager.writeDataQueue(job.getJobID(), testLib, keyedDtaq, key1, writeVal2);
		dataQueueManager.writeDataQueue(job.getJobID(), testLib, keyedDtaq, key1, writeVal3);

		dataQueueManager.writeDataQueue(job.getJobID(), testLib, keyedDtaq, key2, writeVal1);
		dataQueueManager.writeDataQueue(job.getJobID(), testLib, keyedDtaq, key2, writeVal2);
		dataQueueManager.writeDataQueue(job.getJobID(), testLib, keyedDtaq, key2, writeVal3);

		// Read in shuffle order
		String[] readedKey1 = new String[3];
		String[] readedKey2 = new String[3];
		readedKey1[0] = dataQueueManager.readDataQueue(job.getJobID(), testLib, keyedDtaq, -1, key1, DataQueueSearchType.EQUAL);
		readedKey2[0] = dataQueueManager.readDataQueue(job.getJobID(), testLib, keyedDtaq, -1, key2, DataQueueSearchType.EQUAL);
		readedKey1[1] = dataQueueManager.readDataQueue(job.getJobID(), testLib, keyedDtaq, -1, key1, DataQueueSearchType.EQUAL);
		readedKey1[2] = dataQueueManager.readDataQueue(job.getJobID(), testLib, keyedDtaq, -1, key1, DataQueueSearchType.EQUAL);
		readedKey2[1] = dataQueueManager.readDataQueue(job.getJobID(), testLib, keyedDtaq, -1, key2, DataQueueSearchType.EQUAL);
		readedKey2[2] = dataQueueManager.readDataQueue(job.getJobID(), testLib, keyedDtaq, -1, key2, DataQueueSearchType.EQUAL);

		testAsserter.assertTrue("Read multiple key1 value from keyed DTAQ as FIFO", writeVal1.equals(readedKey1[0]) && writeVal2.equals(readedKey1[1]) && writeVal3.equals(readedKey1[2]));

		testAsserter.assertTrue("Read multiple key2 value from keyed DTAQ as FIFO", writeVal1.equals(readedKey2[0]) && writeVal2.equals(readedKey2[1]) && writeVal3.equals(readedKey2[2]));

		// Clear and delete TestQueue
		dataQueueManager.clearDataQueue(job.getJobID(), testLib, keyedDtaq);
		dataQueueManager.deleteDataQueue(job.getJobID(), testLib, keyedDtaq);
		testAsserter.assertTrue("Delete KEYED DTAQ ", checkObj(job, QDataQueue.class, testLib, keyedDtaq) == false);
	}

	/**
	 * Tests:
	 *
	 * 1) Reading by key with different search type
	 * 
	 * @throws OperatingSystemException
	 */
	public void doTest2() throws OperatingSystemException {

		String testLib = "TSTLIB";
		String keyedDtaq = "KEY_DTAQ";

		// Create a test library (if none)
		if (checkObj(job, QLibrary.class, "QSYS", testLib) == false) {
			String cmd = "CRTLIB LIB(" + testLib + ")";

			resourceManager.getResourceWriter(job, QLibrary.class, "QSYS").save(null);

			QCallableCommand callableCommand = commandManager.prepareCommand(job.getJobID(), cmd, null, true);
			commandManager.executeCommand(job.getJobID(), callableCommand);
			callableCommand.close();
		}

		// Create Keyed Queue
		if (checkObj(job, QDataQueue.class, testLib, keyedDtaq) == false) {
			dataQueueManager.createDataQueue(job.getJobID(), testLib, keyedDtaq, DataQueueType.KEYED, 32000);
			testAsserter.assertTrue("Create KEYED DTAQ ", checkObj(job, QDataQueue.class, testLib, keyedDtaq));
		} else
			dataQueueManager.clearDataQueue(job.getJobID(), testLib, keyedDtaq);

		// Test Data
		String key1 = "A";
		String key2 = "C";
		String key3 = "E";
		String writeVal1 = "VALUE 1";
		String writeVal2 = "VALUE 2";
		String writeVal3 = "VALUE 3";
		String writeVal4 = "VALUE 4";

		// Write in queue

		dataQueueManager.writeDataQueue(job.getJobID(), testLib, keyedDtaq, key1, writeVal1);
		dataQueueManager.writeDataQueue(job.getJobID(), testLib, keyedDtaq, key2, writeVal2);
		dataQueueManager.writeDataQueue(job.getJobID(), testLib, keyedDtaq, key3, writeVal3);
		dataQueueManager.writeDataQueue(job.getJobID(), testLib, keyedDtaq, key3, writeVal4);

		/*
		 * Queue state:
		 * 
		 * A - VALUE 1 C - VALUE 2 E - VALUE 3 E - VALUE 4
		 */

		// Read
		String[] readedKey1 = new String[3];

		// key=C e GE --> Expected VALUE 2
		readedKey1[0] = dataQueueManager.readDataQueue(job.getJobID(), testLib, keyedDtaq, -1, "C", DataQueueSearchType.GREATER_THAN_OR_EQUAL);
		testAsserter.assertEquals("GREATER_THEN_OR_EQUAL read from keyed DTAQ", writeVal2, readedKey1[0]);

		// key=D e LE --> Expected VALUE 1
		readedKey1[1] = dataQueueManager.readDataQueue(job.getJobID(), testLib, keyedDtaq, -1, "D", DataQueueSearchType.LESS_THAN_OR_EQUAL);
		testAsserter.assertEquals("LESS_THEN_OR_EQUAL read from keyed DTAQ", writeVal1, readedKey1[1]);

		// key=E e EQ --> Expected VALUE 3
		readedKey1[2] = dataQueueManager.readDataQueue(job.getJobID(), testLib, keyedDtaq, -1, "2", DataQueueSearchType.NOT_EQUAL);
		testAsserter.assertEquals("EQUAL read from keyed DTAQ", writeVal3, readedKey1[2]);

		// key=E e NE --> Expected VALUE 4
		readedKey1[2] = dataQueueManager.readDataQueue(job.getJobID(), testLib, keyedDtaq, -1, "2", DataQueueSearchType.NOT_EQUAL);
		testAsserter.assertEquals("EQUAL read from keyed DTAQ", writeVal4, readedKey1[2]);

		// Clear and delete TestQueue
		dataQueueManager.clearDataQueue(job.getJobID(), testLib, keyedDtaq);
		dataQueueManager.deleteDataQueue(job.getJobID(), testLib, keyedDtaq);
		testAsserter.assertTrue("Delete KEYED DTAQ ", checkObj(job, QDataQueue.class, testLib, keyedDtaq) == false);
	}

	private <T extends QObjectNameable> boolean checkObj(QJob job, Class<T> klass, String library, String name) {
		QResourceReader<?> resourceReader = resourceManager.getResourceReader(job, klass, library);
		return resourceReader.exists(name);
	}
}