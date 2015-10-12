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
import org.smeup.sys.il.expr.QLogicalExpression;
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

	@Override
	public boolean visit(QIf statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		if(normalizePredicateExpression(predicateExpression)) {
			RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
			expressionStringBuilder.visit(predicateExpression);
			statement.setCondition(expressionStringBuilder.getResult());			
		}
		
		return super.visit(statement);
	}

	@Override
	public boolean visit(QFor statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		if(normalizePredicateExpression(predicateExpression)) {
			RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
			expressionStringBuilder.visit(predicateExpression);
			statement.setCondition(expressionStringBuilder.getResult());			
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QUntil statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		if(normalizePredicateExpression(predicateExpression)) {
			RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
			expressionStringBuilder.visit(predicateExpression);
			statement.setCondition(expressionStringBuilder.getResult());			
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QWhile statement) {


		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		if(normalizePredicateExpression(predicateExpression)) {
			RPJExpressionStringBuilder expressionStringBuilder = new RPJExpressionStringBuilder();
			expressionStringBuilder.visit(predicateExpression);
			statement.setCondition(expressionStringBuilder.getResult());			
		}

		return super.visit(statement);
	}	

	private boolean normalizePredicateExpression(QPredicateExpression predicateExpression) {

		boolean normalized = false;
		
		if (predicateExpression instanceof QRelationalExpression) {
			QRelationalExpression relationalExpression = (QRelationalExpression) predicateExpression;
			
			if(normalizeRelationalExpression(relationalExpression)) 
				normalized = true;
		} 
		else if(predicateExpression instanceof QLogicalExpression) {
			QLogicalExpression logicalExpression = (QLogicalExpression)predicateExpression;
			
			if(normalizeLogicalExpression(logicalExpression)) 
				normalized = true;
		}

		return normalized;
	}
	
	private boolean normalizeLogicalExpression(QLogicalExpression logicalExpression) {

		boolean normalized = false;
		
		if(logicalExpression.getLeftOperand() instanceof QPredicateExpression) {
			QPredicateExpression predicateExpression = (QPredicateExpression) logicalExpression.getLeftOperand();
			if(normalizePredicateExpression(predicateExpression))
				normalized = true;
		}
		
		if(logicalExpression.getRightOperand() instanceof QPredicateExpression) {
			QPredicateExpression predicateExpression = (QPredicateExpression) logicalExpression.getRightOperand();
			if(normalizePredicateExpression(predicateExpression))
				normalized = true;
		}
		
		return normalized;
	}
	
	private boolean normalizeRelationalExpression(QRelationalExpression relationalExpression) {

		boolean normalized = false;
		
		QExpression leftExpression = relationalExpression.getLeftOperand();
		QExpression rightExpression = relationalExpression.getRightOperand();

		
		if (leftExpression.getExpressionType() == ExpressionType.ATOMIC) {
			QAtomicTermExpression atomicTermExpressionLeft = (QAtomicTermExpression) leftExpression;

			// special founded on left -> reverse expression
			if (atomicTermExpressionLeft.getType() == AtomicType.SPECIAL) {
				reverseExpression(relationalExpression);				
				normalized = true;
			}

			// STRING founded on left
			if (atomicTermExpressionLeft.getType() == AtomicType.STRING) {

				if (rightExpression instanceof QAtomicTermExpression) {
					QAtomicTermExpression atomicTermExpressionRight = (QAtomicTermExpression) rightExpression;

					if (!atomicTermExpressionRight.getType().equals(AtomicType.STRING)) {
						reverseExpression(relationalExpression);
						normalized = true;
					}
				}
			}
		
		}

		return normalized;
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
}
