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
package org.smeup.sys.db.esql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.esql.CursorType;
import org.smeup.sys.db.esql.QCommunicationArea;
import org.smeup.sys.db.esql.QEsqlContext;
import org.smeup.sys.db.esql.QStatement;

public class JDBCStatementCursorImpl extends JDBCCursorImpl {

	private QStatement statement;
	
	public JDBCStatementCursorImpl(QConnection databaseConnection, QEsqlContext esqlContext,  CursorType cursorType, QStatement statement) {
		super(databaseConnection, esqlContext, cursorType);

		this.statement = statement;
	}

	@Override
	public void open() {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		try {
			
			if(statement == null) {
				handleSQLException(new SQLException("Invalid statement", "X", -924));
				return;
			}
			
			if (getResultSet() != null)
				getResultSet().close();

			setResultSet((ResultSet) statement.executeQuery());

		} catch (SQLException e) {			
			handleSQLException(e);
		}
	}

	@Override
	public void close() {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		try {
			
			if(statement == null) {
				handleSQLException(new SQLException("Invalid statement", "X", -924));
				return;
			}

			if (getResultSet() != null)
				getResultSet().close();
			
		} catch (SQLException e) {
			handleSQLException(e);
		}
	}
}
