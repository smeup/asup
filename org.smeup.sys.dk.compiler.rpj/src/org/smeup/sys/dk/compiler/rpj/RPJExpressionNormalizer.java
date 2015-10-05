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
package org.smeup.sys.dk.compiler.rpj;

import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.rpj.writer.CompilationContextHelper;
import org.smeup.sys.il.core.QNamedNode;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.expr.AtomicType;
import org.smeup.sys.il.expr.ExpressionType;
import org.smeup.sys.il.expr.QArithmeticExpression;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QAtomicTermExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QFunctionTermExpression;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionFactory;
import org.smeup.sys.il.expr.QPredicateExpression;
import org.smeup.sys.il.expr.QRelationalExpression;
import org.smeup.sys.il.expr.QTermExpression;
import org.smeup.sys.il.expr.RelationalOperator;
import org.smeup.sys.il.flow.QEval;
import org.smeup.sys.il.flow.QFor;
import org.smeup.sys.il.flow.QIf;
import org.smeup.sys.il.flow.QMethodExec;
import org.smeup.sys.il.flow.QUntil;
import org.smeup.sys.il.flow.QWhile;
import org.smeup.sys.il.flow.impl.StatementVisitorImpl;

public class RPJExpressionNormalizer extends StatementVisitorImpl {

	private QCompilationUnit compilationUnit;
	private QExpressionParser expressionParser;

	public RPJExpressionNormalizer(QCompilationUnit compilationUnit, QExpressionParser expressionParser) {
		this.compilationUnit = compilationUnit;
		this.expressionParser = expressionParser;
	}

	@Override
	public boolean visit(QMethodExec statement) {

		if (statement.getObject() == null)
			return super.visit(statement);

		QTermExpression termExpression = expressionParser.parseTerm(statement.getObject());

		QNamedNode namedNode = compilationUnit.getNamedNode(termExpression.getValue(), true);
		if (namedNode == null)
			return super.visit(statement);

		if (!(namedNode instanceof QDataTerm<?>))
			return super.visit(statement);

		QDataTerm<?> dataTerm = (QDataTerm<?>) namedNode;

		// unary
		if (dataTerm.getDataTermType().isUnary())
			return super.visit(statement);

		if (!statement.getMethod().equals("sum"))
			return super.visit(statement);

		statement.setMethod("%xfoot");
		statement.getParameters().add(0, statement.getObject());
		statement.setObject(null);

		return super.visit(statement);
	}

	@Override
	public boolean visit(QEval statement) {

		QAssignmentExpression assignmentExpression = expressionParser.parseAssignment(statement.getAssignment());

		switch (assignmentExpression.getLeftOperand().getExpressionType()) {
		case FUNCTION:
			QDataTerm<?> dataTerm = compilationUnit.getMethod(assignmentExpression.getLeftOperand().getValue());

			// function to object method
			if (dataTerm != null) {
				RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
				expressionStringBuilder.visit((QFunctionTermExpression) assignmentExpression.getLeftOperand());
				assignmentExpression.setLeftOperand((QTermExpression) expressionParser.parseExpression(expressionStringBuilder.getResult()));

				expressionStringBuilder = new RPJExpressionStringBuilder();
				expressionStringBuilder.visit(assignmentExpression);
				statement.setAssignment(expressionStringBuilder.getResult());

				return true;
			}

			break;
		case ATOMIC:
		case QUALIFIED:
			QNamedNode namedNode = this.compilationUnit.getNamedNode(assignmentExpression.getLeftOperand().getValue(), true);

			// dataTerm
			if (namedNode instanceof QDataTerm<?>) {
				dataTerm = (QDataTerm<?>) namedNode;

				// multiple
				if (dataTerm.getDataTermType().isMultiple()) {

					// primitive
					if (CompilationContextHelper.isPrimitive(compilationUnit, assignmentExpression.getRightOperand())) {

						// array.eval(%all(*ZEROS))
						QFunctionTermExpression functionTermExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createFunctionTermExpression();
						functionTermExpression.setValue("%all");
						functionTermExpression.getElements().add(assignmentExpression.getRightOperand());
						assignmentExpression.setRightOperand(functionTermExpression);

						RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
						expressionStringBuilder.visit(assignmentExpression);
						statement.setAssignment(expressionStringBuilder.getResult());
					}
				}
			}
			break;

		case BLOCK:
		case BOOLEAN:
		case LOGICAL:
		case RELATIONAL:
		case ARITHMETIC:
		case ASSIGNMENT:
			break;
		}

		return super.visit(statement);
	}

