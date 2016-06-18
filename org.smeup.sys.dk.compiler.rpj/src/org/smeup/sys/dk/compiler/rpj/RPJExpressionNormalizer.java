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
package org.smeup.sys.dk.compiler.rpj;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.core.term.QNamedNode;
import org.smeup.sys.il.core.term.QNode;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.expr.AtomicType;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QAtomicTermExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QExpressionWriter;
import org.smeup.sys.il.expr.QFunctionTermExpression;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionFactory;
import org.smeup.sys.il.expr.QPredicateExpression;
import org.smeup.sys.il.expr.QRelationalExpression;
import org.smeup.sys.il.expr.RelationalOperator;
import org.smeup.sys.il.expr.impl.ExpressionVisitorImpl;
import org.smeup.sys.il.flow.QBlock;
import org.smeup.sys.il.flow.QEval;
import org.smeup.sys.il.flow.QFor;
import org.smeup.sys.il.flow.QIf;
import org.smeup.sys.il.flow.QMethodExec;
import org.smeup.sys.il.flow.QProcedureExec;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.il.flow.QReturn;
import org.smeup.sys.il.flow.QStatement;
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

	private QMethodExec lastContextIndicatorSetter = null;
	
	@Override
	public boolean visit(QMethodExec statement) {

		setLastContextIndicatorSetter(statement);
		
		return true;
	}

	@Override
	public boolean visit(QEval statement) {

		QAssignmentExpression assignmentExpression = expressionParser.parseAssignment(statement.getAssignment());

		switch (assignmentExpression.getRightOperand().getExpressionType()) {
		case ATOMIC:
			QAtomicTermExpression atomicRightExpression = (QAtomicTermExpression) assignmentExpression.getRightOperand();

			// normalize prototype function (function -> function())
			if (atomicRightExpression.getType() == AtomicType.NAME) {
				QNamedNode nameNode = this.compilationUnit.getNamedNode(atomicRightExpression.getValue(), true);
				if (nameNode != null && nameNode instanceof QPrototype) {

					QFunctionTermExpression functionTermExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createFunctionTermExpression();
					functionTermExpression.setValue(atomicRightExpression.getValue());
					assignmentExpression.setRightOperand(functionTermExpression);
				}
			}
			break;
		case ARRAY:
		case ARITHMETIC:
		case ASSIGNMENT:
		case BLOCK:
		case BOOLEAN:
		case FUNCTION:
		case LOGICAL:
		case QUALIFIED:
		case RELATIONAL:
			break;
		}

		InternalExpressionNormalizer expressionNormalizer = new InternalExpressionNormalizer(statement);
		assignmentExpression.getLeftOperand().accept(expressionNormalizer);
		assignmentExpression.getRightOperand().accept(expressionNormalizer);

		if (expressionNormalizer.isNormalized())
			statement.setAssignment(expressionWriter.writeExpression(assignmentExpression));

		return false;
	}

	@Override
	public boolean visit(QIf statement) {
		
		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		if (normalizePredicateExpression(statement, predicateExpression))
			statement.setCondition(expressionWriter.writeExpression(predicateExpression));

		return true;
	}

	@Override
	public boolean visit(QFor statement) {

		if (statement.getCondition().isEmpty())
			return super.visit(statement);

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		if (normalizePredicateExpression(statement, predicateExpression))
			statement.setCondition(expressionWriter.writeExpression(predicateExpression));

		return true;
	}

	@Override
	public boolean visit(QUntil statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		if (normalizePredicateExpression(statement, predicateExpression))
			statement.setCondition(expressionWriter.writeExpression(predicateExpression));

		return true;
	}

	@Override
	public boolean visit(QWhile statement) {

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(statement.getCondition());

		if (normalizePredicateExpression(statement, predicateExpression))
			statement.setCondition(expressionWriter.writeExpression(predicateExpression));

		return true;
	}

	private boolean normalizePredicateExpression(QStatement owner, QPredicateExpression predicateExpression) {

		InternalExpressionNormalizer expressionVisitor = new InternalExpressionNormalizer(owner);
		predicateExpression.accept(expressionVisitor);

		return expressionVisitor.isNormalized();
	}

	@Override
	public boolean visit(QProcedureExec statement) {

		List<String> parameters = new ArrayList<String>();
		for (String parameter : statement.getParameters()) {
			InternalExpressionNormalizer expressionNormalizer = new InternalExpressionNormalizer(statement);
			QExpression expression = expressionParser.parseExpression(parameter);
			if (expressionNormalizer.isNormalized())
				parameters.add(expressionWriter.writeExpression(expression));
			else
				parameters.add(parameter);
		}
		statement.getParameters().clear();
		statement.getParameters().addAll(parameters);

		return false;
	}

	@Override
	public boolean visit(QReturn statement) {

		if (statement.getValue() != null) {
			QExpression expression = expressionParser.parseExpression(statement.getValue());
			InternalExpressionNormalizer expressionNormalizer = new InternalExpressionNormalizer(statement);
			expression.accept(expressionNormalizer);

			if (expressionNormalizer.isNormalized())
				statement.setValue(expressionWriter.writeExpression(expression));
		}
		
		return false;
	}

	private class InternalExpressionNormalizer extends ExpressionVisitorImpl {

		private boolean normalized = false;
		private QStatement owner = null;
		
		public InternalExpressionNormalizer(QStatement owner) {
			this.owner = owner;
		}
		
		
		protected boolean isNormalized() {
			return normalized;
		}

		@Override
		public boolean visit(QFunctionTermExpression expression) {
			
			if(RPJExpressionHelper.isContextIndicatorGetter(expression)) {
						
					if (lastContextIndicatorSetter != null) {
						
						if(getParentNode(lastContextIndicatorSetter) != getParentNode(owner)) {
							lastContextIndicatorSetter = null;
							return true;
						}							
						
						QAtomicTermExpression atomicTermExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createAtomicTermExpression();
						atomicTermExpression.setType(AtomicType.NAME);
						atomicTermExpression.setValue(lastContextIndicatorSetter.getObject());
						expression.getElements().add(atomicTermExpression);
	
						normalized = true;
					}
//					else
//						throw new DevelopmentKitCompilerRuntimeException("Unexpected condition: 9w8xbt87we8r");						
			}
			
			return true;
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

					if (RPJContextHelper.isPrimitive(compilationUnit, rightExpression))
						break;
					if (rightExpression instanceof QAtomicTermExpression)
						if (((QAtomicTermExpression) rightExpression).getType() == AtomicType.SPECIAL)
							break;

					QDataTerm<?> dataTerm = compilationUnit.getDataTerm(atomicTermExpressionLeft.getValue(), true);
					if (dataTerm == null)
						excpetionManager.prepareException(job, RPJCompilerMessage.AS00107, atomicTermExpressionLeft.getValue());

					else if (dataTerm.isConstant()) {
						reverseExpression(expression);
						normalized = true;
					}
				}

				break;
			case ARRAY:
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

			return true;
		}
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

	private void setLastContextIndicatorSetter(QMethodExec statement) {
		if (statement.getMethod().equalsIgnoreCase("SETLL"))
			lastContextIndicatorSetter = statement;
		else if (statement.getMethod().equalsIgnoreCase("SETGT"))
			lastContextIndicatorSetter = statement;
		else if (statement.getMethod().equalsIgnoreCase("CHAIN"))
			lastContextIndicatorSetter = statement;
		else if (statement.getMethod().equalsIgnoreCase("DELETE"))
			lastContextIndicatorSetter = statement;
		else if (statement.getMethod().equalsIgnoreCase("READ"))
			lastContextIndicatorSetter = statement;
		else if (statement.getMethod().equalsIgnoreCase("READE"))
			lastContextIndicatorSetter = statement;
		else if (statement.getMethod().equalsIgnoreCase("READP"))
			lastContextIndicatorSetter = statement;
		else if (statement.getMethod().equalsIgnoreCase("READPE"))
			lastContextIndicatorSetter = statement;
		else if (statement.getMethod().equalsIgnoreCase("%LOOKUP"))
			lastContextIndicatorSetter = statement;
		else if (statement.getMethod().equalsIgnoreCase("%CHECK"))
			lastContextIndicatorSetter = statement;
		else if (statement.getMethod().equalsIgnoreCase("%CHECKR"))
			lastContextIndicatorSetter = statement;		
	}
	
	@SuppressWarnings("unused")
	private QNode getParentNode(QExpression expression) {

		QNode parent = expression.getParent();
		if (parent instanceof QIf)
			return parent.getParent();
		else if (parent instanceof QFor)
			return parent.getParent();
		else if (parent instanceof QWhile)
			return parent.getParent();
		else if (parent instanceof QUntil)
			return parent.getParent();		
		else
			return parent;
	}
	
	private QNode getParentNode(QNode node) {
		
		QNode parent = node.getParent();
		if(parent instanceof QBlock)
			return getParentNode(parent);
		else
			return parent;
	}
	
	@SuppressWarnings("unused")
	private boolean isParentIf(QStatement statement) {

		QNode parent = statement.getParent();
		while (parent != null) {
			if (parent instanceof QIf)
				return true;
			parent = parent.getParent();
		}

		return false;
	}
}