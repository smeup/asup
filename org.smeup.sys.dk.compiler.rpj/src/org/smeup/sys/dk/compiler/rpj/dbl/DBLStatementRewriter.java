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
 *   Mattia Rocchi - Implementation
 */
package org.smeup.sys.dk.compiler.rpj.dbl;

import java.sql.SQLException;

import org.eclipse.datatools.modelbase.sql.query.QueryExpressionBody;
import org.eclipse.datatools.modelbase.sql.query.QuerySelectStatement;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionVariable;
import org.eclipse.datatools.modelbase.sql.statements.SQLStatement;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.smeup.sys.db.esql.CursorType;
import org.smeup.sys.db.esql.QCursorTerm;
import org.smeup.sys.db.esql.QIntegratedLanguageEmbeddedSQLFactory;
import org.smeup.sys.db.esql.QStatementTerm;
import org.smeup.sys.db.syntax.DatabaseSyntaxHelper;
import org.smeup.sys.db.syntax.QBindingParseResult;
import org.smeup.sys.db.syntax.QBindingParser;
import org.smeup.sys.db.syntax.QBindingStatement;
import org.smeup.sys.db.syntax.QQueryParser;
import org.smeup.sys.db.syntax.dbl.QAllocateDescriptorStatement;
import org.smeup.sys.db.syntax.dbl.QCloseStatement;
import org.smeup.sys.db.syntax.dbl.QDeallocateDescriptorStatement;
import org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement;
import org.smeup.sys.db.syntax.dbl.QDeclareStatementStatement;
import org.smeup.sys.db.syntax.dbl.QDescribeStatement;
import org.smeup.sys.db.syntax.dbl.QExecuteImmediateStatement;
import org.smeup.sys.db.syntax.dbl.QExecuteStatement;
import org.smeup.sys.db.syntax.dbl.QFetchStatement;
import org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement;
import org.smeup.sys.db.syntax.dbl.QGetDiagnosticsStatement;
import org.smeup.sys.db.syntax.dbl.QIntoClause;
import org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause;
import org.smeup.sys.db.syntax.dbl.QOpenStatement;
import org.smeup.sys.db.syntax.dbl.QOption;
import org.smeup.sys.db.syntax.dbl.QPrepareStatement;
import org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement;
import org.smeup.sys.db.syntax.dbl.QSetOptionStatement;
import org.smeup.sys.db.syntax.dbl.QSetTransactionStatement;
import org.smeup.sys.db.syntax.dbl.QSingleRowFetchClause;
import org.smeup.sys.db.syntax.dml.QExtendedQuerySelect;
import org.smeup.sys.dk.compiler.rpj.RPJStatementRewriter;
import org.smeup.sys.il.flow.QCallableUnit;
import org.smeup.sys.il.flow.QFileSection;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowFactory;
import org.smeup.sys.il.flow.QMethodExec;
import org.smeup.sys.il.flow.QSQLExec;
import org.smeup.sys.il.flow.QStatement;

public class DBLStatementRewriter extends RPJStatementRewriter {

	public static final String GET_DESCRIPTOR_METHOD = "getDescriptor";
	public static final String ALLOCATE_DESCRIPTOR_METHOD = "allocateDescriptor";
	public static final String CLOSE_METHOD = "close";
	public static final String OPEN_METHOD = "open";
	public static final String SET_TRANSACTION_METHOD = "setTransaction";
	public static final String DESCRIBE_METHOD = "describe";
	public static final String EXECUTE_IMMEDIATE_METHOD = "%execute";
	public static final String SELECT_METHOD = "%select";
	public static final String SET_OPTION_METHOD = "setOption";

	private QCallableUnit callableUnit;
	private QBindingParser bindingParser;
	private QQueryParser queryParser;

	public static interface STATEMENT_METHOD {
		String PREPARE = "prepare";
		String EXECUTE = "execute";
	}

	public static interface CURSOR_METHOD {
		String NEXT = "next";
		String PRIOR = "prior";
		String FIRST = "first";
		String LAST = "last";
		String BEFORE = "before";
		String AFTER = "after";
		String CURRENT = "current";
		String RELATIVE = "realative";
	}

	/*************** Public static parameters definitions */

	public static final String NONE = "*OMIT";

	public static interface ISOLATION_LEVEL {
		String SERIALIZABLE = "SERIALIZABLE";
		String NO_COMMIT = "NO_COMMIT";
		String READ_UNCOMMITTED = "READ_UNCOMMITTED";
		String READ_COMMITTED = "READ_COMMITTED";
		String REPEATABLE_READ = "REPEATABLE_READ";
	}

