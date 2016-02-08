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
package org.smeup.sys.os.dtaq.base;

import java.util.Hashtable;

public class BaseFifoQueueManager {

	Hashtable<String, BaseBlockingFifoQueue<String>> iQueueList = new Hashtable<String, BaseBlockingFifoQueue<String>>();

	public BaseFifoQueueManager() {

	}

	public void createQueue(String aLib, String aName) throws BaseFifoQueueException {

		String vQueueKey = buildQueueKey(aLib, aName);
		if (iQueueList.containsKey(vQueueKey) == false) {
			BaseBlockingFifoQueue<String> vNewQueue = new BaseBlockingFifoQueue<String>(aLib, aName);
			iQueueList.put(vQueueKey, vNewQueue);
		} else
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_ALREADY_EXISTS);

	}

	public void removeQueue(String aLib, String aName) throws BaseFifoQueueException {
		String vQueueKey = buildQueueKey(aLib, aName);
		if (iQueueList.containsKey(vQueueKey))
			iQueueList.remove(vQueueKey);
		else
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);

	}

	public void writeToQueue(String aLib, String aName, String aValue) throws BaseFifoQueueException {
		String vQueueKey = buildQueueKey(aLib, aName);
		if (iQueueList.containsKey(vQueueKey)) {

			BaseBlockingFifoQueue<String> vFifoQueue = iQueueList.get(vQueueKey);

			synchronized (vFifoQueue) {
				vFifoQueue.push(aValue);
			}
		} else
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);

	}

	public String readFromQueue(String aLib, String aName, long aTimeout) throws BaseFifoQueueException {
		String vResult = null;

		String vQueueKey = buildQueueKey(aLib, aName);
		if (iQueueList.containsKey(vQueueKey))
			try {
				vResult = iQueueList.get(vQueueKey).pop(aTimeout);
			} catch (InterruptedException vExc) {
//				vExc.printStackTrace();
			}
		else
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);

		return vResult;
	}

	public String peekFromQueue(String aLib, String aName, long aTimeout) throws BaseFifoQueueException {

		String vResult = null;

		String vQueueKey = buildQueueKey(aLib, aName);
		if (iQueueList.containsKey(vQueueKey))
			try {
				vResult = iQueueList.get(vQueueKey).peek(aTimeout);
			} catch (InterruptedException vExc) {
				vExc.printStackTrace();
			}
		else
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);

		return vResult;

	}

	public void clearQueue(String aLib, String aName) throws BaseFifoQueueException {
		String vQueueKey = buildQueueKey(aLib, aName);
		if (iQueueList.containsKey(vQueueKey))
			iQueueList.get(vQueueKey).clear();
		else
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);

	}

	private String buildQueueKey(String aLib, String aName) {
		String vKey = aLib + aName;
		return vKey.toUpperCase();
	}

	public static void main(String[] args) {
		BaseFifoQueueManager vQueueManager = new BaseFifoQueueManager();
		try {
			vQueueManager.createQueue("testlib", "testqueue");
			vQueueManager.writeToQueue("testlib", "testqueue", "Prova");
			System.out.println("Lettura: " + vQueueManager.readFromQueue("testlib", "testqueue", -1));
			System.out.println("Lettura: " + vQueueManager.readFromQueue("testlib", "testqueue", 3000));
			vQueueManager.removeQueue("testlib", "testqueue");
			System.out.println("Lettura: " + vQueueManager.readFromQueue("testlib", "testqueue", 3000));

		} catch (BaseFifoQueueException vExc) {
			// TODO Auto-generated catch block
			vExc.printStackTrace();
		}

	}
}
