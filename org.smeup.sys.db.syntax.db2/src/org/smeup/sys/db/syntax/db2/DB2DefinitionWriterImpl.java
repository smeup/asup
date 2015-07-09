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
package org.smeup.sys.db.syntax.db2;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.schema.impl.SchemaImpl;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.impl.TableImpl;
import org.smeup.sys.db.core.OrderingType;
import org.smeup.sys.db.core.QIndexColumnDef;
import org.smeup.sys.db.core.QIndexDef;
import org.smeup.sys.db.core.QSchemaDef;
import org.smeup.sys.db.core.QTableColumnDef;
import org.smeup.sys.db.core.QTableDef;
import org.smeup.sys.db.syntax.base.BaseDefinitionWriterImpl;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QDecimalDef;

public class DB2DefinitionWriterImpl extends BaseDefinitionWriterImpl {

	public DB2DefinitionWriterImpl() {
		super(new SQLObjectNameHelper());
	}


	@Override
	public String dropSchema(Schema schema) {
		return dropSchema(schema, false);
	}

	@Override
	public String createTable(Schema schema, String name, QTableDef table) {

		StringBuffer result = new StringBuffer("CREATE TABLE ");
		result.append(getNameInSQLFormat(schema) + "." + getNameInSQLFormat(name) + " (");

		String pkey_name = null;

		boolean first = true;
		for (QTableColumnDef column : table.getColumns()) {
			if (!first)
				result.append(", ");
			else
				first = false;

			QDataDef<?> columnDef = column.getDefinition();
			switch (columnDef.getDataDefType()) {

			case IDENTITY:
				result.append(getNameInSQLFormat(column) + " INTEGER NOT NULL  GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1)");
				pkey_name = getNameInSQLFormat(column);
				break;
			case CHARACTER:
				QCharacterDef characterDef = (QCharacterDef)columnDef;
				if(characterDef.isVarying())
					result.append(getNameInSQLFormat(column) + " VARCHAR(" + characterDef.getLength() + ")");
				else if (characterDef.getLength() <= 254)
					result.append(getNameInSQLFormat(column) + " CHAR(" + characterDef.getLength() + ")");
				else
					result.append(getNameInSQLFormat(column) + " VARCHAR(" + characterDef.getLength() + ")");
				break;
			case DECIMAL:
				QDecimalDef decimalDef = (QDecimalDef)columnDef;
				if (decimalDef.getLength() > 31)
					result.append(getNameInSQLFormat(column) + " DECFLOAT(34)");
				else if (decimalDef.getScale() != 0)
					result.append(getNameInSQLFormat(column) + " DECIMAL(" + decimalDef.getLength() + ", " + decimalDef.getScale() + ")");
				else
					result.append(getNameInSQLFormat(column) + " DECIMAL(" + decimalDef.getLength() + ", 0)");
				break;
			default:
				result.append(getNameInSQLFormat(column) + " " + columnDef.getDataDefType().getName().toUpperCase());
			}
		}
		if (pkey_name != null)
			result.append(", PRIMARY KEY (" + pkey_name + ")");
		result.append(")");
		return result.toString();
	}

	public String createIndex(Table table, String indexName, QIndexDef index) {
		StringBuffer result = new StringBuffer("CREATE ");
		if (index.isUnique())
			result.append("UNIQUE ");
		
		
		result.append("INDEX " + getQualifiedNameInSQLFormat(asTable(table.getSchema().getName(), indexName)));
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
	

	// TODO ?!?
	private Table asTable(final String schemaName, final String indexName) {
		return new TableImpl() {
			public Schema getSchema() {
				return new SchemaImpl() {
					public String getName() {
						return schemaName;
					}
				};
			}
			public String getName() {
				return indexName;
			}
		};
	}


	@Override
	public String dropIndex(Index index) {
		return "DROP INDEX " + getQualifiedNameInSQLFormat(asTable(index.getSchema().getName(), index.getName()));
	}

	@Override
	public String dropSchema(Schema schema, boolean ignoreFailOnNonEmpty) {

		if (!ignoreFailOnNonEmpty)
			return "DROP SCHEMA " + getNameInSQLFormat(schema) + " RESTRICT";
		else {
			String sql = "begin " + "  declare l_errschema varchar(128) default 'ERRORSCHEMA';" + "  declare l_errtab varchar(128) default 'ERRORTABLE';" + "  CALL SYSPROC.ADMIN_DROP_SCHEMA('"
					+ schema.getName() + "', NULL, l_errschema, l_errtab);" + " end";

			return sql;
		}
	}

	@Override
	public String createLabel(String name, QSchemaDef schema) {
		return null;
		
/*		String label = schema.getLabel();
		if (label != null && label.trim() != "") 
			return "COMMENT ON SCHEMA  " + name + " IS " + getNameInSQLFormat(label);
		else 
			return null;*/
	}

	@Override
	public String createLabel(Schema schema, String name, QTableDef table) {
		String label = schema.getLabel();
		if (label != null && label.trim() != "") { 
			return "COMMENT ON TABLE " + getNameInSQLFormat(schema) + "." + getNameInSQLFormat(name) + " IS " + getNameInSQLFormat(label);
		} else {
			return null;
		}
	}


	@Override
	public String createLabelForFields(Schema schema, String name, QTableDef table) {
		StringBuffer result = new StringBuffer();
		for (QTableColumnDef column : table.getColumns()) {
			String label = column.getLabel();
			if (label != null && label.trim() != "") {
				if (result.length() > 0)
					result.append(", ");
				result.append(getNameInSQLFormat(column))
					  .append(" IS ")
				      .append(getNameInSQLFormat(label));
			}
		}
		
		if (result.length() > 0) {
			return "COMMENT ON " + getNameInSQLFormat(schema) + "." + getNameInSQLFormat(name) + "(" + result.toString() + ")";
		} else {
			return null;
		}
	}


	@Override
	public String hasLogicals(Table table) {
		return "SELECT * FROM SYSCAT.TABDEP WHERE BSCHEMA = '"+ table.getSchema().getName().trim() + "' AND BNAME = '" + table.getName().trim() + "'";
	}
}