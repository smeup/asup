/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler.anz.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage;
import org.smeup.sys.dk.compiler.anz.QDevelopmentKitCompilerAnalyzerFactory;
import org.smeup.sys.dk.compiler.anz.QDevelopmentKitCompilerAnalyzerPackage;
import org.smeup.sys.dk.compiler.anz.QProgramAnalisys;
import org.smeup.sys.dk.compiler.anz.QVariableRef;
import org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage;
import org.smeup.sys.os.file.QOperatingSystemFilePackage;
import org.smeup.sys.os.module.QOperatingSystemModulePackage;
import org.smeup.sys.os.pgm.QOperatingSystemProgramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevelopmentKitCompilerAnalyzerPackageImpl extends EPackageImpl implements QDevelopmentKitCompilerAnalyzerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programAnalisysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableRefEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.smeup.sys.dk.compiler.anz.QDevelopmentKitCompilerAnalyzerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DevelopmentKitCompilerAnalyzerPackageImpl() {
		super(eNS_URI, QDevelopmentKitCompilerAnalyzerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QDevelopmentKitCompilerAnalyzerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDevelopmentKitCompilerAnalyzerPackage init() {
		if (isInited) return (QDevelopmentKitCompilerAnalyzerPackage)EPackage.Registry.INSTANCE.getEPackage(QDevelopmentKitCompilerAnalyzerPackage.eNS_URI);

		// Obtain or create and register package
		DevelopmentKitCompilerAnalyzerPackageImpl theDevelopmentKitCompilerAnalyzerPackage = (DevelopmentKitCompilerAnalyzerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DevelopmentKitCompilerAnalyzerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DevelopmentKitCompilerAnalyzerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageFlowPackage.eINSTANCE.eClass();
		QOperatingSystemFilePackage.eINSTANCE.eClass();
		QOperatingSystemModulePackage.eINSTANCE.eClass();
		QOperatingSystemProgramPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DevelopmentKitCompilerPackageImpl theDevelopmentKitCompilerPackage = (DevelopmentKitCompilerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QDevelopmentKitCompilerPackage.eNS_URI) instanceof DevelopmentKitCompilerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QDevelopmentKitCompilerPackage.eNS_URI) : QDevelopmentKitCompilerPackage.eINSTANCE);

		// Create package meta-data objects
		theDevelopmentKitCompilerAnalyzerPackage.createPackageContents();
		theDevelopmentKitCompilerPackage.createPackageContents();

		// Initialize created meta-data
		theDevelopmentKitCompilerAnalyzerPackage.initializePackageContents();
		theDevelopmentKitCompilerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDevelopmentKitCompilerAnalyzerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDevelopmentKitCompilerAnalyzerPackage.eNS_URI, theDevelopmentKitCompilerAnalyzerPackage);
		return theDevelopmentKitCompilerAnalyzerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramAnalisys() {
		return programAnalisysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramAnalisys_Variables() {
		return (EReference)programAnalisysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableRef() {
		return variableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableRef_VariableName() {
		return (EAttribute)variableRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableRef_Occurences() {
		return (EAttribute)variableRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableRef_Statements() {
		return (EAttribute)variableRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDevelopmentKitCompilerAnalyzerFactory getDevelopmentKitCompilerAnalyzerFactory() {
		return (QDevelopmentKitCompilerAnalyzerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		programAnalisysEClass = createEClass(PROGRAM_ANALISYS);
		createEReference(programAnalisysEClass, PROGRAM_ANALISYS__VARIABLES);

		variableRefEClass = createEClass(VARIABLE_REF);
		createEAttribute(variableRefEClass, VARIABLE_REF__VARIABLE_NAME);
		createEAttribute(variableRefEClass, VARIABLE_REF__OCCURENCES);
		createEAttribute(variableRefEClass, VARIABLE_REF__STATEMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(programAnalisysEClass, QProgramAnalisys.class, "ProgramAnalisys", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramAnalisys_Variables(), this.getVariableRef(), null, "variables", null, 0, -1, QProgramAnalisys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableRefEClass, QVariableRef.class, "VariableRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableRef_VariableName(), ecorePackage.getEString(), "variableName", null, 1, 1, QVariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableRef_Occurences(), ecorePackage.getEInt(), "occurences", null, 1, 1, QVariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableRef_Statements(), ecorePackage.getEString(), "statements", null, 0, -1, QVariableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DevelopmentKitCompilerAnalyzerPackageImpl
