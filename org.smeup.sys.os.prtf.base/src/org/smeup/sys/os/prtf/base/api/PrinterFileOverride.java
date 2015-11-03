package org.smeup.sys.os.prtf.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QFileOverride;
import org.smeup.sys.os.file.QOperatingSystemFileFactory;
import org.smeup.sys.os.file.QPrinterFile;
					
@Program(name = "QDMOVRPR")
public @Supported class PrinterFileOverride {
	public static enum QCPFMSG {
		CPD5801
	}
	
	@Inject
	private QFileManager fileManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;


	public @Main void main(
			@DataDef(length = 10) QEnum<FILEBEINGOVERRIDDENEnum, QCharacter> fileBeingOverridden,
			@DataDef(qualified = true) OVERRIDINGTOPRINTERFILE overridingToPrinterFile,
			@ToDo DEVICE device,
			@DataDef(length = 1) QEnum<PRINTERDEVICETYPEEnum, QCharacter> printerDeviceType,
			@ToDo PAGESIZE pageSize,
			@ToDo @DataDef(precision = 3, scale = 1) QEnum<LINESPERINCHEnum, QDecimal> linesPerInch,
			@ToDo @DataDef(precision = 3, scale = 1) QEnum<CHARACTERSPERINCHEnum, QDecimal> charactersPerInch,
			FRONTMARGIN frontMargin,
			BACKMARGIN backMargin,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QBinary overflowLineNumber,
			@DataDef(length = 1) QEnum<FOLDRECORDSEnum, QCharacter> foldRecords,
			UNPRINTABLECHARACTERACTION unprintableCharacterAction,
			@DataDef(length = 1) QEnum<ALIGNPAGEEnum, QCharacter> alignPage,
			@DataDef(binaryType = BinaryType.SHORT) QEnum<SOURCEDRAWEREnum, QBinary> sourceDrawer,
			@DataDef(binaryType = BinaryType.INTEGER) QEnum<OUTPUTBINEnum, QBinary> outputBin,
			FONT font,
			@DataDef(length = 1) QEnum<FORMFEEDEnum, QCharacter> formFeed,
			@DataDef(length = 1) QEnum<PRINTQUALITYEnum, QCharacter> printQuality,
			@DataDef(length = 1) QEnum<CONTROLCHARACTEREnum, QCharacter> controlCharacter,
			@DataDef(binaryType=BinaryType.INTEGER) QBinary channel,
			@DataDef(length = 1) QEnum<FIDELITYEnum, QCharacter> fidelity,
			CHARACTERIDENTIFIER characterIdentifier,
			@DataDef(length = 1) QEnum<DECIMALFORMATEnum, QCharacter> decimalFormat,
			FONTCHARACTERSET fontCharacterSet,
			CODEDFONT codedFont,
			@DataDef(qualified = true) PAGEDEFINITION pageDefinition,
			@DataDef(qualified = true) FORMDEFINITION formDefinition,
			@DataDef(dimension = 4, length = 4) QEnum<AFPCHARACTERSEnum, QScroller<QCharacter>> aFPCharacters,
			@DataDef(length = 1) QEnum<TABLEREFERENCECHARACTERSEnum, QCharacter> tableReferenceCharacters,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<DEGREEOFPAGEROTATIONEnum, QBinary> degreeOfPageRotation,
			@DataDef(binaryType = BinaryType.SHORT) QEnum<PAGESPERSIDEEnum, QBinary> pagesPerSide,
			@DataDef(length = 1) QEnum<REDUCEOUTPUTEnum, QCharacter> reduceOutput,
			@DataDef(length = 30) QCharacter printText,
			@DataDef(binaryType = BinaryType.SHORT) QEnum<HARDWAREJUSTIFICATIONEnum, QBinary> hardwareJustification,
			@DataDef(length = 1) QEnum<PRINTONBOTHSIDESEnum, QCharacter> printOnBothSides,
			@DataDef(length = 1) QEnum<UNITOFMEASUREEnum, QCharacter> unitOfMeasure,
			FRONTSIDEOVERLAY frontSideOverlay,
			BACKSIDEOVERLAY backSideOverlay,
			@DataDef(length = 1) QEnum<CONVERTLINEDATAEnum, QCharacter> convertLineData,
			@DataDef(length = 1) QEnum<IPDSPASSTHROUGHEnum, QCharacter> iPDSPassThrough,
			@DataDef(dimension = 4, length = 10) QEnum<USERRESOURCELIBRARYLISTEnum, QScroller<QCharacter>> userResourceLibraryList,
			@DataDef(length = 1) QEnum<CORNERSTAPLEEnum, QCharacter> cornerStaple,
			EDGESTITCH edgeStitch,
			SADDLESTITCH saddleStitch,
			@DataDef(length = 1) QEnum<FONTRESOLUTIONFORFORMATTINGEnum, QCharacter> fontResolutionForFormatting,
			@ToDo @DataDef(length = 1) QEnum<DEFERWRITEEnum, QCharacter> deferWrite,
			@DataDef(length = 1) QEnum<SPOOLTHEDATAEnum, QCharacter> spoolTheData,
			@ToDo @DataDef(qualified = true) OUTPUTQUEUE outputQueue,
			@ToDo @DataDef(length = 10) QEnum<FORMTYPEEnum, QCharacter> formType,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QBinary copies,
			PAGERANGETOPRINT pageRangeToPrint,
			@DataDef(binaryType = BinaryType.INTEGER) QEnum<MAXSPOOLEDOUTPUTRECORDSEnum, QBinary> maxSpooledOutputRecords,
			@DataDef(binaryType = BinaryType.SHORT) QBinary fileSeparators,
			@DataDef(length = 1) QEnum<SPOOLEDOUTPUTSCHEDULEEnum, QCharacter> spooledOutputSchedule,
			@ToDo @DataDef(length = 1) QEnum<HOLDSPOOLEDFILEEnum, QCharacter> holdSpooledFile,
			@ToDo @DataDef(length = 1) QEnum<SAVESPOOLEDFILEEnum, QCharacter> saveSpooledFile,
			@DataDef(length = 1) QEnum<OUTPUTPRIORITYONOUTQEnum, QCharacter> outputPriorityonOUTQ,
			@DataDef(length = 10) QEnum<USERDATAEnum, QCharacter> userData,
			@DataDef(length = 10) QEnum<SPOOLFILEOWNEREnum, QCharacter> spoolFileOwner,
			@DataDef(dimension = 4, length = 10) QEnum<USERDEFINEDOPTIONEnum, QScroller<QCharacter>> userDefinedOption,
			@DataDef(length = 255) QEnum<USERDEFINEDDATAEnum, QCharacter> userDefinedData,
			USERDEFINEDOBJECT userDefinedObject,
			@DataDef(length = 10) QEnum<SPOOLFILENAMEEnum, QCharacter> spoolFileName,
			@DataDef(datetimeType = DatetimeType.DATE) QEnum<EXPIRATIONDATEFORFILEEnum, QDatetime> expirationDateForFile,
			@DataDef(binaryType = BinaryType.SHORT) QBinary daysUntilFileExpires,
			@DataDef(length = 1) QEnum<USERSPECIFIEDDBCSDATAEnum, QCharacter> userSpecifiedDBCSData,
			@DataDef(length = 1) QEnum<DBCSEXTENSIONCHARACTERSEnum, QCharacter> dBCSExtensionCharacters,
			@DataDef(length = 1) QEnum<DBCSCHARACTERROTATIONEnum, QCharacter> dBCSCharacterRotation,
			@DataDef(length = 1) QEnum<DBCSCHARACTERSPERINCHEnum, QCharacter> dBCSCharactersPerInch,
			@DataDef(length = 1) QEnum<DBCSSOSISPACINGEnum, QCharacter> dBCSSOSISpacing,
			DBCSCODEDFONT dBCSCodedFont,
			@DataDef(length = 5000) QEnum<TOSTREAMFILEEnum, QCharacter> toStreamFile,
			@DataDef(qualified = true) WORKSTATIONCUSTOMIZINGOBJECT workstationCustomizingObject,
			@DataDef(binaryType = BinaryType.SHORT) QEnum<MAXIMUMFILEWAITTIMEEnum, QBinary> maximumFileWaitTime,
			@DataDef(length = 1) QEnum<RECORDFORMATLEVELCHECKEnum, QCharacter> recordFormatLevelCheck,
			@DataDef(length = 1) QEnum<SECUREFROMOTHEROVERRIDESEnum, QCharacter> secureFromOtherOverrides,
			@ToDo @DataDef(length = 1) QEnum<OVERRIDESCOPEEnum, QCharacter> overrideScope,
			@ToDo @DataDef(length = 1) QEnum<SHAREOPENDATAPATHEnum, QCharacter> shareOpenDataPath,
			@DataDef(length = 1) QEnum<OPENSCOPEEnum, QCharacter> openScope) {

		if (fileBeingOverridden.asEnum().equals(FILEBEINGOVERRIDDENEnum.PRTF) && 
			overridingToPrinterFile.name.asEnum().equals(OVERRIDINGTOPRINTERFILE.NAMEEnum.FILE)) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPD5801, new String[0]);
		}
				
		QFileOverride fileOverride = QOperatingSystemFileFactory.eINSTANCE.createFileOverride();
		fileOverride.setName(name(fileBeingOverridden));
		QPrinterFile qFile = qFile(overridingToPrinterFile);
		//TODO: set attributes from command parameters
		fileOverride.setFileTo(qFile);
		
		fileManager.setFileOverride(job.getContext(), fileOverride);		
	}

	private QPrinterFile qFile(OVERRIDINGTOPRINTERFILE overridingToPrinterFile) {
		String overridingName = overridingToPrinterFile.name.asData().trimR();
		switch (overridingToPrinterFile.name.asEnum()) {
		case FILE:
			return QOperatingSystemFileFactory.eINSTANCE.createPrinterFile();
		case OTHER:
			QResourceReader<QFile> fileReader = findReader(overridingToPrinterFile.library);
			QFile qFile = fileReader.lookup(overridingName);

			if (qFile == null) {
				throw new OperatingSystemRuntimeException("File not found: " + overridingName);
			}

			if (!(qFile instanceof QPrinterFile)) {
				throw new OperatingSystemRuntimeException("Wrong file type: " + overridingName);
			}
			
			return (QPrinterFile) qFile;
		}
		throw new RuntimeException("Shuld not happen");
	}

	private QResourceReader<QFile> findReader(QEnum<OVERRIDINGTOPRINTERFILE.LIBRARYEnum, QCharacter> library) {
		switch (library.asEnum()) {
		case CURLIB:
			return resourceManager.getResourceReader(job, QFile.class, Scope.CURRENT_LIBRARY);
		case LIBL:
			return resourceManager.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
		case OTHER:
			return resourceManager.getResourceReader(job, QFile.class, library.asData().trimR());
		}
		throw new RuntimeException("Shuld not happen");
	}

	private String name(QEnum<FILEBEINGOVERRIDDENEnum, QCharacter> fileBeingOverridden) {
		switch(fileBeingOverridden.asEnum()) {
		case PRTF:
			return "*PRTF";
		case OTHER:
			return fileBeingOverridden.asData().trimR();
		}
		throw new RuntimeException("Shuld not happen");
	}

	public static enum FILEBEINGOVERRIDDENEnum {
		PRTF, OTHER
	}

	public static class OVERRIDINGTOPRINTERFILE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		
		@DataDef(length = 10)
		public QEnum<NAMEEnum, QCharacter> name;
		
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum NAMEEnum {
			FILE, OTHER
		}

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static class DEVICE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<PRINTEREnum, QCharacter> printer;

		public static enum PRINTEREnum {
			SYSVAL, JOB, OTHER
		}
	}

	public static enum PRINTERDEVICETYPEEnum {
		@Special(value = "X'00'")
		SCS, @Special(value = "X'01'")
		IPDS, @Special(value = "X'05'")
		USERASCII, @Special(value = "X'02'")
		AFPDS, @Special(value = "X'03'")
		LINE, @Special(value = "X'04'")
		AFPDSLINE
	}

	public static class PAGESIZE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(precision = 6, scale = 3)
		public QDecimal pageLength;
		@DataDef(precision = 6, scale = 3)
		public QDecimal pageWidth;
		@DataDef(length = 1, value = "*ROWCOL")
		public QEnum<MEASUREMENTMETHODEnum, QCharacter> measurementMethod;

		public static enum MEASUREMENTMETHODEnum {
			@Special(value = "R")
			ROWCOL, @Special(value = "U")
			UOM
		}
	}

	public static enum LINESPERINCHEnum {
		NUM_3_0, NUM_4_0, NUM_6_0, NUM_7_5, NUM_8_0, NUM_9_0, NUM_12_0
	}

	public static enum CHARACTERSPERINCHEnum {
		NUM_5_0, NUM_10_0, NUM_12_0, NUM_13_3, NUM_15_0, NUM_16_7, NUM_18_0, NUM_20_0
	}

	public static class FRONTMARGIN extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(precision = 5, scale = 3)
		public QEnum<OFFSETDOWNEnum, QDecimal> offsetDown;
		@DataDef(precision = 5, scale = 3)
		public QDecimal offsetAcross;

		public static enum OFFSETDOWNEnum {
			@Special(value = "-2.000")
			DEVD, OTHER
		}
	}

	public static class BACKMARGIN extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(precision = 5, scale = 3)
		public QEnum<OFFSETDOWNEnum, QDecimal> offsetDown;
		@DataDef(precision = 5, scale = 3)
		public QDecimal offsetAcross;

		public static enum OFFSETDOWNEnum {
			@Special(value = "-1.000")
			FRONTMGN, @Special(value = "-2.000")
			DEVD, OTHER
		}
	}

	public static enum FOLDRECORDSEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static class UNPRINTABLECHARACTERACTION extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1)
		public QEnum<REPLACECHARACTEREnum, QCharacter> replaceCharacter;
		@DataDef(length = 1, value = "*BLANK")
		public QEnum<REPLACEMENTCHARACTEREnum, QCharacter> replacementCharacter;

		public static enum REPLACECHARACTEREnum {
			@Special(value = "N")
			NO, @Special(value = "Y")
			YES
		}

		public static enum REPLACEMENTCHARACTEREnum {
			@Special(value = "X'40'")
			BLANK, OTHER
		}
	}

	public static enum ALIGNPAGEEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum SOURCEDRAWEREnum {
		@Special(value = "-1")
		E1, @Special(value = "-2")
		FORMDF, OTHER
	}

	public static enum OUTPUTBINEnum {
		@Special(value = "0")
		DEVD, OTHER
	}

	public static class FONT extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<IDENTIFIEREnum, QCharacter> identifier;
		@DataDef(precision = 4, scale = 1, value = "*NONE")
		public QEnum<POINTSIZEEnum, QDecimal> pointSize;

		public static enum IDENTIFIEREnum {
			CPI, DEVD, @Special(value = "2")
			NUM_2, @Special(value = "002")
			NUM_002, @Special(value = "3")
			NUM_3, @Special(value = "003")
			NUM_003, @Special(value = "5")
			NUM_5, @Special(value = "005")
			NUM_005, @Special(value = "8")
			NUM_8, @Special(value = "008")
			NUM_008, @Special(value = "10")
			NUM_10, @Special(value = "010")
			NUM_010, @Special(value = "11")
			NUM_11, @Special(value = "011")
			NUM_011, @Special(value = "12")
			NUM_12, @Special(value = "012")
			NUM_012, @Special(value = "13")
			NUM_13, @Special(value = "013")
			NUM_013, @Special(value = "18")
			NUM_18, @Special(value = "018")
			NUM_018, @Special(value = "19")
			NUM_19, @Special(value = "019")
			NUM_019, @Special(value = "20")
			NUM_20, @Special(value = "020")
			NUM_020, @Special(value = "21")
			NUM_21, @Special(value = "021")
			NUM_021, @Special(value = "25")
			NUM_25, @Special(value = "025")
			NUM_025, @Special(value = "26")
			NUM_26, @Special(value = "026")
			NUM_026, @Special(value = "30")
			NUM_30, @Special(value = "030")
			NUM_030, @Special(value = "31")
			NUM_31, @Special(value = "031")
			NUM_031, @Special(value = "36")
			NUM_36, @Special(value = "036")
			NUM_036, @Special(value = "38")
			NUM_38, @Special(value = "038")
			NUM_038, @Special(value = "39")
			NUM_39, @Special(value = "039")
			NUM_039, @Special(value = "40")
			NUM_40, @Special(value = "040")
			NUM_040, @Special(value = "41")
			NUM_41, @Special(value = "041")
			NUM_041, @Special(value = "42")
			NUM_42, @Special(value = "042")
			NUM_042, @Special(value = "43")
			NUM_43, @Special(value = "043")
			NUM_043, @Special(value = "44")
			NUM_44, @Special(value = "044")
			NUM_044, @Special(value = "46")
			NUM_46, @Special(value = "046")
			NUM_046, @Special(value = "49")
			NUM_49, @Special(value = "049")
			NUM_049, @Special(value = "50")
			NUM_50, @Special(value = "050")
			NUM_050, @Special(value = "51")
			NUM_51, @Special(value = "051")
			NUM_051, @Special(value = "52")
			NUM_52, @Special(value = "052")
			NUM_052, @Special(value = "55")
			NUM_55, @Special(value = "055")
			NUM_055, @Special(value = "61")
			NUM_61, @Special(value = "061")
			NUM_061, @Special(value = "62")
			NUM_62, @Special(value = "062")
			NUM_062, @Special(value = "63")
			NUM_63, @Special(value = "063")
			NUM_063, @Special(value = "64")
			NUM_64, @Special(value = "064")
			NUM_064, @Special(value = "66")
			NUM_66, @Special(value = "066")
			NUM_066, @Special(value = "68")
			NUM_68, @Special(value = "068")
			NUM_068, @Special(value = "69")
			NUM_69, @Special(value = "069")
			NUM_069, @Special(value = "70")
			NUM_70, @Special(value = "070")
			NUM_070, @Special(value = "71")
			NUM_71, @Special(value = "071")
			NUM_071, @Special(value = "72")
			NUM_72, @Special(value = "072")
			NUM_072, @Special(value = "74")
			NUM_74, @Special(value = "074")
			NUM_074, @Special(value = "75")
			NUM_75, @Special(value = "075")
			NUM_075, @Special(value = "76")
			NUM_76, @Special(value = "076")
			NUM_076, @Special(value = "78")
			NUM_78, @Special(value = "078")
			NUM_078, @Special(value = "80")
			NUM_80, @Special(value = "080")
			NUM_080, @Special(value = "84")
			NUM_84, @Special(value = "084")
			NUM_084, @Special(value = "85")
			NUM_85, @Special(value = "085")
			NUM_085, @Special(value = "86")
			NUM_86, @Special(value = "086")
			NUM_086, @Special(value = "87")
			NUM_87, @Special(value = "087")
			NUM_087, @Special(value = "91")
			NUM_91, @Special(value = "091")
			NUM_091, @Special(value = "92")
			NUM_92, @Special(value = "092")
			NUM_092, @Special(value = "95")
			NUM_95, @Special(value = "095")
			NUM_095, @Special(value = "96")
			NUM_96, @Special(value = "096")
			NUM_096, @Special(value = "98")
			NUM_98, @Special(value = "098")
			NUM_098, @Special(value = "99")
			NUM_99, @Special(value = "099")
			NUM_099, @Special(value = "101")
			NUM_101, @Special(value = "102")
			NUM_102, @Special(value = "103")
			NUM_103, @Special(value = "109")
			NUM_109, @Special(value = "110")
			NUM_110, @Special(value = "111")
			NUM_111, @Special(value = "112")
			NUM_112, @Special(value = "154")
			NUM_154, @Special(value = "155")
			NUM_155, @Special(value = "157")
			NUM_157, @Special(value = "158")
			NUM_158, @Special(value = "159")
			NUM_159, @Special(value = "160")
			NUM_160, @Special(value = "162")
			NUM_162, @Special(value = "163")
			NUM_163, @Special(value = "164")
			NUM_164, @Special(value = "167")
			NUM_167, @Special(value = "168")
			NUM_168, @Special(value = "173")
			NUM_173, @Special(value = "174")
			NUM_174, @Special(value = "175")
			NUM_175, @Special(value = "178")
			NUM_178, @Special(value = "179")
			NUM_179, @Special(value = "180")
			NUM_180, @Special(value = "181")
			NUM_181, @Special(value = "182")
			NUM_182, @Special(value = "183")
			NUM_183, @Special(value = "186")
			NUM_186, @Special(value = "187")
			NUM_187, @Special(value = "188")
			NUM_188, @Special(value = "189")
			NUM_189, @Special(value = "190")
			NUM_190, @Special(value = "191")
			NUM_191, @Special(value = "194")
			NUM_194, @Special(value = "195")
			NUM_195, @Special(value = "204")
			NUM_204, @Special(value = "205")
			NUM_205, @Special(value = "211")
			NUM_211, @Special(value = "212")
			NUM_212, @Special(value = "221")
			NUM_221, @Special(value = "222")
			NUM_222, @Special(value = "223")
			NUM_223, @Special(value = "225")
			NUM_225, @Special(value = "226")
			NUM_226, @Special(value = "229")
			NUM_229, @Special(value = "230")
			NUM_230, @Special(value = "232")
			NUM_232, @Special(value = "233")
			NUM_233, @Special(value = "234")
			NUM_234, @Special(value = "244")
			NUM_244, @Special(value = "245")
			NUM_245, @Special(value = "247")
			NUM_247, @Special(value = "248")
			NUM_248, @Special(value = "249")
			NUM_249, @Special(value = "252")
			NUM_252, @Special(value = "253")
			NUM_253, @Special(value = "254")
			NUM_254, @Special(value = "255")
			NUM_255, @Special(value = "256")
			NUM_256, @Special(value = "258")
			NUM_258, @Special(value = "259")
			NUM_259, @Special(value = "279")
			NUM_279, @Special(value = "281")
			NUM_281, @Special(value = "282")
			NUM_282, @Special(value = "285")
			NUM_285, @Special(value = "290")
			NUM_290, @Special(value = "300")
			NUM_300, @Special(value = "304")
			NUM_304, @Special(value = "305")
			NUM_305, @Special(value = "306")
			NUM_306, @Special(value = "307")
			NUM_307, @Special(value = "318")
			NUM_318, @Special(value = "319")
			NUM_319, @Special(value = "400")
			NUM_400, @Special(value = "404")
			NUM_404, @Special(value = "416")
			NUM_416, @Special(value = "420")
			NUM_420, @Special(value = "424")
			NUM_424, @Special(value = "428")
			NUM_428, @Special(value = "432")
			NUM_432, @Special(value = "434")
			NUM_434, @Special(value = "435")
			NUM_435, @Special(value = "751")
			NUM_751, @Special(value = "752")
			NUM_752, @Special(value = "753")
			NUM_753, @Special(value = "754")
			NUM_754, @Special(value = "755")
			NUM_755, @Special(value = "756")
			NUM_756, @Special(value = "757")
			NUM_757, @Special(value = "758")
			NUM_758, @Special(value = "759")
			NUM_759, @Special(value = "760")
			NUM_760, @Special(value = "761")
			NUM_761, @Special(value = "762")
			NUM_762, @Special(value = "763")
			NUM_763, @Special(value = "764")
			NUM_764, @Special(value = "765")
			NUM_765, @Special(value = "1051")
			NUM_1051, @Special(value = "1053")
			NUM_1053, @Special(value = "1056")
			NUM_1056, @Special(value = "1351")
			NUM_1351, @Special(value = "1653")
			NUM_1653, @Special(value = "1803")
			NUM_1803, @Special(value = "2103")
			NUM_2103, @Special(value = "2304")
			NUM_2304, @Special(value = "2305")
			NUM_2305, @Special(value = "2306")
			NUM_2306, @Special(value = "2307")
			NUM_2307, @Special(value = "2308")
			NUM_2308, @Special(value = "2309")
			NUM_2309, @Special(value = "2310")
			NUM_2310, @Special(value = "2311")
			NUM_2311, @Special(value = "4407")
			NUM_4407, @Special(value = "4427")
			NUM_4427, @Special(value = "4535")
			NUM_4535, @Special(value = "4919")
			NUM_4919, @Special(value = "4939")
			NUM_4939, @Special(value = "5047")
			NUM_5047, @Special(value = "5067")
			NUM_5067, @Special(value = "5687")
			NUM_5687, @Special(value = "5707")
			NUM_5707, @Special(value = "5815")
			NUM_5815, @Special(value = "5835")
			NUM_5835, @Special(value = "5943")
			NUM_5943, @Special(value = "6199")
			NUM_6199, @Special(value = "6219")
			NUM_6219, @Special(value = "6327")
			NUM_6327, @Special(value = "6347")
			NUM_6347, @Special(value = "8503")
			NUM_8503, @Special(value = "8523")
			NUM_8523, @Special(value = "8631")
			NUM_8631, @Special(value = "8651")
			NUM_8651, @Special(value = "8759")
			NUM_8759, @Special(value = "8779")
			NUM_8779, @Special(value = "8887")
			NUM_8887, @Special(value = "8907")
			NUM_8907, @Special(value = "12855")
			NUM_12855, @Special(value = "12875")
			NUM_12875, @Special(value = "16951")
			NUM_16951, @Special(value = "16971")
			NUM_16971, @Special(value = "17079")
			NUM_17079, @Special(value = "17099")
			NUM_17099, @Special(value = "33335")
			NUM_33335, @Special(value = "33355")
			NUM_33355, @Special(value = "33463")
			NUM_33463, @Special(value = "33483")
			NUM_33483, @Special(value = "33591")
			NUM_33591, @Special(value = "33601")
			NUM_33601, @Special(value = "33719")
			NUM_33719, @Special(value = "33729")
			NUM_33729, @Special(value = "34103")
			NUM_34103, @Special(value = "34123")
			NUM_34123, @Special(value = "34231")
			NUM_34231, @Special(value = "34251")
			NUM_34251, @Special(value = "37431")
			NUM_37431, @Special(value = "41783")
			NUM_41783, @Special(value = "41803")
			NUM_41803, OTHER
		}

		public static enum POINTSIZEEnum {
			@Special(value = "0.0")
			NONE, OTHER
		}
	}

	public static enum FORMFEEDEnum {
		@Special(value = "X'00'")
		DEVD, @Special(value = "X'01'")
		CONT, @Special(value = "X'02'")
		CUT, @Special(value = "X'04'")
		CONT2, @Special(value = "X'03'")
		AUTOCUT
	}

	public static enum PRINTQUALITYEnum {
		@Special(value = "X'00'")
		STD, @Special(value = "X'03'")
		DEVD, @Special(value = "X'01'")
		DRAFT, @Special(value = "X'02'")
		NLQ, @Special(value = "X'04'")
		FASTDRAFT
	}

	public static enum CONTROLCHARACTEREnum {
		@Special(value = "X'00'")
		NONE, @Special(value = "X'01'")
		FCFC, @Special(value = "X'02'")
		MACHINE
	}

	public static class CHANNELVALUES extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary channel;
	}

	public static enum FIDELITYEnum {
		@Special(value = "C")
		CONTENT, @Special(value = "A")
		ABSOLUTE
	}

	public static class CHARACTERIDENTIFIER extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.SHORT)
		public QEnum<GRAPHICCHARACTERSETEnum, QBinary> graphicCharacterSet;
		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary codePage;

		public static enum GRAPHICCHARACTERSETEnum {
			@Special(value = "0")
			DEVD, @Special(value = "-1")
			SYSVAL, @Special(value = "-2")
			JOBCCSID, @Special(value = "-3")
			CHRIDCTL, OTHER
		}
	}

	public static enum DECIMALFORMATEnum {
		@Special(value = "X'00'")
		FILE, @Special(value = "X'80'")
		JOB
	}

	public static class FONTCHARACTERSET extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(qualified = true)
		public QEnum<CHARACTERSETEnum, FONTCHARACTERSET.CHARACTERSET> characterSet;
		@DataDef(qualified = true)
		public FONTCHARACTERSET.CODEPAGE codePage;
		@DataDef(precision = 4, scale = 1, value = "*NONE")
		public QEnum<POINTSIZEEnum, QDecimal> pointSize;

		public static class CHARACTERSET extends QDataStructWrapper {
			private static final long serialVersionUID = 1L;
			@DataDef(length = 8)
			public QCharacter name;
			@DataDef(length = 10, value = "*LIBL")
			public QEnum<LIBRARYEnum, QCharacter> library;

			public static enum LIBRARYEnum {
				LIBL, CURLIB, OTHER
			}
		}

		public static enum CHARACTERSETEnum {
			FONT, OTHER
		}

		public static class CODEPAGE extends QDataStructWrapper {
			private static final long serialVersionUID = 1L;
			@DataDef(length = 8)
			public QCharacter name;
			@DataDef(length = 10, value = "*LIBL")
			public QEnum<LIBRARYEnum, QCharacter> library;

			public static enum LIBRARYEnum {
				LIBL, CURLIB, OTHER
			}
		}

		public static enum POINTSIZEEnum {
			@Special(value = "0.0")
			NONE, OTHER
		}
	}

	public static class CODEDFONT extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(qualified = true)
		public QEnum<CODEDFONTEnum, CODEDFONT.CODEDFONTStruct> codedFont;
		@DataDef(precision = 4, scale = 1, value = "*NONE")
		public QEnum<POINTSIZEEnum, QDecimal> pointSize;

		public static class CODEDFONTStruct extends QDataStructWrapper {
			private static final long serialVersionUID = 1L;
			@DataDef(length = 8)
			public QCharacter name;
			@DataDef(length = 10, value = "*LIBL")
			public QEnum<LIBRARYEnum, QCharacter> library;

			public static enum LIBRARYEnum {
				LIBL, CURLIB, OTHER
			}
		}

		public static enum CODEDFONTEnum {
			FNTCHRSET, OTHER
		}

		public static enum POINTSIZEEnum {
			@Special(value = "0.0")
			NONE, OTHER
		}
	}

	public static class PAGEDEFINITION extends QDataStructWrapper {
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

	public static class FORMDEFINITION extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NAMEEnum, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum NAMEEnum {
			NONE, DEVD, OTHER
		}

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum AFPCHARACTERSEnum {
		@Special(value = "*NON")
		NONE, OTHER
	}

	public static enum TABLEREFERENCECHARACTERSEnum {
		@Special(value = "X'00'")
		NO, @Special(value = "X'01'")
		YES
	}

	public static enum DEGREEOFPAGEROTATIONEnum {
		@Special(value = "-2")
		AUTO, @Special(value = "0")
		DEVD, @Special(value = "-1")
		COR, @Special(value = "360")
		NUM_0, @Special(value = "90")
		NUM_90, @Special(value = "180")
		NUM_180, @Special(value = "270")
		NUM_270
	}

	public static enum PAGESPERSIDEEnum {
		@Special(value = "0")
		NUM_1, OTHER
	}

	public static enum REDUCEOUTPUTEnum {
		@Special(value = "X'00'")
		TEXT, @Special(value = "X'01'")
		NONE
	}

	public static enum HARDWAREJUSTIFICATIONEnum {
		NUM_0, NUM_50, NUM_100
	}

	public static enum PRINTONBOTHSIDESEnum {
		@Special(value = "X'00'")
		NO, @Special(value = "X'01'")
		YES, @Special(value = "X'02'")
		TUMBLE, @Special(value = "X'FF'")
		FORMDF
	}

	public static enum UNITOFMEASUREEnum {
		@Special(value = "X'00'")
		INCH, @Special(value = "X'01'")
		CM
	}

	public static class FRONTSIDEOVERLAY extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(qualified = true)
		public QEnum<OVERLAYEnum, FRONTSIDEOVERLAY.OVERLAY> overlay;
		@DataDef(precision = 5, scale = 3, value = "0")
		public QDecimal offsetDown;
		@DataDef(precision = 5, scale = 3, value = "0")
		public QDecimal offsetAcross;

		public static class OVERLAY extends QDataStructWrapper {
			private static final long serialVersionUID = 1L;
			@DataDef(length = 8)
			public QCharacter name;
			@DataDef(length = 10, value = "*LIBL")
			public QEnum<LIBRARYEnum, QCharacter> library;

			public static enum LIBRARYEnum {
				LIBL, CURLIB, OTHER
			}
		}

		public static enum OVERLAYEnum {
			NONE, OTHER
		}
	}

	public static class BACKSIDEOVERLAY extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(qualified = true)
		public QEnum<OVERLAYEnum, BACKSIDEOVERLAY.OVERLAY> overlay;
		@DataDef(precision = 5, scale = 3, value = "0")
		public QDecimal offsetDown;
		@DataDef(precision = 5, scale = 3, value = "0")
		public QDecimal offsetAcross;
		@DataDef(length = 1, value = "*NOCONSTANT")
		public QEnum<CONSTANTBACKEnum, QCharacter> constantBack;

		public static class OVERLAY extends QDataStructWrapper {
			private static final long serialVersionUID = 1L;
			@DataDef(length = 8)
			public QCharacter name;
			@DataDef(length = 10, value = "*LIBL")
			public QEnum<LIBRARYEnum, QCharacter> library;

			public static enum LIBRARYEnum {
				LIBL, CURLIB, OTHER
			}
		}

		public static enum OVERLAYEnum {
			@Special(value = "*FRONT")
			FRONTOVL, NONE, OTHER
		}

		public static enum CONSTANTBACKEnum {
			@Special(value = "N")
			NOCONSTANT, @Special(value = "C")
			CONSTANT
		}
	}

	public static enum CONVERTLINEDATAEnum {
		@Special(value = "X'00'")
		NO, @Special(value = "X'80'")
		YES
	}

	public static enum IPDSPASSTHROUGHEnum {
		@Special(value = "X'02'")
		YES, @Special(value = "X'01'")
		NO, @Special(value = "X'00'")
		DEVD
	}

	public static enum USERRESOURCELIBRARYLISTEnum {
		DEVD, NONE, JOBLIBL, CURLIB, OTHER
	}

	public static enum CORNERSTAPLEEnum {
		@Special(value = "X'00'")
		NONE, @Special(value = "X'01'")
		BOTRIGHT, @Special(value = "X'02'")
		TOPRIGHT, @Special(value = "X'03'")
		TOPLEFT, @Special(value = "X'04'")
		BOTLEFT, @Special(value = "X'FF'")
		DEVD
	}

	public static class EDGESTITCH extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1)
		public QEnum<REFERENCEEDGEEnum, QCharacter> referenceEdge;
		@DataDef(precision = 7, scale = 4)
		public QEnum<REFERENCEEDGEOFFSETEnum, QDecimal> referenceEdgeOffset;
		@DataDef(binaryType = BinaryType.SHORT)
		public QEnum<NUMBEROFSTAPLESEnum, QBinary> numberOfStaples;
		@DataDef(dimension = 122, precision = 7, scale = 4)
		public QEnum<STAPLEOFFSETSEnum, QScroller<QDecimal>> stapleOffsets;

		public static enum REFERENCEEDGEEnum {
			@Special(value = "X'00'")
			NONE, @Special(value = "X'01'")
			BOT, @Special(value = "X'02'")
			RIGHT, @Special(value = "X'03'")
			TOP, @Special(value = "X'04'")
			LEFT, @Special(value = "X'FF'")
			DEVD
		}

		public static enum REFERENCEEDGEOFFSETEnum {
			@Special(value = "-1.0000")
			DEVD, OTHER
		}

		public static enum NUMBEROFSTAPLESEnum {
			@Special(value = "-1")
			DEVD, OTHER
		}

		public static enum STAPLEOFFSETSEnum {
			@Special(value = "-1.0000")
			DEVD, OTHER
		}
	}

	public static class SADDLESTITCH extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1)
		public QEnum<REFERENCEEDGEEnum, QCharacter> referenceEdge;
		@DataDef(binaryType = BinaryType.SHORT)
		public QEnum<NUMBEROFSTAPLESEnum, QBinary> numberOfStaples;
		@DataDef(dimension = 122, precision = 7, scale = 4)
		public QEnum<STAPLEOFFSETSEnum, QScroller<QDecimal>> stapleOffsets;

		public static enum REFERENCEEDGEEnum {
			@Special(value = "X'00'")
			NONE, @Special(value = "X'03'")
			TOP, @Special(value = "X'04'")
			LEFT, @Special(value = "X'FF'")
			DEVD
		}

		public static enum NUMBEROFSTAPLESEnum {
			@Special(value = "-1")
			DEVD, OTHER
		}

		public static enum STAPLEOFFSETSEnum {
			@Special(value = "-1.0000")
			DEVD, OTHER
		}
	}

	public static enum FONTRESOLUTIONFORFORMATTINGEnum {
		@Special(value = "X'00'")
		DEVD, @Special(value = "X'01'")
		SEARCH, @Special(value = "X'02'")
		NUM_240, @Special(value = "X'03'")
		NUM_300
	}

	public static enum DEFERWRITEEnum {
		@Special(value = "X'00'")
		YES, @Special(value = "X'01'")
		NO
	}

	public static enum SPOOLTHEDATAEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static class OUTPUTQUEUE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NAMEEnum, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum NAMEEnum {
			DEV, JOB, OTHER
		}

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum FORMTYPEEnum {
		STD, OTHER
	}

	public static class PAGERANGETOPRINT extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QEnum<STARTINGPAGEEnum, QBinary> startingPage;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QEnum<ENDINGPAGEEnum, QBinary> endingPage;

		public static enum STARTINGPAGEEnum {
			@Special(value = "0")
			NUM_1, @Special(value = "-1")
			ENDPAGE, OTHER
		}

		public static enum ENDINGPAGEEnum {
			@Special(value = "0")
			END, OTHER
		}
	}

	public static enum MAXSPOOLEDOUTPUTRECORDSEnum {
		@Special(value = "0")
		NOMAX, OTHER
	}

	public static enum SPOOLEDOUTPUTSCHEDULEEnum {
		@Special(value = "J")
		JOBEND, @Special(value = "F")
		FILEEND, @Special(value = "I")
		IMMED
	}

	public static enum HOLDSPOOLEDFILEEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum SAVESPOOLEDFILEEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum OUTPUTPRIORITYONOUTQEnum {
		@Special(value = "X'00'")
		JOB, @Special(value = "X'01'")
		NUM_1, @Special(value = "X'02'")
		NUM_2, @Special(value = "X'03'")
		NUM_3, @Special(value = "X'04'")
		NUM_4, @Special(value = "X'05'")
		NUM_5, @Special(value = "X'06'")
		NUM_6, @Special(value = "X'07'")
		NUM_7, @Special(value = "X'08'")
		NUM_8, @Special(value = "X'09'")
		NUM_9
	}

	public static enum USERDATAEnum {
		SOURCE, OTHER
	}

	public static enum SPOOLFILEOWNEREnum {
		CURUSRPRF, JOB, CURGRPPRF, JOBGRPPRF
	}

	public static enum USERDEFINEDOPTIONEnum {
		NONE, OTHER
	}

	public static enum USERDEFINEDDATAEnum {
		NONE, OTHER
	}

	public static class USERDEFINEDOBJECT extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(qualified = true)
		public QEnum<OBJECTEnum, USERDEFINEDOBJECT.OBJECT> object;
		@DataDef(length = 10)
		public QEnum<OBJECTTYPEEnum, QCharacter> objectType;

		public static class OBJECT extends QDataStructWrapper {
			private static final long serialVersionUID = 1L;
			@DataDef(length = 10)
			public QCharacter name;
			@DataDef(length = 10, value = "*LIBL")
			public QEnum<LIBRARYEnum, QCharacter> library;

			public static enum LIBRARYEnum {
				LIBL, CURLIB, OTHER
			}
		}

		public static enum OBJECTEnum {
			NONE, OTHER
		}

		public static enum OBJECTTYPEEnum {
			@Special(value = "DTAARA")
			DTAARA, @Special(value = "DTAQ")
			DTAQ, @Special(value = "FILE")
			FILE, @Special(value = "PSFCFG")
			PSFCFG, @Special(value = "USRIDX")
			USRIDX, @Special(value = "USRQ")
			USRQ, @Special(value = "USRSPC")
			USRSPC
		}
	}

	public static enum SPOOLFILENAMEEnum {
		FILE, OTHER
	}

	public static enum EXPIRATIONDATEFORFILEEnum {
		@Special(value = "0000000")
		NONE, @Special(value = "0999998")
		DAYS, OTHER
	}

	public static enum USERSPECIFIEDDBCSDATAEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum DBCSEXTENSIONCHARACTERSEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static enum DBCSCHARACTERROTATIONEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum DBCSCHARACTERSPERINCHEnum {
		@Special(value = "X'00'")
		CPI, @Special(value = "X'01'")
		CONDENSED, @Special(value = "X'05'")
		NUM_5, @Special(value = "X'06'")
		NUM_6, @Special(value = "X'0A'")
		NUM_10
	}

	public static enum DBCSSOSISPACINGEnum {
		@Special(value = "X'00'")
		YES, @Special(value = "X'01'")
		NO, @Special(value = "X'02'")
		RIGHT
	}

	public static class DBCSCODEDFONT extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(qualified = true)
		public QEnum<DBCSCODEDFONTEnum, DBCSCODEDFONT.DBCSCODEDFONTStruct> dBCSCodedFont;
		@DataDef(precision = 4, scale = 1, value = "*NONE")
		public QEnum<POINTSIZEEnum, QDecimal> pointSize;

		public static class DBCSCODEDFONTStruct extends QDataStructWrapper {
			private static final long serialVersionUID = 1L;
			@DataDef(length = 8)
			public QCharacter name;
			@DataDef(length = 10, value = "*LIBL")
			public QEnum<LIBRARYEnum, QCharacter> library;

			public static enum LIBRARYEnum {
				LIBL, CURLIB, OTHER
			}
		}

		public static enum DBCSCODEDFONTEnum {
			SYSVAL, OTHER
		}

		public static enum POINTSIZEEnum {
			@Special(value = "0.0")
			NONE, OTHER
		}
	}

	public static enum TOSTREAMFILEEnum {
		NONE, OTHER
	}

	public static class WORKSTATIONCUSTOMIZINGOBJECT extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NAMEEnum, QCharacter> name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum NAMEEnum {
			NONE, PDF, OTHER
		}

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum MAXIMUMFILEWAITTIMEEnum {
		@Special(value = "-1")
		IMMED, @Special(value = "0")
		CLS, OTHER
	}

	public static enum RECORDFORMATLEVELCHECKEnum {
		@Special(value = "N")
		NO
	}

	public static enum SECUREFROMOTHEROVERRIDESEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum OVERRIDESCOPEEnum {
		@Special(value = "A")
		ACTGRPDFN, @Special(value = "I")
		CALLLVL, @Special(value = "J")
		JOB
	}

	public static enum SHAREOPENDATAPATHEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum OPENSCOPEEnum {
		@Special(value = "A")
		ACTGRPDFN, @Special(value = "J")
		JOB
	}
}