	@SuppressWarnings("unused")
	private boolean isConcatExpression(QArithmeticExpression arithmeticExpression) {

		RPJArithmeticExpressionAnalyzer arithmeticExpressionAnalyzer = compilationUnit.getContext().make(RPJArithmeticExpressionAnalyzer.class);
		arithmeticExpression.accept(arithmeticExpressionAnalyzer);

		return arithmeticExpressionAnalyzer.isStringConcatExpression();
	}

	@SuppressWarnings("unused")
	private void checkSpecialString(QAtomicTermExpression atomicTermExpression, QEval statement, QAssignmentExpression assignmentExpression) {

		if (atomicTermExpression.getValue().isEmpty()) {
			atomicTermExpression.setType(AtomicType.SPECIAL);
			atomicTermExpression.setValue("*BLANKS");

			RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
			expressionStringBuilder.visit(assignmentExpression);
			statement.setAssignment(expressionStringBuilder.getResult());
		}

	}

	@SuppressWarnings("unused")
	private void checkSpecialInteger(QAtomicTermExpression atomicTermExpression, QEval statement, QAssignmentExpression assignmentExpression) {

		int i = Integer.parseInt(atomicTermExpression.getValue());
		if (i == 0) {
			atomicTermExpression.setType(AtomicType.SPECIAL);
			atomicTermExpression.setValue("*ZEROS");

			RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
			expressionStringBuilder.visit(assignmentExpression);
			statement.setAssignment(expressionStringBuilder.getResult());
		}

	}

