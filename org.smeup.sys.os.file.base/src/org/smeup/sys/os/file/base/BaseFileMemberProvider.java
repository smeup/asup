/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberManager;
import org.smeup.sys.os.file.QFileMembered;
import org.smeup.sys.os.file.QFileOverride;

public class BaseFileMemberProvider {

	private QFileManager fileManager;
	private QFileMemberManager fileMemberManager;
	
	private QContextProvider contextProvider;
	private String name;

	public BaseFileMemberProvider(QContextProvider contextProvider, String name) {
		this.contextProvider = contextProvider;
		this.name = name;
		
		this.fileManager = contextProvider.getContext().get(QFileManager.class);
		this.fileMemberManager = contextProvider.getContext().get(QFileMemberManager.class);
	}

	public QFileMember getFileMember() {
		
		QFileOverride fileOverride = fileManager.getFileOverride(contextProvider.getContext(), name);
		if(fileOverride == null)
			return null;
				
		QFile fileMembered = fileOverride.getFileTo();
		QFileMember fileMember = fileMemberManager.lookup(contextProvider, (QFileMembered) fileMembered, fileOverride.getMemberTo());
		
		return fileMember;
	}

}