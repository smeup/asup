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
package org.smeup.sys.il.esam.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.core.DatabaseCoreRuntimeException;
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QDatabaseManager;
import org.smeup.sys.db.core.QStatement;
import org.smeup.sys.db.core.QTableProvider;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.esam.AccessMode;
import org.smeup.sys.il.esam.OperationDirection;
import org.smeup.sys.il.esam.OperationRead;
import org.smeup.sys.il.esam.OperationSet;
import org.smeup.sys.il.esam.QDataSet;
import org.smeup.sys.il.esam.QIndex;
import org.smeup.sys.il.esam.QIndexColumn;

public abstract class JDBCDataSetImpl<R extends QRecord> implements QDataSet<R> {

	private QConnection databaseConnection;

	private JDBCAccessHelper jdbcAccessHelper;
	private QIndex index;
	private R record;
	private QString tablePath;
	private AccessMode accessMode;
	private QTableProvider tableProvider;
	private JDBCDataReaderImpl dataReader;

	private JDBCDataWriterImpl dataWriter;
	private boolean open;
	private boolean found;
	private boolean error;
	private boolean equal;

	private boolean endOfData;
	private Table currentTable;
	protected OperationSet currentOpSet;
	protected Object[] currentKeySet;

	private OperationRead currentOpRead;
	private QStatement statement;
	private QStatement statementUpdate;

	private ResultSet resultSet;
	private JDBCInfoStruct infoStruct;

	private QDataContext dataContext;

	protected JDBCDataSetImpl(QConnection databaseConnection, QString tablePath, QIndex index, R record, AccessMode accessMode, boolean userOpen, JDBCInfoStruct infoStruct,
			QDataContext dataContext) {

		this.databaseConnection = databaseConnection;

		this.index = index;
		this.record = record;
		this.tablePath = tablePath;

		this.accessMode = accessMode;
		this.tableProvider = databaseConnection.getContext().get(QTableProvider.class);
		if (tableProvider == null)
			tableProvider = new JDBCTableProvider(databaseConnection);
		this.infoStruct = infoStruct;
		this.dataContext = dataContext;

		this.jdbcAccessHelper = new JDBCAccessHelper();
		this.dataReader = new JDBCDataReaderImpl();
		this.dataWriter = new JDBCDataWriterImpl();

		init();

		if (!userOpen)
			open(null);
	}

	@Override
	public QString getFilePath() {
		return tablePath;
	}

	protected Object[] buildKeySet() {

		Object[] keySet = new Object[index.getColumns().size()];
		int i = 0;
		for (QIndexColumn indexColumn : index.getColumns()) {

			// virtual element
			if (indexColumn.getName().equals(QDatabaseManager.TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME))
				keySet[i] = this.infoStruct.rrn.asInteger();
			else
				keySet[i] = record.getElement(indexColumn.getName());

			i++;
		}

		return keySet;
	}

	@Override
	public void clear() {
		this.record.clear();
	}

	@Override
	public void close() {
		close(null);
	}

	@Override
	public void close(QIndicator error) {

		init();

		if (this.statement != null)
			this.statement.close();

		if (this.statementUpdate != null)
			this.statementUpdate.close();
	}

	@Override
	public void delete() {
		deleteRecord(null, null, null);
	}

	@Override
	public void delete(QIndicator error) {
		deleteRecord(null, null, error);
	}

	@Override
	public R get() {
		return this.record;
	}

	@Override
	public QDataStruct getInfoStruct() {
		return this.infoStruct;
	}

	protected void handleSQLException(SQLException e) {

		this.found = false;
		this.dataContext.found().eval(false);
		this.endOfData = true;
		this.dataContext.endOfData().eval(true);

		this.error = true;
		this.equal = false;

		this.infoStruct.rrn.clear();
	}

	private void init() {

		this.found = false;
		this.dataContext.found().eval(false);
		this.endOfData = true;
		this.dataContext.endOfData().eval(true);

		this.open = false;

		this.error = false;
		this.equal = false;

		this.infoStruct.rrn.clear();

		this.currentTable = null;

		this.currentOpSet = null;
		this.currentKeySet = null;

		this.currentOpRead = null;

	}

	protected boolean isBeforeFirst() throws SQLException {

		if (this.currentOpRead == null)
			return true;

		if (this.resultSet == null)
			return true;

		if (this.resultSet.isClosed())
			return true;

		return this.resultSet.isBeforeFirst();
	}

	@Override
	public boolean isEndOfData() {
		return this.endOfData;
	}

