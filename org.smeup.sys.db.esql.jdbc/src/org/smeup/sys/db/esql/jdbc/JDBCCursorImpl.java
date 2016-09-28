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
import org.smeup.sys.db.esql.QCommunicationAreaImpl;
import org.smeup.sys.db.esql.QCursor;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QNumeric;

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


		QCommunicationAreaImpl communicationAreaImpl = (QCommunicationAreaImpl) getCommunicationArea();
		
		try {
			if (!this.resultSet.next()) {
				communicationAreaImpl.sqlcod.eval(100);
				return;
			}

			communicationAreaImpl.sqlcod.clear();
			
			completeTarget(target);
			
		} catch (SQLException e) {
			communicationAreaImpl.sqlcod.eval(e.getErrorCode());
			return;
		}
	}

	@Override
	public void next(QDataStruct target) {

		QCommunicationAreaImpl communicationAreaImpl = (QCommunicationAreaImpl) getCommunicationArea();
		
		try {
			if (!this.resultSet.next()) {
				communicationAreaImpl.sqlcod.eval(100);
				return;
			}

			communicationAreaImpl.sqlcod.clear();
			
			completeTarget(target.getElements().toArray(new QBufferedData[target.getElements().size()]));

		} catch (SQLException e) {
			communicationAreaImpl.sqlcod.eval(e.getErrorCode());
			return;
		}		

	}
	
	@Override
	public void next(String descriptor) {
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
	public void prior(String descriptor) {
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
	public void first(String descriptor) {
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

	@Override
	public void last(String descriptor) {
		// TODO Auto-generated method stub
		"".toCharArray();
	}

	@Override
	public void relative(QNumeric position, String descriptor) {
		// TODO Auto-generated method stub
		"".toCharArray();
	}

	protected ResultSet getResultSet() {
		return resultSet;
	}

	protected void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}
	
	private void completeTarget(QBufferedData[] target) {

		int c = 1;
		for (QBufferedData bufferedData : target) {
			try {

				dataWriter.set(resultSet.getObject(c));
				bufferedData.accept(dataWriter);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c++;
		}
	}
}
