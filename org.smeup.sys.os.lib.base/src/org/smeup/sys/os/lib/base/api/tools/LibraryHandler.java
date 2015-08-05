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
package org.smeup.sys.os.lib.base.api.tools;

import java.util.ArrayList;
import java.util.List;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.resources.QResourceManager;
import org.smeup.sys.os.core.resources.QResourceWriter;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;

public class LibraryHandler {

	private QLibrary qLibrary;
	private QJob job;
	private QTypeRegistry typeRegistry;
	private QResourceManager resourceManager;

	public LibraryHandler(QLibrary qLibrary, QJob job, QTypeRegistry typeRegistry, QResourceManager resourceManager) {
		this.qLibrary = qLibrary;
		this.job = job;
		this.typeRegistry = typeRegistry;
		this.resourceManager = resourceManager;
	}

	public void clear() {
		for (QType<?> type : typeRegistry.list()) {

			if(QType.class.isAssignableFrom(type.getTypedClass()))
				continue;
			
			if (QFile.class.isAssignableFrom(type.getTypedClass()))
				deleteFileType(type, qLibrary.getName());
			else
				deleteType(type, qLibrary.getName());

		}
	}

	private <T extends QTypedObject> void deleteType(QType<T> type, String library) {

		QResourceWriter<T> typeWriter = resourceManager.getResourceWriter(job, type.getTypedClass(), library);

		try (QObjectIterator<T> typedObjects = typeWriter.find(null);) {
			while (typedObjects.hasNext()) {
				T typedObject = typedObjects.next();
				typeWriter.delete(typedObject);
			}
		}

	}

	private <T extends QTypedObject> void deleteFileType(QType<T> type, String library) {

		QResourceWriter<T> typeWriter = resourceManager.getResourceWriter(job, type.getTypedClass(), library);

		List<T> physicalFiles = new ArrayList<T>();

		try (QObjectIterator<T> typedObjects = typeWriter.find(null);) {
			while (typedObjects.hasNext()) {
				T typedObject = typedObjects.next();
	
				if (typedObject instanceof QPhysicalFile)
					physicalFiles.add(typedObject);
				else
					typeWriter.delete(typedObject);
			}
		}
		for (T physicalFile : physicalFiles)
			typeWriter.delete(physicalFile);
	}

}
