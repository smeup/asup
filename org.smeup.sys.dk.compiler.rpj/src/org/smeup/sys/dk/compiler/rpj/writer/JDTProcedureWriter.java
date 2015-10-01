/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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

import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
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
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitAnalyzer;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitInfo;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Procedure;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.data.term.impl.DataTermImpl;
import org.smeup.sys.il.flow.QBlock;
import org.smeup.sys.il.flow.QEntry;
import org.smeup.sys.il.flow.QEntryParameter;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QRoutine;

public class JDTProcedureWriter extends JDTCallableUnitWriter {

	private boolean static_;
	private boolean private_;
	
	@SuppressWarnings("unchecked")
	public JDTProcedureWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name, boolean private_, boolean static_) {
		super(root, compilationUnit, compilationSetup, name);
		
		writeImport(Procedure.class);
		
		if (static_)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
		
		this.static_ = static_;
		this.private_ = private_;
	}

	public void writeProcedure(QProcedure procedure) throws IOException {

		refactCallableUnit(procedure);

		// unit info
		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(procedure);

		writeProcedureAnnotation(procedure);

		writeSupportFields(callableUnitInfo);

		if (procedure.getSetupSection() != null)
			writeModuleFields(procedure.getSetupSection().getModules(), false);

		if (procedure.getDataSection() != null)
			writeDataFields(procedure.getDataSection());
		
		if (procedure.getFileSection() != null) {
			writeDataSets(procedure.getFileSection().getDataSets());
			writeDisplays(procedure.getFileSection().getDisplays());
			writePrinters(procedure.getFileSection().getPrinters());
			writeKeyLists(procedure.getFileSection().getKeyLists());
		}
		
		if (procedure.getEntry() != null) {
			for (QEntryParameter<?> entryParameter : procedure.getEntry().getParameters()) {
				writePublicField((QDataTerm<?>) entryParameter.getDelegate(), false);
			}
		}
		
		// main
		if (procedure.getMain() != null) {
			writeProcedureEntry(procedure);
		}

		// routines
		if (procedure.getFlowSection() != null)
			for (QRoutine routine : procedure.getFlowSection().getRoutines())
				writeRoutine(routine);

		// datas
		if (procedure.getDataSection() != null)
			for (QDataTerm<?> dataTerm : procedure.getDataSection().getDatas())
				writeInnerData(dataTerm, this.private_, this.static_);
	}

	@SuppressWarnings("unchecked")
	private void writeProcedureEntry(final QProcedure procedure) {

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName("qExec"));
		
		MarkerAnnotation entryAnnotation = getAST().newMarkerAnnotation();
		entryAnnotation.setTypeName(getAST().newSimpleName(Entry.class.getSimpleName()));
		writeImport(Entry.class);
		methodDeclaration.modifiers().add(entryAnnotation);
		
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

			for (QEntryParameter<?> entryParameter : entry.getParameters()) {

				MethodInvocation methodInvocation = getAST().newMethodInvocation();
				FieldAccess thisAccess = getAST().newFieldAccess();
				thisAccess.setExpression(getAST().newThisExpression());
				thisAccess.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(entryParameter.getName())));

				QDataTerm<?> delegateTerm = (QDataTerm<?>) entryParameter.getDelegate();

				if (delegateTerm.isConstant()) {
					methodInvocation.setName(getAST().newSimpleName("eval"));
					methodInvocation.setExpression(thisAccess);
					methodInvocation.arguments().add(getAST().newSimpleName(getCompilationUnit().normalizeTermName(entryParameter.getName())));
				} else {
					methodInvocation.setName(getAST().newSimpleName("assign"));
					methodInvocation.setExpression(getAST().newSimpleName(getCompilationUnit().normalizeTermName(entryParameter.getName())));
					methodInvocation.arguments().add(thisAccess);
				}

				ExpressionStatement expressionStatement = getAST().newExpressionStatement(methodInvocation);
				block.statements().add(expressionStatement);

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
