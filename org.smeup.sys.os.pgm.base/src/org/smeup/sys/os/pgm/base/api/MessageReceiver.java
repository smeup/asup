/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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

import org.smeup.sys.dk.core.annotation.ToDo;
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
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QMHRCVMS")
public @ToDo class MessageReceiver {
	
	@Inject
	private QJob job;
	
	public static enum QCPFMSG {
	}

	public @Main void main(
			CALLSTACKENTRYMESSAGEQUEUE callStackEntryMessageQueue,
			@ToDo @DataDef(qualified = true) MESSAGEQUEUE messageQueue,
			@ToDo @DataDef(length = 4) QEnum<MESSAGETYPEEnum, QCharacter> messageType,
			@DataDef(length = 4) QEnum<MESSAGEKEYEnum, QCharacter> messageKey,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QEnum<WAITTIMEEnum, QBinary> waitTime,
			@ToDo @DataDef(length = 1) QEnum<REMOVEMESSAGEEnum, QCharacter> removeMessage,
			@DataDef(binaryType = BinaryType.INTEGER) QEnum<CODEDCHARACTERSETIDEnum, QBinary> codedCharacterSetID,
			@DataDef(length = 1) QEnum<REJECTDEFAULTREPLYEnum, QCharacter> rejectDefaultReply,
			@ToDo @DataDef(length = 4) QCharacter cLVarForKEYVAR4,
			@ToDo @DataDef(length = 1) QCharacter cLVarFor1stLevelText,
			@ToDo @DataDef(precision = 5) QDecimal cLVarForMSGLEN50,
			@ToDo @DataDef(length = 1) QCharacter cLVarFor2ndLevelText,
			@ToDo @DataDef(precision = 5) QDecimal cLVarForSECLVLLEN50,
			@ToDo @DataDef(length = 1024, varying = true) QCharacter cLVarForMsgData,
			@ToDo @DataDef(precision = 5) QDecimal cLVarForMSGDTALEN50,
			@ToDo @DataDef(length = 7) QCharacter cLVarForMSGID7,
			@ToDo @DataDef(precision = 2) QDecimal cLVarForSEV20,
			@ToDo @DataDef(length = 80) QCharacter cLVarForSENDER80,
			@DataDef(length = 1) QEnum<SENDERFORMATEnum, QCharacter> senderFormat,
			@ToDo @DataDef(length = 2) QCharacter cLVarForRTNTYPE2,
			@ToDo @DataDef(length = 9) QCharacter cLVarForALROPT9,
			@ToDo @DataDef(length = 10) QCharacter cLVarForMSGF10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForMSGFLIB10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForSNDMSGFLIB10,
			@DataDef(precision = 5) QDecimal cLVarForTextCCSID50,
			@DataDef(precision = 5) QDecimal cLVarForDataCCSID50) {
		
		
		String lastMessage = job.getMessages().get(job.getMessages().size()-1); 
		cLVarForMsgData.eval("                    "+lastMessage+"              ");
	}

	public static class CALLSTACKENTRYMESSAGEQUEUE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 4, value = "*SAME")
		public QEnum<RELATIONSHIPEnum, QCharacter> relationship;
		public CALLSTACKENTRYMESSAGEQUEUE.CALLSTACKENTRYIDENTIFIER callStackEntryIdentifier;

		public static enum RELATIONSHIPEnum {
			EXT, @Special(value = "SAME")
			SAME, @Special(value = "PREV")
			PRV
		}

		public static class CALLSTACKENTRYIDENTIFIER extends QDataStructWrapper {
			private static final long serialVersionUID = 1L;
			@DataDef(length = 256, value = "*")
			public QEnum<CALLSTACKENTRYEnum, QCharacter> callStackEntry;
			@DataDef(length = 10, value = "*NONE")
			public QEnum<MODULEEnum, QCharacter> module;
			@DataDef(length = 10, value = "*NONE")
			public QEnum<BOUNDPROGRAMEnum, QCharacter> boundProgram;

			public static enum CALLSTACKENTRYEnum {
				@Special(value = "*")
				TERM_STAR, OTHER
			}

			public static enum MODULEEnum {
				NONE, OTHER
			}

			public static enum BOUNDPROGRAMEnum {
				NONE, OTHER
			}
		}
	}

	public static class MESSAGEQUEUE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NAMEEnum, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum NAMEEnum {
			PGMQ, OTHER
		}

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum MESSAGETYPEEnum {
		@Special(value = "ANY")
		ANY, @Special(value = "NEXT")
		NEXT, @Special(value = "PREV")
		PRV, @Special(value = "INFO")
		INFO, @Special(value = "INQ")
		INQ, @Special(value = "RPY")
		RPY, @Special(value = "FRST")
		FIRST, @Special(value = "SCPY")
		COPY, @Special(value = "COMP")
		COMP, @Special(value = "DIAG")
		DIAG, @Special(value = "EXCP")
		EXCP, @Special(value = "RQS")
		RQS, @Special(value = "LAST")
		LAST
	}

	public static enum MESSAGEKEYEnum {
		@Special(value = "X'FFFFFFFF'")
		NONE, @Special(value = "X'00000000'")
		TOP, OTHER
	}

	public static enum WAITTIMEEnum {
		@Special(value = "-1")
		MAX, OTHER
	}

	public static enum REMOVEMESSAGEEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO, @Special(value = "K")
		KEEPEXCP
	}

	public static enum CODEDCHARACTERSETIDEnum {
		@Special(value = "65535")
		HEX, @Special(value = "0")
		JOB, OTHER
	}

	public static enum REJECTDEFAULTREPLYEnum {
		@Special(value = "N")
		NOALWRJT, @Special(value = "Y")
		ALWRJT
	}

	public static enum SENDERFORMATEnum {
		@Special(value = "S")
		SHORT, @Special(value = "L")
		LONG
	}
}