/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.memo.cdo.store;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.smeup.sys.il.memo.cdo.store.CDOStoreFactory
 * @model kind="package"
 * @generated
 */
public interface CDOStorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "store";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/memo/cdo/store";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-memo-cdo-store";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDOStorePackage eINSTANCE = org.smeup.sys.il.memo.cdo.store.impl.CDOStorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.memo.cdo.store.impl.CDOStoreConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.memo.cdo.store.impl.CDOStoreConfigImpl
	 * @see org.smeup.sys.il.memo.cdo.store.impl.CDOStorePackageImpl#getCDOStoreConfig()
	 * @generated
	 */
	int CDO_STORE_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_STORE_CONFIG__ADAPTER = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_STORE_CONFIG__CREDENTIALS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_STORE_CONFIG__DRIVER = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_STORE_CONFIG__REPOSITORY = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Socket Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_STORE_CONFIG__SOCKET_CONFIG = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_STORE_CONFIG__URL = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_STORE_CONFIG_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.memo.cdo.store.CDOStoreConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.smeup.sys.il.memo.cdo.store.CDOStoreConfig
	 * @generated
	 */
	EClass getCDOStoreConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.memo.cdo.store.CDOStoreConfig#getAdapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter</em>'.
	 * @see org.smeup.sys.il.memo.cdo.store.CDOStoreConfig#getAdapter()
	 * @see #getCDOStoreConfig()
	 * @generated
	 */
	EAttribute getCDOStoreConfig_Adapter();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.memo.cdo.store.CDOStoreConfig#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credentials</em>'.
	 * @see org.smeup.sys.il.memo.cdo.store.CDOStoreConfig#getCredentials()
	 * @see #getCDOStoreConfig()
	 * @generated
	 */
	EReference getCDOStoreConfig_Credentials();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.memo.cdo.store.CDOStoreConfig#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see org.smeup.sys.il.memo.cdo.store.CDOStoreConfig#getDriver()
	 * @see #getCDOStoreConfig()
	 * @generated
	 */
	EAttribute getCDOStoreConfig_Driver();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.memo.cdo.store.CDOStoreConfig#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository</em>'.
	 * @see org.smeup.sys.il.memo.cdo.store.CDOStoreConfig#getRepository()
	 * @see #getCDOStoreConfig()
	 * @generated
	 */
	EAttribute getCDOStoreConfig_Repository();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.memo.cdo.store.CDOStoreConfig#getSocketConfig <em>Socket Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Socket Config</em>'.
	 * @see org.smeup.sys.il.memo.cdo.store.CDOStoreConfig#getSocketConfig()
	 * @see #getCDOStoreConfig()
	 * @generated
	 */
	EReference getCDOStoreConfig_SocketConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.memo.cdo.store.CDOStoreConfig#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.smeup.sys.il.memo.cdo.store.CDOStoreConfig#getUrl()
	 * @see #getCDOStoreConfig()
	 * @generated
	 */
	EAttribute getCDOStoreConfig_Url();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CDOStoreFactory getCDOStoreFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.il.memo.cdo.store.impl.CDOStoreConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.memo.cdo.store.impl.CDOStoreConfigImpl
		 * @see org.smeup.sys.il.memo.cdo.store.impl.CDOStorePackageImpl#getCDOStoreConfig()
		 * @generated
		 */
		EClass CDO_STORE_CONFIG = eINSTANCE.getCDOStoreConfig();

		/**
		 * The meta object literal for the '<em><b>Adapter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_STORE_CONFIG__ADAPTER = eINSTANCE.getCDOStoreConfig_Adapter();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDO_STORE_CONFIG__CREDENTIALS = eINSTANCE.getCDOStoreConfig_Credentials();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_STORE_CONFIG__DRIVER = eINSTANCE.getCDOStoreConfig_Driver();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_STORE_CONFIG__REPOSITORY = eINSTANCE.getCDOStoreConfig_Repository();

		/**
		 * The meta object literal for the '<em><b>Socket Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDO_STORE_CONFIG__SOCKET_CONFIG = eINSTANCE.getCDOStoreConfig_SocketConfig();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_STORE_CONFIG__URL = eINSTANCE.getCDOStoreConfig_Url();

	}

} //CDOStorePackage
