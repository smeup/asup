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
package org.smeup.sys.dk.compiler.rpj.writer;

import java.util.Date;
import java.util.Iterator;
import java.util.Stack;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ArrayCreation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BreakStatement;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.ContinueStatement;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.SwitchCase;
import org.eclipse.jdt.core.dom.SwitchStatement;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeLiteral;
import org.eclipse.jdt.core.dom.WhileStatement;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.core.term.QNamedNode;
import org.smeup.sys.il.core.term.QNode;
import org.smeup.sys.il.core.term.QTerm;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QFloating;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.esam.QDataSet;
import org.smeup.sys.il.esam.QDataSetTerm;
import org.smeup.sys.il.esam.QDisplayTerm;
import org.smeup.sys.il.esam.QPrintTerm;
import org.smeup.sys.il.expr.AtomicType;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.il.expr.LogicalOperator;
import org.smeup.sys.il.expr.QArithmeticExpression;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QAtomicTermExpression;
import org.smeup.sys.il.expr.QBlockExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QIntegratedLanguageExpressionFactory;
import org.smeup.sys.il.expr.QLogicalExpression;
import org.smeup.sys.il.expr.QPredicateExpression;
import org.smeup.sys.il.expr.QRelationalExpression;
import org.smeup.sys.il.expr.QTermExpression;
import org.smeup.sys.il.expr.RelationalOperator;
import org.smeup.sys.il.flow.QAnnotationTest;
import org.smeup.sys.il.flow.QBlock;
import org.smeup.sys.il.flow.QBreak;
import org.smeup.sys.il.flow.QCall;
import org.smeup.sys.il.flow.QCallableUnit;
import org.smeup.sys.il.flow.QCommandExec;
import org.smeup.sys.il.flow.QContinue;
import org.smeup.sys.il.flow.QEntryParameter;
import org.smeup.sys.il.flow.QEval;
import org.smeup.sys.il.flow.QFor;
import org.smeup.sys.il.flow.QIf;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowFactory;
import org.smeup.sys.il.flow.QIteration;
import org.smeup.sys.il.flow.QJump;
import org.smeup.sys.il.flow.QLabel;
import org.smeup.sys.il.flow.QMethodExec;
import org.smeup.sys.il.flow.QModule;
import org.smeup.sys.il.flow.QMonitor;
import org.smeup.sys.il.flow.QOnError;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QProcedureExec;
import org.smeup.sys.il.flow.QProgram;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.il.flow.QReturn;
import org.smeup.sys.il.flow.QRoutineExec;
import org.smeup.sys.il.flow.QStatement;
import org.smeup.sys.il.flow.QUntil;
import org.smeup.sys.il.flow.QWhile;
import org.smeup.sys.il.flow.impl.StatementVisitorImpl;
import org.smeup.sys.os.core.OperatingSystemMessageException;

public class JDTStatementWriter extends StatementVisitorImpl {

	@Inject
	private QCompilationUnit compilationUnit;
	@Inject
	private QExpressionParser expressionParser;

	private AST ast;
	private Stack<Block> blocks = new Stack<>();

	public void setAST(AST ast) {
		this.ast = ast;
	}

	public Stack<Block> getBlocks() {
		return blocks;
	}

	@Override
	public void endVisit(QBlock statement) {

		// double {} on if statement
		EObject eObject = (EObject) statement;
		if (!(eObject.eContainer() instanceof QIf) && !(eObject.eContainer() instanceof QIteration))
			blocks.pop();
	}

	@Override
	public void endVisit(QFor statement) {

		blocks.pop();

		super.endVisit(statement);
	}

	@Override
	public void endVisit(QUntil statement) {

		blocks.pop();

		super.endVisit(statement);
	}

