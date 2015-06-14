/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;

import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;

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
 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerFactory
 * @model kind="package"
 * @generated
 */
public interface QDevelopmentKitCompilerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compiler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ww.asup.org/dk/compiler";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dk-compiler";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDevelopmentKitCompilerPackage eINSTANCE = org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.compiler.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.compiler.impl.CompilationUnitImpl
	 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getCompilationUnit()
	 * @generated
	 */
	int COMPILATION_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Trash Can</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__TRASH_CAN = QIntegratedLanguageCoreCtxPackage.CONTEXT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_FEATURE_COUNT = QIntegratedLanguageCoreCtxPackage.CONTEXT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.compiler.impl.CompilationSetupImpl <em>Compilation Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.compiler.impl.CompilationSetupImpl
	 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getCompilationSetup()
	 * @generated
	 */
	int COMPILATION_SETUP = 1;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_SETUP__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Entry Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_SETUP__ENTRY_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Compilation Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_SETUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.compiler.impl.CompilationTrashCanImpl <em>Compilation Trash Can</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.compiler.impl.CompilationTrashCanImpl
	 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getCompilationTrashCan()
	 * @generated
	 */
	int COMPILATION_TRASH_CAN = 2;

	/**
	 * The feature id for the '<em><b>Data Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_TRASH_CAN__DATA_TERMS = 0;

	/**
	 * The number of structural features of the '<em>Compilation Trash Can</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_TRASH_CAN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.compiler.QCompilerManager <em>Compiler Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.compiler.QCompilerManager
	 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getCompilerManager()
	 * @generated
	 */
	int COMPILER_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Compiler Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.compiler.QUnitConverter <em>Unit Converter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.compiler.QUnitConverter
	 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getUnitConverter()
	 * @generated
	 */
	int UNIT_CONVERTER = 4;

	/**
	 * The number of structural features of the '<em>Unit Converter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONVERTER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.compiler.QUnitConverterRegistry <em>Unit Converter Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.compiler.QUnitConverterRegistry
	 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getUnitConverterRegistry()
	 * @generated
	 */
	int UNIT_CONVERTER_REGISTRY = 5;

	/**
	 * The number of structural features of the '<em>Unit Converter Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONVERTER_REGISTRY_FEATURE_COUNT = QIntegratedLanguageCoreCtxPackage.PLUGIN_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.compiler.impl.CompilerLinkerImpl <em>Compiler Linker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.compiler.impl.CompilerLinkerImpl
	 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getCompilerLinker()
	 * @generated
	 */
	int COMPILER_LINKER = 6;

	/**
	 * The feature id for the '<em><b>Linked Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_LINKER__LINKED_CLASS = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compiler Linker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_LINKER_FEATURE_COUNT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.compiler.EntryType <em>Entry Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.compiler.EntryType
	 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getEntryType()
	 * @generated
	 */
	int ENTRY_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.compiler.CaseSensitiveType <em>Case Sensitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.compiler.CaseSensitiveType
	 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getCaseSensitiveType()
	 * @generated
	 */
	int CASE_SENSITIVE_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.compiler.QCompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit</em>'.
	 * @see org.smeup.sys.dk.compiler.QCompilationUnit
	 * @generated
	 */
	EClass getCompilationUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.dk.compiler.QCompilationUnit#getTrashCan <em>Trash Can</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trash Can</em>'.
	 * @see org.smeup.sys.dk.compiler.QCompilationUnit#getTrashCan()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_TrashCan();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.compiler.QCompilationSetup <em>Compilation Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Setup</em>'.
	 * @see org.smeup.sys.dk.compiler.QCompilationSetup
	 * @generated
	 */
	EClass getCompilationSetup();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.dk.compiler.QCompilationSetup#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see org.smeup.sys.dk.compiler.QCompilationSetup#getBasePackage()
	 * @see #getCompilationSetup()
	 * @generated
	 */
	EAttribute getCompilationSetup_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.dk.compiler.QCompilationSetup#getEntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Type</em>'.
	 * @see org.smeup.sys.dk.compiler.QCompilationSetup#getEntryType()
	 * @see #getCompilationSetup()
	 * @generated
	 */
	EAttribute getCompilationSetup_EntryType();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.compiler.QCompilationTrashCan <em>Compilation Trash Can</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Trash Can</em>'.
	 * @see org.smeup.sys.dk.compiler.QCompilationTrashCan
	 * @generated
	 */
	EClass getCompilationTrashCan();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.dk.compiler.QCompilationTrashCan#getDataTerms <em>Data Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Terms</em>'.
	 * @see org.smeup.sys.dk.compiler.QCompilationTrashCan#getDataTerms()
	 * @see #getCompilationTrashCan()
	 * @generated
	 */
	EReference getCompilationTrashCan_DataTerms();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.compiler.QCompilerManager <em>Compiler Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compiler Manager</em>'.
	 * @see org.smeup.sys.dk.compiler.QCompilerManager
	 * @generated
	 */
	EClass getCompilerManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.compiler.QUnitConverter <em>Unit Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Converter</em>'.
	 * @see org.smeup.sys.dk.compiler.QUnitConverter
	 * @generated
	 */
	EClass getUnitConverter();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.compiler.QUnitConverterRegistry <em>Unit Converter Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Converter Registry</em>'.
	 * @see org.smeup.sys.dk.compiler.QUnitConverterRegistry
	 * @generated
	 */
	EClass getUnitConverterRegistry();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.compiler.QCompilerLinker <em>Compiler Linker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compiler Linker</em>'.
	 * @see org.smeup.sys.dk.compiler.QCompilerLinker
	 * @generated
	 */
	EClass getCompilerLinker();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.dk.compiler.QCompilerLinker#getLinkedClass <em>Linked Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linked Class</em>'.
	 * @see org.smeup.sys.dk.compiler.QCompilerLinker#getLinkedClass()
	 * @see #getCompilerLinker()
	 * @generated
	 */
	EAttribute getCompilerLinker_LinkedClass();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.dk.compiler.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entry Type</em>'.
	 * @see org.smeup.sys.dk.compiler.EntryType
	 * @generated
	 */
	EEnum getEntryType();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.dk.compiler.CaseSensitiveType <em>Case Sensitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Case Sensitive Type</em>'.
	 * @see org.smeup.sys.dk.compiler.CaseSensitiveType
	 * @generated
	 */
	EEnum getCaseSensitiveType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDevelopmentKitCompilerFactory getDevelopmentKitCompilerFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.dk.compiler.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.compiler.impl.CompilationUnitImpl
		 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getCompilationUnit()
		 * @generated
		 */
		EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Trash Can</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__TRASH_CAN = eINSTANCE.getCompilationUnit_TrashCan();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.compiler.impl.CompilationSetupImpl <em>Compilation Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.compiler.impl.CompilationSetupImpl
		 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getCompilationSetup()
		 * @generated
		 */
		EClass COMPILATION_SETUP = eINSTANCE.getCompilationSetup();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_SETUP__BASE_PACKAGE = eINSTANCE.getCompilationSetup_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Entry Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_SETUP__ENTRY_TYPE = eINSTANCE.getCompilationSetup_EntryType();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.compiler.impl.CompilationTrashCanImpl <em>Compilation Trash Can</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.compiler.impl.CompilationTrashCanImpl
		 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getCompilationTrashCan()
		 * @generated
		 */
		EClass COMPILATION_TRASH_CAN = eINSTANCE.getCompilationTrashCan();

		/**
		 * The meta object literal for the '<em><b>Data Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_TRASH_CAN__DATA_TERMS = eINSTANCE.getCompilationTrashCan_DataTerms();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.compiler.QCompilerManager <em>Compiler Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.compiler.QCompilerManager
		 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getCompilerManager()
		 * @generated
		 */
		EClass COMPILER_MANAGER = eINSTANCE.getCompilerManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.compiler.QUnitConverter <em>Unit Converter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.compiler.QUnitConverter
		 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getUnitConverter()
		 * @generated
		 */
		EClass UNIT_CONVERTER = eINSTANCE.getUnitConverter();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.compiler.QUnitConverterRegistry <em>Unit Converter Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.compiler.QUnitConverterRegistry
		 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getUnitConverterRegistry()
		 * @generated
		 */
		EClass UNIT_CONVERTER_REGISTRY = eINSTANCE.getUnitConverterRegistry();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.compiler.impl.CompilerLinkerImpl <em>Compiler Linker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.compiler.impl.CompilerLinkerImpl
		 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getCompilerLinker()
		 * @generated
		 */
		EClass COMPILER_LINKER = eINSTANCE.getCompilerLinker();

		/**
		 * The meta object literal for the '<em><b>Linked Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILER_LINKER__LINKED_CLASS = eINSTANCE.getCompilerLinker_LinkedClass();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.compiler.EntryType <em>Entry Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.compiler.EntryType
		 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getEntryType()
		 * @generated
		 */
		EEnum ENTRY_TYPE = eINSTANCE.getEntryType();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.compiler.CaseSensitiveType <em>Case Sensitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.compiler.CaseSensitiveType
		 * @see org.smeup.sys.dk.compiler.impl.DevelopmentKitCompilerPackageImpl#getCaseSensitiveType()
		 * @generated
		 */
		EEnum CASE_SENSITIVE_TYPE = eINSTANCE.getCaseSensitiveType();

	}

} //QDevelopmentKitCompilerPackage
