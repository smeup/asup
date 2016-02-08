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

import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.UnitScope;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.esam.annotation.Descend;
import org.smeup.sys.il.esam.annotation.Index;
import org.smeup.sys.os.file.QDatabaseFile;
import org.smeup.sys.os.file.QFileFormatKey;
import org.smeup.sys.os.file.QFileFormatKeyField;

public class JDTDatabaseFileWriter extends JDTDataStructureWriter {

	@SuppressWarnings("unchecked")
	public JDTDatabaseFileWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name, Class<?> superClass) {
		super(root, compilationUnit, compilationSetup, name, superClass, UnitScope.PUBLIC, false);

		if (root != null)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}

	@SuppressWarnings("unchecked")
	public JDTDatabaseFileWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name, String superClassName) {
		super(root, compilationUnit, compilationSetup, name, superClassName, true, UnitScope.PUBLIC, false);

		if (root != null)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}

	public void writeDatabaseFile(QDatabaseFile databaseFile) throws IOException {

		List<QDataTerm<?>> elements = new ArrayList<QDataTerm<?>>();
		elements.addAll(databaseFile.getDatabaseFormat().getDefinition().getElements());

		writeElements(elements);

		writeIndex(databaseFile.getDatabaseFormat().getFormatKey());
	}

	@SuppressWarnings("unchecked")
	public void writeIndex(QFileFormatKey fileFormatKey) {

		if (fileFormatKey == null || fileFormatKey.getKeyFields().isEmpty())
			return;

		EnumDeclaration enumType = getAST().newEnumDeclaration();
		writeAnnotation(enumType, Index.class, "unique", fileFormatKey.isUnique());

		enumType.setName(getAST().newSimpleName("INDEX_COLUMNS"));
		enumType.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		enumType.modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

		// elements
		int num = 0;

		for (QFileFormatKeyField key : fileFormatKey.getKeyFields()) {

			EnumConstantDeclaration constantDeclaration = getAST().newEnumConstantDeclaration();
			constantDeclaration.setName(getAST().newSimpleName(getCompilationUnit().normalizeTermName(key.getName())));

			if (key.isDescend())
				writeAnnotation(constantDeclaration, Descend.class);

			enumType.enumConstants().add(num, constantDeclaration);
			num++;
		}

		getTarget().bodyDeclarations().add(enumType);
	}
}
