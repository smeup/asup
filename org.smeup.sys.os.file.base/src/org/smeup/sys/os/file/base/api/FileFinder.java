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
package org.smeup.sys.os.file.base.api;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.file.QFile;

public class FileFinder {

	private QResourceManager resourceManager;
	private QJob job;

	public FileFinder(QJob job, QResourceManager resourceManager) {
		this.job = job;
		this.resourceManager = resourceManager;
	}

	public QFile lookup(FILE file) {
		QResourceReader<QFile> fileReader = null;

		switch (file.library.asEnum()) {
		case CURLIB:
			fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.CURRENT_LIBRARY);
			break;
		case LIBL:
			fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
			break;
		case ALL:
			fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.ALL);
			break;
		case ALLUSR:
			fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.ALL_USER);
			break;
		case USRLIBL:
			fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.USER_LIBRARY_LIST);
			break;
		case OTHER:
			fileReader = resourceManager.getResourceReader(job, QFile.class, file.library.asData().trimR());
			break;
		}

		return fileReader.lookup(file.nameGeneric.trimR());
	}
	
	public static class FILE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter nameGeneric;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, USRLIBL, ALL, ALLUSR, OTHER
		}
	}

}
