/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.file.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QDatabaseFileField;
import org.smeup.sys.os.file.QDatabaseFileFormat;
import org.smeup.sys.os.file.QDatabaseFileFormatDef;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QOperatingSystemFileFactory;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.lib.QLibrary;

@Program(name = "QDDCPF")
public @ToDo class PhysicalFileCreator {
	public static enum QCPFMSG {
		CPF5813, //Il file &1 già esiste in &2
		CPF3204, //Non è possibile trovare l'oggetto necessario per il file &1 in &2
	}

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;
	
	public @Main void main(@Supported @DataDef(qualified = true) FILE file, @ToDo @DataDef(qualified = true) SOURCEFILE sourceFile,
			@ToDo @DataDef(length = 10) QEnum<SOURCEMEMBEREnum, QCharacter> sourceMember, @Supported @DataDef(binaryType = BinaryType.SHORT) QBinary recordLengthIfNoDDS,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QBinary generationSeverityLevel, @ToDo @DataDef(binaryType = BinaryType.SHORT) QBinary flaggingSeverityLevel,
			@ToDo @DataDef(length = 1) QEnum<FILETYPEEnum, QCharacter> fileType, @ToDo @DataDef(length = 10) QEnum<MEMBERIFDESIREDEnum, QCharacter> memberIfDesired,
			@ToDo @DataDef(length = 1) QEnum<USERSPECIFIEDDBCSDATAEnum, QCharacter> userSpecifiedDBCSData, @ToDo @DataDef(length = 50) QEnum<TEXTDESCRIPTIONEnum, QCharacter> textDescription,
			@ToDo @DataDef(dimension = 4, binaryType = BinaryType.SHORT) QEnum<SOURCELISTINGOPTIONSEnum, QScroller<QBinary>> sourceListingOptions,
			@ToDo @DataDef(length = 1) QEnum<SYSTEMEnum, QCharacter> system, @ToDo @DataDef(datetimeType = DatetimeType.DATE) QEnum<EXPIRATIONDATEFORMEMBEREnum, QDatetime> expirationDateForMember,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<MAXIMUMMEMBERSEnum, QBinary> maximumMembers, @ToDo @DataDef(length = 1) QEnum<ACCESSPATHSIZEEnum, QCharacter> accessPathSize,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<ACCESSPATHLOGICALPAGESIZEEnum, QBinary> accessPathLogicalPageSize,
			@ToDo @DataDef(length = 1) QEnum<ACCESSPATHMAINTENANCEEnum, QCharacter> accessPathMaintenance, @ToDo @DataDef(length = 1) QEnum<ACCESSPATHRECOVERYEnum, QCharacter> accessPathRecovery,
			@ToDo @DataDef(length = 1) QEnum<FORCEKEYEDACCESSPATHEnum, QCharacter> forceKeyedAccessPath, @ToDo MEMBERSIZE memberSize,
			@ToDo @DataDef(length = 1) QEnum<ALLOCATESTORAGEEnum, QCharacter> allocateStorage, @ToDo @DataDef(length = 1) QEnum<CONTIGUOUSSTORAGEEnum, QCharacter> contiguousStorage,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<PREFERREDSTORAGEUNITEnum, QBinary> preferredStorageUnit,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<RECORDSTOFORCEAWRITEEnum, QBinary> recordsToForceAWrite,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<MAXIMUMFILEWAITTIMEEnum, QBinary> maximumFileWaitTime,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<MAXIMUMRECORDWAITTIMEEnum, QBinary> maximumRecordWaitTime,
			@ToDo @DataDef(length = 1) QEnum<SHAREOPENDATAPATHEnum, QCharacter> shareOpenDataPath,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<MAXDELETEDRECORDSALLOWEDEnum, QBinary> maxDeletedRecordsAllowed,
			@ToDo @DataDef(length = 1) QEnum<REUSEDELETEDRECORDSEnum, QCharacter> reuseDeletedRecords, @ToDo @DataDef(qualified = true) SORTSEQUENCE sortSequence,
			@ToDo @DataDef(length = 10) QEnum<LANGUAGEIDEnum, QCharacter> languageID, @ToDo @DataDef(binaryType = BinaryType.INTEGER) QEnum<CODEDCHARACTERSETIDEnum, QBinary> codedCharacterSetID,
			@ToDo @DataDef(length = 1) QEnum<ALLOWUPDATEOPERATIONEnum, QCharacter> allowUpdateOperation, @ToDo @DataDef(length = 1) QEnum<ALLOWDELETEOPERATIONEnum, QCharacter> allowDeleteOperation,
			@ToDo @DataDef(length = 1) QEnum<RECORDFORMATLEVELCHECKEnum, QCharacter> recordFormatLevelCheck, @ToDo @DataDef(qualified = true) NODEGROUP nodeGroup,
			@ToDo @DataDef(dimension = 300, length = 10) QScroller<QCharacter> partitioningKey, @ToDo @DataDef(length = 10) QEnum<AUTHORITYEnum, QCharacter> authority) {

	
		QResourceWriter<QFile> fileWriter = null;

		String fileNameString = file.name.trimR();
		
		switch (file.library.asEnum()) {
		case CURLIB:
			fileWriter = resourceManager.getResourceWriter(job, QFile.class, Scope.CURRENT_LIBRARY);
			break;
		case OTHER:
			QResourceReader<QLibrary> libraryWriter = resourceManager.getResourceReader(job, QLibrary.class, Scope.SYSTEM_LIBRARY);

			if (!libraryWriter.exists(file.library.asData().trimR()))
				throw exceptionManager.prepareException(job, QCPFMSG.CPF3204, new String[] {fileNameString, file.library.asData().trimR()});
		
			fileWriter = resourceManager.getResourceWriter(job, QFile.class, file.library.asData().trimR());
			break;
		}
		
		if(fileWriter.exists(fileNameString))
			throw exceptionManager.prepareException(job, QCPFMSG.CPF5813, new String[] {fileNameString, file.library.asData().trimR()});
		
		QPhysicalFile qFile = QOperatingSystemFileFactory.eINSTANCE.createPhysicalFile();
		qFile.setName(fileNameString);
		switch (textDescription.asEnum()) {
		case BLANK:
			//Nothing
			break;

		case OTHER:
			qFile.setText(textDescription.asData().trimR());
			break;

		case SRCMBRTXT:
			//TODO
			break;
		}
		
		if (recordLengthIfNoDDS.asInteger() == 0) {
			throw new UnsupportedOperationException("DDS are not yet supported!");		
		}
		
		switch (fileType.asEnum()) {
		case SRC:
			throw new UnsupportedOperationException("SRC files are not yet supported!");					

		case DATA:
			//Nothing
			break;
		}
		
		QDatabaseFileFormat fileFormat =  QOperatingSystemFileFactory.eINSTANCE.createDatabaseFileFormat();
		fileFormat.setName(fileNameString);
		QDatabaseFileFormatDef formatDef = QOperatingSystemFileFactory.eINSTANCE.createDatabaseFileFormatDef();
		QDatabaseFileField field = createCharField(recordLengthIfNoDDS, fileNameString);
		formatDef.getElements().add(field);
		fileFormat.setDefinition(formatDef);
		qFile.setDatabaseFormat(fileFormat);
		
		fileWriter.save(qFile);
	}

	private QDatabaseFileField createCharField(QBinary recordLengthIfNoDDS, String fileNameString) {
		QDatabaseFileField field = QOperatingSystemFileFactory.eINSTANCE.createDatabaseFileField();
		field.setName(fileNameString);
		QUnaryAtomicBufferedDataDef<QCharacter> definition = QIntegratedLanguageDataDefFactory.eINSTANCE.createCharacterDef();
		definition.setLength(recordLengthIfNoDDS.asInteger());		
		field.setDefinition(definition);
		return field;
	}

	public static class FILE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*CURLIB")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			CURLIB, OTHER
		}
	}

	public static class SOURCEFILE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "QDDSSRC")
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum SOURCEMEMBEREnum {
		FILE, OTHER
	}

	public static enum FILETYPEEnum {
		@Special(value = "D")
		DATA, @Special(value = "S")
		SRC
	}

	public static enum MEMBERIFDESIREDEnum {
		FILE, NONE, OTHER
	}

	public static enum USERSPECIFIEDDBCSDATAEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum TEXTDESCRIPTIONEnum {
		SRCMBRTXT, @Special(value = "")
		BLANK, OTHER
	}

	public static enum SOURCELISTINGOPTIONSEnum {
		@Special(value = "1")
		SRC, @Special(value = "2")
		NOSRC, @Special(value = "1")
		SOURCE, @Special(value = "2")
		NOSOURCE, @Special(value = "3")
		LIST, @Special(value = "4")
		NOLIST, @Special(value = "5")
		SECLVL, @Special(value = "6")
		NOSECLVL, @Special(value = "7")
		EVENTF, @Special(value = "8")
		NOEVENTF
	}

	public static enum SYSTEMEnum {
		@Special(value = "L")
		LCL, @Special(value = "R")
		RMT, @Special(value = "F")
		FILETYPE
	}

	public static enum EXPIRATIONDATEFORMEMBEREnum {
		@Special(value = "0000000")
		NONE, OTHER
	}

	public static enum MAXIMUMMEMBERSEnum {
		@Special(value = "0")
		NOMAX, OTHER
	}

	public static enum ACCESSPATHSIZEEnum {
		@Special(value = "1")
		MAX1TB, @Special(value = "0")
		MAX4GB
	}

	public static enum ACCESSPATHLOGICALPAGESIZEEnum {
		@Special(value = "0")
		KEYLEN, NUM_8, NUM_16, NUM_32, NUM_64, NUM_128, NUM_256, NUM_512
	}

	public static enum ACCESSPATHMAINTENANCEEnum {
		@Special(value = "I")
		IMMED, @Special(value = "D")
		DLY, @Special(value = "R")
		REBLD
	}

	public static enum ACCESSPATHRECOVERYEnum {
		@Special(value = "N")
		NO, @Special(value = "A")
		AFTIPL, @Special(value = "S")
		IPL
	}

	public static enum FORCEKEYEDACCESSPATHEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static class MEMBERSIZE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER, value = "100000")
		public QEnum<INITIALNUMBEROFRECORDSEnum, QBinary> initialNumberOfRecords;
		@DataDef(binaryType = BinaryType.SHORT, value = "10000")
		public QBinary incrementNumberOfRecords;
		@DataDef(binaryType = BinaryType.SHORT, value = "100")
		public QBinary maximumIncrements;

		public static enum INITIALNUMBEROFRECORDSEnum {
			@Special(value = "0")
			NOMAX, OTHER
		}
	}

	public static enum ALLOCATESTORAGEEnum {
		@Special(value = "D")
		NO, @Special(value = "I")
		YES
	}

	public static enum CONTIGUOUSSTORAGEEnum {
		@Special(value = "N")
		NO, @Special(value = "C")
		YES
	}

	public static enum PREFERREDSTORAGEUNITEnum {
		@Special(value = "0")
		ANY, @Special(value = "255")
		SSD, OTHER
	}

	public static enum RECORDSTOFORCEAWRITEEnum {
		@Special(value = "0")
		NONE, OTHER
	}

	public static enum MAXIMUMFILEWAITTIMEEnum {
		@Special(value = "0")
		IMMED, @Special(value = "-1")
		CLS, OTHER
	}

	public static enum MAXIMUMRECORDWAITTIMEEnum {
		@Special(value = "-1")
		IMMED, @Special(value = "-2")
		NOMAX, OTHER
	}

	public static enum SHAREOPENDATAPATHEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum MAXDELETEDRECORDSALLOWEDEnum {
		@Special(value = "0")
		NONE, OTHER
	}

	public static enum REUSEDELETEDRECORDSEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static class SORTSEQUENCE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NAMEEnum, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum NAMEEnum {
			SRC, JOB, LANGIDSHR, LANGIDUNQ, HEX, OTHER
		}

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum LANGUAGEIDEnum {
		JOB, OTHER
	}

	public static enum CODEDCHARACTERSETIDEnum {
		@Special(value = "0")
		JOB, @Special(value = "65535")
		HEX, OTHER
	}

	public static enum ALLOWUPDATEOPERATIONEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static enum ALLOWDELETEOPERATIONEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static enum RECORDFORMATLEVELCHECKEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static class NODEGROUP extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NAMEEnum, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum NAMEEnum {
			NONE, OTHER
		}

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum AUTHORITYEnum {
		LIBCRTAUT, ALL, CHANGE, EXCLUDE, USE, OTHER
	}
}
