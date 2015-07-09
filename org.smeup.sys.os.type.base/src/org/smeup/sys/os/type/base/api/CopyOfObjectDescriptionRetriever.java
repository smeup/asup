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
package org.smeup.sys.os.type.base.api;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;

@Program(name = "QXXXX")
public class CopyOfObjectDescriptionRetriever {

	public @Entry void main(
			@ToDo @DataDef(qualified = true) Object object, 
			@ToDo @DataDef(length = 7) QEnum<ObjectTypeEnum, QCharacter> objectType, 
			@ToDo ASPDevice aSPDevice,
			@ToDo @DataDef(length = 10) QCharacter cLVarForRTNLIB10, 
			@ToDo @DataDef(length = 10) QCharacter cLVarForOBJATR10, 
			@ToDo @DataDef(length = 10) QCharacter cLVarForUSRDFNATR10,
			@ToDo @DataDef(length = 50) QCharacter cLVarForTEXT50, 
			@ToDo @DataDef(length = 10) QCharacter cLVarForOWNER10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForPGP10,
			@ToDo @DataDef(precision = 2) QDecimal cLVarForASP20, 
			@ToDo @DataDef(precision = 5) QDecimal cLVarForLIBASP50, 
			@ToDo @DataDef(length = 10) QCharacter cLVarForOBJASPDEV10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForOBJASPGRP10, 
			@ToDo @DataDef(length = 10) QCharacter cLVarForLIBASPDEV10, 
			@ToDo @DataDef(length = 10) QCharacter cLVarForLIBASPGRP10,
			@ToDo @DataDef(length = 1) QCharacter cLVarForOVFASP1, 
			@ToDo @DataDef(length = 13) QCharacter cLVarForCRTDATE13, 
			@ToDo @DataDef(length = 13) QCharacter cLVarForCHGDATE13,
			@ToDo @DataDef(length = 13) QCharacter cLVarForSAVDATE13, @ToDo @DataDef(length = 13) QCharacter cLVarForSAVACTDATE13, @ToDo @DataDef(length = 13) QCharacter cLVarForRSTDATE13,
			@ToDo @DataDef(length = 10) QCharacter cLVarForCRTUSER10, @ToDo @DataDef(length = 8) QCharacter cLVarForCRTSYSTEM8, @ToDo @DataDef(length = 2) QCharacter cLVarForOBJDMN2,
			@ToDo @DataDef(length = 1) QCharacter cLVarForUSEUPD1, @ToDo @DataDef(length = 7) QCharacter cLVarForUSEDATE7, @ToDo @DataDef(precision = 5) QDecimal cLVarForUSECOUNT50,
			@ToDo @DataDef(length = 7) QCharacter cLVarForRESETDATE7, @ToDo @DataDef(length = 10) QCharacter cLVarForSTG10, @ToDo @DataDef(length = 1) QCharacter cLVarForCPR1,
			@ToDo @DataDef(precision = 15) QDecimal cLVarForSIZE150, @ToDo @DataDef(precision = 15) QDecimal cLVarForSPCSIZE150, @ToDo @DataDef(length = 1) QCharacter cLVarForSPCALIGN1,
			@ToDo @DataDef(precision = 15) QDecimal cLVarForSAVSIZE150, @ToDo @DataDef(length = 10) QCharacter cLVarForSAVCMD10, @ToDo @DataDef(precision = 4) QDecimal cLVarForSAVSEQNBR40,
			@ToDo @DataDef(precision = 10) QDecimal cLVarForSAVLRGSEQ100, @ToDo @DataDef(length = 71) QCharacter cLVarForSAVVOL71, @ToDo @DataDef(length = 10) QCharacter cLVarForSAVDEV10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForSAVF10, @ToDo @DataDef(length = 10) QCharacter cLVarForSAVFLIB10, @ToDo @DataDef(length = 17) QCharacter cLVarForSAVLABEL17,
			@ToDo @DataDef(length = 10) QCharacter cLVarForSRCF10, @ToDo @DataDef(length = 10) QCharacter cLVarForSRCFLIB10, @ToDo @DataDef(length = 10) QCharacter cLVarForSRCMBR10,
			@ToDo @DataDef(length = 13) QCharacter cLVarForSRCDATE13, @ToDo @DataDef(length = 9) QCharacter cLVarForSYSLVL9, @ToDo @DataDef(length = 16) QCharacter cLVarForCOMPILER16,
			@ToDo @DataDef(length = 8) QCharacter cLVarForOBJLVL8, @ToDo @DataDef(length = 1) QCharacter cLVarForALWAPICHG1, @ToDo @DataDef(length = 1) QCharacter cLVarForAPICHG1,
			@ToDo @DataDef(length = 1) QCharacter cLVarForUSRCHG1, @ToDo @DataDef(length = 16) QCharacter cLVarForLICPGM16, @ToDo @DataDef(length = 10) QCharacter cLVarForPTF10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForAPAR10, @ToDo @DataDef(length = 10) QCharacter cLVarForOBJAUD10, @ToDo @DataDef(length = 1) QCharacter cLVarForOBJSIG1,
			@ToDo @DataDef(length = 1) QCharacter cLVarForSYSSIG1, @ToDo @DataDef(length = 1) QCharacter cLVarForMLTSIG1, @ToDo @DataDef(length = 1) QCharacter cLVarForJRNSTS1,
			@ToDo @DataDef(length = 10) QCharacter cLVarForJRN10, @ToDo @DataDef(length = 10) QCharacter cLVarForJRNLIB10, @ToDo @DataDef(length = 1) QCharacter cLVarForJRNIMG1,
			@ToDo @DataDef(length = 1) QCharacter cLVarForJRNOMTE1, @ToDo @DataDef(length = 13) QCharacter cLVarForJRNSTRDATE13, @ToDo @DataDef(length = 10) QCharacter cLVarForSTRJRNRCV10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForJRNRCVLIB10, @ToDo @DataDef(length = 10) QCharacter cLVarForRCVLIBASP10, @ToDo @DataDef(length = 10) QCharacter cLVarForRCVLIBGRP10) {

		"".toCharArray();
	}

