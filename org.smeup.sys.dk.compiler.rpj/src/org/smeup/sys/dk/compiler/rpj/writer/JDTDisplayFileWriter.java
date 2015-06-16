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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.Modifier;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.os.file.QDisplayFile;
import org.smeup.sys.os.file.QFileFormat;

public class JDTDisplayFileWriter extends JDTNamedNodeWriter {

	@SuppressWarnings("unchecked")
	public JDTDisplayFileWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name);

		// writeFieldSerializer();

		if (root != null)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}

	public void writeDisplayFile(QDisplayFile displayFile) throws IOException {

		for (QFileFormat<?> fileFormat : displayFile.getDisplayFormats()) {


			List<QDataTerm<?>> elements = new ArrayList<QDataTerm<?>>();
			elements.add(fileFormat);

			JDTDataStructureWriter dataStructureWriter = new JDTDataStructureWriter(this, getCompilationUnit(), getCompilationSetup(), fileFormat.getName(), QDataStructWrapper.class, true);
			dataStructureWriter.writeElements(elements);
		}

	}
}
