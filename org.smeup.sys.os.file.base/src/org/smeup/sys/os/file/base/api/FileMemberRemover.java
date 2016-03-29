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
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberManager;
import org.smeup.sys.os.file.QFileMembered;

@Program(name = "QDDDMBR")
public class FileMemberRemover {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QFileMemberManager fileMemberManager;
	@Inject
	private QJob job;
	
	public static enum QCPFMSG {
		// TODO 
	}

	@Main
	public void main(@DataDef(qualified = true) FileRef fileRef, @DataDef(length = 10) QEnum<MEMBEREnum, QCharacter> member) {
		
		QResourceReader<QFile> fileReader = resourceManager.getResourceReader(job, QFile.class, fileRef.library.asEnum(), fileRef.library.asData().trimR()); 
		for(QFile file: fileReader.find(fileRef.name.trimR())) {
			if(!(file instanceof QFileMembered))
				continue;
			QFileMembered fileMembered = (QFileMembered)file;
			
			switch (member.asEnum()) {
			case ALL:
				for(QFileMember fileMember: fileMemberManager.list(job, fileMembered))
					fileMemberManager.delete(job, fileMembered, fileMember.getName());
				break;
			case OTHER:
				// TODO name*
				fileMemberManager.delete(job, fileMembered, member.asData().trimR());
				break;
			}
		}		
	}

	public static enum MEMBEREnum {
		ALL, OTHER
	}
}