	public static class Object extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum ObjectTypeEnum {
		@Special(value = "ALRTBL")
		ALRTBL, @Special(value = "AUTL")
		AUTL, @Special(value = "BNDDIR")
		BNDDIR, @Special(value = "CFGL")
		CFGL, @Special(value = "CHTFMT")
		CHTFMT, @Special(value = "CLD")
		CLD, @Special(value = "CLS")
		CLS, @Special(value = "CMD")
		CMD, @Special(value = "CNNL")
		CNNL, @Special(value = "COSD")
		COSD, @Special(value = "CRG")
		CRG, @Special(value = "CRQD")
		CRQD, @Special(value = "CSI")
		CSI, @Special(value = "CSPMAP")
		CSPMAP, @Special(value = "CSPTBL")
		CSPTBL, @Special(value = "CTLD")
		CTLD, @Special(value = "DEVD")
		DEVD, @Special(value = "DOC")
		DOC, @Special(value = "DTAARA")
		DTAARA, @Special(value = "DTADCT")
		DTADCT, @Special(value = "DTAQ")
		DTAQ, @Special(value = "EDTD")
		EDTD, @Special(value = "EXITRG")
		EXITRG, @Special(value = "FCT")
		FCT, @Special(value = "FILE")
		FILE, @Special(value = "FLR")
		FLR, @Special(value = "FNTRSC")
		FNTRSC, @Special(value = "FNTTBL")
		FNTTBL, @Special(value = "FORMDF")
		FORMDF, @Special(value = "FTR")
		FTR, @Special(value = "GSS")
		GSS, @Special(value = "IGCDCT")
		IGCDCT, @Special(value = "IGCSRT")
		IGCSRT, @Special(value = "IGCTBL")
		IGCTBL, @Special(value = "IMGCLG")
		IMGCLG, @Special(value = "IPXD")
		IPXD, @Special(value = "JOBD")
		JOBD, @Special(value = "JOBQ")
		JOBQ, @Special(value = "JOBSCD")
		JOBSCD, @Special(value = "JRN")
		JRN, @Special(value = "JRNRCV")
		JRNRCV, @Special(value = "LIB")
		LIB, @Special(value = "LIND")
		LIND, @Special(value = "LOCALE")
		LOCALE, @Special(value = "MEDDFN")
		MEDDFN, @Special(value = "MENU")
		MENU, @Special(value = "MGTCOL")
		MGTCOL, @Special(value = "MODD")
		MODD, @Special(value = "MODULE")
		MODULE, @Special(value = "MSGF")
		MSGF, @Special(value = "MSGQ")
		MSGQ, @Special(value = "M36")
		M36, @Special(value = "M36CFG")
		M36CFG, @Special(value = "NODGRP")
		NODGRP, @Special(value = "NODL")
		NODL, @Special(value = "NTBD")
		NTBD, @Special(value = "NWID")
		NWID, @Special(value = "NWSCFG")
		NWSCFG, @Special(value = "NWSD")
		NWSD, @Special(value = "OUTQ")
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
		SPADCT, @Special(value = "SQLPKG")
		SQLPKG, @Special(value = "SQLUDT")
		SQLUDT, @Special(value = "SRVPGM")
		SRVPGM, @Special(value = "SSND")
		SSND, @Special(value = "SVRSTG")
		SVRSTG, @Special(value = "S36")
		S36, @Special(value = "TBL")
		TBL, @Special(value = "TIMZON")
		TIMZON, @Special(value = "USRIDX")
		USRIDX, @Special(value = "USRPRF")
		USRPRF, @Special(value = "USRQ")
		USRQ, @Special(value = "USRSPC")
		USRSPC, @Special(value = "VLDL")
		VLDL, @Special(value = "WSCST")
		WSCST
	}

	public static class ASPDevice extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<DeviceEnum, QCharacter> device;
		@DataDef(length = 10, value = "*ASP")
		public QEnum<SearchTypeEnum, QCharacter> searchType;

		public static enum DeviceEnum {
			@Special(value = "*")
			TERM_STAR, ALLAVL, CURASPGRP, SYSBAS, OTHER
		}

		public static enum SearchTypeEnum {
			ASP, ASPGRP
		}
	}
}
