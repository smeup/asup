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
import org.smeup.sys.db.esql.QCursor;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.jdbc.JDBCCommunicationAreaImpl;

public abstract class JDBCCursorImpl extends JDBCObjectImpl implements QCursor {

	private CursorType cursorType;
	private ResultSet resultSet;
	private QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
	
	public JDBCCursorImpl(QConnection databaseConnection, QCommunicationArea communicationArea, CursorType cursorType) {
		super(databaseConnection, communicationArea);
		this.cursorType = cursorType;
	}

	public CursorType getCursorType() {
		return cursorType;
	}
	
	@Override
	public void after() {
		// TODO Auto-generated method stub
		"".toCharArray();
	}

	@Override
	public void before() {
		// TODO Auto-generated method stub
		"".toCharArray();
	}

	@Override
	public void next(QBufferedData target) {

		try {
			if (!this.resultSet.next()) {
				// TODO
				getCommunicationArea();
				return;
			}

			dataWriter.set(resultSet.getObject(1));
			target.accept(dataWriter);

		} catch (SQLException e) {
			// TODO
			getCommunicationArea();
			return;
		}
	}

	@Override
	public void next(QBufferedData[] target) {
		// TODO Auto-generated method stub
		"".toCharArray();
	}

	@Override
	public void next(QDataStruct target) {

		JDBCCommunicationAreaImpl communicationAreaImpl = (JDBCCommunicationAreaImpl) getCommunicationArea();
		
		try {
			if (!this.resultSet.next()) {
				communicationAreaImpl.sqlcod.eval(100);
				return;
			}

			communicationAreaImpl.sqlcod.clear();
			
			int c = 1;
			for (QBufferedData bufferedData : target.getElements()) {
				try {

					dataWriter.set(resultSet.getObject(c));
					bufferedData.accept(dataWriter);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				c++;
			}

		} catch (SQLException e) {
			communicationAreaImpl.sqlcod.eval(e.getErrorCode());
			return;
		}		

	}
		
	@Override
	public void openUsingDescriptor(QString descriptorName) {
		// TODO Auto-generated method stub
		"".toCharArray();
	}

	@Override
	public void openUsingVariable(QString variable) {
		// TODO Auto-generated method stub
		"".toCharArray();
	}

	@Override
	public void prior(QBufferedData target) {
		// TODO Auto-generated method stub
		"".toCharArray();
	}

	@Override
	public void prior(QBufferedData[] target) {
		// TODO Auto-generated method stub
		"".toCharArray();
	}

	@Override
	public void prior(QDataStruct target) {
		// TODO Auto-generated method stub
		"".toCharArray();		
	}

	@Override
	public void first(QBufferedData target) {
		// TODO Auto-generated method stub
		"".toCharArray();
	}

	@Override
	public void first(QBufferedData[] target) {
		// TODO Auto-generated method stub
		"".toCharArray();
	}

	@Override
	public void first(QDataStruct target) {
		// TODO Auto-generated method stub
		"".toCharArray();		
	}

	@Override
	public void last(QBufferedData target) {
		// TODO Auto-generated method stub
		"".toCharArray();
	}

	@Override
	public void last(QBufferedData[] target) {
		// TODO Auto-generated method stub
		"".toCharArray();
	}

	@Override
	public void last(QDataStruct target) {
		// TODO Auto-generated method stub
		"".toCharArray();		
	}

	protected ResultSet getResultSet() {
		return resultSet;
	}

	protected void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}
}
