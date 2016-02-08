/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.msgf.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.smeup.sys.os.msgf.QMessageDescription;
import org.smeup.sys.os.msgf.QMessageFile;
import org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage;
import org.smeup.sys.os.type.impl.TypedObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Message File</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.msgf.impl.MessageFileImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageFileImpl extends TypedObjectImpl implements QMessageFile {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<QMessageDescription> messages;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemMessageFilePackage.Literals.MESSAGE_FILE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<QMessageDescription> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<QMessageDescription>(QMessageDescription.class, this, QOperatingSystemMessageFilePackage.MESSAGE_FILE__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public <E extends Enum<E>> QMessageDescription lookup(Enum<E> name) {
		return lookup(name.name());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public <E extends Enum<E>> QMessageDescription lookup(String name) {

		for (QMessageDescription messageDescription : getMessages())
			if (messageDescription.getName().equals(name))
				return messageDescription;

		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemMessageFilePackage.MESSAGE_FILE__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
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
			case QOperatingSystemMessageFilePackage.MESSAGE_FILE__MESSAGES:
				return getMessages();
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
			case QOperatingSystemMessageFilePackage.MESSAGE_FILE__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends QMessageDescription>)newValue);
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
			case QOperatingSystemMessageFilePackage.MESSAGE_FILE__MESSAGES:
				getMessages().clear();
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
			case QOperatingSystemMessageFilePackage.MESSAGE_FILE__MESSAGES:
				return messages != null && !messages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getAttribute() {
		return null;
	}
} // MessageFileImpl
