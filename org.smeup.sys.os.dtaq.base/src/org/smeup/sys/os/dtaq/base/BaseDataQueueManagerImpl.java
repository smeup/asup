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

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.lock.QLockManager;
import org.smeup.sys.il.memo.QResourceListener;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.dtaq.DataQueueSearchType;
import org.smeup.sys.os.dtaq.QDataQueue;
import org.smeup.sys.os.dtaq.QDataQueueManager;

public class BaseDataQueueManagerImpl implements QDataQueueManager {

	@Inject
	private QLockManager lockManager;
	@Inject
	private QJobManager jobManager;
	@Inject
	private QResourceManager resourceManager;
	
	private Map<String, BaseBlockingQueue<String>> queueList = new HashMap<String, BaseBlockingQueue<String>>();
	
	@PostConstruct
	private void init() {
		QResourceListener<QDataQueue> dataQueueListener = new BaseDataQueueListenerImpl(queueList);
		resourceManager.registerListener(QDataQueue.class, dataQueueListener);
	}
	
	@Override
	public void writeDataQueue(QJobCapability capability, String library, String name, String key, QString value) {
		writeDataQueue(capability, library, name, key, value.asString());
	}	
	
	@Override	
	public void writeDataQueue(QJobCapability capability, String library, String name, String key, String value) {
		
		QJob job = jobManager.lookup(capability);
		
		BaseBlockingFifoQueue<String> queue = (BaseBlockingFifoQueue<String>) getOrCreateQueue(job, library, name, key);
		if (queue == null)
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);
		
		queue.put(value);	
	}
	
	@Override
	public String readDataQueue(QJobCapability capability, String library, String name, long timeOut, String key, DataQueueSearchType searchType) {

		QJob job = jobManager.lookup(capability);

		String vResult = null;

		BaseBlockingFifoQueue<String> queue = (BaseBlockingFifoQueue<String>) getOrCreateQueue(job, library, name, key);
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
	public String peekDataQueue(QJobCapability capability, String library, String name, String key, DataQueueSearchType searchType) {

		QJob job = jobManager.lookup(capability);
		
		String vResult = null;

		BaseBlockingQueue<String> queue = getOrCreateQueue(job, library, name, key);
		if (queue == null)
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);

		try {
			vResult = queue.peek();
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}

		return vResult;		
	}

	@Override
	public void clearDataQueue(QJobCapability capability, String library, String name) {

		QJob job = jobManager.lookup(capability);
		
		BaseBlockingQueue<String> queue = getOrCreateQueue(job, library, name, null);
		if (queue == null)
			throw new BaseFifoQueueException(BaseFifoQueueException.QUEUE_DO_NOT_EXISTS);
		
		queue.clear();
	}

	private BaseBlockingQueue<String> getOrCreateQueue(QContextProvider contextProvider, String library, String name, String key) throws BaseFifoQueueException {

		String queueKey = library.toUpperCase() + "/" + name.toUpperCase();
		BaseBlockingQueue<String> queue = queueList.get(queueKey);
		if (queue == null) {
			synchronized (queueList) {
				queue = queueList.get(queueKey);
				if (queue == null) {
					
					QResourceReader<QDataQueue> dataQueueReader = resourceManager.getResourceReader(contextProvider, QDataQueue.class, Scope.ALL, library);
					QDataQueue dataQueue = dataQueueReader.lookup(name);
					if(dataQueue == null)
						return null;
									
					switch (dataQueue.getSequence()) {
					case FIFO:
						// TODO distributed queue
						queue = new BaseBlockingFifoQueue<String>(lockManager.getQueue(contextProvider, queueKey));
//						queue = new BaseBlockingFifoQueue<String>(new LinkedBlockingQueue<String>());
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