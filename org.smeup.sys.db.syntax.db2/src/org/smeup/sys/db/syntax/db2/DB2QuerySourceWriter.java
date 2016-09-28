/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.db.syntax.db2;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

import org.eclipse.datatools.modelbase.sql.query.QueryExpressionRoot;
import org.eclipse.datatools.modelbase.sql.query.QuerySearchCondition;
import org.eclipse.datatools.modelbase.sql.query.QuerySelectStatement;
import org.eclipse.datatools.modelbase.sql.query.TableInDatabase;
import org.eclipse.datatools.modelbase.sql.query.TableReference;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionFunction;
import org.eclipse.datatools.modelbase.sql.query.helper.StatementHelper;
import org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceWriter;
import org.eclipse.datatools.modelbase.sql.schema.SQLObject;
import org.smeup.sys.db.syntax.dml.QExtendedQuerySelect;

@SuppressWarnings("rawtypes")
public class DB2QuerySourceWriter extends SQLQuerySourceWriter {

	@Override
	protected Method getSpecificAppendSQLMethod(Class sourceWriterClass, SQLObject sqlObject) throws NoSuchMethodException {
		if (sqlObject instanceof QExtendedQuerySelect) {
			return DB2QuerySourceWriter.class.getMethod("appendSpecificSQL", QExtendedQuerySelect.class, StringBuffer.class);
		} else {
			return super.getSpecificAppendSQLMethod(sourceWriterClass, sqlObject);
		}
	}

	public void appendSpecificSQL(QExtendedQuerySelect select, StringBuffer sb) {
		if (select != null) {
			StringBuffer sbSelect = new StringBuffer();

			/*
			 * If this select is not a sub-query, break lines between clauses.
			 */
			StringBuffer sbClauseIndent = new StringBuffer();
			int selectStartOffset = getLastLineLength(sb);
			String spacer4 = "    ";

			/* If this is a sub-select, don't start it after column 30. */
			if (selectStartOffset > 20) {
				selectStartOffset = getLastLineIndent(sb) + 4;
				appendNewLine(sbSelect);
				appendSpace(sbSelect, selectStartOffset);
			}

			appendSpace(sbClauseIndent, selectStartOffset + STANDARD_INDENT);

			// select-clause begin
			appendKeyword(sbSelect, SELECT);
			appendSpace(sbSelect);

			if (select.isDistinct()) {
				appendKeyword(sbSelect, DISTINCT);
				appendSpace(sbSelect);
			}

			List selectClauseList = select.getSelectClause();
			if (selectClauseList != null && selectClauseList.size() > 0) {
				appendSQLForSQLObjectList(selectClauseList, sbSelect);
			} else {
				appendString(sbSelect, ASTERISK);
			}
			// select-clause end

			// from-clause begin
			appendNewLine(sbSelect);
			appendStringBuffer(sbSelect, sbClauseIndent);

			appendKeyword(sbSelect, FROM);
			appendSpace(sbSelect);

			List fromClauseList = select.getFromClause();
			if (fromClauseList != null && fromClauseList.size() > 0) {
				int lastTableStartIndex = sbSelect.length();
				for (Iterator fromIt = select.getFromClause().iterator(); fromIt.hasNext();) {
					TableReference tableRef = (TableReference) fromIt.next();

					appendSQLForTableExpression(tableRef, sbSelect);

					if (fromIt.hasNext()) {
						appendSymbol(sbSelect, COMMA);
						appendSpace(sbSelect);
					}

					if (getLastLineLength(sbSelect) > displayWidth) {
						sbSelect.insert(lastTableStartIndex - 1, spacer4);
						sbSelect.insert(lastTableStartIndex - 1, sbClauseIndent.toString());
						sbSelect.insert(lastTableStartIndex - 1, NEW_LINE);
					}

					lastTableStartIndex = sbSelect.length();
				}
			}
			// from-clause end

			// where-clause begin
			QuerySearchCondition whereClause = select.getWhereClause();
			if (whereClause != null) {
				appendNewLine(sbSelect);
				appendStringBuffer(sbSelect, sbClauseIndent);

				appendKeyword(sbSelect, WHERE);
				appendSpace(sbSelect);
				appendSQL(whereClause, sbSelect);
			}
			// where-clause end

			// group-by-clause begin
			List groupByClauseList = select.getGroupByClause();
			if (groupByClauseList != null && groupByClauseList.size() > 0) {
				appendNewLine(sbSelect);
				appendStringBuffer(sbSelect, sbClauseIndent);

				appendKeyword(sbSelect, GROUP_BY);
				appendSpace(sbSelect);

				appendSQLForSQLObjectList(groupByClauseList, sbSelect);
			}
			// group-by-clause end

			// having-clause begin
			QuerySearchCondition havingClause = select.getHavingClause();
			if (havingClause != null) {
				appendNewLine(sbSelect);
				appendStringBuffer(sbSelect, sbClauseIndent);

				appendKeyword(sbSelect, HAVING);
				appendSpace(sbSelect);

				appendSQL(havingClause, sbSelect);
			}
			// having-clause end

			// ORDER BY clause
			List sortSpecList = select.getSortSpecList();
			if (StatementHelper.isOrderByClauseContainsValidOrderBySpecification(sortSpecList)) {
				appendNewLine(sbSelect);
				appendStringBuffer(sbSelect, sbClauseIndent);
				appendSQLForOrderByClause(sortSpecList, sbSelect);
			}

			// OPTIMIZE n ROWS clause
			int rowOptimizeLimit = select.getOptimizeRecordsNumber();
			if (rowOptimizeLimit > 0) {
				appendNewLine(sbSelect);
				appendStringBuffer(sbSelect, sbClauseIndent);
				appendSQLForOptimizeClause(rowOptimizeLimit, sbSelect);
			}

			// TODO: complete with into expression variable
			List intoClauseList = select.getIntoClause();
			if (intoClauseList != null && intoClauseList.size() > 0) {
				// String msg = "#appendSQL(QuerySelect) not implemented" +
				// " for IntoClause!";
				// throw new UnsupportedOperationException(
				// this.getClass().getName() + msg);
			}

			// if select is nested select (not the top select stmt)
			// and its source is very short we don't break lines
			if (!(select.eContainer() instanceof QueryExpressionRoot && select.eContainer().eContainer() instanceof QuerySelectStatement) && sbSelect.length() < 0) {
				trimWhiteSpace(sbSelect);
			}

			// Manage FETCH FIRST n ROWS ONLY clause --> TOP (n)
			int rowFetchLimit = select.getRowFetchLimit();
			if (rowFetchLimit > 0) {
				appendSQLForFetchFirstClause(rowFetchLimit, sbSelect);
				appendSpace(sbSelect);
			}

			appendStringBuffer(sb, sbSelect);
		}
	}

