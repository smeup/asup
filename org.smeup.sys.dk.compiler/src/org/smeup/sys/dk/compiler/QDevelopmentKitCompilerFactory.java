/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage
 * @generated
 */
public interface QDevelopmentKitCompilerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDevelopmentKitCompilerFactory eINSTANCE = org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Compilation Setup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compilation Setup</em>'.
	 * @generated
	 */
	QCompilationSetup createCompilationSetup();

	/**
	 * Returns a new object of class '<em>Compilation Trash Can</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compilation Trash Can</em>'.
	 * @generated
	 */
	QCompilationTrashCan createCompilationTrashCan();

	/**
	 * Returns a new object of class '<em>Compiler Linker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compiler Linker</em>'.
	 * @generated
	 */
	QCompilerLinker createCompilerLinker();

	/**
	 * Returns a new object of class '<em>Derived</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived</em>'.
	 * @generated
	 */
	QDerived createDerived();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QDevelopmentKitCompilerPackage getDevelopmentKitCompilerPackage();

} //QDevelopmentKitCompilerFactory
