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

import java.io.IOException;

import javax.inject.Inject;

import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.cmd.QCommandParameter;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;

@Program(name = "QASDSPCP")
public class CommandParameterDisplayer {

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;

	@Entry
	public void main(CommandRef command) {

		QResourceReader<QCommand> commandReader = null;
		Scope scope = Scope.get(command.library.trimR());
		if (scope != null)
			commandReader = resourceManager.getResourceReader(job, QCommand.class, scope);
		else
			commandReader = resourceManager.getResourceReader(job, QCommand.class, command.library.trimR());

		QCommand qCommand = commandReader.lookup(command.name.trimR());
		if (qCommand == null)
			throw new OperatingSystemRuntimeException("Command not found: " + command.name.trimR());

		QObjectWriter qObjectWriter = outputManager.getDefaultWriter(job.getContext());
		qObjectWriter.initialize();

		for (QCommandParameter qCommandParameter : qCommand.getParameters())
			try {
				qObjectWriter.write(qCommandParameter);
			} catch (IOException e) {
				e.printStackTrace();
			}
		qObjectWriter.flush();
	}
}
