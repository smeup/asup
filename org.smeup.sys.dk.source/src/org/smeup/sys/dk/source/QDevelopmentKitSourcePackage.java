/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.source;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.dk.source.QDevelopmentKitSourceFactory
 * @model kind="package"
 * @generated
 */
public interface QDevelopmentKitSourcePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "source";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/dk/source";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dk-source";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QDevelopmentKitSourcePackage eINSTANCE = org.smeup.sys.dk.source.impl.DevelopmentKitSourcePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.source.QProject <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.source.QProject
	 * @see org.smeup.sys.dk.source.impl.DevelopmentKitSourcePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.source.impl.ProjectDefImpl <em>Project Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.source.impl.ProjectDefImpl
	 * @see org.smeup.sys.dk.source.impl.DevelopmentKitSourcePackageImpl#getProjectDef()
	 * @generated
	 */
	int PROJECT_DEF = 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.source.QSourceNode <em>Source Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.source.QSourceNode
	 * @see org.smeup.sys.dk.source.impl.DevelopmentKitSourcePackageImpl#getSourceNode()
	 * @generated
	 */
	int SOURCE_NODE = 4;

	/**
	 * The number of structural features of the '<em>Source Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_NODE_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEF__NAME = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEF__TEXT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DEF_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.source.QSourceEntry <em>Source Entry</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.source.QSourceEntry
	 * @see org.smeup.sys.dk.source.impl.DevelopmentKitSourcePackageImpl#getSourceEntry()
	 * @generated
	 */
	int SOURCE_ENTRY = 2;

	/**
	 * The number of structural features of the '<em>Source Entry</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ENTRY_FEATURE_COUNT = SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.source.QSourceManager <em>Source Manager</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.source.QSourceManager
	 * @see org.smeup.sys.dk.source.impl.DevelopmentKitSourcePackageImpl#getSourceManager()
	 * @generated
	 */
	int SOURCE_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Source Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.source.QProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.smeup.sys.dk.source.QProject
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.source.QProjectDef <em>Project Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Def</em>'.
	 * @see org.smeup.sys.dk.source.QProjectDef
	 * @generated
	 */
	EClass getProjectDef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.dk.source.QProjectDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.dk.source.QProjectDef#getName()
	 * @see #getProjectDef()
	 * @generated
	 */
	EAttribute getProjectDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.dk.source.QProjectDef#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.smeup.sys.dk.source.QProjectDef#getText()
	 * @see #getProjectDef()
	 * @generated
	 */
	EAttribute getProjectDef_Text();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.dk.source.QSourceEntry <em>Source Entry</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Source Entry</em>'.
	 * @see org.smeup.sys.dk.source.QSourceEntry
	 * @generated
	 */
	EClass getSourceEntry();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.dk.source.QSourceManager <em>Source Manager</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Source Manager</em>'.
	 * @see org.smeup.sys.dk.source.QSourceManager
	 * @generated
	 */
	EClass getSourceManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.source.QSourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Node</em>'.
	 * @see org.smeup.sys.dk.source.QSourceNode
	 * @generated
	 */
	EClass getSourceNode();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDevelopmentKitSourceFactory getDevelopmentKitSourceFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.source.QProject <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.source.QProject
		 * @see org.smeup.sys.dk.source.impl.DevelopmentKitSourcePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.source.impl.ProjectDefImpl <em>Project Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.source.impl.ProjectDefImpl
		 * @see org.smeup.sys.dk.source.impl.DevelopmentKitSourcePackageImpl#getProjectDef()
		 * @generated
		 */
		EClass PROJECT_DEF = eINSTANCE.getProjectDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DEF__NAME = eINSTANCE.getProjectDef_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_DEF__TEXT = eINSTANCE.getProjectDef_Text();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.source.QSourceEntry <em>Source Entry</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.source.QSourceEntry
		 * @see org.smeup.sys.dk.source.impl.DevelopmentKitSourcePackageImpl#getSourceEntry()
		 * @generated
		 */
		EClass SOURCE_ENTRY = eINSTANCE.getSourceEntry();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.source.QSourceManager <em>Source Manager</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.dk.source.QSourceManager
		 * @see org.smeup.sys.dk.source.impl.DevelopmentKitSourcePackageImpl#getSourceManager()
		 * @generated
		 */
		EClass SOURCE_MANAGER = eINSTANCE.getSourceManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.source.QSourceNode <em>Source Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.source.QSourceNode
		 * @see org.smeup.sys.dk.source.impl.DevelopmentKitSourcePackageImpl#getSourceNode()
		 * @generated
		 */
		EClass SOURCE_NODE = eINSTANCE.getSourceNode();

	}

} // QDevelopmentKitSourcePackage
