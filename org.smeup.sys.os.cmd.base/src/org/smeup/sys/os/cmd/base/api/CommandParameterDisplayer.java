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

import javax.inject.Inject;

import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.cmd.base.api.tools.CommandDisplayerHandler;
import org.smeup.sys.os.cmd.base.api.tools.CommandFinder;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QASDSPCP")
public class CommandParameterDisplayer {

	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QExceptionManager exceptionManager;

	@Entry
	public void main(CommandRef command) {
		CommandFinder commandFinder = new CommandFinder(job, resourceManager, exceptionManager);
		QCommand qCommand = commandFinder.find(command);

		CommandDisplayerHandler displayer = new CommandDisplayerHandler(job, outputManager);
		displayer.displayParameters(qCommand);
	}

}
