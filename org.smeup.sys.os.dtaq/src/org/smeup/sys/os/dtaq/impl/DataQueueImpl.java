/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.dtaq.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.os.dtaq.DataQueueSequence;
import org.smeup.sys.os.dtaq.QDataQueue;
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
 *   <li>{@link org.smeup.sys.os.dtaq.impl.DataQueueImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.impl.DataQueueImpl#getKeyLength <em>Key Length</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.impl.DataQueueImpl#getMaxEntryLength <em>Max Entry Length</em>}</li>
 *   <li>{@link org.smeup.sys.os.dtaq.impl.DataQueueImpl#isSenderInfo <em>Sender Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataQueueImpl extends TypedObjectImpl implements QDataQueue {
	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final DataQueueSequence SEQUENCE_EDEFAULT = DataQueueSequence.FIFO;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected DataQueueSequence sequence = SEQUENCE_EDEFAULT;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	public DataQueueSequence getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(DataQueueSequence newSequence) {
		DataQueueSequence oldSequence = sequence;
		sequence = newSequence == null ? SEQUENCE_EDEFAULT : newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemDataQueuePackage.DATA_QUEUE__SEQUENCE, oldSequence, sequence));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__SEQUENCE:
				return getSequence();
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__KEY_LENGTH:
				return getKeyLength();
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__MAX_ENTRY_LENGTH:
				return getMaxEntryLength();
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__SENDER_INFO:
				return isSenderInfo();
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
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__SEQUENCE:
				setSequence((DataQueueSequence)newValue);
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
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__SEQUENCE:
				setSequence(SEQUENCE_EDEFAULT);
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
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__SEQUENCE:
				return sequence != SEQUENCE_EDEFAULT;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__KEY_LENGTH:
				return keyLength != KEY_LENGTH_EDEFAULT;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__MAX_ENTRY_LENGTH:
				return maxEntryLength != MAX_ENTRY_LENGTH_EDEFAULT;
			case QOperatingSystemDataQueuePackage.DATA_QUEUE__SENDER_INFO:
				return senderInfo != SENDER_INFO_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (sequence: ");
		result.append(sequence);
		result.append(", keyLength: ");
		result.append(keyLength);
		result.append(", maxEntryLength: ");
		result.append(maxEntryLength);
		result.append(", senderInfo: ");
		result.append(senderInfo);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getAttribute() {
		return null;
	}
} //DataQueueImpl
