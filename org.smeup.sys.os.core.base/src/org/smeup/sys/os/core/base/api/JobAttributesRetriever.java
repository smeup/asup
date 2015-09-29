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
 *   Franco Lombardo - Further implementation
 */
package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.base.api.tools.JobDateFormatter;
import org.smeup.sys.os.core.jobs.JobType;
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QCLRTVJA")
public class JobAttributesRetriever {

	private static final int UTF_8 = 13496;

	@Inject
	private QJob job;


	public @Entry void main(
			@DataDef(length = 10) QCharacter cLVarForJOB10,
			@DataDef(length = 10) QCharacter cLVarForUSER10,
			@DataDef(length = 6) QCharacter cLVarForNBR6,
			@DataDef(length = 10) QCharacter cLVarForCURUSER10,
			@DataDef(length = 1) QCharacter cLVarForTYPE1,
			@DataDef(length = 1) QCharacter cLVarForSUBTYPE1,
			@DataDef(length = 165) QCharacter clVarForSYSLIBL,
			@DataDef(length = 10) QCharacter clVarForCURLIB,
			@DataDef(length = 275) QCharacter clVarForUSRLIBL,
			@Unsupported @DataDef(length = 10) QCharacter cLVarForASPGRP10,
			@Unsupported @DataDef(length = 1) QCharacter cLVarForLOGLVL1,
			@Unsupported @DataDef(precision = 2) QDecimal cLVarForLOGSEV20,
			@Unsupported @DataDef(length = 10) QCharacter cLVarForLOGTYPE10,
			@Unsupported @DataDef(length = 10) QCharacter cLVarForLOGCLPGM10,
			@Unsupported @DataDef(length = 10) QCharacter cLVarForLOGOUTPUT10,
			@Unsupported @DataDef(precision = 2) QDecimal cLVarForJOBMSGQMX20,
			@Unsupported @DataDef(length = 10) QCharacter cLVarForJOBMSGQFL10,
			@DataDef(length = 10) QCharacter cLVarForINQMSGRPY10,
			@DataDef(length = 7) QCharacter cLVarForSTSMSG7,
			@Unsupported @DataDef(length = 7) QCharacter cLVarForBRKMSG7,
			@Unsupported @DataDef(length = 13) QCharacter cLVarForDEVRCYACN13,
			@ToDo @DataDef(precision = 5) QDecimal cLVarForRTNCDE50,
			@ToDo @DataDef(length = 1) QCharacter cLVarForENDSTS1,
			@ToDo @DataDef(length = 10) QCharacter cLVarForPRTDEV10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForOUTQ10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForOUTQLIB10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForSPLFACN10,
			@ToDo @DataDef(length = 30) QCharacter cLVarForPRTTXT30,
			@ToDo @DataDef(length = 10) QCharacter cLVarForPRTKEYFMT10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForSRTSEQ10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForSRTSEQLIB10,
			@ToDo @DataDef(length = 3) QCharacter cLVarForLANGID3,
			@ToDo @DataDef(length = 2) QCharacter cLVarForCNTRYID2,
			@ToDo @DataDef(precision = 5) QDecimal cLVarForCCSID50,
			@ToDo @DataDef(precision = 5) QDecimal cLVarForDFTCCSID50,
			@ToDo @DataDef(length = 10) QCharacter cLVarForCHRIDCTL10,
			@ToDo @DataDef(length = 1) QCharacter cLVarForDECFMT1,
			@DataDef(length = 4) QCharacter cLVarForDATFMT4,
			@DataDef(length = 1) QCharacter cLVarForDATSEP1,
			@DataDef(length = 1) QCharacter cLVarForTIMSEP1,
			@DataDef(length = 6) QCharacter cLVarForDATE6,
			@ToDo @DataDef(length = 7) QCharacter cLVarForCYMDDATE7,
			@ToDo @DataDef(length = 20) QCharacter cLVarForDATETIME20,
			@ToDo @DataDef(length = 4) QCharacter cLVarForDAYOFWEEK4,
			@ToDo @DataDef(length = 10) QCharacter cLVarForTIMZON10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForTIMZONABBR10,
			@ToDo @DataDef(length = 50) QCharacter cLVarForTIMZONFULL50,
			@ToDo @DataDef(precision = 3) QDecimal cLVarForTIMOFFSET30,
			@ToDo @DataDef(precision = 3) QDecimal cLVarForYEAROFS30,
			@ToDo @DataDef(length = 15) QCharacter cLVarForACGCDE15,
			@ToDo @DataDef(length = 8) QCharacter cLVarForSWS8,
			@ToDo @DataDef(precision = 2) QDecimal cLVarForRUNPTY20,
			@ToDo @DataDef(precision = 7) QDecimal cLVarForTIMESLICE70,
			@ToDo @DataDef(length = 10) QCharacter cLVarForPURGE10,
			@ToDo @DataDef(precision = 7) QDecimal cLVarForDFTWAIT70,
			@ToDo @DataDef(length = 10) QCharacter cLVarForSBMMSGQ10,
			@ToDo @DataDef(length = 10) QCharacter cLVarForSBMMSGQLIB10,
			@ToDo @DataDef(length = 5) QCharacter cLVarForDDMCNV5,
			@ToDo @DataDef(length = 10) QCharacter cLVarForTSEPOOL10,
			@ToDo @DataDef(length = 20) QCharacter cLVarForTHDRSCAFN20,
			@ToDo @DataDef(length = 10) QCharacter cLVarForRSCAFNGRP10) {

		cLVarForJOB10.eval(job.getJobName());
		cLVarForUSER10.eval(job.getCreationInfo().getCreationUser());
		cLVarForNBR6.eval("" + job.getJobNumber());
		cLVarForCURUSER10.eval(job.getJobUser());
		cLVarForTYPE1.eval(varFor(job.getJobType()));
		cLVarForSUBTYPE1.eval("*");
		fillLibraries(clVarForSYSLIBL);
		clVarForCURLIB.eval(job.getCurrentLibrary());
		fillLibraries(clVarForUSRLIBL);
		cLVarForINQMSGRPY10.eval("*DFT");
		cLVarForSTSMSG7.eval("*NORMAL");
		cLVarForSWS8.eval(job.getSwitches());
		cLVarForDATE6.eval(varForDate());
		cLVarForDATFMT4.eval(job.getJobDateFormat().getLiteral());
		cLVarForDATSEP1.eval(job.getDateSeparator());
		cLVarForTIMSEP1.eval(job.getTimeSeparator());
		//
		cLVarForDFTWAIT70.eval(1);
		//
		cLVarForCCSID50.eval(UTF_8);
		cLVarForDFTCCSID50.eval(UTF_8); 
	}

	private String varForDate() {
		return JobDateFormatter.forType(job.getJobDateFormat())
			   .format(job.getCreationInfo().getCreationDate());
	}

	private String varFor(JobType jobType) {
		switch (job.getJobType()) {
		case BATCH:
			return "0";
		case INTERACTIVE:
			return "1";
		case KERNEL:			
			return "2";
		}
		throw new RuntimeException("Unknown job type " + jobType);
	}

	private void fillLibraries(QCharacter userLibraries) {
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
