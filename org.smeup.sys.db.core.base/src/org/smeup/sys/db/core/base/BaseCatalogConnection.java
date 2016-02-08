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
package org.smeup.sys.db.core.base;

import java.sql.Connection;
import java.sql.SQLException;

import org.smeup.sys.db.core.DatabaseCoreRuntimeException;
import org.smeup.sys.db.core.QCatalogContainer;
import org.smeup.sys.db.core.QCatalogGenerationStrategy;
import org.smeup.sys.db.core.QCatalogMetaData;
import org.smeup.sys.db.syntax.QDefinitionWriter;
import org.smeup.sys.db.syntax.QQueryWriter;

public class BaseCatalogConnection {

	private Connection rawConnection;

	private QCatalogContainer catalogContainer;

	private QQueryWriter queryWriter;
	private QDefinitionWriter definitionWriter;

	protected BaseCatalogConnection(QCatalogContainer catalogContainer) {
		this.catalogContainer = catalogContainer;
		this.queryWriter = catalogContainer.getCatalogContext().get(QQueryWriter.class);
		this.definitionWriter = catalogContainer.getCatalogContext().get(QDefinitionWriter.class);
	}

	public QCatalogContainer getCatalogContainer() {
		return this.catalogContainer;
	}

	
	public QQueryWriter getQueryWriter() {
		return queryWriter;
	}

	public QDefinitionWriter getDefinitionWriter() {
		return definitionWriter;
	}

	public QCatalogMetaData getCatalogMetaData() {
		return catalogContainer.getMetaData();
	}

	public QCatalogGenerationStrategy getCatalogGenerationStrategy() {
		return catalogContainer.getGenerationStrategy();
	}

	protected synchronized Connection getRawConnection() throws SQLException {

		if (rawConnection == null || rawConnection.isClosed()) {

			this.rawConnection = catalogContainer.createConnection(Connection.class);
			if (this.rawConnection == null)
				throw new DatabaseCoreRuntimeException("Raw connection is null: " + this);

			this.rawConnection.setCatalog(catalogContainer.getConnectionConfig().getCatalog());
		}

		return rawConnection;
	}

	public void close() throws SQLException {

		if (this.rawConnection != null)
			this.rawConnection.close();
	}
}
