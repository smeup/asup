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

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.QCatalogMetaData;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QTableProvider;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QFileOverride;

public class BaseTableProviderImpl implements QTableProvider {

	private QFileManager fileManager;
	private QJob job;
	private QConnection connection;

	public BaseTableProviderImpl(QJob job, QConnection connection, QFileManager fileManager) {
		this.job = job;
		this.connection = connection;
		this.fileManager = fileManager;
	}

	public Table getTable(String container, String name) {

		QFileOverride fileOverride = fileManager.getFileOverride(job.getContext(), name);
		if (fileOverride != null){
			name = fileOverride.getFileTo().getName();
			if(fileOverride.getLibrary() != null){
				container = fileOverride.getLibrary();
			}
		}
		QCatalogMetaData catalogMetaData = connection.getCatalogMetaData();

		if (container == null) {
			return catalogMetaData.getTable(name);
		} else
			return catalogMetaData.getTable(container, name);
	}

}
