package org.smeup.sys.os.file.base.api;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.QStroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.file.QFile;

@Program(name = "QCPEX0FL")
public @ToDo class FileCopier {
	public static enum QCPFMSG {
	}

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;
	
	public @Entry void main(
			@Supported @DataDef(qualified = true) FROMFILE fromFile,
			@Supported @DataDef(qualified = true) TOFILE toFile,
			@Supported @DataDef(length = 10) QEnum<FROMMEMBEREnum, QCharacter> fromMember,
			@Supported @DataDef(length = 10) QEnum<TOMEMBERORLABELEnum, QCharacter> toMemberOrLabel,
			@Supported @DataDef(length = 1) QEnum<REPLACEORADDRECORDSEnum, QCharacter> replaceOrAddRecords,
			@Supported @DataDef(length = 1) QEnum<CREATEFILEEnum, QCharacter> createFile,
			@Unsupported @DataDef(length = 1) QEnum<PRINTFORMATEnum, QCharacter> printFormat,
			@Unsupported @DataDef(dimension = 3, length = 1) QEnum<WHICHRECORDSTOPRINTEnum, QScroller<QCharacter>> whichRecordsToPrint,
			@ToDo @DataDef(length = 10) QEnum<RECORDFORMATOFLOGICALFILEEnum, QCharacter> recordFormatOfLogicalFile,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QEnum<COPYFROMRECORDNUMBEREnum, QBinary> copyFromRecordNumber,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QEnum<COPYTORECORDNUMBEREnum, QBinary> copyToRecordNumber,
			@ToDo COPYFROMRECORDKEY copyFromRecordKey,
			@ToDo COPYTORECORDKEY copyToRecordKey,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QEnum<NUMBEROFRECORDSTOCOPYEnum, QBinary> numberOfRecordsToCopy,
			@ToDo INCLUDERECORDSBYCHARTEST includeRecordsByCharTest,
			@ToDo @DataDef(dimension = 50) QStroller<INCLUDERECORDSBYFIELDTEST> includeRecordsByFieldTest,
			@ToDo @DataDef(dimension = 2, length = 1) QEnum<RECORDFORMATFIELDMAPPINGEnum, QScroller<QCharacter>> recordFormatFieldMapping,
			@ToDo @DataDef(dimension = 2, length = 1) QEnum<SOURCEUPDATEOPTIONSEnum, QScroller<QCharacter>> sourceUpdateOptions,
			@ToDo SOURCESEQUENCENUMBERING sourceSequenceNumbering,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QEnum<ERRORSALLOWEDEnum, QBinary> errorsAllowed,
			@ToDo @DataDef(length = 1) QEnum<COMPRESSOUTDELETEDRECORDSEnum, QCharacter> compressOutDeletedRecords) {

		
		QResourceReader<QFile> fileReader = writerFor(fromFile.library);
		
		QFile qFileFrom = fileReader.lookup(fromFile.name.trimR());
		if(qFileFrom == null)
			throw new OperatingSystemRuntimeException("File " + fromFile.name.trimR() + " not found in library " + fromFile.library.asData());
		
		//
		if (toFile.name.asEnum().equals(TOFILE.NAMEEnum.PRINT)) {
			//TODO
			//Something like: objectWriter = outputManager.getObjectWriter(job.getContext(), "P");
			throw new UnsupportedOperationException("CPYF on a printer file in not yet supported");
		}		
		//
		QResourceWriter<QFile> fileWriter = writerFor(toFile.library);
		String toFileName = toFile.name.asData().trimR();
		QFile qFileTo = fileWriter.lookup(toFileName);
		
		if(qFileTo == null && createFile.asEnum().equals(CREATEFILEEnum.NO)) {
			throw new OperatingSystemRuntimeException("File " + toFileName + " not found in library " + toFile.library.asData() + " and CRTFILE = *NO");
		}

		//
		copy(qFileFrom, fileReader, toFileName, qFileTo, fileWriter);		
		//
		//TODO
		throw new UnsupportedOperationException("TODO");
		//
	}

	private void copy(QFile qFileFrom, QResourceReader<QFile> fileReader, String toFileName, QFile qFileTo, QResourceWriter<QFile> fileWriter) {
		if (qFileTo == null) {
			qFileTo = (QFile) EcoreUtil.copy((EObject)qFileFrom);
			qFileTo.setName(toFileName);
			fileWriter.save(qFileTo);
			jobLogManager.info(job, "File " + toFileName + " created in library " + qFileTo.getLibrary());
		}
		
//		new DataDuplicator(job).duplicateData(qFileFrom, qFileTo);
	}

	private QResourceWriter<QFile> writerFor(QEnum<LIBRARYEnum, QCharacter> lib) {
		switch (lib.asEnum()) {
		case CURLIB:
			return resourceManager.getResourceWriter(job, QFile.class, Scope.CURRENT_LIBRARY);
		case LIBL:
			return resourceManager.getResourceWriter(job, QFile.class, Scope.LIBRARY_LIST);
		case OTHER:
			return resourceManager.getResourceWriter(job, QFile.class, lib.asData().trimR());
		}
		throw new RuntimeException("Unknown library type " + lib);
	}


	public static enum LIBRARYEnum {
		LIBL , 
		CURLIB, 
		OTHER;
	}
	
	public static class FROMFILE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10)
		public QEnum<LIBRARYEnum, QCharacter> library;
	}

	public static class TOFILE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NAMEEnum, QCharacter> name;
		@DataDef(length = 10)
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum NAMEEnum {
			@Special(value = "*LIST")
			PRINT, OTHER
		}
	}

	public static enum FROMMEMBEREnum {
		@Special(value = "*N")
		FIRST, ALL, OTHER
	}

	public static enum TOMEMBERORLABELEnum {
		@Special(value = "*N")
		FIRST, FROMMBR, ALL, OTHER
	}

	public static enum REPLACEORADDRECORDSEnum {
		@Special(value = "N")
		NONE, @Special(value = "A")
		ADD, @Special(value = "R")
		REPLACE, @Special(value = "U")
		UPDADD
	}

	public static enum CREATEFILEEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum PRINTFORMATEnum {
		@Special(value = "C")
		CHAR, @Special(value = "H")
		HEX
	}

	public static enum WHICHRECORDSTOPRINTEnum {
		@Special(value = "N") NONE, 
		@Special(value = "E") EXCLD, 
		@Special(value = "C") COPIED, 
		@Special(value = "R") ERROR
	}

	public static enum RECORDFORMATOFLOGICALFILEEnum {
		ONLY, ALL, OTHER
	}

	public static enum COPYFROMRECORDNUMBEREnum {
		@Special(value = "0")
		START, OTHER
	}

	public static enum COPYTORECORDNUMBEREnum {
		@Special(value = "0")
		END, OTHER
	}

	public static class COPYFROMRECORDKEY extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.SHORT)
		public QEnum<NUMBEROFKEYFIELDSEnum, QBinary> numberOfKeyFields;
		@DataDef(dimension = 50, length = 256)
		public QScroller<QCharacter> keyValue;

		public static enum NUMBEROFKEYFIELDSEnum {
			@Special(value = "0")
			NONE, @Special(value = "-1")
			BLDKEY, OTHER
		}
	}

	public static class COPYTORECORDKEY extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.SHORT)
		public QEnum<NUMBEROFKEYFIELDSEnum, QBinary> numberOfKeyFields;
		@DataDef(dimension = 50, length = 256)
		public QScroller<QCharacter> keyValue;

		public static enum NUMBEROFKEYFIELDSEnum {
			@Special(value = "0")
			NONE, @Special(value = "-1")
			BLDKEY, OTHER
		}
	}

	public static enum NUMBEROFRECORDSTOCOPYEnum {
		@Special(value = "0")
		END, OTHER
	}

	public static class INCLUDERECORDSBYCHARTEST extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<FIELDEnum, QCharacter> field;
		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary characterPosition;
		@DataDef(binaryType = BinaryType.SHORT)
		public QEnum<RELATIONALOPERATOREnum, QBinary> relationalOperator;
		@DataDef(length = 256)
		public QCharacter value;

		public static enum FIELDEnum {
			NONE, RCD, @Special(value = "*RCD")
			FLD, OTHER
		}

		public static enum RELATIONALOPERATOREnum {
			@Special(value = "2")
			EQ, @Special(value = "1")
			GT, @Special(value = "4")
			LT, @Special(value = "5")
			NE, @Special(value = "3")
			GE, @Special(value = "3")
			NL, @Special(value = "6")
			LE, @Special(value = "6")
			NG, @Special(value = "7")
			CT
		}
	}

	public static class INCLUDERECORDSBYFIELDTEST extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1)
		public QEnum<RELATIONSHIPEnum, QCharacter> relationship;
		@DataDef(length = 10)
		public QCharacter field;
		@DataDef(binaryType = BinaryType.SHORT)
		public QEnum<RELATIONALOPERATOREnum, QBinary> relationalOperator;
		@DataDef(length = 256)
		public QEnum<VALUEEnum, QCharacter> value;

		public static enum RELATIONSHIPEnum {
			@Special(value = "N")
			NONE, @Special(value = "I")
			IF, @Special(value = "A")
			AND, @Special(value = "O")
			OR
		}

		public static enum RELATIONALOPERATOREnum {
			@Special(value = "2")
			EQ, @Special(value = "1")
			GT, @Special(value = "4")
			LT, @Special(value = "5")
			NE, @Special(value = "3")
			GE, @Special(value = "3")
			NL, @Special(value = "6")
			LE, @Special(value = "6")
			NG
		}

		public static enum VALUEEnum {
			NULL, OTHER
		}
	}

	public static enum RECORDFORMATFIELDMAPPINGEnum {
		@Special(value = "N")
		NONE, @Special(value = "X")
		NOCHK, @Special(value = "C")
		CVTSRC, @Special(value = "M")
		MAP, @Special(value = "D")
		DROP, @Special(value = "F")
		CVTFLOAT, @Special(value = "L")
		NULLFLAGS
	}

	public static enum SOURCEUPDATEOPTIONSEnum {
		@Special(value = "S")
		SAME, @Special(value = "N")
		SEQNBR, @Special(value = "D")
		DATE
	}

	public static class SOURCESEQUENCENUMBERING extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(precision = 6, scale = 2)
		public QDecimal startingSequenceNumber;
		@DataDef(precision = 6, scale = 2)
		public QDecimal incrementNumber;
	}

	public static enum ERRORSALLOWEDEnum {
		@Special(value = "4294967295")
		NOMAX, OTHER
	}

	public static enum COMPRESSOUTDELETEDRECORDSEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}
}