	public static interface READ_OPERATION {
		String READ_ONLY = "READ_ONLY";
		String READ_WRITE = "READ_WRITE";
	}

	public static interface USING {
		String NAMES = "NAMES";
		String LABELS = "LABELS";
		String ANY = "ANY";
		String BOTH = "BOTH";
		String ALL = "ALL";
		String SYSTEM_NAMES = "SYSTEM_NAMES";
	}

	public DBLStatementRewriter(QCallableUnit callableUnit, QBindingParser bindingParser, QQueryParser queryParser) {
		super();

		this.callableUnit = callableUnit;
		this.bindingParser = bindingParser;
		this.queryParser = queryParser;
	}

	@Override
	protected RPJStatementRewriter copy() {
		return new DBLStatementRewriter(callableUnit, bindingParser, queryParser);
	}

	@Override
	public boolean visit(QSQLExec statement) {

		String dblString = statement.getStatement();

		if (DatabaseSyntaxHelper.isDBLStatement(dblString)) {

			QStatement rewritedStatement = null;

			try {

				if (isSelectIntoStatement(dblString))
					rewritedStatement = manageSelectIntoStatement(dblString);
				else
					rewritedStatement = manageDBLStametemnt(dblString);

			} catch (SQLException e) {
				// TODO TODO Manage parse error
				e.printStackTrace();
			}

			if (rewritedStatement != null)
				write(rewritedStatement);

		} else {
			System.err.println(statement);
			write((QStatement) EcoreUtil.copy((EObject) statement));
		}

		return false;
	}

	private QStatement manageDBLStametemnt(String dblString) throws SQLException {

		QStatement result = null;

		QBindingParseResult parseBindingResult = bindingParser.parseBinding(dblString);

		if (parseBindingResult != null) {

			QBindingStatement bindingStatement = parseBindingResult.getBindingStatement();

			if (bindingStatement instanceof QSetOptionStatement)
				result = manageSetOptionStatement((QSetOptionStatement) bindingStatement);
			else if (bindingStatement instanceof QSetTransactionStatement)
				result = manageSetTransactionStatement((QSetTransactionStatement) bindingStatement);
			else if (bindingStatement instanceof QExecuteStatement)
				result = manageExecuteStatement((QExecuteStatement) bindingStatement);
			else if (bindingStatement instanceof QExecuteImmediateStatement)
				result = manageExecuteImmediateStatement((QExecuteImmediateStatement) bindingStatement);
			else if (bindingStatement instanceof QOpenStatement)
				result = manageOpenStatement((QOpenStatement) bindingStatement);
			else if (bindingStatement instanceof QPrepareStatement)
				result = managePrepareStatement((QPrepareStatement) bindingStatement);
			else if (bindingStatement instanceof QDeclareStatementStatement)
				result = manageDeclareStatementStatement((QDeclareStatementStatement) bindingStatement);
			else if (bindingStatement instanceof QDeclareCursorStatement)
				result = manageDeclareCursorStatement((QDeclareCursorStatement) bindingStatement);
			else if (bindingStatement instanceof QDescribeStatement)
				result = manageDescribeStatement((QDescribeStatement) bindingStatement);
			else if (bindingStatement instanceof QFetchStatement)
				result = manageFetchStatement((QFetchStatement) bindingStatement);
			else if (bindingStatement instanceof QCloseStatement)
				result = manageCloseStatement((QCloseStatement) bindingStatement);
			else if (bindingStatement instanceof QAllocateDescriptorStatement)
				result = manageAllocateDescriptorStatement((QAllocateDescriptorStatement) bindingStatement);
			else if (bindingStatement instanceof QDeallocateDescriptorStatement)
				result = manageDeallocateDescriptorStatement((QDeallocateDescriptorStatement) bindingStatement);
			else if (bindingStatement instanceof QGetDescriptorStatement)
				result = manageGetDescriptorStatement((QGetDescriptorStatement) bindingStatement);
			else if (bindingStatement instanceof QSetDescriptorStatement)
				result = manageSetDescriptorStatement((QSetDescriptorStatement) bindingStatement);
			else if (bindingStatement instanceof QGetDiagnosticsStatement)
				result = manageGetDiagnosticsStatement((QGetDiagnosticsStatement) bindingStatement);

		} else {
			// TODO: manage parser error
		}

		return result;
	}
	
