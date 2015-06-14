/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.lock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locker</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.lock.QIntegratedLanguageLockPackage#getObjectLocker()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QObjectLocker<T extends QObjectLockable> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model lockTypeRequired="true"
	 * @generated
	 */
	void lock(LockType lockType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model lockTypeRequired="true"
	 * @generated
	 */
	boolean tryLock(long time, LockType lockType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model lockTypeRequired="true"
	 * @generated
	 */
	void unlock(LockType lockType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model lockTypeRequired="true"
	 * @generated
	 */
	boolean isLocked(LockType lockType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model lockTypeRequired="true"
	 * @generated
	 */
	boolean isLockedByOther(LockType lockType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	T getObject();

} // QObjectLocker