	@Override
	public void endVisit(QWhile statement) {

		blocks.pop();

		super.endVisit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QBlock statement) {

		Block block = blocks.peek();

		// double {} on if statement
		EObject eObject = (EObject) statement;
		if (!(eObject.eContainer() instanceof QIf) && !(eObject.eContainer() instanceof QIteration)) {
			Block newBlock = ast.newBlock();
			block.statements().add(newBlock);
			blocks.push(newBlock);
		}

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QBreak statement) {

		Block block = blocks.peek();

		BreakStatement breakSt = ast.newBreakStatement();
		block.statements().add(breakSt);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QCall statement) {

		Block block = blocks.peek();

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("qRPJ"));
		methodInvocation.setName(ast.newSimpleName("qCall"));

		// program name
		QTermExpression expression = expressionParser.parseTerm(statement.getProgram());
		Expression jdtExpression = JDTStatementHelper.buildExpression(ast, compilationUnit, expression, String.class);
		methodInvocation.arguments().add(jdtExpression);

		// array of parameter
		ArrayCreation arrayCreation = ast.newArrayCreation();
		arrayCreation.setType(ast.newArrayType(ast.newSimpleType(ast.newSimpleName(QData.class.getSimpleName()))));
		ArrayInitializer arrayInitializer = ast.newArrayInitializer();
		for (String parameter : statement.getParameters()) {
			expression = expressionParser.parseTerm(parameter);
			jdtExpression = JDTStatementHelper.buildExpression(ast, compilationUnit, expression, QData.class);
			arrayInitializer.expressions().add(jdtExpression);

		}
		arrayCreation.setInitializer(arrayInitializer);
		methodInvocation.arguments().add(arrayCreation);

