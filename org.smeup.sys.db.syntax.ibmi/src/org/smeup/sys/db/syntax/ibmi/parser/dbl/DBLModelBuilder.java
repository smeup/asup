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
package org.smeup.sys.db.syntax.ibmi.parser.dbl;

import java.sql.SQLException;
import java.util.regex.Pattern;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.smeup.sys.db.syntax.QBindingParseResult;
import org.smeup.sys.db.syntax.QBindingStatement;
import org.smeup.sys.db.syntax.QDatabaseSyntaxFactory;
import org.smeup.sys.db.syntax.QQueryParser;
import org.smeup.sys.db.syntax.dbl.CursorType;
import org.smeup.sys.db.syntax.dbl.DescriptorScope;
import org.smeup.sys.db.syntax.dbl.FetchPosition;
import org.smeup.sys.db.syntax.dbl.IsolationLevel;
import org.smeup.sys.db.syntax.dbl.OpenUsingType;
import org.smeup.sys.db.syntax.dbl.QAllocateDescriptorStatement;
import org.smeup.sys.db.syntax.dbl.QCloseStatement;
import org.smeup.sys.db.syntax.dbl.QConditionInfoClause;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLFactory;
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
import org.smeup.sys.db.syntax.dbl.RWOperation;
import org.smeup.sys.db.syntax.dbl.UsingType;


public class DBLModelBuilder {

	private QQueryParser queryParser;
	
	public DBLModelBuilder(QQueryParser queryParser) {
		this.queryParser = queryParser;
	}
	
	/**
	 * Parse definition string and convert result in db-syntax model
	 * 
	 * @param builtinString
	 * @return
	 * @throws SQLException
	 */
	public QBindingParseResult parseBinding(String builtinString) throws SQLException {
		QBindingParseResult parserResult = QDatabaseSyntaxFactory.eINSTANCE.createBindingParseResult();

		String[] queryStrings = null;

		if (isDeclareStatementWithSelect(builtinString)) {

			String[] parts = splitDeclareViewStatement(builtinString);

			builtinString = parts[0];
			queryStrings = new String[] { parts[1] };
		} else if (isExecuteImmediateStatementWithSelect(builtinString)) {

			String[] parts = splitExecuteImmediateStatement(builtinString);

			builtinString = parts[0];
			queryStrings = new String[] { parts[1] };
		}

		DBLLexer lex = new DBLLexer(new ANTLRStringStream(builtinString));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		DBLParser parser = new DBLParser(tokens);

		CommonTree tree = null;
		try {
			tree = parser.sql().getTree();

			parserResult.setBindingStatement(convertModel(tree.getChild(0), queryStrings));

		} catch (RecognitionException e) {
			e.printStackTrace();
			throw new SQLException(e);
		}

		return parserResult;
	}

	private QBindingStatement convertModel(Tree tree, String[] queryString) {

		QBindingStatement result = null;

		switch (tree.getType()) {
		
		case DBLLexer.SET_OPTION_STATEMENT:
			result = manageSetOptionStatement(tree);
			break;

		case DBLLexer.SET_TRANSACTION_STATEMENT:
			result = manageSetTransactionStatement(tree);
			break;

		case DBLLexer.EXECUTE_STATEMENT:
			result = manageExecuteStatement(tree);
			break;

		case DBLLexer.EXECUTE_IMMEDIATE_STATEMENT:
			result = manageExecuteImmediateStatement(tree, queryString);
			break;
			
		case DBLLexer.DECLARE_STATEMENT_STATEMENT:
			result = manageDeclareStatementStatement(tree);
			break;	

		case DBLLexer.PREPARE_STATEMENT:
			result = managePrepareStatement(tree);
			break;

		case DBLLexer.DECLARE_CURSOR_STATEMENT:
			result = manageDeclareCursorStatement(tree, queryString);
			break;

		case DBLLexer.DESCRIBE_STATEMENT:
			result = manageDescribeStatement(tree);
			break;

		case DBLLexer.FETCH_STATEMENT:
			result = manageFetchStatement(tree);
			break;

		case DBLLexer.OPEN_STATEMENT:
			result = manageOpenStatement(tree);
			break;

		case DBLLexer.CLOSE_STATEMENT:
			result = manageCloseStatement(tree);
			break;
		
		case DBLLexer.ALLOCATE_DESCRIPTOR_STATEMENT:
			result = manageAllocateDescriptorStatement(tree);
			break;	
		
		case DBLLexer.DEALLOCATE_DESCRIPTOR_STATEMENT:
			result = manageDeallocateDescriptorStatement(tree);
			break;		
		
		case DBLLexer.GET_DESCRIPTOR_STATEMENT:
			result = manageGetDescriptorStatement(tree);
			break;			
		
		case DBLLexer.SET_DESCRIPTOR_STATEMENT:
			result = manageSetDescriptorStatement(tree);
			break;				
		
		case DBLLexer.GET_DIAGNOSTICS_STATEMENT:
			result = manageGetDiagnosticsStatement(tree);
			break;					

		default:
			break;
		}

		return result;
	}

