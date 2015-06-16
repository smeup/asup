/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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
import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.db.core.QDatabaseManager;
import org.smeup.sys.db.core.QStatement;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QRecord;
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
	private AccessMode accessMode;
	private JDBCTableProvider tableProvider;
	private JDBCDataReaderImpl dataReader;
	private JDBCDataWriterImpl dataWriter;

	private boolean open;
	private boolean found;
	private boolean error;
	private boolean equal;
	private boolean endOfData;
	private int rrn;

	private Table currentTable;
	protected OperationSet currentOpSet;
	protected Object[] currentKeySet;
	private OperationRead currentOpRead;

	private QStatement statement;
	private ResultSet resultSet;

	protected JDBCDataSetImpl(QConnection databaseConnection, JDBCTableProvider tableProvider, QIndex index, R record, AccessMode accessMode, boolean userOpen) {

		this.databaseConnection = databaseConnection;

		this.index = index;
		this.record = record;
		this.accessMode = accessMode;
		this.tableProvider = tableProvider;

		this.jdbcAccessHelper = new JDBCAccessHelper();
		this.dataReader = new JDBCDataReaderImpl();
		this.dataWriter = new JDBCDataWriterImpl();

		init();

		if (!userOpen)
			open(null);
	}

	protected Object[] buildKeySet() {

		Object[] keySet = new Object[index.getColumns().size()];
		int i = 0;
		for (QIndexColumn indexColumn : index.getColumns()) {

			// virtual element
			if (indexColumn.getName().equals(QDatabaseManager.TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME))
				keySet[i] = rrn;
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

		try {
			if (this.statement != null)
				this.statement.close();
		} catch (SQLException e) {
			handleSQLException(e);
		}
	}

	@Override
	public void delete() {
		delete(null);
	}

	@Override
	public void delete(QIndicator error) {

		// TODO

		if (error != null)
			error.eval(onError());
	}

	@Override
	public R get() {
		return this.record;
	}

	protected void handleSQLException(SQLException e) {

		this.error = true;
		this.found = false;
		this.equal = false;
		this.endOfData = true;
		this.rrn = 0;
	}

	private void init() {

		this.open = false;

		this.found = false;
		this.error = false;
		this.equal = false;
		this.endOfData = true;
		this.rrn = 0;

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
			if (this.accessMode == AccessMode.INPUT)
				statement = databaseConnection.createStatement(true);
			else
				statement = databaseConnection.createStatement(true, true);

			this.currentTable = this.tableProvider.getTable(null, this.record.getClass().getSimpleName());

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

		System.out.println(querySelect);

		this.resultSet = this.statement.executeQuery(querySelect);
		this.dataReader.set(this.resultSet);
		this.dataWriter.set(this.resultSet);
	}

	@Override
	public boolean read() {
		return read(null, null, null);
	}

	@Override
	public boolean read(QIndicator endOfData) {
		return read(endOfData, null, null);
	}

	@Override
	public boolean read(QIndicator endOfData, Boolean lock) {
		return read(endOfData, lock, null);
	}

	@Override
	public boolean read(QIndicator endOfData, Boolean lock, QIndicator error) {

		try {
			if (rebuildNeeded(OperationDirection.FORWARD))
				if (this.currentKeySet == null)
					prepareAccess(OperationSet.SET_GREATER_THAN, buildKeySet(), OperationRead.READ, null);
				else
					prepareAccess(OperationSet.SET_GREATER_THAN, this.currentKeySet, OperationRead.READ, null);

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
			this.rrn = 0;

			this.found = false;
			this.endOfData = true;

			return false;
		}

		try {
			this.record.accept(this.dataReader);
			this.rrn = this.resultSet.getInt(record.getElements().size() + 1);

			this.found = true;
			this.endOfData = false;

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
	public boolean readp(QIndicator beginningOfData) {
		return readp(beginningOfData, null, null);
	}

	@Override
	public boolean readp(QIndicator beginningOfData, Boolean lock) {
		return readp(beginningOfData, lock, null);
	}

	@Override
	public boolean readp(QIndicator beginningOfData, Boolean lock, QIndicator error) {

		try {
			if (rebuildNeeded(OperationDirection.BACKWARD))
				if (this.currentKeySet == null)
					prepareAccess(OperationSet.SET_LOWER_LIMIT, buildKeySet(), OperationRead.READ_PRIOR, null);
				else
					prepareAccess(OperationSet.SET_LOWER_LIMIT, this.currentKeySet, OperationRead.READ_PRIOR, null);
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
			this.statement.executeUpdate(jdbcAccessHelper.buildUpdate(this.currentTable, this.record, this.rrn));

			this.found = true;
			this.endOfData = false;

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

			this.statement.executeUpdate(jdbcAccessHelper.buildWrite(this.currentTable, this.record, this.rrn));

			this.found = true;
			this.endOfData = false;

		} catch (SQLException e) {
			handleSQLException(e);
		}

		if (error != null)
			error.eval(onError());
	}
} // QDataSetImpl