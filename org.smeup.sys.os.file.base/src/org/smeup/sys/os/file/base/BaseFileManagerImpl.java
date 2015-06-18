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

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.db.core.QConnectionManager;
import org.smeup.sys.il.core.ctx.QAdapterFactory;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QLogicalFile;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.rt.core.QApplication;

public class BaseFileManagerImpl implements QFileManager {

	@Inject
	private QConnectionManager connectionManager;

	@Inject
	private QApplication application;

	@PostConstruct
	public void init() {

		QAdapterFactory adapterFactory = new BaseFileAdapterFactoryImpl(connectionManager);

		application.getContext().registerAdapterFactory(adapterFactory, QJob.class);
		application.getContext().registerAdapterFactory(adapterFactory, QPhysicalFile.class);
		application.getContext().registerAdapterFactory(adapterFactory, QLogicalFile.class);
	}

	@Override
	public void setFileOverride(QJob job, String fileFrom, QFile fileTo) throws OperatingSystemRuntimeException {

		BaseFileOverrideMap overrideFileMap = getFileMapOverride(job);
		overrideFileMap.registerFile(fileFrom, fileTo);
	}

	@Override
	public QFile getFileOverride(QJob job, String fileName) throws OperatingSystemRuntimeException {

		BaseFileOverrideMap overrideFileMap = getFileMapOverride(job);

		QFile qFile = overrideFileMap.getFile(fileName);

		/*
		 * if(qFile != null) return qFile;
		 * 
		 * QResourceReader<QFile> fileReader =
		 * resourceManager.getResourceReader(job, QFile.class,
		 * QScope.LIBRARY_LIST); qFile = fileReader.lookup(fileName);
		 * 
		 * if(qFile == null) throw new
		 * OperatingSystemRuntimeException("File not found: "+fileName);
		 * 
		 * fileReader.close();
		 */

		return qFile;
	}

	private BaseFileOverrideMap getFileMapOverride(QJob job) {
		BaseFileOverrideMap overrideFileMap = job.getContext().get(BaseFileOverrideMap.class);
		if (overrideFileMap == null) {
			overrideFileMap = new BaseFileOverrideMap();
			job.getContext().set(BaseFileOverrideMap.class, overrideFileMap);
		}
		return overrideFileMap;
	}
}
