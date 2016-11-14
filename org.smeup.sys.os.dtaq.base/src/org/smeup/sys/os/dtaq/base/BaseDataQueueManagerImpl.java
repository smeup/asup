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
 *   Mattia Rocchi - Implementation (http://bugs.java.com/bugdatabase/view_bug.do?bug_id=6653412)
 */
package org.smeup.sys.os.dtaq.base;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

import javax.inject.Inject;

import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.dtaq.DataQueueSearchType;
import org.smeup.sys.os.dtaq.DataQueueSequence;
import org.smeup.sys.os.dtaq.QDataQueueManager;

public class BaseDataQueueManagerImpl implements QDataQueueManager {

	@SuppressWarnings("unused")
	@Inject
	private QLockManager lockManager;
	@Inject
	private QJobManager jobManager;
	
	private Map<String, BaseBlockingFifoQueue<String>> queueList = new HashMap<String, BaseBlockingFifoQueue<String>>();

	@Override
	public void writeDataQueue(QJobCapability capability, String library, String name, String key, QString value) {
		writeDataQueue(capability, library, name, key, value.asString());
	}	
	
	@Override	
	public void writeDataQueue(QJobCapability capability, String library, String name, String key, String value) {
		
		QJob job = jobManager.lookup(capability);
		
		BaseBlockingFifoQueue<String> queue = getOrCreateQueue(job, library, name);
		if (queue == null)
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);
		
		queue.put(value);	
	}
	
	@Override
	public String readDataQueue(QJobCapability capability, String library, String name, long timeOut, String key, DataQueueSearchType searchType) {

		QJob job = jobManager.lookup(capability);

		String vResult = null;

		BaseBlockingFifoQueue<String> queue = getOrCreateQueue(job, library, name);
		if (queue == null)
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);

		try {
			vResult = queue.poll(timeOut);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}

		return vResult;
	}
	
	@Override
	public String peekDataQueue(QJobCapability capability, String library, String name, long timeOut, String key, DataQueueSearchType searchType) {

		QJob job = jobManager.lookup(capability);
		
		String vResult = null;

		BaseBlockingFifoQueue<String> queue = getOrCreateQueue(job, library, name);
		if (queue == null)
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);

		try {
			vResult = queue.peek(timeOut);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}

		return vResult;		
	}

	@Override
	public void clearDataQueue(QJobCapability capability, String library, String name) {

		QJob job = jobManager.lookup(capability);
		
		BaseBlockingFifoQueue<String> queue = getOrCreateQueue(job, library, name);
		if (queue == null)
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);
		
		queue.clear();
	}

	private BaseBlockingFifoQueue<String> getOrCreateQueue(QContextProvider contextProvider, String library, String name) throws BaseFifoQueueException {

		String queueKey = library.toUpperCase() + "/" + name.toUpperCase();
		BaseBlockingFifoQueue<String> queue = queueList.get(queueKey);
		if (queue == null) {
			synchronized (queueList) {
				queue = queueList.get(queueKey);
				if (queue == null) {
					// TODO retrieve dataQueue from resources, switch for dataQueue type
					DataQueueSequence dataQueueSequence = DataQueueSequence.FIFO;
					switch (dataQueueSequence) {
					case FIFO:
						// TODO distributed queue
//						queue = new BaseBlockingFifoQueue<String>(lockManager.getQueue(contextProvider, queueKey));
						queue = new BaseBlockingFifoQueue<String>(new LinkedBlockingQueue<String>());
						break;
					case KEYED:
						break;
					case LIFO:
						break;
					}
					queueList.put(queueKey, queue);
				}
			}
		}

		return queue;
	}
}