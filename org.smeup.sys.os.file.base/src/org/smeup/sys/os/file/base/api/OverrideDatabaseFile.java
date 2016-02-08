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
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberManager;
import org.smeup.sys.os.file.QFileOverride;
import org.smeup.sys.os.file.QOperatingSystemFileFactory;

@Program(name = "QDMOVERD")
public class OverrideDatabaseFile {

	@Inject
	private QFileManager fileManager;
	@Inject
	private QFileMemberManager fileMemberManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;

	@Main
	public void main(@DataDef(length = 10) QCharacter file, FILE fileTo, @DataDef(length = 10) QCharacter member) {

		QFile qFile = null;
		if (member.isEmpty()) {			
			QResourceReader<QFile> fileReader = resourceManager.getResourceReader(job, QFile.class, fileTo.library.asEnum(), fileTo.library.asData().trimR());
			qFile = fileReader.lookup(fileTo.name.trimR());			
		}
		else {
			QFileMember fileMember = fileMemberManager.lookup(job, fileTo.library.asEnum(), fileTo.library.asData().trimR(), fileTo.name.trimR(), member.trimR());
			qFile = (QFile) fileMember.getFile();
		}

		if (qFile == null)
			throw new OperatingSystemRuntimeException("File not found: " + fileTo);

		QFileOverride fileOverride = QOperatingSystemFileFactory.eINSTANCE.createFileOverride();
		fileOverride.setName(file.trimR());
		fileOverride.setFileTo(qFile);
		fileOverride.setMemberTo(member.trimR());

		fileManager.setFileOverride(job.getContext(), fileOverride);
	}

	public static class FILE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<Scope, QCharacter> library;
	}
}