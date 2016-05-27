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
package org.smeup.sys.os.file.base;



import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberManager;
import org.smeup.sys.os.file.QFileMembered;
import org.smeup.sys.os.file.QFileOverride;

public class BaseFileMemberProvider {

	private QResourceReader<QFile> fileReader;
	private QFileManager fileManager;
	private QFileMemberManager fileMemberManager;

	private QContextProvider contextProvider;
	private QString fileName;
	private QString memberName;

	public BaseFileMemberProvider(QContextProvider contextProvider, QString fileName, QString memberName) {
		this.contextProvider = contextProvider;
		this.fileName = fileName;
		this.memberName = memberName;

		QResourceManager resourceManager = contextProvider.getContext().get(QResourceManager.class);
		this.fileReader = resourceManager.getResourceReader(contextProvider, QFile.class, Scope.LIBRARY_LIST);
		this.fileManager = contextProvider.getContext().get(QFileManager.class);
		this.fileMemberManager = contextProvider.getContext().get(QFileMemberManager.class);
	}

	public QFileMember getFileMember() {

		QFileMembered fileMembered = null;
		String fileMemberName = null;

		QFileOverride fileOverride = fileManager.getFileOverride(contextProvider.getContext(), fileName.trimR());
		if (fileOverride != null) {
			fileMembered = (QFileMembered) fileOverride.getFileTo();
			fileMemberName = fileOverride.getMemberTo();
		}
		
		if(fileMembered == null || 
		  (fileMemberName != null && !getMemberName().isEmpty() && !fileMemberName.equalsIgnoreCase(getMemberName().trimR()))) {
			QFile qFile = fileReader.lookup(fileName.trimR());
			fileMembered = (QFileMembered)qFile;
			fileMemberName = getMemberName().trimR();
		}

		QFileMember fileMember = fileMemberManager.lookup(contextProvider, fileMembered, fileMemberName);

		return fileMember;
	}

	protected QString getFileName() {
		return fileName;
	}

	protected QString getMemberName() {
		return memberName;
	}

}