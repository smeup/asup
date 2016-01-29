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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.core.impl.ObjectImpl;
import org.smeup.sys.il.core.meta.QCardinality;
import org.smeup.sys.os.cmd.CommandStatus;
import org.smeup.sys.os.cmd.QCommandData;
import org.smeup.sys.os.cmd.QCommandParameter;
import org.smeup.sys.os.cmd.QOperatingSystemCommandPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QCommand Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.cmd.impl.CommandParameterImpl#isAllowVariable <em>Allow Variable</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.impl.CommandParameterImpl#getDataTerm <em>Data Term</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.impl.CommandParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.impl.CommandParameterImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.impl.CommandParameterImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.smeup.sys.os.cmd.impl.CommandParameterImpl#isHidden <em>Hidden</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandParameterImpl extends ObjectImpl implements QCommandParameter {
	/**
	 * The default value of the '{@link #isAllowVariable() <em>Allow Variable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isAllowVariable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_VARIABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowVariable() <em>Allow Variable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isAllowVariable()
	 * @generated
	 * @ordered
	 */
	protected boolean allowVariable = ALLOW_VARIABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataTerm() <em>Data Term</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataTerm()
	 * @generated
	 * @ordered
	 */
	protected QCommandData dataTerm;

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
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CommandStatus STATUS_EDEFAULT = CommandStatus.SUPPORTED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CommandStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected boolean hidden = HIDDEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperatingSystemCommandPackage.Literals.COMMAND_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowVariable() {
		return allowVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowVariable(boolean newAllowVariable) {
		boolean oldAllowVariable = allowVariable;
		allowVariable = newAllowVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND_PARAMETER__ALLOW_VARIABLE, oldAllowVariable, allowVariable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCommandData getDataTerm() {
		return dataTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTerm(QCommandData newDataTerm, NotificationChain msgs) {
		QCommandData oldDataTerm = dataTerm;
		dataTerm = newDataTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND_PARAMETER__DATA_TERM, oldDataTerm, newDataTerm);
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
	public void setDataTerm(QCommandData newDataTerm) {
		if (newDataTerm != dataTerm) {
			NotificationChain msgs = null;
			if (dataTerm != null)
				msgs = ((InternalEObject)dataTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemCommandPackage.COMMAND_PARAMETER__DATA_TERM, null, msgs);
			if (newDataTerm != null)
				msgs = ((InternalEObject)newDataTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QOperatingSystemCommandPackage.COMMAND_PARAMETER__DATA_TERM, null, msgs);
			msgs = basicSetDataTerm(newDataTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND_PARAMETER__DATA_TERM, newDataTerm, newDataTerm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(int newPosition) {
		int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND_PARAMETER__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean isRequired() {
		QCardinality cardinality = getDataTerm().getCardinality();
		if (cardinality != null && cardinality.getMin() > 0)
			return true;
		else
			return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public boolean isSupported() {
		boolean result = false;
		if (getStatus() == CommandStatus.TODO || getStatus() == CommandStatus.SUPPORTED)
			result = true;
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__DATA_TERM:
				return basicSetDataTerm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(CommandStatus newStatus) {
		CommandStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND_PARAMETER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHidden() {
		return hidden;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHidden(boolean newHidden) {
		boolean oldHidden = hidden;
		hidden = newHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperatingSystemCommandPackage.COMMAND_PARAMETER__HIDDEN, oldHidden, hidden));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCompound() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMany() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__ALLOW_VARIABLE:
				return isAllowVariable();
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__DATA_TERM:
				return getDataTerm();
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__NAME:
				return getName();
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__POSITION:
				return getPosition();
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__STATUS:
				return getStatus();
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__HIDDEN:
				return isHidden();
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
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__ALLOW_VARIABLE:
				setAllowVariable((Boolean)newValue);
				return;
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__DATA_TERM:
				setDataTerm((QCommandData)newValue);
				return;
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__POSITION:
				setPosition((Integer)newValue);
				return;
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__STATUS:
				setStatus((CommandStatus)newValue);
				return;
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__HIDDEN:
				setHidden((Boolean)newValue);
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
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__ALLOW_VARIABLE:
				setAllowVariable(ALLOW_VARIABLE_EDEFAULT);
				return;
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__DATA_TERM:
				setDataTerm((QCommandData)null);
				return;
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__HIDDEN:
				setHidden(HIDDEN_EDEFAULT);
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
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__ALLOW_VARIABLE:
				return allowVariable != ALLOW_VARIABLE_EDEFAULT;
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__DATA_TERM:
				return dataTerm != null;
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__POSITION:
				return position != POSITION_EDEFAULT;
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__STATUS:
				return status != STATUS_EDEFAULT;
			case QOperatingSystemCommandPackage.COMMAND_PARAMETER__HIDDEN:
				return hidden != HIDDEN_EDEFAULT;
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
		result.append(" (allowVariable: ");
		result.append(allowVariable);
		result.append(", name: ");
		result.append(name);
		result.append(", position: ");
		result.append(position);
		result.append(", status: ");
		result.append(status);
		result.append(", hidden: ");
		result.append(hidden);
		result.append(')');
		return result.toString();
	}

} // QCommandParameterImpl
