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
package org.smeup.sys.db.syntax.mssql;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.QSchemaDef;
import org.smeup.sys.db.core.QTableColumnDef;
import org.smeup.sys.db.core.QTableDef;
import org.smeup.sys.db.syntax.base.BaseDefinitionWriterImpl;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QDecimalDef;

public class MsSQLDefinitionWriterImpl extends BaseDefinitionWriterImpl {

	public MsSQLDefinitionWriterImpl() {
		super(new SQLObjectNameHelper());
	}

	@Override
	public String createTable(Schema schema, String name,  QTableDef table) {
		
		StringBuffer result = new StringBuffer("CREATE TABLE ");
		result.append(getNameInSQLFormat(schema) + "." + getNameInSQLFormat(name) + " (");

		boolean first = true;
		for (QTableColumnDef column : table.getColumns()) {

			if (!first)
				result.append(", ");

			String columnName = getNameInSQLFormat(column);

			QDataDef<?> columnDef = column.getDefinition();
			switch (columnDef.getDataDefType()) {

			case IDENTITY:
				result.append(columnName + " INT PRIMARY KEY IDENTITY");
				break;
			case CHARACTER:
				QCharacterDef characterDef = (QCharacterDef)columnDef;
				if(characterDef.isVarying()) {
					if (characterDef.getLength() > 8000)
						result.append(columnName + " TEXT");
					else
						result.append(columnName + " VARCHAR(" + characterDef.getLength() + ")");
				}
				else
					result.append(columnName + " CHAR(" + characterDef.getLength() + ")");					

				break;
			case DECIMAL:
				QDecimalDef decimalDef = (QDecimalDef)columnDef;
				if (decimalDef.getScale() != 0)
					result.append(columnName + " DECIMAL(" + decimalDef.getLength() + ", " + decimalDef.getScale() + ")");
				else
					result.append(columnName + " DECIMAL(" + decimalDef.getLength() + ",  0)");
				break;
			default:
				result.append(columnName + " " + columnDef.getDataDefType().getName().toUpperCase());
			}
			first = false;
		}
		result.append(")");
		return result.toString();
	}
	
	@Override
	public String deleteData(Table table) {
		return "TRUNCATE TABLE " + getQualifiedNameInSQLFormat(table);
	}

	@Override
	public String dropSchema(Schema schema, boolean ignoreFailOnNonEmpty) {
		return dropSchema(schema);
	}
	
	@Override
	public String createLabel(String name, QSchemaDef schema) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createLabel(Schema schema, String name, QTableDef table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createLabelForFields(Schema schema, String name,
			QTableDef table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hasLogicals(Table table) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String copyTableData(Table tableFrom, Table tableTo,	boolean isCreateRelativeRecordNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String renameTable(Table table, String newName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String renameIndex(Index index, String newName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String resetIdentity(Table table) {
		// TODO Auto-generated method stub
		return null;
	}
}
