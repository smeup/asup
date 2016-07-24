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
import org.smeup.sys.db.esql.CursorType;
import org.smeup.sys.db.esql.QCommunicationArea;

public class JDBCSqlCursorImpl extends JDBCCursorImpl {

	private String sql;
	private org.smeup.sys.db.core.QStatement dbStatement;


	public JDBCSqlCursorImpl(QConnection databaseConnection, QCommunicationArea communicationArea, CursorType cursorType, String sql) {
		super(databaseConnection, communicationArea, cursorType);

		this.sql = sql;
	}

	@Override
	public void open() {

		try {

			getCommunicationArea().clear();
			
			if (dbStatement != null)
				dbStatement.close();

			if (getResultSet() != null)
				getResultSet().close();

			dbStatement = getDatabaseConnection().createStatement(false, true);

			this.setResultSet(dbStatement.executeQuery(sql));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			getCommunicationArea();
		}
	}

	@Override
	public void close() {

		try {
			if (dbStatement != null)
				dbStatement.close();

			if (getResultSet() != null)
				getResultSet().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			getCommunicationArea();
		}
	}
}
