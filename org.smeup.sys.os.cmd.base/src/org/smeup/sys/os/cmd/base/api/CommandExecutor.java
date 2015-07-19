/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.cmd.base.api;

import java.util.Map;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QCMDEXC")
public class CommandExecutor {

	@Inject
	private QCommandManager commandManager;
	// @Inject
	// private QProgramManager programManager;
	// @Inject
	// private QProgramStatus programStatus;
	@Inject
	private QJob job;

	public CommandExecutor() {
		super();
	}

	@Entry
	public void main(@DataDef(length = 2000) QCharacter command) {

		String commandString = command.trimR();
		Map<String, Object> programsVariables = null;

		// variable environment from caller
		/*
		 * if (commandString.contains("&")) { QCallableProgram caller =
		 * programManager.getCaller(job, programStatus.getCallableProgram()); if
		 * (caller != null) programsVariables = null; // caller.getVariables();
		 * }
		 */

		if(commandString.startsWith("CRTDTAQ"))
			commandString.toCharArray();
		
		QCallableCommand callableCommand = commandManager.prepareCommand(job.getJobID(), commandString, programsVariables, true);
		commandManager.executeCommand(job.getJobID(), callableCommand);
	}
}