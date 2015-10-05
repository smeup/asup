/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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
import java.util.Collection;
import java.util.List;

import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerLinker;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitAnalyzer;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitInfo;
import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.dk.core.annotation.Unsupported;
import org.smeup.sys.il.core.QConversion;
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

public class JDTProgramWriter extends JDTCallableUnitWriter {

	public JDTProgramWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name, false);

		writeImport(Program.class);
		writeImport(OperatingSystemRuntimeException.class);
	}

	public void writeProgram(QProgram program) throws IOException {

		refactCallableUnit(program);

		// modules
		List<String> modules = new ArrayList<>();
		if (program.getSetupSection() != null) {
			for (String module : program.getSetupSection().getModules())
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

		writeProgramAnnotation(program);

		// unit info
		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(program);

		writeSupportFields(callableUnitInfo);

		writeModuleFields(modules, false);

		if (program.getDataSection() != null)
			writeDataFields(program.getDataSection());

		if (program.getFlowSection() != null)
			for (QProcedure procedure: program.getFlowSection().getProcedures())
				writePublicProcedure(procedure);
		
		if (program.getFileSection() != null) {
			writeDataSets(program.getFileSection().getDataSets());
			writeKeyLists(program.getFileSection().getKeyLists());
			writeCursors(program.getFileSection().getCursors());
			writeStatements(program.getFileSection().getStatements());
			writeDisplays(program.getFileSection().getDisplays());
			writePrinters(program.getFileSection().getPrinters());

		}

		writeInit();

		writeEntry(program, modules);

		// labels
		writeLabels(callableUnitInfo.getLabels().keySet(), false, true);

		// prototypes
		if (program.getFlowSection() != null)
			for (QPrototype prototype : program.getFlowSection().getPrototypes())
				writePrototype(prototype);

		// main
		if (program.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("main");
			routine.setMain(program.getMain());
			writeRoutine(routine);
		}

		// routines
		if (program.getFlowSection() != null)
			for (QRoutine routine : program.getFlowSection().getRoutines())
				writeRoutine(routine);

		// procedures
		if (program.getFlowSection() != null)
			for (QProcedure procedure: program.getFlowSection().getProcedures())
				writeInnerProcedure(procedure);

		// datas
		if (program.getDataSection() != null)
			for (QDataTerm<?> dataTerm : program.getDataSection().getDatas())
				writeInnerData(dataTerm, false, true);
	}

	public void writeEntry(QProgram program, List<String> modules) throws IOException {

		if (program.getEntry() != null)
			writeEntry(program.getEntry(), "qEntry");
		else {

			boolean entry = false;
			for (String module : modules) {

				QModule flowModule = getCompilationUnit().getModule(module, true);
				if (flowModule == null)
					throw new IOException("Invalid module: " + module);

				QParameterList parameterList = null;
				for (QParameterList pl : flowModule.getFlowSection().getParameterLists())
					if (pl.getName().equals("*ENTRY")) {
						parameterList = pl;
						entry = true;
						break;
					}

				if (parameterList != null) {
					writeEntry(parameterList, "qEntry");
					entry = true;
					break;
				}
			}
			if (!entry)
				writeEntry(null, "qEntry");
		}
		// scrivo una entry vuota
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

	protected void loadModules(Collection<String> modules, String module) {

		if (!modules.contains(module))
			modules.add(module);

		QModule qModule = getCompilationUnit().getModule(module, true);
		for (String moduleName : qModule.getSetupSection().getModules())
			loadModules(modules, moduleName);
	}
}