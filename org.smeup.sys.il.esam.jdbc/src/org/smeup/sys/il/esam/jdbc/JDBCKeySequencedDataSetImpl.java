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
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.esam.AccessMode;
import org.smeup.sys.il.esam.OperationDirection;
import org.smeup.sys.il.esam.OperationRead;
import org.smeup.sys.il.esam.OperationSet;
import org.smeup.sys.il.esam.QIndex;
import org.smeup.sys.il.esam.QKSDataSet;

public class JDBCKeySequencedDataSetImpl<R extends QRecord> extends JDBCDataSetImpl<R> implements QKSDataSet<R> {

	protected JDBCKeySequencedDataSetImpl(QConnection databaseConnection, QString tableName, QIndex index, R record, AccessMode accessMode, boolean userOpen, JDBCInfoStruct infoStruct,
			QDataContext dataContext) {
		super(databaseConnection, tableName, index, record, accessMode, userOpen, infoStruct, dataContext);
	}

	@Override
	public boolean chain(Object keyField) {
		return chain(keyField, null, null, null);
	}

	@Override
	public boolean chain(Object keyField, QIndicator notFound) {
		return chain(keyField, notFound, null, null);
	}

	@Override
	public boolean chain(Object keyField, QIndicator notFound, Boolean lock) {
		return chain(keyField, notFound, null, lock);
	}

	@Override
	public boolean chain(Object keyField, QIndicator notFound, QIndicator error, Boolean lock) {

		Object[] keyList = { keyField };
		return chain(keyList, notFound, error, lock);
	}

	@Override
	public boolean chain(Object[] keyList) {
		return chain(keyList, null, null, null);
	}

	@Override
	public boolean chain(Object[] keyList, Boolean lock) {
		return chain(keyList, null, null, lock);
	}

	@Override
	public boolean chain(Object[] keyList, QIndicator notFound) {
		return chain(keyList, notFound, null, null);
	}

	@Override
	public boolean chain(Object[] keyList, QIndicator notFound, Boolean lock) {
		return chain(keyList, notFound, null, lock);
	}

	@Override
	public boolean chain(Object[] keyList, QIndicator notFound, QIndicator error) {
		return chain(keyList, notFound, error, null);
	}

