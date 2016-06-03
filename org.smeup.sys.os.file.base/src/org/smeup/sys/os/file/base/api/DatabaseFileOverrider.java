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
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberManager;
import org.smeup.sys.os.file.QFileMembered;
import org.smeup.sys.os.file.QFileOverride;
import org.smeup.sys.os.file.QOperatingSystemFileFactory;

@Program(name = "QDMOVERD")
public class DatabaseFileOverrider {

	@Inject
	private QFileManager fileManager;
	@Inject
	private QFileMemberManager fileMemberManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;

	@Main
	public void main(@DataDef(length = 10) QCharacter file, FileRef fileTo, @DataDef(length = 10) QEnum<MEMBEREnum, QCharacter> member) {

		// TODO
		if(member.asData().trimR().startsWith("NTSTRU"))
			member.asData().clear();
		
		try {
			QResourceReader<QFile> fileReader = resourceManager.getResourceReader(job, QFile.class, fileTo.library.asEnum(), fileTo.library.asData().trimR());

			QFile qFile = null;
			QFileMember fileMember = null;

			switch (member.asEnum()) {
			case ALL:
				qFile = fileReader.lookup(fileTo.name.trimR());
				break;
			case FIRST:
				qFile = fileReader.lookup(fileTo.name.trimR());
				if (qFile instanceof QFileMembered) {
					QFileMembered fileMembered = (QFileMembered) qFile;
					fileMember = fileMemberManager.lookupFirst(job, fileMembered);
				}
				break;
			case LAST:
				qFile = fileReader.lookup(fileTo.name.trimR());
				if (qFile instanceof QFileMembered) {
					QFileMembered fileMembered = (QFileMembered) qFile;
					fileMember = fileMemberManager.lookupLast(job, fileMembered);
				}
				break;
			case OTHER:
				if (member.isEmpty()) {
					qFile = fileReader.lookup(fileTo.name.trimR());
				} else {
					fileMember = fileMemberManager.lookup(job, fileTo.library.asEnum(), fileTo.library.asData().trimR(), fileTo.name.trimR(), member.asData().trimR());
					if (fileMember != null)
						qFile = fileMember.getFile();
				}
				break;
			}

			if (qFile == null)
				throw new OperatingSystemRuntimeException("File not found: " + fileTo);

			QFileOverride fileOverride = QOperatingSystemFileFactory.eINSTANCE.createFileOverride();
			fileOverride.setName(file.trimR());
			fileOverride.setFileTo(qFile);
			if (fileMember != null)
				fileOverride.setMemberTo(fileMember.getName());

			fileManager.addFileOverride(job.getContext(), fileOverride);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static enum MEMBEREnum {
		FIRST, LAST, ALL, OTHER
	}
}