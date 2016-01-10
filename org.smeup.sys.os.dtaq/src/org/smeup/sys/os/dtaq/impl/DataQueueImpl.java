/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.dtaq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.smeup.sys.il.lock.QIntegratedLanguageLockPackage;
import org.smeup.sys.il.lock.QLockRead;
import org.smeup.sys.il.lock.QLockWrite;
import org.smeup.sys.il.lock.QObjectLockable;

import org.smeup.sys.os.dtaq.DataQueueType;
import org.smeup.sys.os.dtaq.QDataQueue;
import org.smeup.sys.os.dtaq.QDataQueueContent;
import org.smeup.sys.os.dtaq.QOperatingSystemDataQueuePackage;

import org.smeup.sys.os.type.impl.TypedObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.dtaq.impl.DataQueueImpl#getLockRead <em>Lock Read</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.impl.DataQueueImpl#getLockWrite <em>Lock Write</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.impl.DataQueueImpl#getDataQueueType <em>Data Queue Type</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.impl.DataQueueImpl#getKeyLength <em>Key Length</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.impl.DataQueueImpl#getMaxEntryLength <em>Max Entry Length</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.impl.DataQueueImpl#isSenderInfo <em>Sender Info</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.impl.DataQueueImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataQueueImpl extends TypedObjectImpl implements QDataQueue {
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
	 * The default value of the '{@link #getDataQueueType() <em>Data Queue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataQueueType()
	 * @generated
	 * @ordered
	 */
	protected static final DataQueueType DATA_QUEUE_TYPE_EDEFAULT = DataQueueType.FIFO;

	/**
	 * The cached value of the '{@link #getDataQueueType() <em>Data Queue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataQueueType()
	 * @generated
	 * @ordered
	 */
	protected DataQueueType dataQueueType = DATA_QUEUE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyLength() <em>Key Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyLength()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKeyLength() <em>Key Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyLength()
	 * @generated
	 * @ordered
	 */
	protected int keyLength = KEY_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxEntryLength() <em>Max Entry Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEntryLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ENTRY_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxEntryLength() <em>Max Entry Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEntryLength()
	 * @generated
	 * @ordered
	 */
	protected int maxEntryLength = MAX_ENTRY_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isSenderInfo() <em>Sender Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSenderInfo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SENDER_INFO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSenderInfo() <em>Sender Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSenderInfo()
	 * @generated
	 * @ordered
	 */
	protected boolean senderInfo = SENDER_INFO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected QDataQueueContent content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataQueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemDataQueuePackage.Literals.DATA_QUEUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_READ, oldLockRead, newLockRead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockRead(QLockRead newLockRead) {
		if (newLockRead != lockRead) {
			NotificationChain msgs = null;
			if (lockRead != null)
				msgs = ((InternalEObject)lockRead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_READ, null, msgs);
			if (newLockRead != null)
				msgs = ((InternalEObject)newLockRead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_READ, null, msgs);
			msgs = basicSetLockRead(newLockRead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_READ, newLockRead, newLockRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_WRITE, oldLockWrite, newLockWrite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockWrite(QLockWrite newLockWrite) {
		if (newLockWrite != lockWrite) {
			NotificationChain msgs = null;
			if (lockWrite != null)
				msgs = ((InternalEObject)lockWrite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_WRITE, null, msgs);
			if (newLockWrite != null)
				msgs = ((InternalEObject)newLockWrite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_WRITE, null, msgs);
			msgs = basicSetLockWrite(newLockWrite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_WRITE, newLockWrite, newLockWrite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataQueueType getDataQueueType() {
		return dataQueueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataQueueType(DataQueueType newDataQueueType) {
		DataQueueType oldDataQueueType = dataQueueType;
		dataQueueType = newDataQueueType == null ? DATA_QUEUE_TYPE_EDEFAULT : newDataQueueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__DATA_QUEUE_TYPE, oldDataQueueType, dataQueueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getKeyLength() {
		return keyLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyLength(int newKeyLength) {
		int oldKeyLength = keyLength;
		keyLength = newKeyLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__KEY_LENGTH, oldKeyLength, keyLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxEntryLength() {
		return maxEntryLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxEntryLength(int newMaxEntryLength) {
		int oldMaxEntryLength = maxEntryLength;
		maxEntryLength = newMaxEntryLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__MAX_ENTRY_LENGTH, oldMaxEntryLength, maxEntryLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSenderInfo() {
		return senderInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSenderInfo(boolean newSenderInfo) {
		boolean oldSenderInfo = senderInfo;
		senderInfo = newSenderInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__SENDER_INFO, oldSenderInfo, senderInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDataQueueContent getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(QDataQueueContent newContent, NotificationChain msgs) {
		QDataQueueContent oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(QDataQueueContent newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_READ:
				return basicSetLockRead(null, msgs);
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_WRITE:
				return basicSetLockWrite(null, msgs);
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT:
				return basicSetContent(null, msgs);
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
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_READ:
				return getLockRead();
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_WRITE:
				return getLockWrite();
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__DATA_QUEUE_TYPE:
				return getDataQueueType();
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__KEY_LENGTH:
				return getKeyLength();
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__MAX_ENTRY_LENGTH:
				return getMaxEntryLength();
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__SENDER_INFO:
				return isSenderInfo();
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT:
				return getContent();
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
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_READ:
				setLockRead((QLockRead)newValue);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_WRITE:
				setLockWrite((QLockWrite)newValue);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__DATA_QUEUE_TYPE:
				setDataQueueType((DataQueueType)newValue);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__KEY_LENGTH:
				setKeyLength((Integer)newValue);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__MAX_ENTRY_LENGTH:
				setMaxEntryLength((Integer)newValue);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__SENDER_INFO:
				setSenderInfo((Boolean)newValue);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT:
				setContent((QDataQueueContent)newValue);
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
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_READ:
				setLockRead((QLockRead)null);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_WRITE:
				setLockWrite((QLockWrite)null);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__DATA_QUEUE_TYPE:
				setDataQueueType(DATA_QUEUE_TYPE_EDEFAULT);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__KEY_LENGTH:
				setKeyLength(KEY_LENGTH_EDEFAULT);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__MAX_ENTRY_LENGTH:
				setMaxEntryLength(MAX_ENTRY_LENGTH_EDEFAULT);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__SENDER_INFO:
				setSenderInfo(SENDER_INFO_EDEFAULT);
				return;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT:
				setContent((QDataQueueContent)null);
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
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_READ:
				return lockRead != null;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_WRITE:
				return lockWrite != null;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__DATA_QUEUE_TYPE:
				return dataQueueType != DATA_QUEUE_TYPE_EDEFAULT;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__KEY_LENGTH:
				return keyLength != KEY_LENGTH_EDEFAULT;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__MAX_ENTRY_LENGTH:
				return maxEntryLength != MAX_ENTRY_LENGTH_EDEFAULT;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__SENDER_INFO:
				return senderInfo != SENDER_INFO_EDEFAULT;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__CONTENT:
				return content != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == QObjectLockable.class) {
			switch (derivedFeatureID) {
				case QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_READ: return QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_READ;
				case QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_WRITE: return QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_WRITE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == QObjectLockable.class) {
			switch (baseFeatureID) {
				case QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_READ: return QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_READ;
				case QIntegratedLanguageLockPackage.OBJECT_LOCKABLE__LOCK_WRITE: return QOperatingSystemDataQueuePackage.DATA_QUEUE__LOCK_WRITE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataQueueType: ");
		result.append(dataQueueType);
		result.append(", keyLength: ");
		result.append(keyLength);
		result.append(", maxEntryLength: ");
		result.append(maxEntryLength);
		result.append(", senderInfo: ");
		result.append(senderInfo);
		result.append(')');
		return result.toString();
	}

} //DataQueueImpl
