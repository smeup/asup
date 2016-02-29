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
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.dtaq.DataQueueSequence;
import org.smeup.sys.os.dtaq.QDataQueue;
import org.smeup.sys.os.dtaq.QDataQueueManager;
import org.smeup.sys.os.lib.QLibrary;

@Test(category = "OS.DTAQ", object = "WAIT")
public class WaitTest {

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
	@Inject
	private QJobCapability jobCapability;

	@TestStarted
	public void doTest() {

		try {
		
			String testLib = "QTEMP";
			String fifoDtaq = "FIFO_DTAQ";
	
			// Create a test library (if none)
			if (checkObj(job, QLibrary.class, "QSYS", testLib) == false) {
				String cmd = "CRTLIB LIB(" + testLib + ") TEXT('TEMPORARY LIB: '" + jobCapability + "')";
				QCallableCommand callableCommand = commandManager.prepareCommand(job, cmd, null, true);
				commandManager.executeCommand(job, callableCommand);
				callableCommand.close();
			}
	
			// Assert: create queues (if none, else clear existent)
			if (checkObj(job, QDataQueue.class, testLib, fifoDtaq) == false) {
				createDataQueue(testLib, fifoDtaq, DataQueueSequence.FIFO, 32000);
				testAsserter.assertTrue("Create FIFO DTAQ ", checkObj(job, QDataQueue.class, testLib, fifoDtaq));
			} else
				dataQueueManager.clearDataQueue(jobCapability, testLib, fifoDtaq);
	
			String writeVal = "TEST DTAQ 1";
	
			// Write in queue with a delay of 5 sec
			DelayedWrite call = new DelayedWrite(testLib, fifoDtaq, null, writeVal, 5000);
			Thread t = new Thread(call);
			t.start();
	
			// Read from queue waiting for 20 secs
			long waitFor = 20000;
			long startTime = System.currentTimeMillis();
			String readVal = dataQueueManager.readDataQueue(jobCapability, testLib, fifoDtaq, waitFor, null, null);
			long endTime = System.currentTimeMillis();
	
			testAsserter.assertTrue("Interrupt wait before timeout if data available", (endTime - startTime) < waitFor);
			testAsserter.assertEquals("Read from queue with wait for data", writeVal, readVal);
	
			// Delete queues
			deleteDataQueue( testLib, fifoDtaq);
			testAsserter.assertTrue("Delete FIFO DTAQ ", checkObj(job, QDataQueue.class, testLib, fifoDtaq) == false);
		} catch(Exception exc) {
			testAsserter.fail("Exception in class WaitTest:" + exc.getMessage());
		}
	}

	private <T extends QObjectNameable> boolean checkObj(QJob job, Class<T> klass, String library, String name) {
		QResourceReader<?> resourceReader = resourceManager.getResourceReader(job, klass, library);
		return resourceReader.exists(name);
	}

	private class DelayedWrite implements Runnable {
		// DataQueueManager dataQueueManager;
		String lib;
		String queue;
		String key;
		String value;
		long delay;

		Object lockObj = new Object();

		DelayedWrite(String lib, String queue, String key, String value, long delay) {
			this.lib = lib;
			this.queue = queue;
			this.key = key;
			this.value = value;
			this.delay = delay;
		}

		@Override
		public void run() {

			try {
				synchronized (lockObj) {
					lockObj.wait(delay);
				}

				dataQueueManager.writeDataQueue(jobCapability, lib, queue, key, value);
				
			} catch (InterruptedException e) {
				throw new OperatingSystemRuntimeException(e);
			} 
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
}
