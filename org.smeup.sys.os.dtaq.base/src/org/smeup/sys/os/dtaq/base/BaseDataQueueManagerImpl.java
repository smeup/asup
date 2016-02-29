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

import org.smeup.sys.il.data.QString;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.dtaq.DataQueueSearchType;
import org.smeup.sys.os.dtaq.QDataQueueManager;

public class BaseDataQueueManagerImpl implements QDataQueueManager {

	private BaseFifoQueueManager dataQueueManager = new BaseFifoQueueManager();

	@Override
	public void writeDataQueue(QJobCapability capability, String library, String name, String key, QString value) {
		dataQueueManager.writeToQueue(library, name, value.asString());
	}	
	
	@Override
	public void writeDataQueue(QJobCapability capability, String library, String name, String key, String aValue) {
		dataQueueManager.writeToQueue(library, name, aValue);
	}

	@Override
	public String readDataQueue(QJobCapability capability, String library, String name, long aTimeout, String key, DataQueueSearchType searchType) {
		
		// TODO
		if (aTimeout < 0)
			aTimeout = 50000;
		
		return dataQueueManager.readFromQueue(library, name, aTimeout);
	}

	@Override
	public String peekDataQueue(QJobCapability capability, String library, String name, long aTimeout, String key, DataQueueSearchType searchType) {
		return dataQueueManager.peekFromQueue(library, name, aTimeout);		
	}

	@Override
	public void clearDataQueue(QJobCapability capability, String library, String name) {
		dataQueueManager.clearQueue(library, name);
	}
}