	private QStatement manageDeclareStatementStatement(QDeclareStatementStatement bindingStatement) {
				
		for (String statement: bindingStatement.getStatements()) {
			
			if (getStatementTerm(statement) != null) {
				// Statement already declared (i.e. by prepareStatement)
				continue;
			}
			
			QStatementTerm statementTerm = QIntegratedLanguageEmbeddedSQLFactory.eINSTANCE.createStatementTerm();
			statementTerm.setName(statement);
			
			QFileSection fileSection = this.callableUnit.getFileSection();
			if (fileSection == null) {
				fileSection = QIntegratedLanguageFlowFactory.eINSTANCE.createFileSection();
				this.callableUnit.setFileSection(fileSection);
			}

			fileSection.getStatements().add(statementTerm);
		}
		
		return null;		
	}

	private QStatement manageDeclareCursorStatement(QDeclareCursorStatement bindingStatement) {

		QCursorTerm cursorTerm = QIntegratedLanguageEmbeddedSQLFactory.eINSTANCE.createCursorTerm();
		cursorTerm.setName(bindingStatement.getCursorName());
		switch (bindingStatement.getCursorType()) {
		case DYNSCROLL:
			cursorTerm.setCursorType(CursorType.DYNAMIC_SCROLL);
			break;
		case NOTSCROLL:
			cursorTerm.setCursorType(CursorType.NOT_SCROLLABLE);
			break;
		case SCROLL:
			cursorTerm.setCursorType(CursorType.SCROLLABLE);
			break;
		default:
			break;
		}
		cursorTerm.setHold(bindingStatement.isHold());
		cursorTerm.setStatementName(bindingStatement.getForStatementName());
		cursorTerm.setSql(bindingStatement.getForQuery());

		QFileSection fileSection = this.callableUnit.getFileSection();
		if (fileSection == null) {
			fileSection = QIntegratedLanguageFlowFactory.eINSTANCE.createFileSection();
			this.callableUnit.setFileSection(fileSection);
		}

		fileSection.getCursors().add(cursorTerm);

		return null;
	}

	private QStatement manageOpenStatement(QOpenStatement bindingStatement) {

		QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
		methodExec.setObject(bindingStatement.getCursor());
		methodExec.setMethod(OPEN_METHOD);

		return methodExec;
	}

	private QStatement manageCloseStatement(QCloseStatement bindingStatement) {

		QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
		methodExec.setObject(bindingStatement.getCursor());
		methodExec.setMethod(CLOSE_METHOD);

		return methodExec;
	}

	private QStatement manageAllocateDescriptorStatement(QAllocateDescriptorStatement bindingStatement) {

		QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
		methodExec.setObject(bindingStatement.getDescriptorName());
		methodExec.setMethod(ALLOCATE_DESCRIPTOR_METHOD);

		// Scope
		methodExec.getParameters().add(bindingStatement.getDescriptorScope().getLiteral());

		// withMax
		methodExec.getParameters().add(bindingStatement.getWithMax());

		return methodExec;
	}

	private QStatement manageGetDescriptorStatement(QGetDescriptorStatement bindingStatement) {

		QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
		methodExec.setObject(bindingStatement.getDescriptorName());
		methodExec.setMethod(GET_DESCRIPTOR_METHOD);

		// Scope
		methodExec.getParameters().add(bindingStatement.getDescriptorScope().getLiteral());

		// Value
		if (bindingStatement.getValue() != null) {
			methodExec.getParameters().add(bindingStatement.getValue());
		} else {
			methodExec.getParameters().add("");
		}

		String varNames = "";
		String varValues = "";

		for (QOption variable : bindingStatement.getVariables()) {
			if (varNames.isEmpty())
				varNames = variable.getName().trim();
			else
				varNames += ": " + variable.getName().trim();

			if (varValues.isEmpty())
				varValues = variable.getValue().trim();
			else
				varValues += ": " + variable.getValue().trim();
		}

		// Var names list
		methodExec.getParameters().add("[" + varNames + "]");

		// Var values list
		methodExec.getParameters().add("[" + varValues + "]");

		return methodExec;
	}

