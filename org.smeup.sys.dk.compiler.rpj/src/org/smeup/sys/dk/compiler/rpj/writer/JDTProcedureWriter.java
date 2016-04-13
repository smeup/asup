/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi 			 - Initial API and implementation
 *   Giuliano Giancristofaro - Implementation
 */
package org.smeup.sys.dk.compiler.rpj.writer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Assignment.Operator;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.Type;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerLinker;
import org.smeup.sys.dk.compiler.UnitScope;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitAnalyzer;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitInfo;
import org.smeup.sys.il.data.annotation.Procedure;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.impl.DataTermImpl;
import org.smeup.sys.il.flow.QBlock;
import org.smeup.sys.il.flow.QEntry;
import org.smeup.sys.il.flow.QEntryParameter;
import org.smeup.sys.il.flow.QModule;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.il.flow.QRoutine;
import org.smeup.sys.os.pgm.rpj.RPJProcedureSupport;

public class JDTProcedureWriter extends JDTCallableUnitWriter {

	private boolean static_;
	private UnitScope scope;

	@SuppressWarnings("unchecked")
	public JDTProcedureWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name, UnitScope scope, boolean static_) {
		super(root, compilationUnit, compilationSetup, name, scope);

		writeImport(Procedure.class);
		writeImport(RPJProcedureSupport.class);

		if (static_)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

		this.static_ = static_;
		this.scope = scope;
	}

	public void writeProcedure(QProcedure procedure) throws IOException {

		refactCallableUnit(procedure);

		// modules
		List<String> modules = new ArrayList<>();
		if (procedure.getSetupSection() != null) {
			for (String module : procedure.getSetupSection().getModules())
				loadModules(modules, module, true);

			for (String module : modules) {

				QModule flowModule = getCompilationUnit().getModule(module, true);
				if (flowModule == null)
					throw new IOException("Invalid module: " + module);

				QCompilerLinker compilerLinker = flowModule.getFacet(QCompilerLinker.class);
				if (compilerLinker != null)
					writeImport(compilerLinker.getLinkedClass());
				else
					writeImport(module);
			}
		}
		
		writeProcedureAnnotation(procedure);

		// unit info
		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(procedure);
		writeSupportFields(callableUnitInfo);

		if (procedure.getSetupSection() != null)
			writeModuleFields(modules, UnitScope.PRIVATE);
		
		if (procedure.getFileSection() != null) {
			writeDataSets(procedure.getFileSection().getDataSets());
			writeKeyLists(procedure.getFileSection().getKeyLists());
			writeStatements(procedure.getFileSection().getStatements());
			writeCursors(procedure.getFileSection().getCursors());
			writeDisplays(procedure.getFileSection().getDisplays());
			writePrinters(procedure.getFileSection().getPrinters());
		}

		if (procedure.getDataSection() != null)
			writeDataFields(procedure.getDataSection(), UnitScope.PRIVATE);

		if (procedure.getEntry() != null && procedure.hasRoutines()) {
			for (QEntryParameter<?> entryParameter : procedure.getEntry().getParameters()) {
				writeField((QDataTerm<?>) entryParameter.getDelegate(), false, UnitScope.PRIVATE);
			}
		}

		// prototypes
		if (procedure.getFlowSection() != null)
			for (QPrototype prototype : procedure.getFlowSection().getPrototypes())
				writePrototype(prototype);

		// main
		if (procedure.getMain() != null) {
			writeProcedureEntry(procedure);
		}

		// routines
		if (procedure.getFlowSection() != null)
			for (QRoutine routine : procedure.getFlowSection().getRoutines())
				writeRoutine(routine);

		// procedures
		if (procedure.getFlowSection() != null)
			for (QProcedure procedureChild : procedure.getFlowSection().getProcedures())
				writeInnerProcedure(procedureChild);

		// datas
		if (procedure.getDataSection() != null)
			for (QDataTerm<?> dataTerm : procedure.getDataSection().getDatas()) {

				if (getCompilationUnit().getParentUnit().getDataTerm(dataTerm.getName(), false) != null)
					continue;

				writeInnerData(dataTerm, scope, static_);
			}
	}

	@SuppressWarnings("unchecked")
	private void writeProcedureEntry(final QProcedure procedure) {

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName("qExec"));

		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		if (procedure.getReturnType() != null) {
			QDataTerm<?> tempTerm = new DataTermImpl<QDataDef<?>>() {
				private static final long serialVersionUID = 1L;

				@Override
				public QDataDef<?> getDefinition() {
					return procedure.getReturnType();
				}
			};
			Type type = getJavaType(tempTerm);
			methodDeclaration.setReturnType2(type);
		}

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		if (procedure.getEntry() != null) {
			QEntry entry = procedure.getEntry();
			writeEntry(methodDeclaration, entry);

			if (procedure.hasRoutines()) {
				for (QEntryParameter<?> entryParameter : entry.getParameters()) {

					QDataTerm<?> delegateTerm = (QDataTerm<?>) entryParameter.getDelegate();

					FieldAccess thisAccess = getAST().newFieldAccess();
					thisAccess.setExpression(getAST().newThisExpression());
					thisAccess.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(entryParameter.getName())));

					if (delegateTerm.isConstant() && !delegateTerm.getDataTermType().isMultiple()) {
						Assignment assignment = getAST().newAssignment();

						assignment.setLeftHandSide(thisAccess);
						assignment.setOperator(Operator.ASSIGN);
						assignment.setRightHandSide(getAST().newSimpleName(getCompilationUnit().normalizeTermName(entryParameter.getName())));

						ExpressionStatement expressionStatement = getAST().newExpressionStatement(assignment);
						block.statements().add(expressionStatement);

					} else {

						MethodInvocation methodInvocation = getAST().newMethodInvocation();
						methodInvocation.setName(getAST().newSimpleName("assign"));
						methodInvocation.setExpression(getAST().newSimpleName(getCompilationUnit().normalizeTermName(entryParameter.getName())));
						methodInvocation.arguments().add(thisAccess);
						ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
						if (entryParameter.isNullable()) {
							IfStatement ifStatement = getAST().newIfStatement();
							String expression = getCompilationUnit().normalizeTermName(entryParameter.getName()) + " != null";
							ifStatement.setExpression(buildExpression(expression));

							ifStatement.setThenStatement(expressionStatement);
							block.statements().add(ifStatement);

						} else {
							block.statements().add(expressionStatement);
						}
					}
				}
			}
		}

		// write java AST
		JDTStatementWriter statementWriter = getCompilationUnit().getContext().make(JDTStatementWriter.class);
		statementWriter.setAST(getAST());

		statementWriter.getBlocks().push(block);

		if (procedure.getMain() instanceof QBlock) {
			QBlock qBlock = (QBlock) procedure.getMain();
			for (org.smeup.sys.il.flow.QStatement qStatement : qBlock.getStatements())
				qStatement.accept(statementWriter);
		} else
			procedure.getMain().accept(statementWriter);

		statementWriter.getBlocks().pop();
	}

	@SuppressWarnings("unchecked")
	public void writeProcedureAnnotation(QProcedure procedure) {

		// @Procedure(name=)
		NormalAnnotation procedureAnnotation = getAST().newNormalAnnotation();
		procedureAnnotation.setTypeName(getAST().newSimpleName(Procedure.class.getSimpleName()));
		MemberValuePair memberValuePair = getAST().newMemberValuePair();
		memberValuePair.setName(getAST().newSimpleName("name"));
		StringLiteral stringLiteral = getAST().newStringLiteral();
		stringLiteral.setLiteralValue(procedure.getName());
		memberValuePair.setValue(stringLiteral);
		procedureAnnotation.values().add(memberValuePair);

		getTarget().modifiers().add(0, procedureAnnotation);
	}
}
