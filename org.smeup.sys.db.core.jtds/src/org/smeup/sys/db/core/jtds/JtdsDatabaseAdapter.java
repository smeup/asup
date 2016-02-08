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
package org.smeup.sys.db.core.jtds;

import java.sql.Driver;

import javax.sql.DataSource;

import net.sourceforge.jtds.jdbcx.JtdsDataSource;

import org.eclipse.net4j.db.DBType;
import org.eclipse.net4j.db.ddl.IDBField;
import org.eclipse.net4j.spi.db.DBAdapter;

public class JtdsDatabaseAdapter extends DBAdapter {
	/**
	 * name.
	 */
	private static final String NAME = "MsSQL";

	/**
	 * version.
	 */
	public static final String VERSION = "1.2.7";

	/**
	 * sole constructor.
	 */
	public JtdsDatabaseAdapter() {
		super(NAME, VERSION);
	}

	/**
	 * getJDBCDriver.
	 *
	 * @return driver
	 */
	@Override
	public final Driver getJDBCDriver() {
		return new net.sourceforge.jtds.jdbc.Driver();
	}

	/**
	 * createJDBCDataSource.
	 *
	 * @return datasource
	 */
	@Override
	public final DataSource createJDBCDataSource() {
		return new JtdsDataSource();
	}

	@Override
	protected final String getTypeName(final IDBField field) {
		DBType type = field.getType();
		switch (type) {
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
		return super.getTypeName(field);
	}

	/**
	 * getReservedWords.
	 *
	 * @return reserved words.
	 */
	@Override
	public final String[] getReservedWords() {
		return getSQL92ReservedWords();
	}
}