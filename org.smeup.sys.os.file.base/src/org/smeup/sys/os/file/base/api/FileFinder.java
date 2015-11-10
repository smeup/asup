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
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;

public class FileFinder {

	private QResourceManager resourceManager;
	private QJob job;

	public FileFinder(QJob job, QResourceManager resourceManager) {
		this.job = job;
		this.resourceManager = resourceManager;
	}

	public QFile lookup(String fileName, String libName) {
		QResourceReader<QFile> fileReader = resourceManager.getResourceReader(job, QFile.class, libName);
		return fileReader.lookup(fileName);
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
	
	public QResourceWriter<QFile> writerFor(QEnum<LIBRARYEnum, QCharacter> lib) {
		switch (lib.asEnum()) {
		case CURLIB:
			return resourceManager.getResourceWriter(job, QFile.class, Scope.CURRENT_LIBRARY);
		case LIBL:
			return resourceManager.getResourceWriter(job, QFile.class, Scope.LIBRARY_LIST);
		case USRLIBL:
			return resourceManager.getResourceWriter(job, QFile.class, Scope.USER_LIBRARY_LIST);
		case ALLUSR:
			return resourceManager.getResourceWriter(job, QFile.class, Scope.ALL_USER);
		case ALL:
			return resourceManager.getResourceWriter(job, QFile.class, Scope.ALL);			
		case OTHER:
			return resourceManager.getResourceWriter(job, QFile.class, lib.asData().trimR());
		}
		throw new RuntimeException("Wrong library type " + lib);
	}

	
	public static class FILE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter nameGeneric;
		
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;
	}

}
