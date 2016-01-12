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

import javax.inject.Inject;

import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.rpj.writer.CompilationContextHelper;
import org.smeup.sys.il.core.QNamedNode;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.expr.AtomicType;
import org.smeup.sys.il.expr.QArithmeticExpression;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QAtomicTermExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionWriter;
import org.smeup.sys.il.expr.QFunctionTermExpression;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionFactory;
import org.smeup.sys.il.expr.QPredicateExpression;
import org.smeup.sys.il.expr.QRelationalExpression;
import org.smeup.sys.il.expr.QTermExpression;
import org.smeup.sys.il.expr.RelationalOperator;
import org.smeup.sys.il.expr.impl.ExpressionVisitorImpl;
import org.smeup.sys.il.flow.QEval;
import org.smeup.sys.il.flow.QFor;
import org.smeup.sys.il.flow.QIf;
import org.smeup.sys.il.flow.QMethodExec;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.il.flow.QUntil;
import org.smeup.sys.il.flow.QWhile;
import org.smeup.sys.il.flow.impl.StatementVisitorImpl;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.rt.core.QLogger;

public class RPJExpressionNormalizer extends StatementVisitorImpl {

	@Inject
	private QCompilationUnit compilationUnit;
	@Inject
	private QExpressionParser expressionParser;
	@Inject
	private QExpressionWriter expressionWriter;
	@Inject
	private QExceptionManager excpetionManager;
	@Inject
	private QLogger logger;
	@Inject
	private QJob job;
	
	private QMethodExec lastSetll = null;

	@Override
	public boolean visit(QMethodExec statement) {

		if (statement.getMethod().equalsIgnoreCase("SETLL"))
			lastSetll = statement;

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
							
				String leftOperand = expressionWriter.writeExpression(assignmentExpression.getLeftOperand());				
				assignmentExpression.setLeftOperand((QTermExpression) expressionParser.parseExpression(leftOperand));

				statement.setAssignment(expressionWriter.writeExpression(assignmentExpression));

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
						
						statement.setAssignment(expressionWriter.writeExpression(assignmentExpression));
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

		switch (assignmentExpression.getRightOperand().getExpressionType()) {
		case ATOMIC:
			QAtomicTermExpression atomicRightExpression = (QAtomicTermExpression) assignmentExpression.getRightOperand();
			// normalize prototype
			if (atomicRightExpression.getType() == AtomicType.NAME) {
				QNamedNode nameNode = this.compilationUnit.getNamedNode(atomicRightExpression.getValue(), true);
				if (nameNode != null && nameNode instanceof QPrototype) {

					QFunctionTermExpression functionTermExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createFunctionTermExpression();
					functionTermExpression.setValue(atomicRightExpression.getValue());
					assignmentExpression.setRightOperand(functionTermExpression);
					
					statement.setAssignment(expressionWriter.writeExpression(assignmentExpression));
				}
			}
			break;
		case ARITHMETIC:
		case ASSIGNMENT:
		case BLOCK:
		case BOOLEAN:
		case FUNCTION:
		case LOGICAL:
		case QUALIFIED:
		case RELATIONAL:
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
			
			statement.setAssignment(expressionWriter.writeExpression(assignmentExpression));
		}

	}

