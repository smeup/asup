/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.core;

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
 * @see org.smeup.sys.co.core.QCommunicationCoreFactory
 * @model kind="package"
 * @generated
 */
public interface QCommunicationCorePackage extends EPackage {
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
	String eNS_URI = "http://www.smeup.org/asup/co/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co-core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QCommunicationCorePackage eINSTANCE = org.smeup.sys.co.core.impl.CommunicationCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.co.core.QOutputWrapper <em>Output Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.co.core.QOutputWrapper
	 * @see org.smeup.sys.co.core.impl.CommunicationCorePackageImpl#getOutputWrapper()
	 * @generated
	 */
	int OUTPUT_WRAPPER = 0;

	/**
	 * The number of structural features of the '<em>Output Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_WRAPPER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.co.core.impl.ServerSocketConfigImpl <em>Server Socket Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.co.core.impl.ServerSocketConfigImpl
	 * @see org.smeup.sys.co.core.impl.CommunicationCorePackageImpl#getServerSocketConfig()
	 * @generated
	 */
	int SERVER_SOCKET_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SOCKET_CONFIG__ADDRESS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SOCKET_CONFIG__PORT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Server Socket Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SOCKET_CONFIG_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.co.core.QServerSocket <em>Server Socket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.co.core.QServerSocket
	 * @see org.smeup.sys.co.core.impl.CommunicationCorePackageImpl#getServerSocket()
	 * @generated
	 */
	int SERVER_SOCKET = 2;

	/**
	 * The number of structural features of the '<em>Server Socket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SOCKET_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.co.core.QServerSocketManager <em>Server Socket Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.co.core.QServerSocketManager
	 * @see org.smeup.sys.co.core.impl.CommunicationCorePackageImpl#getServerSocketManager()
	 * @generated
	 */
	int SERVER_SOCKET_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Server Socket Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SOCKET_MANAGER_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.co.core.QOutputWrapper <em>Output Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Wrapper</em>'.
	 * @see org.smeup.sys.co.core.QOutputWrapper
	 * @generated
	 */
	EClass getOutputWrapper();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.co.core.QServerSocketConfig <em>Server Socket Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Socket Config</em>'.
	 * @see org.smeup.sys.co.core.QServerSocketConfig
	 * @generated
	 */
	EClass getServerSocketConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.co.core.QServerSocketConfig#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.smeup.sys.co.core.QServerSocketConfig#getAddress()
	 * @see #getServerSocketConfig()
	 * @generated
	 */
	EAttribute getServerSocketConfig_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.co.core.QServerSocketConfig#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.smeup.sys.co.core.QServerSocketConfig#getPort()
	 * @see #getServerSocketConfig()
	 * @generated
	 */
	EAttribute getServerSocketConfig_Port();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.co.core.QServerSocket <em>Server Socket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Socket</em>'.
	 * @see org.smeup.sys.co.core.QServerSocket
	 * @generated
	 */
	EClass getServerSocket();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.co.core.QServerSocketManager <em>Server Socket Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Socket Manager</em>'.
	 * @see org.smeup.sys.co.core.QServerSocketManager
	 * @generated
	 */
	EClass getServerSocketManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QCommunicationCoreFactory getCommunicationCoreFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.co.core.QOutputWrapper <em>Output Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.co.core.QOutputWrapper
		 * @see org.smeup.sys.co.core.impl.CommunicationCorePackageImpl#getOutputWrapper()
		 * @generated
		 */
		EClass OUTPUT_WRAPPER = eINSTANCE.getOutputWrapper();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.co.core.impl.ServerSocketConfigImpl <em>Server Socket Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.co.core.impl.ServerSocketConfigImpl
		 * @see org.smeup.sys.co.core.impl.CommunicationCorePackageImpl#getServerSocketConfig()
		 * @generated
		 */
		EClass SERVER_SOCKET_CONFIG = eINSTANCE.getServerSocketConfig();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_SOCKET_CONFIG__ADDRESS = eINSTANCE.getServerSocketConfig_Address();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_SOCKET_CONFIG__PORT = eINSTANCE.getServerSocketConfig_Port();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.co.core.QServerSocket <em>Server Socket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.co.core.QServerSocket
		 * @see org.smeup.sys.co.core.impl.CommunicationCorePackageImpl#getServerSocket()
		 * @generated
		 */
		EClass SERVER_SOCKET = eINSTANCE.getServerSocket();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.co.core.QServerSocketManager <em>Server Socket Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.co.core.QServerSocketManager
		 * @see org.smeup.sys.co.core.impl.CommunicationCorePackageImpl#getServerSocketManager()
		 * @generated
		 */
		EClass SERVER_SOCKET_MANAGER = eINSTANCE.getServerSocketManager();

	}

} //QCommunicationCorePackage
