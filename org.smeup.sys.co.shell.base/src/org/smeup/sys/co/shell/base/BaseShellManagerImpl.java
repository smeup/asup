/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 *   Mattia Rocchi - Implementation
 */
package org.smeup.sys.co.shell.base;

import java.util.Map;

import javax.inject.Inject;

import org.smeup.sys.co.core.QCommunicationManager;
import org.smeup.sys.co.shell.QShellManager;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.jobs.QJobCapability;
import org.smeup.sys.os.core.jobs.QJobManager;

public class BaseShellManagerImpl implements QShellManager {

	@Inject
	private QCommunicationManager communicationManager;
	
	@Override
	public void executeCommand(QJobCapability jobCapability, String command, Map<String, Object> variables) {

		QCommandManager commandManager = communicationManager.locate(jobCapability, QCommandManager.class);		
		commandManager.executeCommand(jobCapability, command, variables);
	}

	@Override
	public QDataContainer decodeCommand(QJobCapability capability, String command) {

		QCommandManager commandManager = communicationManager.locate(capability, QCommandManager.class);
		return commandManager.decodeCommand(capability, command);
	}

	@Override
	public String encodeCommand(QJobCapability capability, QDataContainer dataContainer, boolean showDefaults) {
		
		QCommandManager commandManager = communicationManager.locate(capability, QCommandManager.class);
		return commandManager.encodeCommand(capability, dataContainer, showDefaults);
	}

	@Override
	public void setDefaultWriter(QJobCapability jobCapability, String name) {
		
		QJobManager jobManager = communicationManager.locate(jobCapability, QJobManager.class);
		jobManager.setDefaultWriter(jobCapability, name);
	}
}
