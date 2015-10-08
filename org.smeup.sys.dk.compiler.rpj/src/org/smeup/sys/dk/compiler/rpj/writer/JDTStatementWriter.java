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
package org.smeup.sys.dk.compiler.rpj.writer;

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
import org.smeup.sys.il.core.QAnnotationTest;
import org.smeup.sys.il.core.QNamedNode;
import org.smeup.sys.il.core.QNode;
import org.smeup.sys.il.core.meta.QDefault;
import org.smeup.sys.il.core.term.QTerm;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.esam.QDataSet;
import org.smeup.sys.il.esam.QDataSetTerm;
import org.smeup.sys.il.esam.QDisplayTerm;
import org.smeup.sys.il.esam.QPrintTerm;
import org.smeup.sys.il.expr.IntegratedLanguageExpressionRuntimeException;
import org.smeup.sys.il.expr.QAssignmentExpression;
import org.smeup.sys.il.expr.QExpression;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.expr.QPredicateExpression;
import org.smeup.sys.il.expr.QRelationalExpression;
import org.smeup.sys.il.expr.QTermExpression;
import org.smeup.sys.il.expr.RelationalOperator;
import org.smeup.sys.il.flow.QBlock;
import org.smeup.sys.il.flow.QBreak;
import org.smeup.sys.il.flow.QCall;
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
import org.smeup.sys.il.flow.QMonitor;
import org.smeup.sys.il.flow.QOnError;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QProcedureExec;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.il.flow.QReset;
import org.smeup.sys.il.flow.QReturn;
import org.smeup.sys.il.flow.QRoutineExec;
import org.smeup.sys.il.flow.QStatement;
import org.smeup.sys.il.flow.QUntil;
import org.smeup.sys.il.flow.QWhile;
import org.smeup.sys.il.flow.impl.StatementVisitorImpl;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;

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
		Expression jdtExpression = buildExpression(ast, expression, String.class);
		methodInvocation.arguments().add(jdtExpression);

		// array of parameter
		ArrayCreation arrayCreation = ast.newArrayCreation();
		arrayCreation.setType(ast.newArrayType(ast.newSimpleType(ast.newSimpleName(QData.class.getSimpleName()))));
		ArrayInitializer arrayInitializer = ast.newArrayInitializer();
		for (String parameter : statement.getParameters()) {
			expression = expressionParser.parseTerm(parameter);
			jdtExpression = buildExpression(ast, expression, null);
			arrayInitializer.expressions().add(jdtExpression);

		}
		arrayCreation.setInitializer(arrayInitializer);
		methodInvocation.arguments().add(arrayCreation);

		// error indicator
		if (statement.getError() != null) {
			QTermExpression errorExpression = expressionParser.parseTerm(statement.getError());
			Expression jdtErrorExpression = buildExpression(ast, errorExpression, null);

			methodInvocation.arguments().add(jdtErrorExpression);
		}
		// error handling
		if (statement.getErrorHandling() != null) {
			QTermExpression errorExpression = expressionParser.parseTerm(statement.getErrorHandling());
			Expression jdtErrorExpression = buildExpression(ast, errorExpression, null);

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

		ContinueStatement continueSt = ast.newContinueStatement();
		block.statements().add(continueSt);

		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QEval statement) {

		Block block = blocks.peek();

		QAssignmentExpression assignmentExpression = expressionParser.parseAssignment(statement.getAssignment());
		MethodInvocation methodInvocation = buildAssignmentMethod(assignmentExpression, statement.isDirection());
		
		if (statement.getRoundingMode() != null) {
			statement.toString();
			// TODO verificare se corretto qui
			QExpression expression = expressionParser.parseExpression(statement.getRoundingMode());
			Expression jdtExpression = buildExpression(ast, expression, null);
			methodInvocation.arguments().add(jdtExpression);
		}

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		// Annotation
		if (statement.getFacet(QAnnotationTest.class) != null) {
			QAnnotationTest annotationTest = statement.getFacet(QAnnotationTest.class);

			writeAssertion(annotationTest, statement.toString());
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QIf statement) {

		Block block = blocks.peek();

		IfStatement ifSt = ast.newIfStatement();

		QPredicateExpression condition = expressionParser.parsePredicate(statement.getCondition());

		Expression expression = null;

		if (CompilationContextHelper.isPrimitive(compilationUnit, condition))
			expression = buildExpression(ast, condition, Boolean.class);
		else
			expression = buildExpression(ast, condition, Boolean.class);

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
	public boolean visit(QFor statement) {

		Block block = blocks.peek();

		ForStatement forSt = ast.newForStatement();

		// initialization
		QAssignmentExpression assignment = expressionParser.parseAssignment(statement.getInitialization());
		forSt.initializers().add(buildAssignmentMethod(assignment, false));

		// condition
		QPredicateExpression condition = expressionParser.parsePredicate(statement.getCondition());
		Expression expression = buildExpression(ast, condition, CompilationContextHelper.getJavaClass(compilationUnit, condition));
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
	public boolean visit(QProcedureExec statement) {

		Block block = blocks.peek();

		MethodInvocation methodInvocation = ast.newMethodInvocation();

		QPrototype prototype = compilationUnit.getPrototype(statement.getProcedure(), true);
		if (prototype == null)
			throw new IntegratedLanguageExpressionRuntimeException("Binding error: " + statement.getProcedure());

		methodInvocation.setName(ast.newSimpleName(compilationUnit.normalizeTermName(prototype.getName())));

		/*
		 * if (prototype.isChild() && prototype.getParent() !=
		 * compilationUnit.getRoot()) { QNode parent = prototype.getParent(); if
		 * (parent instanceof QNamedNode) {
		 * 
		 * if (!(parent instanceof QProgram)) { String qualifiedParent =
		 * compilationUnit.getQualifiedName((QNamedNode) parent);
		 * methodInvocation.setExpression(buildExpression(ast,
		 * expressionParser.parseTerm(qualifiedParent), null)); } } else throw
		 * new
		 * IntegratedLanguageExpressionRuntimeException("Invalid procedure: " +
		 * statement.getProcedure()); }
		 */
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

						if (dataTerm.isConstant()) {
							Expression jdtExpression = buildExpression(ast, expression, dataTerm.getDefinition().getJavaClass());
							methodInvocation.arguments().add(jdtExpression);
						} else {
							Expression jdtExpression = buildExpression(ast, expression, dataTerm.getDefinition().getDataClass());
							methodInvocation.arguments().add(jdtExpression);
						}
					} else if (parameterDelegate instanceof QDataSetTerm) {
						Expression jdtExpression = buildExpression(ast, expression, QDataSet.class);
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

		// dummy break
		if (isParentFor(statement)) {
			IfStatement ifSt = ast.newIfStatement();
			ifSt.setExpression(ast.newBooleanLiteral(false));
			ifSt.setThenStatement(ast.newBreakStatement());
			block.statements().add(ifSt);
		}

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("qRPJ"));
		methodInvocation.setName(ast.newSimpleName("qJump"));

		Name labelName = ast.newName(new String[] { "TAG", statement.getLabel() });
		methodInvocation.arguments().add(0, labelName);

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QLabel statement) {

		Block block = blocks.peek();

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("qRPJ"));
		methodInvocation.setName(ast.newSimpleName("qLabel"));

		Name labelName = ast.newName(new String[] { "TAG", statement.getName() });
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

			QNamedNode namedNode = compilationUnit.getNamedNode(statement.getObject(), true);

			// display and print
			if ((namedNode != null && (namedNode.getParent() instanceof QDisplayTerm || namedNode.getParent() instanceof QPrintTerm))) {

				methodInvocation.setExpression(ast.newName(compilationUnit.getQualifiedName((QNamedNode) namedNode.getParent())));

				TypeLiteral typeLiteral = ast.newTypeLiteral();
				String fileName = compilationUnit.normalizeTypeName(((QNamedNode) namedNode.getParent()).getName());
				String formatName = compilationUnit.normalizeTypeName(namedNode.getName());
				typeLiteral.setType(ast.newSimpleType(ast.newName(new String[] { fileName, formatName })));

				methodInvocation.arguments().add(typeLiteral);

			} else
				methodInvocation.setExpression(buildExpression(ast, expressionParser.parseExpression(statement.getObject()), null));

			if (statement.getParameters() != null)
				for (String parameter : statement.getParameters()) {

					QExpression expression = expressionParser.parseExpression(parameter);
					Expression jdtExpression = buildExpression(ast, expression, null);
					methodInvocation.arguments().add(jdtExpression);
				}

			ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
			block.statements().add(expressionStatement);

		} else {
			QProcedureExec procedureExec = QIntegratedLanguageFlowFactory.eINSTANCE.createProcedureExec();
			procedureExec.setProcedure(statement.getMethod());
			procedureExec.getParameters().addAll(statement.getParameters());
			visit(procedureExec);
		}

		// Annotation
		if (statement.getFacet(QAnnotationTest.class) != null) {
			QAnnotationTest annotationTest = statement.getFacet(QAnnotationTest.class);
			
			writeAssertion(annotationTest, statement.toString());
		}

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

		// catch
		CatchClause catchClause = ast.newCatchClause();
		SingleVariableDeclaration exceptionDeclaration = ast.newSingleVariableDeclaration();

		Type exception = ast.newSimpleType(ast.newSimpleName(OperatingSystemRuntimeException.class.getSimpleName()));
		exceptionDeclaration.setType(exception);
		exceptionDeclaration.setName(ast.newSimpleName("e"));
		catchClause.setException(exceptionDeclaration);
		tryStatement.catchClauses().add(catchClause);

		// -> catch
		blocks.push(catchClause.getBody());

		// switch
		SwitchStatement switchStatement = ast.newSwitchStatement();

		MethodInvocation methodInvocation = ast.newMethodInvocation();
		methodInvocation.setExpression(ast.newSimpleName("e"));
		methodInvocation.setName(ast.newSimpleName("toString"));

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

			returnSt.setExpression(buildExpression(ast, returnExpression, procedure.getReturnType().getDataClass()));
			block.statements().add(returnSt);
		} else {
			// dummy condition
			IfStatement ifSt = ast.newIfStatement();
			ifSt.setExpression(ast.newBooleanLiteral(true));
			ifSt.setThenStatement(returnSt);

			block.statements().add(ifSt);
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QUntil statement) {

		Block block = blocks.peek();

		DoStatement doSt = ast.newDoStatement();

		QPredicateExpression condition = expressionParser.parsePredicate(statement.getCondition());
		Expression expression = buildExpression(ast, condition, CompilationContextHelper.getJavaClass(compilationUnit, condition));
		doSt.setExpression(expression);

		block.statements().add(doSt);

		// body
		Block bodyBlock = ast.newBlock();
		doSt.setBody(bodyBlock);

		blocks.push(bodyBlock);

		return super.visit(statement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(QWhile statement) {

		if (statement.getCondition() == null)
			statement.setCondition("true");

		Block block = blocks.peek();

		WhileStatement whileSt = ast.newWhileStatement();

		QPredicateExpression condition = expressionParser.parsePredicate(statement.getCondition());
		Expression expression = buildExpression(ast, condition, CompilationContextHelper.getJavaClass(compilationUnit, condition));
		whileSt.setExpression(expression);

		block.statements().add(whileSt);

		// body
		Block bodyBlock = ast.newBlock();
		whileSt.setBody(bodyBlock);

		blocks.push(bodyBlock);

		return super.visit(statement);
	}

	private Expression buildExpression(AST ast, QExpression expression, Class<?> target) {
		return JDTStatementHelper.buildExpression(ast, compilationUnit, expression, target);
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

		if (routine.isChild() && routine.getParent() != compilationUnit.getNode()) {
			QNode parent = routine.getParent();
			if (parent instanceof QNamedNode) {
				// invoke on module
				String qualifiedParent = compilationUnit.getQualifiedName((QNamedNode) parent);
				methodInvocation.setExpression(buildExpression(ast, expressionParser.parseTerm(qualifiedParent), null));
			} else
				throw new IntegratedLanguageExpressionRuntimeException("Invalid routine: " + statement.getRoutine());
		}

		ExpressionStatement expressionStatement = ast.newExpressionStatement(methodInvocation);
		block.statements().add(expressionStatement);

		return super.visit(statement);
	}

	@Override
	public boolean visit(QReset statement) {

		QTermExpression termExpression = expressionParser.parseTerm(statement.getObject());
		if (termExpression == null)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid statement: " + statement);

		QDataTerm<?> dataTerm = compilationUnit.getDataTerm(termExpression.getValue(), true);
		if (dataTerm == null)
			throw new IntegratedLanguageExpressionRuntimeException("Invalid statement: " + statement);

		// if (dataTerm.getDataTermType().isMultiple())
		// throw new
		// FrameworkCoreUnexpectedConditionException("cbe7xcb59vbnfg4535");

		switch (dataTerm.getDataTermType()) {
		case MULTIPLE_ATOMIC:
			QDefault default_ = dataTerm.getDefault();

			if (default_ == null || default_.isEmpty()) {

				QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
				methodExec.setObject(statement.getObject());
				methodExec.setMethod("clear");
				methodExec.accept(this);

				break;
			}

			QEval eval = QIntegratedLanguageFlowFactory.eINSTANCE.createEval();
			if (dataTerm.getDefinition().getJavaClass().isAssignableFrom(String.class))
				eval.setAssignment(statement.getObject() + "=" + "'" + default_.getValue() + "'");
			else
				eval.setAssignment(statement.getObject() + "=" + default_.getValue());
			eval.accept(this);

			break;

		case MULTIPLE_COMPOUND:
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cbe7xcb59vbnfg4533");

		case UNARY_ATOMIC:
			default_ = dataTerm.getDefault();

			if (default_ == null || default_.isEmpty()) {

				QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
				methodExec.setObject(statement.getObject());
				methodExec.setMethod("clear");
				methodExec.accept(this);

				break;
			}

			eval = QIntegratedLanguageFlowFactory.eINSTANCE.createEval();
			if (dataTerm.getDefinition().getJavaClass().isAssignableFrom(String.class))
				eval.setAssignment(statement.getObject() + "=" + "'" + default_.getValue() + "'");
			else
				eval.setAssignment(statement.getObject() + "=" + default_.getValue());
			eval.accept(this);

			break;
		case UNARY_COMPOUND:
			default_ = dataTerm.getDefault();

			if (default_ == null || default_.isEmpty()) {

				QMethodExec methodExec = QIntegratedLanguageFlowFactory.eINSTANCE.createMethodExec();
				methodExec.setObject(statement.getObject());
				methodExec.setMethod("clear");
				methodExec.accept(this);

				break;

			}

			QCompoundDataDef<?, ?> compoundDataDef = (QCompoundDataDef<?, ?>) dataTerm.getDefinition();
			for (QDataTerm<?> element : compoundDataDef.getElements()) {

				if (element.getDataTermType().isMultiple())
					throw new IntegratedLanguageDataRuntimeException("Unexpected condition: cbe7xcb59vbnfg7733");

				QDataTerm<?> dataElement = (QDataTerm<?>) element;
				QDefault defaultElement = dataElement.getDefault();
				if (defaultElement == null || defaultElement.isEmpty())
					continue;

				eval = QIntegratedLanguageFlowFactory.eINSTANCE.createEval();
				if (dataElement.getDefinition().getJavaClass().isAssignableFrom(String.class))
					eval.setAssignment(element.getName() + "=" + "'" + defaultElement.getValue() + "'");
				else
					eval.setAssignment(element.getName() + "=" + defaultElement.getValue());
				eval.accept(this);
			}

			break;
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	private MethodInvocation buildAssignmentMethod(QAssignmentExpression assignmentExpression, boolean direction) {

		MethodInvocation methodInvocation = ast.newMethodInvocation();

		int p = 0;
		switch (assignmentExpression.getOperator()) {
		case ASSIGN:
			if(direction)
				methodInvocation.setName(ast.newSimpleName("evalr"));
			else
				methodInvocation.setName(ast.newSimpleName("eval"));
			break;
		case DIVIDE_ASSIGN:
			if(direction)
				throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: vbjhgso4873y6tisbh");

			methodInvocation.setName(ast.newSimpleName("divide"));
			// methodInvocation.arguments().add(p, "/");
			// p++;
			break;
		case MINUS_ASSIGN:
			if(direction)
				throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: vbjhgso4873y6tisbhA");

			methodInvocation.setName(ast.newSimpleName("minus"));
			// methodInvocation.arguments().add(p, "-");
			// p++;
			break;
		case PLUS_ASSIGN:
			if(direction)
				throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: vbjhgso4873y6tisbhB");

			methodInvocation.setName(ast.newSimpleName("plus"));
			// methodInvocation.arguments().add(p, "+");
			// p++;
			break;
		case TIMES_ASSIGN:
			if(direction)
				throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: vbjhgso4873y6tisbhC");

			methodInvocation.setName(ast.newSimpleName("mult"));
			// methodInvocation.arguments().add(p, "*");
			// p++;
			break;
		case POWER_ASSIGN:
			if(direction)
				throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: vbjhgso4873y6tisbhD");

			methodInvocation.setName(ast.newSimpleName("power"));
			// methodInvocation.arguments().add(p, "^");
			// p++;
			break;
		}

		Expression expression = buildExpression(ast, assignmentExpression.getLeftOperand(), null);
		methodInvocation.setExpression(expression);

		expression = buildExpression(ast, assignmentExpression.getRightOperand(), null);
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

	private boolean isParentFor(QStatement statement) {

		QNode parent = statement.getParent();
		while (parent != null) {
			if (parent instanceof QFor)
				return true;
			parent = parent.getParent();
		}

		return false;
	}
	
	public void writeAssertion(QAnnotationTest qAnnotationTest, String message) {

		Block block = getBlocks().peek();
		
		QPredicateExpression expression = expressionParser.parsePredicate(qAnnotationTest.getExpression());
		QRelationalExpression relationalExpression = null;
		if (expression instanceof QRelationalExpression) {
			relationalExpression = (QRelationalExpression) expression;
		} else 
			return;

		Expression leftExpression = buildExpression(ast, relationalExpression.getLeftOperand(), null);

		String messageNormalized = "";
		if(qAnnotationTest.getMessage()==null || qAnnotationTest.getMessage().isEmpty()){
			if(message.isEmpty()){
				messageNormalized = "Init " + leftExpression;
			}else{
				messageNormalized = normalizeMessage(message);
			}
		}else{
			messageNormalized = qAnnotationTest.getMessage();
		}
		
		
//		QAtomicTermExpression atomicLeftExpr = null;
		writeAssertionTrue(block, messageNormalized,buildExpression(ast, expressionParser.parseExpression(qAnnotationTest.getExpression()), null));
/*
		if(relationalExpression.getLeftOperand() instanceof QAtomicTermExpression){
			atomicLeftExpr = (QAtomicTermExpression) relationalExpression.getLeftOperand();
			if(compilationUnit.getDataTerm(atomicLeftExpr.getValue(), true) != null)
				writeAssertionTrue(block, messageNormalized,buildExpression(ast, expressionParser.parseExpression(qAnnotationTest.getExpression()), null));
			else
				writeAssertionEquals(block, messageNormalized, leftExpression, rightExpression, relationalExpression.getOperator());
		}else{
			writeAssertionEquals(block, messageNormalized, leftExpression, rightExpression, relationalExpression.getOperator());
		}

 */
	}
	
	@SuppressWarnings("unchecked")
	private void writeAssertionTrue(Block target, String message, Expression expression){
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
	private void writeAssertionEquals(Block target, String message, Expression leftExpression, Expression rightExpression, RelationalOperator operator){

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
		int pos =message.indexOf("("); 
		if(pos == -1){
			return message;
		}
		newMessage = message.substring(pos);
		return newMessage;
	}
}