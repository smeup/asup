/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.auth;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

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
 * @see org.smeup.sys.rt.auth.QRuntimeAuthenticationFactory
 * @model kind="package"
 * @generated
 */
public interface QRuntimeAuthenticationPackage extends EPackage {
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
	String eNS_URI = "http://www.smeup.org/asup/rt/auth";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rt-auth";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QRuntimeAuthenticationPackage eINSTANCE = org.smeup.sys.rt.auth.impl.RuntimeAuthenticationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.auth.QAuthentication <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.auth.QAuthentication
	 * @see org.smeup.sys.rt.auth.impl.RuntimeAuthenticationPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 0;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.auth.QAuthenticationManager <em>Authentication Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.auth.QAuthenticationManager
	 * @see org.smeup.sys.rt.auth.impl.RuntimeAuthenticationPackageImpl#getAuthenticationManager()
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
	 * The meta object id for the '{@link org.smeup.sys.rt.auth.impl.AuthenticationUserPasswordImpl <em>Authentication User Password</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.auth.impl.AuthenticationUserPasswordImpl
	 * @see org.smeup.sys.rt.auth.impl.RuntimeAuthenticationPackageImpl#getAuthenticationUserPassword()
	 * @generated
	 */
	int AUTHENTICATION_USER_PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_PASSWORD__USER = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_PASSWORD__PASSWORD = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Authentication User Password</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_PASSWORD_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.auth.QAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see org.smeup.sys.rt.auth.QAuthentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.auth.QAuthenticationManager <em>Authentication Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Manager</em>'.
	 * @see org.smeup.sys.rt.auth.QAuthenticationManager
	 * @generated
	 */
	EClass getAuthenticationManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.auth.QAuthenticationUserPassword <em>Authentication User Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication User Password</em>'.
	 * @see org.smeup.sys.rt.auth.QAuthenticationUserPassword
	 * @generated
	 */
	EClass getAuthenticationUserPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.auth.QAuthenticationUserPassword#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.smeup.sys.rt.auth.QAuthenticationUserPassword#getUser()
	 * @see #getAuthenticationUserPassword()
	 * @generated
	 */
	EAttribute getAuthenticationUserPassword_User();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.rt.auth.QAuthenticationUserPassword#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.smeup.sys.rt.auth.QAuthenticationUserPassword#getPassword()
	 * @see #getAuthenticationUserPassword()
	 * @generated
	 */
	EAttribute getAuthenticationUserPassword_Password();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QRuntimeAuthenticationFactory getRuntimeAuthenticationFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.rt.auth.QAuthentication <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.auth.QAuthentication
		 * @see org.smeup.sys.rt.auth.impl.RuntimeAuthenticationPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.auth.QAuthenticationManager <em>Authentication Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.auth.QAuthenticationManager
		 * @see org.smeup.sys.rt.auth.impl.RuntimeAuthenticationPackageImpl#getAuthenticationManager()
		 * @generated
		 */
		EClass AUTHENTICATION_MANAGER = eINSTANCE.getAuthenticationManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.rt.auth.impl.AuthenticationUserPasswordImpl <em>Authentication User Password</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.auth.impl.AuthenticationUserPasswordImpl
		 * @see org.smeup.sys.rt.auth.impl.RuntimeAuthenticationPackageImpl#getAuthenticationUserPassword()
		 * @generated
		 */
		EClass AUTHENTICATION_USER_PASSWORD = eINSTANCE.getAuthenticationUserPassword();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_PASSWORD__USER = eINSTANCE.getAuthenticationUserPassword_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_PASSWORD__PASSWORD = eINSTANCE.getAuthenticationUserPassword_Password();

	}

} //QRuntimeAuthenticationPackage
