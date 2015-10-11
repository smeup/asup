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
import java.io.Serializable;
import java.util.List;

import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Type;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.UnitScope;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.term.QDataTerm;

public class JDTDataStructureWriter extends JDTNamedNodeWriter {

	@SuppressWarnings("unchecked")
	public JDTDataStructureWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name, String superClassName, boolean serializable,
			UnitScope scope, boolean static_) {
		super(root, compilationUnit, compilationSetup, name, scope);

		if (superClassName != null) {
			writeImport(compilationSetup.getBasePackage() + "." + superClassName);

			// super type
			Type superType = getAST().newSimpleType(getAST().newName(superClassName));
			getTarget().setSuperclassType(superType);

			// serializable
			if (serializable)
				writeFieldSerializer();
		}

		if (static_)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}

	@SuppressWarnings("unchecked")
	public JDTDataStructureWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name, Class<?> superClass, UnitScope scope, boolean static_) {
		super(root, compilationUnit, compilationSetup, name, scope);

		if (superClass != null) {
			writeImport(superClass);

			// super type
			Type superType = getAST().newSimpleType(getAST().newName(superClass.getSimpleName()));
			getTarget().setSuperclassType(superType);

			// serializable
			if (Serializable.class.isAssignableFrom(superClass))
				writeFieldSerializer();

		}

		if (static_)
			getTarget().modifiers().add(getAST().newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	}

	public void writeDataStructure(QCompoundDataDef<?, QDataTerm<?>> dataPart) throws IOException {

		writeElements(dataPart.getElements());

	}

	public void writeElements(List<QDataTerm<?>> elements) throws IOException {

		// fields
		for (QDataTerm<?> element : elements)
			writePublicField(element, false);

		// elements
		for (QDataTerm<?> element : elements)
			writeInnerData(element, UnitScope.PUBLIC, true);
	}

}
