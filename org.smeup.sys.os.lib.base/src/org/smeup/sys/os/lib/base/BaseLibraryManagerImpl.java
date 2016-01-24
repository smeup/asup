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
package org.smeup.sys.os.lib.base;

import javax.inject.Inject;

import org.smeup.sys.il.core.QObjectIterator;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.lib.LibraryType;
import org.smeup.sys.os.lib.QLibrary;
import org.smeup.sys.os.lib.QLibraryManager;
import org.smeup.sys.os.lib.QOperatingSystemLibraryFactory;

public class BaseLibraryManagerImpl implements QLibraryManager {

	private QResourceManager resourceManager;

	private String systemLibrary;

	// private BundleContext bundleContext;
	// private Map<String, Long> bundleMap;

	@Inject
	public BaseLibraryManagerImpl(QSystemManager systemManager, QResourceManager resourceManager) {

		this.systemLibrary = systemManager.getSystem().getSystemLibrary();
		this.resourceManager = resourceManager;
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
	
}