	@Override
	public boolean chain(Object[] keyList, QIndicator notFound, QIndicator error, Boolean lock) {

		try {
			prepareAccess(OperationSet.CHAIN, keyList, OperationRead.CHAIN, keyList, false);

			readNext();
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
	public boolean chain(QData keyField) {
		return chain(keyField, null, null, null);
	}

	@Override
	public boolean chain(QData keyField, Boolean lock) {
		return chain(keyField, null, null, lock);
	}

	@Override
	public boolean chain(QData keyField, QIndicator notFound) {
		return chain(keyField, notFound, null, null);
	}

	@Override
	public boolean chain(QData keyField, QIndicator notFound, Boolean lock) {
		return chain(keyField, notFound, null, lock);
	}

	@Override
	public boolean chain(QData keyField, QIndicator notFound, QIndicator error) {
		return chain(keyField, notFound, error, null);
	}

	@Override
	public boolean chain(QData keyField, QIndicator notFound, QIndicator error, Boolean lock) {

		Object[] keyList = { keyField };
		return chain(keyList, notFound, error, lock);
	}

	@Override
	public void delete(Object[] keyList, QIndicator notFound) {
		deleteRecord(keyList, notFound, null);
	}

	@Override
	public void delete(Object[] keyList, QIndicator notFound, QIndicator error) {
		deleteRecord(keyList, notFound, error);
	}

	@Override
	public boolean reade(Object[] keyList, Boolean lock) {
		return reade(keyList, null, null, null);
	}

	@Override
	public boolean reade(Object keyField) {
		return reade(keyField, null, null, null);
	}

	@Override
	public boolean reade(Object keyField, QIndicator endOfData) {
		return reade(keyField, endOfData, null, null);
	}

	@Override
	public boolean reade(Object keyField, Boolean lock) {
		return reade(keyField, null, null, lock);
	}

	@Override
	public boolean reade(Object keyField, QIndicator endOfData, Boolean lock) {
		return reade(keyField, endOfData, null, lock);
	}

	@Override
	public boolean reade(Object keyField, QIndicator endOfData, QIndicator error, Boolean lock) {

		Object[] keyList = { keyField };
		return reade(keyList, endOfData, error, lock);
	}

	@Override
	public boolean reade(Object[] keyList) {
		return reade(keyList, null, null, null);
	}

	@Override
	public boolean reade(Object[] keyList, QIndicator endOfData) {
		return reade(keyList, endOfData, null, null);
	}

	@Override
	public boolean reade(Object[] keyList, QIndicator endOfData, Boolean lock) {
		return reade(keyList, endOfData, null, lock);
	}

	@Override
	public boolean reade(Object[] keyList, QIndicator endOfData, QIndicator error, Boolean lock) {

		try {
			if (rebuildNeeded(OperationDirection.FORWARD)) {

				Object[] keySet = null;

				if (isBeforeFirst())
					keySet = this.currentKeySet;
				else
					keySet = buildKeySet();

				prepareAccess(this.currentOpSet, keySet, OperationRead.READ_EQUAL, keyList, false);
			}

			readNext();
		} catch (SQLException e) {
			handleSQLException(e);
		}

		if (endOfData != null)
			endOfData.eval(isEndOfData());

		if (error != null)
			error.eval(onError());

		return isFound();
	}

	@Override
	public boolean reade(QData keyField) {
		return reade(keyField, null, null, null);
	}

	@Override
	public boolean reade(QData keyField, QIndicator endOfData) {
		return reade(keyField, endOfData, null, null);
	}

	@Override
	public boolean reade(QData keyField, Boolean lock) {
		return reade(keyField, null, null, lock);
	}

	@Override
	public boolean reade(QData keyField, QIndicator endOfData, Boolean lock) {
		return reade(keyField, endOfData, null, lock);
	}

	@Override
	public boolean reade(QData keyField, QIndicator endOfData, QIndicator error, Boolean lock) {

		Object[] keyList = { keyField };
		return reade(keyList, endOfData, error, lock);
	}

	@Override
	public boolean readpe(Object keyField) {
		return readpe(keyField, null, null, null);
	}

	@Override
	public boolean readpe(Object keyField, Boolean lock) {
		return readpe(keyField, null, null, lock);
	}

	@Override
	public boolean readpe(Object keyField, QIndicator beginningOfData) {
		return readpe(keyField, beginningOfData, null, null);
	}

	@Override
	public boolean readpe(Object keyField, QIndicator beginningOfData, Boolean lock) {
		return readpe(keyField, beginningOfData, null, lock);
	}

	@Override
	public boolean readpe(Object keyField, QIndicator beginningOfData, QIndicator error, Boolean lock) {

		Object[] keyList = { keyField };
		return readpe(keyList, beginningOfData, error, lock);
	}

	@Override
	public boolean readpe(Object[] keyList) {
		return readpe(keyList, null, null, null);
	}

	@Override
	public boolean readpe(Object[] keyList, Boolean lock) {
		return readpe(keyList, null, null, lock);
	}

	@Override
	public boolean readpe(Object[] keyList, QIndicator beginningOfData) {
		return readpe(keyList, beginningOfData, null, null);
	}

	@Override
	public boolean readpe(Object[] keyList, QIndicator beginningOfData, Boolean lock) {
		return readpe(keyList, beginningOfData, null, lock);
	}

	@Override
	public boolean readpe(Object[] keyList, QIndicator beginningOfData, QIndicator error, Boolean lock) {

		try {
			if (rebuildNeeded(OperationDirection.BACKWARD)) {

				Object[] keySet = null;

				if (isBeforeFirst())
					keySet = this.currentKeySet;
				else
					keySet = buildKeySet();

				prepareAccess(this.currentOpSet, keySet, OperationRead.READ_PRIOR_EQUAL, keyList, false);
			}
			readNext();
		} catch (SQLException e) {
			handleSQLException(e);
		}

		if (beginningOfData != null)
			beginningOfData.eval(isEndOfData());

		if (error != null)
			error.eval(onError());

		return isFound();
	}

	@Override
	public boolean readpe(QData keyField) {
		return readpe(keyField, null, null, null);
	}

	@Override
	public boolean readpe(QData keyField, Boolean lock) {
		return readpe(keyField, null, null, lock);
	}

	@Override
	public boolean readpe(QData keyField, QIndicator beginningOfData) {
		return readpe(keyField, beginningOfData, null, null);
	}

	@Override
	public boolean readpe(QData keyField, QIndicator beginningOfData, Boolean lock) {
		return readpe(keyField, beginningOfData, null, lock);
	}

	@Override
	public boolean readpe(QData keyField, QIndicator beginningOfData, QIndicator error, Boolean lock) {

		Object[] keyList = { keyField };
		return readpe(keyList, beginningOfData, error, lock);
	}

	@Override
	public void setgt(Object keyField) {
		setgt(keyField, null, null);
	}

	@Override
	public void setgt(Object keyField, QIndicator found) {
		setgt(keyField, found, null);
	}

	@Override
	public void setgt(Object keyField, QIndicator found, QIndicator error) {

		Object[] keyList = { keyField };
		setgt(keyList, found, error);
	}

	@Override
	public void setgt(Object[] keyList) {
		setgt(keyList, null, null);
	}

	@Override
	public void setgt(Object[] keyList, QIndicator found) {
		setgt(keyList, found, null);
	}

	@Override
	public void setgt(Object[] keyList, QIndicator found, QIndicator error) {

		setKeySet(OperationSet.SET_GREATER_THAN, keyList);
		
		if (found != null || error  != null)
		try {
			if (rebuildNeeded(OperationDirection.FORWARD)) {

				Object[] keySet = null;

				if (isBeforeFirst())
					keySet = this.currentKeySet;
				else
					keySet = buildKeySet();

				prepareAccess(this.currentOpSet, keySet, OperationRead.READ, keyList, false);
			}
			readForSetll();
		} catch (SQLException e) {
			handleSQLException(e);
		}
		

		if (found != null)
			found.eval(isFound());

		if (error != null)
			error.eval(onError());
	}

	@Override
	public void setgt(QData keyField) {
		setgt(keyField, null, null);
	}

	@Override
	public void setgt(QData keyField, QIndicator found) {
		setgt(keyField, found, null);
	}

	@Override
	public void setgt(QData keyField, QIndicator found, QIndicator error) {

		Object[] keyList = { keyField };
		setgt(keyList, found, error);
	}

	@Override
	public void setll(Object keyField) {
		setll(keyField, null, null, null);
	}

	@Override
	public void setll(Object keyField, QIndicator found) {
		setll(keyField, found, null, null);
	}

	@Override
	public void setll(Object keyField, QIndicator found, QIndicator equal) {
		setll(keyField, found, equal, null);
	}

	@Override
	public void setll(Object keyField, QIndicator found, QIndicator equal, QIndicator error) {

		Object[] keyList = { keyField };
		setll(keyList, found, equal, error);
	}

	@Override
	public void setll(Object[] keyList) {
		setll(keyList, null, null, null);
	}

	@Override
	public void setll(Object[] keyList, QIndicator found) {
		setll(keyList, found, null, null);
	}

	@Override
	public void setll(Object[] keyList, QIndicator found, QIndicator equal) {
		setll(keyList, found, equal, null);
	}

	@Override
	public void setll(Object[] keyList, QIndicator found, QIndicator equal, QIndicator error) {

		setKeySet(OperationSet.SET_LOWER_LIMIT, keyList);
		if (found != null || equal != null)
			try {
				if (rebuildNeeded(OperationDirection.FORWARD)) {

					Object[] keySet = null;

					if (isBeforeFirst())
						keySet = this.currentKeySet;
					else
						keySet = buildKeySet();

					prepareAccess(this.currentOpSet, keySet, OperationRead.READ_EQUAL, keyList, false);
				}
				readForSetll();
			} catch (SQLException e) {
				handleSQLException(e);
			}

		if (found != null)
			found.eval(isFound());

		if (equal != null)
			equal.eval(isEqual());

		if (error != null)
			error.eval(onError());
	}

	@Override
	public void setll(QData keyField) {
		setll(keyField, null, null, null);
	}

	@Override
	public void setll(QData keyField, QIndicator found) {
		setll(keyField, found, null, null);
	}

	@Override
	public void setll(QData keyField, QIndicator found, QIndicator equal) {
		setll(keyField, found, equal, null);
	}

	@Override
	public void setll(QData keyField, QIndicator found, QIndicator equal, QIndicator error) {

		Object[] keyList = { keyField };
		setll(keyList, found, equal, error);
	}

	@Override
	public void delete(QData keyField, QIndicator notFound) {

		Object[] keyList = { keyField };
		delete(keyList, notFound);
	}

	@Override
	public void delete(QData keyField, QIndicator notFound, QIndicator error) {

		Object[] keyList = { keyField };
		delete(keyList, notFound, error);
	}
}