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
package org.smeup.sys.os.cmd.base;

import java.util.List;
import java.util.Map;

import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.cmd.QCommandParameter;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.pgm.QProgramManager;

public abstract class BaseCommandManagerImpl implements QCommandManager {

	private QThreadManager threadManager;
	protected QResourceManager resourceManager;
	protected QJobManager jobManager;
	protected QJobLogManager jobLogManager;
	protected QProgramManager programManager;
	protected QDataManager dataManager;

	public BaseCommandManagerImpl(QThreadManager threadManager, QResourceManager resourceManager, QJobManager jobManager, QJobLogManager jobLogManager, QProgramManager programManager, QDataManager dataManager) {
		this.threadManager = threadManager;
		this.resourceManager = resourceManager;
		this.jobManager = jobManager;
		this.jobLogManager = jobLogManager;
		this.programManager = programManager;
		this.dataManager = dataManager;
	}

	@Override
	public void executeCommand(QJob job, QCallableCommand callableCommand) {

//		System.out.println("cmd:\t" + callableCommand.getCommandString());

		jobLogManager.info(job, callableCommand.getCommandString());

		@SuppressWarnings("resource")
		QDataContainer dataContainer = callableCommand.getDataContainer();

		QData[] parameters = new QData[callableCommand.getCommand().getParameters().size()];

		List<QDataTerm<?>> dataTerms = dataContainer.getTerms();
		for (QCommandParameter commandParameter : callableCommand.getCommand().getParameters()) {
			int position = commandParameter.getPosition() - 1;
			parameters[position] = dataContainer.getData(dataTerms.get(position));
		}

		programManager.callProgram(job, null, callableCommand.getCommand().getProgram(), parameters);
	}

	@Override
	public void executeCommand(QJobCapability jobCapability, String command, Map<String, Object> variables) {

		QJob jobLocal = jobManager.lookup(jobCapability);
		QCallableCommand callableCommand = null;
		try {
			callableCommand = prepareCommand(jobLocal, command, variables, true);
			executeCommand(jobLocal, callableCommand);
		} finally {			
			if(callableCommand != null)
				callableCommand.close();
		}
	}

	@Override
	public QJobCapability submitCommand(QJob job, Object caller, String command, String jobName, boolean hold, boolean copyEnvironmentVariables) {

		QJobCapability jobCapability = jobManager.spawn(job, jobName, copyEnvironmentVariables);
		QJob jobSpawned = jobManager.lookup(jobCapability);
		// TODO
		QDataContext dataContext = dataManager.createDataContext(jobSpawned.getContext(), null);

		// Submit command
		String threadName = "job/" + jobCapability.getObjectName();
		QThread thread = threadManager.createThread(threadName, new BaseSubmittedCommand(jobManager, this, jobCapability, dataContext, command, caller));
		jobSpawned.setJobThread(thread);

		threadManager.start(thread);
		if(hold)
			threadManager.suspend(thread);
		
		return jobCapability;
	}

	@Override
	public QDataContainer decodeCommand(QJobCapability capability, String command) {

		QJob job = jobManager.lookup(capability);
		return decodeCommand(job, command);
	}

	@Override
	public QDataContainer decodeCommand(QJob job, String command) {
		return decodeCommand(job, null, command);
	}

	@SuppressWarnings("resource")
	@Override
	public QDataContainer decodeCommand(QJob job, Map<String, Object> variables, String command) {

		QCallableCommand callableCommand = prepareCommand(job, command, variables, false);
		return callableCommand.getDataContainer();
	}

	@Override
	public String encodeCommand(QJobCapability capability, QDataContainer container, boolean showDefaults) {
		return BaseCommandHelper.encodeCommand(container, showDefaults);
	}

	@Override
	public String encodeCommand(QJob job, QDataContainer container, boolean showDefaults) {
		return BaseCommandHelper.encodeCommand(container, showDefaults);
	}
}