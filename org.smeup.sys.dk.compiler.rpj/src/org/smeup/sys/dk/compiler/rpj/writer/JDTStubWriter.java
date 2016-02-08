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

import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.UnitScope;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.flow.QProgram;

public class JDTStubWriter extends JDTProgramWriter {

	public JDTStubWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name);
	}

	public void writeSkeleton(QProgram program) throws IOException {
		
		writeProgramAnnotation(program);

		writeMessages(program.getMessages());

		writeMain(program.getEntry(), "main");

		if (program.getDataSection() != null)
			for (QDataTerm<?> dataTerm : program.getDataSection().getDatas()) 
				writeInnerDataWithoutErrors(dataTerm, UnitScope.PUBLIC, true);
	}

	private void writeInnerDataWithoutErrors(QDataTerm<?> dataTerm,	UnitScope scope, boolean b) {
		try {
			writeInnerData(dataTerm, UnitScope.PUBLIC, true);			
		} catch (Exception e) {
			System.err.println("Error on " + dataTerm.getName() + ": " + e.getMessage());
		}
	}

}