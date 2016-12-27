/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi				- Initial API and implementation
 */
package org.smeup.sys.dk.compiler.rpj.writer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerLinker;
import org.smeup.sys.dk.compiler.UnitScope;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitAnalyzer;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitInfo;
import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.dk.test.QTestAsserter;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.flow.QConversion;
import org.smeup.sys.il.flow.QModule;
import org.smeup.sys.il.flow.QParameterList;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QProgram;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.pgm.rpj.RPJProgram;
import org.smeup.sys.os.pgm.rpj.RPJProgramSupport;

public class JDTProgramWriter extends JDTCallableUnitWriter {

	public JDTProgramWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name, UnitScope.PUBLIC);

		// super type
		Type superType = getAST().newSimpleType(getAST().newSimpleName(RPJProgram.class.getSimpleName()));
		getTarget().setSuperclassType(superType);
		
		writeFieldSerializer();
		
		writeImport(RPJProgram.class);
		writeImport(Program.class);
		writeImport(RPJProgramSupport.class);
		writeImport(OperatingSystemRuntimeException.class);
		writeImport(OperatingSystemMessageException.class);
		writeImport(List.class);
		
		if(name.startsWith("MUTE")){
			writeImport(Test.class);
			writeImport(QTestAsserter.class);
		}
		
	}

	public void writeProgram(QProgram program) throws IOException {

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

		// TEST
		if(program.getName().startsWith("MUTE"))
			writeProgramTestAnnotation(program);
		
		
		// unit info
		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(getCompilationUnit(), program);
		
		// TODO
//		if(callableUnitInfo.containsInsignificantZeros())
//			System.err.println("Unsignificant zeros");
		
		writeSupportFields(callableUnitInfo);
		
		// TEST
		if(program.getName().startsWith("MUTE"))
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

		// postConstruct
		writeInit();

		// entry
		writeEntry(program, modules);

		// prototypes
		if (program.getFlowSection() != null)
			for (QPrototype prototype : program.getFlowSection().getPrototypes())
				writePrototype(prototype);

		// labels
		writeLabels(callableUnitInfo.getLabels().keySet(), false, true);

		// routines
		writeRoutines(program, callableUnitInfo);
		
		// procedures
		if (program.getFlowSection() != null)
			for (QProcedure procedure : program.getFlowSection().getProcedures())
				writeInnerProcedure(procedure);

		// datas
		if (program.getDataSection() != null)
			for (QDataTerm<?> dataTerm : program.getDataSection().getDatas())
				writeInnerData(dataTerm, UnitScope.PUBLIC, true);
	}

	public void writeEntry(QProgram program, List<String> modules) throws IOException {

		if (program.getEntry() != null)
			writeEntry(program.getEntry(), "_params");
		else {

			for (String module : modules) {

				QModule flowModule = getCompilationUnit().getModule(module, true);
				if (flowModule == null)
					throw new IOException("Invalid module: " + module);

				if (flowModule.getFlowSection() == null)
					continue;

				QParameterList parameterList = null;
				for (QParameterList pl : flowModule.getFlowSection().getParameterLists())
					if (pl.getName().equals("*ENTRY")) {
						parameterList = pl;
						break;
					}

				if (parameterList != null) {
					writeEntry(parameterList, "_params");
					break;
				}
			}
		}
		// scrivo una entry vuota
	}

	@SuppressWarnings("unchecked")
	public void writeSupportProgramTestFields(RPJCallableUnitInfo callableUnitInfo) {
		writeImport(QTestManager.class);

		VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
		FieldDeclaration field = getAST().newFieldDeclaration(variable);
		writeAnnotation(field, Inject.class);

		field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
		field.modifiers().add(getAST().newModifier(ModifierKeyword.TRANSIENT_KEYWORD));
		field.setType(getAST().newSimpleType(getAST().newName(QTestAsserter.class.getSimpleName())));
		variable.setName(getAST().newSimpleName("testAsserter"));
		getTarget().bodyDeclarations().add(field);
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
	}

	@SuppressWarnings("unchecked")
	public void writeProgramTestAnnotation(QProgram program) {
		NormalAnnotation programAnnotation = getAST().newNormalAnnotation();
		StringLiteral stringLiteral = getAST().newStringLiteral();
		// @Test(category = "", object = "")
		programAnnotation = getAST().newNormalAnnotation();
		programAnnotation.setTypeName(getAST().newSimpleName(Test.class.getSimpleName()));

		String categoryName = "IL.DATA";
		String objectName = program.getName();

		String programText = program.getText();
		if (programText != null) {
			String[] tokens = programText.split("[\\s\\-]+");
			if (tokens.length >= 2) {
				categoryName = tokens[tokens.length - 1];
				objectName = tokens[tokens.length - 2];
			}
		}

		// category
		MemberValuePair categoryValuePair = getAST().newMemberValuePair();
		categoryValuePair.setName(getAST().newSimpleName("category"));
		stringLiteral = getAST().newStringLiteral();
		stringLiteral.setLiteralValue(categoryName);
		categoryValuePair.setValue(stringLiteral);
		programAnnotation.values().add(categoryValuePair);

		// object
		MemberValuePair objectValuePair = getAST().newMemberValuePair();
		objectValuePair.setName(getAST().newSimpleName("object"));
		stringLiteral = getAST().newStringLiteral();
		stringLiteral.setLiteralValue(objectName);
		objectValuePair.setValue(stringLiteral);
		programAnnotation.values().add(objectValuePair);

		getTarget().modifiers().add(1, programAnnotation);
	}	
}