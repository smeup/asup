/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.lock;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Object Lockable</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.lock.QObjectLockable#getLockRead <em>Lock Read</em>}</li>
 *   <li>{@link org.smeup.sys.il.lock.QObjectLockable#getLockWrite <em>Lock Write</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.lock.QIntegratedLanguageLockPackage#getObjectLockable()
 * @model abstract="true"
 * @generated
 */
public interface QObjectLockable extends QObject {
	/**
	 * Returns the value of the '<em><b>Lock Read</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock Read</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Read</em>' containment reference.
	 * @see #setLockRead(QLockRead)
	 * @see org.smeup.sys.il.lock.QIntegratedLanguageLockPackage#getObjectLockable_LockRead()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QLockRead getLockRead();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.lock.QObjectLockable#getLockRead <em>Lock Read</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Lock Read</em>' containment reference.
	 * @see #getLockRead()
	 * @generated
	 */
	void setLockRead(QLockRead value);

	/**
	 * Returns the value of the '<em><b>Lock Write</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock Write</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Write</em>' containment reference.
	 * @see #setLockWrite(QLockWrite)
	 * @see org.smeup.sys.il.lock.QIntegratedLanguageLockPackage#getObjectLockable_LockWrite()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QLockWrite getLockWrite();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.lock.QObjectLockable#getLockWrite <em>Lock Write</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Lock Write</em>' containment reference.
	 * @see #getLockWrite()
	 * @generated
	 */
	void setLockWrite(QLockWrite value);

} // QObjectLockable
