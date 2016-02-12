/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.lock;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.smeup.sys.il.lock.QIntegratedLanguageLockFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageLockPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lock";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/lock";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-lock";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageLockPackage eINSTANCE = org.smeup.sys.il.lock.impl.IntegratedLanguageLockPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.lock.QLockManager
	 * <em>Lock Manager</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.il.lock.QLockManager
	 * @see org.smeup.sys.il.lock.impl.IntegratedLanguageLockPackageImpl#getLockManager()
	 * @generated
	 */
	int LOCK_MANAGER = 0;

	/**
	 * The number of structural features of the '<em>Lock Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.lock.QObjectLocker
	 * <em>Object Locker</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.il.lock.QObjectLocker
	 * @see org.smeup.sys.il.lock.impl.IntegratedLanguageLockPackageImpl#getObjectLocker()
	 * @generated
	 */
	int OBJECT_LOCKER = 1;

	/**
	 * The number of structural features of the '<em>Object Locker</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_LOCKER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.lock.LockType <em>Lock Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.lock.LockType
	 * @see org.smeup.sys.il.lock.impl.IntegratedLanguageLockPackageImpl#getLockType()
	 * @generated
	 */
	int LOCK_TYPE = 2;

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.lock.QLockManager <em>Lock Manager</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Lock Manager</em>'.
	 * @see org.smeup.sys.il.lock.QLockManager
	 * @generated
	 */
	EClass getLockManager();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.lock.QObjectLocker <em>Object Locker</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Object Locker</em>'.
	 * @see org.smeup.sys.il.lock.QObjectLocker
	 * @generated
	 */
	EClass getObjectLocker();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.il.lock.LockType <em>Lock Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lock Type</em>'.
	 * @see org.smeup.sys.il.lock.LockType
	 * @generated
	 */
	EEnum getLockType();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageLockFactory getIntegratedLanguageLockFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.il.lock.QLockManager <em>Lock Manager</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.lock.QLockManager
		 * @see org.smeup.sys.il.lock.impl.IntegratedLanguageLockPackageImpl#getLockManager()
		 * @generated
		 */
		EClass LOCK_MANAGER = eINSTANCE.getLockManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.lock.QObjectLocker <em>Object Locker</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.lock.QObjectLocker
		 * @see org.smeup.sys.il.lock.impl.IntegratedLanguageLockPackageImpl#getObjectLocker()
		 * @generated
		 */
		EClass OBJECT_LOCKER = eINSTANCE.getObjectLocker();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.lock.LockType <em>Lock Type</em>}' enum. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.smeup.sys.il.lock.LockType
		 * @see org.smeup.sys.il.lock.impl.IntegratedLanguageLockPackageImpl#getLockType()
		 * @generated
		 */
		EEnum LOCK_TYPE = eINSTANCE.getLockType();

	}

} // QIntegratedLanguageLockPackage
