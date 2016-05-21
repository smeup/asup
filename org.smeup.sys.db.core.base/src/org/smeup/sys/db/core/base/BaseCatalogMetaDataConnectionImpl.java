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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.smeup.sys.db.core.QCatalogMetaData;
import org.smeup.sys.db.core.QConnection;

public class BaseCatalogMetaDataConnectionImpl implements QCatalogMetaData {

	private QConnection connection;
	private QCatalogMetaData catalogMetaData;
	
	public BaseCatalogMetaDataConnectionImpl(QConnection connection, QCatalogMetaData catalogMetaData) {
		this.connection = connection;
		this.catalogMetaData = catalogMetaData;
	}
	
	@Override
	public Index getIndex(String schema, String table, String index) {
		
		schema = connection.getContext().resolveAlias(schema);
		return catalogMetaData.getIndex(schema, table, index);
	}

	@Override
	public Schema getSchema(String schema) {
		
		schema = connection.getContext().resolveAlias(schema);
		return catalogMetaData.getSchema(schema);
	}

	@Override
	public List<Schema> getSchemas() {
		
		List<Schema> schemas = new ArrayList<Schema>();		
		for(String library: connection.getContext().getContextDescription().getLibraryPath()) {
			schemas.add(getSchema(library));
		}
		
		return schemas;
	}

	@Override
	public Table getTable(String schema, String table) {
		
		schema = connection.getContext().resolveAlias(schema);
		return catalogMetaData.getTable(schema, table);
	}

	@Override
	public Table getTable(String tableName) {
		
		for (Schema schema : getSchemas()) {
			Table table = getTable(schema.getName(), tableName);
			if (table != null)
				return table;
		}

		return null;
	}

	@Override
	public ViewTable getView(String schema, String table) {
		
		schema = connection.getContext().resolveAlias(schema);
		return catalogMetaData.getView(schema, table);
	}

	@Override
	public ViewTable getView(String tableName) {
		
		for (Schema schema : getSchemas()) {
			ViewTable view = getView(schema.getName(), tableName);
			if (view != null)
				return view;
		}

		return null;
	}
}