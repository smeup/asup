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

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.db.core.QConnectionManager;
import org.smeup.sys.il.core.ctx.QAdapterFactory;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QFileOverride;
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
	public void setFileOverride(QContext context, QFileOverride fileOverride) {

		BaseFileOverrideMap overrideFileMap = getFileMapOverride(context);
		overrideFileMap.set(fileOverride.getName(), fileOverride);
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
}
