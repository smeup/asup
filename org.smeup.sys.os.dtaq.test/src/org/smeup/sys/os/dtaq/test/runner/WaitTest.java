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
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.dtaq.DataQueueType;
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

	@TestStarted
	public void doTest() {

		try {
		
			String testLib = "QTEMP";
			String fifoDtaq = "FIFO_DTAQ";
	
			// Create a test library (if none)
			if (checkObj(job, QLibrary.class, "QSYS", testLib) == false) {
				String cmd = "CRTLIB LIB(" + testLib + ") TEXT('TEMPORARY LIB: '" + job.getJobID() + "')";
				QCallableCommand callableCommand = commandManager.prepareCommand(job.getJobID(), cmd, null, true);
				commandManager.executeCommand(job.getJobID(), callableCommand);
				callableCommand.close();
			}
	
			// Assert: create queues (if none, else clear existent)
			if (checkObj(job, QDataQueue.class, testLib, fifoDtaq) == false) {
				dataQueueManager.createDataQueue(job.getJobID(), testLib, fifoDtaq, DataQueueType.FIFO, 32000);
				testAsserter.assertTrue("Create FIFO DTAQ ", checkObj(job, QDataQueue.class, testLib, fifoDtaq));
			} else
				dataQueueManager.clearDataQueue(job.getJobID(), testLib, fifoDtaq);
	
			String writeVal = "TEST DTAQ 1";
	
			// Write in queue with a delay of 5 sec
			DelayedWrite call = new DelayedWrite(testLib, fifoDtaq, null, writeVal, 5000);
			Thread t = new Thread(call);
			t.start();
	
			// Read from queue waiting for 20 secs
			long waitFor = 20000;
			long startTime = System.currentTimeMillis();
			String readVal = dataQueueManager.readDataQueue(job.getJobID(), testLib, fifoDtaq, waitFor, null, null);
			long endTime = System.currentTimeMillis();
	
			testAsserter.assertTrue("Interrupt wait before timeout if data available", (endTime - startTime) < waitFor);
			testAsserter.assertEquals("Read from queue with wait for data", writeVal, readVal);
	
			// Delete queues
			dataQueueManager.deleteDataQueue(job.getJobID(), testLib, fifoDtaq);
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

				dataQueueManager.writeDataQueue(job.getJobID(), lib, queue, key, value);
				
			} catch (InterruptedException e) {
				throw new OperatingSystemRuntimeException(e);
			} 
		}
	}

}
