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
package org.smeup.sys.os.file.base;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.db.core.QConnectionManager;
import org.smeup.sys.il.core.ctx.QAdapterFactory;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QDatabaseFile;
import org.smeup.sys.os.file.QDisplayFile;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileFormat;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QFileOverride;
import org.smeup.sys.os.file.QLogicalFile;
import org.smeup.sys.os.file.QPhysicalFile;
import org.smeup.sys.os.file.QPrinterFile;
import org.smeup.sys.os.file.QSourceFile;
import org.smeup.sys.rt.core.QApplication;

public class BaseFileManagerImpl implements QFileManager {

	@Inject
	private QConnectionManager connectionManager;

	@Inject
	private QApplication application;

	@PostConstruct
	public void init() {

		QAdapterFactory adapterFactory = new BaseFileAdapterFactoryImpl(connectionManager, this);

		application.getContext().registerAdapterFactory(adapterFactory, QJob.class);
		application.getContext().registerAdapterFactory(adapterFactory, QPhysicalFile.class);
		application.getContext().registerAdapterFactory(adapterFactory, QLogicalFile.class);
	}

	@Override
	public void addFileOverride(QContext context, QFileOverride fileOverride) {

		BaseFileOverrideMap overrideFileMap = getFileMapOverride(context);
		overrideFileMap.add(fileOverride.getName(), fileOverride);
	}

	@Override
	public QFileOverride getFileOverride(QContext context, String fileName) throws OperatingSystemRuntimeException {

		BaseFileOverrideMap overrideFileMap = getFileMapOverride(context);

		QFileOverride fileOverride = overrideFileMap.get(fileName);

		return fileOverride;
	}

	private BaseFileOverrideMap getFileMapOverride(QContext context) {
		BaseFileOverrideMap overrideFileMap = context.get(BaseFileOverrideMap.class);
		if (overrideFileMap == null) {
			overrideFileMap = new BaseFileOverrideMap();
			context.set(BaseFileOverrideMap.class, overrideFileMap);
		}
		return overrideFileMap;
	}

	@Override
	public List<QFileOverride> listFileOverride(QContext context) {

		return getFileMapOverride(context).list();
	}

	@Override
	public QFileOverride removeFileOverride(QContext context, String name) {
		QFileOverride fileOverride = getFileMapOverride(context).get(name);
		return fileOverride;
	}

	@Override
	public void removeAllFileOverride(QContext context) {

		BaseFileOverrideMap fileMapOverride = getFileMapOverride(context);
		fileMapOverride.removeAll();
	}

	@Override
	public QFileFormat<?> getFileFormat(QFile file, String formatName) {

		if (file instanceof QDatabaseFile) {
			QDatabaseFile databaseFile = (QDatabaseFile)file;
			return databaseFile.getDatabaseFormat();
		} else if (file instanceof QDisplayFile) {
			QDisplayFile displayFile = (QDisplayFile)file;
			for(QFileFormat<?> fileFormat: displayFile.getDisplayFormats())
				if(fileFormat.getName().equalsIgnoreCase(formatName))
					return fileFormat;
			return null;

		} else if (file instanceof QPrinterFile) {
			QPrinterFile printerFile = (QPrinterFile)file;
			for(QFileFormat<?> fileFormat: printerFile.getPrinterFormats())
				if(fileFormat.getName().equalsIgnoreCase(formatName))
					return fileFormat;
			return null;

		} else if (file instanceof QSourceFile) {
			return null;

		} else
			return null;
	}
}
