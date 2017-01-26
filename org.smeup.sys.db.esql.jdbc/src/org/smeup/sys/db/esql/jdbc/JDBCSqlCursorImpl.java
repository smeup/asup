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

import java.sql.SQLException;

import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QPreparedStatement;
import org.smeup.sys.db.esql.CursorType;
import org.smeup.sys.db.esql.QCommunicationArea;
import org.smeup.sys.db.esql.QEsqlContext;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;

public class JDBCSqlCursorImpl extends JDBCCursorImpl {

	private String sql;
	private QBufferedElement[] parameters;
	private org.smeup.sys.db.core.QStatement dbStatement;

	public JDBCSqlCursorImpl(QConnection databaseConnection, QEsqlContext esqlContext, CursorType cursorType, String sql, QBufferedElement[] parameters) {
		super(databaseConnection, esqlContext, cursorType);

		this.sql = sql;
		this.parameters = parameters;
	}

	@Override
	public void open() {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		try {

			if (dbStatement != null)
				dbStatement.close();

			if (getResultSet() != null)
				getResultSet().close();
			
			if (parameters != null) {
				dbStatement = getDatabaseConnection().prepareStatement(sql, false, true);
				QPreparedStatement dbPreparedStatement = (QPreparedStatement) dbStatement;
				int i = 1;
				for(QBufferedElement parameter: parameters) {
					switch (parameter.getBufferedElementType()) {
					case DATETIME:
						QDatetime datetime = (QDatetime)parameter;
						dbPreparedStatement.setDate(i, datetime.asDate());	
						break;
					case NUMERIC:
						QNumeric numeric = (QNumeric)parameter;
						dbPreparedStatement.setNumber(i, numeric.asNumber());
						break;
					case STRING:
						QString string = (QString)parameter;
						dbPreparedStatement.setString(i, string.asString());
						break;
					}
					
					i++;
				}
				setResultSet(dbPreparedStatement.executeQuery());
			}
			else {
				dbStatement = getDatabaseConnection().createStatement(false, true);
				setResultSet(dbStatement.executeQuery(sql));
			}			
		} catch (SQLException e) {
			handleSQLException(e);
		}
	}

	@Override
	public void close() {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		try {
			if (dbStatement != null)
				dbStatement.close();

			if (getResultSet() != null)
				getResultSet().close();

		} catch (SQLException e) {
			handleSQLException(e);
		}
	}
}