	private QStatement manageSetDescriptorStatement(QSetDescriptorStatement bindingStatement) {

		QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
		methodExec.setObject(bindingStatement.getDescriptorName());
		methodExec.setMethod("setDescriptor");

		// Value
		if (bindingStatement.getValue() != null) {
			methodExec.getParameters().add(bindingStatement.getValue());
		} else {
			methodExec.getParameters().add("");
		}

		String itemNames = "";
		String itemValues = "";

		for (QOption item : bindingStatement.getItems()) {
			if (itemNames.isEmpty())
				itemNames = item.getName().trim();
			else
				itemNames += ": " + item.getName().trim();

			if (itemValues.isEmpty())
				itemValues = item.getValue().trim();
			else
				itemValues += ": " + item.getValue().trim();
		}

		// Item names list
		methodExec.getParameters().add("[" + itemNames + "]");

		// Item values list
		methodExec.getParameters().add("[" + itemValues + "]");

		return methodExec;
	}

	private QStatement manageGetDiagnosticsStatement(QGetDiagnosticsStatement bindingStatement) {

		QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
		methodExec.setObject(null);
		methodExec.setMethod("getDiagnostics");

		// Condition
		if (bindingStatement.getConditionInfo().getCondition() != null) {
			methodExec.getParameters().add(bindingStatement.getConditionInfo().getCondition());
		} else {
			methodExec.getParameters().add("");
		}

		String itemNames = "";
		String itemValues = "";

		for (QOption item : bindingStatement.getConditionInfo().getConditionItems()) {
			if (itemNames.isEmpty())
				itemNames = item.getName().trim();
			else
				itemNames += ": " + item.getName().trim();

			if (itemValues.isEmpty())
				itemValues = item.getValue().trim();
			else
				itemValues += " :" + item.getValue().trim();
		}

		// ConditionItem names list
		methodExec.getParameters().add("[" + itemNames + "]");

		// ConditionItem values list
		methodExec.getParameters().add("[" + itemValues + "]");

		return methodExec;
	}

	private QStatement manageDeallocateDescriptorStatement(QDeallocateDescriptorStatement bindingStatement) {

		QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
		methodExec.setObject(bindingStatement.getDescriptorName());
		methodExec.setMethod("deallocateDescriptor");

		// Scope
		methodExec.getParameters().add(bindingStatement.getDescriptorScope().getLiteral());

		return methodExec;
	}

	private QStatement managePrepareStatement(QPrepareStatement bindingStatement) {

		QStatementTerm statementTerm = getStatementTerm(bindingStatement.getStatementName());
		if (statementTerm == null) {
			statementTerm = QIntegratedLanguageEmbeddedSQLFactory.eINSTANCE.createStatementTerm();
			statementTerm.setName(bindingStatement.getStatementName());

			QFileSection fileSection = this.callableUnit.getFileSection();
			if (fileSection == null) {
				fileSection = QIntegratedLanguageFlowFactory.eINSTANCE.createFileSection();
				this.callableUnit.setFileSection(fileSection);
			}

			fileSection.getStatements().add(statementTerm);
		}

		QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();

		methodExec.setObject(bindingStatement.getStatementName());
		methodExec.setMethod(STATEMENT_METHOD.PREPARE);
		methodExec.getParameters().add(bindingStatement.getFrom());

		// Par 2 and 3
		if (bindingStatement.getInto() != null) {
			// Par 2
			QIntoClause intoClause = bindingStatement.getInto();
			methodExec.getParameters().add(intoClause.getDescriptorName());

			// Par 3
			if (intoClause.getUsing() != null)
				switch (intoClause.getUsing()) {
				case ALL:
					methodExec.getParameters().add(USING.ALL);
					break;
				case ANY:
					methodExec.getParameters().add(USING.ANY);
					break;
				case BOTH:
					methodExec.getParameters().add(USING.BOTH);
					break;
				case LABELS:
					methodExec.getParameters().add(USING.LABELS);
					break;
				case NAMES:
					methodExec.getParameters().add(USING.NAMES);
					break;
				case NONE:
					methodExec.getParameters().add(NONE);
					break;
				case SYSTEM_NAMES:
					methodExec.getParameters().add(USING.SYSTEM_NAMES);
					break;
				default:
					methodExec.getParameters().add(NONE);
					break;
				}

		}

		return methodExec;
	}

