/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.lock;

import java.net.URI;
import org.smeup.sys.il.core.QObjectNameable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Locker</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.lock.QIntegratedLanguageLockPackage#getObjectLocker()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QObjectLocker<N extends QObjectNameable> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.smeup.sys.mi.core.JavaURI" required="true"
	 * @generated
	 */
	URI getAddress();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model lockTypeRequired="true"
	 * @generated
	 */
	void lock(LockType lockType);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model lockTypeRequired="true"
	 * @generated
	 */
	boolean tryLock(long time, LockType lockType);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model lockTypeRequired="true"
	 * @generated
	 */
	void unlock(LockType lockType);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model lockTypeRequired="true"
	 * @generated
	 */
	boolean isLocked(LockType lockType);

} // QObjectLocker
