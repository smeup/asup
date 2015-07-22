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
package org.smeup.sys.db.core.base;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;
import org.smeup.sys.db.core.DatabaseCoreRuntimeException;
import org.smeup.sys.db.core.QCatalogContainer;
import org.smeup.sys.db.core.QCatalogGenerationStrategy;
import org.smeup.sys.db.core.QCatalogMetaData;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QConnectionDescription;
import org.smeup.sys.db.core.QDatabaseContainer;
import org.smeup.sys.db.core.QStatement;
import org.smeup.sys.db.syntax.QAliasResolver;
import org.smeup.sys.db.syntax.QQueryParser;
import org.smeup.sys.il.core.ctx.QContext;

public class BaseConnectionImpl implements QConnection, Connection {

	private QContext context;
	private QDatabaseContainer databaseContainer;

	private QQueryParser queryParser;
	private QAliasResolver aliasResolver;
	
	private String virtualCatalog;
	private BaseCatalogConnection currentCatalogConnection;
	private List<BaseCatalogConnection> catalogConnections;

	public BaseConnectionImpl(QDatabaseContainer databaseContainer, QContext context) {

		this.context = context;
		this.databaseContainer = databaseContainer;
		this.queryParser = context.get(QQueryParser.class);
		
		this.catalogConnections = new ArrayList<BaseCatalogConnection>();
	}

	@Override
	public void abort(Executor executor) throws SQLException {
		getRawConnection().abort(executor);
	}

	@Override
	public void clearWarnings() throws SQLException {
		getRawConnection().clearWarnings();
	}

	@Override
	public void close() throws SQLException {

		for (BaseCatalogConnection catalogConnection : catalogConnections)
			catalogConnection.close();

		this.catalogConnections.clear();
		this.currentCatalogConnection = null;
		this.virtualCatalog = null;
	}

	@Override
	public void commit() throws SQLException {
		Connection connection = getRawConnection();
		connection.commit();
	}

