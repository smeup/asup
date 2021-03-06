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

import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.Type;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerLinker;
import org.smeup.sys.dk.compiler.UnitScope;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitAnalyzer;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitInfo;
import org.smeup.sys.il.data.annotation.Module;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.flow.QModule;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.pgm.rpj.RPJModule;
import org.smeup.sys.os.pgm.rpj.RPJProgramSupport;

public class JDTModuleWriter extends JDTCallableUnitWriter {

	public JDTModuleWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name, UnitScope.PUBLIC);

		// super type
		Type superType = getAST().newSimpleType(getAST().newSimpleName(RPJModule.class.getSimpleName()));
		getTarget().setSuperclassType(superType);

		writeFieldSerializer();

		writeImport(RPJModule.class);
		writeImport(Module.class);
		writeImport(RPJProgramSupport.class);
		writeImport(OperatingSystemRuntimeException.class);
	}

	public void writeModule(QModule module) throws IOException {

		refactCallableUnit(module);

		// modules
		for (String childModule : module.getSetupSection().getModules()) {

			QModule flowModule = getCompilationUnit().getModule(childModule, true);
			if (flowModule == null)
				throw new IOException("Invalid module: " + module);

			QCompilerLinker compilerLinker = flowModule.getFacet(QCompilerLinker.class);
			if (compilerLinker != null)
				writeImport(compilerLinker.getLinkedClass());
			else
				writeImport(childModule);
		}

		writeModuleAnnotation(module);

		// unit info
		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(getCompilationUnit(), module);

		writeSupportFields(callableUnitInfo);

		writeModuleFields(module.getSetupSection().getModules(), UnitScope.PRIVATE);

		if (module.getFileSection() != null) {
			writeDataSets(module.getFileSection().getDataSets());
			writeKeyLists(module.getFileSection().getKeyLists());
			writeStatements(module.getFileSection().getStatements());
			writeCursors(module.getFileSection().getCursors());
			writeDisplays(module.getFileSection().getDisplays());
			writePrinters(module.getFileSection().getPrinters());
		}

		if (module.getDataSection() != null)
			writeDataFields(module.getDataSection(), UnitScope.PUBLIC);

		if (module.getFlowSection() != null)
			for (QProcedure procedure: module.getFlowSection().getProcedures())
				writePublicProcedure(procedure);
		
		writeInit();
		
		// prototypes
		if (module.getFlowSection() != null)
			for (QPrototype prototype : module.getFlowSection().getPrototypes())
				writePrototype(prototype);

		// labels
		writeLabels(callableUnitInfo.getLabels().keySet(), false, true);

		// routines
		writeRoutines(module, callableUnitInfo);

		// procedures
		if (module.getFlowSection() != null)
			for (QProcedure procedure: module.getFlowSection().getProcedures())
				writeInnerProcedure(procedure);
		
		// datas
		if (module.getDataSection() != null)
			for (QDataTerm<?> dataTerm : module.getDataSection().getDatas())
				writeInnerData(dataTerm, UnitScope.PUBLIC, true);
	}
	
	@SuppressWarnings("unchecked")
	public void writeModuleAnnotation(QModule module) {

		// @Module(name=)
		NormalAnnotation moduleAnnotation = getAST().newNormalAnnotation();
		moduleAnnotation.setTypeName(getAST().newSimpleName(Module.class.getSimpleName()));
		MemberValuePair memberValuePair = getAST().newMemberValuePair();
		memberValuePair.setName(getAST().newSimpleName("name"));
		StringLiteral stringLiteral = getAST().newStringLiteral();
		stringLiteral.setLiteralValue(module.getName());
		memberValuePair.setValue(stringLiteral);
		moduleAnnotation.values().add(memberValuePair);

		getTarget().modifiers().add(0, moduleAnnotation);
	}
}