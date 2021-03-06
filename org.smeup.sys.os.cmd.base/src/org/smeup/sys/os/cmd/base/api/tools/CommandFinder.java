/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.cmd.base.api.tools;

import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.cmd.base.api.CommandDisplayer;
import org.smeup.sys.os.cmd.base.api.CommandRef;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;

public class CommandFinder {
	
	private QJob job;
	private QResourceManager resourceManager;
	private QExceptionManager exceptionManager;

	public CommandFinder(QJob job, QResourceManager resourceManager, QExceptionManager exceptionManager) {
		this.job = job;
		this.resourceManager = resourceManager;
		this.exceptionManager = exceptionManager;
	}

	public QCommand find(CommandRef command) {
		return find(command.name.trimR(), command.library.trimR());
	}


	public QCommand find(String commandName, String commandLibrary) {
		QResourceReader<QCommand> commandReader = null;
		Scope scope = Scope.get(commandLibrary);
		if (scope != null)
			commandReader = resourceManager.getResourceReader(job, QCommand.class, scope);
		else
			commandReader = resourceManager.getResourceReader(job, QCommand.class, commandLibrary);

		QCommand qCommand = commandReader.lookup(commandName);
		if (qCommand == null)
			throw exceptionManager.prepareException(job, CommandDisplayer.QCPFMSG.CPF6210, new String[] {commandName, commandLibrary});		
		return qCommand;
	}

}
