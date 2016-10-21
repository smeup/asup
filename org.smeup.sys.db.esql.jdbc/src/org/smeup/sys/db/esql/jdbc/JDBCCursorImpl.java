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

import org.smeup.sys.db.core.DatabaseCoreRuntimeException;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QDatabaseManager;
import org.smeup.sys.db.esql.CursorType;
import org.smeup.sys.db.esql.FetchPositioning;
import org.smeup.sys.db.esql.QCommunicationArea;
import org.smeup.sys.db.esql.QCursor;
import org.smeup.sys.db.esql.QDescriptorArea;
import org.smeup.sys.db.esql.QEsqlContext;
import org.smeup.sys.db.esql.impl.DescriptorVariableImpl;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QRecord;

public abstract class JDBCCursorImpl extends JDBCObjectImpl implements QCursor {

	private CursorType cursorType;
	private ResultSet resultSet;
	private QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();

	public JDBCCursorImpl(QConnection databaseConnection, QEsqlContext esqlContext, CursorType cursorType) {
		super(databaseConnection, esqlContext);
		this.cursorType = cursorType;
	}

	public CursorType getCursorType() {
		return cursorType;
	}

	@Override
	public void after() {
		handleResultSet(FetchPositioning.AFTER, 0, (QBufferedData[])null);
	}

	@Override
	public void before() {
		handleResultSet(FetchPositioning.BEFORE, 0, (QBufferedData[])null);
	}

	@Override
	public void next(QBufferedData target) {
		handleResultSet(FetchPositioning.NEXT, 0, new QBufferedData[] { target });
	}

	@Override
	public void next(QBufferedData[] target) {
		handleResultSet(FetchPositioning.NEXT, 0, target);
	}

	@Override
	public void next(QDataStruct target) {
		handleResultSet(FetchPositioning.NEXT, 0, target.getElements().toArray(new QBufferedData[target.getElements().size()]));
	}

	@Override
	public void next(String descriptor) {		
		handleResultSet(FetchPositioning.NEXT, 0, descriptor);
	}

	@Override
	public void prior(QBufferedData target) {
		handleResultSet(FetchPositioning.PRIOR, 0, new QBufferedData[] { target });
	}

	@Override
	public void prior(QBufferedData[] target) {
		handleResultSet(FetchPositioning.PRIOR, 0, target);
	}

	@Override
	public void prior(QDataStruct target) {
		handleResultSet(FetchPositioning.PRIOR, 0, target.getElements().toArray(new QBufferedData[target.getElements().size()]));
	}

	@Override
	public void prior(String descriptor) {
		handleResultSet(FetchPositioning.PRIOR, 0, descriptor);
	}

	@Override
	public void first(QBufferedData target) {
		handleResultSet(FetchPositioning.FIRST, 0, new QBufferedData[] { target });
	}

	@Override
	public void first(QBufferedData[] target) {
		handleResultSet(FetchPositioning.FIRST, 0, target);
	}

	@Override
	public void first(QDataStruct target) {
		handleResultSet(FetchPositioning.FIRST, 0, target.getElements().toArray(new QBufferedData[target.getElements().size()]));
	}

	@Override
	public void first(String descriptor) {
		handleResultSet(FetchPositioning.FIRST, 0, descriptor);
	}

	@Override
	public void last(QBufferedData target) {
		handleResultSet(FetchPositioning.LAST, 0, new QBufferedData[] { target });
	}

	@Override
	public void last(QBufferedData[] target) {
		handleResultSet(FetchPositioning.LAST, 0, target);
	}

	@Override
	public void last(QDataStruct target) {
		handleResultSet(FetchPositioning.LAST, 0, target.getElements().toArray(new QBufferedData[target.getElements().size()]));
	}

	@Override
	public void last(String descriptor) {
		handleResultSet(FetchPositioning.LAST, 0, descriptor);
	}

	@Override
	public void relative(QNumeric position, String descriptor) {
		handleResultSet(FetchPositioning.RELATIVE, position.asInteger(),  descriptor);
	}

	protected ResultSet getResultSet() {
		return resultSet;
	}

	protected void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}

	private void completeRecord(QBufferedData[] target, int column) {

		if (target == null)
			return;

		int c = column;
		for (QBufferedData bufferedData : target) {
			if(bufferedData instanceof QRecord) {
				QRecord record = (QRecord)bufferedData;
				QBufferedData[] bufferedRecord = record.getElements().toArray(new QBufferedData[record.getElements().size()]);
				completeRecord(bufferedRecord, c);
				c = c + bufferedRecord.length - 1;

				if(record.getElement(QDatabaseManager.TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME) != null) 
					c++;
			}
			else {
				try {
					dataWriter.set(resultSet.getObject(c));
					bufferedData.accept(dataWriter);
				} catch (SQLException e) {
					throw new DatabaseCoreRuntimeException(e);
				}
			}	
			c++;
		}
	}

	protected boolean handleResultSet(FetchPositioning positioning, int rowNumber, String descriptor) {
		
		QDescriptorArea descriptorArea = getEsqlContext().getDescriptorArea(descriptor);
		if (descriptorArea == null)
			throw new DatabaseCoreRuntimeException("Descriptor not found: " + descriptor);

		int columnsCount = descriptorArea.getColumnsNumber();
		QBufferedData[] target = new QBufferedData[columnsCount];
		for(int c = 1; c <= columnsCount; c++) {
			DescriptorVariableImpl descriptorVariable = (DescriptorVariableImpl)descriptorArea.getVariable(c);
			target[c-1] = descriptorVariable.getBufferedData();
		}
		
		return handleResultSet(positioning, rowNumber, target);
	
	}
	
	protected boolean handleResultSet(FetchPositioning positioning, int rowNumber, QBufferedData[] record) {

		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.clear();

		if (this.resultSet == null) {
			handleSQLException(new SQLException("Invalid resultSet", "X", -924));
			return false;
		} else {

			try {
				boolean found = false;

				switch (positioning) {
				case FIRST:
					found = this.resultSet.first();
					break;
				case LAST:
					found = this.resultSet.last();
					break;
				case NEXT:
					found = this.resultSet.next();
					break;
				case PRIOR:
					found = this.resultSet.previous();
					break;
				case RELATIVE:
					found = this.resultSet.relative(rowNumber);
					break;
				case AFTER:
					found = true;
					this.resultSet.afterLast();
					break;
				case BEFORE:
					found = true;
					this.resultSet.beforeFirst();
					break;
				case CURRENT:
					found = true;
					break;
				}

				if (found) {
					completeRecord(record, 1);
					return true;
				} else {
					getEsqlContext().getCommunicationArea().setSqlCode(100);
					return false;
				}
			} catch (SQLException e) {
				handleSQLException(e);
				return false;
			}
		}
	}

	protected void handleSQLException(SQLException e) {
		QCommunicationArea communicationArea = getEsqlContext().getCommunicationArea();
		communicationArea.setSqlCode(e.getErrorCode());
		if(communicationArea.getSqlCode() == 0)
			communicationArea.setSqlCode(-924);
	}
}