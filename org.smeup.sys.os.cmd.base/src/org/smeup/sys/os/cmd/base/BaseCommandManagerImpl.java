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
package org.smeup.sys.os.cmd.base;

import java.util.Map;

import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.cmd.QCommandParameter;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.pgm.QProgramManager;


public abstract class BaseCommandManagerImpl implements QCommandManager {

	protected QResourceManager resourceManager;
	protected QJobManager jobManager;
	protected QJobLogManager jobLogManager;
	protected QProgramManager programManager;

	public BaseCommandManagerImpl(QResourceManager resourceManager, QJobManager jobManager, QJobLogManager jobLogManager, QProgramManager programManager) {
		this.resourceManager = resourceManager;
		this.jobManager = jobManager;
		this.jobLogManager = jobLogManager;
		this.programManager = programManager;
	}

	@Override
	public void executeCommand(String contextID, QCallableCommand callableCommand) {

		jobLogManager.info(jobManager.lookup(contextID), callableCommand.getCommandString());

		QDataContainer dataContainer = callableCommand.getDataContainer();

		QData[] parameters = new QData[callableCommand.getCommand().getParameters().size()];
		
		for (QCommandParameter commandParameter : callableCommand.getCommand().getParameters()) {
			int position = commandParameter.getPosition() - 1;
			parameters[position] = dataContainer.getData(dataContainer.getTerms().get(position));
		}

		programManager.callProgram(contextID, null, callableCommand.getCommand().getProgram(), parameters);
	}
	@Override
	public void executeCommandImmediate(String contextID, String command, Map<String, Object> variables, boolean defaults) {
		try {
			QCallableCommand preparedCommand = prepareCommand(contextID, command, variables, defaults);
			executeCommand(contextID, preparedCommand);
		} catch (Exception e) {
			jobLogManager.error(jobManager.lookup(contextID), e.getMessage());
		}
	}
}