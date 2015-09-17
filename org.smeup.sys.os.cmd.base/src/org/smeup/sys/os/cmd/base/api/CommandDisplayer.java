/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.cmd.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.core.out.QOutputManager;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.cmd.base.api.tools.CommandDisplayerHandler;
import org.smeup.sys.os.cmd.base.api.tools.CommandFinder;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QCDDCMD")
public class CommandDisplayer {

	public static enum QCPFMSG {
		CPF6210
	}
	
	@Inject
	private QJob job;
	@Inject
	private QOutputManager outputManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QExceptionManager exceptionManager;
	
	public @Entry void main(@DataDef(qualified = true) COMMAND command,
							@DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output) {
		CommandFinder commandFinder = new CommandFinder(job, resourceManager, exceptionManager);
		QCommand qCommand = commandFinder.find(command.name.trimR(), command.library.asData().trimR());

		CommandDisplayerHandler displayer = null;
		switch (output.asEnum()) {
		case TERM_STAR:
			displayer = new CommandDisplayerHandler(job, outputManager);
			break;

		case PRINT:
			displayer = new CommandDisplayerHandler(job, outputManager, CommandDisplayerHandler.OutputType.PRINT);
			break;
		}
		
		displayer.displayCommand(qCommand);
		displayer.displayParameters(qCommand);
	}

	public static class COMMAND extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10)
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum OUTPUTEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT
	}
}
