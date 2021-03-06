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
package org.smeup.sys.il.esam.jdbc;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.QCatalogMetaData;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QTableProvider;

public class JDBCTableProvider implements QTableProvider {

	private QConnection connection;

	public JDBCTableProvider(QConnection connection) {
		this.connection = connection;
	}

	@Override
	public Table getTable(String container, String name) {

		QCatalogMetaData catalogMetaData = connection.getCatalogMetaData();

		if (container == null) {
			return catalogMetaData.getTable(name);
		} else
			return catalogMetaData.getTable(container, name);
	}

}
