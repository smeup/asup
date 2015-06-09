/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core.auth;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.smeup.sys.rt.core.auth.QRuntimeCoreAuthFactory
 * @model kind="package"
 * @generated
 */
public interface QRuntimeCoreAuthPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "auth";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/rt/core/auth";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rt-core-auth";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QRuntimeCoreAuthPackage eINSTANCE = org.smeup.sys.rt.core.auth.impl.RuntimeCoreAuthPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.auth.QAuthenticationToken <em>Authentication Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.auth.QAuthenticationToken
	 * @see org.smeup.sys.rt.core.auth.impl.RuntimeCoreAuthPackageImpl#getAuthenticationToken()
	 * @generated
	 */
	int AUTHENTICATION_TOKEN = 0;

	/**
	 * The number of structural features of the '<em>Authentication Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.core.auth.QAuthenticationManager <em>Authentication Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.core.auth.QAuthenticationManager
	 * @see org.smeup.sys.rt.core.auth.impl.RuntimeCoreAuthPackageImpl#getAuthenticationManager()
	 * @generated
	 */
	int AUTHENTICATION_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>Authentication Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MANAGER_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.auth.QAuthenticationToken <em>Authentication Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Token</em>'.
	 * @see org.smeup.sys.rt.core.auth.QAuthenticationToken
	 * @generated
	 */
	EClass getAuthenticationToken();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.core.auth.QAuthenticationManager <em>Authentication Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Manager</em>'.
	 * @see org.smeup.sys.rt.core.auth.QAuthenticationManager
	 * @generated
	 */
	EClass getAuthenticationManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QRuntimeCoreAuthFactory getRuntimeCoreAuthFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.auth.QAuthenticationToken <em>Authentication Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.auth.QAuthenticationToken
		 * @see org.smeup.sys.rt.core.auth.impl.RuntimeCoreAuthPackageImpl#getAuthenticationToken()
		 * @generated
		 */
		EClass AUTHENTICATION_TOKEN = eINSTANCE.getAuthenticationToken();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.core.auth.QAuthenticationManager <em>Authentication Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.core.auth.QAuthenticationManager
		 * @see org.smeup.sys.rt.core.auth.impl.RuntimeCoreAuthPackageImpl#getAuthenticationManager()
		 * @generated
		 */
		EClass AUTHENTICATION_MANAGER = eINSTANCE.getAuthenticationManager();

	}

} //QRuntimeCoreAuthPackage
