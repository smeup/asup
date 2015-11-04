/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler.anz;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.dk.compiler.anz.QDevelopmentKitCompilerAnalyzerFactory
 * @model kind="package"
 * @generated
 */
public interface QDevelopmentKitCompilerAnalyzerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "anz";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/dk/compiler/anz";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dk-compiler-anz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDevelopmentKitCompilerAnalyzerPackage eINSTANCE = org.smeup.sys.dk.compiler.anz.impl.DevelopmentKitCompilerAnalyzerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.compiler.anz.impl.ProgramAnalisysImpl <em>Program Analisys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.compiler.anz.impl.ProgramAnalisysImpl
	 * @see org.smeup.sys.dk.compiler.anz.impl.DevelopmentKitCompilerAnalyzerPackageImpl#getProgramAnalisys()
	 * @generated
	 */
	int PROGRAM_ANALISYS = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ANALISYS__VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Program Analisys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ANALISYS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.compiler.anz.impl.VariableRefImpl <em>Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.compiler.anz.impl.VariableRefImpl
	 * @see org.smeup.sys.dk.compiler.anz.impl.DevelopmentKitCompilerAnalyzerPackageImpl#getVariableRef()
	 * @generated
	 */
	int VARIABLE_REF = 1;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__VARIABLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Occourence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__OCCOURENCE = 1;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__METHODS = 2;

	/**
	 * The number of structural features of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.compiler.anz.QProgramAnalisys <em>Program Analisys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Analisys</em>'.
	 * @see org.smeup.sys.dk.compiler.anz.QProgramAnalisys
	 * @generated
	 */
	EClass getProgramAnalisys();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.dk.compiler.anz.QProgramAnalisys#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.smeup.sys.dk.compiler.anz.QProgramAnalisys#getVariables()
	 * @see #getProgramAnalisys()
	 * @generated
	 */
	EReference getProgramAnalisys_Variables();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.compiler.anz.QVariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref</em>'.
	 * @see org.smeup.sys.dk.compiler.anz.QVariableRef
	 * @generated
	 */
	EClass getVariableRef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.dk.compiler.anz.QVariableRef#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see org.smeup.sys.dk.compiler.anz.QVariableRef#getVariableName()
	 * @see #getVariableRef()
	 * @generated
	 */
	EAttribute getVariableRef_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.dk.compiler.anz.QVariableRef#getOccourence <em>Occourence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occourence</em>'.
	 * @see org.smeup.sys.dk.compiler.anz.QVariableRef#getOccourence()
	 * @see #getVariableRef()
	 * @generated
	 */
	EAttribute getVariableRef_Occourence();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.dk.compiler.anz.QVariableRef#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Methods</em>'.
	 * @see org.smeup.sys.dk.compiler.anz.QVariableRef#getMethods()
	 * @see #getVariableRef()
	 * @generated
	 */
	EAttribute getVariableRef_Methods();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDevelopmentKitCompilerAnalyzerFactory getDevelopmentKitCompilerAnalyzerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.compiler.anz.impl.ProgramAnalisysImpl <em>Program Analisys</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.compiler.anz.impl.ProgramAnalisysImpl
		 * @see org.smeup.sys.dk.compiler.anz.impl.DevelopmentKitCompilerAnalyzerPackageImpl#getProgramAnalisys()
		 * @generated
		 */
		EClass PROGRAM_ANALISYS = eINSTANCE.getProgramAnalisys();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_ANALISYS__VARIABLES = eINSTANCE.getProgramAnalisys_Variables();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.compiler.anz.impl.VariableRefImpl <em>Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.compiler.anz.impl.VariableRefImpl
		 * @see org.smeup.sys.dk.compiler.anz.impl.DevelopmentKitCompilerAnalyzerPackageImpl#getVariableRef()
		 * @generated
		 */
		EClass VARIABLE_REF = eINSTANCE.getVariableRef();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_REF__VARIABLE_NAME = eINSTANCE.getVariableRef_VariableName();

		/**
		 * The meta object literal for the '<em><b>Occourence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_REF__OCCOURENCE = eINSTANCE.getVariableRef_Occourence();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_REF__METHODS = eINSTANCE.getVariableRef_Methods();

	}

} //QDevelopmentKitCompilerAnalyzerPackage
