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

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.data.def.TimeFormat;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;

@Program(name = "QDBCHGME")
public @ToDo class PhysicalFileChanger {
	public static enum QCPFMSG {
		CPF3288
	}

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;

	@Main
	public void main(@ToDo @DataDef(qualified = true) FileRef file, @ToDo @DataDef(length = 10) QEnum<MEMBEREnum, QCharacter> member,
			@ToDo @DataDef(length = 10) QEnum<SOURCETYPEEnum, QCharacter> sourceType,
			@ToDo @DataDef(datetimeType = DatetimeType.DATE, dateFormat = DateFormat.MDY, timeFormat = TimeFormat.HMS) QEnum<EXPIRATIONDATEFORMEMBEREnum, QDatetime> expirationDateForMember,
			@ToDo @DataDef(length = 1) QEnum<SHAREOPENDATAPATHEnum, QCharacter> shareOpenDataPath, @ToDo @DataDef(length = 50) QEnum<TEXTDESCRIPTIONEnum, QCharacter> textDescription,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<PREFERREDSTORAGEUNITEnum, QBinary> preferredStorageUnit) {

		QResourceReader<QFile> fileReader = resourceManager.getResourceReader(job, QFile.class, file.library.asEnum(), file.library.asData().trimR());
		QFile qFile = fileReader.lookup(file.name.trimR());

		if (qFile == null)
			throw exceptionManager.prepareException(job, QCPFMSG.CPF3288, file);

	}

	public static enum MEMBEREnum {
		FIRST, OTHER
	}

	public static enum SOURCETYPEEnum {
		SAME, @Special(value = "X'40'") NONE, OTHER
	}

	public static enum EXPIRATIONDATEFORMEMBEREnum {
		@Special(value = "0030000") SAME, @Special(value = "0000000") NONE, OTHER
	}

	public static enum SHAREOPENDATAPATHEnum {
		@Special(value = "S") SAME, @Special(value = "Y") YES, @Special(value = "N") NO
	}

	public static enum TEXTDESCRIPTIONEnum {
		SAME, @Special(value = "") BLANK, OTHER
	}

	public static enum PREFERREDSTORAGEUNITEnum {
		@Special(value = "-1") SAME, @Special(value = "0") ANY, @Special(value = "255") SSD
	}
}
