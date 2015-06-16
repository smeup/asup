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
import java.util.Collection;
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
import org.smeup.sys.dk.core.Supported;
import org.smeup.sys.dk.core.ToDo;
import org.smeup.sys.dk.core.Unsupported;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.annotation.TestStarted;
import org.smeup.sys.il.core.QAnnotationTest;
import org.smeup.sys.il.core.QConversion;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.expr.QExpressionParser;
import org.smeup.sys.il.flow.QBlock;
import org.smeup.sys.il.flow.QDataSection;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowFactory;
import org.smeup.sys.il.flow.QModule;
import org.smeup.sys.il.flow.QParameterList;
import org.smeup.sys.il.flow.QProgram;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.il.flow.QRoutine;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;

public class JDTProgramTestWriter extends JDTCallableUnitWriter {

	private JDTAssertionTestWriter assertionTestWriter;

	public JDTProgramTestWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name);

		writeImport(Program.class);
		writeImport(OperatingSystemRuntimeException.class);
		this.assertionTestWriter = new JDTAssertionTestWriter(getAST(), getCompilationUnit(), getCompilationUnit().getContext().get(QExpressionParser.class));
	}

	public void writeProgramTest(QProgram programTest) throws IOException {
		System.out.println(programTest);

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

		if (programTest.getFileSection() != null) {
			writeDataSets(programTest.getFileSection().getDataSets());
			writeKeyLists(programTest.getFileSection().getKeyLists());
			writeCursors(programTest.getFileSection().getCursors());
			writeStatements(programTest.getFileSection().getStatements());
			writeDisplays(programTest.getFileSection().getDisplays());
			writePrinters(programTest.getFileSection().getPrinters());

		}

		// writeInit();

		writeEntry(programTest, modules);

		// labels
		writeLabels(callableUnitInfo.getLabels().keySet());

		// main
		if (programTest.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("main");
			routine.setMain(programTest.getMain());
			writeRoutine(routine, programTest.getDataSection());
		}

		// functions
		if (programTest.getFlowSection() != null) {

			// routines
			for (QRoutine routine : programTest.getFlowSection().getRoutines()) {
				System.out.println("\t" + routine);
				writeRoutine(routine, null);
			}

			// prototype
			for (QPrototype<?> prototype : programTest.getFlowSection().getPrototypes())
				writePrototype(prototype);
		}

		if (programTest.getDataSection() != null)
			for (QDataTerm<?> dataTerm : programTest.getDataSection().getDatas())
				writeInnerTerm(dataTerm);

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
	public void writeRoutine(QRoutine routine, QDataSection dataSection) {

		if (routine.getName().startsWith("*ENTRY") || routine.getName().startsWith("*EXIT"))
			return;

		MethodDeclaration methodDeclaration = getAST().newMethodDeclaration();
		getTarget().bodyDeclarations().add(methodDeclaration);

		methodDeclaration.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(routine.getName())));
		methodDeclaration.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		// writeSuppressWarning(methodDeclaration);

		Block block = getAST().newBlock();
		methodDeclaration.setBody(block);

		if (routine.getMain() == null)
			return;

		// write java AST
		JDTStatementTestWriter statementTestWriter = getCompilationUnit().getContext().make(JDTStatementTestWriter.class);
		statementTestWriter.setAST(getAST());

		statementTestWriter.getBlocks().push(block);

		// TODO Sviluppo annotazioni specifiche D. E' corretto qui???
		if (dataSection != null) {

			MarkerAnnotation entryAnnotation = getAST().newMarkerAnnotation();
			entryAnnotation.setTypeName(getAST().newSimpleName(TestStarted.class.getSimpleName()));
			writeImport(TestStarted.class);
			methodDeclaration.modifiers().add(entryAnnotation);

			for (QDataTerm<?> dataTerm : dataSection.getDatas())
				if (dataTerm.getFacet(QAnnotationTest.class) != null) {
					QAnnotationTest qAnnotationTest = dataTerm.getFacet(QAnnotationTest.class);
					assertionTestWriter.writeAssertion(qAnnotationTest, block, "");
				}
		}

		if (routine.getMain() instanceof QBlock) {
			QBlock qBlock = (QBlock) routine.getMain();
			for (org.smeup.sys.il.flow.QStatement qStatement : qBlock.getStatements())
				qStatement.accept(statementTestWriter);
			// TODO probabilmente non necessario in questo punto, è stato
			// spostato in JDTStatementTestWriter
			// if(qStatement.getFacet(QAnnotationTest.class)!=null){
			// QAnnotationTest qAnnotationTest =
			// qStatement.getFacet(QAnnotationTest.class);
			// assertionTestWriter.writeAssertion(qAnnotationTest, block,
			// qStatement.toString());
			// }

		} else
			routine.getMain().accept(statementTestWriter);

		statementTestWriter.getBlocks().pop();

	}

	@SuppressWarnings("unchecked")
	public void writeProgramAnnotation(QProgram program) {
		QConversion conversion = program.getFacet(QConversion.class);
		if (conversion != null) {
			MarkerAnnotation conversionAnnotation = getAST().newMarkerAnnotation();

			switch (conversion.getStatus()) {
			case POSSIBLE:
				break;
			case SUPPORTED:
				writeImport(Supported.class);
				conversionAnnotation.setTypeName(getAST().newSimpleName(Supported.class.getSimpleName()));
				getTarget().modifiers().add(conversionAnnotation);
				break;
			case TODO:
				writeImport(ToDo.class);
				conversionAnnotation.setTypeName(getAST().newSimpleName(ToDo.class.getSimpleName()));
				getTarget().modifiers().add(conversionAnnotation);
				break;
			case UNSUPPORTED:
				writeImport(Unsupported.class);
				conversionAnnotation.setTypeName(getAST().newSimpleName(Unsupported.class.getSimpleName()));
				getTarget().modifiers().add(conversionAnnotation);
				break;
			}
		}

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

	private void loadModules(Collection<String> modules, String module) {

		if (!modules.contains(module))
			modules.add(module);

		QModule qModule = getCompilationUnit().getModule(module, true);
		for (String moduleName : qModule.getSetupSection().getModules())
			loadModules(modules, moduleName);
	}

}