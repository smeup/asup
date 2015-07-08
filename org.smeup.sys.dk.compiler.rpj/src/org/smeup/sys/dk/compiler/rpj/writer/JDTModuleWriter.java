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

import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerLinker;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitAnalyzer;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitInfo;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowFactory;
import org.smeup.sys.il.flow.QModule;
import org.smeup.sys.il.flow.QPrototype;
import org.smeup.sys.il.flow.QRoutine;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;

public class JDTModuleWriter extends JDTCallableUnitWriter {

	public JDTModuleWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name);

		writeImport(OperatingSystemRuntimeException.class);
	}

	public void writeModule(QModule module) throws IOException {

		// refactoring callable unit
		refactCallableUnit(module);

		// analyze callable unit
		RPJCallableUnitInfo callableUnitInfo = RPJCallableUnitAnalyzer.analyzeCallableUnit(module);

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

		/*
		 * for (String childModule : module.getSetupSection().getModules()) {
		 * writeImport(childModule); }
		 */

		writeSupportFields(callableUnitInfo);

		writeModuleFields(module.getSetupSection().getModules(), false);

		if (module.getFileSection() != null)
			writeDataSets(module.getFileSection().getDataSets());

		if (module.getDataSection() != null)
			writeDataFields(module.getDataSection());

		if (module.getFileSection() != null)
			writeKeyLists(module.getFileSection().getKeyLists());

		if (module.getFileSection() != null)
			writeDisplays(module.getFileSection().getDisplays());

		if (module.getFileSection() != null)
			writePrinters(module.getFileSection().getPrinters());

		// labels
		writeLabels(callableUnitInfo.getLabels().keySet());

		// main
		if (module.getMain() != null) {
			QRoutine routine = QIntegratedLanguageFlowFactory.eINSTANCE.createRoutine();
			routine.setName("main");
			routine.setMain(module.getMain());

			writeRoutine(routine);
		}

		// functions
		if (module.getFlowSection() != null) {

			// routines
			for (QRoutine routine : module.getFlowSection().getRoutines())
				writeRoutine(routine);

			// prototype
			for (QPrototype prototype : module.getFlowSection().getPrototypes())
				writePrototype(prototype);
		}

		if (module.getDataSection() != null)
			for (QDataTerm<?> dataTerm : module.getDataSection().getDatas())
				writeInnerTerm(dataTerm);
	}
}