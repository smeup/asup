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
package org.smeup.sys.os.dtaq.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.dtaq.DataQueueSequence;
import org.smeup.sys.os.dtaq.QDataQueue;
import org.smeup.sys.os.dtaq.QOperatingSystemDataQueueFactory;
import org.smeup.sys.os.dtaq.base.data.DataQueue;
import org.smeup.sys.os.dtaq.base.data.QueueSize;
import org.smeup.sys.os.dtaq.base.data.RemoteDataQueue;

@Program(name = "QMHQCRTQ")
public class BaseDataQueueCreator {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QJob job;


	public static enum QCPFMSG {
		CPF9870;
	}
	@Main
	public void main(@DataDef() DataQueue dataQueue, @DataDef(length = 1) QCharacter type, @DataDef() QBinary maximumEntryLength, @DataDef(length = 1) QCharacter forceToAuxiliaryStorage,
			@DataDef(length = 1) QEnum<DataQueueSequenceEnum, QCharacter> sequence, @DataDef() QBinary keyLength, @DataDef(length = 1) QCharacter includeSenderID, @DataDef() QueueSize queueSize,
			@DataDef(length = 1) QCharacter automaticReclaim, @DataDef() RemoteDataQueue remoteDataQueue, @DataDef(length = 8) QCharacter remoteLocation,
			@DataDef(length = 18) QCharacter relationalDatabase, @DataDef(length = 10) QCharacter aPPCDeviceDescription, @DataDef(length = 8) QCharacter localLocation,
			@DataDef(length = 8) QCharacter mode, @DataDef(length = 8) QCharacter remoteNetworkIdentifier, @DataDef(length = 50) QCharacter textDescription,
			@DataDef(length = 10) QCharacter authority) {

		QResourceWriter<QDataQueue> resource = resourceManager.getResourceWriter(job, QDataQueue.class, dataQueue.library.trimR());
		QDataQueue qDataQueue = resource.lookup(dataQueue.name.trimR());
		if (qDataQueue != null)
			throw exceptionManager.prepareException(job, QCPFMSG.CPF9870, dataQueue);

		qDataQueue = QOperatingSystemDataQueueFactory.eINSTANCE.createDataQueue();
		qDataQueue.setName(dataQueue.name.trimR());
		
		switch (sequence.asEnum()) {
		case FIFO:
			qDataQueue.setSequence(DataQueueSequence.FIFO);
			break;
		case KEYED:
			qDataQueue.setSequence(DataQueueSequence.KEYED);
			break;
		case LIFO:
			qDataQueue.setSequence(DataQueueSequence.LIFO);
			break;
		}
		qDataQueue.setMaxEntryLength(maximumEntryLength.asInteger());
		qDataQueue.setKeyLength(keyLength.asInteger());
		qDataQueue.setText(textDescription.trimR());				

		resource.save(qDataQueue);
	}
	
	public static enum DataQueueSequenceEnum {
		@Special(value = "F")
		FIFO, 
		@Special(value = "L")		
		LIFO, 
		@Special(value = "K")
		KEYED
	}

}