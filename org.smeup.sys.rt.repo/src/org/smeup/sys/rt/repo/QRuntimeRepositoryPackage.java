/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.repo;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.smeup.sys.rt.repo.QRuntimeRepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface QRuntimeRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "repo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/rt/repo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rt-repo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QRuntimeRepositoryPackage eINSTANCE = org.smeup.sys.rt.repo.impl.RuntimeRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.rt.repo.QRepositoryManager <em>Repository Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.rt.repo.QRepositoryManager
	 * @see org.smeup.sys.rt.repo.impl.RuntimeRepositoryPackageImpl#getRepositoryManager()
	 * @generated
	 */
	int REPOSITORY_MANAGER = 0;

	/**
	 * The number of structural features of the '<em>Repository Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check Updates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_MANAGER___CHECK_UPDATES__STRING = 0;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_MANAGER___UPDATE__STRING = 1;

	/**
	 * The number of operations of the '<em>Repository Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_MANAGER_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.rt.repo.QRepositoryManager <em>Repository Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Manager</em>'.
	 * @see org.smeup.sys.rt.repo.QRepositoryManager
	 * @generated
	 */
	EClass getRepositoryManager();

	/**
	 * Returns the meta object for the '{@link org.smeup.sys.rt.repo.QRepositoryManager#checkUpdates(java.lang.String) <em>Check Updates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Updates</em>' operation.
	 * @see org.smeup.sys.rt.repo.QRepositoryManager#checkUpdates(java.lang.String)
	 * @generated
	 */
	EOperation getRepositoryManager__CheckUpdates__String();

	/**
	 * Returns the meta object for the '{@link org.smeup.sys.rt.repo.QRepositoryManager#update(java.lang.String) <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see org.smeup.sys.rt.repo.QRepositoryManager#update(java.lang.String)
	 * @generated
	 */
	EOperation getRepositoryManager__Update__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QRuntimeRepositoryFactory getRuntimeRepositoryFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.rt.repo.QRepositoryManager <em>Repository Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.rt.repo.QRepositoryManager
		 * @see org.smeup.sys.rt.repo.impl.RuntimeRepositoryPackageImpl#getRepositoryManager()
		 * @generated
		 */
		EClass REPOSITORY_MANAGER = eINSTANCE.getRepositoryManager();

		/**
		 * The meta object literal for the '<em><b>Check Updates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPOSITORY_MANAGER___CHECK_UPDATES__STRING = eINSTANCE.getRepositoryManager__CheckUpdates__String();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPOSITORY_MANAGER___UPDATE__STRING = eINSTANCE.getRepositoryManager__Update__String();

	}

} //QRuntimeRepositoryPackage
