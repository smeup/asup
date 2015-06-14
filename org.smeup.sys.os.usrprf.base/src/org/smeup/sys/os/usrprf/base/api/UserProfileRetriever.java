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

import org.smeup.sys.dk.core.ToDo;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;

@Program(name = "QSYRTVUP")
public class UserProfileRetriever {

	public static enum QCPFMSG {
	}

	public @Entry void main(@ToDo @DataDef(length = 10) QEnum<USERPROFILEEnum, QCharacter> userProfile, @ToDo @DataDef(length = 10) QCharacter cLVarForRTNUSRPRF10,
			@ToDo @DataDef(length = 100) QCharacter cLVarForSPCAUT100, @ToDo @DataDef(precision = 11) QDecimal cLVarForMAXSTG110, @ToDo @DataDef(precision = 15) QDecimal cLVarForSTGUSED150,
			@ToDo @DataDef(length = 1) QCharacter cLVarForPTYLMT1, @ToDo @DataDef(length = 10) QCharacter cLVarForINLPGM10, @ToDo @DataDef(length = 10) QCharacter cLVarForINLPGMLIB10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForJOBD10, @ToDo @DataDef(length = 10) QCharacter cLVarForJOBDLIB10, @ToDo @DataDef(length = 10) QCharacter cLVarForGRPPRF10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForOWNER10, @ToDo @DataDef(length = 10) QCharacter cLVarForGRPAUT10, @ToDo @DataDef(length = 15) QCharacter cLVarForACGCDE15,
			@ToDo @DataDef(length = 10) QCharacter cLVarForMSGQ10, @ToDo @DataDef(length = 10) QCharacter cLVarForMSGQLIB10, @ToDo @DataDef(length = 10) QCharacter cLVarForOUTQ10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForOUTQLIB10, @ToDo @DataDef(length = 50) QCharacter cLVarForTEXT50, @ToDo @DataDef(length = 6) QCharacter cLVarForPWDCHGDAT6,
			@ToDo @DataDef(length = 10) QCharacter cLVarForUSRCLS10, @ToDo @DataDef(length = 10) QCharacter cLVarForASTLVL10, @ToDo @DataDef(length = 10) QCharacter cLVarForSPCENV10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForCURLIB10, @ToDo @DataDef(length = 10) QCharacter cLVarForINLMNU10, @ToDo @DataDef(length = 10) QCharacter cLVarForINLMNULIB10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForLMTCPB10, @ToDo @DataDef(length = 10) QCharacter cLVarForDLVRY10, @ToDo @DataDef(precision = 2) QDecimal cLVarForSEV20,
			@ToDo @DataDef(length = 10) QCharacter cLVarForPRTDEV10, @ToDo @DataDef(length = 10) QCharacter cLVarForATNPGM10, @ToDo @DataDef(length = 10) QCharacter cLVarForATNPGMLIB10,
			@ToDo @DataDef(length = 240) QCharacter cLVarForUSROPT240, @ToDo @DataDef(length = 7) QCharacter cLVarForDSPSGNINF7, @ToDo @DataDef(precision = 5) QDecimal cLVarForPWDEXPITV50,
			@ToDo @DataDef(length = 4) QCharacter cLVarForPWDEXP4, @ToDo @DataDef(length = 10) QCharacter cLVarForSTATUS10, @ToDo @DataDef(length = 13) QCharacter cLVarForPRVSIGN13,
			@ToDo @DataDef(precision = 11) QDecimal cLVarForNOTVLDSIGN110, @ToDo @DataDef(length = 7) QCharacter cLVarForLMTDEVSSN7, @ToDo @DataDef(length = 10) QCharacter cLVarForKBDBUF10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForLANGID10, @ToDo @DataDef(length = 10) QCharacter cLVarForCNTRYID10, @ToDo @DataDef(precision = 5) QDecimal cLVarForCCSID50,
			@ToDo @DataDef(length = 10) QCharacter cLVarForSRTSEQ10, @ToDo @DataDef(length = 10) QCharacter cLVarForSRTSEQLIB10, @ToDo @DataDef(length = 10) QCharacter cLVarForOBJAUD10,
			@ToDo @DataDef(length = 640) QCharacter cLVarForAUDLVL640, @ToDo @DataDef(length = 10) QCharacter cLVarForGRPAUTTYP10, @ToDo @DataDef(length = 150) QCharacter cLVarForSUPGRPPRF150,
			@ToDo @DataDef(precision = 10) QDecimal cLVarForUID100, @ToDo @DataDef(precision = 10) QDecimal cLVarForGID100, @ToDo @DataDef(length = 160) QCharacter cLVarForSETJOBATR160,
			@ToDo @DataDef(length = 10) QCharacter cLVarForCHRIDCTL10, @ToDo @DataDef(length = 10) QCharacter cLVarForLCLPWDMGT10, @ToDo @DataDef(length = 10) QCharacter cLVarForPWDCHGBLK10) {

		"".toCharArray();
	}

	public static enum USERPROFILEEnum {
		CURRENT, OTHER
	}

}