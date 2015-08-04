package org.smeup.sys.os.cmd.base.api.tools;

import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.cmd.base.api.CommandRef;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;

public class CommandFinder {

	private QJob job;
	private QResourceManager resourceManager;

	public CommandFinder(QJob job, QResourceManager resourceManager) {
		this.job = job;
		this.resourceManager = resourceManager;
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
			throw new OperatingSystemRuntimeException("Command not found: " + commandName);
		return qCommand;
	}

}
