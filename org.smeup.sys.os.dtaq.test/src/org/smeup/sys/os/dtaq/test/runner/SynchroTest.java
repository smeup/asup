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
import org.smeup.sys.il.lock.LockType;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.lock.QObjectLocker;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.OperatingSystemException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.dtaq.DataQueueSequence;
import org.smeup.sys.os.dtaq.QDataQueue;
import org.smeup.sys.os.dtaq.QDataQueueManager;
import org.smeup.sys.os.lib.QLibrary;

@Test(object = "SYNCHRO")
public class SynchroTest {

	@Inject
	private QDataQueueManager dataQueueManager;
	@Inject
	private QLockManager lockManager;
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

	private transient Object lockWaitObj = new Object();

	@TestStarted
	public void runTest() {
		try{
			doTestReadOK();
			doTestReadKO();
		} 
		catch(Exception exc) {
			testAsserter.fail("Exception in class SynchroTest" + exc.getMessage());
		}
	}

	/**
	 * Test reading from a locked by other queue, with lock that expire before
	 * timeout
	 * 
	 * @throws OperatingSystemException
	 */
	public void doTestReadOK() throws OperatingSystemException {

		String testLib = "QTEMP";
		String fifoDtaq = "FIFO_DTAQ";

		// Create a test library (if none)
		if (checkObj(job, QLibrary.class, "QSYS", testLib) == false) {
			String cmd = "CRTLIB LIB(" + testLib + ")";
			QCallableCommand callableCommand = commandManager.prepareCommand(job, cmd, null, true);
			commandManager.executeCommand(job, callableCommand);
			callableCommand.close();
		}

		// Assert: create queues (if none, else clear existent)
		if (checkObj(job, QDataQueue.class, testLib, fifoDtaq) == false) {
			createDataQueue(testLib, fifoDtaq, DataQueueSequence.FIFO, 32000);
			testAsserter.assertTrue("Create FIFO DTAQ " + testLib + "/" + fifoDtaq, checkObj(job, QDataQueue.class, testLib, fifoDtaq));
		} else
			dataQueueManager.clearDataQueue(jobCapability, testLib, fifoDtaq);

		String writeVal = "TEST DTAQ 1";

		// Write test data in DTAQ
		dataQueueManager.writeDataQueue(jobCapability, testLib, fifoDtaq, null, writeVal);

		// Start timed read lock (10 secs)
		long delay = 10000;
		TimedLock call = new TimedLock(testLib, fifoDtaq, delay);
		Thread t = new Thread(call);
		t.start();

		synchronized (lockWaitObj) {
			try {
				lockWaitObj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Read from queue waiting for 20 secs
		long waitFor = 20000;
		long startTime = System.currentTimeMillis();
		String readVal = dataQueueManager.readDataQueue(jobCapability, testLib, fifoDtaq, waitFor, null, null);
		long endTime = System.currentTimeMillis();

		testAsserter.assertTrue("Wait unlock when reading", (endTime - startTime) < waitFor && (endTime - startTime) > delay);
		testAsserter.assertEquals("Read from queue with wait for data", writeVal, readVal);

		// Delete queues
		deleteDataQueue(testLib, fifoDtaq);
		testAsserter.assertTrue("Delete FIFO DTAQ " + testLib + "/" + fifoDtaq, checkObj(job, QDataQueue.class, testLib, fifoDtaq) == false);
	}

	/**
	 * Test reading from a locked by other queue, with lock that expire before
	 * timeout
	 * 
	 * @throws OperatingSystemException
	 */
	public void doTestReadKO() throws OperatingSystemException {

		String testLib = "TSTLIB";
		String fifoDtaq_1 = "FIFO_DTAQ_1";

		// Create a test library (if none)
		if (checkObj(job, QLibrary.class, "QSYS", testLib) == false) {
			String cmd = "CRTLIB LIB(" + testLib + ")";
			QCallableCommand callableCommand = commandManager.prepareCommand(job, cmd, null, true);
			commandManager.executeCommand(job, callableCommand);
			callableCommand.close();
		}

		// Assert: create queues (if none, else clear existent)
		if (checkObj(job, QDataQueue.class, testLib, fifoDtaq_1) == false) {
			createDataQueue(testLib, fifoDtaq_1, DataQueueSequence.FIFO, 32000);
			testAsserter.assertTrue("Create FIFO DTAQ " + testLib + "/" + fifoDtaq_1, checkObj(job, QDataQueue.class, testLib, fifoDtaq_1));
		} else
			dataQueueManager.clearDataQueue(jobCapability, testLib, fifoDtaq_1);

		String writeVal = "TEST DTAQ 1";

		// Wite test data in DTAQ
		dataQueueManager.writeDataQueue(jobCapability, testLib, fifoDtaq_1, null, writeVal);

		// Start timed read lock (20 secs)
		long delay = 20000;
		TimedLock call = new TimedLock(testLib, fifoDtaq_1, delay);
		Thread t = new Thread(call);
		t.start();

		synchronized (lockWaitObj) {
			try {
				lockWaitObj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Read from queue waiting for 10 secs
		long waitFor = 10000;
		long startTime = System.currentTimeMillis();
		String readVal = dataQueueManager.readDataQueue(jobCapability, testLib, fifoDtaq_1, waitFor, null, null);
		long endTime = System.currentTimeMillis();

		testAsserter.assertTrue("Wait until timeout occour", (endTime - startTime) > waitFor && (endTime - startTime) < delay);
		testAsserter.assertNull("Read null from queue (cause timout)", readVal);

		// Delete queues
		deleteDataQueue(testLib, fifoDtaq_1);
		testAsserter.assertTrue("Delete FIFO DTAQ " + testLib + "/" + fifoDtaq_1, checkObj(job, QDataQueue.class, testLib, fifoDtaq_1) == false);
	}

	private <T extends QObjectNameable> boolean checkObj(QJob job, Class<T> klass, String library, String name) {
		QResourceReader<?> resourceReader = resourceManager.getResourceReader(job, klass, library);
		return resourceReader.exists(name);
	}

	private class TimedLock implements Runnable {
		// DataQueueManager dataQueueManager;
		String lib;
		String queue;
		long delay;

		Object lockTimerObj = new Object();

		TimedLock(String lib, String queue, long delay) {
			this.lib = lib;
			this.queue = queue;
			this.delay = delay;
		}

		@Override
		public void run() {

			// Get the queue
			QResourceWriter<QDataQueue> resource = resourceManager.getResourceWriter(job, QDataQueue.class, lib);
			QDataQueue dataQueue = resource.lookup(queue);

			// Lock it for reading
			QObjectLocker<QDataQueue> locker = lockManager.getLocker(job.getContext(), dataQueue);
			locker.lock(LockType.READ);

			// Notify lock success to caller class
			synchronized (lockWaitObj) {
				lockWaitObj.notify();
			}

			// Wait delay
			try {
				synchronized (lockTimerObj) {
					lockTimerObj.wait(delay);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// Unlock
			locker.unlock(LockType.READ);
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