		// error indicator
		if (statement.getError() != null) {
			QTermExpression errorExpression = expressionParser.parseTerm(statement.getError());
			Expression jdtErrorExpression = JDTStatementHelper.buildExpression(ast, compilationUnit, errorExpression, null);

			methodInvocation.arguments().add(jdtErrorExpression);
		}
		// error handling
		if (statement.getErrorHandling() != null) {
			QTermExpression errorExpression = expressionParser.parseTerm(statement.getErrorHandling());
			Expression jdtErrorExpression = JDTStatementHelper.buildExpression(ast, compilationUnit, errorExpression, null);

			methodInvocation.arguments().add(jdtErrorExpression);
		}

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QCommandExec statement) {

		Block block = blocks.peek();

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("qCMD"));
		methodInvocation.setName(ast.newSimpleName("qExecute"));

		methodInvocation.arguments().add(ast.newThisExpression());

		StringLiteral stringLiteral = ast.newStringLiteral();
		stringLiteral.setLiteralValue(statement.getStatement());
		methodInvocation.arguments().add(stringLiteral);

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QContinue statement) {

		Block block = blocks.peek();

		if(isParentIf(statement))  {
			ContinueStatement continueSt = ast.newContinueStatement();
			block.statements().add(continueSt);
		}
		else if (isParentFor(statement)) {

			IfStatement ifSt = ast.newIfStatement();
			ifSt.setExpression(ast.newName(new String[] { "RPJProgramSupport", "TRUE" }));
			ContinueStatement continueSt = ast.newContinueStatement();
			ifSt.setThenStatement(continueSt);
			
			block.statements().add(ifSt);
		} else {
			ContinueStatement continueSt = ast.newContinueStatement();
			block.statements().add(continueSt);
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QEval statement) {

		Block block = blocks.peek();

		QAssignmentExpression assignmentExpression = expressionParser.parseAssignment(statement.getAssignment());
		MethodInvocation methodInvocation = buildAssignmentMethod(assignmentExpression, statement.isRightAdjust());

		if (statement.isHalfAdjust() || statement.isMaxPrecision())
			methodInvocation.arguments().add(ast.newBooleanLiteral(statement.isHalfAdjust()));

		if (statement.isMaxPrecision())
			methodInvocation.arguments().add(ast.newBooleanLiteral(statement.isMaxPrecision()));

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		// test annotations
		for (QAnnotationTest annotationTest : statement.getFacets(QAnnotationTest.class))
			writeAssertion(annotationTest, statement.toString());

		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QIf statement) {

		Block block = blocks.peek();

		IfStatement ifSt = ast.newIfStatement();

		QPredicateExpression condition = expressionParser.parsePredicate(statement.getCondition());

		Expression expression = null;

		if (JDTContextHelper.isPrimitive(compilationUnit, condition))
			expression = JDTStatementHelper.buildExpression(ast, compilationUnit, condition, Boolean.class);
		else
			expression = JDTStatementHelper.buildExpression(ast, compilationUnit, condition, Boolean.class);

		ifSt.setExpression(expression);

		block.statements().add(ifSt);

		// then
		if (statement.getThen() != null) {
			Block thenBlock = null;
			if (ifSt.getThenStatement() instanceof Block)
				thenBlock = (Block) ifSt.getThenStatement();
			else {
				thenBlock = ast.newBlock();
				ifSt.setThenStatement(thenBlock);
			}

			blocks.push(thenBlock);
			statement.getThen().accept(this);
			blocks.pop();
		}

		// else
		if (statement.getElse() != null) {
			Block elseBlock = null;
			if (ifSt.getElseStatement() instanceof Block)
				elseBlock = (Block) ifSt.getElseStatement();
			else {
				elseBlock = ast.newBlock();
				ifSt.setElseStatement(elseBlock);
			}

			// walk else
			blocks.push(elseBlock);
			statement.getElse().accept(this);
			blocks.pop();
		}

		// interrupt navigation
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QProcedureExec statement) {

		Block block = blocks.peek();

		MethodInvocation methodInvocation = ast.newMethodInvocation();

		QPrototype prototype = compilationUnit.getPrototype(statement.getProcedure(), true);

		if (prototype == null)
			prototype = compilationUnit.getMethod(null, statement.getProcedure());

		if (prototype == null)
			throw new IntegratedLanguageExpressionRuntimeException("Binding error: " + statement.getProcedure());

		methodInvocation.setName(ast.newSimpleName(compilationUnit.normalizeTermName(prototype.getName())));

		if (!isOwner(prototype)) {
			QNode parent = prototype.getParent();
			if (parent instanceof QModule) {
				methodInvocation.setExpression(ast.newSimpleName(compilationUnit.normalizeModuleName(((QModule) parent).getName())));
			} else if (parent instanceof QNamedNode) {
				// invoke on module
				String qualifiedParent = compilationUnit.getQualifiedName((QNamedNode) parent);
				methodInvocation.setExpression(JDTStatementHelper.buildExpression(ast, compilationUnit, expressionParser.parseTerm(qualifiedParent), null));
			} else
				throw new IntegratedLanguageExpressionRuntimeException("Invalid procedure: " + statement.getProcedure());

		}

		// entry
		if (prototype.getEntry() != null) {
			Iterator<QEntryParameter<?>> entryParameters = prototype.getEntry().getParameters().iterator();

			for (String parameter : statement.getParameters()) {

				QExpression expression = expressionParser.parseExpression(parameter);

				if (entryParameters.hasNext()) {
					QEntryParameter<?> entryParameter = entryParameters.next();
					QTerm parameterDelegate = entryParameter.getDelegate();

					if (parameterDelegate instanceof QDataTerm) {
						QDataTerm<?> dataTerm = (QDataTerm<?>) parameterDelegate;

						if (dataTerm.isConstant() && !dataTerm.getDataTermType().isMultiple()) {
							Expression jdtExpression = JDTStatementHelper.buildExpression(ast, compilationUnit, expression, dataTerm.getDefinition().getJavaClass());
							methodInvocation.arguments().add(jdtExpression);
						} else {
							Expression jdtExpression = JDTStatementHelper.buildExpression(ast, compilationUnit, expression, dataTerm.getDefinition().getDataClass());
							methodInvocation.arguments().add(jdtExpression);
						}
					} else if (parameterDelegate instanceof QDataSetTerm) {
						Expression jdtExpression = JDTStatementHelper.buildExpression(ast, compilationUnit, expression, QDataSet.class);
						methodInvocation.arguments().add(jdtExpression);
					} else
						throw new IntegratedLanguageExpressionRuntimeException("Invalid procedure invocation: " + statement.getProcedure());
				} else
					throw new IntegratedLanguageExpressionRuntimeException("Invalid procedure invocation: " + statement.getProcedure());
			}

			while (entryParameters.hasNext()) {
				QEntryParameter<?> entryParameter = entryParameters.next();
				if (entryParameter.isNullable())
					methodInvocation.arguments().add(ast.newNullLiteral());
				else
					throw new IntegratedLanguageExpressionRuntimeException("Invalid procedure invocation: " + statement.getProcedure());
			}
		}

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QJump statement) {

		Block block = blocks.peek();

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("qRPJ"));
		methodInvocation.setName(ast.newSimpleName("qJump"));

		Name labelName = ast.newName(new String[] { "TAG", compilationUnit.normalizeLabelName(statement.getLabel()) });
		methodInvocation.arguments().add(0, labelName);

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		// dummy break
		if (isParentFor(statement))
			block.statements().add(ast.newBreakStatement());

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QLabel statement) {

		Block block = blocks.peek();

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("qRPJ"));
		methodInvocation.setName(ast.newSimpleName("qLabel"));

		Name labelName = ast.newName(new String[] { "TAG", compilationUnit.normalizeLabelName(statement.getName()) });
		methodInvocation.arguments().add(0, labelName);

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QMethodExec statement) {

		Block block = blocks.peek();
		if (statement.getObject() != null) {
			MethodInvocation methodInvocation = ast.newMethodInvocation();
			methodInvocation.setName(ast.newSimpleName(compilationUnit.normalizeTermName(statement.getMethod())));

			QExpression objectExpression = expressionParser.parseExpression(statement.getObject());
			QNamedNode namedNode = null;
			if (objectExpression instanceof QTermExpression) {
				QTermExpression termExpression = (QTermExpression) objectExpression;

				switch (termExpression.getExpressionType()) {
				case FUNCTION:
					namedNode = compilationUnit.getNamedNode(termExpression.getValue(), true);
					break;
				case QUALIFIED:
					namedNode = compilationUnit.getNamedNode(termExpression.getValue(), true);
					break;
				case ATOMIC: {
					QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) termExpression;
					if (atomicTermExpression.getType() == AtomicType.NAME)
						namedNode = compilationUnit.getNamedNode(termExpression.getValue(), true);
					break;
				}

				case ARITHMETIC:
				case ARRAY:
				case ASSIGNMENT:
				case BLOCK:
				case BOOLEAN:
				case LOGICAL:
				case RELATIONAL:
					break;
				}
			}

			if (namedNode == null) {
				Class<?> target = null;
				if (objectExpression instanceof QArithmeticExpression || objectExpression instanceof QBlockExpression) {
					target = JDTContextHelper.getTargetClass(compilationUnit, objectExpression, false);
					// force boxing
					if (String.class.isAssignableFrom(target))
						target = QCharacter.class;
					else if (Number.class.isAssignableFrom(target))
						target = QNumeric.class;
					else if (Date.class.isAssignableFrom(target))
						target = QDatetime.class;
				} else if (objectExpression instanceof QAtomicTermExpression) {
					QAtomicTermExpression atomicTermExpression = (QAtomicTermExpression) objectExpression;
					switch (atomicTermExpression.getType()) {
					case BOOLEAN:
						target = QIndicator.class;
						break;
					case DATE:
					case TIME:
					case TIMESTAMP:
						target = QDatetime.class;
						break;
					case FLOATING:
						target = QFloating.class;
						break;
					case HEXADECIMAL:
						target = QHexadecimal.class;
						break;
					case INDICATOR:
						target = QIndicator.class;
						break;
					case INTEGER:
						target = QDecimal.class;
						break;
					case STRING:
						target = QCharacter.class;
						break;
					case SPECIAL:
					case NAME:
						target = QData.class;
						break;
					}
				}
				methodInvocation.setExpression(JDTStatementHelper.buildExpression(ast, compilationUnit, objectExpression, target));
			}
			// display and print
			else if ((namedNode != null && (namedNode.getParent() instanceof QDisplayTerm || namedNode.getParent() instanceof QPrintTerm))) {

				methodInvocation.setExpression(ast.newName(compilationUnit.getQualifiedName((QNamedNode) namedNode.getParent())));

				TypeLiteral typeLiteral = ast.newTypeLiteral();
				String fileName = compilationUnit.normalizeTypeName(((QNamedNode) namedNode.getParent()).getName());
				String formatName = compilationUnit.normalizeTypeName(namedNode.getName());
				typeLiteral.setType(ast.newSimpleType(ast.newName(new String[] { fileName, formatName })));

				methodInvocation.arguments().add(typeLiteral);

			} else {
				Class<?> target = JDTContextHelper.getTargetClass(compilationUnit, objectExpression, false);
				methodInvocation.setExpression(JDTStatementHelper.buildExpression(ast, compilationUnit, objectExpression, target));
			}

			if (statement.getParameters() != null) {
				for (String parameter : statement.getParameters()) {
					QExpression expression = expressionParser.parseExpression(parameter);
					Expression jdtExpression = JDTStatementHelper.buildExpression(ast, compilationUnit, expression, null);
					methodInvocation.arguments().add(jdtExpression);
				}
			}

			ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
			block.statements().add(expressionStatement);

		} else {
			QProcedureExec procedureExec = QIntegratedLanguageFlowFactory.eINSTANCE.createProcedureExec();
			procedureExec.setProcedure(statement.getMethod());
			procedureExec.getParameters().addAll(statement.getParameters());
			visit(procedureExec);
		}

		// test annotations
		for (QAnnotationTest annotationTest : statement.getFacets(QAnnotationTest.class))
			writeAssertion(annotationTest, statement.toString());

		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QMonitor statement) {

		Block block = blocks.peek();

		// -> try
		TryStatement tryStatement = ast.newTryStatement();
		blocks.push(tryStatement.getBody());
		if (statement.getBody() != null)
			statement.getBody().accept(this);

		String exceptionName = "e" + blocks.size();

		// catch
		CatchClause catchClause = ast.newCatchClause();
		SingleVariableDeclaration exceptionDeclaration = ast.newSingleVariableDeclaration();

		Type exception = ast.newSimpleType(ast.newSimpleName(OperatingSystemMessageException.class.getSimpleName()));
		exceptionDeclaration.setType(exception);
		exceptionDeclaration.setName(ast.newSimpleName(exceptionName));
		catchClause.setException(exceptionDeclaration);
		tryStatement.catchClauses().add(catchClause);

		// -> catch
		blocks.push(catchClause.getBody());

		// switch
		SwitchStatement switchStatement = ast.newSwitchStatement();

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName(exceptionName));
		methodInvocation.setName(ast.newSimpleName("getMessageName"));

		switchStatement.setExpression(methodInvocation);

		blocks.peek().statements().add(switchStatement);

		for (QOnError error : statement.getOnErrors())
			if (error.getBody() != null) {

				// Case
				SwitchCase switchCase = ast.newSwitchCase();
				StringLiteral caseLiteral = ast.newStringLiteral();
				if (error.getError() != null)
					caseLiteral.setLiteralValue(error.getError());
				else
					caseLiteral.setLiteralValue("*ALL");

				switchCase.setExpression(caseLiteral);
				switchStatement.statements().add(switchCase);

				// Case body

				// -> Case
				Block caseBlock = ast.newBlock();
				blocks.push(caseBlock);

				if (error.getBody() != null)
					error.getBody().accept(this);

				// copy case block to switch statement
				for (int i = 0; i < caseBlock.statements().size(); i++)
					switchStatement.statements().add(caseBlock.statements().remove(i));

				BreakStatement switchBreak = ast.newBreakStatement();
				caseBlock.statements().add(switchBreak);

				// <- case
				blocks.pop();
			}

		// <-catch
		blocks.pop();

		// <-try
		blocks.pop();

		block.statements().add(tryStatement);

		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QReturn statement) {

		Block block = blocks.peek();

		ReturnStatement returnSt = ast.newReturnStatement();
		if (statement.getValue() != null) {
			QExpression returnExpression = expressionParser.parseExpression(statement.getValue());

			QProcedure procedure = (QProcedure) this.compilationUnit.getNode();

			returnSt.setExpression(JDTStatementHelper.buildExpression(ast, compilationUnit, returnExpression, procedure.getReturnType().getDataClass()));
			block.statements().add(returnSt);
		} else {
			// dummy condition

			IfStatement ifSt = ast.newIfStatement();
			ifSt.setExpression(ast.newName(new String[] { "RPJProgramSupport", "TRUE" }));
			ifSt.setThenStatement(returnSt);

			block.statements().add(ifSt);
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QFor statement) {

		Block block = blocks.peek();

		ForStatement forSt = ast.newForStatement();

		// initialization
		QAssignmentExpression assignment = expressionParser.parseAssignment(statement.getInitialization());
		forSt.initializers().add(buildAssignmentMethod(assignment, false));

		// condition
		QPredicateExpression condition = buildIterationCondition(statement.getCondition());
		Expression expression = JDTStatementHelper.buildExpression(ast, compilationUnit, condition, JDTContextHelper.getTargetClass(compilationUnit, condition, true));
		forSt.setExpression(expression);

		// increment
		QAssignmentExpression increment = expressionParser.parseAssignment(statement.getIncrement());
		forSt.updaters().add(buildAssignmentMethod(increment, false));

		block.statements().add(forSt);

		// body
		Block bodyBlock = ast.newBlock();
		forSt.setBody(bodyBlock);

		blocks.push(bodyBlock);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QUntil statement) {

		Block block = blocks.peek();

		DoStatement doSt = ast.newDoStatement();

		QLogicalExpression logicalExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createLogicalExpression();
		logicalExpression.setOperator(LogicalOperator.NOT);
		QBlockExpression blockExpression = QIntegratedLanguageExpressionFactory.eINSTANCE.createBlockExpression();

		QPredicateExpression condition = buildIterationCondition(statement.getCondition());
		blockExpression.setExpression(condition);

		logicalExpression.setLeftOperand(blockExpression);

		Expression expression = JDTStatementHelper.buildExpression(ast, compilationUnit, logicalExpression, JDTContextHelper.getTargetClass(compilationUnit, logicalExpression, true));
		doSt.setExpression(expression);

		block.statements().add(doSt);

		// body
		Block bodyBlock = ast.newBlock();
		doSt.setBody(bodyBlock);

		blocks.push(bodyBlock);

		return super.visit(statement);
	}

	private QPredicateExpression buildIterationCondition(String condition) {

		if (condition == null || condition.isEmpty())
			condition = "%runnable";
		else {
			if (condition.equalsIgnoreCase("*ON"))
				condition = "%runnable";
			else
				condition = "%runnable and (" + condition + ")";
		}

		QPredicateExpression predicateExpression = expressionParser.parsePredicate(condition);

		return predicateExpression;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QWhile statement) {

		Block block = blocks.peek();

		WhileStatement whileSt = ast.newWhileStatement();

		QPredicateExpression condition = buildIterationCondition(statement.getCondition());
		Expression expression = JDTStatementHelper.buildExpression(ast, compilationUnit, condition, JDTContextHelper.getTargetClass(compilationUnit, condition, true));
		whileSt.setExpression(expression);

		block.statements().add(whileSt);

		// body
		Block bodyBlock = ast.newBlock();
		whileSt.setBody(bodyBlock);

		blocks.push(bodyBlock);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QRoutineExec statement) {
		Block block = blocks.peek();

		MethodInvocation methodInvocation = ast.newMethodInvocation();

		QNamedNode routine = compilationUnit.getRoutine(statement.getRoutine(), true);
		if (routine == null)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid routine: " + statement.getRoutine());

		methodInvocation.setName(ast.newSimpleName(compilationUnit.normalizeTermName(routine.getName())));

		if (!isOwner(routine)) {
			QNode parent = routine.getParent();
			if (parent instanceof QModule) {
				methodInvocation.setExpression(ast.newSimpleName(compilationUnit.normalizeModuleName(((QModule) parent).getName())));
			} else if (parent instanceof QNamedNode) {
				// invoke on module
				String qualifiedParent = compilationUnit.getQualifiedName((QNamedNode) parent);
				methodInvocation.setExpression(JDTStatementHelper.buildExpression(ast, compilationUnit, expressionParser.parseTerm(qualifiedParent), null));
			} else
				throw new IntegratedLanguageExpressionRuntimeException("Invalid procedure: " + statement.getRoutine());

		}

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	private MethodInvocation buildAssignmentMethod(QAssignmentExpression assignmentExpression, boolean direction) {

		MethodInvocation methodInvocation = ast.newMethodInvocation();

		int p = 0;
		switch (assignmentExpression.getOperator()) {
		case ASSIGN:
			if (direction)
				methodInvocation.setName(ast.newSimpleName("evalr"));
			else
				methodInvocation.setName(ast.newSimpleName("eval"));
			break;
		case DIVIDE_ASSIGN:
			if (direction)
				throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: vbjhgso4873y6tisbh");

			methodInvocation.setName(ast.newSimpleName("divide"));
			// methodInvocation.arguments().add(p, "/");
			// p++;
			break;
		case MINUS_ASSIGN:
			if (direction)
				throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: vbjhgso4873y6tisbhA");

			methodInvocation.setName(ast.newSimpleName("minus"));
			// methodInvocation.arguments().add(p, "-");
			// p++;
			break;
		case PLUS_ASSIGN:
			if (direction)
				throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: vbjhgso4873y6tisbhB");

			methodInvocation.setName(ast.newSimpleName("plus"));
			// methodInvocation.arguments().add(p, "+");
			// p++;
			break;
		case TIMES_ASSIGN:
			if (direction)
				throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: vbjhgso4873y6tisbhC");

			methodInvocation.setName(ast.newSimpleName("mult"));
			// methodInvocation.arguments().add(p, "*");
			// p++;
			break;
		case POWER_ASSIGN:
			if (direction)
				throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: vbjhgso4873y6tisbhD");

			methodInvocation.setName(ast.newSimpleName("power"));
			// methodInvocation.arguments().add(p, "^");
			// p++;
			break;
		}

		Expression expression = JDTStatementHelper.buildExpression(ast, compilationUnit, assignmentExpression.getLeftOperand(), null);
		methodInvocation.setExpression(expression);

		// Class<?> target =
		// JDTContextHelper.getTargetClass(compilationUnit,
		// assignmentExpression.getLeftOperand(), false);
		expression = JDTStatementHelper.buildExpression(ast, compilationUnit, assignmentExpression.getRightOperand(), null);
		methodInvocation.arguments().add(p, expression);

		return methodInvocation;
	}

	@SuppressWarnings("unused")
	private boolean isParentProcedure(QStatement statement) {

		QNode parent = statement.getParent();
		while (parent != null) {
			if (parent instanceof QProcedure)
				return true;
			parent = parent.getParent();
		}

		return false;
	}

	private QCallableUnit getCallableUnit(QNamedNode nameNode) {

		QCallableUnit callableUnit = null;

		QNode node = nameNode;
		while (callableUnit == null) {
			if (node instanceof QModule || node instanceof QProgram) {
				callableUnit = (QCallableUnit) node;
				break;
			} else
				node = node.getParent();

			if (node == null)
				break;
		}

		return callableUnit;
	}

	private boolean isOwner(QNamedNode namedNode) {
		return getCallableUnit((QNamedNode) compilationUnit.getNode()).equals(getCallableUnit(namedNode));
	}

	private boolean isParentFor(QStatement statement) {

		QNode parent = statement.getParent();
		while (parent != null) {
			if (parent instanceof QFor)
				return true;
			parent = parent.getParent();
		}

		return false;
	}

	private boolean isParentIf(QStatement statement) {

		QNode parent = statement.getParent();
		while (parent != null) {
			if (parent instanceof QIf)
				return true;
			parent = parent.getParent();
		}

		return false;
	}

	public void writeAssertion(QAnnotationTest annotationTest, String message) {

		Block block = getBlocks().peek();

		if (annotationTest.getExpression() == null)
			throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: rbbbb9r88888sdxgrwgxtrx");

		QPredicateExpression expression = expressionParser.parsePredicate(annotationTest.getExpression());
		QRelationalExpression relationalExpression = null;
		if (expression instanceof QRelationalExpression) {
			relationalExpression = (QRelationalExpression) expression;
		} else
			return;

		Expression leftExpression = JDTStatementHelper.buildExpression(ast, compilationUnit, relationalExpression.getLeftOperand(), null);

		String messageNormalized = "";
		if (annotationTest.getMessage() == null || annotationTest.getMessage().isEmpty()) {
			if (message.isEmpty()) {
				messageNormalized = "Init " + leftExpression;
			} else {
				messageNormalized = normalizeMessage(message);
			}
		} else {
			messageNormalized = annotationTest.getMessage();
		}

		writeAssertionTrue(block, messageNormalized, JDTStatementHelper.buildExpression(ast, compilationUnit, expression, null));
	}

	@SuppressWarnings("unchecked")
	private void writeAssertionTrue(Block target, String message, Expression expression) {
		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("testAsserter"));
		methodInvocation.setName(ast.newSimpleName("assertTrue"));

		StringLiteral literal = ast.newStringLiteral();
		literal.setLiteralValue(message);

		methodInvocation.arguments().add(literal);
		methodInvocation.arguments().add(expression);

		ExpressionStatement assertStatement = ast.newExpressionStatement(methodInvocation);
		target.statements().add(assertStatement);
	}

	@SuppressWarnings({ "unchecked", "unused" })
	private void writeAssertionEquals(Block target, String message, Expression leftExpression, Expression rightExpression, RelationalOperator operator) {

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("testAsserter"));

		switch (operator) {
		case EQUAL:
			methodInvocation.setName(ast.newSimpleName("assertEquals"));
			break;
		case GREATER_THAN:
			break;
		case GREATER_THAN_EQUAL:
			break;
		case LESS_THAN:
			break;
		case LESS_THAN_EQUAL:
			break;
		case NOT_EQUAL:
			break;
		}

		StringLiteral literal = ast.newStringLiteral();
		literal.setLiteralValue(message);

		methodInvocation.arguments().add(literal);
		methodInvocation.arguments().add(leftExpression);
		methodInvocation.arguments().add(rightExpression);

		ExpressionStatement assertStatement = ast.newExpressionStatement(methodInvocation);
		target.statements().add(assertStatement);
	}

	private String normalizeMessage(String message) {
		String newMessage = "";
		int pos = message.indexOf("(");
		if (pos == -1) {
			return message;
		}
		newMessage = message.substring(pos);
		return newMessage;
	}
}