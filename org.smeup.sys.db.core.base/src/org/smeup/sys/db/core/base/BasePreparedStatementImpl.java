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

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QPreparedStatement;

public class BasePreparedStatementImpl extends BaseStatementImpl implements QPreparedStatement, PreparedStatement {

	private PreparedStatement rawStatement;

	protected BasePreparedStatementImpl(QConnection connection, PreparedStatement statement, boolean native_) {
		super(connection, statement, native_);

		this.rawStatement = statement;
	}

	@Override
	public void setArray(int parameterIndex, Array x) throws SQLException {
		rawStatement.setArray(parameterIndex, x);
	}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
		rawStatement.setAsciiStream(parameterIndex, x, length);
	}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {
		rawStatement.setAsciiStream(parameterIndex, x, length);
	}

	@Override
	public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {
		rawStatement.setAsciiStream(parameterIndex, x);
	}

	@Override
	public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
		rawStatement.setBigDecimal(parameterIndex, x);
	}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
		rawStatement.setBinaryStream(parameterIndex, x, length);
	}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {
		rawStatement.setBinaryStream(parameterIndex, x, length);
	}

	@Override
	public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {
		rawStatement.setBinaryStream(parameterIndex, x);
	}

	@Override
	public void setBlob(int parameterIndex, Blob x) throws SQLException {
		rawStatement.setBlob(parameterIndex, x);
	}

	@Override
	public void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {
		rawStatement.setBlob(parameterIndex, inputStream, length);
	}

	@Override
	public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {
		rawStatement.setBlob(parameterIndex, inputStream);
	}

	@Override
	public void setBoolean(int parameterIndex, boolean x) throws SQLException {
		rawStatement.setBoolean(parameterIndex, x);
	}

	@Override
	public void setByte(int parameterIndex, byte x) throws SQLException {
		rawStatement.setByte(parameterIndex, x);
	}

	@Override
	public void setBytes(int parameterIndex, byte[] x) throws SQLException {
		rawStatement.setBytes(parameterIndex, x);
	}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
		rawStatement.setCharacterStream(parameterIndex, reader, length);
	}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {
		rawStatement.setCharacterStream(parameterIndex, reader, length);
	}

	@Override
	public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {
		rawStatement.setCharacterStream(parameterIndex, reader);
	}

	@Override
	public void setClob(int parameterIndex, Clob x) throws SQLException {
		rawStatement.setClob(parameterIndex, x);
	}

	@Override
	public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {
		rawStatement.setClob(parameterIndex, reader, length);
	}

	@Override
	public void setClob(int parameterIndex, Reader reader) throws SQLException {
		rawStatement.setClob(parameterIndex, reader);
	}

	@Override
	public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
		rawStatement.setDate(parameterIndex, x, cal);
	}

	@Override
	public void setDate(int parameterIndex, Date x) throws SQLException {
		rawStatement.setDate(parameterIndex, x);
	}

	@Override
	public void setDouble(int parameterIndex, double x) throws SQLException {
		rawStatement.setDouble(parameterIndex, x);
	}

	@Override
	public void setFloat(int parameterIndex, float x) throws SQLException {
		rawStatement.setFloat(parameterIndex, x);
	}

	@Override
	public void setInt(int parameterIndex, int x) throws SQLException {
		rawStatement.setInt(parameterIndex, x);
	}

	@Override
	public void setLong(int parameterIndex, long x) throws SQLException {
		rawStatement.setLong(parameterIndex, x);
	}

	@Override
	public void setNCharacterStream(int parameterIndex, Reader value, long length) throws SQLException {
		rawStatement.setNCharacterStream(parameterIndex, value, length);
	}

	@Override
	public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {
		rawStatement.setNCharacterStream(parameterIndex, value);
	}

	@Override
	public void setNClob(int parameterIndex, NClob value) throws SQLException {
		rawStatement.setNClob(parameterIndex, value);
	}

	@Override
	public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {
		rawStatement.setNClob(parameterIndex, reader, length);
	}

	@Override
	public void setNClob(int parameterIndex, Reader reader) throws SQLException {
		rawStatement.setNClob(parameterIndex, reader);
	}

	@Override
	public void setNString(int parameterIndex, String value) throws SQLException {
		rawStatement.setNString(parameterIndex, value);
	}

	@Override
	public void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException {
		rawStatement.setNull(parameterIndex, sqlType, typeName);
	}

	@Override
	public void setNull(int parameterIndex, int sqlType) throws SQLException {
		rawStatement.setNull(parameterIndex, sqlType);
	}

	@Override
	public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) throws SQLException {
		rawStatement.setObject(parameterIndex, x, targetSqlType, scaleOrLength);
	}

	@Override
	public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
		rawStatement.setObject(parameterIndex, x, targetSqlType);
	}

	@Override
	public void setObject(int parameterIndex, Object x) throws SQLException {
		rawStatement.setObject(parameterIndex, x);
	}

	@Override
	public void setRef(int parameterIndex, Ref x) throws SQLException {
		rawStatement.setRef(parameterIndex, x);
	}

	@Override
	public void setRowId(int parameterIndex, RowId x) throws SQLException {
		rawStatement.setRowId(parameterIndex, x);
	}

	@Override
	public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {
		rawStatement.setSQLXML(parameterIndex, xmlObject);
	}

	@Override
	public void setShort(int parameterIndex, short x) throws SQLException {
		rawStatement.setShort(parameterIndex, x);
	}

	@Override
	public void setString(int parameterIndex, String x) throws SQLException {
		rawStatement.setString(parameterIndex, x);
	}

	@Override
	public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
		rawStatement.setTime(parameterIndex, x, cal);
	}

	@Override
	public void setTime(int parameterIndex, Time x) throws SQLException {
		rawStatement.setTime(parameterIndex, x);
	}

	@Override
	public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
		rawStatement.setTimestamp(parameterIndex, x, cal);
	}

	@Override
	public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
		rawStatement.setTimestamp(parameterIndex, x);
	}

	@Override
	public void setURL(int parameterIndex, URL x) throws SQLException {
		rawStatement.setURL(parameterIndex, x);
	}

	@Override
	@SuppressWarnings("deprecation")
	public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
		rawStatement.setUnicodeStream(parameterIndex, x, length);
	}

	@Override
	public ResultSetMetaData getMetaData() throws SQLException {
		return rawStatement.getMetaData();
	}

	@Override
	public ParameterMetaData getParameterMetaData() throws SQLException {
		return rawStatement.getParameterMetaData();
	}

	@Override
	public void addBatch() throws SQLException {
		rawStatement.addBatch();
	}

	@Override
	public void clearParameters() throws SQLException {
		rawStatement.clearParameters();
	}

	@Override
	public boolean execute() throws SQLException {
		return rawStatement.execute();
	}

	@Override
	public ResultSet executeQuery() throws SQLException {
		return rawStatement.executeQuery();
	}

	@Override
	public int executeUpdate() throws SQLException {
		return rawStatement.executeUpdate();
	}
}
