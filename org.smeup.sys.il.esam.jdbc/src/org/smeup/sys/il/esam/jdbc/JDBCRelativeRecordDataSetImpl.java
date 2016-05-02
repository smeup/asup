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

import java.sql.SQLException;

import org.smeup.sys.db.core.QConnection;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.esam.AccessMode;
import org.smeup.sys.il.esam.OperationRead;
import org.smeup.sys.il.esam.OperationSet;
import org.smeup.sys.il.esam.QIndex;
import org.smeup.sys.il.esam.QRRDataSet;

public class JDBCRelativeRecordDataSetImpl<R extends QRecord> extends JDBCDataSetImpl<R> implements QRRDataSet<R> {

	protected JDBCRelativeRecordDataSetImpl(QConnection databaseConnection, JDBCTableProvider tableProvider, QIndex index, 
											R record, String tableName, AccessMode accessMode, boolean userOpen, JDBCInfoStruct infoStruct, QDataContext dataContext) {
		super(databaseConnection, tableProvider, index, record, tableName, accessMode, userOpen, infoStruct, dataContext);
	}

	@Override
	public boolean chain(int relativeRecordNumber) {
		return chain(relativeRecordNumber, null, null, null);
	}

	@Override
	public boolean chain(int relativeRecordNumber, QIndicator notFound) {
		return chain(relativeRecordNumber, notFound, null, null);
	}

	@Override
	public boolean chain(int relativeRecordNumber, QIndicator notFound, Boolean lock) {
		return chain(relativeRecordNumber, notFound, null, lock);
	}

	@Override
	public boolean chain(QNumeric relativeRecordNumber, Boolean lock) {
		return chain(relativeRecordNumber, null, null, lock);
	}

	@Override
	public boolean chain(int relativeRecordNumber, QIndicator notFound, QIndicator error, Boolean lock) {

		try {
			Object[] keyList = new Object[] { relativeRecordNumber };
			prepareAccess(OperationSet.CHAIN, keyList, OperationRead.CHAIN, keyList);

			return readNext();

		} catch (SQLException e) {
			handleSQLException(e);
		}

		if (notFound != null)
			notFound.eval(!isFound());

		if (error != null)
			error.eval(onError());

		return isFound();
	}

	@Override
	public boolean chain(QNumeric relativeRecordNumber) {
		return chain(relativeRecordNumber.asInteger());
	}

	@Override
	public boolean chain(QNumeric relativeRecordNumber, QIndicator notFound) {
		return chain(relativeRecordNumber.asInteger(), notFound);
	}

	@Override
	public boolean chain(QNumeric relativeRecordNumber, QIndicator notFound, Boolean lock) {
		return chain(relativeRecordNumber, notFound, null, lock);
	}

	@Override
	public boolean chain(QNumeric relativeRecordNumber, QIndicator notFound, QIndicator error) {
		return chain(relativeRecordNumber, notFound, error, null);
	}

	@Override
	public boolean chain(QNumeric relativeRecordNumber, QIndicator notFound, QIndicator error, Boolean lock) {
		return chain(relativeRecordNumber.asInteger(), notFound, error, lock);
	}

	@Override
	public <E extends Enum<E>> void setgt(E keyField) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setgt(int relativeRecordNumber) {
		setgt(relativeRecordNumber, null, null);
	}

	@Override
	public void setgt(int relativeRecordNumber, QIndicator notFound) {
		setgt(relativeRecordNumber, notFound, null);
	}

	@Override
	public void setgt(int relativeRecordNumber, QIndicator notFound, QIndicator error) {

		Object[] keyList = { relativeRecordNumber };
		setKeySet(OperationSet.SET_GREATER_THAN, keyList);

		if (notFound != null)
			notFound.eval(!isFound());

		if (error != null)
			error.eval(onError());
	}

	@Override
	public void setgt(QNumeric relativeRecordNumber) {
		setgt(relativeRecordNumber.asInteger());
	}

	@Override
	public void setgt(QNumeric relativeRecordNumber, QIndicator found) {
		setgt(relativeRecordNumber.asInteger(), found);
	}

	@Override
	public void setgt(QNumeric relativeRecordNumber, QIndicator found, QIndicator error) {
		setgt(relativeRecordNumber.asInteger(), found, error);
	}

	@Override
	public <E extends Enum<E>> void setll(E keyField) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setll(int relativeRecordNumber) {
		setll(relativeRecordNumber, null, null, null);
	}

	@Override
	public void setll(int relativeRecordNumber, QIndicator notFound) {
		setll(relativeRecordNumber, notFound, null, null);
	}

	@Override
	public void setll(QNumeric relativeRecordNumber, QIndicator notFound, QIndicator equal) {
		setll(relativeRecordNumber.asInteger(), notFound, equal);
	}

	@Override
	public void setll(int relativeRecordNumber, QIndicator notFound, QIndicator equal) {
		setll(relativeRecordNumber, notFound, equal, null);
	}

	@Override
	public void setll(int relativeRecordNumber, QIndicator notFound, QIndicator equal, QIndicator error) {

		Object[] keyList = { relativeRecordNumber };
		setKeySet(OperationSet.SET_LOWER_LIMIT, keyList);

		if (notFound != null)
			notFound.eval(!isFound());

		if (equal != null)
			equal.eval(isEqual());

		if (error != null)
			error.eval(onError());
	}

	@Override
	public void setll(QNumeric relativeRecordNumber) {
		setll(relativeRecordNumber.asInteger());
	}
} // QTableDataSetImpl
