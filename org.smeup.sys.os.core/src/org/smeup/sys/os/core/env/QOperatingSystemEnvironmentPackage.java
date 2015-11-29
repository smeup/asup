/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.env;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.smeup.sys.os.core.env.QOperatingSystemEnvironmentFactory
 * @model kind="package"
 * @generated
 */
public interface QOperatingSystemEnvironmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "env";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/os/core/env";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "os-core-env";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QOperatingSystemEnvironmentPackage eINSTANCE = org.smeup.sys.os.core.env.impl.OperatingSystemEnvironmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.env.QEnvironmentVariableManager <em>Environment Variable Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.env.QEnvironmentVariableManager
	 * @see org.smeup.sys.os.core.env.impl.OperatingSystemEnvironmentPackageImpl#getEnvironmentVariableManager()
	 * @generated
	 */
	int ENVIRONMENT_VARIABLE_MANAGER = 0;

	/**
	 * The number of structural features of the '<em>Environment Variable Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.os.core.env.EnvironmentLevel <em>Environment Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.os.core.env.EnvironmentLevel
	 * @see org.smeup.sys.os.core.env.impl.OperatingSystemEnvironmentPackageImpl#getEnvironmentLevel()
	 * @generated
	 */
	int ENVIRONMENT_LEVEL = 1;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.os.core.env.QEnvironmentVariableManager <em>Environment Variable Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Variable Manager</em>'.
	 * @see org.smeup.sys.os.core.env.QEnvironmentVariableManager
	 * @generated
	 */
	EClass getEnvironmentVariableManager();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.os.core.env.EnvironmentLevel <em>Environment Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Environment Level</em>'.
	 * @see org.smeup.sys.os.core.env.EnvironmentLevel
	 * @generated
	 */
	EEnum getEnvironmentLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QOperatingSystemEnvironmentFactory getOperatingSystemEnvironmentFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.os.core.env.QEnvironmentVariableManager <em>Environment Variable Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.env.QEnvironmentVariableManager
		 * @see org.smeup.sys.os.core.env.impl.OperatingSystemEnvironmentPackageImpl#getEnvironmentVariableManager()
		 * @generated
		 */
		EClass ENVIRONMENT_VARIABLE_MANAGER = eINSTANCE.getEnvironmentVariableManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.os.core.env.EnvironmentLevel <em>Environment Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.os.core.env.EnvironmentLevel
		 * @see org.smeup.sys.os.core.env.impl.OperatingSystemEnvironmentPackageImpl#getEnvironmentLevel()
		 * @generated
		 */
		EEnum ENVIRONMENT_LEVEL = eINSTANCE.getEnvironmentLevel();

	}

} //QOperatingSystemEnvironmentPackage