	@SuppressWarnings("unused")
	private boolean isNumeric(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private String normalizeRelationalExpression(QRelationalExpression relationalExpression) {

		QExpression leftExpression = relationalExpression.getLeftOperand();
		QExpression rightExpression = relationalExpression.getRightOperand();

		/*
		if (leftExpression.getExpressionType() == ExpressionType.FUNCTION) {
			QFunctionTermExpression functionTermExpressionLeft = (QFunctionTermExpression) leftExpression;

			// %PARMS founded on left -> replace with entry parameter check null
			if (functionTermExpressionLeft.getValue().equalsIgnoreCase("%PARMS") && functionTermExpressionLeft.getElements().isEmpty()) {

				if (rightExpression instanceof QAtomicTermExpression) {
					QAtomicTermExpression atomicTermExpressionRight = (QAtomicTermExpression) rightExpression;
					if (atomicTermExpressionRight.getType() == AtomicType.INTEGER) {
						
						int checkedParams = Integer.parseInt(atomicTermExpressionRight.getValue());
						
						if (this.compilationUnit.getNode() instanceof QProcedure) {
							QProcedure procedure = (QProcedure) this.compilationUnit.getNode();
							QEntry entry = procedure.getEntry();
							if(entry.getParameters().size() >= checkedParams) {

								QAtomicTermExpression leftAtomicTermExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createAtomicTermExpression();
								leftAtomicTermExpression.setType(AtomicType.NAME);

								switch (relationalExpression.getOperator()) {
								case EQUAL:
								case GREATER_THAN_EQUAL:
								case LESS_THAN_EQUAL:
									leftAtomicTermExpression.setValue(entry.getParameters().get(checkedParams-1).getName());
									relationalExpression.setOperator(RelationalOperator.NOT_EQUAL);
									break;
								case GREATER_THAN:
									leftAtomicTermExpression.setValue(entry.getParameters().get(checkedParams).getName());
									relationalExpression.setOperator(RelationalOperator.NOT_EQUAL);
									break;
								case LESS_THAN:
									leftAtomicTermExpression.setValue(entry.getParameters().get(checkedParams-2).getName());
									relationalExpression.setOperator(RelationalOperator.NOT_EQUAL);
									break;
								case NOT_EQUAL:
									leftAtomicTermExpression.setValue(entry.getParameters().get(checkedParams-1).getName());
									relationalExpression.setOperator(RelationalOperator.NOT_EQUAL);
									break;
								}
								
								relationalExpression.setLeftOperand(leftAtomicTermExpression);
															
								atomicTermExpressionRight.setType(AtomicType.SPECIAL);
								atomicTermExpressionRight.setValue("*OMIT");
								
								RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
								expressionStringBuilder.visit(relationalExpression);
								
								return expressionStringBuilder.getResult();

							}
						}
					}
				}
			}
		}
*/
		
		if (leftExpression.getExpressionType() == ExpressionType.ATOMIC) {
			QAtomicTermExpression atomicTermExpressionLeft = (QAtomicTermExpression) leftExpression;

			// special founded on left -> reverse expression
			if (atomicTermExpressionLeft.getType() == AtomicType.SPECIAL) {
				reverseExpression(relationalExpression);

				RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
				expressionStringBuilder.visit(relationalExpression);
				return expressionStringBuilder.getResult();
			}

			// STRING founded on left
			if (atomicTermExpressionLeft.getType() == AtomicType.STRING) {

				if (rightExpression instanceof QAtomicTermExpression) {
					QAtomicTermExpression atomicTermExpressionRight = (QAtomicTermExpression) rightExpression;

					if (!atomicTermExpressionRight.getType().equals(AtomicType.STRING)) {

						reverseExpression(relationalExpression);

						RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
						expressionStringBuilder.visit(relationalExpression);
						return expressionStringBuilder.getResult();
					}
				}
			}
			
			// constant on left
/*			QDataTerm<?> dataTerm = this.compilationUnit.getDataTerm(atomicTermExpressionLeft.getValue(), true);
			if(dataTerm != null && dataTerm.isConstant())  {
				
				if (rightExpression instanceof QAtomicTermExpression) {
					QAtomicTermExpression atomicTermExpressionRight = (QAtomicTermExpression) rightExpression;
					
					// special on right -> reverse operand
					if(atomicTermExpressionRight.getType() == AtomicType.SPECIAL) {
						reverseExpression(relationalExpression);
						
						RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
						expressionStringBuilder.visit(relationalExpression);
						return expressionStringBuilder.getResult();
					}
				}
			}*/

		}

		return null;
	}

	private void reverseExpression(QRelationalExpression relationalExpression) {
		
		QExpression leftExpression = relationalExpression.getLeftOperand();
		QExpression rightExpression = relationalExpression.getRightOperand();
		
		relationalExpression.setLeftOperand(rightExpression);
		relationalExpression.setRightOperand(leftExpression);

		switch (relationalExpression.getOperator()) {
		case EQUAL:
			break;
		case GREATER_THAN:
			relationalExpression.setOperator(RelationalOperator.LESS_THAN);
			break;
		case GREATER_THAN_EQUAL:
			relationalExpression.setOperator(RelationalOperator.LESS_THAN_EQUAL);
			break;
		case LESS_THAN:
			relationalExpression.setOperator(RelationalOperator.GREATER_THAN);
			break;
		case LESS_THAN_EQUAL:
			relationalExpression.setOperator(RelationalOperator.GREATER_THAN_EQUAL);
			break;
		case NOT_EQUAL:
			break;
		}

		
	}

	@Override
	public boolean visit(QIf statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		// normalize *BLANKS <> AAA010
		if (predicateExpression instanceof QRelationalExpression) {
			QRelationalExpression relationalExpression = (QRelationalExpression) predicateExpression;
			String result = normalizeRelationalExpression(relationalExpression);
			if (result != null)
				statement.setCondition(result);
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QFor statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		// normalize *BLANKS <> AAA010
		if (predicateExpression instanceof QRelationalExpression) {
			QRelationalExpression relationalExpression = (QRelationalExpression) predicateExpression;
			String result = normalizeRelationalExpression(relationalExpression);
			if (result != null)
				statement.setCondition(result);
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QUntil statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		// normalize *BLANKS <> AAA010
		if (predicateExpression instanceof QRelationalExpression) {
			QRelationalExpression relationalExpression = (QRelationalExpression) predicateExpression;
			String result = normalizeRelationalExpression(relationalExpression);
			if (result != null)
				statement.setCondition(result);
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QWhile statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		// normalize *BLANKS <> AAA010
		if (predicateExpression instanceof QRelationalExpression) {
			QRelationalExpression relationalExpression = (QRelationalExpression) predicateExpression;
			String result = normalizeRelationalExpression(relationalExpression);
			if (result != null)
				statement.setCondition(result);
		}

		return super.visit(statement);
	}
}
