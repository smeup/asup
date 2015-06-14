/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.cdo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.smeup.sys.os.core.cdo.CDOSystemCoreFactory
 * @model kind="package"
 * @generated
 */
public interface CDOSystemCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cdo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/core/cdo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-core-cdo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	CDOSystemCorePackage eINSTANCE = org.smeup.sys.os.core.cdo.impl.CDOSystemCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.cdo.impl.CDOSystemConfigImpl <em>CDO System Config</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.core.cdo.impl.CDOSystemConfigImpl
	 * @see org.smeup.sys.os.core.cdo.impl.CDOSystemCorePackageImpl#getCDOSystemConfig()
	 * @generated
	 */
	int CDO_SYSTEM_CONFIG = 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.cdo.impl.CDOStoreConfigImpl <em>CDO Store Config</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.os.core.cdo.impl.CDOStoreConfigImpl
	 * @see org.smeup.sys.os.core.cdo.impl.CDOSystemCorePackageImpl#getCDOStoreConfig()
	 * @generated
	 */
	int CDO_STORE_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CDO_STORE_CONFIG__ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_STORE_CONFIG__CREDENTIALS = 1;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CDO_STORE_CONFIG__DRIVER = 2;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CDO_STORE_CONFIG__REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Socket Config</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_STORE_CONFIG__SOCKET_CONFIG = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CDO_STORE_CONFIG__URL = 5;

	/**
	 * The number of structural features of the '<em>CDO Store Config</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_STORE_CONFIG_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_SYSTEM_CONFIG__SYSTEM = 0;

	/**
	 * The number of structural features of the '<em>CDO System Config</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_SYSTEM_CONFIG_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.cdo.CDOSystemConfig <em>CDO System Config</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>CDO System Config</em>'.
	 * @see org.smeup.sys.os.core.cdo.CDOSystemConfig
	 * @generated
	 */
	EClass getCDOSystemConfig();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.os.core.cdo.CDOSystemConfig#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see org.smeup.sys.os.core.cdo.CDOSystemConfig#getSystem()
	 * @see #getCDOSystemConfig()
	 * @generated
	 */
	EReference getCDOSystemConfig_System();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.cdo.CDOStoreConfig <em>CDO Store Config</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>CDO Store Config</em>'.
	 * @see org.smeup.sys.os.core.cdo.CDOStoreConfig
	 * @generated
	 */
	EClass getCDOStoreConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getAdapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter</em>'.
	 * @see org.smeup.sys.os.core.cdo.CDOStoreConfig#getAdapter()
	 * @see #getCDOStoreConfig()
	 * @generated
	 */
	EAttribute getCDOStoreConfig_Adapter();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see org.smeup.sys.os.core.cdo.CDOStoreConfig#getDriver()
	 * @see #getCDOStoreConfig()
	 * @generated
	 */
	EAttribute getCDOStoreConfig_Driver();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository</em>'.
	 * @see org.smeup.sys.os.core.cdo.CDOStoreConfig#getRepository()
	 * @see #getCDOStoreConfig()
	 * @generated
	 */
	EAttribute getCDOStoreConfig_Repository();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getSocketConfig <em>Socket Config</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Socket Config</em>'.
	 * @see org.smeup.sys.os.core.cdo.CDOStoreConfig#getSocketConfig()
	 * @see #getCDOStoreConfig()
	 * @generated
	 */
	EReference getCDOStoreConfig_SocketConfig();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getUrl <em>Url</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.smeup.sys.os.core.cdo.CDOStoreConfig#getUrl()
	 * @see #getCDOStoreConfig()
	 * @generated
	 */
	EAttribute getCDOStoreConfig_Url();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credentials</em>'.
	 * @see org.smeup.sys.os.core.cdo.CDOStoreConfig#getCredentials()
	 * @see #getCDOStoreConfig()
	 * @generated
	 */
	EReference getCDOStoreConfig_Credentials();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CDOSystemCoreFactory getCDOSystemCoreFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.os.core.cdo.impl.CDOSystemConfigImpl <em>CDO System Config</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.core.cdo.impl.CDOSystemConfigImpl
		 * @see org.smeup.sys.os.core.cdo.impl.CDOSystemCorePackageImpl#getCDOSystemConfig()
		 * @generated
		 */
		EClass CDO_SYSTEM_CONFIG = eINSTANCE.getCDOSystemConfig();
		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDO_SYSTEM_CONFIG__SYSTEM = eINSTANCE.getCDOSystemConfig_System();
		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.cdo.impl.CDOStoreConfigImpl <em>CDO Store Config</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.os.core.cdo.impl.CDOStoreConfigImpl
		 * @see org.smeup.sys.os.core.cdo.impl.CDOSystemCorePackageImpl#getCDOStoreConfig()
		 * @generated
		 */
		EClass CDO_STORE_CONFIG = eINSTANCE.getCDOStoreConfig();
		/**
		 * The meta object literal for the '<em><b>Adapter</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_STORE_CONFIG__ADAPTER = eINSTANCE.getCDOStoreConfig_Adapter();
		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_STORE_CONFIG__DRIVER = eINSTANCE.getCDOStoreConfig_Driver();
		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_STORE_CONFIG__REPOSITORY = eINSTANCE.getCDOStoreConfig_Repository();
		/**
		 * The meta object literal for the '<em><b>Socket Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference CDO_STORE_CONFIG__SOCKET_CONFIG = eINSTANCE.getCDOStoreConfig_SocketConfig();
		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_STORE_CONFIG__URL = eINSTANCE.getCDOStoreConfig_Url();
		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference CDO_STORE_CONFIG__CREDENTIALS = eINSTANCE.getCDOStoreConfig_Credentials();

	}

} // QCDOSystemCorePackage