	@Override
	public boolean isEqual() {
		return this.equal;
	}

	@Override
	public boolean isFound() {
		return this.found;
	}

	@Override
	public boolean isOpen() {
		return this.open;
	}

	@Override
	public boolean onError() {
		return this.error;
	}

	@Override
	public void open() {
		open(null);
	}

	@Override
	public void open(QIndicator error) {

		init();

		try {
			if (this.accessMode == AccessMode.INPUT){
				statement = databaseConnection.createStatement(true);
				statementUpdate = databaseConnection.createStatement(true);
			} else {
				statement = databaseConnection.createStatement(true, true);
				statementUpdate = databaseConnection.createStatement(true, true);
			}

			String[] tableSplit = this.tablePath.trimR().split("/");
			if(tableSplit.length ==1)
				this.currentTable = this.tableProvider.getTable(null, tableSplit[0].trim());
			else if(tableSplit.length ==2)
				this.currentTable = this.tableProvider.getTable(tableSplit[0], tableSplit[1].trim());

			if(this.currentTable == null)
				throw new DatabaseCoreRuntimeException("Invalid table: "+this.tablePath.trimR());
			
			this.open = true;
		} catch (SQLException e) {
			handleSQLException(e);
		}

		if (error != null)
			error.eval(onError());
	}

	protected void prepareAccess(OperationSet opSet, Object[] keySet, OperationRead opRead, Object[] keyRead) throws SQLException {

		this.currentOpRead = opRead;

		if (this.resultSet != null)
			this.resultSet.close();

		String querySelect = jdbcAccessHelper.buildSelect(this.currentTable, index, opSet, keySet, opRead, keyRead);

//		System.out.println("sql:\t" + querySelect);

		this.resultSet = this.statement.executeQuery(querySelect);
		this.dataReader.set(this.resultSet);
		this.dataWriter.set(this.resultSet);
	}

	@Override
	public boolean read() {
		return read(null, null, null);
	}

	@Override
	public boolean read(Boolean lock) {
		return readp(null, null, lock);
	}

	@Override
	public boolean read(QIndicator endOfData) {
		return read(endOfData, null, null);
	}

	@Override
	public boolean read(QIndicator endOfData, Boolean lock) {
		return read(endOfData, null, lock);
	}

	@Override
	public boolean read(QIndicator endOfData, QIndicator error) {
		return read(endOfData, error, null);
	}

	@Override
	public boolean read(QIndicator endOfData, QIndicator error, Boolean lock) {

		try {
			if (rebuildNeeded(OperationDirection.FORWARD))
				if (this.currentKeySet == null)
					prepareAccess(OperationSet.SET_LOWER_LIMIT, buildKeySet(), OperationRead.READ, null);
				else
					prepareAccess(OperationSet.SET_LOWER_LIMIT, this.currentKeySet, OperationRead.READ, null);

			return readNext();

		} catch (SQLException e) {
			handleSQLException(e);
		}

		if (endOfData != null)
			endOfData.eval(isEndOfData());

		if (error != null)
			error.eval(onError());

		return isFound();
	}

	protected boolean readNext() throws SQLException {

		this.error = false;
		this.equal = false;

		if (!this.resultSet.next()) {

			// TODO verify if not necessary
			this.record.clear();

			this.infoStruct.rrn.clear();

			this.found = false;
			this.dataContext.found().eval(false);
			this.endOfData = true;
			this.dataContext.endOfData().eval(true);

			return false;
		}

		try {
			this.record.accept(this.dataReader);

			int rrn = this.resultSet.getInt(record.getElements().size() + 1);
			this.infoStruct.rrn.eval(rrn);

			this.found = true;
			this.dataContext.found().eval(true);
			this.endOfData = false;
			this.dataContext.endOfData().eval(false);

			return true;
		} catch (SQLException e) {
			handleSQLException(e);
			return false;
		}

	}

	@Override
	public boolean readp() {
		return readp(null, null, null);
	}

	@Override
	public boolean readp(Boolean lock) {
		return readp(null, null, lock);
	}

	@Override
	public boolean readp(QIndicator beginningOfData) {
		return readp(beginningOfData, null, null);
	}

	@Override
	public boolean readp(QIndicator beginningOfData, Boolean lock) {
		return readp(beginningOfData, null, lock);
	}

	@Override
	public boolean readp(QIndicator beginningOfData, QIndicator error) {
		return readp(beginningOfData, error, null);
	}

