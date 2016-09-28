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

import java.io.IOException;
import java.sql.SQLException;

import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.esql.QCommunicationArea;
import org.smeup.sys.db.esql.QStatement;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;

public class JDBCStatementImpl extends JDBCObjectImpl implements QStatement {
	

	private org.smeup.sys.db.core.QPreparedStatement dbStatement = null;
	
	public JDBCStatementImpl(QConnection databaseConnection, QCommunicationArea communicationArea) {
		super(databaseConnection, communicationArea);
	}

	@Override
	public void prepare(QString sql) {

		try {
			if(dbStatement != null)
				dbStatement.close();
			
			dbStatement = getDatabaseConnection().prepareStatement(sql.trimR());
		} catch (SQLException e) {
			// TODO
			getCommunicationArea();
		}
		
	}

	@Override
	public void prepare(String sql) {

		try {
			dbStatement = getDatabaseConnection().prepareStatement(sql);
		} catch (SQLException e) {
			// TODO
			getCommunicationArea();
		}		
	}
	
	@Override
	public void execute() {

		if(dbStatement != null) {
			try {
				dbStatement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				getCommunicationArea();
			}
		}
		else
			// TODO
			getCommunicationArea();
	}

	@Override
	public Object executeQuery() {

		if(dbStatement != null) {
			try {
				return dbStatement.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				getCommunicationArea();
			}
		}
		else
			// TODO
			getCommunicationArea();
		
		return null;
	}

	@Override
	public void close() throws IOException {

		if(dbStatement != null)
			dbStatement.close();		
	}

	@Override
	public void describe(String descriptor) {
		// TODO
		"".toCharArray();
	}

	@Override
	public void prepare(String sql, QBufferedElement[] parameters) {

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
			// TODO
			getCommunicationArea();
		}
		
	}
}