	/*
	 * Parms list:
	 * 
	 * 1) Into 2) Rows number 3) Descriptor
	 * 
	 * For CURSOR_METHOD.RELATIVE:
	 * 
	 * 1) Relative position 2) Into 3) Rows number 4) Description
	 * 
	 */
	private QStatement manageFetchStatement(QFetchStatement bindingStatement) {

		QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
		methodExec.setObject(bindingStatement.getCursorName());

		if (bindingStatement.getPosition() != null)
			switch (bindingStatement.getPosition()) {
			case AFTER:
				methodExec.setMethod(CURSOR_METHOD.AFTER);
				break;
			case BEFORE:
				methodExec.setMethod(CURSOR_METHOD.BEFORE);
				break;
			case CURRENT:
				methodExec.setMethod(CURSOR_METHOD.CURRENT);
				break;
			case FIRST:
				methodExec.setMethod(CURSOR_METHOD.FIRST);
				break;
			case LAST:
				methodExec.setMethod(CURSOR_METHOD.LAST);
				break;
			case NEXT:
				methodExec.setMethod(CURSOR_METHOD.NEXT);
				break;
			case PRIOR:
				methodExec.setMethod(CURSOR_METHOD.PRIOR);
				break;
			case RELATIVE:
				methodExec.setMethod(CURSOR_METHOD.RELATIVE);
				if (bindingStatement.getRelativePosition() != null)
					methodExec.getParameters().add(bindingStatement.getRelativePosition());
				break;
			}
		else
			methodExec.setMethod(CURSOR_METHOD.NEXT);

		// Single fetch or Multiple Row Fetch?
		if (bindingStatement.getMultipleRowClause() != null) {

			QMultipleRowFetchClause multipleRowClause = bindingStatement.getMultipleRowClause();

			// Into
			methodExec.getParameters().add(multipleRowClause.getInto());

			// Rows number
			methodExec.getParameters().add(multipleRowClause.getRowsNumber());

			// Descriptor
			if (multipleRowClause.getDescriptor() != null)
				methodExec.getParameters().add(multipleRowClause.getDescriptor());
		} else {

			// Into
			QSingleRowFetchClause singleRowClause = bindingStatement.getSingleRowClause();

			if (singleRowClause != null && singleRowClause.getInto() != null) {
				if (singleRowClause.isUsingDescriptor()) {

					if (singleRowClause.getInto().get(0) != null)
						methodExec.getParameters().add(singleRowClause.getInto().get(0));
				} else {
					// Variables list
					String intoValues = "";
					for (int i = 0; i < singleRowClause.getInto().size(); i++) {
						if (intoValues.isEmpty())
							intoValues = singleRowClause.getInto().get(i).trim();
						else
							intoValues += ": " + singleRowClause.getInto().get(i).trim();
					}
					methodExec.getParameters().add("[" + intoValues + "]");
				}
			}
		}

		return methodExec;
	}

	private QStatement manageExecuteStatement(QExecuteStatement bindingStatement) {

		QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
		methodExec.setObject(bindingStatement.getStatementName());
		methodExec.setMethod(STATEMENT_METHOD.EXECUTE);

		return methodExec;
	}

	private QStatement manageExecuteImmediateStatement(QExecuteImmediateStatement bindingStatement) {

		QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
		methodExec.setObject("*SQL");
		methodExec.setMethod(EXECUTE_IMMEDIATE_METHOD);
		methodExec.getParameters().add(bindingStatement.getVariable());

		return methodExec;
	}

	private QStatement manageDescribeStatement(QDescribeStatement bindingStatement) {
		System.out.println("Manage DESCRIBE");

		QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();

		methodExec.setMethod(DESCRIBE_METHOD);
		methodExec.setObject(null); // TODO: null?

		/*
		 * PREPARE_METHOD parameter list: 1) Statement name 2) Into variable 3)
		 * Using
		 */

		// Par 1
		methodExec.getParameters().add(bindingStatement.getStatementName());

		// Par 2
		QIntoClause intoClause = bindingStatement.getInto();
		methodExec.getParameters().add(intoClause.getDescriptorName());

		// Par 3
		if (intoClause.getUsing() != null)
			switch (intoClause.getUsing()) {
			case ALL:
				methodExec.getParameters().add(USING.ALL);
				break;
			case ANY:
				methodExec.getParameters().add(USING.ANY);
				break;
			case BOTH:
				methodExec.getParameters().add(USING.BOTH);
				break;
			case LABELS:
				methodExec.getParameters().add(USING.LABELS);
				break;
			case NAMES:
				methodExec.getParameters().add(USING.NAMES);
				break;
			case NONE:
				methodExec.getParameters().add(NONE);
				break;
			case SYSTEM_NAMES:
				methodExec.getParameters().add(USING.SYSTEM_NAMES);
				break;
			default:
				methodExec.getParameters().add(NONE);
				break;
			}
		else
			methodExec.getParameters().add(NONE);

		return methodExec;
	}

