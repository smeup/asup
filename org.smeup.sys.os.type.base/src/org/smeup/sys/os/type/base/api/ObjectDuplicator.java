package org.smeup.sys.os.type.base.api;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;

@Program(name = "QLICRDUP")
public @Supported class ObjectDuplicator {
	public static enum QCPFMSG {
		CPF2130
	}

	public @Entry void main(
			@Supported @DataDef(length = 10) QEnum<FROMOBJECTEnum, QCharacter> fromObject,
			@Supported @DataDef(length = 10) QEnum<FROMLIBRARYEnum, QCharacter> fromLibrary,
			@Supported @DataDef(dimension = 57, length = 7) QEnum<OBJECTTYPEEnum, QScroller<QCharacter>> objectType,
			@Supported @DataDef(length = 10) QEnum<TOLIBRARYEnum, QCharacter> toLibrary,
			@Supported @DataDef(length = 10) QEnum<NEWOBJECTEnum, QCharacter> newObject,
			@DataDef(length = 10) QEnum<FROMASPDEVICEEnum, QCharacter> fromASPDevice,
			@DataDef(length = 10) QEnum<TOASPDEVICEEnum, QCharacter> toASPDevice,
			@Supported @DataDef(length = 1) QEnum<DUPLICATEDATAEnum, QCharacter> duplicateData,
			@DataDef(length = 1) QEnum<DUPLICATECONSTRAINTSEnum, QCharacter> duplicateConstraints,
			@DataDef(length = 1) QEnum<DUPLICATETRIGGERSEnum, QCharacter> duplicateTriggers,
			@DataDef(length = 1) QEnum<DUPLICATEFILEIDENTIFIERSEnum, QCharacter> duplicateFileIdentifiers) {
		throw new UnsupportedOperationException("Da implementare");
	}

	public static enum FROMOBJECTEnum {
		ALL, OTHER
	}

	public static enum FROMLIBRARYEnum {
		LIBL, CURLIB, OTHER
	}

	public static enum OBJECTTYPEEnum {
		ALL, @Special(value = "ALRTBL")
		ALRTBL, @Special(value = "AUTL")
		AUTL, @Special(value = "BNDDIR")
		BNDDIR, @Special(value = "CHTFMT")
		CHTFMT, @Special(value = "CLD")
		CLD, @Special(value = "CLS")
		CLS, @Special(value = "CMD")
		CMD, @Special(value = "CRQD")
		CRQD, @Special(value = "CSI")
		CSI, @Special(value = "CSPMAP")
		CSPMAP, @Special(value = "CSPTBL")
		CSPTBL, @Special(value = "DTAARA")
		DTAARA, @Special(value = "FCT")
		FCT, @Special(value = "FILE")
		FILE, @Special(value = "FNTRSC")
		FNTRSC, @Special(value = "FNTTBL")
		FNTTBL, @Special(value = "FORMDF")
		FORMDF, @Special(value = "FTR")
		FTR, @Special(value = "GSS")
		GSS, @Special(value = "IGCDCT")
		IGCDCT, @Special(value = "IGCSRT")
		IGCSRT, @Special(value = "JOBD")
		JOBD, @Special(value = "JOBQ")
		JOBQ, @Special(value = "LOCALE")
		LOCALE, @Special(value = "MEDDFN")
		MEDDFN, @Special(value = "MENU")
		MENU, @Special(value = "MGTCOL")
		MGTCOL, @Special(value = "MODULE")
		MODULE, @Special(value = "MSGF")
		MSGF, @Special(value = "MSGQ")
		MSGQ, @Special(value = "M36CFG")
		M36CFG, @Special(value = "NODGRP")
		NODGRP, @Special(value = "NODL")
		NODL, @Special(value = "OUTQ")
		OUTQ, @Special(value = "OVL")
		OVL, @Special(value = "PAGDFN")
		PAGDFN, @Special(value = "PAGSEG")
		PAGSEG, @Special(value = "PDFMAP")
		PDFMAP, @Special(value = "PDG")
		PDG, @Special(value = "PGM")
		PGM, @Special(value = "PNLGRP")
		PNLGRP, @Special(value = "PRDAVL")
		PRDAVL, @Special(value = "PRDDFN")
		PRDDFN, @Special(value = "PRDLOD")
		PRDLOD, @Special(value = "PSFCFG")
		PSFCFG, @Special(value = "QMFORM")
		QMFORM, @Special(value = "QMQRY")
		QMQRY, @Special(value = "QRYDFN")
		QRYDFN, @Special(value = "SBSD")
		SBSD, @Special(value = "SCHIDX")
		SCHIDX, @Special(value = "SRVPGM")
		SRVPGM, @Special(value = "SSND")
		SSND, @Special(value = "TBL")
		TBL, @Special(value = "USRIDX")
		USRIDX, @Special(value = "USRSPC")
		USRSPC, @Special(value = "VLDL")
		VLDL, @Special(value = "WSCST")
		WSCST
	}

	public static enum TOLIBRARYEnum {
		@Special(value = "*SAME")
		FROMLIB, SAME, CURLIB, OTHER
	}

	public static enum NEWOBJECTEnum {
		@Special(value = "*SAME")
		OBJ, SAME, OTHER
	}

	public static enum FROMASPDEVICEEnum {
		@Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}

	public static enum TOASPDEVICEEnum {
		ASPDEV, @Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}

	public static enum DUPLICATEDATAEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}

	public static enum DUPLICATECONSTRAINTSEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static enum DUPLICATETRIGGERSEnum {
		@Special(value = "Y")
		YES, @Special(value = "N")
		NO
	}

	public static enum DUPLICATEFILEIDENTIFIERSEnum {
		@Special(value = "N")
		NO, @Special(value = "Y")
		YES
	}
}
