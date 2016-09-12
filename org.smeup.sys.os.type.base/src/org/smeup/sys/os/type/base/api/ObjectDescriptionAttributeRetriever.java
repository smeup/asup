package org.smeup.sys.os.type.base.api;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;

@Program(name = "QLIRTVOB")
public @ToDo class ObjectDescriptionAttributeRetriever {
	public static enum QCPFMSG {
		CPF9812, CPF9801
	}

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QJob job;

	@Main
	public void main(@Supported @DataDef(qualified = true) OBJECT object, @Supported @DataDef(length = 7) QEnum<OBJECTTYPEEnum, QCharacter> objectType, QEnum<ASPDEVICEEnum, ASPDEVICE> aSPDevice,
			@Supported @DataDef(length = 10) QCharacter cLVarForRTNLIB10, @Supported @DataDef(length = 10) QCharacter cLVarForOBJATR10, @DataDef(length = 10) QCharacter cLVarForUSRDFNATR10,
			@Supported @DataDef(length = 50) QCharacter cLVarForTEXT50, @ToDo @DataDef(length = 10) QCharacter cLVarForOWNER10, @DataDef(length = 10) QCharacter cLVarForPGP10,
			@DataDef(precision = 2, packed = true) QDecimal cLVarForASP20, @DataDef(precision = 5, packed = true) QDecimal cLVarForLIBASP50, @DataDef(length = 10) QCharacter cLVarForOBJASPDEV10,
			@DataDef(length = 10) QCharacter cLVarForOBJASPGRP10, @DataDef(length = 10) QCharacter cLVarForLIBASPDEV10, @DataDef(length = 10) QCharacter cLVarForLIBASPGRP10,
			@DataDef(length = 1) QCharacter cLVarForOVFASP1, @Supported @DataDef(length = 13) QCharacter cLVarForCRTDATE13, @DataDef(length = 13) QCharacter cLVarForCHGDATE13,
			@DataDef(length = 13) QCharacter cLVarForSAVDATE13, @DataDef(length = 13) QCharacter cLVarForSAVACTDATE13, @DataDef(length = 13) QCharacter cLVarForRSTDATE13,
			@Supported @DataDef(length = 10) QCharacter cLVarForCRTUSER10, @DataDef(length = 8) QCharacter cLVarForCRTSYSTEM8, @DataDef(length = 2) QCharacter cLVarForOBJDMN2,
			@DataDef(length = 1) QCharacter cLVarForUSEUPD1, @DataDef(length = 7) QCharacter cLVarForUSEDATE7, @DataDef(precision = 5, packed = true) QDecimal cLVarForUSECOUNT50,
			@DataDef(length = 7) QCharacter cLVarForRESETDATE7, @DataDef(length = 10) QCharacter cLVarForSTG10, @DataDef(length = 1) QCharacter cLVarForCPR1,
			@ToDo @DataDef(precision = 15, packed = true) QDecimal cLVarForSIZE150, @DataDef(precision = 15, packed = true) QDecimal cLVarForSPCSIZE150, @DataDef(length = 1) QCharacter cLVarForSPCALIGN1,
			@DataDef(precision = 15, packed = true) QDecimal cLVarForSAVSIZE150, @DataDef(length = 10) QCharacter cLVarForSAVCMD10, @DataDef(precision = 4, packed = true) QDecimal cLVarForSAVSEQNBR40,
			@DataDef(precision = 10, packed = true) QDecimal cLVarForSAVLRGSEQ100, @DataDef(length = 71) QCharacter cLVarForSAVVOL71, @DataDef(length = 10) QCharacter cLVarForSAVDEV10,
			@DataDef(length = 10) QCharacter cLVarForSAVF10, @DataDef(length = 10) QCharacter cLVarForSAVFLIB10, @DataDef(length = 17) QCharacter cLVarForSAVLABEL17,
			@ToDo @DataDef(length = 10) QCharacter cLVarForSRCF10, @ToDo @DataDef(length = 10) QCharacter cLVarForSRCFLIB10, @ToDo @DataDef(length = 10) QCharacter cLVarForSRCMBR10,
			@DataDef(length = 13) QCharacter cLVarForSRCDATE13, @DataDef(length = 9) QCharacter cLVarForSYSLVL9, @DataDef(length = 16) QCharacter cLVarForCOMPILER16,
			@ToDo @DataDef(length = 8) QCharacter cLVarForOBJLVL8, @DataDef(length = 1) QCharacter cLVarForALWAPICHG1, @DataDef(length = 1) QCharacter cLVarForAPICHG1,
			@DataDef(length = 1) QCharacter cLVarForUSRCHG1, @DataDef(length = 16) QCharacter cLVarForLICPGM16, @DataDef(length = 10) QCharacter cLVarForPTF10,
			@DataDef(length = 10) QCharacter cLVarForAPAR10, @DataDef(length = 10) QCharacter cLVarForOBJAUD10, @DataDef(length = 1) QCharacter cLVarForOBJSIG1,
			@DataDef(length = 1) QCharacter cLVarForSYSSIG1, @DataDef(length = 1) QCharacter cLVarForMLTSIG1, @DataDef(length = 1) QCharacter cLVarForJRNSTS1,
			@DataDef(length = 10) QCharacter cLVarForJRN10, @DataDef(length = 10) QCharacter cLVarForJRNLIB10, @DataDef(length = 1) QCharacter cLVarForJRNIMG1,
			@DataDef(length = 1) QCharacter cLVarForJRNOMTE1, @DataDef(length = 13) QCharacter cLVarForJRNSTRDATE13, @DataDef(length = 10) QCharacter cLVarForSTRJRNRCV10,
			@DataDef(length = 10) QCharacter cLVarForJRNRCVLIB10, @DataDef(length = 10) QCharacter cLVarForRCVLIBASP10, @DataDef(length = 10) QCharacter cLVarForRCVLIBGRP10) {

		// TODO remove star or remove enum
		QType<?> type = typeRegistry.lookup("*" + objectType.asData().trimR());
		if (type == null)
			return;

		QResourceReader<?> resourceReader = null;

		switch (object.library.asEnum()) {
		case CURLIB:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), Scope.LIBRARY_LIST);
			break;
		case OTHER:
			resourceReader = resourceManager.getResourceReader(job, type.getTypedClass(), object.library.asData().trimR());
			break;
		}

		QObjectNameable objectNameable = resourceReader.lookup(object.name.trimR());
		;
		if (objectNameable instanceof QTypedObject) {
			QTypedObject typedObject = (QTypedObject) objectNameable;
			if (typedObject != null) {
				cLVarForTEXT50.eval(typedObject.getText());
				cLVarForRTNLIB10.eval(typedObject.getLibrary());
				if(typedObject.getAttribute() != null)
					cLVarForOBJATR10.eval(typedObject.getAttribute());
				else
					cLVarForOBJATR10.clear();
					
				cLVarForCRTDATE13.eval(formatDate(typedObject.getCreationInfo().getCreationDate()));
				cLVarForCRTUSER10.eval(typedObject.getCreationInfo().getCreationUser());
			}
		}
	}

	private String formatDate(Date date) {
		return "1" + new SimpleDateFormat("yyMMddhhmmss").format(date);
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
		@Special(value = "ALRTBL") ALRTBL, @Special(value = "AUTL") AUTL, @Special(value = "BNDDIR") BNDDIR, @Special(value = "CFGL") CFGL, @Special(value = "CHTFMT") CHTFMT, @Special(value = "CLD") CLD, @Special(value = "CLS") CLS, @Special(value = "CMD") CMD, @Special(value = "CNNL") CNNL, @Special(value = "COSD") COSD, @Special(value = "CRG") CRG, @Special(value = "CRQD") CRQD, @Special(value = "CSI") CSI, @Special(value = "CSPMAP") CSPMAP, @Special(value = "CSPTBL") CSPTBL, @Special(value = "CTLD") CTLD, @Special(value = "DEVD") DEVD, @Special(value = "DOC") DOC, @Special(value = "DTAARA") DTAARA, @Special(value = "DTADCT") DTADCT, @Special(value = "DTAQ") DTAQ, @Special(value = "EDTD") EDTD, @Special(value = "EXITRG") EXITRG, @Special(value = "FCT") FCT, @Special(value = "FILE") FILE, @Special(value = "FLR") FLR, @Special(value = "FNTRSC") FNTRSC, @Special(value = "FNTTBL") FNTTBL, @Special(value = "FORMDF") FORMDF, @Special(value = "FTR") FTR, @Special(value = "GSS") GSS, @Special(value = "IGCDCT") IGCDCT, @Special(value = "IGCSRT") IGCSRT, @Special(value = "IGCTBL") IGCTBL, @Special(value = "IMGCLG") IMGCLG, @Special(value = "IPXD") IPXD, @Special(value = "JOBD") JOBD, @Special(value = "JOBQ") JOBQ, @Special(value = "JOBSCD") JOBSCD, @Special(value = "JRN") JRN, @Special(value = "JRNRCV") JRNRCV, @Special(value = "LIB") LIB, @Special(value = "LIND") LIND, @Special(value = "LOCALE") LOCALE, @Special(value = "MEDDFN") MEDDFN, @Special(value = "MENU") MENU, @Special(value = "MGTCOL") MGTCOL, @Special(value = "MODD") MODD, @Special(value = "MODULE") MODULE, @Special(value = "MSGF") MSGF, @Special(value = "MSGQ") MSGQ, @Special(value = "M36") M36, @Special(value = "M36CFG") M36CFG, @Special(value = "NODGRP") NODGRP, @Special(value = "NODL") NODL, @Special(value = "NTBD") NTBD, @Special(value = "NWID") NWID, @Special(value = "NWSCFG") NWSCFG, @Special(value = "NWSD") NWSD, @Special(value = "OUTQ") OUTQ, @Special(value = "OVL") OVL, @Special(value = "PAGDFN") PAGDFN, @Special(value = "PAGSEG") PAGSEG, @Special(value = "PDFMAP") PDFMAP, @Special(value = "PDG") PDG, @Special(value = "PGM") PGM, @Special(value = "PNLGRP") PNLGRP, @Special(value = "PRDAVL") PRDAVL, @Special(value = "PRDDFN") PRDDFN, @Special(value = "PRDLOD") PRDLOD, @Special(value = "PSFCFG") PSFCFG, @Special(value = "QMFORM") QMFORM, @Special(value = "QMQRY") QMQRY, @Special(value = "QRYDFN") QRYDFN, @Special(value = "RCT") RCT, @Special(value = "SBSD") SBSD, @Special(value = "SCHIDX") SCHIDX, @Special(value = "SPADCT") SPADCT, @Special(value = "SQLPKG") SQLPKG, @Special(value = "SQLUDT") SQLUDT, @Special(value = "SRVPGM") SRVPGM, @Special(value = "SSND") SSND, @Special(value = "SVRSTG") SVRSTG, @Special(value = "S36") S36, @Special(value = "TBL") TBL, @Special(value = "TIMZON") TIMZON, @Special(value = "USRIDX") USRIDX, @Special(value = "USRPRF") USRPRF, @Special(value = "USRQ") USRQ, @Special(value = "USRSPC") USRSPC, @Special(value = "VLDL") VLDL, @Special(value = "WSCST") WSCST
	}

	public static class ASPDEVICE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter device;
		@DataDef(length = 10, value = "*ASP")
		public QEnum<SEARCHTYPEEnum, QCharacter> searchType;

		public static enum SEARCHTYPEEnum {
			ASP, ASPGRP
		}
	}

	public static enum ASPDEVICEEnum {
		@Special(value = "*") TERM_STAR, ALLAVL, CURASPGRP, SYSBAS, OTHER
	}
}
