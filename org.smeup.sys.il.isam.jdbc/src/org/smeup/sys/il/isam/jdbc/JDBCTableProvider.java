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
package org.smeup.sys.il.isam.jdbc;

import java.sql.SQLException;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.QCatalogMetaData;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QConnectionDescription;

public class JDBCTableProvider {

	private QConnection connection;

	public JDBCTableProvider(QConnection connection) {
		this.connection = connection;
	}

	public Table getTable(String container, String name) throws SQLException {

		QCatalogMetaData catalogMetaData = connection.getCatalogMetaData();

		if (container == null) {
			QConnectionDescription connectionDescription = connection.getConnectionDescription();
			return catalogMetaData.getTable(connectionDescription, name);
		} else
			return catalogMetaData.getTable(container, name);
	}

}
