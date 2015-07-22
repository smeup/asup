package org.smeup.sys.os.cmd.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.jobs.QJob;

@Program(name = "QCDDCMD")
public class CommandDisplayer {
	public static enum QCPFMSG {
	}

	@Inject
	private QCommandManager commandManager;
	@Inject
	private QJob job;
	
	public @Entry void main(@DataDef(qualified = true) COMMAND command,
							@DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output) {
		//TODO: this implementation is incomplete
		String cmd = "CALL PGM(QASDSPCP) PARM('" + command.name + command.library +  "')";
		QCallableCommand callableCommand = commandManager.prepareCommand(job.getJobID(), cmd, null, true);
		commandManager.executeCommand(job.getJobID(), callableCommand);
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
