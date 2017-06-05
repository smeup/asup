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
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.dtaq.QDataQueue;
import org.smeup.sys.os.dtaq.base.data.DataQueue;

@Program(name = "QMHQRDQD")
public class BaseDataQueueDescription {

	public static enum QCPFMSG {
		CPF9801;
	}

	public static enum FORMATEnum {
		RDQD0100, RDQD0200;
	}
	
	
	public RDQD0100 rdqd0100;
	
	@Inject
	private QJob job;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QExceptionManager exceptionManager;
	
	@Main
	public void main(@DataDef(length = 6000) QCharacter receiverVariable, 
			@DataDef(binaryType = BinaryType.INTEGER) QBinary lengthVariable,
			@DataDef(length = 8) QEnum<FORMATEnum, QCharacter> formatName, 
			DataQueue dataQueue) {
		
		rdqd0100.clear();
		QResourceReader<QDataQueue> dataQueueReader = resourceManager.getResourceReader(job, QDataQueue.class, Scope.ALL, dataQueue.library.trimR());
		QDataQueue dataQ = dataQueueReader.lookup(dataQueue.name.trimR());
		if(dataQ == null)
			throw exceptionManager.prepareException(job, QCPFMSG.CPF9801, new String[] { dataQueue.library.trimR() });
		
		
		rdqd0100.byteReturned.eval(rdqd0100.getLength());
		rdqd0100.bytesAvailable.eval(rdqd0100.getLength());
		rdqd0100.messageLength.eval(dataQ.getMaxEntryLength());
//		rdqd0100.messageLength.eval(31000);
		rdqd0100.keyLength.eval(dataQ.getKeyLength());
		
		switch (dataQ.getSequence()) {
		case FIFO:
			rdqd0100.sequence.eval("F");
			break;
		case KEYED:
			rdqd0100.sequence.eval("K");
			break;
		case LIFO:
			rdqd0100.sequence.eval("L");
			break;
		}
		
		rdqd0100.includeSenderId.eval("N");
		rdqd0100.forceIndicator.eval("N");
		rdqd0100.textDescription.eval(dataQ.getText());
		rdqd0100.typeData.eval("0");
		rdqd0100.numberOfMessage.eval(1);
		rdqd0100.numberOfEntries.eval(16);
		rdqd0100.dataQueueName.eval(dataQueue.name.trimR());
		rdqd0100.dataQueueLibrary.eval(dataQueue.library.trimR());
		
		receiverVariable.eval(rdqd0100);
		
		}
	
	
	public static class RDQD0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary byteReturned;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary bytesAvailable;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary messageLength;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary keyLength;
		@DataDef(length = 1)
		public QCharacter sequence;
		@DataDef(length = 1)
		public QCharacter includeSenderId;
		@DataDef(length = 1)
		public QCharacter forceIndicator;
		@DataDef(length = 50)
		public QCharacter textDescription;
		@DataDef(length = 1)
		public QCharacter typeData;
		@DataDef(length = 1)
		public QCharacter fill_1;
		@DataDef(length = 1)
		public QCharacter fill_2;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary numberOfMessage;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary numberOfEntries;
		@DataDef(length = 10)
		public QCharacter dataQueueName;
		@DataDef(length = 10)
		public QCharacter dataQueueLibrary;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary maximunNumberOfEntries;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary initialNumberOfEntries;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary maximunNumberOfEntriesSpec;
	
	}
	
	
	
	}