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
package org.smeup.sys.db.syntax.mssql;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

import org.eclipse.datatools.modelbase.sql.query.QueryExpressionRoot;
import org.eclipse.datatools.modelbase.sql.query.QuerySearchCondition;
import org.eclipse.datatools.modelbase.sql.query.QuerySelectStatement;
import org.eclipse.datatools.modelbase.sql.query.TableInDatabase;
import org.eclipse.datatools.modelbase.sql.query.TableReference;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionColumn;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionCombinedOperator;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionFunction;
import org.eclipse.datatools.modelbase.sql.query.helper.StatementHelper;
import org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceFormat;
import org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceInfo;
import org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceWriter;
import org.eclipse.datatools.modelbase.sql.schema.SQLObject;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.schema.helper.SQLObjectNameHelper;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.smeup.sys.db.syntax.dml.QExtendedQuerySelect;

@SuppressWarnings("rawtypes")
public class MsSQLQuerySourceWriter extends SQLQuerySourceWriter {

	public static final String OPTIMIZE = "OPTIMIZE"; //$NON-NLS-1$

	/**
	 * String constant, value: "+"
	 * 
	 * @see org.eclipse.datatools.modelbase.sql.query.ValueExpressionCombinedOperator#CONCATENATE
	 */
	protected final static String SQL_SERVER_CONCATENATE = "+"; //$NON-NLS-1$

	/**
	 * Force delimiter for identifiers (columns, fields): originally was "
	 */
	@Override
	protected char getDelimitedIdentifierQuote() {
		return super.getDelimitedIdentifierQuote();
	}

	/*
	 * Return converted name without Delimiter (non-Javadoc)
	 * 
	 * @see org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceWriter#
	 * convertCatalogIdentifierToSQLFormat(java.lang.String, char)
	 */
	protected String convertCatalogIdentifierToSQLFormat(String catalogIdentifier, char idDelimiterQuote) {

		return super.convertCatalogIdentifierToSQLFormat(catalogIdentifier, idDelimiterQuote);
/*		String name = StatementHelper.convertCatalogIdentifierToSQLFormat(catalogIdentifier, idDelimiterQuote);
		if (name.startsWith(getDelimitedIdentifierQuote() + "") && name.endsWith(getDelimitedIdentifierQuote() + "")) {
			name = name.substring(1, name.length() - 1);
		}
		return name;*/
	}

