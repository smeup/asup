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
package org.smeup.sys.os.dtaq.base;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.dtaq.DataQueueSearchType;
import org.smeup.sys.os.dtaq.DataQueueType;
import org.smeup.sys.os.dtaq.QDataQueue;
import org.smeup.sys.os.dtaq.QDataQueueManager;
import org.smeup.sys.os.dtaq.QOperatingSystemDataQueueFactory;

public class BaseDataQueueManagerImpl implements QDataQueueManager {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJobManager jobManager;

	private BaseFifoQueueManager dataQueueManager;

	@PostConstruct
	public void init() {
		dataQueueManager = new BaseFifoQueueManager();
	}
	
	@Override
	public void writeDataQueue(String contextID, String library, String name, String key, QString value) {
		dataQueueManager.writeToQueue(library, name, value.toString());
	}
	
	
	public void writeDataQueue(String ContextID, String library, String name, String key, String aValue) {
		dataQueueManager.writeToQueue(library, name, aValue);
	}

	@Override
	public String readDataQueue(String ContextID, String library, String name, long aTimeout, String key, DataQueueSearchType searchType) {
		// TODO
		if (aTimeout < 0)
			aTimeout = 30000;

		return dataQueueManager.readFromQueue(library, name, aTimeout);
	}

	@Override
	public String peekDataQueue(String ContextID, String library, String name, long aTimeout, String key, DataQueueSearchType searchType) {
		return dataQueueManager.peekFromQueue(library, name, aTimeout);		
	}

	@Override
	public void createDataQueue(String contextID, String library, String name, DataQueueType aType, int aMaxEntryLength) {

		QJob job = jobManager.lookup(contextID);
		QResourceWriter<QDataQueue> resource = resourceManager.getResourceWriter(job, QDataQueue.class, library);
		QDataQueue dataQueue = resource.lookup(name);
		if (dataQueue == null) {
			// Queue do not exists. Create and register.
			dataQueue = QOperatingSystemDataQueueFactory.eINSTANCE.createDataQueue();
			dataQueue.setName(name);
			dataQueue.setDataQueueType(aType);
			dataQueue.setMaxEntryLength(aMaxEntryLength);

			resource.save(dataQueue);

			System.out.println(contextID + "\t" + "Queue " + name + " created");

			dataQueueManager.createQueue(library, name);
		} else
			throw new OperatingSystemRuntimeException("Queue " + name + " already exists in library " + library);
		
	}

	@Override
	public void clearDataQueue(String ContextID, String library, String name) {
		dataQueueManager.clearQueue(library, name);
	}

	@Override
	public void deleteDataQueue(String ContextID, String library, String name) {

		QJob job = jobManager.lookup(ContextID);

		QResourceWriter<QDataQueue> resource = resourceManager.getResourceWriter(job, QDataQueue.class, library);
		QDataQueue vDtaq = resource.lookup(name);
		resource.delete(vDtaq);

		dataQueueManager.removeQueue(library, name);
	}
}