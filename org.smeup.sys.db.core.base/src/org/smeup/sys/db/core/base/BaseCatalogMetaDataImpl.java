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
import java.util.Map;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.smeup.sys.db.core.SearchStrategy;
import org.smeup.sys.db.core.impl.CatalogMetaDataImpl;

public class BaseCatalogMetaDataImpl extends CatalogMetaDataImpl {

	private Map<String, Schema> schemas;
	private SearchStrategy searchStrategy;
	
	public BaseCatalogMetaDataImpl(Map<String, Schema> schemas, SearchStrategy searchStategy) {
		this.schemas = schemas;
		this.searchStrategy = searchStategy;
	}

	@Override
	public Schema getSchema(String schemaName) {
		return this.schemas.get(schemaName);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Table getTable(String schemaName, String tableName) {

		Schema schema = getSchema(schemaName);
		if (schema == null)
			return null;

		for (Table table : (List<Table>) schema.getTables())
			if (table.getName().equals(tableName))
				return table;

		return null;
	}

	@Override
	public Table getTable(String tableName) {

		List<Schema> schemas = null;
		switch (getSearchStrategy()) {
		case ALL:
			schemas = getAllSchemas();
			break;
		case CURRENT:
			schemas = getCurrentSchemas();
			break;
		}
		
		for (Schema schema : schemas) {
			Table table = getTable(schema.getName(), tableName);
			if (table != null)
				return table;
		}

		return null;
	}

	@Override
	public ViewTable getView(String tableName) {

		List<Schema> schemas = null;
		switch (getSearchStrategy()) {
		case ALL:
			schemas = getAllSchemas();
			break;
		case CURRENT:
			schemas = getCurrentSchemas();
			break;
		}
		
		for (Schema schema : schemas) {
			ViewTable view = getView(schema.getName(), tableName);
			if (view != null)
				return view;
		}

		return null;
	}

	@Override
	public ViewTable getView(String schemaName, String tableName) {

		Table table = getTable(schemaName, tableName);
		if (table == null)
			return null;

		if (table instanceof ViewTable)
			return (ViewTable) table;
		else
			return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Index getIndex(String schemaName, String tableName, String indexName) {

		Table table = getTable(schemaName, tableName);
		if (table == null)
			return null;

		for (Index index : (List<Index>) table.getIndex())
			if (index.getName().equalsIgnoreCase(indexName))
				return index;

		return null;
	}

	@Override
	public List<Schema> getAllSchemas() {
		return new ArrayList<Schema>(this.schemas.values());
	}

	@Override
	public List<Schema> getCurrentSchemas() {
		return new ArrayList<Schema>(this.schemas.values());
	}
	
	public SearchStrategy getSearchStrategy() {
		return this.searchStrategy;
	}
}