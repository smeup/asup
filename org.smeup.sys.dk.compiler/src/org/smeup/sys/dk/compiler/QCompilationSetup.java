/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Context Setup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.dk.compiler.QCompilationSetup#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.smeup.sys.dk.compiler.QCompilationSetup#getEntryType <em>Entry Type</em>}</li>
 *   <li>{@link org.smeup.sys.dk.compiler.QCompilationSetup#getOptimizationType <em>Optimization Type</em>}</li>
 *   <li>{@link org.smeup.sys.dk.compiler.QCompilationSetup#getProcedureType <em>Procedure Type</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage#getCompilationSetup()
 * @model
 * @generated
 */
public interface QCompilationSetup {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage#getCompilationSetup_BasePackage()
	 * @model
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link org.smeup.sys.dk.compiler.QCompilationSetup#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Entry Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.dk.compiler.EntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Type</em>' attribute.
	 * @see org.smeup.sys.dk.compiler.EntryType
	 * @see #setEntryType(EntryType)
	 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage#getCompilationSetup_EntryType()
	 * @model
	 * @generated
	 */
	EntryType getEntryType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.dk.compiler.QCompilationSetup#getEntryType <em>Entry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Type</em>' attribute.
	 * @see org.smeup.sys.dk.compiler.EntryType
	 * @see #getEntryType()
	 * @generated
	 */
	void setEntryType(EntryType value);

	/**
	 * Returns the value of the '<em><b>Optimization Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.dk.compiler.OptimizationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimization Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimization Type</em>' attribute.
	 * @see org.smeup.sys.dk.compiler.OptimizationType
	 * @see #setOptimizationType(OptimizationType)
	 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage#getCompilationSetup_OptimizationType()
	 * @model
	 * @generated
	 */
	OptimizationType getOptimizationType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.dk.compiler.QCompilationSetup#getOptimizationType <em>Optimization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimization Type</em>' attribute.
	 * @see org.smeup.sys.dk.compiler.OptimizationType
	 * @see #getOptimizationType()
	 * @generated
	 */
	void setOptimizationType(OptimizationType value);

	/**
	 * Returns the value of the '<em><b>Procedure Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.dk.compiler.InternalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Type</em>' attribute.
	 * @see org.smeup.sys.dk.compiler.InternalType
	 * @see #setProcedureType(InternalType)
	 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage#getCompilationSetup_ProcedureType()
	 * @model
	 * @generated
	 */
	InternalType getProcedureType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.dk.compiler.QCompilationSetup#getProcedureType <em>Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Type</em>' attribute.
	 * @see org.smeup.sys.dk.compiler.InternalType
	 * @see #getProcedureType()
	 * @generated
	 */
	void setProcedureType(InternalType value);

} // QCompilationSetup
