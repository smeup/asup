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

import java.util.Arrays;
import java.util.List;

import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Column;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.esam.OperationDirection;
import org.smeup.sys.il.esam.OperationRead;
import org.smeup.sys.il.esam.OperationSet;
import org.smeup.sys.il.esam.QIndex;
import org.smeup.sys.il.esam.QIndexColumn;

public class JDBCAccessHelper {

	private SQLObjectNameHelper sqlObjectNameHelper = new SQLObjectNameHelper();

	protected SQLObjectNameHelper getSQLObjectNameHelper() {
		return this.sqlObjectNameHelper;
	}

	public String buildDelete(Table table, QRecord record, int recordNumber) {

		StringBuffer sbUpdate = new StringBuffer();

		sbUpdate.append("DELETE");
		sbUpdate.append(" " + getSQLObjectNameHelper().getQualifiedNameInSQLFormat(table));
		sbUpdate.append(" WHERE QASRRN=" + recordNumber);

		return sbUpdate.toString();
	}
	
	public String buildSelect(Table table, QIndex index, OperationSet opSet, Object[] keySet, OperationRead opRead, Object[] keyRead) {

		StringBuffer querySelect = new StringBuffer();

		querySelect.append("SELECT " + getSQLObjectNameHelper().getQualifiedNameInSQLFormat(table) + ".*, digits(QASRRN)");

		querySelect.append(" FROM " + getSQLObjectNameHelper().getQualifiedNameInSQLFormat(table));

		if (keySet != null || keyRead != null)
			querySelect.append(" WHERE " + buildWhere(opSet, keySet, opRead, keyRead, index));

		OperationDirection opDir = (opRead == OperationRead.READ_PRIOR || opRead == OperationRead.READ_PRIOR_EQUAL) ? OperationDirection.BACKWARD : OperationDirection.FORWARD;
		String orderBy = buildOrderBy(opDir, index);
		if (orderBy != null && !orderBy.isEmpty())
			querySelect.append(" ORDER BY " + buildOrderBy(opDir, index));

		return querySelect.toString();
	}

	public String buildWhere(OperationSet opSet, Object[] keySet, OperationRead opRead, Object[] keyRead, QIndex index) {

		StringBuffer sbWhere = new StringBuffer();

		if (keySet == null || keySet.length <= 0)
			return sbWhere.toString();

		if (opSet.equals(OperationSet.SET_LOWER_LIMIT) || opSet.equals(OperationSet.SET_GREATER_THAN) || (opSet.equals(OperationSet.CHAIN) && !opRead.equals(OperationRead.CHAIN)))
			buildWhereSet(opSet, keySet, opRead, keyRead, sbWhere, index);

		if (opRead.equals(OperationRead.CHAIN))
			buildWhereChain(opSet, keySet, opRead, keyRead, sbWhere, index);

		if (opRead.equals(OperationRead.READ) || opRead.equals(OperationRead.READ_EQUAL) || opRead.equals(OperationRead.READ_PRIOR) || opRead.equals(OperationRead.READ_PRIOR_EQUAL))
			buildWhereRead(opSet, keySet, opRead, keyRead, sbWhere, index);

		return sbWhere.toString();
	}

	public String buildOrderBy(OperationDirection dir, QIndex index) {

		StringBuffer sbOrderBy = new StringBuffer();

		for (QIndexColumn indexColumn : index.getColumns()) {
			if (sbOrderBy.length() != 0)
				sbOrderBy.append(", ");

			String indexColumnName = indexColumn.getName().replaceAll("ç", "§").toUpperCase();

			sbOrderBy.append(getSQLObjectNameHelper().getIdentifierQuoteString() + indexColumnName + getSQLObjectNameHelper().getIdentifierQuoteString());
			if (dir == OperationDirection.BACKWARD) {
				if (indexColumn.getDirection() != OperationDirection.BACKWARD)
					sbOrderBy.append(" DESC");
			} else if (indexColumn.getDirection() == OperationDirection.BACKWARD)
				sbOrderBy.append(" DESC");
		}
		return sbOrderBy.toString();
	}

	@SuppressWarnings("unchecked")
	public String buildUpdate(Table table, QRecord record, int recordNumber) {

		StringBuffer sbUpdate = new StringBuffer();

		sbUpdate.append("UPDATE");
		sbUpdate.append(" " + getSQLObjectNameHelper().getQualifiedNameInSQLFormat(table));
		sbUpdate.append(" SET ");

		boolean first = true;
		for (Column column : (List<Column>) table.getColumns()) {

			String columnName = column.getName().replaceAll("ç", "§").toUpperCase();
			if (columnName.equalsIgnoreCase("QASRRN"))
				continue;

			if (!first)
				sbUpdate.append(", ");

			sbUpdate.append("\"" + columnName + "\"" + "=");

			// TODO remove me
			QBufferedData element = record.getElement(columnName.toLowerCase());
			if (element instanceof QString)
				sbUpdate.append("'" + element.toString() + "'");
			else if (element instanceof QDecimal) {
				QDecimal decimal = (QDecimal) element;
				if (decimal.getScale() > 0)
					sbUpdate.append(decimal.asDouble());
				else
					sbUpdate.append(decimal.asLong());
			} else
				System.err.println("Unexpected condition: dsjhflsdjhfsdfo9s98");

			first = false;
		}

		sbUpdate.append(" WHERE QASRRN=" + recordNumber);

		return sbUpdate.toString();
	}

