/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.msgf.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.os.msgf.QMessageDataField;
import org.smeup.sys.os.msgf.QMessageDescription;
import org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Message Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.msgf.impl.MessageDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.msgf.impl.MessageDescriptionImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.smeup.sys.os.msgf.impl.MessageDescriptionImpl#getMessageHelp <em>Message Help</em>}</li>
 *   <li>{@link org.smeup.sys.os.msgf.impl.MessageDescriptionImpl#getMessageText <em>Message Text</em>}</li>
 *   <li>{@link org.smeup.sys.os.msgf.impl.MessageDescriptionImpl#getMessageDataFields <em>Message Data Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageDescriptionImpl extends ObjectImpl implements QMessageDescription {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final int SEVERITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected int severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageHelp() <em>Message Help</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMessageHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_HELP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageHelp() <em>Message Help</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMessageHelp()
	 * @generated
	 * @ordered
	 */
	protected String messageHelp = MESSAGE_HELP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageText() <em>Message Text</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMessageText()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageText() <em>Message Text</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMessageText()
	 * @generated
	 * @ordered
	 */
	protected String messageText = MESSAGE_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageDataFields()
	 * <em>Message Data Fields</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMessageDataFields()
	 * @generated
	 * @ordered
	 */
	protected EList<QMessageDataField> messageDataFields;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemMessageFilePackage.Literals.MESSAGE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(int newSeverity) {
		int oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageHelp() {
		return messageHelp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageHelp(String newMessageHelp) {
		String oldMessageHelp = messageHelp;
		messageHelp = newMessageHelp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_HELP, oldMessageHelp, messageHelp));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageText() {
		return messageText;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageText(String newMessageText) {
		String oldMessageText = messageText;
		messageText = newMessageText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_TEXT, oldMessageText, messageText));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QMessageDataField> getMessageDataFields() {
		if (messageDataFields == null) {
			messageDataFields = new EObjectContainmentEList<QMessageDataField>(QMessageDataField.class, this, QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_DATA_FIELDS);
		}
		return messageDataFields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_DATA_FIELDS:
				return ((InternalEList<?>)getMessageDataFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__NAME:
				return getName();
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__SEVERITY:
				return getSeverity();
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_HELP:
				return getMessageHelp();
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_TEXT:
				return getMessageText();
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_DATA_FIELDS:
				return getMessageDataFields();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__NAME:
				setName((String)newValue);
				return;
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__SEVERITY:
				setSeverity((Integer)newValue);
				return;
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_HELP:
				setMessageHelp((String)newValue);
				return;
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_TEXT:
				setMessageText((String)newValue);
				return;
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_DATA_FIELDS:
				getMessageDataFields().clear();
				getMessageDataFields().addAll((Collection<? extends QMessageDataField>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_HELP:
				setMessageHelp(MESSAGE_HELP_EDEFAULT);
				return;
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_TEXT:
				setMessageText(MESSAGE_TEXT_EDEFAULT);
				return;
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_DATA_FIELDS:
				getMessageDataFields().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_HELP:
				return MESSAGE_HELP_EDEFAULT == null ? messageHelp != null : !MESSAGE_HELP_EDEFAULT.equals(messageHelp);
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_TEXT:
				return MESSAGE_TEXT_EDEFAULT == null ? messageText != null : !MESSAGE_TEXT_EDEFAULT.equals(messageText);
			case QOperatingSystemMessageFilePackage.MESSAGE_DESCRIPTION__MESSAGE_DATA_FIELDS:
				return messageDataFields != null && !messageDataFields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", severity: ");
		result.append(severity);
		result.append(", messageHelp: ");
		result.append(messageHelp);
		result.append(", messageText: ");
		result.append(messageText);
		result.append(')');
		return result.toString();
	}

} // MessageDescriptionImpl
