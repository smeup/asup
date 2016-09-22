package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QWCCRTNC")
public @ToDo class NetworkAttributesRetrieve {
	public static enum QCPFMSG {
	}

	@Inject
	private transient QJob job;
	
	@Main
	public void main(@ToDo @DataDef(length = 8) QCharacter cLVarForSYSNAME8, @DataDef(length = 8) QCharacter cLVarForPNDSYSNAME8, @DataDef(length = 8) QCharacter cLVarForLCLNETID8,
			@DataDef(length = 8) QCharacter cLVarForLCLCPNAME8, @DataDef(length = 8) QCharacter cLVarForLCLLOCNAME8, @DataDef(length = 8) QCharacter cLVarForDFTMODE8,
			@DataDef(length = 8) QCharacter cLVarForNODETYPE8, @DataDef(precision = 10) QDecimal cLVarForDTACPR100, @DataDef(precision = 10) QDecimal cLVarForDTACPRINM100,
			@DataDef(precision = 5) QDecimal cLVarForMAXINTSSN50, @DataDef(precision = 5) QDecimal cLVarForRAR50, @DataDef(length = 85) QCharacter cLVarForNETSERVER85,
			@DataDef(length = 10) QCharacter cLVarForALRSTS10, @DataDef(length = 10) QCharacter cLVarForALRPRIFP10, @DataDef(length = 10) QCharacter cLVarForALRDFTFP10,
			@DataDef(length = 7) QCharacter cLVarForALRLOGSTS7, @DataDef(length = 16) QCharacter cLVarForALRBCKFP16, @DataDef(length = 16) QCharacter cLVarForALRRQSFP16,
			@DataDef(length = 10) QCharacter cLVarForALRCTLD10, @DataDef(precision = 5) QDecimal cLVarForALRHLDCNT50, @DataDef(length = 10) QCharacter cLVarForALRFTR10,
			@DataDef(length = 10) QCharacter cLVarForALRFTRLIB10, @DataDef(length = 10) QCharacter cLVarForMSGQ10, @DataDef(length = 10) QCharacter cLVarForMSGQLIB10,
			@DataDef(length = 10) QCharacter cLVarForOUTQ10, @DataDef(length = 10) QCharacter cLVarForOUTQLIB10, @DataDef(length = 10) QCharacter cLVarForJOBACN10,
			@DataDef(precision = 5) QDecimal cLVarForMAXHOP50, @DataDef(length = 10) QCharacter cLVarForDDMACC10, @DataDef(length = 10) QCharacter cLVarForDDMACCLIB10,
			@DataDef(length = 10) QCharacter cLVarForPCSACC10, @DataDef(length = 10) QCharacter cLVarForPCSACCLIB10, @DataDef(length = 10) QCharacter cLVarForDFTNETTYPE10,
			@DataDef(length = 10) QCharacter cLVarForDFTCNNLST10, @DataDef(length = 10) QCharacter cLVarForALWANYNET10, @DataDef(length = 8) QCharacter cLVarForNWSDOMAIN8,
			@DataDef(length = 10) QCharacter cLVarForALWVRTAPPN10, @DataDef(length = 10) QCharacter cLVarForALWHPRTWR10, @DataDef(precision = 5) QDecimal cLVarForVRTAUTODEV50,
			@DataDef(length = 40) QCharacter cLVarForHPRPTHTMR40, @DataDef(length = 10) QCharacter cLVarForALWADDCLU10, @DataDef(length = 2) QCharacter cLVarForMDMCNTRYID2) {
		
		// TODO
		cLVarForSYSNAME8.eval(job.getSystem().getName());
	
	}
}
