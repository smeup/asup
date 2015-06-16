/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.cmd.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.os.cmd.QCallableCommand;
import org.smeup.sys.os.cmd.QCommand;
import org.smeup.sys.os.cmd.QOperatingSystemCommandPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QCallable Command</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.cmd.impl.CallableCommandImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.impl.CallableCommandImpl#getCommandString <em>Command String</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.impl.CallableCommandImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.impl.CallableCommandImpl#getDataContainer <em>Data Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallableCommandImpl extends ObjectImpl implements QCallableCommand {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected QCommand command;

	/**
	 * The default value of the '{@link #getCommandString() <em>Command String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCommandString()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandString() <em>Command String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCommandString()
	 * @generated
	 * @ordered
	 */
	protected String commandString = COMMAND_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected Map<String, Object> variables;

	/**
	 * The cached value of the '{@link #getDataContainer() <em>Data Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataContainer()
	 * @generated
	 * @ordered
	 */
	protected QDataContainer dataContainer;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CallableCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemCommandPackage.Literals.CALLABLE_COMMAND;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCommand getCommand() {
		if (command != null && ((EObject)command).eIsProxy()) {
			InternalEObject oldCommand = (InternalEObject)command;
			command = (QCommand)eResolveProxy(oldCommand);
			if (command != oldCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QOperatingSystemCommandPackage.CALLABLE_COMMAND__COMMAND, oldCommand, command));
			}
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QCommand basicGetCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommand(QCommand newCommand) {
		QCommand oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.CALLABLE_COMMAND__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommandString() {
		return commandString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommandString(String newCommandString) {
		String oldCommandString = commandString;
		commandString = newCommandString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.CALLABLE_COMMAND__COMMAND_STRING, oldCommandString, commandString));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map<String, Object> getVariables() {
		return variables;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariables(Map<String, Object> newVariables) {
		Map<String, Object> oldVariables = variables;
		variables = newVariables;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.CALLABLE_COMMAND__VARIABLES, oldVariables, variables));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDataContainer getDataContainer() {
		return dataContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataContainer(QDataContainer newDataContainer, NotificationChain msgs) {
		QDataContainer oldDataContainer = dataContainer;
		dataContainer = newDataContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.CALLABLE_COMMAND__DATA_CONTAINER, oldDataContainer, newDataContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataContainer(QDataContainer newDataContainer) {
		if (newDataContainer != dataContainer) {
			NotificationChain msgs = null;
			if (dataContainer != null)
				msgs = ((InternalEObject)dataContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemCommandPackage.CALLABLE_COMMAND__DATA_CONTAINER, null, msgs);
			if (newDataContainer != null)
				msgs = ((InternalEObject)newDataContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemCommandPackage.CALLABLE_COMMAND__DATA_CONTAINER, null, msgs);
			msgs = basicSetDataContainer(newDataContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.CALLABLE_COMMAND__DATA_CONTAINER, newDataContainer, newDataContainer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__DATA_CONTAINER:
				return basicSetDataContainer(null, msgs);
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
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__COMMAND:
				if (resolve) return getCommand();
				return basicGetCommand();
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__COMMAND_STRING:
				return getCommandString();
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__VARIABLES:
				return getVariables();
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__DATA_CONTAINER:
				return getDataContainer();
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
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__COMMAND:
				setCommand((QCommand)newValue);
				return;
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__COMMAND_STRING:
				setCommandString((String)newValue);
				return;
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__VARIABLES:
				setVariables((Map<String, Object>)newValue);
				return;
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__DATA_CONTAINER:
				setDataContainer((QDataContainer)newValue);
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
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__COMMAND:
				setCommand((QCommand)null);
				return;
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__COMMAND_STRING:
				setCommandString(COMMAND_STRING_EDEFAULT);
				return;
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__VARIABLES:
				setVariables((Map<String, Object>)null);
				return;
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__DATA_CONTAINER:
				setDataContainer((QDataContainer)null);
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
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__COMMAND:
				return command != null;
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__COMMAND_STRING:
				return COMMAND_STRING_EDEFAULT == null ? commandString != null : !COMMAND_STRING_EDEFAULT.equals(commandString);
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__VARIABLES:
				return variables != null;
			case QOperatingSystemCommandPackage.CALLABLE_COMMAND__DATA_CONTAINER:
				return dataContainer != null;
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
		result.append(" (commandString: ");
		result.append(commandString);
		result.append(", variables: ");
		result.append(variables);
		result.append(')');
		return result.toString();
	}

} // CallableCommandImpl
