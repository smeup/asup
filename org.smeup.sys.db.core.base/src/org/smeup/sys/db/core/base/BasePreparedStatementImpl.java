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

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QPreparedStatement;

public class BasePreparedStatementImpl extends BaseStatementImpl implements QPreparedStatement {

	protected BasePreparedStatementImpl(QConnection connection, PreparedStatement statement, boolean native_) {
		super(connection, statement, native_);

		this.rawStatement = statement;
	}

	private PreparedStatement getPreparedStatement() {
		return (PreparedStatement)this.rawStatement;
	}
	
	@Override
	public void setInt(int parameterIndex, int x) throws SQLException {
		getPreparedStatement().setInt(parameterIndex, x);
	}

	@Override
	public void setObject(int parameterIndex, Object x) throws SQLException {
		getPreparedStatement().setObject(parameterIndex, x);
	}

	@Override
	public void setString(int parameterIndex, String x) throws SQLException {
		getPreparedStatement().setString(parameterIndex, x);
	}

	@Override
	public void addBatch() throws SQLException {
		getPreparedStatement().addBatch();
	}

	@Override
	public void clearParameters() throws SQLException {
		getPreparedStatement().clearParameters();
	}

	@Override
	public boolean execute() throws SQLException {
		return getPreparedStatement().execute();
	}

	@Override
	public ResultSet executeQuery() throws SQLException {
		return getPreparedStatement().executeQuery();
	}

	@Override
	public int executeUpdate() throws SQLException {
		return getPreparedStatement().executeUpdate();
	}

	@Override
	public void setDate(int position, Date value) throws SQLException {
		getPreparedStatement().setDate(position, new java.sql.Date(value.getTime()));
	}

	@Override
	public void setNumber(int position, Number value) throws SQLException {
		getPreparedStatement().setDouble(position, value.doubleValue());
	}
}