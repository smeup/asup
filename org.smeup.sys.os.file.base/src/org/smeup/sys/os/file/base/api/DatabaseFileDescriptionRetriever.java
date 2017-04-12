/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Giuliano Giancristofaro - Initial API and implementation
 */
package org.smeup.sys.os.file.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;

@Program(name = "QDBRTVFD")
public class DatabaseFileDescriptionRetriever {

	
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;
	
	@Main
	public void main(QPointer receiverVariable, 
			@DataDef(binaryType = BinaryType.INTEGER) QBinary lengthReceiverVariable, 
			@DataDef(length = 20) QCharacter qualifiedReturnedFileName,
			@DataDef(length = 8) QCharacter formatName, 
			FileRef qualifiedFileName, 
			@DataDef(length = 10) QCharacter recordFormatName,
			@DataDef(length = 1) QCharacter overridingProcesing, 
			@DataDef(length = 10) QCharacter system, 
			@DataDef(length = 10) QCharacter formatType, 
			ErrorCode errorCode) {

		"".toCharArray();
		jobLogManager.error(job, "***TODO*** Implement API - QDBRTVFD - DatabaseFileDescriptionRetriever");
		System.err.println("***TODO*** Implement API - QDBRTVFD - DatabaseFileDescriptionRetriever");

	}

	public static class ErrorCode extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER, value = "272")
		public QBinary £$01e1;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary £$01e2;
		@DataDef(length = 7)
		public QCharacter £$01e3;
		@DataDef(length = 1)
		public QCharacter £$01e4;
		@DataDef(length = 256)
		public QCharacter £$01e5;
	}
}