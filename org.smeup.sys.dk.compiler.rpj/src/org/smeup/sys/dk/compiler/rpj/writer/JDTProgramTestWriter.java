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
import org.smeup.sys.dk.compiler.UnitScope;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitAnalyzer;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitInfo;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.core.QAnnotationTest;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowFactory;
import org.smeup.sys.il.flow.QModule;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QProgram;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.il.flow.QRoutine;
import org.smeup.sys.mi.core.util.QLists;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.pgm.rpj.RPJProgramSupport;

public class JDTProgramTestWriter extends JDTProgramWriter {

	private QLists listUtil;

	public JDTProgramTestWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name);

		this.listUtil = compilationUnit.getContext().get(QLists.class);

		writeImport(Program.class);
		writeImport(RPJProgramSupport.class);
		writeImport(OperatingSystemRuntimeException.class);
	}

	@SuppressWarnings("unchecked")
	public void writeProgramTest(QProgram program) throws IOException {

		System.out.println("Compiling test: "+program);

		refactCallableUnit(program);

		// modules
		List<String> modules = new ArrayList<>();
		if (program.getSetupSection() != null) {
			for (String module : program.getSetupSection().getModules())
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

		writeProgramAnnotation(program);

		// unit info
		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(program);

		writeSupportFields(callableUnitInfo);

		writeSupportProgramTestFields(callableUnitInfo);

		writeModuleFields(modules, UnitScope.PRIVATE);

		if (program.getFileSection() != null) {
			writeDataSets(program.getFileSection().getDataSets());
			writeKeyLists(program.getFileSection().getKeyLists());
			writeStatements(program.getFileSection().getStatements());
			writeCursors(program.getFileSection().getCursors());
			writeDisplays(program.getFileSection().getDisplays());
			writePrinters(program.getFileSection().getPrinters());
		}

		if (program.getDataSection() != null)
			writeDataFields(program.getDataSection(), UnitScope.PRIVATE);

		if (program.getFlowSection() != null)
			for (QProcedure procedure : program.getFlowSection().getProcedures())
				writePublicProcedure(procedure);

		writeInit();

		writeEntry(program, modules);

		// prototypes
		if (program.getFlowSection() != null)
			for (QPrototype prototype : program.getFlowSection().getPrototypes())
				writePrototype(prototype);

		// labels
		writeLabels(callableUnitInfo.getLabels().keySet(), false, true);

		// main
		if (program.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("*MAIN");
			routine.setMain(program.getMain());
			MethodDeclaration methodDeclaration = writeRoutine(routine);

			MarkerAnnotation entryAnnotation = getAST().newMarkerAnnotation();
			entryAnnotation.setTypeName(getAST().newSimpleName(TestStarted.class.getSimpleName()));
			writeImport(TestStarted.class);

			listUtil.addFirst(methodDeclaration.modifiers(), entryAnnotation);

			Block assertionBlock = getAST().newBlock();

			JDTStatementWriter statementWriter = getCompilationUnit().getContext().make(JDTStatementWriter.class);
			statementWriter.setAST(getAST());
			statementWriter.getBlocks().push(assertionBlock);

			for (QDataTerm<?> dataTerm : program.getDataSection().getDatas()) {
				if (dataTerm.getFacet(QAnnotationTest.class) != null) {
					QAnnotationTest annotationTest = dataTerm.getFacet(QAnnotationTest.class);
					statementWriter.writeAssertion(annotationTest, dataTerm.toString());
				}
			}

			if(!assertionBlock.statements().isEmpty())
				listUtil.addFirst(methodDeclaration.getBody().statements(), assertionBlock);

			statementWriter.getBlocks().pop();
		}

		// routines
		if (program.getFlowSection() != null)
			for (QRoutine routine : program.getFlowSection().getRoutines())
				writeRoutine(routine);

		// procedures
		if (program.getFlowSection() != null)
			for (QProcedure procedure : program.getFlowSection().getProcedures())
				writeInnerProcedure(procedure);

		// datas
		if (program.getDataSection() != null)
			for (QDataTerm<?> dataTerm : program.getDataSection().getDatas())
				writeInnerData(dataTerm, UnitScope.PUBLIC, true);

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