	/**
	 * @see org.eclipse.datatools.modelbase.sql.query.QuerySelect#getSQL()
	 */
	protected void appendSpecificSQL(QExtendedQuerySelect select, StringBuffer sb) {
		if (select != null) {
			StringBuffer sbSelect = new StringBuffer();

			/* If this select is not a sub-query, break lines between clauses. */
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

			// Manage FETCH FIRST n ROWS ONLY clause --> TOP (n)
			int rowFetchLimit = select.getRowFetchLimit();
			if (rowFetchLimit > 0) {
				appendSQLForFetchFirstClause(rowFetchLimit, sbSelect);
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
			appendKeyword(sb, "LIMIT(1,");
			appendInt(sb, aRowOptimizeLimit);
			appendKeyword(sb, ")");
		}
	}

	/**
	 * Manage columns for value expressions (for example, COUNT, DIGITS, AVG ecc
	 * ecc
	 */
	protected void appendSpecificSQL(ValueExpressionColumn valExprCol, StringBuffer sb) {
		/*
		 * appendString(sb, "["); super.appendSpecificSQL(valExprCol, sb);
		 * appendString(sb, "]");
		 */
		// TODO verificare con mattia
		// StringBuffer sb_column = new StringBuffer();
		super.appendSpecificSQL(valExprCol, sb);
		// String field = sb_column.toString();
		// System.out.println(field);
		// field = field.replaceAll("\\.", "].[");
		// appendString(sb, "[");
		// appendString(sb, field);
		// appendString(sb, "]");
	}

	/**
	 * Overrides CONCATENATE operator
	 * 
	 * @see org.eclipse.datatools.modelbase.sql.query.ValueExpressionCombinedOperator#getSQL()
	 */
	protected void appendSpecificSQL(ValueExpressionCombinedOperator op, StringBuffer sb) {
		if (op != null) {
			int operator = op.getValue();

			switch (operator) {
				case ValueExpressionCombinedOperator.ADD:
					appendOperator(sb, ADD);
					break;
				case ValueExpressionCombinedOperator.SUBTRACT:
					appendOperator(sb, SUBTRACT);
					break;
				case ValueExpressionCombinedOperator.MULTIPLY:
					appendOperator(sb, MULTIPLY);
					break;
				case ValueExpressionCombinedOperator.DIVIDE:
					appendOperator(sb, DIVIDE);
					break;
				case ValueExpressionCombinedOperator.CONCATENATE:
					appendOperator(sb, SQL_SERVER_CONCATENATE);
					break;
				default:
					break;
			}
		}
	}

	/*
	 * Override NameHelper with specific SQLServerNameHelper
	 * 
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceWriter#
	 * appendSQLForTableInDatabase
	 * (org.eclipse.datatools.modelbase.sql.query.TableInDatabase,
	 * java.lang.StringBuffer)
	 */
	@SuppressWarnings("unused")
	protected void appendSQLForTableInDatabase(TableInDatabase tableInDB, StringBuffer sb) {
		if (tableInDB != null) {
			String tableName = tableInDB.getName();
			Schema schema = null;
			Table dbTable = tableInDB.getDatabaseTable();

			if (dbTable != null) {
				schema = tableInDB.getDatabaseTable().getSchema();
			}

			ISQLObjectNameHelper nameHelper = new SQLObjectNameHelper();

			/*
			 * Determine whether or not we should qualify the table name with a
			 * schema name, based on the presence or absence of a schema object
			 * and the source format setting.
			 */
			boolean qualify = false;
			if (schema != null && schema.getName() != null && schema.getName().length() > 0) {
				qualify = true;

				SQLQuerySourceInfo sourceInfo = tableInDB.getSourceInfo();
				SQLQuerySourceFormat sourceFormat = sourceInfo.getSqlFormat();
				int qualifySpec = sourceFormat.getQualifyIdentifiers();
				if (qualifySpec == SQLQuerySourceFormat.QUALIFY_IDENTIFIERS_NEVER || qualifySpec == SQLQuerySourceFormat.QUALIFY_IDENTIFIERS_WITH_TABLE_NAMES) {
					qualify = false;
				} else if (qualifySpec == SQLQuerySourceFormat.QUALIFY_IDENTIFIERS_WITH_SCHEMA_NAMES) {
					qualify = true;
				} else if (qualifySpec == SQLQuerySourceFormat.QUALIFY_IDENTIFIERS_IN_CONTEXT) {
					qualify = !StatementHelper.omitSchema(tableInDB);
				}
			}

			String sqlFormatName = "";

			/* Build name with nameHelper. Qualify the table name if necessary. */
			if (qualify == true) {
				sqlFormatName = nameHelper.getQualifiedNameInSQLFormat(dbTable);
			} else {
				sqlFormatName = nameHelper.getNameInSQLFormat(dbTable);
			}
			appendIdentifier(sb, sqlFormatName);
		}
	}

	/*
	 * Manage functions (non-Javadoc)
	 * 
	 * @see org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceWriter#
	 * appendSpecificSQL
	 * (org.eclipse.datatools.modelbase.sql.query.ValueExpressionFunction,
	 * java.lang.StringBuffer)
	 */
	protected void appendSpecificSQL(ValueExpressionFunction valExprFunc, StringBuffer sb) {
		String funcName = valExprFunc.getName();

		if (funcName.equalsIgnoreCase("DIGITS")) {
			appendFunctionSQL_DIGITS(valExprFunc, sb);
		} else if (funcName.equalsIgnoreCase("UCASE")) {
			appendFunctionSQL_UCASE(valExprFunc, sb);
		} else if (funcName.equalsIgnoreCase("TRIM")) {
			appendFunctionSQL_TRIM(valExprFunc, sb);
		} else if (funcName.equalsIgnoreCase("RRN")) {
			appendFunctionSQL_RRN(valExprFunc, sb);
		} else {
			super.appendSpecificSQL(valExprFunc, sb);
		}

	}

	/*
	 * Manage FETCH FIRST n ROWS --> SELECT TOP (N) (non-Javadoc)
	 * 
	 * @see org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceWriter#
	 * appendSQLForFetchFirstClause(int, java.lang.StringBuffer)
	 */
	@Override
	protected void appendSQLForFetchFirstClause(int aRowFetchLimit, StringBuffer sb) {
		if (aRowFetchLimit > 0) {
			appendKeyword(sb, "TOP");
			appendSpace(sb);
			appendSymbol(sb, PAREN_LEFT);
			appendInt(sb, aRowFetchLimit);
			appendSymbol(sb, PAREN_RIGHT);
		}
	}

	/******************* Functions conversion ***********************/

	/*
	 * Manage DIGITS(FIELD_NAME) --> STR(FIELD_NAME, 5)
	 * 
	 * TODO: choose precision in relation to FIELD_NAME datatype.
	 */
	private void appendFunctionSQL_DIGITS(ValueExpressionFunction valExprFunc, StringBuffer sb) {

		StringBuffer sbExpr = new StringBuffer();

		appendFunctionName(sbExpr, "STR");

		appendSymbol(sbExpr, PAREN_LEFT);

		/* Aggregate functions have a DISTINCT option. */
		if (valExprFunc.isDistinct()) {
			appendKeyword(sbExpr, DISTINCT);
			appendSpace(sbExpr);
		}

		/* Process the function argument list. */
		List paramList = valExprFunc.getParameterList();
		appendSQLForSQLObjectList(paramList, sbExpr);

		appendSymbol(sbExpr, COMMA);
		appendInt(sbExpr, 5);
		appendSymbol(sbExpr, PAREN_RIGHT);

		appendStringBuffer(sb, sbExpr);
	}

	/*
	 * Manage UCASE(FIELD_NAME) --> UPPER(FIELD_NAME)
	 * 
	 * TODO: choose precision in relation to FIELD_NAME datatype.
	 */
	private void appendFunctionSQL_UCASE(ValueExpressionFunction valExprFunc, StringBuffer sb) {

		StringBuffer sbExpr = new StringBuffer();

		appendFunctionName(sbExpr, "UPPER");

		appendSymbol(sbExpr, PAREN_LEFT);

		/* Process the function argument list. */
		List paramList = valExprFunc.getParameterList();
		appendSQLForSQLObjectList(paramList, sbExpr);
		appendSymbol(sbExpr, PAREN_RIGHT);

		appendStringBuffer(sb, sbExpr);
	}

	/*
	 * Manage TRIM(FIELD_NAME) --> RTRIM(LTRIM(FIELD_NAME))
	 * 
	 * TODO: choose precision in relation to FIELD_NAME datatype.
	 */
	private void appendFunctionSQL_TRIM(ValueExpressionFunction valExprFunc, StringBuffer sb) {

		StringBuffer sbExpr = new StringBuffer();

		appendFunctionName(sbExpr, "RTRIM");
		appendSymbol(sbExpr, PAREN_LEFT);
		appendFunctionName(sbExpr, "LTRIM");
		appendSymbol(sbExpr, PAREN_LEFT);

		/* Process the function argument list. */
		List paramList = valExprFunc.getParameterList();
		appendSQLForSQLObjectList(paramList, sbExpr);

		appendSymbol(sbExpr, PAREN_RIGHT);
		appendSymbol(sbExpr, PAREN_RIGHT);

		appendStringBuffer(sb, sbExpr);
	}

	/*
	 * Manage RRN(FIELD_NAME) --> ROW_NUMBER OVER(FIELD_NAME)
	 * 
	 * TODO: choose precision in relation to FIELD_NAME datatype.
	 */
	private void appendFunctionSQL_RRN(ValueExpressionFunction valExprFunc, StringBuffer sb) {

		StringBuffer sbExpr = new StringBuffer();

		appendFunctionName(sbExpr, "ROW_NUMBER OVER");
		appendSymbol(sbExpr, PAREN_LEFT);

		/* Process the function argument list. */
		List paramList = valExprFunc.getParameterList();
		appendSQLForSQLObjectList(paramList, sbExpr);

		appendSymbol(sbExpr, PAREN_RIGHT);
		appendStringBuffer(sb, sbExpr);
	}

	static String getInterfaceName(Class sqlObjectClass) {
		if (sqlObjectClass == null) {
			return null;
		}

		StringBuffer className = null;
		String interfaceName = null;

		className = new StringBuffer(sqlObjectClass.getName());

		// get the interface type of the given SQLQueryObject
		if (sqlObjectClass.getPackage().getName().endsWith("impl")) { //$NON-NLS-1$
			int implStart = className.lastIndexOf(".impl.") + 1; //$NON-NLS-1$
			int implEnd = implStart + 5;
			className.delete(implStart, implEnd);
		}
		// we are only working with interfaces
		if (sqlObjectClass.getName().endsWith("Impl")) { //$NON-NLS-1$
			className.delete(className.length() - 4, className.length());
		}

		interfaceName = className.toString();

		if (interfaceName.equals("org.asup.db.syntax.ExtendedQuerySelect"))
			interfaceName = "org.asup.db.syntax.QExtendedQuerySelect";

		return interfaceName;
	}

	@Override
	protected Method getSpecificAppendSQLMethod(Class sourceWriterClass, SQLObject sqlObject) throws NoSuchMethodException {
		if (sqlObject == null) {
			return null;
		}

		String interfaceName = null;
		Method appendSQL = null;

		Class sqlObjectClass = sqlObject.getClass();
		Class sqlObjectInterfaceClass = sqlObjectClass;

		if (sqlObjectClass.getName().endsWith("Impl")) {
			// if we have an impl we need to find its interface as all
			// appendSQL methods have the interface as argument
			// Class.forName doesn't help us in the eclipse runtime as
			// the class loader of the SQLQuery model has no access to its
			// extending plugins (no runtime dependency)
			interfaceName = getInterfaceName(sqlObject.getClass());
			Class[] sqlObjectInterfaces = sqlObjectClass.getInterfaces();

			for (int i = 0; i < sqlObjectInterfaces.length; i++) {
				Class interfaceClass = sqlObjectClass.getInterfaces()[i];
				if (interfaceClass.getName().equals(interfaceName)) {
					sqlObjectInterfaceClass = interfaceClass;
					break;
				}
			}
		}
		appendSQL = getSpecificAppendSQLMethod(sourceWriterClass, sqlObjectInterfaceClass);

		return appendSQL;
	}

	@SuppressWarnings("unchecked")
	static Method getSpecificAppendSQLMethod(Class sourceWriterClass, Class queryObjectInterfaceClass) throws NoSuchMethodException {
		if (queryObjectInterfaceClass == null || sourceWriterClass == null) {
			return null;
		}

		Method appendSQL = null;

		try {
			Class stringBufferClass = StringBuffer.class;
			Class[] methodArgTypes = new Class[] { queryObjectInterfaceClass, stringBufferClass };
			appendSQL = sourceWriterClass.getDeclaredMethod("appendSpecificSQL", //$NON-NLS-1$
					methodArgTypes);
		} catch (NoSuchMethodException nsme) {
			// StatementHelper.logError(NEW_LINE + sourceWriterClass.getName()
			// + ": getSQL(" + interfaceName
			// + ") not implemented. Given argument type: "
			// + sqlObject.getClass().getName());
			// nsme.printStackTrace();

			// does this class extend a SourceWriter that has the method?
			// walk up the inheritance hierarchy
			Class superClass = sourceWriterClass.getSuperclass();
			if (superClass != null && SQLQuerySourceWriter.class.isAssignableFrom(superClass)) {
				appendSQL = getSpecificAppendSQLMethod(superClass, queryObjectInterfaceClass);
			} else {
				throw nsme;
			}
		} catch (IllegalArgumentException iae) {
			// TODO: handle exception properly
			iae.printStackTrace();
		}

		return appendSQL;
	}
}
