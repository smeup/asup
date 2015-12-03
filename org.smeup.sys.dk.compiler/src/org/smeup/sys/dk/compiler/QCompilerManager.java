/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler;

import java.io.IOException;
import java.io.OutputStream;

import org.smeup.sys.il.flow.QModule;
import org.smeup.sys.il.flow.QProcedure;
import org.smeup.sys.il.flow.QProgram;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage#getCompilerManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QCompilerManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" masterRequired="true" procedureRequired="true"
	 * @generated
	 */
	QCompilationUnit createChildCompilationUnit(QCompilationUnit master, QProcedure procedure);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" caseSensitiveRequired="true"
	 * @generated
	 */
	QCompilationUnit createCompilationUnit(QJob job, QFile file, CaseSensitiveType caseSensitive);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" moduleRequired="true" caseSensitiveRequired="true"
	 * @generated
	 */
	QCompilationUnit createCompilationUnit(QJob job, QModule module, CaseSensitiveType caseSensitive);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" jobRequired="true" programRequired="true" caseSensitiveRequired="true"
	 * @generated
	 */
	QCompilationUnit createCompilationUnit(QJob job, QProgram program, CaseSensitiveType caseSensitive);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model compilationUnitRequired="true"
	 * @generated
	 */
	void linkCompilationUnit(QCompilationUnit compilationUnit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.mi.core.JavaIOException" compilationUnitRequired="true" outputDataType="org.smeup.sys.mi.core.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writeDatabaseFile(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.mi.core.JavaIOException" compilationUnitRequired="true" outputDataType="org.smeup.sys.mi.core.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writeDisplayFile(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.mi.core.JavaIOException" compilationUnitRequired="true" outputDataType="org.smeup.sys.mi.core.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writeModule(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.mi.core.JavaIOException" compilationUnitRequired="true" outputDataType="org.smeup.sys.mi.core.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writePrinterFile(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.mi.core.JavaIOException" compilationUnitRequired="true" outputDataType="org.smeup.sys.mi.core.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writeProgram(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.mi.core.JavaIOException" compilationUnitRequired="true" outputDataType="org.smeup.sys.mi.core.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writeProgramTest(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.mi.core.JavaIOException" compilationUnitRequired="true" outputDataType="org.smeup.sys.mi.core.JavaOutputStream" outputRequired="true"
	 * @generated
	 */
	void writeStub(QCompilationUnit compilationUnit, QCompilationSetup setup, OutputStream output) throws IOException;

} // QCompilerManager
