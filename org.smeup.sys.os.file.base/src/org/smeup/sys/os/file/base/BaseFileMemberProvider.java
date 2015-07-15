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

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QFileMember;
import org.smeup.sys.os.file.QFileMemberManager;
import org.smeup.sys.os.file.QFileMembered;
import org.smeup.sys.os.file.QFileOverride;

public class BaseFileMemberProvider {

	private QFileManager fileManager;
	private QFileMemberManager fileMemberManager;
	
	private QContext context;
	private String name;

	public BaseFileMemberProvider(QContext context, String name) {
		this.context = context;
		this.name = name;
		
		this.fileManager = context.get(QFileManager.class);
		this.fileMemberManager = context.get(QFileMemberManager.class);
	}

	public QFileMember getFileMember() {
		
		QFileOverride fileOverride = fileManager.getFileOverride(context, name);
		if(fileOverride == null)
			return null;
				
		QFile fileMembered = fileOverride.getFileTo();
		QFileMember fileMember = fileMemberManager.lookup(context, fileMembered.getLibrary(), (QFileMembered) fileMembered, fileOverride.getMemberTo());
		
		return fileMember;
	}

}