	private QBindingStatement manageCloseStatement(Tree tree) {
		QCloseStatement closeStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createCloseStatement();

		/*
		 * Tree cursorToken = tree.getChild(0);
		 * 
		 * if (cursorToken != null && cursorToken.getType()==DBLLexer.STATEMENT)
		 * { closeStatement.setCursor(cursorToken.getChild(0).getText()); }
		 */

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DBLLexer.CURSOR:

				closeStatement.setCursor(fieldToken.getChild(0).getText());

				break;
			}
		}

		return closeStatement;
	}
	
	private QBindingStatement manageAllocateDescriptorStatement(Tree tree) {
		
		QAllocateDescriptorStatement allocateDescriptorStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createAllocateDescriptorStatement();
		allocateDescriptorStatement.setDescriptorScope(DescriptorScope.NONE);
		
		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DBLLexer.DESCRIPTOR:

				allocateDescriptorStatement.setDescriptorName(fieldToken.getChild(0).getText());

				break;
				
			case DBLLexer.DESCRIPTOR_SCOPE:
				
				if (fieldToken.getChildCount() > 0) {				
					if (fieldToken.getChild(0).getText().equalsIgnoreCase(DescriptorScope.LOCAL.getLiteral())) {
						allocateDescriptorStatement.setDescriptorScope(DescriptorScope.LOCAL);
					} else if (fieldToken.getChild(0).getText().equalsIgnoreCase(DescriptorScope.GLOBAL.getLiteral())) {
						allocateDescriptorStatement.setDescriptorScope(DescriptorScope.GLOBAL);
					} 
				}

				break;
				
			case DBLLexer.WITH_MAX:
				
				if (fieldToken.getChildCount() > 0) {
					if (fieldToken.getChild(0).getType() == DBLLexer.VARIABLE) {
						if (fieldToken.getChild(0).getChildCount() > 0) {
							allocateDescriptorStatement.setWithMax(fieldToken.getChild(0).getChild(0).getText());
						}
					} else {
						allocateDescriptorStatement.setWithMax(fieldToken.getChild(0).getText());
					}
				}

				break;
			}
		}

		return allocateDescriptorStatement;
	}
	
	private QBindingStatement manageGetDescriptorStatement(Tree tree) {
		
		QGetDescriptorStatement getDescriptorStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createGetDescriptorStatement();
		getDescriptorStatement.setDescriptorScope(DescriptorScope.NONE);
		
		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DBLLexer.DESCRIPTOR:

				getDescriptorStatement.setDescriptorName(fieldToken.getChild(0).getText());

				break;
				
			case DBLLexer.DESCRIPTOR_SCOPE:
				
				if (fieldToken.getChildCount() > 0) {				
					if (fieldToken.getChild(0).getText().equalsIgnoreCase(DescriptorScope.LOCAL.getLiteral())) {
						getDescriptorStatement.setDescriptorScope(DescriptorScope.LOCAL);
					} else if (fieldToken.getChild(0).getText().equalsIgnoreCase(DescriptorScope.GLOBAL.getLiteral())) {
						getDescriptorStatement.setDescriptorScope(DescriptorScope.GLOBAL);
					} 
				}

				break;

				
			case DBLLexer.HEADER_INFO:
				
				/**
				 * Expected tree format:
				 * 
				 * HEADER_INFO  ___ VARIABLES ___ VALUE ___ VARIABLE
				 *                           |          |__ VALUE
				 *                           |	
				 *                           |___ VALUE ___ VARIABLE
				 *                                      |__ VALUE
				 */
				
				if (fieldToken.getChildCount() > 0) {
					
					if (fieldToken.getChild(0).getType() == DBLLexer.VARIABLES) {
						
						//Node VARIABLES
						
						for (int j = 0; j < fieldToken.getChild(0).getChildCount(); j++) {					
							
							// Node VALUE
							Tree value = fieldToken.getChild(0).getChild(j);
							
							QOption varValue = QDatabaseSyntaxDBLFactory.eINSTANCE.createOption();
							
							for (int k = 0; k < value.getChildCount(); k++) {
								
								switch (value.getChild(k).getType()) {
								case DBLLexer.VARIABLE:
									
									// Node VARIABLE
									if (value.getChild(k).getChildCount() > 0)
										varValue.setName(value.getChild(k).getChild(0).getText());
								break;
								
								case DBLLexer.VALUE:
									
									// Node VALUE
									if (value.getChild(k).getChildCount() > 0)
										varValue.setValue(value.getChild(k).getChild(0).getText());
								break;	
								}								
							}
						
							getDescriptorStatement.getVariables().add(varValue);
						}
					}	
				}

				break;
				
			case DBLLexer.ITEM_INFO:
				/**
				 * Expected tree format:
				 * 
				 * ITEM_INFO ____ VARIABLE  
				 *           |
				 *           |___ VARIABLES ___ VALUE ___ VARIABLE
				 *                           |          |__ VALUE
				 *                           |	
				 *                           |___ VALUE ___ VARIABLE
				 *                                      |__ VALUE
				 */
				if (fieldToken.getChildCount() > 0) {
					
					for (int j = 0; j < fieldToken.getChildCount(); j++) {
						
						switch(fieldToken.getChild(j).getType()) {
						
						case DBLLexer.VARIABLE:
							
							getDescriptorStatement.setValue(fieldToken.getChild(j).getChild(0).getText());
							
							break;
						
						case DBLLexer.VARIABLES:
							
							//Node VARIABLES
							
							for (int j1 = 0; j1 < fieldToken.getChild(0).getChildCount(); j1++) {					
								
								// Node VALUE
								Tree value = fieldToken.getChild(0).getChild(j1);
								
								QOption varValue = QDatabaseSyntaxDBLFactory.eINSTANCE.createOption();
								
								for (int k = 0; k < value.getChildCount(); k++) {
									
									switch (value.getChild(k).getType()) {
									case DBLLexer.VARIABLE:
										
										// Node VARIABLE
										if (value.getChild(k).getChildCount() > 0)
											varValue.setName(value.getChild(k).getChild(0).getText());
									break;
									
									case DBLLexer.VALUE:
										
										// Node VALUE
										if (value.getChild(k).getChildCount() > 0)
											varValue.setValue(value.getChild(k).getChild(0).getText());
									break;	
									}								
								}
							
								getDescriptorStatement.getVariables().add(varValue);
							}
							
							break;
						}
					}
				}
			
			break;
			}
		}
		return getDescriptorStatement;
	}
	
	private QBindingStatement manageSetDescriptorStatement(Tree tree) {
		
		QSetDescriptorStatement setDescriptorStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createSetDescriptorStatement();		
		
		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DBLLexer.DESCRIPTOR:

				setDescriptorStatement.setDescriptorName(fieldToken.getChild(0).getText());

				break;				
							
			case DBLLexer.ITEM_INFO:
				/**
				 * Expected tree format:
				 * 
				 * ITEM_INFO ____ VARIABLE  
				 *           |
				 *           |___ ITEMS ______ ITEM _____ NAME
				 *                         |          |__ VALUE __ VARIABLE
				 *                         |	
				 *                         |__ ITEM _____ NAME
				 *                                    |__ VALUE
				 */
				if (fieldToken.getChildCount() > 0) {
					
					for (int j = 0; j < fieldToken.getChildCount(); j++) {
						
						switch(fieldToken.getChild(j).getType()) {
						
						case DBLLexer.VARIABLE:
							
							setDescriptorStatement.setValue(fieldToken.getChild(j).getChild(0).getText());
							
							break;
						
						case DBLLexer.ITEMS:
							
							//Node ITEMS
							
							for (int j1 = 0; j1 < fieldToken.getChild(0).getChildCount(); j1++) {					
								
								// Node ITEM
								Tree item = fieldToken.getChild(0).getChild(j1);
								
								QOption itemValue = QDatabaseSyntaxDBLFactory.eINSTANCE.createOption();
								
								for (int k = 0; k < item.getChildCount(); k++) {
									
									switch (item.getChild(k).getType()) {
									
									case DBLLexer.NAME:
										
										// Node NAME
										if (item.getChild(k).getChildCount() > 0)
											itemValue.setName(item.getChild(k).getChild(0).getText());
									break;
									
									case DBLLexer.VALUE:
										
										// Node VALUE
										if (item.getChild(k).getChildCount() > 0)
											if (item.getChild(k).getChild(0).getType() == DBLLexer.VARIABLE) {
												// Node VARIABLE: get child text as variable name
												itemValue.setValue(item.getChild(k).getChild(0).getChild(0).getText());
											} else {													
												itemValue.setValue(item.getChild(k).getChild(0).getText());
											}
									break;	
									}								
								}
							
								setDescriptorStatement.getItems().add(itemValue);
							}
							
							break;
						}
					}
				}
			
			break;
			}
		}
		return setDescriptorStatement;
	}

	
	private QBindingStatement manageDeallocateDescriptorStatement(Tree tree) {
		
		QDeallocateDescriptorStatement deallocateDescriptorStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createDeallocateDescriptorStatement();
		deallocateDescriptorStatement.setDescriptorScope(DescriptorScope.NONE);
		
		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DBLLexer.DESCRIPTOR:

				deallocateDescriptorStatement.setDescriptorName(fieldToken.getChild(0).getText());

				break;
				
			case DBLLexer.DESCRIPTOR_SCOPE:
				
				if (fieldToken.getChildCount() > 0) {				
					if (fieldToken.getChild(0).getText().equalsIgnoreCase(DescriptorScope.LOCAL.getLiteral())) {
						deallocateDescriptorStatement.setDescriptorScope(DescriptorScope.LOCAL);
					} else if (fieldToken.getChild(0).getText().equalsIgnoreCase(DescriptorScope.GLOBAL.getLiteral())) {
						deallocateDescriptorStatement.setDescriptorScope(DescriptorScope.GLOBAL);
					} 
				}

				break;
				
			}
		}

		return deallocateDescriptorStatement;
	}



	private QBindingStatement manageFetchStatement(Tree tree) {
		QFetchStatement fetchStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createFetchStatement();

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DBLLexer.CURSOR:

				fetchStatement.setCursorName(fieldToken.getChild(0).getText());

				break;

			case DBLLexer.FETCH_POSITION:

				switch (fieldToken.getChild(0).getType()) {

				case DBLLexer.NEXT:

					fetchStatement.setPosition(FetchPosition.NEXT);

					break;

				case DBLLexer.PRIOR:

					fetchStatement.setPosition(FetchPosition.PRIOR);

					break;

				case DBLLexer.FIRST:

					fetchStatement.setPosition(FetchPosition.FIRST);

					break;

				case DBLLexer.LAST:

					fetchStatement.setPosition(FetchPosition.LAST);

					break;

				case DBLLexer.BEFORE:

					fetchStatement.setPosition(FetchPosition.BEFORE);

					break;

				case DBLLexer.AFTER:

					fetchStatement.setPosition(FetchPosition.AFTER);

					break;

				case DBLLexer.CURRENT:

					fetchStatement.setPosition(FetchPosition.CURRENT);

					break;

				case DBLLexer.RELATIVE:

					fetchStatement.setPosition(FetchPosition.RELATIVE);

					Tree relativeNumberToken = fieldToken.getChild(0).getChild(0).getChild(0);

					if (relativeNumberToken != null && (relativeNumberToken.getType() == DBLLexer.NUMBER || relativeNumberToken.getType() == DBLLexer.VARIABLE))
						fetchStatement.setRelativePosition(relativeNumberToken.getText());

					break;
				}

				break;

			case DBLLexer.SINGLE_FETCH:

				Tree intoToken = fieldToken.getChild(0);

				if (intoToken != null && intoToken.getType() == DBLLexer.INTO) {

					Tree intoRefToken = null;
					
					QSingleRowFetchClause singleRowClause = QDatabaseSyntaxDBLFactory.eINSTANCE.createSingleRowFetchClause();
					
					for (int j = 0; j < intoToken.getChildCount(); j++) {
						
						intoRefToken = intoToken.getChild(j);
						
						if (intoRefToken != null && intoRefToken.getType() == DBLLexer.VARIABLE) {
							singleRowClause.setUsingDescriptor(false);
						} else  if (intoRefToken.getType() == DBLLexer.DESCRIPTOR) {
							singleRowClause.setUsingDescriptor(true);
						}
							
						singleRowClause.getInto().add(intoRefToken.getChild(0).getText());
					}
					fetchStatement.setSingleRowClause(singleRowClause);
				}

				break;

			case DBLLexer.MULTIPLE_ROW_FETCH:

				QMultipleRowFetchClause multipleRowClause = QDatabaseSyntaxDBLFactory.eINSTANCE.createMultipleRowFetchClause();
				multipleRowClause.setUsingDescriptor(false);

				Tree multipleRowChildToken = fieldToken.getChild(0);
				switch (multipleRowChildToken.getType()) {

				case DBLLexer.FOR:

					Tree forNumberToken = fieldToken.getChild(0);

					if (forNumberToken != null && (forNumberToken.getType() == DBLLexer.NUMBER || forNumberToken.getType() == DBLLexer.VARIABLE))
						multipleRowClause.setRowsNumber(forNumberToken.getText());

					break;

				case DBLLexer.DESCRIPTOR:

					multipleRowClause.setUsingDescriptor(true);

					Tree varToken = multipleRowChildToken.getChild(0);

					if (varToken != null && varToken.getType() == DBLLexer.VARIABLE)
						multipleRowClause.setDescriptor(varToken.getChild(0).getText());

					break;

				case DBLLexer.INTO:

					Tree variableToken = multipleRowChildToken.getChild(0);

					if (variableToken != null && variableToken.getType() == DBLLexer.VARIABLE)
						multipleRowClause.setInto(variableToken.getChild(0).getText());

					break;

				}

				fetchStatement.setMultipleRowClause(multipleRowClause);

				break;

			}
		}

		return fetchStatement;
	}

	private QBindingStatement manageDescribeStatement(Tree tree) {

		QDescribeStatement describeStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createDescribeStatement();

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DBLLexer.STATEMENT:

				describeStatement.setStatementName(fieldToken.getChild(0).getText());

				break;

			case DBLLexer.INTO:

				QIntoClause intoClause = QDatabaseSyntaxDBLFactory.eINSTANCE.createIntoClause();

				Tree intoToken = null;

				for (int i2 = 0; i2 < fieldToken.getChildCount(); i2++) {

					intoToken = fieldToken.getChild(i);

					switch (intoToken.getType()) {

					case DBLLexer.VARIABLE:

						intoClause.setDescriptorName(intoToken.getChild(0).getText());

						break;

					case DBLLexer.USING:

						switch (intoToken.getChild(0).getType()) {

						case DBLLexer.NAMES:

							intoClause.setUsing(UsingType.NAMES);
							;
							break;

						case DBLLexer.LABELS:

							intoClause.setUsing(UsingType.LABELS);
							;
							break;

						case DBLLexer.ANY:

							intoClause.setUsing(UsingType.ANY);
							;
							break;

						case DBLLexer.BOTH:

							intoClause.setUsing(UsingType.BOTH);
							;
							break;

						case DBLLexer.ALL:

							intoClause.setUsing(UsingType.ALL);
							;
							break;

						case DBLLexer.SYSTEM_NAMES:

							intoClause.setUsing(UsingType.SYSTEM_NAMES);
							;
							break;
						}

						break;

					}
				}

				describeStatement.setInto(intoClause);

				break;
			}

		}

		return null;
	}

	private QBindingStatement manageDeclareCursorStatement(Tree tree, String[] queryString) {
		QDeclareCursorStatement declareCursorStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createDeclareCursorStatement();

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DBLLexer.CURSOR:

				declareCursorStatement.setCursorName(fieldToken.getChild(0).getText());

				break;

			case DBLLexer.SCROLL:

				declareCursorStatement.setCursorType(CursorType.SCROLL);

				break;

			case DBLLexer.NO_SCROLL:

				declareCursorStatement.setCursorType(CursorType.NOTSCROLL);

				break;

			case DBLLexer.DYNAMIC:

				declareCursorStatement.setCursorType(CursorType.DYNSCROLL);

				break;

			case DBLLexer.WITH_HOLD:

				declareCursorStatement.setHold(true);

				break;

			case DBLLexer.WITHOUT_HOLD:

				declareCursorStatement.setHold(false);

				break;

			case DBLLexer.FOR:

				Tree statementToken = fieldToken.getChild(0);

				if (statementToken != null && statementToken.getType() == DBLLexer.STATEMENT)
					declareCursorStatement.setForStatementName(statementToken.getChild(0).getText());

				break;

			}
		}

		// Manage query in field FOR
		if (queryString != null && queryString.length > 0) {
			
			try {
				queryParser.parseQuery(queryString[0]);
				declareCursorStatement.setForStatementName(null);
				declareCursorStatement.setForQuery(queryString[0]);				
			} catch (SQLException e) {
				declareCursorStatement.setForStatementName(queryString[0]);
				declareCursorStatement.setForQuery(null);
			}
		}

		return declareCursorStatement;
	}
	
	private QBindingStatement manageDeclareStatementStatement(Tree tree) {
		QDeclareStatementStatement declareStatementStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createDeclareStatementStatement();
		
		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DBLLexer.STATEMENT:

				declareStatementStatement.getStatements().add(fieldToken.getChild(0).getText());

				break;
			}
		}
		
		return declareStatementStatement;
	}

	private QBindingStatement managePrepareStatement(Tree tree) {
		QPrepareStatement prepareStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createPrepareStatement();

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DBLLexer.STATEMENT:

				prepareStatement.setStatementName(fieldToken.getChild(0).getText());

				break;

			case DBLLexer.INTO:

				QIntoClause intoClause = QDatabaseSyntaxDBLFactory.eINSTANCE.createIntoClause();

				Tree intoToken = null;

				for (int i2 = 0; i2 < fieldToken.getChildCount(); i2++) {

					intoToken = fieldToken.getChild(i);

					switch (intoToken.getType()) {

					case DBLLexer.VARIABLE:

						intoClause.setDescriptorName(intoToken.getChild(0).getText());

						break;

					case DBLLexer.USING:

						switch (intoToken.getChild(0).getType()) {

						case DBLLexer.NAMES:

							intoClause.setUsing(UsingType.NAMES);
							;
							break;

						case DBLLexer.LABELS:

							intoClause.setUsing(UsingType.LABELS);
							;
							break;

						case DBLLexer.ANY:

							intoClause.setUsing(UsingType.ANY);
							;
							break;

						case DBLLexer.BOTH:

							intoClause.setUsing(UsingType.BOTH);
							;
							break;

						case DBLLexer.ALL:

							intoClause.setUsing(UsingType.ALL);
							;
							break;

						case DBLLexer.SYSTEM_NAMES:

							intoClause.setUsing(UsingType.SYSTEM_NAMES);
							;
							break;
						}

						break;

					}
				}

				prepareStatement.setInto(intoClause);

				break;

			case DBLLexer.FROM:

				Tree variableToken = fieldToken.getChild(0);

				if (variableToken != null && variableToken.getType() == DBLLexer.VARIABLE)
					prepareStatement.setFrom(variableToken.getChild(0).getText());

				break;

			}

		}

		return prepareStatement;
	}

	private QBindingStatement manageOpenStatement(Tree tree) {
		QOpenStatement openStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createOpenStatement();
		openStatement.setUsingType(OpenUsingType.NONE);

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DBLLexer.CURSOR:

				openStatement.setCursor(fieldToken.getChild(0).getText());

				break;

			case DBLLexer.USING:
				openStatement.setUsingType(OpenUsingType.VARIABLE);

				Tree variableToken = fieldToken.getChild(0);

				if (variableToken != null && variableToken.getType() == DBLLexer.VARIABLE)
					openStatement.getUsing().add(variableToken.getChild(0).getText());

				break;

			case DBLLexer.USING_DESCRIPTOR:
				openStatement.setUsingType(OpenUsingType.DESCRIPTOR);

				Tree childToken = fieldToken.getChild(0);

				if ((childToken != null && (childToken.getType() == DBLLexer.VARIABLE || childToken.getType() == DBLLexer.DESCRIPTOR)))
					openStatement.getUsing().add(childToken.getChild(0).getText());

				break;
			}
		}

		return openStatement;

	}

	private QBindingStatement manageExecuteImmediateStatement(Tree tree, String[] queryString) {
		QExecuteImmediateStatement executeImmediateStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createExecuteImmediateStatement();

		Tree statementToken = tree.getChild(0);

		if (statementToken != null && statementToken.getType() == DBLLexer.VARIABLE)
			executeImmediateStatement.setVariable(statementToken.getChild(0).getText());

		// Manage query in field FOR
		if (queryString != null && queryString.length > 0)
			executeImmediateStatement.setVariable("");

		return executeImmediateStatement;

	}

	private QBindingStatement manageExecuteStatement(Tree tree) {

		QExecuteStatement executeStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createExecuteStatement();
				
		Tree fieldToken = null;
		
		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DBLLexer.STATEMENT:

				executeStatement.setStatementName(fieldToken.getChild(0).getText());

				break;

			case DBLLexer.USING:
				executeStatement.setUsingType(OpenUsingType.VARIABLE);

				Tree variableToken = fieldToken.getChild(0);

				if (variableToken != null && variableToken.getType() == DBLLexer.VARIABLE)
					executeStatement.getUsing().add(variableToken.getChild(0).getText());

				break;

			case DBLLexer.USING_DESCRIPTOR:
				executeStatement.setUsingType(OpenUsingType.DESCRIPTOR);

				Tree childToken = fieldToken.getChild(0);

				if ((childToken != null && (childToken.getType() == DBLLexer.VARIABLE || childToken.getType() == DBLLexer.DESCRIPTOR)))
					executeStatement.getUsing().add(childToken.getChild(0).getText());

				break;
			}
		}

		return executeStatement;
	}

	private QBindingStatement manageSetOptionStatement(Tree tree) {
		QSetOptionStatement setOptionStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createSetOptionStatement();
		
		Tree optionToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			optionToken = tree.getChild(i);
			
			if (optionToken.getType() == DBLLexer.OPTION){
				QOption option = QDatabaseSyntaxDBLFactory.eINSTANCE.createOption();
				option.setName(optionToken.getText());
				
				Tree valueToken = optionToken.getChild(0);
				if (valueToken != null) {
					option.setValue(valueToken.getText());
					setOptionStatement.getOptions().add(option);
				}
			}	
			else 
				System.err.println("Unknown SQL option: "+optionToken);
		}
		
		return setOptionStatement;
	}
	
	private QBindingStatement manageSetTransactionStatement(Tree tree) {
		QSetTransactionStatement setTransactionStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createSetTransactionStatement();

		Tree fieldToken = null;

		for (int i = 0; i < tree.getChildCount(); i++) {
			fieldToken = tree.getChild(i);

			switch (fieldToken.getType()) {

			case DBLLexer.ISOLATION_LEVEL:

				if (fieldToken.getChildCount() > 0) {
					fieldToken = fieldToken.getChild(0);

					switch (fieldToken.getType()) {
					case DBLLexer.SERIALIZABLE:
						setTransactionStatement.setIsolationLevel(IsolationLevel.SERIALIZABLE);
						break;

					case DBLLexer.NO_COMMIT:
						setTransactionStatement.setIsolationLevel(IsolationLevel.NO_COMMIT);
						break;

					case DBLLexer.READ_UNCOMMITTED:
						setTransactionStatement.setIsolationLevel(IsolationLevel.READ_UNCOMMITTED);
						break;

					case DBLLexer.READ_COMMITTED:
						setTransactionStatement.setIsolationLevel(IsolationLevel.READ_COMMITTED);
						break;

					case DBLLexer.REPEATABLE_READ:
						setTransactionStatement.setIsolationLevel(IsolationLevel.REPEATABLE_READ);
						break;
					}

				}

				break;

			case DBLLexer.RW_OPERATION:

				if (fieldToken.getChildCount() > 0) {
					fieldToken = fieldToken.getChild(0);

					switch (fieldToken.getType()) {

					case DBLLexer.READ_ONLY:
						setTransactionStatement.setRwOperation(RWOperation.READ_ONLY);
						break;

					case DBLLexer.READ_WRITE:
						setTransactionStatement.setRwOperation(RWOperation.READ_WRITE);
						break;
					}

					break;
				}
			}
		}

		return setTransactionStatement;

	}
	
	private QBindingStatement manageGetDiagnosticsStatement(Tree tree) {
		
		QGetDiagnosticsStatement getDiagnosticsStatement = QDatabaseSyntaxDBLFactory.eINSTANCE.createGetDiagnosticsStatement();
		QConditionInfoClause conditionInfoClause = QDatabaseSyntaxDBLFactory.eINSTANCE.createConditionInfoClause();
		
		Tree conditionInfoNode = tree.getChild(0);
		
		if (conditionInfoNode.getType() == DBLLexer.CONDITION_INFO) {
			
			Tree conditionInfoChild = null;
			for (int i = 0; i < conditionInfoNode.getChildCount(); i++) {
				conditionInfoChild = conditionInfoNode.getChild(i);
				
				switch(conditionInfoChild.getType()) {
				
				case DBLLexer.VARIABLE:
						conditionInfoClause.setCondition(conditionInfoChild.getChild(0).getText());
					break;
				
				case DBLLexer.NUMBER:
					conditionInfoClause.setCondition(conditionInfoChild.getText());
					break;
				
				case DBLLexer.CONDITION_ITEMS:
					
					Tree valueNode = null;
					for (int j = 0; j < conditionInfoChild.getChildCount(); j++) {						
						valueNode = conditionInfoChild.getChild(j);
						
						Tree valueNodeChild = null;
						for (int j2 = 0; j2 < valueNode.getChildCount(); j2++) {
														
							valueNodeChild = valueNode.getChild(j2);
							
							QOption conditionItem = QDatabaseSyntaxDBLFactory.eINSTANCE.createOption();
							
							switch (valueNodeChild.getType()) {
							
							case DBLLexer.VARIABLE:
								
								conditionItem.setName(valueNodeChild.getChild(0).getText());
								break;
							case DBLLexer.VALUE:
								
								conditionItem.setValue(valueNodeChild.getChild(0).getText());
								break;
							
							}
							
							conditionInfoClause.getConditionItems().add(conditionItem);
						}
						
					}
					
					break;
				
				}
				
			}
		}
		
		
		getDiagnosticsStatement.setConditionInfo(conditionInfoClause);
		
		return getDiagnosticsStatement;
	}
	

	// Utility methods

	/*
	 * Identity DECLARE CURSOR statements with nested SQL query For example:
	 * 
	 * DECLARE c1 CURSOR FOR (SELECT A, B, C FROM FILE)
	 * DECLARE c1 CURSOR FOR SELECT A, B, C FROM FILE
	 */
	private boolean isDeclareStatementWithSelect(String statement) {
		
		boolean result = false;
		
		if (statement.matches("^[\\s]*[dD][eE][cC][lL][aA][rR][eE].*[fF][oO][rR][\\s]*[(].*[)]")
			||
			statement.matches("^[\\s]*[dD][eE][cC][lL][aA][rR][eE].*[fF][oO][rR][\\s]*[sS][eE][lL][eE][cC][tT].*")) {
			
			result = true;
		}
		
		return result;
	}

	/**
	 * Example:
	 *
	 * Input: DECLARE c1 CURSOR FOR (SELECT A, B, C FROM FILE)
	 * 
	 *        oppure
	 *        
	 *        DECLARE c1 CURSOR FOR SELECT A, B, C FROM FILE 
	 *
	 * Output: [DECLARE c1 CURSOR FOR s1 , SELECT A, B, C FROM FILE]
	 *
	 * @param statement
	 * @return
	 */
	private String[] splitDeclareViewStatement(String statement) {

		String[] response = new String[2];
		
		if (statement.matches("^[\\s]*[dD][eE][cC][lL][aA][rR][eE].*[fF][oO][rR][\\s]*[(].*[)]")) {
		
			String[] tokens = statement.split("[\\s]*[fF][oO][rR][\\s]*[(]", Pattern.CASE_INSENSITIVE);
	
			response[0] = tokens[0] + " FOR s1";
			response[1] = tokens[1].substring(0, tokens[1].length() - 1);
			
		} else if (statement.matches("^[\\s]*[dD][eE][cC][lL][aA][rR][eE].*[fF][oO][rR][\\s]*[sS][eE][lL][eE][cC][tT].*")) {
			
			String[] tokens = statement.split("[\\s]*[sS][eE][lL][eE][cC][tT]", Pattern.CASE_INSENSITIVE);
			response[0] = tokens[0] + " s1";
			response[1] = "SELECT" + tokens[1];
		}

		return response;
	}

	// Utility methods

	/*
	 * Identity EXECUTE IMMEDIATE statements with nested SQL query For example:
	 * 
	 * EXECUTE IMMEDIATE (INSERT INTO WORK_TABLE SELECT * FROM EMPROJACT)
	 */
	private boolean isExecuteImmediateStatementWithSelect(String statement) {
		return statement.matches("^[\\s]*[eE][xX][eE][cC][uU][tT][eE][\\s]*[iI][mM][mM][eE][dD][iI][aA][tT][eE][\\s]*[(].*[)]");
	}

	/**
	 * Example:
	 * 
	 * Input: EXECUTE IMMEDIATE (INSERT INTO WORK_TABLE SELECT * FROM EMPROJACT)
	 * 
	 * Output: [EXECUTE IMMEDIATE :v1 , INSERT INTO WORK_TABLE SELECT * FROM
	 * EMPROJACT]
	 * 
	 * @param viewText
	 * @return
	 */
	private String[] splitExecuteImmediateStatement(String viewText) {

		String[] response = new String[2];
		String[] tokens = viewText.split("[\\s]*[iI][mM][mM][eE][dD][iI][aA][tT][eE][\\s]*[(]", Pattern.CASE_INSENSITIVE);

		response[0] = tokens[0] + " IMMEDIATE :v1";
		response[1] = tokens[1].substring(0, tokens[1].length() - 1);

		return response;
	}
}
