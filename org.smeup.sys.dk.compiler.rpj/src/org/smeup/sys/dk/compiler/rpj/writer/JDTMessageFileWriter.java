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

import java.util.List;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.UnitScope;
import org.smeup.sys.os.msgf.QMessageDescription;
import org.smeup.sys.os.msgf.QMessageFile;

public class JDTMessageFileWriter extends JDTNamedNodeWriter {

	public JDTMessageFileWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name) {
		super(root, compilationUnit, compilationSetup, name, UnitScope.PUBLIC);
	}

	@SuppressWarnings("unchecked")
	public void writeMessageFile(QMessageFile messageFile) {
		EnumDeclaration enumDeclaration = buildEnumDeclaration(getAST(), messageFile.getName(), messageFile.getMessages());
		getJDTCompilationUnit().types().add(enumDeclaration);
	}

	@SuppressWarnings("unchecked")
	private EnumDeclaration buildEnumDeclaration(AST ast, String name, List<QMessageDescription> messageDescriptions) {

		// write AST
		EnumDeclaration enumDeclaration = ast.newEnumDeclaration();
		enumDeclaration.setName(ast.newSimpleName(name));

		enumDeclaration.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));

		for (QMessageDescription messageDescription : messageDescriptions) {
			EnumConstantDeclaration constantDeclaration = ast.newEnumConstantDeclaration();
			constantDeclaration.setName(ast.newSimpleName(messageDescription.getName()));
			enumDeclaration.enumConstants().add(constantDeclaration);

			/*
			 * Javadoc javadoc = ast.newJavadoc(); TagElement tag =
			 * javadoc.getAST().newTagElement(); TextElement textElement =
			 * javadoc.getAST().newTextElement();
			 * textElement.setText(messageDescription.getMessageText());
			 * tag.fragments().add(textElement); javadoc.tags().add(tag);
			 * 
			 * constantDeclaration.setJavadoc(javadoc);
			 */
		}

		return enumDeclaration;
	}
}
