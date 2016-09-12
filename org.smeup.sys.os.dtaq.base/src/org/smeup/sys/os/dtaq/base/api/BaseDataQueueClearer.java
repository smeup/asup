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
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.dtaq.QDataQueueManager;

@Program(name = "QCLRDTAQ")
public class BaseDataQueueClearer {

	@Inject
	private QDataQueueManager dataQueueManager;
	@Inject
	private QJobCapability jobCapability;

	@Main
	public void main(
			@DataDef(length = 10) QCharacter name, 
			@DataDef(length = 10) QCharacter library, 
			@DataDef(length = 10) QCharacter keyOrder, 
			@DataDef(precision = 5, packed = true) QDecimal dataLength, 
			QPointer data,
			ErrorCode errorCode) {
		
		dataQueueManager.clearDataQueue(jobCapability, library.trimR(), name.trimR());
	}
	
	public static class ErrorCode extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;

		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary bytesProvided;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary bytesAvailable;
		@DataDef(length = 7)
		public QCharacter exceptionName;
		@DataDef(length = 1)
		public QCharacter reserved01;
	}
	
}
