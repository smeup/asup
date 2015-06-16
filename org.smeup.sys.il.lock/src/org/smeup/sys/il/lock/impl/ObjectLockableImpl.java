/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.lock.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.smeup.sys.il.core.impl.ObjectImpl;

import org.smeup.sys.il.lock.QIntegratedLanguageLockPackage;
import org.smeup.sys.il.lock.QLockRead;
import org.smeup.sys.il.lock.QLockWrite;
import org.smeup.sys.il.lock.QObjectLockable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Lockable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.il.lock.impl.ObjectLockableImpl#getLockRead <em>Lock Read</em>}</li>
 *   <li>{@link org.smeup.sys.il.lock.impl.ObjectLockableImpl#getLockWrite <em>Lock Write</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ObjectLockableImpl extends ObjectImpl implements QObjectLockable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getLockRead() <em>Lock Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockRead()
	 * @generated
	 * @ordered
	 */
	protected QLockRead lockRead;

	/**
	 * The cached value of the '{@link #getLockWrite() <em>Lock Write</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockWrite()
	 * @generated
	 * @ordered
	 */
	protected QLockWrite lockWrite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectLockableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageLockPackage.Literals.OBJECT_LOCKABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QLockRead getLockRead() {
		return lockRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLockRead(QLockRead newLockRead, NotificationChain msgs) {
		QLockRead oldLockRead = lockRead;
		lockRead = newLockRead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_READ, oldLockRead, newLockRead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockRead(QLockRead newLockRead) {
		if (newLockRead != lockRead) {
			NotificationChain msgs = null;
			if (lockRead != null)
				msgs = ((InternalEObject)lockRead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_READ, null, msgs);
			if (newLockRead != null)
				msgs = ((InternalEObject)newLockRead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_READ, null, msgs);
			msgs = basicSetLockRead(newLockRead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_READ, newLockRead, newLockRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QLockWrite getLockWrite() {
		return lockWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLockWrite(QLockWrite newLockWrite, NotificationChain msgs) {
		QLockWrite oldLockWrite = lockWrite;
		lockWrite = newLockWrite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_WRITE, oldLockWrite, newLockWrite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockWrite(QLockWrite newLockWrite) {
		if (newLockWrite != lockWrite) {
			NotificationChain msgs = null;
			if (lockWrite != null)
				msgs = ((InternalEObject)lockWrite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_WRITE, null, msgs);
			if (newLockWrite != null)
				msgs = ((InternalEObject)newLockWrite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_WRITE, null, msgs);
			msgs = basicSetLockWrite(newLockWrite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_WRITE, newLockWrite, newLockWrite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_READ:
				return basicSetLockRead(null, msgs);
			case QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_WRITE:
				return basicSetLockWrite(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_READ:
				return getLockRead();
			case QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_WRITE:
				return getLockWrite();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_READ:
				setLockRead((QLockRead)newValue);
				return;
			case QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_WRITE:
				setLockWrite((QLockWrite)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_READ:
				setLockRead((QLockRead)null);
				return;
			case QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_WRITE:
				setLockWrite((QLockWrite)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_READ:
				return lockRead != null;
			case QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_WRITE:
				return lockWrite != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectLockableImpl
