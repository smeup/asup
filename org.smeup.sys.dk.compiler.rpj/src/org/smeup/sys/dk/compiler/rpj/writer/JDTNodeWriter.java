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
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationUnit;

public class JDTNodeWriter {

	private AST ast;
	private CompilationUnit jdtCompilationUnit;
	private List<String> imports;

	private QCompilationUnit compilationUnit;
	private QCompilationSetup compilationSetup;

	public JDTNodeWriter(JDTNodeWriter root, QCompilationUnit compilationUnit, QCompilationSetup compilationSetup) {

		this.compilationUnit = compilationUnit;
		this.compilationSetup = compilationSetup;
		
		if (root != null) {
			this.ast = root.getAST();
			this.jdtCompilationUnit = root.getJDTCompilationUnit();
			this.imports = root.imports;
		} else {
			this.ast = AST.newAST(AST.JLS8);
			this.jdtCompilationUnit = ast.newCompilationUnit();
			this.imports = new ArrayList<String>();

			// package
			PackageDeclaration packageDeclaration = ast.newPackageDeclaration();
			packageDeclaration.setName(ast.newName(compilationSetup.getBasePackage().split("\\.")));
			this.jdtCompilationUnit.setPackage(packageDeclaration);
		}
	}

	public void writeImport(Class<?> klass) {
		writeImport(klass.getCanonicalName());
	}

	@SuppressWarnings("unchecked")
	public void writeImport(String klassName) {

		if (imports.contains(klassName))
			return;

		ImportDeclaration importDeclaration = getAST().newImportDeclaration();
		importDeclaration.setName(getAST().newName(klassName.split("\\.")));
		getJDTCompilationUnit().imports().add(importDeclaration);

		imports.add(klassName);
	}

	public QCompilationSetup getCompilationSetup() {
		return this.compilationSetup;
	}

	public QCompilationUnit getCompilationUnit() {
		return this.compilationUnit;
	}

	public AST getAST() {
		return this.ast;
	}

	public CompilationUnit getJDTCompilationUnit() {
		return this.jdtCompilationUnit;
	}

	public void writeOutputStream(OutputStream outputStream) throws IOException {
		// write file output
		byte[] contentInBytes = getJDTCompilationUnit().toString().getBytes();

		outputStream.write(contentInBytes);
		outputStream.flush();
		outputStream.close();
	}
}