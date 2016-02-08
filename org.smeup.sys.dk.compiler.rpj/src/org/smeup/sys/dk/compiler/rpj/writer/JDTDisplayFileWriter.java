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

import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.UnitScope;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.esam.QDisplayFormatWrapper;
import org.smeup.sys.os.file.QDisplayFile;
import org.smeup.sys.os.file.QDisplayFileField;
import org.smeup.sys.os.file.QDisplayFileFormat;
import org.smeup.sys.os.file.QFileFormat;

public class JDTDisplayFileWriter extends JDTNamedNodeWriter {

	@SuppressWarnings("unchecked")
	public JDTDisplayFileWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name, UnitScope.PUBLIC);

		// writeFieldSerializer();

		if (root != null)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}

	@SuppressWarnings({"unchecked" })
	public void writeDisplayFile(QDisplayFile displayFile) throws IOException {

		// Distinct element
		List<QDataTerm<?>> elementsField = new ArrayList<QDataTerm<?>>();
		List<String> elementsName = new ArrayList<String>();
		for (QDisplayFileFormat fileFormat : displayFile.getDisplayFormats()) {
			if (fileFormat.getName().equals(displayFile.getName()))
				continue;

			for (QDisplayFileField field : fileFormat.getDefinition().getElements())
				if (!elementsName.contains(field.getName())) {
					elementsField.add(field);
					elementsName.add(field.getName());
				}
		}
		for (QDataTerm<?> element : elementsField)
			writeField(element, false, UnitScope.PUBLIC);

		// Formats
		for (QDisplayFileFormat fileFormat : displayFile.getDisplayFormats()) {
			if (fileFormat.getName().equals(displayFile.getName()))
				continue;
			
			writeFormatField(fileFormat);
		}
		
		for (QDisplayFileFormat fileFormat : displayFile.getDisplayFormats()) {
			if (fileFormat.getName().equals(displayFile.getName()))
				continue;

			EnumDeclaration enumType = getAST().newEnumDeclaration();
			enumType.setName(getAST().newSimpleName(getCompilationUnit().normalizeTypeName(fileFormat.getName()).toUpperCase()));
			writeInnerEnum(enumType, fileFormat, true);

			getTarget().bodyDeclarations().add(enumType);
		}

	}
	
	@SuppressWarnings("unchecked")
	public void writeFormatField(QFileFormat<?> fileFormat) {

		VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
		variable.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(fileFormat.getName())));
		FieldDeclaration field = getAST().newFieldDeclaration(variable);
		field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		Type type = getAST().newSimpleType(getAST().newSimpleName(QDisplayFormatWrapper.class.getSimpleName()));
		ParameterizedType parType = getAST().newParameterizedType(type);

		String argument = fileFormat.getName();
		parType.typeArguments().add(getAST().newSimpleType(getAST().newSimpleName(argument)));

		
		field.setType(parType);

		getTarget().bodyDeclarations().add(field);
	}
}
