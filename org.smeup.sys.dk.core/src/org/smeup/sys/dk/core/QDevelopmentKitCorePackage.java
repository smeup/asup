/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.dk.core.QDevelopmentKitCoreFactory
 * @model kind="package"
 * @generated
 */
public interface QDevelopmentKitCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.com/asup/dk/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dk-core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDevelopmentKitCorePackage eINSTANCE = org.smeup.sys.dk.core.impl.DevelopmentKitCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.core.impl.DevelopmentStatusImpl <em>Development Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.core.impl.DevelopmentStatusImpl
	 * @see org.smeup.sys.dk.core.impl.DevelopmentKitCorePackageImpl#getDevelopmentStatus()
	 * @generated
	 */
	int DEVELOPMENT_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_STATUS__VALUE = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Development Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_STATUS_FEATURE_COUNT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.dk.core.DevelopmentStatusType <em>Development Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.dk.core.DevelopmentStatusType
	 * @see org.smeup.sys.dk.core.impl.DevelopmentKitCorePackageImpl#getDevelopmentStatusType()
	 * @generated
	 */
	int DEVELOPMENT_STATUS_TYPE = 1;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.dk.core.QDevelopmentStatus <em>Development Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Status</em>'.
	 * @see org.smeup.sys.dk.core.QDevelopmentStatus
	 * @generated
	 */
	EClass getDevelopmentStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.dk.core.QDevelopmentStatus#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.smeup.sys.dk.core.QDevelopmentStatus#getValue()
	 * @see #getDevelopmentStatus()
	 * @generated
	 */
	EAttribute getDevelopmentStatus_Value();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.dk.core.DevelopmentStatusType <em>Development Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Development Status Type</em>'.
	 * @see org.smeup.sys.dk.core.DevelopmentStatusType
	 * @generated
	 */
	EEnum getDevelopmentStatusType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QDevelopmentKitCoreFactory getDevelopmentKitCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.core.impl.DevelopmentStatusImpl <em>Development Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.core.impl.DevelopmentStatusImpl
		 * @see org.smeup.sys.dk.core.impl.DevelopmentKitCorePackageImpl#getDevelopmentStatus()
		 * @generated
		 */
		EClass DEVELOPMENT_STATUS = eINSTANCE.getDevelopmentStatus();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPMENT_STATUS__VALUE = eINSTANCE.getDevelopmentStatus_Value();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.dk.core.DevelopmentStatusType <em>Development Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.dk.core.DevelopmentStatusType
		 * @see org.smeup.sys.dk.core.impl.DevelopmentKitCorePackageImpl#getDevelopmentStatusType()
		 * @generated
		 */
		EEnum DEVELOPMENT_STATUS_TYPE = eINSTANCE.getDevelopmentStatusType();

	}

} //QDevelopmentKitCorePackage
