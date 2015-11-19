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
package org.smeup.sys.os.dtaq.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.dtaq.DataQueueType;
import org.smeup.sys.os.dtaq.QDataQueueManager;
import org.smeup.sys.os.dtaq.base.data.DataQueue;
import org.smeup.sys.os.dtaq.base.data.QueueSize;
import org.smeup.sys.os.dtaq.base.data.RemoteDataQueue;

@Program(name = "QMHQCRTQ")
public class BaseDataQueueCreator {

	@Inject
	private QDataQueueManager dataQueueManager;
	@Inject
	private QJob job;

	@Main
	public void main(@DataDef() DataQueue dataQueue,
			@DataDef(length = 1) QCharacter type,
			@DataDef() QBinary maximumEntryLength,
			@DataDef(length = 1) QCharacter forceToAuxiliaryStorage,
			@DataDef(length = 1) QCharacter sequence,
			@DataDef() QBinary keyLength,
			@DataDef(length = 1) QCharacter includeSenderID,
			@DataDef() QueueSize queueSize,
			@DataDef(length = 1) QCharacter automaticReclaim,
			@DataDef() RemoteDataQueue remoteDataQueue,
			@DataDef(length = 8) QCharacter remoteLocation,
			@DataDef(length = 18) QCharacter relationalDatabase,
			@DataDef(length = 10) QCharacter aPPCDeviceDescription,
			@DataDef(length = 8) QCharacter localLocation,
			@DataDef(length = 8) QCharacter mode,
			@DataDef(length = 8) QCharacter remoteNetworkIdentifier,
			@DataDef(length = 50) QCharacter textDescription,
			@DataDef(length = 10) QCharacter authority) {

		dataQueueManager.createDataQueue(job.getJobID(),
				dataQueue.library.trimR(), dataQueue.name.trimR(),
				DataQueueType.FIFO, maximumEntryLength.asInteger());
	}
}