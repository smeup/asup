/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.cmd.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.os.cmd.CommandOrder;
import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.cmd.QCommandContainer;
import org.smeup.sys.os.cmd.QOperatingSystemCommandPackage;
import org.smeup.sys.os.type.impl.TypedContainerImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Command Container</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.cmd.impl.CommandContainerImpl#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandContainerImpl extends TypedContainerImpl<QCommand> implements QCommandContainer {
	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemCommandPackage.Literals.COMMAND_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND_CONTAINER__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public List<QCommand> getCommands(CommandOrder order) {

		List<QCommand> commandsList = new ArrayList<QCommand>(getContents());

		switch (order) {
		case NAME:
			Collections.sort(commandsList, new Comparator<QCommand>() {
				@Override
				public int compare(QCommand param1, QCommand param2) {
					return param1.getName().compareToIgnoreCase(param2.getName());
				}
			});
			break;
		}

		return commandsList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemCommandPackage.COMMAND_CONTAINER__TYPE_NAME:
				return getTypeName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperatingSystemCommandPackage.COMMAND_CONTAINER__TYPE_NAME:
				setTypeName((String)newValue);
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
			case QOperatingSystemCommandPackage.COMMAND_CONTAINER__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
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
			case QOperatingSystemCommandPackage.COMMAND_CONTAINER__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
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
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(')');
		return result.toString();
	}
} // CommandContainerImpl
