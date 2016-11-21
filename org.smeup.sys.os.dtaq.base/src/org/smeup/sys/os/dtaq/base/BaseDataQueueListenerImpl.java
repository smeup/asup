/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.dtaq.base;

import java.util.Map;

import org.smeup.sys.il.memo.QResourceEvent;
import org.smeup.sys.il.memo.QResourceListener;
import org.smeup.sys.os.dtaq.QDataQueue;

public class BaseDataQueueListenerImpl implements QResourceListener<QDataQueue> {

	private Map<String, BaseBlockingQueue<String>> queueList;
	
	public BaseDataQueueListenerImpl(Map<String, BaseBlockingQueue<String>> queueList) {
		this.queueList = queueList;
	}
	
	@Override
	public void handleEvent(QResourceEvent<QDataQueue> event) {
		
		QDataQueue dataQueue = event.getSource();
		
		switch (event.getEventType()) {
		case POST_DELETE: {
			String dataQueueKey = dataQueue.getLibrary().toUpperCase() + "/" + dataQueue.getName().toUpperCase();
			queueList.remove(dataQueueKey);
			break;
		}
		case POST_RENAME: {
			String dataQueueKey = dataQueue.getLibrary().toUpperCase() + "/" + event.getOldName().toUpperCase();
			queueList.remove(dataQueueKey);
			break;
		}
		case POST_SAVE:
			break;
		case PRE_DELETE:
			break;
		case PRE_RENAME:
			break;
		case PRE_SAVE:
			break;
		}
	}
}