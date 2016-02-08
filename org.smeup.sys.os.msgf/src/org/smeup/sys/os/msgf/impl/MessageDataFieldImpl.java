/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.msgf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef;

import org.smeup.sys.il.data.term.impl.DataTermImpl;

import org.smeup.sys.os.msgf.QMessageDataField;
import org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Data Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.msgf.impl.MessageDataFieldImpl#getOutputMask <em>Output Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageDataFieldImpl extends DataTermImpl<QUnaryAtomicBufferedDataDef<?>> implements QMessageDataField {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getOutputMask() <em>Output Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMask()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputMask() <em>Output Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMask()
	 * @generated
	 * @ordered
	 */
	protected String outputMask = OUTPUT_MASK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageDataFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemMessageFilePackage.Literals.MESSAGE_DATA_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetDefinition(QUnaryAtomicBufferedDataDef<?> newDefinition, NotificationChain msgs) {
		return super.basicSetDefinition(newDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputMask() {
		return outputMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputMask(String newOutputMask) {
		String oldOutputMask = outputMask;
		outputMask = newOutputMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemMessageFilePackage.MESSAGE_DATA_FIELD__OUTPUT_MASK, oldOutputMask, outputMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemMessageFilePackage.MESSAGE_DATA_FIELD__OUTPUT_MASK:
				return getOutputMask();
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
			case QOperatingSystemMessageFilePackage.MESSAGE_DATA_FIELD__OUTPUT_MASK:
				setOutputMask((String)newValue);
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
			case QOperatingSystemMessageFilePackage.MESSAGE_DATA_FIELD__OUTPUT_MASK:
				setOutputMask(OUTPUT_MASK_EDEFAULT);
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
			case QOperatingSystemMessageFilePackage.MESSAGE_DATA_FIELD__OUTPUT_MASK:
				return OUTPUT_MASK_EDEFAULT == null ? outputMask != null : !OUTPUT_MASK_EDEFAULT.equals(outputMask);
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
		result.append(" (outputMask: ");
		result.append(outputMask);
		result.append(')');
		return result.toString();
	}

} //MessageDataFieldImpl