	@Override
	public boolean readp(QIndicator beginningOfData, QIndicator error, Boolean lock) {

		try {
			if (rebuildNeeded(OperationDirection.BACKWARD))
				if (this.currentKeySet == null)
					prepareAccess(OperationSet.SET_GREATER_THAN, buildKeySet(), OperationRead.READ_PRIOR, null);
				else
					prepareAccess(OperationSet.SET_GREATER_THAN, this.currentKeySet, OperationRead.READ_PRIOR, null);
			return readNext();

		} catch (SQLException e) {
			handleSQLException(e);
		}

		if (beginningOfData != null)
			beginningOfData.eval(isEndOfData());

		if (error != null)
			error.eval(onError());

		return isFound();
	}

	protected boolean rebuildNeeded(OperationDirection opDirection) {

		if (this.currentOpRead == null)
			return true;

		boolean result = false;

		switch (opDirection) {
		case BACKWARD:
			switch (this.currentOpRead) {
			case CHAIN:
			case READ:
			case READ_EQUAL:
				result = true;
			default:
				break;
			}
			break;
		case FORWARD:
			switch (this.currentOpRead) {
			case CHAIN:
			case READ_PRIOR:
			case READ_PRIOR_EQUAL:
				result = true;
			default:
				break;
			}
			break;
		}

		return result;
	}

	protected void setKeySet(OperationSet opSet, Object[] keyList) {
		this.currentOpSet = opSet;
		this.currentKeySet = keyList;
		this.currentOpRead = null;
	}

	protected void deleteRecord(Object[] keyList, QIndicator notFound, QIndicator error) {

		this.error = false;
		this.equal = false;

		try {
			if (keyList != null) {
				setKeySet(OperationSet.SET_LOWER_LIMIT, keyList);
				if (rebuildNeeded(OperationDirection.FORWARD)) {

					Object[] keySet = null;

					if (isBeforeFirst())
						keySet = this.currentKeySet;
					else
						keySet = buildKeySet();

					prepareAccess(this.currentOpSet, keySet, OperationRead.READ_EQUAL, keyList);
				}

				readNext();

				if (!isEndOfData())
					this.statementUpdate.executeUpdate(jdbcAccessHelper.buildDelete(this.currentTable, this.record, this.infoStruct.rrn.asInteger()));
			} else {
				this.statementUpdate.executeUpdate(jdbcAccessHelper.buildDelete(this.currentTable, this.record, this.infoStruct.rrn.asInteger()));
			}

			this.found = true;
			this.dataContext.found().eval(true);
			this.endOfData = isEndOfData();
			this.dataContext.endOfData().eval(isEndOfData());

		} catch (SQLException e) {
			handleSQLException(e);
		}

		if (notFound != null)
			notFound.eval(isEndOfData());

		if (error != null)
			error.eval(onError());
	}

	@Override
	public void unlock() {
		unlock(null);
	}

	@Override
	public void unlock(QIndicator error) {

		// TODO

		if (error != null)
			error.eval(onError());
	}

	@Override
	public void update() {
		update(null);
	}

	@Override
	public void update(QIndicator error) {

		this.error = false;
		this.equal = false;

		try {

			/*
			 * this.resultSet.moveToCurrentRow();
			 * this.record.accept(this.dataWriter); this.resultSet.updateRow();
			 *
			 * this.resultSet.moveToCurrentRow();
			 */
			this.statementUpdate.executeUpdate(jdbcAccessHelper.buildUpdate(this.currentTable, this.record, this.infoStruct.rrn.asInteger()));

			this.found = true;
			this.dataContext.found().eval(true);
			this.endOfData = false;
			this.dataContext.endOfData().eval(false);

		} catch (SQLException e) {
			handleSQLException(e);
		}

		if (error != null)
			error.eval(onError());
	}

	@Override
	public void write() {
		write(null);
	}

	@Override
	public void write(QIndicator error) {

		this.error = false;
		this.equal = false;

		try {

			/*
			 * this.resultSet.moveToInsertRow();
			 * this.record.accept(this.dataWriter); this.resultSet.insertRow();
			 *
			 * this.resultSet.moveToCurrentRow();
			 */

			this.statementUpdate.executeUpdate(jdbcAccessHelper.buildWrite(this.currentTable, this.record, this.infoStruct.rrn.asInteger()));

			this.found = true;
			this.dataContext.found().eval(true);
			this.endOfData = false;
			this.dataContext.endOfData().eval(false);

		} catch (SQLException e) {
			handleSQLException(e);
		}

		if (error != null)
			error.eval(onError());
	}
} // QDataSetImpl