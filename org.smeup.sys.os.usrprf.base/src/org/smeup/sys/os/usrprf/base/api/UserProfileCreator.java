package org.smeup.sys.os.usrprf.base.api;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.usrprf.base.api.tools.StatusEnum;
import org.smeup.sys.os.usrprf.base.api.tools.UserClassEnum;

@Program(name = "QSYUP")
public @Supported class UserProfileCreator {
	public static enum QCPFMSG {
	}

	public @Entry void main(
			@Supported @DataDef(length = 10) QCharacter userProfile,
			@ToDo @DataDef(length = 128) QEnum<USERPASSWORDEnum, QCharacter> userPassword,
			@ToDo @DataDef(length = 1) QEnum<SETPASSWORDTOEXPIREDEnum, QCharacter> setPasswordToExpired,
			@Supported @DataDef(length = 1) QEnum<StatusEnum, QCharacter> status,
			@Supported @DataDef(binaryType = BinaryType.SHORT) QEnum<UserClassEnum, QBinary> userClass,
			@DataDef(length = 1) QEnum<ASSISTANCELEVELEnum, QCharacter> assistanceLevel,
			@DataDef(length = 10) QEnum<CURRENTLIBRARYEnum, QCharacter> currentLibrary,
			@Supported @DataDef(qualified = true) QEnum<INITIALPROGRAMTOCALLEnum, INITIALPROGRAMTOCALL> initialProgramToCall,
			@DataDef(qualified = true) QEnum<INITIALMENUEnum, INITIALMENU> initialMenu,
			@ToDo @DataDef(length = 1) QEnum<LIMITCAPABILITIESEnum, QCharacter> limitCapabilities,
			@Supported @DataDef(length = 50) QEnum<TEXTDESCRIPTIONEnum, QCharacter> textDescription,
			@ToDo @DataDef(dimension = 8, length = 4) QEnum<SPECIALAUTHORITYEnum, QScroller<QCharacter>> specialAuthority,
			@DataDef(length = 1) QEnum<SPECIALENVIRONMENTEnum, QCharacter> specialEnvironment,
			@DataDef(length = 1) QEnum<DISPLAYSIGNONINFORMATIONEnum, QCharacter> displaySignOnInformation,
			@ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<PASSWORDEXPIRATIONINTERVALEnum, QBinary> passwordExpirationInterval,
			@DataDef(binaryType = BinaryType.SHORT) QEnum<BLOCKPASSWORDCHANGEEnum, QBinary> blockPasswordChange,
			@DataDef(length = 1) QEnum<LOCALPASSWORDMANAGEMENTEnum, QCharacter> localPasswordManagement,
			@DataDef(length = 1) QEnum<LIMITDEVICESESSIONSEnum, QCharacter> limitDeviceSessions,
			@DataDef(length = 1) QEnum<KEYBOARDBUFFERINGEnum, QCharacter> keyboardBuffering,
			@DataDef(binaryType = BinaryType.INTEGER) QEnum<MAXIMUMALLOWEDSTORAGEEnum, QBinary> maximumAllowedStorage,
			@DataDef(length = 1) QCharacter highestSchedulePriority,
			@Supported @DataDef(qualified = true) JOBDESCRIPTION jobDescription,
			@ToDo @DataDef(length = 10) QEnum<GROUPPROFILEEnum, QCharacter> groupProfile,
			@ToDo @DataDef(length = 1) QEnum<OWNEREnum, QCharacter> owner,
			@DataDef(length = 1) QEnum<GROUPAUTHORITYEnum, QCharacter> groupAuthority,
			@DataDef(length = 1) QEnum<GROUPAUTHORITYTYPEEnum, QCharacter> groupAuthorityType,
			@DataDef(dimension = 15, length = 10) QEnum<SUPPLEMENTALGROUPSEnum, QScroller<QCharacter>> supplementalGroups,
			@DataDef(length = 15) QEnum<ACCOUNTINGCODEEnum, QCharacter> accountingCode,
			@DataDef(length = 8) QEnum<DOCUMENTPASSWORDEnum, QCharacter> documentPassword,
			@DataDef(qualified = true) QEnum<MESSAGEQUEUEEnum, MESSAGEQUEUE> messageQueue,
			@DataDef(length = 1) QEnum<DELIVERYEnum, QCharacter> delivery,
			@DataDef(binaryType = BinaryType.SHORT) QBinary severityCodeFilter,
			@DataDef(length = 10) QEnum<PRINTDEVICEEnum, QCharacter> printDevice,
			@DataDef(qualified = true) QEnum<OUTPUTQUEUEEnum, OUTPUTQUEUE> outputQueue,
			@ToDo @DataDef(qualified = true) QEnum<ATTENTIONPROGRAMEnum, ATTENTIONPROGRAM> attentionProgram,
			@DataDef(qualified = true) QEnum<SORTSEQUENCEEnum, SORTSEQUENCE> sortSequence,
			@DataDef(length = 3) QEnum<LANGUAGEIDEnum, QCharacter> languageID,
			@DataDef(length = 2) QEnum<COUNTRYORREGIONIDEnum, QCharacter> countryOrRegionID,
			@DataDef(binaryType = BinaryType.INTEGER) QEnum<CODEDCHARACTERSETIDEnum, QBinary> codedCharacterSetID,
			@DataDef(length = 10) QEnum<CHARACTERIDENTIFIERCONTROLEnum, QCharacter> characterIdentifierControl,
			@DataDef(dimension = 6, length = 2) QEnum<LOCALEJOBATTRIBUTESEnum, QScroller<QCharacter>> localeJobAttributes,
			@DataDef(length = 2048) QEnum<LOCALEEnum, QCharacter> locale,
			@DataDef(dimension = 7, length = 10) QEnum<USEROPTIONSEnum, QScroller<QCharacter>> userOptions,
			@DataDef(precision = 10) QEnum<USERIDNUMBEREnum, QDecimal> userIDNumber,
			@DataDef(precision = 10) QEnum<GROUPIDNUMBEREnum, QDecimal> groupIDNumber,
			@DataDef(length = 2048) QEnum<HOMEDIRECTORYEnum, QCharacter> homeDirectory,
			QEnum<EIMASSOCIATIONEnum, EIMASSOCIATION> eIMAssociation,
			@ToDo @DataDef(length = 10) QEnum<AUTHORITYEnum, QCharacter> authority) {
	}

	public static enum USERPASSWORDEnum {
		@Special(value = "*USER")
		USRPRF, NONE, OTHER
	}

	public static enum SETPASSWORDTOEXPIREDEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}


	public static enum ASSISTANCELEVELEnum {
		@Special(value = "X'40'")
		SYSVAL, @Special(value = "B")
		BASIC, @Special(value = "I")
		INTERMED, @Special(value = "A")
		ADVANCED
	}

	public static enum CURRENTLIBRARYEnum {
		@Special(value = "X'40404040404040404040'")
		CRTDFT, 
		OTHER
	}

	public static class INITIALPROGRAMTOCALL extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum INITIALPROGRAMTOCALLEnum {
		@Special(value = "X'40'")
		NONE, OTHER
	}

	public static class INITIALMENU extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "MAIN")
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum INITIALMENUEnum {
		SIGNOFF, OTHER
	}

	public static enum LIMITCAPABILITIESEnum {
		@Special(value = "X'40'")
		NO, @Special(value = "P")
		PARTIAL, @Special(value = "Y")
		YES
	}

	public static enum TEXTDESCRIPTIONEnum {
		@Special(value = "")
		BLANK, OTHER
	}

	public static enum SPECIALAUTHORITYEnum {
		@Special(value = "*USR")
		USRCLS, @Special(value = "X'00000000'")
		NONE, @Special(value = "X'80000000'")
		ALLOBJ, @Special(value = "X'00200000'")
		AUDIT, @Special(value = "X'00080000'")
		IOSYSCFG, @Special(value = "X'01000000'")
		JOBCTL, @Special(value = "X'70000000'")
		SAVSYS, @Special(value = "*ADM")
		SECADM, @Special(value = "X'00400000'")
		SERVICE, @Special(value = "X'00100000'")
		SPLCTL
	}

	public static enum SPECIALENVIRONMENTEnum {
		@Special(value = "X'40'")
		SYSVAL, @Special(value = "N")
		NONE, @Special(value = "3")
		S36
	}

	public static enum DISPLAYSIGNONINFORMATIONEnum {
		@Special(value = "X'40'")
		SYSVAL, @Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum PASSWORDEXPIRATIONINTERVALEnum {
		@Special(value = "0")
		SYSVAL, @Special(value = "32767")
		NOMAX, OTHER
	}

	public static enum BLOCKPASSWORDCHANGEEnum {
		@Special(value = "-2")
		SYSVAL, @Special(value = "0")
		NONE, OTHER
	}

	public static enum LOCALPASSWORDMANAGEMENTEnum {
		@Special(value = "X'00'")
		YES, @Special(value = "X'01'")
		NO
	}

	public static enum LIMITDEVICESESSIONSEnum {
		@Special(value = "X'40'")
		SYSVAL, @Special(value = "Y")
		YES, @Special(value = "N")
		NO, @Special(value = "0")
		NUM_0, @Special(value = "1")
		NUM_1, @Special(value = "2")
		NUM_2, @Special(value = "3")
		NUM_3, @Special(value = "4")
		NUM_4, @Special(value = "5")
		NUM_5, @Special(value = "6")
		NUM_6, @Special(value = "7")
		NUM_7, @Special(value = "8")
		NUM_8, @Special(value = "9")
		NUM_9
	}

	public static enum KEYBOARDBUFFERINGEnum {
		@Special(value = "X'40'")
		SYSVAL, @Special(value = "0")
		NO, @Special(value = "2")
		TYPEAHEAD, @Special(value = "1")
		YES
	}

	public static enum MAXIMUMALLOWEDSTORAGEEnum {
		@Special(value = "2147483647")
		NOMAX, OTHER
	}

	public static class JOBDESCRIPTION extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "QDFTJOBD")
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum GROUPPROFILEEnum {
		@Special(value = "X'40'")
		NONE, OTHER
	}

	public static enum OWNEREnum {
		@Special(value = "X'99'")
		USRPRF, @Special(value = "X'03'")
		GRPPRF
	}

	public static enum GROUPAUTHORITYEnum {
		@Special(value = "X'00'")
		NONE, @Special(value = "X'02'")
		ALL, @Special(value = "X'01'")
		CHANGE, @Special(value = "X'05'")
		USE, @Special(value = "X'06'")
		EXCLUDE
	}

	public static enum GROUPAUTHORITYTYPEEnum {
		@Special(value = "X'00'")
		PRIVATE, @Special(value = "X'01'")
		PGP
	}

	public static enum SUPPLEMENTALGROUPSEnum {
		@Special(value = "X'40'")
		NONE, OTHER
	}

	public static enum ACCOUNTINGCODEEnum {
		@Special(value = "X'404040404040404040404040404040'")
		BLANK, OTHER
	}

	public static enum DOCUMENTPASSWORDEnum {
		NONE, OTHER
	}

	public static class MESSAGEQUEUE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum MESSAGEQUEUEEnum {
		USRPRF, OTHER
	}

	public static enum DELIVERYEnum {
		@Special(value = "X'40'")
		NOTIFY, @Special(value = "B")
		BREAK, @Special(value = "H")
		HOLD, @Special(value = "D")
		DFT
	}

	public static enum PRINTDEVICEEnum {
		@Special(value = "X'40404040404040404040'")
		WRKSTN, SYSVAL, OTHER
	}

	public static class OUTPUTQUEUE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum OUTPUTQUEUEEnum {
		@Special(value = "X'40404040404040404040'")
		WRKSTN, DEV, OTHER
	}

	public static class ATTENTIONPROGRAM extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum ATTENTIONPROGRAMEnum {
		@Special(value = "X'40404040404040404040'")
		NONE, SYSVAL, ASSIST, OTHER
	}

	public static class SORTSEQUENCE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum SORTSEQUENCEEnum {
		SYSVAL, HEX, LANGIDSHR, LANGIDUNQ, OTHER
	}

	public static enum LANGUAGEIDEnum {
		@Special(value = "X'404040'")
		SYSVAL, OTHER
	}

	public static enum COUNTRYORREGIONIDEnum {
		@Special(value = "X'4040'")
		SYSVAL, OTHER
	}

	public static enum CODEDCHARACTERSETIDEnum {
		@Special(value = "-2")
		SYSVAL, @Special(value = "65535")
		HEX, OTHER
	}

	public static enum CHARACTERIDENTIFIERCONTROLEnum {
		@Special(value = "X'40'")
		SYSVAL, @Special(value = "D")
		DEVD, @Special(value = "J")
		JOBCCSID
	}

	public static enum LOCALEJOBATTRIBUTESEnum {
		@Special(value = "X'8000'")
		SYSVAL, @Special(value = "X'0000'")
		NONE, @Special(value = "X'4000'")
		CCSID, @Special(value = "X'2000'")
		DATFMT, @Special(value = "X'1000'")
		DATSEP, @Special(value = "X'0200'")
		DECFMT, @Special(value = "X'0800'")
		SRTSEQ, @Special(value = "X'0400'")
		TIMSEP
	}

	public static enum LOCALEEnum {
		SYSVAL, NONE, C, POSIX, OTHER
	}

	public static enum USEROPTIONSEnum {
		NONE, CLKWD, EXPERT, ROLLKEY, NOSTSMSG, STSMSG, HLPFULL, PRTMSG
	}

	public static enum USERIDNUMBEREnum {
		@Special(value = "4294967296")
		GEN, OTHER
	}

	public static enum GROUPIDNUMBEREnum {
		@Special(value = "0")
		NONE, @Special(value = "4294967296")
		GEN, OTHER
	}

	public static enum HOMEDIRECTORYEnum {
		@Special(value = "")
		USRPRF, OTHER
	}

	public static class EIMASSOCIATION extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 128)
		public QEnum<EIMIDENTIFIEREnum, QCharacter> eIMIdentifier;
		@DataDef(length = 10)
		public QEnum<ASSOCIATIONTYPEEnum, QCharacter> associationType;
		@DataDef(length = 10, value = "*REPLACE")
		public QEnum<ASSOCIATIONACTIONEnum, QCharacter> associationAction;
		@DataDef(length = 12, value = "*NOCRTEIMID")
		public QEnum<CREATEEIMIDENTIFIEREnum, QCharacter> createEIMIdentifier;

		public static enum EIMIDENTIFIEREnum {
			USRPRF, OTHER
		}

		public static enum ASSOCIATIONTYPEEnum {
			TARGET, SOURCE, TGTSRC, ADMIN, ALL
		}

		public static enum ASSOCIATIONACTIONEnum {
			REPLACE, ADD, REMOVE
		}

		public static enum CREATEEIMIDENTIFIEREnum {
			NOCRTEIMID, CRTEIMID
		}
	}

	public static enum EIMASSOCIATIONEnum {
		NOCHG, OTHER
	}

	public static enum AUTHORITYEnum {
		ALL, CHANGE, USE, EXCLUDE
	}
}
