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
package org.smeup.sys.os.file.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.Scope;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceReader;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileManager;

@Program(name = "QDMOVERD")
public class OverrideDatabaseFile {

	@Inject
	private QFileManager fileManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;

	@Entry
	public void main(@DataDef(length = 10) QCharacter file, FileRef fileTo) {

		// TODO Intercept library special value
		QResourceReader<QFile> fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
		QFile qFile = fileReader.lookup(fileTo.name.trimR());

		if (qFile == null)
			throw new OperatingSystemRuntimeException("File not found: " + fileTo);

		fileManager.setFileOverride(job, file.trimR(), qFile);

	}

}
