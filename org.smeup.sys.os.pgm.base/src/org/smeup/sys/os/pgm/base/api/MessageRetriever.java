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
package org.smeup.sys.os.pgm.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QMHRTVMS")
public @Supported class MessageRetriever {

	public static enum QCPFMSG {
		CPF2407 // Message file &1 in &2 not found.
	}

	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QJob job;

	@Main
	public void main(@Supported @DataDef(length = 7) QCharacter messageIdentifier, @Supported @DataDef(qualified = true) MESSAGEFILE messageFile,
			@Supported @DataDef(length = 512) QCharacter messageDataFieldValues, @Supported @DataDef(length = 132) QCharacter cLVarFor1stLevelText,
			@Supported @DataDef(precision = 5, packed = true) QDecimal cLVarForMSGLEN50, @Supported @DataDef(length = 1) QCharacter cLVarFor2ndLevelText,
			@Supported @DataDef(precision = 5, packed = true) QDecimal cLVarForSECLVLLEN50, @Supported @DataDef(precision = 2, packed = true) QDecimal cLVarForSEV20,
			@Unsupported @DataDef(length = 9) QCharacter cLVarForALROPT9, @Unsupported @DataDef(length = 1) QCharacter cLVarForLOGPRB1,
			@Unsupported @DataDef(binaryType = BinaryType.INTEGER) QEnum<CONVERTTOCCSIDEnum, QBinary> convertToCCSID,
			@Unsupported @DataDef(binaryType = BinaryType.INTEGER) QEnum<MESSAGEDATACCSIDEnum, QBinary> messageDataCCSID, @Unsupported @DataDef(precision = 5, packed = true) QDecimal cLVarForTextCCSID50,
			@Unsupported @DataDef(precision = 5, packed = true) QDecimal cLVarForDataCCSID50) {

		OperatingSystemMessageException msgException = exceptionManager.prepareException(job, messageIdentifier.trimR(), messageFile.name.trimR(), messageFile.library.asData().trimR(),
				messageDataFieldValues.trimR().split("\\s+"));

		if (msgException.getSeverity() < 0) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2407, new String[] { messageFile.name.trimR(), messageFile.library.asData().trimR() });
		}

		cLVarFor1stLevelText.eval(msgException.getMessageText());
		cLVarForMSGLEN50.eval(msgException.getMessageText().length());

		cLVarFor2ndLevelText.eval(msgException.getMessageText());
		cLVarForSECLVLLEN50.eval(msgException.getMessageText().length());

		cLVarForSEV20.eval(msgException.getSeverity());
	}

	public static class MESSAGEFILE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum CONVERTTOCCSIDEnum {
		@Special(value = "65535") HEX, @Special(value = "0") JOB, OTHER
	}

	public static enum MESSAGEDATACCSIDEnum {
		@Special(value = "65535") HEX, @Special(value = "0") JOB, OTHER
	}
}
