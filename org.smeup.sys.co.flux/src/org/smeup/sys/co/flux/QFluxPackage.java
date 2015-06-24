/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.flux;

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
 * @see org.smeup.sys.co.flux.QFluxFactory
 * @model kind="package"
 * @generated
 */
public interface QFluxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flux";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/co/flux";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co-flux";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QFluxPackage eINSTANCE = org.smeup.sys.co.flux.impl.FluxPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.co.flux.impl.FluxServerConnectionConfigImpl <em>Server Connection Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.co.flux.impl.FluxServerConnectionConfigImpl
	 * @see org.smeup.sys.co.flux.impl.FluxPackageImpl#getFluxServerConnectionConfig()
	 * @generated
	 */
	int FLUX_SERVER_CONNECTION_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Channel ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX_SERVER_CONNECTION_CONFIG__CHANNEL_ID = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX_SERVER_CONNECTION_CONFIG__HOST = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lazy Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX_SERVER_CONNECTION_CONFIG__LAZY_START = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX_SERVER_CONNECTION_CONFIG__TOKEN = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX_SERVER_CONNECTION_CONFIG__USER_NAME = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Server Connection Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUX_SERVER_CONNECTION_CONFIG_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.co.flux.QFluxServerConnectionConfig <em>Server Connection Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Connection Config</em>'.
	 * @see org.smeup.sys.co.flux.QFluxServerConnectionConfig
	 * @generated
	 */
	EClass getFluxServerConnectionConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.co.flux.QFluxServerConnectionConfig#getChannelID <em>Channel ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel ID</em>'.
	 * @see org.smeup.sys.co.flux.QFluxServerConnectionConfig#getChannelID()
	 * @see #getFluxServerConnectionConfig()
	 * @generated
	 */
	EAttribute getFluxServerConnectionConfig_ChannelID();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.co.flux.QFluxServerConnectionConfig#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see org.smeup.sys.co.flux.QFluxServerConnectionConfig#getHost()
	 * @see #getFluxServerConnectionConfig()
	 * @generated
	 */
	EAttribute getFluxServerConnectionConfig_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.co.flux.QFluxServerConnectionConfig#isLazyStart <em>Lazy Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy Start</em>'.
	 * @see org.smeup.sys.co.flux.QFluxServerConnectionConfig#isLazyStart()
	 * @see #getFluxServerConnectionConfig()
	 * @generated
	 */
	EAttribute getFluxServerConnectionConfig_LazyStart();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.co.flux.QFluxServerConnectionConfig#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.smeup.sys.co.flux.QFluxServerConnectionConfig#getToken()
	 * @see #getFluxServerConnectionConfig()
	 * @generated
	 */
	EAttribute getFluxServerConnectionConfig_Token();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.co.flux.QFluxServerConnectionConfig#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see org.smeup.sys.co.flux.QFluxServerConnectionConfig#getUserName()
	 * @see #getFluxServerConnectionConfig()
	 * @generated
	 */
	EAttribute getFluxServerConnectionConfig_UserName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QFluxFactory getFluxFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.co.flux.impl.FluxServerConnectionConfigImpl <em>Server Connection Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.co.flux.impl.FluxServerConnectionConfigImpl
		 * @see org.smeup.sys.co.flux.impl.FluxPackageImpl#getFluxServerConnectionConfig()
		 * @generated
		 */
		EClass FLUX_SERVER_CONNECTION_CONFIG = eINSTANCE.getFluxServerConnectionConfig();

		/**
		 * The meta object literal for the '<em><b>Channel ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUX_SERVER_CONNECTION_CONFIG__CHANNEL_ID = eINSTANCE.getFluxServerConnectionConfig_ChannelID();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUX_SERVER_CONNECTION_CONFIG__HOST = eINSTANCE.getFluxServerConnectionConfig_Host();

		/**
		 * The meta object literal for the '<em><b>Lazy Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUX_SERVER_CONNECTION_CONFIG__LAZY_START = eINSTANCE.getFluxServerConnectionConfig_LazyStart();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUX_SERVER_CONNECTION_CONFIG__TOKEN = eINSTANCE.getFluxServerConnectionConfig_Token();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLUX_SERVER_CONNECTION_CONFIG__USER_NAME = eINSTANCE.getFluxServerConnectionConfig_UserName();

	}

} //QFluxPackage
