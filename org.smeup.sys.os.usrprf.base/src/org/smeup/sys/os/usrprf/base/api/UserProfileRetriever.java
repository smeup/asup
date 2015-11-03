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
package org.smeup.sys.os.usrprf.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.usrprf.QUserProfile;

@Program(name = "QSYRTVUP")
public class UserProfileRetriever {

	public static enum QCPFMSG {
		CPF2204     //Il profilo utente &1 non è stato trovato.
	}

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;
	
	public @Main void main(@DataDef(length = 10) QEnum<USERPROFILEEnum, QCharacter> userProfile, 
						    @DataDef(length = 10) QCharacter cLVarForRTNUSRPRF10,
							@ToDo @DataDef(length = 100) QCharacter cLVarForSPCAUT100, 
							@ToDo @DataDef(precision = 11) QDecimal cLVarForMAXSTG110, 
							@ToDo @DataDef(precision = 15) QDecimal cLVarForSTGUSED150,
							@ToDo @DataDef(length = 1) QCharacter cLVarForPTYLMT1, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForINLPGM10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForINLPGMLIB10,
							@ToDo @DataDef(length = 10) QCharacter cLVarForJOBD10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForJOBDLIB10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForGRPPRF10,
							@ToDo @DataDef(length = 10) QCharacter cLVarForOWNER10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForGRPAUT10, 
							@ToDo @DataDef(length = 15) QCharacter cLVarForACGCDE15,
							@ToDo @DataDef(length = 10) QCharacter cLVarForMSGQ10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForMSGQLIB10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForOUTQ10,
							@ToDo @DataDef(length = 10) QCharacter cLVarForOUTQLIB10, 
							@ToDo @DataDef(length = 50) QCharacter cLVarForTEXT50, 
							@ToDo @DataDef(length = 6) QCharacter cLVarForPWDCHGDAT6,
							@DataDef(length = 10) QCharacter cLVarForUSRCLS10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForASTLVL10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForSPCENV10,
							@ToDo @DataDef(length = 10) QCharacter cLVarForCURLIB10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForINLMNU10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForINLMNULIB10,
							@ToDo @DataDef(length = 10) QCharacter cLVarForLMTCPB10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForDLVRY10, 
							@ToDo @DataDef(precision = 2) QDecimal cLVarForSEV20,
							@ToDo @DataDef(length = 10) QCharacter cLVarForPRTDEV10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForATNPGM10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForATNPGMLIB10,
							@ToDo @DataDef(length = 240) QCharacter cLVarForUSROPT240, 
							@ToDo @DataDef(length = 7) QCharacter cLVarForDSPSGNINF7, 
							@ToDo @DataDef(precision = 5) QDecimal cLVarForPWDEXPITV50,
							@ToDo @DataDef(length = 4) QCharacter cLVarForPWDEXP4,
							@ToDo @DataDef(length = 10) QCharacter cLVarForSTATUS10, 
							@ToDo @DataDef(length = 13) QCharacter cLVarForPRVSIGN13,
							@ToDo @DataDef(precision = 11) QDecimal cLVarForNOTVLDSIGN110, 
							@ToDo @DataDef(length = 7) QCharacter cLVarForLMTDEVSSN7, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForKBDBUF10,
							@ToDo @DataDef(length = 10) QCharacter cLVarForLANGID10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForCNTRYID10, 
							@ToDo @DataDef(precision = 5) QDecimal cLVarForCCSID50,
							@ToDo @DataDef(length = 10) QCharacter cLVarForSRTSEQ10,
							@ToDo @DataDef(length = 10) QCharacter cLVarForSRTSEQLIB10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForOBJAUD10,
							@ToDo @DataDef(length = 640) QCharacter cLVarForAUDLVL640, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForGRPAUTTYP10,
							@ToDo @DataDef(length = 150) QCharacter cLVarForSUPGRPPRF150,
							@ToDo @DataDef(precision = 10) QDecimal cLVarForUID100, 
							@ToDo @DataDef(precision = 10) QDecimal cLVarForGID100, 
							@ToDo @DataDef(length = 160) QCharacter cLVarForSETJOBATR160,
							@ToDo @DataDef(length = 10) QCharacter cLVarForCHRIDCTL10, 
							@ToDo @DataDef(length = 10) QCharacter cLVarForLCLPWDMGT10,
							@ToDo @DataDef(length = 10) QCharacter cLVarForPWDCHGBLK10) {

		QResourceReader<QUserProfile> resourceReader = resourceManager.getResourceReader(job, QUserProfile.class, job.getSystem().getSystemLibrary());
		String userProfileToSearch = name(userProfile);
		QUserProfile qUserProfile = resourceReader.lookup(userProfileToSearch);
		if (qUserProfile == null) {
			throw exceptionManager.prepareException(job, QCPFMSG.CPF2204, new String[]{userProfileToSearch});
		}
		
		//
		cLVarForRTNUSRPRF10.eval(qUserProfile.getName());
		cLVarForUSRCLS10.eval(qUserProfile.getUserClass().getLiteral());
		cLVarForTEXT50.eval(qUserProfile.getText());
		cLVarForJOBD10.eval(qUserProfile.getJobDescription());
		cLVarForSTATUS10.eval(qUserProfile.isEnabled() ? "*ENABLED" : "*DISABLED");
		
		setInitialProgram(cLVarForINLPGM10, cLVarForINLPGMLIB10, qUserProfile);
	}

	private void setInitialProgram(QCharacter cLVarForINLPGM10,
								   QCharacter cLVarForINLPGMLIB10, 
								   QUserProfile qUserProfile) {
		String[] programLinbAndName = qUserProfile.getInitialProgram().split("/");
		if (programLinbAndName.length == 2) {
			cLVarForINLPGM10.eval(programLinbAndName[1]);
			cLVarForINLPGMLIB10.eval(programLinbAndName[0]);
		} else {
			cLVarForINLPGM10.eval("*NONE");
			cLVarForINLPGMLIB10.eval("");			
		}
	}

	private String name(QEnum<USERPROFILEEnum, QCharacter> userProfile) {
		switch (userProfile.asEnum()) {
		case CURRENT:
			return job.getJobUser();

		case OTHER:			
			return userProfile.asData().trimR();
		}
		throw new RuntimeException("Wrong user profile" + userProfile);
	}

	public static enum USERPROFILEEnum {
		CURRENT, OTHER
	}

}