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
package org.smeup.sys.db.syntax.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Column;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.smeup.sys.db.core.OrderingType;
import org.smeup.sys.db.core.QIndexColumnDef;
import org.smeup.sys.db.core.QIndexDef;
import org.smeup.sys.db.core.QSchemaDef;
import org.smeup.sys.db.core.QTableColumnDef;
import org.smeup.sys.db.core.QTableDef;
import org.smeup.sys.db.core.QViewDef;
import org.smeup.sys.db.syntax.QDefinitionWriter;
import org.smeup.sys.db.syntax.impl.StatementWriterImpl;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QDecimalDef;

public abstract class BaseDefinitionWriterImpl extends StatementWriterImpl implements QDefinitionWriter {

	protected ISQLObjectNameHelper sqlObjectNameHelper;

	protected BaseDefinitionWriterImpl(ISQLObjectNameHelper sqlObjectNameHelper) {
		this.sqlObjectNameHelper = sqlObjectNameHelper;
	}

	protected void setSQLObjectNameHelper(ISQLObjectNameHelper sqlObjectNameHelper) {
		this.sqlObjectNameHelper = sqlObjectNameHelper;
	}

	@Override
	public String createSchema(String name, QSchemaDef schema) {
		return "CREATE SCHEMA " + getNameInSQLFormat(name);
	}

	@Override
	public String createTable(Schema schema, String name, QTableDef table) {

		StringBuffer result = new StringBuffer("CREATE TABLE ");
		result.append(getNameInSQLFormat(schema) + "." + getNameInSQLFormat(name) + " (");

		boolean first = true;
		for (QTableColumnDef column : table.getColumns()) {

			if (!first)
				result.append(", ");

			QDataDef<?> columnDef = column.getDefinition();
			switch (columnDef.getDataDefType()) {
			case IDENTITY:
				result.append(getNameInSQLFormat(column) + " INT NOT NULL AUTO_INCREMENT");
				break;
			case CHARACTER:
				QCharacterDef characterDef = (QCharacterDef)columnDef;
				if(characterDef.isVarying())
					result.append(getNameInSQLFormat(column) + " VARCHAR(" + characterDef.getLength() + ")");
				// TODO introduce QContext
				else if(characterDef.getLength() > 8000)
					result.append(getNameInSQLFormat(column) + " BLOB");
				else
					result.append(getNameInSQLFormat(column) + " CHAR(" + characterDef.getLength() + ")");
				break;
			case DECIMAL:
				QDecimalDef decimalDef = (QDecimalDef)columnDef;
				if (decimalDef.getScale() != 0)
					result.append(getNameInSQLFormat(column) + " DECIMAL(" + decimalDef.getLength() + ", " + decimalDef.getScale() + ")");
				else
					result.append(getNameInSQLFormat(column) + " DECIMAL(" + decimalDef.getLength() + ",  0)");
				break;
			default:
				result.append(getNameInSQLFormat(column) + " " + columnDef.getDataDefType().getName().toUpperCase());
			}
			first = false;
		}

		result.append(")");
		return result.toString();
	}

	@Override
	public String createView(Schema schema, String name, QViewDef view) {

		StringBuffer result = new StringBuffer("CREATE VIEW ");

		result.append(getNameInSQLFormat(schema) + "." + getNameInSQLFormat(name));
		result.append(" (");

		List<QTableColumnDef> columns = view.getColumns();
		for (int i = 1; i <= columns.size(); i++) {
			result.append(getNameInSQLFormat(columns.get(i - 1)));
			if (i < columns.size())
				result.append(", ");
		}

		result.append(")");

		result.append(" AS ");

		result.append(view.getQuerySelect());

		return result.toString();
	}

	@Override
	public String createIndex(Table table, String name, QIndexDef index) {

		StringBuffer result = new StringBuffer("CREATE ");
		if (index.isUnique())
			result.append("UNIQUE ");

		// TODO
		if (index.isClustered())
			result.append("");
		// result.append("CLUSTERED ");

		result.append("INDEX " + getNameInSQLFormat(name));
		result.append(" ON " + getQualifiedNameInSQLFormat(table) + " (");

		boolean first = true;

		for (QIndexColumnDef column : index.getColumns()) {

			if (!first)
				result.append(", ");

			result.append(getNameInSQLFormat(column));

			if (column.getOrdering() == OrderingType.DESCEND)
				result.append(" DESC");

			first = false;
		}
		result.append(")");
		return result.toString();
	}

