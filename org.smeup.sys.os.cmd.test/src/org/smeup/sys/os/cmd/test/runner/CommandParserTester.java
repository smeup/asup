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
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.jobs.QJob;

@Test(category = "OSCmd", object = "Parser")
public class CommandParserTester {


	@Inject
	private QCommandManager commandManager;
	@Inject
	private QJob job;
	@Inject
	private QTestAsserter testAsserter;

	private String[] commands = new String[]{"WRKSPLF", "WRKACTJOB"};
	
	@TestStarted
	public void main() throws IOException {
		
		QCallableCommand callableCommand = commandManager.prepareCommand(job, commands[0], null, false);
		testAsserter.assertNotNull("Prepare "+commands[0], callableCommand);
		if(callableCommand != null)
			callableCommand.close();
	}
}