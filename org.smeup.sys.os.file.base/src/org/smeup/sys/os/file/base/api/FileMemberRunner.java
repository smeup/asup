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
package org.smeup.sys.os.file.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommandManager;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberManager;
import org.smeup.sys.os.file.QFileMemberRow;
import org.smeup.sys.os.file.QFileMembered;

@Program(name = "QASRUNMB")
public class FileMemberRunner {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QCommandManager commandManager;
	@Inject
	private QJobLogManager jobLogManager;
	@Inject
	private QFileMemberManager fileMemberManager;
	@Inject
	private QJob job;

	@Main 
	public void main(@DataDef(qualified = true) SourceFile sourceFile, @DataDef(length = 10) QCharacter sourceMember) {

		QResourceReader<QFile> fileReader = null;

		switch (sourceFile.library.asEnum()) {
		case CURLIB:
			fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
			break;
		case OTHER:
			fileReader = resourceManager.getResourceReader(job, QFile.class, sourceFile.library.asData().trimR());
			break;
		}

		QFile qFile = fileReader.lookup(sourceFile.name.trimR());

		if (qFile == null)
			throw new OperatingSystemRuntimeException("File not found: " + sourceFile);

		if (!(qFile instanceof QFileMembered))
			throw new OperatingSystemRuntimeException("Invalid file: " + sourceFile);

		QFileMembered fileMembered = (QFileMembered) qFile;

		QFileMember fileMember = fileMemberManager.lookup(job, fileMembered, sourceMember.trimR());
		if (fileMember == null)
			throw new OperatingSystemRuntimeException("File member not found: " + sourceFile + "/" + sourceMember);

		for (QFileMemberRow fileMemberRow : fileMember.getRows()) {
			String line = fileMemberRow.getContent();

			if (line.trim().isEmpty())
				continue;

			if (line.trim().startsWith("//"))
				continue;

			try {
				QCallableCommand command = commandManager.prepareCommand(job, line.trim(), null, true);
				commandManager.executeCommand(job, command);
				command.close();
			} catch (Exception e) {
				jobLogManager.error(job, e.getMessage());
			}
		}
	}

	public static class SourceFile extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LibraryEnum, QCharacter> library;

		public static enum LibraryEnum {
			LIBL, CURLIB, OTHER
		}
	}
}