	/**
	 * Appends the FETCH FIRST n ROWS ONLY clause with the given row fetch limit
	 * to the given string buffer.
	 * 
	 * @param aRowFetchLimit
	 *            the row fetch limit to use
	 * @param sb
	 *            the string buffer to which the clause should be appended
	 */
	protected void appendSQLForOptimizeClause(int aRowOptimizeLimit, StringBuffer sb) {
		if (aRowOptimizeLimit > 0) {
			appendKeyword(sb, "FETCH FIRST ");
			appendInt(sb, aRowOptimizeLimit);
			appendKeyword(sb, " ROWS ONLY");
		}
	}

	protected void appendSQLForTableInDatabase(TableInDatabase tableInDB, StringBuffer sb) {
		// sb.append("P_MULT."+tableInDB.getName());
		super.appendSQLForTableInDatabase(tableInDB, sb);
		// sb.append("P_MULT."+tableInDB.getName());
	}

	protected void appendSpecificSQL(ValueExpressionFunction valExprFunc, StringBuffer sb) {
		String funcName = valExprFunc.getName();

		if (funcName.equalsIgnoreCase("SUBSTRING")) {
			appendFunctionSQL_SUBSTR(valExprFunc, sb);
		} else if (funcName.equalsIgnoreCase("RRN")) {
			appendFunctionSQL_RRN(valExprFunc, sb);
		} else {
			super.appendSpecificSQL(valExprFunc, sb);
		}

	}

	/*
	 * Manage RRN(FIELD_NAME) -->ROWNUM Richiede db2set
	 * DB2_COMPATIBILITY_VECTOR=ORA
	 * 
	 * TODO: choose precision in relation to FIELD_NAME datatype.
	 */
	private void appendFunctionSQL_RRN(ValueExpressionFunction valExprFunc, StringBuffer sb) {
		sb.append("ROWNUM");
	}

	private void appendFunctionSQL_SUBSTR(ValueExpressionFunction valExprFunc, StringBuffer sb) {
		valExprFunc.setName("SUBSTR");
		super.appendSpecificSQL(valExprFunc, sb);
	}
}
