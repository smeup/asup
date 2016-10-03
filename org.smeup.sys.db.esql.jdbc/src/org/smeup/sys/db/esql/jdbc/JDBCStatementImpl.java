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

import org.smeup.sys.db.core.DatabaseCoreRuntimeException;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.esql.QCommunicationArea;
import org.smeup.sys.db.esql.QDescriptorArea;
import org.smeup.sys.db.esql.QEsqlContext;
import org.smeup.sys.db.esql.QStatement;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;

public class JDBCStatementImpl extends JDBCObjectImpl implements QStatement {
	

	private org.smeup.sys.db.core.QPreparedStatement dbStatement = null;
	
	public JDBCStatementImpl(QConnection databaseConnection, QEsqlContext esqlContext) {
		super(databaseConnection, esqlContext);
	}

	@Override
	public void prepare(QString sql) {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		try {
			if(dbStatement != null)
				dbStatement.close();
			
			dbStatement = getDatabaseConnection().prepareStatement(sql.trimR());
		} catch (SQLException e) {
			handleSQLException(e);
		}		
	}

	@Override
	public void prepare(String sql) {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		try {
			if(dbStatement != null)
				dbStatement.close();

			dbStatement = getDatabaseConnection().prepareStatement(sql);
		} catch (SQLException e) {
			handleSQLException(e);
		}		
	}
	
	@Override
	public void execute() {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		if(dbStatement == null) {
			handleSQLException(new SQLException("Invalid statement", "X", -924));
			return;
		}

		try {
			dbStatement.close();
			
			dbStatement.execute();
		} catch (SQLException e) {
			handleSQLException(e);
		}
	}

	@Override
	public Object executeQuery() {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		if(dbStatement == null) {
			handleSQLException(new SQLException("Invalid statement", "X", -924));
			return null;
		}

		try {
			return dbStatement.executeQuery();
		} catch (SQLException e) {
			handleSQLException(e);
			return null;
		}
	}

	@Override
	public void close() {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		if(dbStatement != null)
			dbStatement.close();		
	}

	@Override
	public void describe(String descriptor) {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();
		
		QDescriptorArea descriptorArea = getEsqlContext().getDescriptorArea(descriptor);
		if (descriptorArea == null)
			throw new DatabaseCoreRuntimeException("Descriptor not found: " + descriptor);
		
	}

	@Override
	public void prepare(String sql, QBufferedElement[] parameters) {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		try {
			dbStatement = getDatabaseConnection().prepareStatement(sql);
			int i = 1;
			for(QBufferedElement parameter: parameters) {
				switch (parameter.getBufferedElementType()) {
				case DATETIME:
					QDatetime datetime = (QDatetime)parameter;
					dbStatement.setDate(i, datetime.asDate());	
					break;
				case NUMERIC:
					QNumeric numeric = (QNumeric)parameter;
					dbStatement.setNumber(i, numeric.asNumber());
					break;
				case STRING:
					QString string = (QString)parameter;
					dbStatement.setString(i, string.asString());
					break;
				}
				
				i++;
			}
		} catch (SQLException e) {
			handleSQLException(e);
		}		
	}
	

	protected void handleSQLException(SQLException e) {
		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.setSqlCode(e.getErrorCode());
		if(communicationArea.getSqlCode() == 0)
			communicationArea.setSqlCode(-924);
	}
}