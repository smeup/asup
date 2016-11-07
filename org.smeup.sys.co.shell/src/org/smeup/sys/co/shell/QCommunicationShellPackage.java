/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.shell;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.smeup.sys.co.core.QCommunicationCorePackage;
import org.smeup.sys.il.data.term.QTermPackage;
import org.smeup.sys.rt.auth.QRuntimeAuthenticationPackage;

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
 * @see org.smeup.sys.co.shell.QCommunicationShellFactory
 * @model kind="package"
 * @generated
 */
public interface QCommunicationShellPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shell";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/co/shell";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co-shell";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QCommunicationShellPackage eINSTANCE = org.smeup.sys.co.shell.impl.CommunicationShellPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.co.shell.impl.ShellCredentialsImpl <em>Shell Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.co.shell.impl.ShellCredentialsImpl
	 * @see org.smeup.sys.co.shell.impl.CommunicationShellPackageImpl#getShellCredentials()
	 * @generated
	 */
	int SHELL_CREDENTIALS = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_CREDENTIALS__USER = QRuntimeAuthenticationPackage.AUTHENTICATION_USER_PASSWORD__USER;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_CREDENTIALS__PASSWORD = QRuntimeAuthenticationPackage.AUTHENTICATION_USER_PASSWORD__PASSWORD;

	/**
	 * The number of structural features of the '<em>Shell Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_CREDENTIALS_FEATURE_COUNT = QRuntimeAuthenticationPackage.AUTHENTICATION_USER_PASSWORD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.co.shell.QShellOutputWrapper <em>Shell Output Wrapper</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.co.shell.QShellOutputWrapper
	 * @see org.smeup.sys.co.shell.impl.CommunicationShellPackageImpl#getShellOutputWrapper()
	 * @generated
	 */
	int SHELL_OUTPUT_WRAPPER = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.co.shell.QShellManager <em>Shell Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.co.shell.QShellManager
	 * @see org.smeup.sys.co.shell.impl.CommunicationShellPackageImpl#getShellManager()
	 * @generated
	 */
	int SHELL_MANAGER = 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.co.shell.impl.ShellDataImpl
	 * <em>Shell Data</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.co.shell.impl.ShellDataImpl
	 * @see org.smeup.sys.co.shell.impl.CommunicationShellPackageImpl#getShellData()
	 * @generated
	 */
	int SHELL_DATA = 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_DATA__FACETS = QTermPackage.DATA_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_DATA__BASED = QTermPackage.DATA_TERM__BASED;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_DATA__CARDINALITY = QTermPackage.DATA_TERM__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SHELL_DATA__CONSTANT = QTermPackage.DATA_TERM__CONSTANT;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_DATA__DEFAULT = QTermPackage.DATA_TERM__DEFAULT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_DATA__DEFINITION = QTermPackage.DATA_TERM__DEFINITION;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_DATA__KEY = QTermPackage.DATA_TERM__KEY;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SHELL_DATA__INITIALIZED = QTermPackage.DATA_TERM__INITIALIZED;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SHELL_DATA__LIKE = QTermPackage.DATA_TERM__LIKE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SHELL_DATA__NAME = QTermPackage.DATA_TERM__NAME;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SHELL_DATA__RESTRICTED = QTermPackage.DATA_TERM__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SHELL_DATA__TEXT = QTermPackage.DATA_TERM__TEXT;

	/**
	 * The number of structural features of the '<em>Shell Data</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_DATA_FEATURE_COUNT = QTermPackage.DATA_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shell Output Wrapper</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_OUTPUT_WRAPPER_FEATURE_COUNT = QCommunicationCorePackage.OUTPUT_WRAPPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shell Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_MANAGER_FEATURE_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.co.shell.QShellCredentials <em>Shell Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shell Credentials</em>'.
	 * @see org.smeup.sys.co.shell.QShellCredentials
	 * @generated
	 */
	EClass getShellCredentials();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.co.shell.QShellOutputWrapper <em>Shell Output Wrapper</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Shell Output Wrapper</em>'.
	 * @see org.smeup.sys.co.shell.QShellOutputWrapper
	 * @generated
	 */
	EClass getShellOutputWrapper();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.co.shell.QShellManager <em>Shell Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shell Manager</em>'.
	 * @see org.smeup.sys.co.shell.QShellManager
	 * @generated
	 */
	EClass getShellManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.co.shell.QShellData <em>Shell Data</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shell Data</em>'.
	 * @see org.smeup.sys.co.shell.QShellData
	 * @generated
	 */
	EClass getShellData();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QCommunicationShellFactory getCommunicationShellFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.co.shell.impl.ShellCredentialsImpl <em>Shell Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.co.shell.impl.ShellCredentialsImpl
		 * @see org.smeup.sys.co.shell.impl.CommunicationShellPackageImpl#getShellCredentials()
		 * @generated
		 */
		EClass SHELL_CREDENTIALS = eINSTANCE.getShellCredentials();
		/**
		 * The meta object literal for the '{@link org.smeup.sys.co.shell.QShellOutputWrapper <em>Shell Output Wrapper</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.co.shell.QShellOutputWrapper
		 * @see org.smeup.sys.co.shell.impl.CommunicationShellPackageImpl#getShellOutputWrapper()
		 * @generated
		 */
		EClass SHELL_OUTPUT_WRAPPER = eINSTANCE.getShellOutputWrapper();
		/**
		 * The meta object literal for the '{@link org.smeup.sys.co.shell.QShellManager <em>Shell Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.co.shell.QShellManager
		 * @see org.smeup.sys.co.shell.impl.CommunicationShellPackageImpl#getShellManager()
		 * @generated
		 */
		EClass SHELL_MANAGER = eINSTANCE.getShellManager();
		/**
		 * The meta object literal for the '{@link org.smeup.sys.co.shell.impl.ShellDataImpl <em>Shell Data</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.co.shell.impl.ShellDataImpl
		 * @see org.smeup.sys.co.shell.impl.CommunicationShellPackageImpl#getShellData()
		 * @generated
		 */
		EClass SHELL_DATA = eINSTANCE.getShellData();

	}

} // QCommunicationShellPackage
