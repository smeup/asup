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

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberManager;
import org.smeup.sys.os.file.QFileMembered;

@Program(name = "QWHRMBRD")
public class MemberDescriptionRetriever {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QFileMemberManager fileMemberManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;

	public static enum QCPFMSG {
		CPF3018, CPF3019, CPF3027, CPF3038, CPF3039, CPF3049, CPF3051, CPF325F, CPF327B, CPF8109, CPF8110, CPF8111, CPF9803, CPF9806, CPF9810, CPF9812, CPF9815, CPF9820, CPF9822
	}

	@Main
	public void main(@DataDef(qualified = true) FILE file, MEMBER member, @DataDef(length = 4) QCharacter cLVarForRTNSYSTEM4, @DataDef(length = 10) QCharacter cLVarForRTNLIB10,
			@DataDef(length = 10) QCharacter cLVarForRTNMBR10, @DataDef(length = 3) QCharacter cLVarForFILEATR3, @DataDef(length = 5) QCharacter cLVarForFILETYPE5,
			@DataDef(length = 10) QCharacter cLVarForSRCTYPE10, @DataDef(length = 13) QCharacter cLVarForSRCCHGDATE13, @DataDef(length = 13) QCharacter cLVarForCRTDATE13,
			@DataDef(length = 7) QCharacter cLVarForEXPDATE7, @DataDef(length = 50) QCharacter cLVarForTEXT50, @DataDef(precision = 10, packed = true) QDecimal cLVarForNBRCURRCD100,
			@DataDef(precision = 10, packed = true) QDecimal cLVarForNBRDLTRCD100, @DataDef(length = 4) QCharacter cLVarForSHARE4,
			@DataDef(length = 1, varying = true) QCharacter cLVarForDTASPCSIZ150, @DataDef(length = 1, varying = true) QCharacter cLVarForACCPTHSIZ120,
			@DataDef(length = 13) QCharacter cLVarForCHGDATE13, @DataDef(length = 13) QCharacter cLVarForSAVDATE13, @DataDef(length = 13) QCharacter cLVarForRSTDATE13,
			@DataDef(precision = 2, packed = true) QDecimal cLVarForNBRDTAMBRS20, @DataDef(length = 7) QCharacter cLVarForUSEDATE7,
			@DataDef(precision = 5, packed = true) QDecimal cLVarForUSECOUNT50, @DataDef(length = 7) QCharacter cLVarForRESETDATE7) {

		QResourceReader<QFile> fileReader = resourceManager.getResourceReader(job, QFile.class, file.library.asEnum(), file.library.asData().trimR());
		QFile qFile = fileReader.lookup(file.name.trimR());
		if (qFile == null)
			throw exceptionManager.prepareException(job, QCPFMSG.CPF3051, file);
		if (!(qFile instanceof QFileMembered))
			throw exceptionManager.prepareException(job, QCPFMSG.CPF327B, file);
		QFileMembered fileMembered = (QFileMembered) qFile;
		QFileMember fileMember = null;

		switch (member.referenceMember.asEnum()) {
		case FIRST:
			break;
		case FIRSTMBR:
			break;
		case LAST:
			break;
		case LASTMBR:
			break;
		case OTHER:
			fileMember = fileMemberManager.lookup(job, fileMembered, member.referenceMember.asData().trimR());
			break;
		}
		if (fileMember == null)
			throw exceptionManager.prepareException(job, QCPFMSG.CPF3018, member.referenceMember.asData().trimR());
		
		cLVarForSRCTYPE10.eval(fileMember.getType());
		cLVarForTEXT50.eval(fileMember.getText());
		
	}

	public static class FILE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<Scope, QCharacter> library;
	}

	public static class MEMBER extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<REFERENCEMEMBEREnum, QCharacter> referenceMember;
		@DataDef(length = 5, value = "*SAME")
		public QEnum<RELATIONSHIPEnum, QCharacter> relationship;

		public static enum REFERENCEMEMBEREnum {
			FIRST, LAST, FIRSTMBR, LASTMBR, OTHER
		}

		public static enum RELATIONSHIPEnum {
			SAME, NEXT, PRV
		}
	}
}
