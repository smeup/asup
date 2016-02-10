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
package org.smeup.sys.os.lib.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.lib.LibraryType;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;
import org.smeup.sys.os.lib.QOperatingSystemLibraryFactory;
import org.smeup.sys.os.type.QType;
import org.smeup.sys.os.type.QTypeRegistry;
import org.smeup.sys.os.type.QTypedObject;

public class BaseLibraryManagerImpl implements QLibraryManager {

	@Inject
	private QResourceManager resourceManager;
	
	@Inject
	private QTypeRegistry typeRegistry;

	private String systemLibrary;

	// private BundleContext bundleContext;
	// private Map<String, Long> bundleMap;

	@Inject
	public BaseLibraryManagerImpl(QSystemManager systemManager) {
		this.systemLibrary = systemManager.getSystem().getSystemLibrary();
	}

	@Override
	public QResourceReader<QLibrary> getLibraryReader(QJob job) {
		QResourceReader<QLibrary> libraryReader = resourceManager.getResourceReader(job, QLibrary.class, systemLibrary);
		return libraryReader;
	}

	@Override
	public QResourceWriter<QLibrary> getLibraryWriter(QJob job) {
		QResourceWriter<QLibrary> libraryWriter = resourceManager.getResourceWriter(job, QLibrary.class, systemLibrary);
		return libraryWriter;
	}

	@Override
	public void createTemporaryLibrary(QJob job) {
		
		QLibrary tempLibrary = QOperatingSystemLibraryFactory.eINSTANCE.createLibrary();
		tempLibrary.setName(job.getContext().getContextDescription().getTemporaryLibrary());
		tempLibrary.setText("Temporary library for job: "+job.getJobID());
		tempLibrary.setLibraryType(LibraryType.TEMPORARY);
		
		QResourceWriter<QLibrary> libraryWriter = resourceManager.getResourceWriter(job, QLibrary.class, systemLibrary);
		libraryWriter.save(tempLibrary);
	}

	@Override
	public void destroyTemporaryLibrary(QJob job) {
		
		QResourceWriter<QLibrary> libraryWriter = resourceManager.getResourceWriter(job, QLibrary.class, systemLibrary);
		QLibrary tempLibrary = libraryWriter.lookup(job.getContext().getContextDescription().getTemporaryLibrary());
		
		if(tempLibrary != null)
			libraryWriter.delete(tempLibrary);
	}

	@Override
	public void destroyAllTemporaryLibrary(QJob job) {

		QResourceWriter<QLibrary> libraryWriter = resourceManager.getResourceWriter(job, QLibrary.class, job.getSystem().getSystemLibrary());
		QObjectIterator<QLibrary> libraryIterator = libraryWriter.find(null);

		try {
			while(libraryIterator.hasNext()) {
				QLibrary library = libraryIterator.next();
				if(library.getLibraryType() != LibraryType.TEMPORARY)
					continue;
				
				libraryWriter.delete(library);
			}
			
		}
		finally {
			if(libraryIterator != null)
				libraryIterator.close();
		}
		
	}

	@Override
	public void clearLibrary(QJob job, String name) {

		for (QType<?> type : typeRegistry.list()) {

			if(!type.isPersistent())
				continue;

			if (QFile.class.isAssignableFrom(type.getTypedClass()))
				deleteFileType(job, type, name);
			else
				deleteType(job, type, name);
		}		
	}	
	
	private <T extends QTypedObject> void deleteType(QJob job, QType<T> type, String library) {

		QResourceWriter<T> typeWriter = resourceManager.getResourceWriter(job, type.getTypedClass(), library);

		try (QObjectIterator<T> typedObjects = typeWriter.find(null);) {
			while (typedObjects.hasNext()) {
				T typedObject = typedObjects.next();
				typeWriter.delete(typedObject);
			}
		}

	}

	private <T extends QTypedObject> void deleteFileType(QJob job, QType<T> type, String library) {

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