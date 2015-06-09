/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.osgi.ecf;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.smeup.sys.co.osgi.ecf.ECFConnectorOSGIFactory
 * @model kind="package"
 * @generated
 */
public interface ECFConnectorOSGIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/co/osgi/ecf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co-osgi-ecf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ECFConnectorOSGIPackage eINSTANCE = org.smeup.sys.co.osgi.ecf.impl.ECFConnectorOSGIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.co.osgi.ecf.impl.ECFServerContainerConfigImpl <em>ECF Server Container Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.co.osgi.ecf.impl.ECFServerContainerConfigImpl
	 * @see org.smeup.sys.co.osgi.ecf.impl.ECFConnectorOSGIPackageImpl#getECFServerContainerConfig()
	 * @generated
	 */
	int ECF_SERVER_CONTAINER_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Server Container Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECF_SERVER_CONTAINER_CONFIG__SERVER_CONTAINER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Container Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECF_SERVER_CONTAINER_CONFIG__CONTAINER_ID = 1;

	/**
	 * The number of structural features of the '<em>ECF Server Container Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECF_SERVER_CONTAINER_CONFIG_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.co.osgi.ecf.ECFServerContainerConfig <em>ECF Server Container Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECF Server Container Config</em>'.
	 * @see org.smeup.sys.co.osgi.ecf.ECFServerContainerConfig
	 * @generated
	 */
	EClass getECFServerContainerConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.co.osgi.ecf.ECFServerContainerConfig#getServerContainerType <em>Server Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Container Type</em>'.
	 * @see org.smeup.sys.co.osgi.ecf.ECFServerContainerConfig#getServerContainerType()
	 * @see #getECFServerContainerConfig()
	 * @generated
	 */
	EAttribute getECFServerContainerConfig_ServerContainerType();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.co.osgi.ecf.ECFServerContainerConfig#getContainerId <em>Container Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Id</em>'.
	 * @see org.smeup.sys.co.osgi.ecf.ECFServerContainerConfig#getContainerId()
	 * @see #getECFServerContainerConfig()
	 * @generated
	 */
	EAttribute getECFServerContainerConfig_ContainerId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ECFConnectorOSGIFactory getECFConnectorOSGIFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.co.osgi.ecf.impl.ECFServerContainerConfigImpl <em>ECF Server Container Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.co.osgi.ecf.impl.ECFServerContainerConfigImpl
		 * @see org.smeup.sys.co.osgi.ecf.impl.ECFConnectorOSGIPackageImpl#getECFServerContainerConfig()
		 * @generated
		 */
		EClass ECF_SERVER_CONTAINER_CONFIG = eINSTANCE.getECFServerContainerConfig();

		/**
		 * The meta object literal for the '<em><b>Server Container Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECF_SERVER_CONTAINER_CONFIG__SERVER_CONTAINER_TYPE = eINSTANCE.getECFServerContainerConfig_ServerContainerType();

		/**
		 * The meta object literal for the '<em><b>Container Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECF_SERVER_CONTAINER_CONFIG__CONTAINER_ID = eINSTANCE.getECFServerContainerConfig_ContainerId();

	}

} //ECFConnectorOSGIPackage
