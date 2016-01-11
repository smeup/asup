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

import org.smeup.sys.il.core.QThread;
import org.smeup.sys.il.core.QThreadManager;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.cmd.QCommandParameter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.core.jobs.QJobManager;
import org.smeup.sys.os.pgm.QProgramManager;


public abstract class BaseCommandManagerImpl implements QCommandManager {

	private QThreadManager threadManager;
	protected QResourceManager resourceManager;
	protected QJobManager jobManager;
	protected QJobLogManager jobLogManager;
	protected QProgramManager programManager;
	
	public BaseCommandManagerImpl(QThreadManager threadManager, QResourceManager resourceManager, QJobManager jobManager, QJobLogManager jobLogManager, QProgramManager programManager) {
		this.threadManager = threadManager;
		this.resourceManager = resourceManager;
		this.jobManager = jobManager;
		this.jobLogManager = jobLogManager;
		this.programManager = programManager;
	}

	@Override
	public void executeCommand(String contextID, QCallableCommand callableCommand) {

		// TODO create a dataContainer visitor with replaced variables 
		jobLogManager.info(jobManager.lookup(contextID), callableCommand.getCommandString());

		@SuppressWarnings("resource")
		QDataContainer dataContainer = callableCommand.getDataContainer();

		QData[] parameters = new QData[callableCommand.getCommand().getParameters().size()];
		
		for (QCommandParameter commandParameter : callableCommand.getCommand().getParameters()) {
			int position = commandParameter.getPosition() - 1;
			parameters[position] = dataContainer.getData(dataContainer.getTerms().get(position));
		}

		programManager.callProgram(contextID, null, callableCommand.getCommand().getProgram(), parameters);
	}
	
	@Override
	public void executeCommand(String contextID, String command, Map<String, Object> variables) {
		try {
			QCallableCommand callableCommand = prepareCommand(contextID, command, variables, true);
			executeCommand(contextID, callableCommand);
			callableCommand.close();
		} catch (Exception e) {
			jobLogManager.error(jobManager.lookup(contextID), e.getMessage());
		}
	}

	@Override
	public QJob submitJob(String contextID, String command, String jobName, Object caller) {

		QJob credential = jobManager.lookup(contextID);
		if (credential == null)
			throw new OperatingSystemRuntimeException("Invalid contextID");
		
		QJob job = null;
		if(jobName != null) 
			job = jobManager.create(credential, jobName);
		else
			job = jobManager.create(credential);
		
		// Submit command
		String threadName = "job/" + job.getJobNumber() + "-" + job.getJobUser() + "-" + job.getJobName();
		QThread thread = threadManager.createThread(threadName, new BaseSubmittedCommand(job, command, caller));
		job.setJobThread(thread);
		threadManager.start(thread);		

		return job;
	}
}