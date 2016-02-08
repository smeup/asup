/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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
import org.smeup.sys.dk.compiler.UnitScope;
import org.smeup.sys.il.data.QRecordWrapper;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.os.file.QPrinterFile;
import org.smeup.sys.os.file.QPrinterFileField;
import org.smeup.sys.os.file.QPrinterFileFormat;

public class JDTPrinterFileWriter extends JDTNamedNodeWriter {

	@SuppressWarnings("unchecked")
	public JDTPrinterFileWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name, UnitScope.PUBLIC);

		// writeFieldSerializer();

		if (root != null)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}

	public void writerPrinterFile(QPrinterFile printerFile) throws IOException {

		for (QPrinterFileFormat printerFileFormat : printerFile.getPrinterFormats()) {
			if(printerFileFormat.getName().equals(printerFile.getName()))
				continue;
			writeField(printerFileFormat, false, UnitScope.PUBLIC);
		}

		// Distinct element
		List<QDataTerm<?>> elementsField = new ArrayList<QDataTerm<?>>();
		List<String> elementsName = new ArrayList<String>();
		for (QPrinterFileFormat fileFormat : printerFile.getPrinterFormats()) {
			if(fileFormat.getName().equals(printerFile.getName()))
				continue;
			for(QPrinterFileField field  : fileFormat.getDefinition().getElements())
				if(!elementsName.contains(field.getName())){
					elementsField.add(field);
					elementsName.add(field.getName());
				}
		}
		for (QDataTerm<?> element : elementsField)
			writeField(element, false, UnitScope.PUBLIC);
		
		// Formats
		for (QPrinterFileFormat printerFileFormat : printerFile.getPrinterFormats()) {
			if(printerFileFormat.getName().equals(printerFile.getName()))
				continue;

			List<QDataTerm<?>> elements = new ArrayList<QDataTerm<?>>();
			elements.addAll(printerFileFormat.getDefinition().getElements());

			JDTDataStructureWriter dataStructureWriter = new JDTDataStructureWriter(this, getCompilationUnit(), getCompilationSetup(), printerFileFormat.getName(), QRecordWrapper.class, UnitScope.PUBLIC, true);
			dataStructureWriter.writeElements(elements);
		}

	}
}
