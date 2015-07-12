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
package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobManager;

@SuppressWarnings("unused")
@Program(name = "QCLRTVJA")
public class JobAttributesRetriever {

	@Inject
	private QJob job;

	@Inject
	private QJobManager jobManager;

	public @Entry void main(@ToDo @DataDef(length = 10) QCharacter cLVarForJOB10, @ToDo @DataDef(length = 10) QCharacter cLVarForUSER10, @ToDo @DataDef(length = 6) QCharacter cLVarForNBR6,
			@ToDo @DataDef(length = 10) QCharacter cLVarForCURUSER10, @ToDo @DataDef(length = 1) QCharacter cLVarForTYPE1, @ToDo @DataDef(length = 1) QCharacter cLVarForSUBTYPE1,
			@ToDo @DataDef(length = 165) QCharacter cLVarForSYSLIBL165, @ToDo @DataDef(length = 10) QCharacter cLVarForCURLIB10, @ToDo @DataDef(length = 275) QCharacter userLibraries,
			@ToDo @DataDef(length = 10) QCharacter cLVarForASPGRP10, @ToDo @DataDef(length = 1) QCharacter cLVarForLOGLVL1, @ToDo @DataDef(precision = 2) QDecimal cLVarForLOGSEV20,
			@ToDo @DataDef(length = 10) QCharacter cLVarForLOGTYPE10, @ToDo @DataDef(length = 10) QCharacter cLVarForLOGCLPGM10, @ToDo @DataDef(length = 10) QCharacter cLVarForLOGOUTPUT10,
			@ToDo @DataDef(precision = 2) QDecimal cLVarForJOBMSGQMX20, @ToDo @DataDef(length = 10) QCharacter cLVarForJOBMSGQFL10, @ToDo @DataDef(length = 10) QCharacter cLVarForINQMSGRPY10,
			@ToDo @DataDef(length = 7) QCharacter cLVarForSTSMSG7, @ToDo @DataDef(length = 7) QCharacter cLVarForBRKMSG7, @ToDo @DataDef(length = 13) QCharacter cLVarForDEVRCYACN13,
			@ToDo @DataDef(precision = 5) QDecimal cLVarForRTNCDE50, @ToDo @DataDef(length = 1) QCharacter cLVarForENDSTS1, @ToDo @DataDef(length = 10) QCharacter cLVarForPRTDEV10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForOUTQ10, @ToDo @DataDef(length = 10) QCharacter cLVarForOUTQLIB10, @ToDo @DataDef(length = 10) QCharacter cLVarForSPLFACN10,
			@ToDo @DataDef(length = 30) QCharacter cLVarForPRTTXT30, @ToDo @DataDef(length = 10) QCharacter cLVarForPRTKEYFMT10, @ToDo @DataDef(length = 10) QCharacter cLVarForSRTSEQ10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForSRTSEQLIB10, @ToDo @DataDef(length = 3) QCharacter cLVarForLANGID3, @ToDo @DataDef(length = 2) QCharacter cLVarForCNTRYID2,
			@ToDo @DataDef(precision = 5) QDecimal cLVarForCCSID50, @ToDo @DataDef(precision = 5) QDecimal cLVarForDFTCCSID50, @ToDo @DataDef(length = 10) QCharacter cLVarForCHRIDCTL10,
			@ToDo @DataDef(length = 1) QCharacter cLVarForDECFMT1, @ToDo @DataDef(length = 4) QCharacter cLVarForDATFMT4, @ToDo @DataDef(length = 1) QCharacter cLVarForDATSEP1,
			@ToDo @DataDef(length = 1) QCharacter cLVarForTIMSEP1, @ToDo @DataDef(length = 6) QCharacter cLVarForDATE6, @ToDo @DataDef(length = 7) QCharacter cLVarForCYMDDATE7,
			@ToDo @DataDef(length = 20) QCharacter cLVarForDATETIME20, @ToDo @DataDef(length = 4) QCharacter cLVarForDAYOFWEEK4, @ToDo @DataDef(length = 10) QCharacter cLVarForTIMZON10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForTIMZONABBR10, @ToDo @DataDef(length = 50) QCharacter cLVarForTIMZONFULL50, @ToDo @DataDef(precision = 3) QDecimal cLVarForTIMOFFSET30,
			@ToDo @DataDef(precision = 3) QDecimal cLVarForYEAROFS30, @ToDo @DataDef(length = 15) QCharacter cLVarForACGCDE15, @ToDo @DataDef(length = 8) QCharacter cLVarForSWS8,
			@ToDo @DataDef(precision = 2) QDecimal cLVarForRUNPTY20, @ToDo @DataDef(precision = 7) QDecimal cLVarForTIMESLICE70, @ToDo @DataDef(length = 10) QCharacter cLVarForPURGE10,
			@ToDo @DataDef(precision = 7) QDecimal cLVarForDFTWAIT70, @ToDo @DataDef(length = 10) QCharacter cLVarForSBMMSGQ10, @ToDo @DataDef(length = 10) QCharacter cLVarForSBMMSGQLIB10,
			@ToDo @DataDef(length = 5) QCharacter cLVarForDDMCNV5, @ToDo @DataDef(length = 10) QCharacter cLVarForTSEPOOL10, @ToDo @DataDef(length = 20) QCharacter cLVarForTHDRSCAFN20,
			@ToDo @DataDef(length = 10) QCharacter cLVarForRSCAFNGRP10) {

		userLibraries.clear();
		int length = 0;
		for (String library : job.getLibraries()) {
			
			if (userLibraries.isEmpty())
				userLibraries.cat(library);
			else
				userLibraries.cat(library, 10 - length);
			
			length = library.length();
		}

	}
}