	@SuppressWarnings("unchecked")
	public String buildWrite(Table table, QRecord record, int recordNumber) {

		StringBuffer sbWrite = new StringBuffer();

		sbWrite.append("INSERT INTO");
		sbWrite.append(" " + getSQLObjectNameHelper().getQualifiedNameInSQLFormat(table));
		sbWrite.append(" (");

		int position = 1;
		for (Column column : (List<Column>) table.getColumns()) {

			String columnName = column.getName().replaceAll("ç", "§").toUpperCase();
			if (columnName.equalsIgnoreCase("QASRRN"))
				continue;

			if (position > 1)
				sbWrite.append(", ");

			sbWrite.append("\"" + columnName + "\"");

			position++;
		}
		sbWrite.append(")");

		sbWrite.append(" VALUES (");

		position = 1;
		for (QBufferedData element : record.getElements()) {

			if (position > 1)
				sbWrite.append(" , ");

			if (element instanceof QString)
				sbWrite.append("'" + element.toString().replaceAll("\'", "\''") + "'");
			else if (element instanceof QDecimal) {
				QDecimal decimal = (QDecimal) element;
				if (decimal.getScale() > 0)
					sbWrite.append(decimal.asDouble());
				else
					sbWrite.append(decimal.asLong());
			} else
				System.err.println("Unexpected condition: dsjhf345034jsdfhiosd");

			position++;
		}

		sbWrite.append(")");

		return sbWrite.toString();
	}

	private void buildWhereSet(OperationSet opSet, Object[] keySet, OperationRead opRead, Object[] keyRead, StringBuffer sbWhere, QIndex index) {

		StringBuffer sbFields = new StringBuffer();
		StringBuffer sbValues = new StringBuffer();

		if (keySet.length > 1)
			sbFields.append("(");

		for (int i = 0; i < keySet.length; i++) {

			QIndexColumn indexColumn = index.getColumns().get(i);
			String indexColumnName = indexColumn.getName().replaceAll("ç", "§").toUpperCase();

			// append field
			if (indexColumn.isNumeric()) {

				sbFields.append("digits(" + getSQLObjectNameHelper().getIdentifierQuoteString() + indexColumnName + getSQLObjectNameHelper().getIdentifierQuoteString() + ")");

				// append value
				byte[] bytes = new byte[indexColumn.getLength() - keySet[i].toString().length()];
				Arrays.fill(bytes, (byte) 48);
				sbValues.append(new String(bytes) + keySet[i].toString());
			} else {

				sbFields.append(getSQLObjectNameHelper().getIdentifierQuoteString() + indexColumnName + getSQLObjectNameHelper().getIdentifierQuoteString());

				// append value
				byte[] bytes = new byte[indexColumn.getLength() - keySet[i].toString().length()];
				Arrays.fill(bytes, (byte) 32);
				sbValues.append(keySet[i].toString() + new String(bytes));
			}

			if (i + 1 < keySet.length)
				sbFields.append(" concat ");
		}
		if (keySet.length > 1)
			sbFields.append(")");

		if (sbWhere.length() > 0)
			sbWhere.append(" and ");

		// pointer lower
		if (opSet.equals(OperationSet.SET_LOWER_LIMIT) || opSet.equals(OperationSet.CHAIN))
			// reader backward
			if (opRead.equals(OperationRead.READ_PRIOR) || opRead.equals(OperationRead.READ_PRIOR_EQUAL))
				sbWhere.append(sbFields).append("<'").append(sbValues).append("'");

			// reader forward
			else
				sbWhere.append(sbFields).append(">='").append(sbValues).append("'");

		// pointer greater
		if (opSet.equals(OperationSet.SET_GREATER_THAN))
			// reader backward
			if (opRead.equals(OperationRead.READ_PRIOR) || opRead.equals(OperationRead.READ_PRIOR_EQUAL))
				sbWhere.append(sbFields).append("<='").append(sbValues).append("'");

			// reader forward
			else
				sbWhere.append(sbFields).append(">'").append(sbValues).append("'");
	}

	private void buildWhereChain(OperationSet opSet, Object[] keySet, OperationRead opRead, Object[] keyRead, StringBuffer sbWhere, QIndex index) {
		buildWhereRead(opSet, keySet, opRead, keyRead, sbWhere, index);
	}

	private void buildWhereRead(OperationSet opSet, Object[] keySet, OperationRead opRead, Object[] keyRead, StringBuffer sbWhere, QIndex index) {

		if (keyRead == null)
			return;

		List<QIndexColumn> indexColumns = index.getColumns();

		for (int i = 0; i < keyRead.length; i++) {

			QIndexColumn indexColumn = indexColumns.get(i);
			String indexColumnName = indexColumn.getName().replaceAll("ç", "§").toUpperCase();

			String value = null;
			// append value
			if (keyRead[i] instanceof QString)
				value = ((QString) keyRead[i]).toString();
			else
				value = keyRead[i].toString();

			if (sbWhere.length() > 0)
				sbWhere.append(" and ");

			// append field
			if (indexColumn.isNumeric())
				sbWhere.append(getSQLObjectNameHelper().getIdentifierQuoteString() + indexColumnName + getSQLObjectNameHelper().getIdentifierQuoteString()).append("=").append(value);
			else
				sbWhere.append(getSQLObjectNameHelper().getIdentifierQuoteString() + indexColumnName + getSQLObjectNameHelper().getIdentifierQuoteString()).append("=").append("'" + value + "'");
		}
	}
}