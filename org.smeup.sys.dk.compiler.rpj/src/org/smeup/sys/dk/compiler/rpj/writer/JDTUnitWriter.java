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

import javax.inject.Inject;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.UnitScope;
import org.smeup.sys.dk.compiler.rpj.RPJCallableUnitInfo;
import org.smeup.sys.dk.compiler.rpj.RPJExpressionNormalizer;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QUnit;
import org.smeup.sys.os.pgm.rpj.RPJCommandSupport;
import org.smeup.sys.os.pgm.rpj.RPJDatabaseSupport;
import org.smeup.sys.os.pgm.rpj.RPJProcedureSupport;
import org.smeup.sys.os.pgm.rpj.RPJProgramSupport;

public abstract class JDTUnitWriter extends JDTNamedNodeWriter {

	public JDTUnitWriter(JDTNamedNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup, String name, UnitScope scope) {
		super(root, compilationUnit, compilationSetup, name, scope);
	}

	@SuppressWarnings("unchecked")
	public void writeSuppressWarning(BodyDeclaration target) {

		AST ast = target.getAST();

		NormalAnnotation annotation = ast.newNormalAnnotation();
		annotation.setTypeName(ast.newSimpleName(SuppressWarnings.class.getSimpleName()));

		MemberValuePair memberValuePair = ast.newMemberValuePair();
		memberValuePair.setName(ast.newSimpleName("value"));
		StringLiteral stringLiteral = ast.newStringLiteral();
		stringLiteral.setLiteralValue("static-access");
		memberValuePair.setValue(stringLiteral);
		annotation.values().add(memberValuePair);
		target.modifiers().add(annotation);

	}

	@SuppressWarnings("unchecked")
	public void writeSupportFields(RPJCallableUnitInfo callableUnitInfo) {

		writeImport(QData.class);
		
		VariableDeclarationFragment variable = getAST().newVariableDeclarationFragment();
		FieldDeclaration field = getAST().newFieldDeclaration(variable);

		writeAnnotation(field, Inject.class);
		field.modifiers().add(getAST().newModifier(ModifierKeyword.PRIVATE_KEYWORD));

		if(getCompilationUnit().getNode() instanceof QProcedure) {
			field.setType(getAST().newSimpleType(getAST().newName(RPJProcedureSupport.class.getSimpleName())));
			variable.setName(getAST().newSimpleName("qPRO"));	
		}
		else {
			field.setType(getAST().newSimpleType(getAST().newName(RPJProgramSupport.class.getSimpleName())));
			variable.setName(getAST().newSimpleName("qRPJ"));
		}
		getTarget().bodyDeclarations().add(field);
		
		
		// *CMD
		if (callableUnitInfo.containsCMDStatement()) {
			writeImport(RPJCommandSupport.class);

			variable = getAST().newVariableDeclarationFragment();
			field = getAST().newFieldDeclaration(variable);

			writeAnnotation(field, Inject.class);

			field.modifiers().add(getAST().newModifier(ModifierKeyword.PRIVATE_KEYWORD));
			field.setType(getAST().newSimpleType(getAST().newName(RPJCommandSupport.class.getSimpleName())));
			variable.setName(getAST().newSimpleName("qCMD"));
			getTarget().bodyDeclarations().add(field);

		}

		// *SQL
		if (callableUnitInfo.containsSQLStatement()) {
			writeImport(RPJDatabaseSupport.class);

			variable = getAST().newVariableDeclarationFragment();
			field = getAST().newFieldDeclaration(variable);

			// writeAnnotation(field, ModuleDef.class, "name", "*SQL");
			writeAnnotation(field, Inject.class);
			// writeAnnotation(field, Named.class, "value", "*SQL");

			field.modifiers().add(getAST().newModifier(ModifierKeyword.PRIVATE_KEYWORD));
			field.setType(getAST().newSimpleType(getAST().newName(RPJDatabaseSupport.class.getSimpleName())));
			variable.setName(getAST().newSimpleName("qSQL"));
			getTarget().bodyDeclarations().add(field);

		}

/*		String name = getCompilationUnit().getRoot().getName();
		if (name.equalsIgnoreCase("£J03")) {
			writeImport(RPJServiceSupport.class);

			variable = getAST().newVariableDeclarationFragment();
			field = getAST().newFieldDeclaration(variable);

			// writeAnnotation(field, ModuleDef.class, "name", "*JAX");
			writeAnnotation(field, Inject.class);
			// writeAnnotation(field, Named.class, "value", "*JAX");

			field.modifiers().add(getAST().newModifier(ModifierKeyword.PUBLIC_KEYWORD));
			field.setType(getAST().newSimpleType(getAST().newName(RPJServiceSupport.class.getSimpleName())));
			variable.setName(getAST().newSimpleName("qJAX"));
			getTarget().bodyDeclarations().add(field);
		}*/
	}

	public void refactUnit(QUnit unit) {

		RPJExpressionNormalizer expressionNormalizer = getCompilationUnit().getContext().make(RPJExpressionNormalizer.class);
		
		// main
		if (unit.getMain() != null)
			unit.getMain().accept(expressionNormalizer);
	}
}