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
 *   Mattia Rocchi - Implementation
 */
package org.smeup.sys.os.dtaq.base;

import java.util.Map;
import java.util.WeakHashMap;

public class BaseFifoQueueManager {

	private Map<String, BaseBlockingFifoQueue<String>> queueList = new WeakHashMap<String, BaseBlockingFifoQueue<String>>();

	public BaseFifoQueueManager() {

	}

	public void writeToQueue(String library, String name, String value) throws BaseFifoQueueException {

		BaseBlockingFifoQueue<String> queue = getOrCreateQueue(library, name);
		if (queue == null)
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);

		// TODO remove synchronized?
		synchronized (queue) {
			queue.push(value);
		}
	}

	public String readFromQueue(String library, String name, long timeOut) throws BaseFifoQueueException {

		String vResult = null;

		BaseBlockingFifoQueue<String> queue = getOrCreateQueue(library, name);
		if (queue == null)
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);

		try {
			vResult = queue.pop(timeOut);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}

		return vResult;
	}

	public String peekFromQueue(String library, String name, long timeOut) throws BaseFifoQueueException {

		String vResult = null;

		BaseBlockingFifoQueue<String> queue = getOrCreateQueue(library, name);
		if (queue == null)
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);

		try {
			vResult = queue.peek(timeOut);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}

		return vResult;
	}

	public void clearQueue(String library, String name) throws BaseFifoQueueException {

		BaseBlockingFifoQueue<String> queue = getOrCreateQueue(library, name);
		if (queue == null)
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);

		queue.clear();
	}

	private BaseBlockingFifoQueue<String> getOrCreateQueue(String library, String name) throws BaseFifoQueueException {

		String queueKey = library.toUpperCase() + "/" + name.toUpperCase();
		BaseBlockingFifoQueue<String> queue = queueList.get(queueKey);
		if (queue == null) {
			synchronized (queueList) {
				queue = queueList.get(queueKey);
				if (queue == null) {
					queue = new BaseBlockingFifoQueue<String>(library, name);
					queueList.put(queueKey, queue);
				}
			}
		}

		return queue;
	}
}