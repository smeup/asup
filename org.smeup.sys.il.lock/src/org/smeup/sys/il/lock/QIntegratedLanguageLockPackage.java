/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.lock;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

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
	 * The meta object id for the '{@link org.smeup.sys.il.lock.impl.LockReadImpl <em>Lock Read</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.lock.impl.LockReadImpl
	 * @see org.smeup.sys.il.lock.impl.IntegratedLanguageLockPackageImpl#getLockRead()
	 * @generated
	 */
	int LOCK_READ = 1;

	/**
	 * The number of structural features of the '<em>Lock Read</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LOCK_READ_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.lock.impl.LockWriteImpl <em>Lock Write</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.lock.impl.LockWriteImpl
	 * @see org.smeup.sys.il.lock.impl.IntegratedLanguageLockPackageImpl#getLockWrite()
	 * @generated
	 */
	int LOCK_WRITE = 2;

	/**
	 * The number of structural features of the '<em>Lock Write</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_WRITE_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.lock.impl.ObjectLockableImpl <em>Object Lockable</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.lock.impl.ObjectLockableImpl
	 * @see org.smeup.sys.il.lock.impl.IntegratedLanguageLockPackageImpl#getObjectLockable()
	 * @generated
	 */
	int OBJECT_LOCKABLE = 3;

	/**
	 * The feature id for the '<em><b>Lock Read</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_LOCKABLE__LOCK_READ = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lock Write</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_LOCKABLE__LOCK_WRITE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Lockable</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_LOCKABLE_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.lock.QObjectLocker
	 * <em>Object Locker</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.il.lock.QObjectLocker
	 * @see org.smeup.sys.il.lock.impl.IntegratedLanguageLockPackageImpl#getObjectLocker()
	 * @generated
	 */
	int OBJECT_LOCKER = 4;

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
	int LOCK_TYPE = 5;

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
	 * {@link org.smeup.sys.il.lock.QLockRead <em>Lock Read</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Lock Read</em>'.
	 * @see org.smeup.sys.il.lock.QLockRead
	 * @generated
	 */
	EClass getLockRead();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.lock.QLockWrite <em>Lock Write</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Lock Write</em>'.
	 * @see org.smeup.sys.il.lock.QLockWrite
	 * @generated
	 */
	EClass getLockWrite();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.lock.QObjectLockable <em>Object Lockable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Lockable</em>'.
	 * @see org.smeup.sys.il.lock.QObjectLockable
	 * @generated
	 */
	EClass getObjectLockable();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.lock.QObjectLockable#getLockRead <em>Lock Read</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lock Read</em>'.
	 * @see org.smeup.sys.il.lock.QObjectLockable#getLockRead()
	 * @see #getObjectLockable()
	 * @generated
	 */
	EReference getObjectLockable_LockRead();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.lock.QObjectLockable#getLockWrite <em>Lock Write</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lock Write</em>'.
	 * @see org.smeup.sys.il.lock.QObjectLockable#getLockWrite()
	 * @see #getObjectLockable()
	 * @generated
	 */
	EReference getObjectLockable_LockWrite();

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
		 * The meta object literal for the '{@link org.smeup.sys.il.lock.impl.LockReadImpl <em>Lock Read</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.lock.impl.LockReadImpl
		 * @see org.smeup.sys.il.lock.impl.IntegratedLanguageLockPackageImpl#getLockRead()
		 * @generated
		 */
		EClass LOCK_READ = eINSTANCE.getLockRead();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.lock.impl.LockWriteImpl <em>Lock Write</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.lock.impl.LockWriteImpl
		 * @see org.smeup.sys.il.lock.impl.IntegratedLanguageLockPackageImpl#getLockWrite()
		 * @generated
		 */
		EClass LOCK_WRITE = eINSTANCE.getLockWrite();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.lock.impl.ObjectLockableImpl <em>Object Lockable</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.lock.impl.ObjectLockableImpl
		 * @see org.smeup.sys.il.lock.impl.IntegratedLanguageLockPackageImpl#getObjectLockable()
		 * @generated
		 */
		EClass OBJECT_LOCKABLE = eINSTANCE.getObjectLockable();

		/**
		 * The meta object literal for the '<em><b>Lock Read</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_LOCKABLE__LOCK_READ = eINSTANCE.getObjectLockable_LockRead();

		/**
		 * The meta object literal for the '<em><b>Lock Write</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_LOCKABLE__LOCK_WRITE = eINSTANCE.getObjectLockable_LockWrite();

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