	@SuppressWarnings("unused")
	private void checkSpecialInteger(QAtomicTermExpression atomicTermExpression, QEval statement, QAssignmentExpression assignmentExpression) {

		int i = Integer.parseInt(atomicTermExpression.getValue());
		if (i == 0) {
			atomicTermExpression.setType(AtomicType.SPECIAL);
			atomicTermExpression.setValue("*ZEROS");
							
			statement.setAssignment(expressionWriter.writeExpression(assignmentExpression));
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

		if (normalizePredicateExpression(predicateExpression)) {
						
			statement.setCondition(expressionWriter.writeExpression(predicateExpression));
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QFor statement) {

		if(statement.getCondition().isEmpty())
			return super.visit(statement);
			
		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		if (normalizePredicateExpression(predicateExpression)) {
			
			statement.setCondition(expressionWriter.writeExpression(predicateExpression));
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QUntil statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		if (normalizePredicateExpression(predicateExpression)) {
								
			statement.setCondition(expressionWriter.writeExpression(predicateExpression));
		}

		return super.visit(statement);
	}

	@Override
	public boolean visit(QWhile statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		if (normalizePredicateExpression(predicateExpression)) {
					
			statement.setCondition(expressionWriter.writeExpression(predicateExpression));
		}

		return super.visit(statement);
	}

	private boolean normalizePredicateExpression(QPredicateExpression predicateExpression) {

		InternalExpressionNormalizer expressionVisitor = new InternalExpressionNormalizer();
		predicateExpression.accept(expressionVisitor);

		return expressionVisitor.isNormalized();
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

	private class InternalExpressionNormalizer extends ExpressionVisitorImpl {

		private boolean normalized = false;

		protected boolean isNormalized() {
			return normalized;
		}

		@Override
		public boolean visit(QFunctionTermExpression expression) {
			if (expression.getValue().equalsIgnoreCase("%EQUAL")) {
				if (expression.getElements().isEmpty()) {
					if (lastSetll != null) {
						QAtomicTermExpression atomicTermExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createAtomicTermExpression();
						atomicTermExpression.setType(AtomicType.NAME);
						atomicTermExpression.setValue(lastSetll.getObject());
						expression.getElements().add(atomicTermExpression);

						normalized = true;
					}
				}

			}
			return super.visit(expression);
		}

		@Override
		public boolean visit(QRelationalExpression expression) {
			QExpression leftExpression = expression.getLeftOperand();
			QExpression rightExpression = expression.getRightOperand();

			switch (leftExpression.getExpressionType()) {
			case ARITHMETIC:
				break;
			case ASSIGNMENT:
				break;
			case ATOMIC:
				QAtomicTermExpression atomicTermExpressionLeft = (QAtomicTermExpression) leftExpression;

				// special founded on left
				if (atomicTermExpressionLeft.getType() == AtomicType.SPECIAL) {
					reverseExpression(expression);
					normalized = true;
				}
				// string founded on left
				else if (atomicTermExpressionLeft.getType() == AtomicType.STRING) {

					if (rightExpression instanceof QAtomicTermExpression) {
						QAtomicTermExpression atomicTermExpressionRight = (QAtomicTermExpression) rightExpression;

						if (!atomicTermExpressionRight.getType().equals(AtomicType.STRING)) {
							reverseExpression(expression);
							normalized = true;
						}

					} else
						logger.info(excpetionManager.prepareException(job, RPJCompilerMessage.AS00106, atomicTermExpressionLeft.getValue()));
				}
				// constant founded on left
				else if (atomicTermExpressionLeft.getType() == AtomicType.NAME) {

					if (CompilationContextHelper.isPrimitive(compilationUnit, rightExpression))
						break;
					if (rightExpression instanceof QAtomicTermExpression)
						if (((QAtomicTermExpression) rightExpression).getType() == AtomicType.SPECIAL)
							break;

					QDataTerm<?> dataTerm = compilationUnit.getDataTerm(atomicTermExpressionLeft.getValue(), true);
					if (dataTerm == null)
						logger.info(excpetionManager.prepareException(job, RPJCompilerMessage.AS00107, atomicTermExpressionLeft.getValue()));

					else if (dataTerm.isConstant()) {
						reverseExpression(expression);
						normalized = true;
					}
				}

				break;
			case BLOCK:
				break;
			case BOOLEAN:
				break;
			case FUNCTION:
				break;
			case LOGICAL:
				break;
			case QUALIFIED:
				break;
			case RELATIONAL:
				break;
			}

			return super.visit(expression);
		}
	}
}