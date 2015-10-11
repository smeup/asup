/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.db.esql.QIntegratedLanguageEmbeddedSQLPackage;
import org.smeup.sys.dk.compiler.CaseSensitiveType;
import org.smeup.sys.dk.compiler.EntryType;
import org.smeup.sys.dk.compiler.InternalType;
import org.smeup.sys.dk.compiler.QCompilationSetup;
import org.smeup.sys.dk.compiler.QCompilationTrashCan;
import org.smeup.sys.dk.compiler.QCompilationUnit;
import org.smeup.sys.dk.compiler.QCompilerLinker;
import org.smeup.sys.dk.compiler.QCompilerManager;
import org.smeup.sys.dk.compiler.QDevelopmentKitCompilerFactory;
import org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage;
import org.smeup.sys.dk.compiler.QUnitConverter;
import org.smeup.sys.dk.compiler.QUnitConverterRegistry;
import org.smeup.sys.dk.compiler.UnitScope;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.java.QIntegratedLanguageCoreJavaPackage;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;
import org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage;
import org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage;
import org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage;
import org.smeup.sys.os.file.QOperatingSystemFilePackage;
import org.smeup.sys.os.module.QOperatingSystemModulePackage;
import org.smeup.sys.os.pgm.QOperatingSystemProgramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevelopmentKitCompilerPackageImpl extends EPackageImpl implements QDevelopmentKitCompilerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationTrashCanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilerManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitConverterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitConverterRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilerLinkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum internalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum caseSensitiveTypeEEnum = null;

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
	 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DevelopmentKitCompilerPackageImpl() {
		super(eNS_URI, QDevelopmentKitCompilerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QDevelopmentKitCompilerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QDevelopmentKitCompilerPackage init() {
		if (isInited) return (QDevelopmentKitCompilerPackage)EPackage.Registry.INSTANCE.getEPackage(QDevelopmentKitCompilerPackage.eNS_URI);

		// Obtain or create and register package
		DevelopmentKitCompilerPackageImpl theDevelopmentKitCompilerPackage = (DevelopmentKitCompilerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DevelopmentKitCompilerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DevelopmentKitCompilerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageFlowPackage.eINSTANCE.eClass();
		QOperatingSystemFilePackage.eINSTANCE.eClass();
		QOperatingSystemModulePackage.eINSTANCE.eClass();
		QOperatingSystemProgramPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDevelopmentKitCompilerPackage.createPackageContents();

		// Initialize created meta-data
		theDevelopmentKitCompilerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDevelopmentKitCompilerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QDevelopmentKitCompilerPackage.eNS_URI, theDevelopmentKitCompilerPackage);
		return theDevelopmentKitCompilerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompilationUnit() {
		return compilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_TrashCan() {
		return (EReference)compilationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompilationSetup() {
		return compilationSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompilationSetup_BasePackage() {
		return (EAttribute)compilationSetupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompilationSetup_EntryType() {
		return (EAttribute)compilationSetupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompilationSetup_ProcedureType() {
		return (EAttribute)compilationSetupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompilationTrashCan() {
		return compilationTrashCanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompilationTrashCan_DataTerms() {
		return (EReference)compilationTrashCanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompilerManager() {
		return compilerManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitConverter() {
		return unitConverterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitConverterRegistry() {
		return unitConverterRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompilerLinker() {
		return compilerLinkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompilerLinker_LinkedClass() {
		return (EAttribute)compilerLinkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEntryType() {
		return entryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInternalType() {
		return internalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitScope() {
		return unitScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCaseSensitiveType() {
		return caseSensitiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDevelopmentKitCompilerFactory getDevelopmentKitCompilerFactory() {
		return (QDevelopmentKitCompilerFactory)getEFactoryInstance();
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
		compilationUnitEClass = createEClass(COMPILATION_UNIT);
		createEReference(compilationUnitEClass, COMPILATION_UNIT__TRASH_CAN);

		compilationSetupEClass = createEClass(COMPILATION_SETUP);
		createEAttribute(compilationSetupEClass, COMPILATION_SETUP__BASE_PACKAGE);
		createEAttribute(compilationSetupEClass, COMPILATION_SETUP__ENTRY_TYPE);
		createEAttribute(compilationSetupEClass, COMPILATION_SETUP__PROCEDURE_TYPE);

		compilationTrashCanEClass = createEClass(COMPILATION_TRASH_CAN);
		createEReference(compilationTrashCanEClass, COMPILATION_TRASH_CAN__DATA_TERMS);

		compilerLinkerEClass = createEClass(COMPILER_LINKER);
		createEAttribute(compilerLinkerEClass, COMPILER_LINKER__LINKED_CLASS);

		compilerManagerEClass = createEClass(COMPILER_MANAGER);

		unitConverterEClass = createEClass(UNIT_CONVERTER);

		unitConverterRegistryEClass = createEClass(UNIT_CONVERTER_REGISTRY);

		// Create enums
		caseSensitiveTypeEEnum = createEEnum(CASE_SENSITIVE_TYPE);
		entryTypeEEnum = createEEnum(ENTRY_TYPE);
		internalTypeEEnum = createEEnum(INTERNAL_TYPE);
		unitScopeEEnum = createEEnum(UNIT_SCOPE);
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

		// Obtain other dependent packages
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);
		QIntegratedLanguageEmbeddedSQLPackage theIntegratedLanguageEmbeddedSQLPackage = (QIntegratedLanguageEmbeddedSQLPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageEmbeddedSQLPackage.eNS_URI);
		QIntegratedLanguageEsamPackage theIntegratedLanguageEsamPackage = (QIntegratedLanguageEsamPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageEsamPackage.eNS_URI);
		QIntegratedLanguageDataTermPackage theIntegratedLanguageDataTermPackage = (QIntegratedLanguageDataTermPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataTermPackage.eNS_URI);
		QIntegratedLanguageFlowPackage theIntegratedLanguageFlowPackage = (QIntegratedLanguageFlowPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageFlowPackage.eNS_URI);
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QIntegratedLanguageCoreMetaPackage theIntegratedLanguageCoreMetaPackage = (QIntegratedLanguageCoreMetaPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI);
		QOperatingSystemJobsPackage theOperatingSystemJobsPackage = (QOperatingSystemJobsPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemJobsPackage.eNS_URI);
		QOperatingSystemFilePackage theOperatingSystemFilePackage = (QOperatingSystemFilePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemFilePackage.eNS_URI);
		QIntegratedLanguageCoreJavaPackage theIntegratedLanguageCoreJavaPackage = (QIntegratedLanguageCoreJavaPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreJavaPackage.eNS_URI);
		QOperatingSystemModulePackage theOperatingSystemModulePackage = (QOperatingSystemModulePackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemModulePackage.eNS_URI);
		QOperatingSystemProgramPackage theOperatingSystemProgramPackage = (QOperatingSystemProgramPackage)EPackage.Registry.INSTANCE.getEPackage(QOperatingSystemProgramPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compilationUnitEClass.getESuperTypes().add(theIntegratedLanguageCoreCtxPackage.getContextProvider());
		compilerLinkerEClass.getESuperTypes().add(theIntegratedLanguageCoreMetaPackage.getFacet());
		EGenericType g1 = createEGenericType(theIntegratedLanguageCoreCtxPackage.getPluginRegistry());
		EGenericType g2 = createEGenericType(this.getUnitConverter());
		g1.getETypeArguments().add(g2);
		unitConverterRegistryEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(compilationUnitEClass, QCompilationUnit.class, "CompilationUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompilationUnit_TrashCan(), this.getCompilationTrashCan(), null, "trashCan", null, 0, 1, QCompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(compilationUnitEClass, ecorePackage.getEBoolean(), "equalsTermName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compilationUnitEClass, this.getCaseSensitiveType(), "getCaseSensitive", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageEmbeddedSQLPackage.getCursorTerm(), "getCursor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compilationUnitEClass, this.getCompilationUnit(), "getChildCompilationUnits", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageEsamPackage.getDataSetTerm(), "getDataSet", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, null, "getDataTerm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageEsamPackage.getDisplayTerm(), "getDisplay", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageEsamPackage.getKeyListTerm(), "getKeyList", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageFlowPackage.getPrototype(), "getMethod", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageFlowPackage.getModule(), "getModule", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compilationUnitEClass, theIntegratedLanguageCorePackage.getNameable(), "getNode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageCorePackage.getNamedNode(), "getNamedNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compilationUnitEClass, this.getCompilationUnit(), "getParentUnit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageEsamPackage.getPrintTerm(), "getPrinter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageFlowPackage.getProcedure(), "getProcedure", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageFlowPackage.getPrototype(), "getPrototype", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, ecorePackage.getEString(), "getQualifiedName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCorePackage.getNamedNode(), "namedNode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageFlowPackage.getRoutine(), "getRoutine", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, theIntegratedLanguageEmbeddedSQLPackage.getStatementTerm(), "getStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "deep", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, ecorePackage.getEString(), "normalizeTermName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, ecorePackage.getEString(), "normalizeTypeName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilationUnitEClass, ecorePackage.getEString(), "normalizeTypeName", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataTerm", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compilationUnitEClass, null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(compilationUnitEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compilationSetupEClass, QCompilationSetup.class, "CompilationSetup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompilationSetup_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, QCompilationSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompilationSetup_EntryType(), this.getEntryType(), "entryType", null, 0, 1, QCompilationSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompilationSetup_ProcedureType(), this.getInternalType(), "procedureType", null, 0, 1, QCompilationSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compilationTrashCanEClass, QCompilationTrashCan.class, "CompilationTrashCan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getCompilationTrashCan_DataTerms(), g1, null, "dataTerms", null, 0, -1, QCompilationTrashCan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compilerLinkerEClass, QCompilerLinker.class, "CompilerLinker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getCompilerLinker_LinkedClass(), g1, "linkedClass", null, 0, 1, QCompilerLinker.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compilerManagerEClass, QCompilerManager.class, "CompilerManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(compilerManagerEClass, this.getCompilationUnit(), "createChildCompilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "master", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageFlowPackage.getProcedure(), "procedure", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilerManagerEClass, this.getCompilationUnit(), "createCompilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemFilePackage.getFile(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCaseSensitiveType(), "caseSensitive", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilerManagerEClass, this.getCompilationUnit(), "createCompilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageFlowPackage.getModule(), "module", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCaseSensitiveType(), "caseSensitive", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilerManagerEClass, this.getCompilationUnit(), "createCompilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageFlowPackage.getProgram(), "program", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCaseSensitiveType(), "caseSensitive", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilerManagerEClass, null, "linkCompilationUnit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "compilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(compilerManagerEClass, null, "writeDatabaseFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "compilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationSetup(), "setup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreJavaPackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIntegratedLanguageCoreJavaPackage.getJavaIOException());

		op = addEOperation(compilerManagerEClass, null, "writeDisplayFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "compilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationSetup(), "setup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreJavaPackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIntegratedLanguageCoreJavaPackage.getJavaIOException());

		op = addEOperation(compilerManagerEClass, null, "writeModule", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "compilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationSetup(), "setup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreJavaPackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIntegratedLanguageCoreJavaPackage.getJavaIOException());

		op = addEOperation(compilerManagerEClass, null, "writePrinterFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "compilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationSetup(), "setup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreJavaPackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIntegratedLanguageCoreJavaPackage.getJavaIOException());

		op = addEOperation(compilerManagerEClass, null, "writeProgram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "compilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationSetup(), "setup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreJavaPackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIntegratedLanguageCoreJavaPackage.getJavaIOException());

		op = addEOperation(compilerManagerEClass, null, "writeProgramTest", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "compilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationSetup(), "setup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreJavaPackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIntegratedLanguageCoreJavaPackage.getJavaIOException());

		op = addEOperation(compilerManagerEClass, null, "writeStub", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationUnit(), "compilationUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCompilationSetup(), "setup", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreJavaPackage.getJavaOutputStream(), "output", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theIntegratedLanguageCoreJavaPackage.getJavaIOException());

		initEClass(unitConverterEClass, QUnitConverter.class, "UnitConverter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(unitConverterEClass, theIntegratedLanguageFlowPackage.getModule(), "convertModule", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemModulePackage.getModule(), "module", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(unitConverterEClass, theIntegratedLanguageFlowPackage.getProgram(), "convertProgram", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemJobsPackage.getJob(), "job", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatingSystemProgramPackage.getProgram(), "program", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unitConverterRegistryEClass, QUnitConverterRegistry.class, "UnitConverterRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(caseSensitiveTypeEEnum, CaseSensitiveType.class, "CaseSensitiveType");
		addEEnumLiteral(caseSensitiveTypeEEnum, CaseSensitiveType.LOWER);
		addEEnumLiteral(caseSensitiveTypeEEnum, CaseSensitiveType.UPPER);
		addEEnumLiteral(caseSensitiveTypeEEnum, CaseSensitiveType.IGNORE);

		initEEnum(entryTypeEEnum, EntryType.class, "EntryType");
		addEEnumLiteral(entryTypeEEnum, EntryType.MAIN);
		addEEnumLiteral(entryTypeEEnum, EntryType.ENTRY);

		initEEnum(internalTypeEEnum, InternalType.class, "InternalType");
		addEEnumLiteral(internalTypeEEnum, InternalType.INNER);
		addEEnumLiteral(internalTypeEEnum, InternalType.NESTED);

		initEEnum(unitScopeEEnum, UnitScope.class, "UnitScope");
		addEEnumLiteral(unitScopeEEnum, UnitScope.FRIENDLY);
		addEEnumLiteral(unitScopeEEnum, UnitScope.PUBLIC);
		addEEnumLiteral(unitScopeEEnum, UnitScope.PROTECTED);
		addEEnumLiteral(unitScopeEEnum, UnitScope.PRIVATE);

		// Create resource
		createResource(eNS_URI);
	}

} //DevelopmentKitCompilerPackageImpl
