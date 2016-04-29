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

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.jobs.QJob;

@Test(object = "Decoder")
public class CommandDecoderTester {


	@Inject
	private QCommandManager commandManager;
	@Inject
	private QJob job;
	@Inject
	private QTestAsserter testAsserter;

	private String[] commands = new String[]{"WRKCMD CMD(WRKCMD)", "CHGCMD CMD(WRKCMD) ALLOW(*IREXX *IPGM *INTERACT *BMOD)"};
	
	@SuppressWarnings("unchecked")
	@TestStarted
	public void main() throws IOException {
		
		QDataContainer dataContainer = commandManager.decodeCommand(job, commands[0]);
		testAsserter.assertNotNull("Decode "+commands[0], dataContainer);
		
		System.out.println(commandManager.encodeCommand(job, dataContainer, false));
		
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
		
	}
}