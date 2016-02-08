/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.osgi;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.smeup.sys.co.osgi.QConnectorOSGIFactory
 * @model kind="package"
 * @generated
 */
public interface QConnectorOSGIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "osgi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/co/osgi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co-osgi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QConnectorOSGIPackage eINSTANCE = org.smeup.sys.co.osgi.impl.ConnectorOSGIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.co.osgi.QCommunicationManager <em>Communication Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.co.osgi.QCommunicationManager
	 * @see org.smeup.sys.co.osgi.impl.ConnectorOSGIPackageImpl#getCommunicationManager()
	 * @generated
	 */
	int COMMUNICATION_MANAGER = 0;

	/**
	 * The number of structural features of the '<em>Communication Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.co.osgi.QEndPoint <em>End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.co.osgi.QEndPoint
	 * @see org.smeup.sys.co.osgi.impl.ConnectorOSGIPackageImpl#getEndPoint()
	 * @generated
	 */
	int END_POINT = 1;

	/**
	 * The number of structural features of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_FEATURE_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.co.osgi.QCommunicationManager <em>Communication Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Manager</em>'.
	 * @see org.smeup.sys.co.osgi.QCommunicationManager
	 * @generated
	 */
	EClass getCommunicationManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.co.osgi.QEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point</em>'.
	 * @see org.smeup.sys.co.osgi.QEndPoint
	 * @generated
	 */
	EClass getEndPoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QConnectorOSGIFactory getConnectorOSGIFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.co.osgi.QCommunicationManager <em>Communication Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.co.osgi.QCommunicationManager
		 * @see org.smeup.sys.co.osgi.impl.ConnectorOSGIPackageImpl#getCommunicationManager()
		 * @generated
		 */
		EClass COMMUNICATION_MANAGER = eINSTANCE.getCommunicationManager();
		/**
		 * The meta object literal for the '{@link org.smeup.sys.co.osgi.QEndPoint <em>End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.co.osgi.QEndPoint
		 * @see org.smeup.sys.co.osgi.impl.ConnectorOSGIPackageImpl#getEndPoint()
		 * @generated
		 */
		EClass END_POINT = eINSTANCE.getEndPoint();

	}

} //QConnectorOSGIPackage