	private QStatement manageSetOptionStatement(QSetOptionStatement bindingStatement) {

		QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
		methodExec.setMethod(SET_OPTION_METHOD);

		String optionNames = "";
		String optionValues = "";

		for (QOption option : bindingStatement.getOptions()) {
			if (optionNames.isEmpty())
				optionNames = option.getName().trim();
			else
				optionNames += ": " + option.getName().trim();

			if (optionValues.isEmpty())
				optionValues = option.getValue().trim();
			else
				optionValues += ": " + option.getValue().trim();
		}

		// Option names list
		methodExec.getParameters().add("[" + optionNames + "]");

		// Option values list
		methodExec.getParameters().add("[" + optionValues + "]");

		return null;
	}

	private QStatement manageSetTransactionStatement(QSetTransactionStatement bindingStatement) {

		QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();

		methodExec.setMethod(SET_TRANSACTION_METHOD);
		methodExec.setObject(null);

		/*
		 * SET_TRANSACTION parameter list: 1) Isolation level 2) Read operation
		 */

		switch (bindingStatement.getIsolationLevel()) {
		case NONE:
			methodExec.getParameters().add(NONE);
			break;
		case NO_COMMIT:
			methodExec.getParameters().add(ISOLATION_LEVEL.NO_COMMIT);
			break;
		case READ_COMMITTED:
			methodExec.getParameters().add(ISOLATION_LEVEL.READ_COMMITTED);
			break;
		case READ_UNCOMMITTED:
			methodExec.getParameters().add(ISOLATION_LEVEL.READ_UNCOMMITTED);
			break;
		case REPEATABLE_READ:
			methodExec.getParameters().add(ISOLATION_LEVEL.REPEATABLE_READ);
			break;
		case SERIALIZABLE:
			methodExec.getParameters().add(ISOLATION_LEVEL.SERIALIZABLE);
			break;
		}

		if (bindingStatement.getRwOperation() != null)
			switch (bindingStatement.getRwOperation()) {
			case READ_ONLY:
				methodExec.getParameters().add(READ_OPERATION.READ_ONLY);
				break;
			case READ_WRITE:
				methodExec.getParameters().add(READ_OPERATION.READ_WRITE);
				break;
			default:
				methodExec.getParameters().add(NONE);
				break;
			}
		else
			methodExec.getParameters().add(NONE);

		return methodExec;
	}

	private QStatement manageSelectIntoStatement(String dblString) throws SQLException {

		// Extract into values
		SQLQueryParseResult parseQueryResult = queryParser.parseQuery(dblString);

		String[] into = null;

		if (parseQueryResult != null) {

			SQLStatement sqlStatement = parseQueryResult.getSQLStatement();
			if (sqlStatement instanceof QuerySelectStatement) {
				QuerySelectStatement selectStatement = (QuerySelectStatement) sqlStatement;

				QueryExpressionBody query = selectStatement.getQueryExpr().getQuery();
				if (query instanceof QExtendedQuerySelect) {
					QExtendedQuerySelect extendedQuery = (QExtendedQuerySelect) query;

					if (extendedQuery.getIntoClause().size() > 0) {
						into = new String[extendedQuery.getIntoClause().size()];

						for (int i = 0; i < extendedQuery.getIntoClause().size(); i++) {

							ValueExpressionVariable elem = (ValueExpressionVariable) extendedQuery.getIntoClause().get(i);
							into[i] = elem.getName();
						}
					}
				}

			}

		}

		// Create method call
		QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
		methodExec.setObject("*SQL");
		methodExec.setMethod(SELECT_METHOD);

		methodExec.getParameters().add(dblString);

		String intoValue = "";
		for (String value : into) {
			if (intoValue.isEmpty())
				intoValue = value;
			else
				intoValue = ": " + value;
		}
		methodExec.getParameters().add(intoValue);

		return methodExec;
	}

	private QStatementTerm getStatementTerm(String name) {

		if (this.callableUnit.getFileSection() == null)
			return null;

		for (QStatementTerm statementTerm : this.callableUnit.getFileSection().getStatements())
			if (statementTerm.getName().equalsIgnoreCase(name))
				return statementTerm;

		return null;
	}

	private boolean isSelectIntoStatement(String statement) {

		boolean result = false;

		if (statement.matches("^[\\s]*[sS][eE][lL][eE][cC][tT].*[iI][nN][tT][oO][\\s]*.*"))
			result = true;

		return result;
	}
}
