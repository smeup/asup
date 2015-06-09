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
package org.smeup.sys.db.core.mssql;

import java.sql.Driver;

import javax.sql.DataSource;


import org.eclipse.net4j.db.DBType;
import org.eclipse.net4j.db.ddl.IDBField;
import org.eclipse.net4j.spi.db.DBAdapter;

public class MsSQLDatabaseAdapter extends DBAdapter {
	/**
	 * name.
	 */
	private static final String NAME = "MsSQL";

	/**
	 * version.
	 */
	public static final String VERSION = "3.0.0";

	/**
	 * sole constructor.
	 */
	public MsSQLDatabaseAdapter() {
		super( NAME, VERSION );
	}

	/**
	 * getJDBCDriver.
	 * 
	 * @return driver
	 */
	public final Driver getJDBCDriver() {
		return new com.microsoft.sqlserver.jdbc.SQLServerDriver();
	}

	/**
	 * createJDBCDataSource.
	 * 
	 * @return datasource
	 */
	public final DataSource createJDBCDataSource() {
		return new com.microsoft.sqlserver.jdbc.SQLServerDataSource();
	}

	@Override
	protected final String getTypeName( final IDBField field ) {
		DBType type = field.getType();
		switch ( type ) {
		case BIT:
			return "SMALLINT";
		case CLOB:
		case LONGVARCHAR:
			return "NTEXT";
		case VARCHAR:
			return "NVARCHAR(4000)";
		case NUMERIC:
			return "DECIMAL";
		case BOOLEAN:
			return "SMALLINT";
		case LONGVARBINARY:
		case BLOB:
			return "VARBINARY(4000)";
		case TIMESTAMP:
			return "DATETIME";
		default:
			break;
		}
		return super.getTypeName( field );
	}

	/**
	 * getReservedWords.
	 * 
	 * @return reserved words.
	 */
	public final String[] getReservedWords() {
		return getSQL92ReservedWords();
	}
}