	public String dropSchema(Schema schema) {
		return "DROP SCHEMA " + getNameInSQLFormat(schema);
	}

	@Override
	public String dropTable(Table table) {
		return "DROP TABLE " + getQualifiedNameInSQLFormat(table);
	}

	@Override
	public String dropView(ViewTable view) {
		return "DROP VIEW " + getQualifiedNameInSQLFormat(view);
	}

	@Override
	public String dropIndex(Index index) {
		return "DROP INDEX " + getNameInSQLFormat(index) + " ON " + getNameInSQLFormat(index.getTable());
	}

	@Override
	public String deleteData(Table table) {
		return "DELETE FROM " + getQualifiedNameInSQLFormat(table);
	}

	@Override
	public String countRecords(Table table) {
		return "SELECT COUNT(*) FROM " + getQualifiedNameInSQLFormat(table);
	}
	
	@Override
	public String selectData(Table table) {
		return "SELECT * FROM " + getQualifiedNameInSQLFormat(table);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public String insertData(Table table, List<String> fieldNames) {
		StringBuffer result = new StringBuffer("INSERT INTO " + getQualifiedNameInSQLFormat(table));
		String tkn1 = "";
		String tkn2 = "";
		boolean first = true;
		for (Column column : filter((List<Column>) table.getColumns(), fieldNames)) {

			if (column.getIdentitySpecifier() != null)
				continue;

			if (!first) {
				tkn1 += ", ";
				tkn2 += ", ";
			}

			tkn1 += getNameInSQLFormat(column);
			tkn2 += "?";
			first = false;
		}
		result.append("(" + tkn1 + ") VALUES(" + tkn2 + ")");

		return result.toString();
	}

	private List<Column> filter(List<Column> columns, List<String> fieldNames) {
		if (fieldNames == null) {
			return columns;
		}
		List<Column> result = new ArrayList<Column>();
		Map<String, Column> columnMap = toMap(columns);
		for (String name : fieldNames) {
			Column column = columnMap.get(name);
			if (column!= null) {
				result.add(column);
			}
		}
		return result;
	}

	private Map<String, Column> toMap(List<Column> columns) {
		HashMap<String, Column> result = new HashMap<String, Column>();
		for (Column column : columns) {
			result.put(column.getName(), column);
		}
		return result;
	}

	@Override
	public String insertData(Table table) {
		return insertData(table, null);
	}

	protected String getNameInSQLFormat(String schema, QTableColumnDef table) {
		return getNameInSQLFormat(schema) + "." + getNameInSQLFormat(table);
	}

	protected String getNameInSQLFormat(Schema schema) {
		return getIdentifierQuoteString() + schema.getName() + getIdentifierQuoteString();
	}

	protected String getNameInSQLFormat(String name) {
		return getIdentifierQuoteString() + name + getIdentifierQuoteString();
	}

	protected String getNameInSQLFormat(Index index) {
		return getIdentifierQuoteString() + index.getName() + getIdentifierQuoteString();
	}

	protected String getNameInSQLFormat(QTableColumnDef column) {
		return getIdentifierQuoteString() + column.getName() + getIdentifierQuoteString();
	}

	protected String getNameInSQLFormat(QIndexColumnDef column) {
		return getIdentifierQuoteString() + column.getName() + getIdentifierQuoteString();
	}

	protected String getNameInSQLFormat(Column column) {
		return sqlObjectNameHelper.getNameInSQLFormat(column);
	}

	protected String getNameInSQLFormat(Table table) {
		return sqlObjectNameHelper.getNameInSQLFormat(table);
	}

	protected String getQualifiedNameInSQLFormat(Column column) {
		return sqlObjectNameHelper.getQualifiedNameInSQLFormat(column);
	}

	protected String getQualifiedNameInSQLFormat(Table table) {
		return sqlObjectNameHelper.getQualifiedNameInSQLFormat(table);
	}

	protected String getIdentifierQuoteString() {
		return sqlObjectNameHelper.getIdentifierQuoteString();
	}
}
