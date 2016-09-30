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

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;
import org.smeup.sys.db.core.QCatalogContainer;
import org.smeup.sys.db.core.QCatalogGenerationStrategy;
import org.smeup.sys.db.core.QCatalogMetaData;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QDatabaseContainer;
import org.smeup.sys.db.core.QStatement;
import org.smeup.sys.db.syntax.QAliasResolver;
import org.smeup.sys.db.syntax.QQueryParser;
import org.smeup.sys.il.core.ctx.QContext;

public class BaseConnectionImpl implements QConnection {

	private QContext context;
	private QDatabaseContainer databaseContainer;
	private QCatalogMetaData catalogMetaData;

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
	public void close() throws SQLException {

		for (BaseCatalogConnection catalogConnection : catalogConnections)
			catalogConnection.close();

		this.catalogConnections.clear();
		this.currentCatalogConnection = null;
		this.virtualCatalog = null;

		this.context.close();
	}

	@Override
	public BaseStatementImpl createStatement() throws SQLException {
		return createStatement(false);
	}

	@Override
	public BaseStatementImpl createStatement(boolean native_) throws SQLException {
		return createStatement(native_, false);
	}

	@SuppressWarnings("resource")
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

		if (this.catalogMetaData == null) {
			synchronized (this) {
				if (this.catalogMetaData == null) {
					try {
						catalogMetaData = new BaseCatalogMetaDataConnectionImpl(this, getCatalogConnection().getCatalogMetaData());
					} catch (SQLException e) {
						e.printStackTrace();
						return null;
					}
				}
			}
		}

		return catalogMetaData;
	}

	@Override
	public QContext getContext() {
		return context;
	}

	private Connection getRawConnection() throws SQLException {
		return getCatalogConnection().getRawConnection();
	}

	@Override
	public BasePreparedStatementImpl prepareStatement(String sql) throws SQLException {
		return prepareStatement(sql, false);
	}

	@Override
	public BasePreparedStatementImpl prepareStatement(String sql, boolean native_) throws SQLException {
		return prepareStatement(sql, native_, false);
	}

	@SuppressWarnings("resource")
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
	public void setCatalog(String catalog) throws SQLException {

		if (catalog != null && catalog.equals(virtualCatalog))
			return;

		virtualCatalog = catalog;
		currentCatalogConnection = null;

		getRawConnection();

	}

	@Override
	public String translate(String sql) throws SQLException {

		try {
			SQLQueryParseResult query = queryParser.parseQuery(sql);
			BaseCatalogConnection connection = getCatalogConnection();

			if (aliasResolver == null)
				aliasResolver = context.get(QAliasResolver.class);

			if (aliasResolver != null)
				aliasResolver.resolveQuery(this, query);

			sql = connection.getQueryWriter().writeQuery(query.getQueryStatement());
		} catch (Exception e) {
			throw new SQLException("Invalid query", "X", -84, e);
		}

		return sql;
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