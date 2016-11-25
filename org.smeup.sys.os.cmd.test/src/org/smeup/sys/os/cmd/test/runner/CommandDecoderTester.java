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
 */
package org.smeup.sys.os.cmd.test.runner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.data.QAdapter;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.jobs.QJob;

@Test(object = "Decoder")
public class CommandDecoderTester {


	@Inject
	private QCommandManager commandManager;
	@Inject
	private QJob job;
	@Inject
	public transient QTestAsserter testAsserter;

	private transient static String[] commands = new String[]{"WRKCMD CMD(WRKCMD)", 
 															  "CHGCMD CMD(WRKCMD) ALLOW(*IREXX *IPGM *INTERACT *BMOD)",
															  "CALL PGM(B£DMSG1) PARM('PIPPO' 'BAS0042' 'MSGBA')",
															  "CALL PGM(B£DMSG1) PARM(&DMSAZ 'BAS0042' 'MSGBA')",
															  "ALCOBJ OBJ((SMEUP_OBJ/MUTE01_01 *PGM *SHRRD) (SMEUP_OBJ/MUTE01_02 *PGM *EXCLRD))"
															 };

	@DataDef(length = 2, value = "1 ")
	private QCharacter dmsaz;

	@SuppressWarnings("unchecked")
	@TestStarted
	public void main() throws IOException {
		
		QDataContainer dataContainer = commandManager.decodeCommand(job, commands[0]);
		testAsserter.assertNotNull("Decode "+commands[0], dataContainer);		
		QCharacter objectType = (QCharacter)dataContainer.getData("OBJTYPE");
		testAsserter.assertTrue(commands[0]+" objectType=*CMD", objectType.eq("*CMD"));		
		QDataStruct dataStruct = (QDataStruct)dataContainer.getData("CMD");
		testAsserter.assertTrue(commands[0]+" CMD.library=*LIBL", ((QCharacter)dataStruct.getElement("library")).eq("*LIBL"));
		testAsserter.assertTrue(commands[0]+" CMD.nameGeneric=WRKCMD", ((QCharacter)dataStruct.getElement("nameGeneric")).eq("WRKCMD"));		
		if(dataContainer != null)
			dataContainer.close();
		
		dataContainer = commandManager.decodeCommand(job, commands[1]);
		testAsserter.assertNotNull("Decode "+commands[1], dataContainer);		
		QScroller<QBinary> allow = (QScroller<QBinary>)dataContainer.getData("ALLOW");
		testAsserter.assertTrue(commands[1]+" ALLOW(01)=64", allow.get(1).eq(64));
		testAsserter.assertTrue(commands[1]+" ALLOW(02)=8", allow.get(2).eq(8));
		testAsserter.assertTrue(commands[1]+" ALLOW(03)=2", allow.get(3).eq(2));
		testAsserter.assertTrue(commands[1]+" ALLOW(04)=128", allow.get(4).eq(128));		
		if(dataContainer != null)
			dataContainer.close();
		
		dataContainer = commandManager.decodeCommand(job, null, commands[2]);
		testAsserter.assertNotNull("Decode "+commands[2], dataContainer);		
		QList<QAdapter> parm = (QList<QAdapter>)dataContainer.getData("PARM");		
		testAsserter.assertTrue(commands[2]+" PARM(02)='BAS0042'", ((QString)parm.get(2).getDelegate()).eq("BAS0042"));
		if(dataContainer != null)
			dataContainer.close();
		
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("dmsaz", dmsaz);		
		dataContainer = commandManager.decodeCommand(job, variables, commands[3]);
		testAsserter.assertNotNull("Decode "+commands[3], dataContainer);		
		parm = (QList<QAdapter>)dataContainer.getData("PARM");		
		testAsserter.assertTrue(commands[3]+" PARM(01)=&DMSAZ", ((QString)parm.get(1).getDelegate()).eq("1"));
		testAsserter.assertTrue(commands[3]+" PARM(02)='BAS0042'", ((QString)parm.get(2).getDelegate()).eq("BAS0042"));
		testAsserter.assertTrue(commands[3]+" PARM(03)='MSGBA'", ((QString)parm.get(3).getDelegate()).eq("MSGBA"));
		if(dataContainer != null)
			dataContainer.close();
		
		dataContainer = commandManager.decodeCommand(job, commands[4]);
		testAsserter.assertNotNull("Decode "+commands[4], dataContainer);

		int i = 1;
		for(QDataStruct objSpecification: (Iterable<QDataStruct>)dataContainer.getData("OBJ")) {
			QDataStruct obj = (QDataStruct) objSpecification.getElement("object");
			testAsserter.assertTrue(commands[4]+" OBJ.library=SMEUP_OBJ", ((QCharacter)obj.getElement("library")).eq("SMEUP_OBJ"));

			QCharacter objType = (QCharacter) objSpecification.getElement("objectType");
			testAsserter.assertTrue(commands[4]+" OBJ.objectType=*PGM", objType.eq("*PGM"));

			QNumeric lockState = (QNumeric) objSpecification.getElement("lockState");
			switch (i) {
			case 1:
				testAsserter.assertTrue(commands[4]+" OBJ.name=MUTE01_01", ((QCharacter)obj.getElement("name")).eq("MUTE01_01"));
				testAsserter.assertTrue(commands[4]+" OBJ.lockState=*SHRRD", lockState.eq(1));

				break;
			case 2:				
				testAsserter.assertTrue(commands[4]+" OBJ.name=MUTE01_02", ((QCharacter)obj.getElement("name")).eq("MUTE01_02"));
				testAsserter.assertTrue(commands[4]+" OBJ.lockState=*EXCLRD", lockState.eq(4));
				break;
			}
			
			i++;
		}
		
		QNumeric wait = (QNumeric) dataContainer.getData("WAIT");
		testAsserter.assertTrue(commands[4]+" wait=*CLS", wait.eq(-1));
		
		QCharacter scope = (QCharacter) dataContainer.getData("SCOPE");
		testAsserter.assertTrue(commands[4]+" scope=*JOB", scope.eq("J"));
		
		if(dataContainer != null)
			dataContainer.close();

	}
}