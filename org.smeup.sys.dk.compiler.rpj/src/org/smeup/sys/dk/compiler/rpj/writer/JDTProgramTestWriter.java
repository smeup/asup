/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Giuliano Giancristofaro		- Initial API and implementation
 */
package org.smeup.sys.dk.compiler.rpj.writer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerLinker;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitAnalyzer;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitInfo;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.core.QAnnotationTest;
import org.smeup.sys.il.core.java.QLists;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowFactory;
import org.smeup.sys.il.flow.QModule;
import org.smeup.sys.il.flow.QParameterList;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QProgram;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.il.flow.QRoutine;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;

public class JDTProgramTestWriter extends JDTProgramWriter {

	private QLists listUtil;

	public JDTProgramTestWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name);

		this.listUtil = compilationUnit.getContext().get(QLists.class);

		writeImport(Program.class);
		writeImport(OperatingSystemRuntimeException.class);
	}

	@SuppressWarnings("unchecked")
	public void writeProgramTest(QProgram programTest) throws IOException {

		refactCallableUnit(programTest);

		// unit info
		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(programTest);

		// modules
		List<String> modules = new ArrayList<>();
		if (programTest.getSetupSection() != null) {
			for (String module : programTest.getSetupSection().getModules())
				loadModules(modules, module);

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

		// Program annotation
		writeProgramAnnotation(programTest);

		writeSupportFields(callableUnitInfo);

		writeSupportProgramTestFields(callableUnitInfo);

		writeModuleFields(modules, false);

		if (programTest.getDataSection() != null)
			writeDataFields(programTest.getDataSection());

		if (programTest.getFlowSection() != null)
			for (QProcedure procedure : programTest.getFlowSection().getProcedures())
				writePublicProcedure(procedure);

		if (programTest.getFileSection() != null) {
			writeDataSets(programTest.getFileSection().getDataSets());
			writeKeyLists(programTest.getFileSection().getKeyLists());
			writeCursors(programTest.getFileSection().getCursors());
			writeStatements(programTest.getFileSection().getStatements());
			writeDisplays(programTest.getFileSection().getDisplays());
			writePrinters(programTest.getFileSection().getPrinters());

		}

		writeInit();

		writeEntry(programTest, modules);

		// labels
		writeLabels(callableUnitInfo.getLabels().keySet(), false, true);

		// prototypes
		if (programTest.getFlowSection() != null)
			for (QPrototype prototype : programTest.getFlowSection().getPrototypes())
				writePrototype(prototype);

		// main
		if (programTest.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("main");
			routine.setMain(programTest.getMain());
			MethodDeclaration methodDeclaration = writeRoutine(routine);

			MarkerAnnotation entryAnnotation = getAST().newMarkerAnnotation();
			entryAnnotation.setTypeName(getAST().newSimpleName(TestStarted.class.getSimpleName()));
			writeImport(TestStarted.class);

			listUtil.addFirst(methodDeclaration.modifiers(), entryAnnotation);

			Block assertionBlock = getAST().newBlock();

			JDTStatementWriter statementWriter = getCompilationUnit().getContext().make(JDTStatementWriter.class);
			statementWriter.setAST(getAST());
			statementWriter.getBlocks().push(assertionBlock);

			for (QDataTerm<?> dataTerm : programTest.getDataSection().getDatas()) {
				if (dataTerm.getFacet(QAnnotationTest.class) != null) {
					QAnnotationTest annotationTest = dataTerm.getFacet(QAnnotationTest.class);
					statementWriter.writeAssertion(annotationTest, "");
				}
			}

			if(!assertionBlock.statements().isEmpty())
				listUtil.addFirst(methodDeclaration.getBody().statements(), assertionBlock);

			statementWriter.getBlocks().pop();
		}

		// routines
		if (programTest.getFlowSection() != null)
			for (QRoutine routine : programTest.getFlowSection().getRoutines())
				writeRoutine(routine);

		// procedures
		if (programTest.getFlowSection() != null)
			for (QProcedure procedure : programTest.getFlowSection().getProcedures())
				writeInnerProcedure(procedure);

		// datas
		if (programTest.getDataSection() != null)
			for (QDataTerm<?> dataTerm : programTest.getDataSection().getDatas())
				writeInnerData(dataTerm, false, true);

	}

	public void writeEntry(QProgram program, List<String> modules) throws IOException {

		if (program.getEntry() != null)
			writeEntry(program.getEntry(), "qEntry");
		else
			for (String module : modules) {

				QModule flowModule = getCompilationUnit().getModule(module, true);
				if (flowModule == null)
					throw new IOException("Invalid module: " + module);

				QParameterList parameterList = null;
				for (QParameterList pl : flowModule.getFlowSection().getParameterLists())
					if (pl.getName().equals("*ENTRY")) {
						parameterList = pl;
						break;
					}

				if (parameterList != null) {
					writeEntry(parameterList, "qEntry");
					break;
				}
			}
	}

	@SuppressWarnings("unchecked")
	public void writeSupportProgramTestFields(RPJCallableUnitInfo callableUnitInfo) {

		writeImport(QTestManager.class);

		VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
		FieldDeclaration field = getAST().newFieldDeclaration(variable);

		writeAnnotation(field, Inject.class);

		field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
		field.setType(getAST().newSimpleType(getAST().newName(QTestAsserter.class.getSimpleName())));
		variable.setName(getAST().newSimpleName("testAsserter"));
		getTarget().bodyDeclarations().add(field);

	}

	@SuppressWarnings("unchecked")
	public void writeProgramAnnotation(QProgram program) {

		// @Program(name=)
		NormalAnnotation programAnnotation = getAST().newNormalAnnotation();
		programAnnotation.setTypeName(getAST().newSimpleName(Program.class.getSimpleName()));
		MemberValuePair memberValuePair = getAST().newMemberValuePair();
		memberValuePair.setName(getAST().newSimpleName("name"));
		StringLiteral stringLiteral = getAST().newStringLiteral();
		stringLiteral.setLiteralValue(program.getName());
		memberValuePair.setValue(stringLiteral);
		programAnnotation.values().add(memberValuePair);

		getTarget().modifiers().add(0, programAnnotation);

		// @Test(category = "", object = "")
		programAnnotation = getAST().newNormalAnnotation();
		programAnnotation.setTypeName(getAST().newSimpleName(Test.class.getSimpleName()));

		MemberValuePair categoryValuePair = getAST().newMemberValuePair();
		categoryValuePair.setName(getAST().newSimpleName("category"));
		stringLiteral = getAST().newStringLiteral();
		stringLiteral.setLiteralValue("ILDATA");
		categoryValuePair.setValue(stringLiteral);
		programAnnotation.values().add(categoryValuePair);

		MemberValuePair objectValuePair = getAST().newMemberValuePair();
		objectValuePair.setName(getAST().newSimpleName("object"));
		stringLiteral = getAST().newStringLiteral();
		stringLiteral.setLiteralValue(program.getName());
		objectValuePair.setValue(stringLiteral);
		programAnnotation.values().add(objectValuePair);

		getTarget().modifiers().add(1, programAnnotation);
	}
}