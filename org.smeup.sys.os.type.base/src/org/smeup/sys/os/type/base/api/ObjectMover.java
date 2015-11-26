package org.smeup.sys.os.type.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.type.QTypeRegistry;

@Supported
@Program(name = "QLIMVOBJ")
public @ToDo class ObjectMover {
	public static enum QCPFMSG {
		CPF2105,     //Non trovato oggetto &1 in &2 tipo *&3.       
		CPF2110,     //Libreria &1 non trovata.                     
		CPF2112,     //L'oggetto &1 in &2 di tipo *&3 già esiste.
		CPD0090,    //Il valore del parametro &2 non può essere uguale a &3
	}

	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;
	
	@Main
	public void main(
			@Supported @DataDef(qualified = true) OBJECT object,
			@Supported @DataDef(length = 7) QEnum<OBJECTTYPEEnum, QCharacter> objectType,
			@Supported @DataDef(length = 10) QEnum<TOLIBRARYEnum, QCharacter> toLibrary,
			@DataDef(length = 10) QEnum<FROMASPDEVICEEnum, QCharacter> fromASPDevice,
			@DataDef(length = 10) QEnum<TOASPDEVICEEnum, QCharacter> toASPDevice) {
		
		if ("QTEMP".equals(toLibrary.asData().trimR())) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPD0090, new String[]{"", "TOLIB", "QTEMP"});
		}
	}

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

	public static enum OBJECTTYPEEnum {
		@Special(value = "ALRTBL")
		ALRTBL, @Special(value = "BNDDIR")
		BNDDIR, @Special(value = "CHTFMT")
		CHTFMT, @Special(value = "CLD")
		CLD, @Special(value = "CLS")
		CLS, @Special(value = "CMD")
		CMD, @Special(value = "CRQD")
		CRQD, @Special(value = "CSI")
		CSI, @Special(value = "CSPMAP")
		CSPMAP, @Special(value = "CSPTBL")
		CSPTBL, @Special(value = "DTAARA")
		DTAARA, @Special(value = "DTAQ")
		DTAQ, @Special(value = "FCT")
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
		JOBQ, @Special(value = "JRN")
		JRN, @Special(value = "JRNRCV")
		JRNRCV, @Special(value = "LOCALE")
		LOCALE, @Special(value = "MEDDFN")
		MEDDFN, @Special(value = "MENU")
		MENU, @Special(value = "MGTCOL")
		MGTCOL, @Special(value = "MODULE")
		MODULE, @Special(value = "MSGF")
		MSGF, @Special(value = "MSGQ")
		MSGQ, @Special(value = "M36")
		M36, @Special(value = "M36CFG")
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
		QRYDFN, @Special(value = "RCT")
		RCT, @Special(value = "SBSD")
		SBSD, @Special(value = "SCHIDX")
		SCHIDX, @Special(value = "SPADCT")
		SPADCT, @Special(value = "SRVPGM")
		SRVPGM, @Special(value = "SSND")
		SSND, @Special(value = "SVRSTG")
		SVRSTG, @Special(value = "TBL")
		TBL, @Special(value = "USRIDX")
		USRIDX, @Special(value = "USRQ")
		USRQ, @Special(value = "USRSPC")
		USRSPC, @Special(value = "VLDL")
		VLDL, @Special(value = "WSCST")
		WSCST
	}

	public static enum TOLIBRARYEnum {
		CURLIB, OTHER
	}

	public static enum FROMASPDEVICEEnum {
		@Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}

	public static enum TOASPDEVICEEnum {
		ASPDEV, @Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}
}
