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
package org.smeup.sys.os.lib.base.api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;

@Program(name = "QLICLLIB")
public class LibraryDeleter {

	@Inject
	private QJob job;
	@Inject
	private QLibraryManager libraryManager;
	@Inject
	private QTypeRegistry typeRegistry;
	@Inject
	private QResourceManager resourceManager;

	public @Entry void main(@DataDef(length = 10) QCharacter library, @DataDef(length = 10) QEnum<ASPDeviceEnum, QCharacter> aSPDevice) {

		QResourceWriter<QLibrary> libraryWriter = libraryManager.getLibraryWriter(job);

		QLibrary qLibrary = libraryWriter.lookup(library.trimR());
		if (qLibrary == null)
			throw new OperatingSystemRuntimeException("Library not found: " + library);

		for (QType<?> type : typeRegistry.list()) {

			if (QFile.class.isAssignableFrom(type.getTypedClass()))
				deleteFileType(type, qLibrary.getName());
			else
				deleteType(type, qLibrary.getName());

		}

		// TODO iterate contents
		libraryWriter.delete(qLibrary);
	}

	private <T extends QTypedObject> void deleteType(QType<T> type, String library) {

		QResourceWriter<T> typeWriter = resourceManager.getResourceWriter(job, type.getTypedClass(), library);

		QObjectIterator<T> typedObjects = typeWriter.find(null);
		while (typedObjects.hasNext()) {
			T typedObject = typedObjects.next();
			typeWriter.delete(typedObject);
		}

	}

	private <T extends QTypedObject> void deleteFileType(QType<T> type, String library) {

		QResourceWriter<T> typeWriter = resourceManager.getResourceWriter(job, type.getTypedClass(), library);

		List<T> physicalFiles = new ArrayList<T>();

		QObjectIterator<T> typedObjects = typeWriter.find(null);
		while (typedObjects.hasNext()) {
			T typedObject = typedObjects.next();

			if (typedObject instanceof QPhysicalFile)
				physicalFiles.add(typedObject);
			else
				typeWriter.delete(typedObject);
		}

		for (T physicalFile : physicalFiles)
			typeWriter.delete(physicalFile);
	}

	public static enum ASPDeviceEnum {
		@Special(value = "*")
		TERM_STAR, CURASPGRP, SYSBAS, OTHER
	}
}