	@Override
	public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
		return getRawConnection().createArrayOf(typeName, elements);
	}

	@Override
	public Blob createBlob() throws SQLException {
		return getRawConnection().createBlob();
	}

	@Override
	public Clob createClob() throws SQLException {
		return getRawConnection().createClob();
	}

	@Override
	public NClob createNClob() throws SQLException {
		return getRawConnection().createNClob();
	}

	@Override
	public SQLXML createSQLXML() throws SQLException {
		return getRawConnection().createSQLXML();
	}

	@Override
	public BaseStatementImpl createStatement() throws SQLException {
		return createStatement(false);
	}

	@Override
	public BaseStatementImpl createStatement(boolean native_) throws SQLException {
		return createStatement(native_, false);
	}

	@Override
	public BaseStatementImpl createStatement(boolean native_, boolean updatable) throws SQLException {

		Statement sqlStatement = null;
		if (updatable)
			// connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
			sqlStatement = getRawConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
		else
			sqlStatement = getRawConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);

		BaseStatementImpl statement = new BaseStatementImpl(this, sqlStatement, native_);
		return statement;

	}

	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
		return getRawConnection().createStatement(resultSetType, resultSetConcurrency);
	}

	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		return getRawConnection().createStatement(resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	@Override
	public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
		return getRawConnection().createStruct(typeName, attributes);
	}

	@Override
	public boolean getAutoCommit() throws SQLException {
		return getRawConnection().getAutoCommit();
	}

	@Override
	public String getCatalog() throws SQLException {
		return virtualCatalog;
	}

	private BaseCatalogConnection getCatalogConnection() throws SQLException {

		if (currentCatalogConnection != null)
			return currentCatalogConnection;

		if (getCatalog() == null) {

			QCatalogContainer catalogContainer = this.databaseContainer.getDefaultCatalogContainer();

			// search on connected catalog
			for (BaseCatalogConnection catalogConnection : catalogConnections)
				if (catalogConnection.getCatalogContainer().equals(catalogContainer))
					return catalogConnection;

			currentCatalogConnection = new BaseCatalogConnection(catalogContainer);
			catalogConnections.add(currentCatalogConnection);
		} else {

			// search on connected catalog
			for (BaseCatalogConnection catalogConnection : catalogConnections)
				if (getCatalog().equals(catalogConnection.getCatalogContainer().getName()))
					return catalogConnection;

			for (QCatalogContainer catalogContainer : this.databaseContainer.getCatalogContainers())
				if (getCatalog().equals(catalogContainer.getName())) {

					currentCatalogConnection = new BaseCatalogConnection(catalogContainer);
					catalogConnections.add(currentCatalogConnection);

					break;
				}
		}

		return currentCatalogConnection;
	}

	@Override
	public QCatalogGenerationStrategy getCatalogGenerationStrategy() {
		try {
			return getCatalogConnection().getCatalogGenerationStrategy();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public QCatalogMetaData getCatalogMetaData() {
		try {
			return getCatalogConnection().getCatalogMetaData();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Properties getClientInfo() throws SQLException {
		return getRawConnection().getClientInfo();
	}

	@Override
	public String getClientInfo(String name) throws SQLException {
		return getRawConnection().getClientInfo(name);
	}

	@Override
	public QConnectionDescription getConnectionDescription() {

		QConnectionDescription connectionDescription = getContext().get(QConnectionDescription.class);
		if (connectionDescription == null) {

			final List<String> schemas = new ArrayList<String>();
			for (Schema schema : getCatalogMetaData().getSchemas())
				schemas.add(schema.getName());

			connectionDescription = new QConnectionDescription() {

				@Override
				public List<String> getSchemas() {
					return schemas;
				}
			};
		}

		return connectionDescription;
	}

	@Override
	public QContext getContext() {
		return context;
	}

	@Override
	public int getHoldability() throws SQLException {
		return getRawConnection().getHoldability();
	}

	@Override
	public DatabaseMetaData getMetaData() throws SQLException {
		return getRawConnection().getMetaData();
	}

	@Override
	public int getNetworkTimeout() throws SQLException {
		return getRawConnection().getNetworkTimeout();
	}

	private Connection getRawConnection() throws SQLException {
		return getCatalogConnection().getRawConnection();
	}

	@Override
	public String getSchema() throws SQLException {
		return getRawConnection().getSchema();
	}

	@Override
	public int getTransactionIsolation() throws SQLException {
		return getRawConnection().getTransactionIsolation();
	}

	@Override
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		return getRawConnection().getTypeMap();
	}

	@Override
	public SQLWarning getWarnings() throws SQLException {
		return getRawConnection().getWarnings();
	}

	@Override
	public boolean isClosed() throws SQLException {

		try {
			if (getRawConnection() == null)
				return true;
		} catch (DatabaseCoreRuntimeException e) {
			return true;
		}

		return false;
	}

	@Override
	public boolean isReadOnly() throws SQLException {
		return getRawConnection().isReadOnly();
	}

	@Override
	public boolean isValid(int timeout) throws SQLException {
		return getRawConnection().isValid(timeout);
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return getRawConnection().isWrapperFor(iface);
	}

	@Override
	public String nativeSQL(String sql) throws SQLException {
		return getRawConnection().nativeSQL(sql);
	}

	@Override
	public CallableStatement prepareCall(String sql) throws SQLException {
		return getRawConnection().prepareCall(sql);
	}

	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		return getRawConnection().prepareCall(sql, resultSetType, resultSetConcurrency);
	}

	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		return getRawConnection().prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	@Override
	public BasePreparedStatementImpl prepareStatement(String sql) throws SQLException {
		return prepareStatement(sql, false);
	}

	@Override
	public BasePreparedStatementImpl prepareStatement(String sql, boolean native_) throws SQLException {
		return prepareStatement(sql, native_, false);
	}

	@Override
	public BasePreparedStatementImpl prepareStatement(String sql, boolean native_, boolean updatable) throws SQLException {

		if (!native_)
			sql = translate(sql);

		PreparedStatement sqlPreparedStatement = null;
		if (updatable)
			sqlPreparedStatement = getRawConnection().prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		else
			sqlPreparedStatement = getRawConnection().prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);

		BasePreparedStatementImpl statement = new BasePreparedStatementImpl(this, sqlPreparedStatement, native_);

		return statement;
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
		return getRawConnection().prepareStatement(sql, autoGeneratedKeys);
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		return getRawConnection().prepareStatement(sql, resultSetType, resultSetConcurrency);
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		return getRawConnection().prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
		return getRawConnection().prepareStatement(sql, columnIndexes);
	}

	@Override
	public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
		return getRawConnection().prepareStatement(sql, columnNames);
	}

	@Override
	public void releaseSavepoint(Savepoint savepoint) throws SQLException {
		getRawConnection().releaseSavepoint(savepoint);
	}

	@Override
	public void rollback() throws SQLException {
		Connection connection = getRawConnection();
		connection.rollback();
	}

	@Override
	public void rollback(Savepoint savepoint) throws SQLException {
		getRawConnection().rollback(savepoint);
	}

	@Override
	public void setAutoCommit(boolean autoCommit) throws SQLException {
		Connection connection = getRawConnection();
		connection.setAutoCommit(autoCommit);
	}

	@Override
	public void setCatalog(String catalog) throws SQLException {

		if (catalog != null && catalog.equals(virtualCatalog))
			return;

		virtualCatalog = catalog;
		currentCatalogConnection = null;

		getRawConnection();

	}

	@Override
	public void setClientInfo(Properties properties) throws SQLClientInfoException {
		try {
			getRawConnection().setClientInfo(properties);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void setClientInfo(String name, String value) throws SQLClientInfoException {
		try {
			getRawConnection().setClientInfo(name, value);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void setHoldability(int holdability) throws SQLException {
		getRawConnection().setHoldability(holdability);
	}

	@Override
	public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
		getRawConnection().setNetworkTimeout(executor, milliseconds);
	}

	@Override
	public void setReadOnly(boolean readOnly) throws SQLException {
		getRawConnection().setReadOnly(readOnly);
	}

	@Override
	public Savepoint setSavepoint() throws SQLException {
		return getRawConnection().setSavepoint();
	}

	@Override
	public Savepoint setSavepoint(String name) throws SQLException {
		return getRawConnection().setSavepoint(name);
	}

	@Override
	public void setSchema(String schema) throws SQLException {
		getRawConnection().setSchema(schema);
	}

	@Override
	public void setTransactionIsolation(int level) throws SQLException {
		getRawConnection().setTransactionIsolation(level);
	}

	@Override
	public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
		getRawConnection().setTypeMap(map);
	}

	@Override
	public String translate(String sql) throws SQLException {

		try {
			SQLQueryParseResult query = queryParser.parseQuery(sql);
			BaseCatalogConnection connection = getCatalogConnection();

			if(aliasResolver == null)
				aliasResolver = context.get(QAliasResolver.class);
			
			if(aliasResolver != null) 
				aliasResolver.resolveQuery(this, query);
			
			sql = connection.getQueryWriter().writeQuery(query.getQueryStatement());
		} catch (Exception e) {
			throw new SQLException(e);
		}

		return sql;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return getRawConnection().unwrap(iface);
	}

	@Override
	public void close(QStatement stmt) {
		try {
			if (stmt != null) { 
				stmt.close(); 
			}
		} catch (Exception e) {
		}  	
	}

	@Override
	public void close(ResultSet rs) {
		try {
			if (rs != null) { 
				rs.close(); 
			}
		} catch (Exception e) {
		}  	
	}
}