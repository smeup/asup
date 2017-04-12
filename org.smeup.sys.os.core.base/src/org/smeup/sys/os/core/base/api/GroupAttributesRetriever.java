/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;

@Program(name = "QWTCCRVG")
public class GroupAttributesRetriever {

	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	@Main
	public void main(@ToDo @DataDef(length = 10) QCharacter cLVarForGRPJOB10, @ToDo @DataDef(length = 1056) QCharacter cLVarForGRPJOBList1056,
			@ToDo @DataDef(precision = 3) QDecimal cLVarForGRPJOBCNT30, @ToDo @DataDef(length = 10) QCharacter cLVarForMSGQ10, @ToDo @DataDef(length = 10) QCharacter cLVarForMSGQLIB10,
			@ToDo @DataDef(length = 16) QCharacter cLVarForPRVGRPJOB16, @ToDo @DataDef(precision = 3) QDecimal cLVarForCTLCDE30) {

		"".toCharArray();
		jobLogManager.error(job, "***TODO*** Implement API - QWTCCRVG - GroupAttributesRetriever");
		System.err.println("***TODO*** Implement API - QWTCCRVG - GroupAttributesRetriever");
	}
}
