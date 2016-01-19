/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.QOption;
import org.smeup.sys.db.syntax.dbl.QSetDescriptorStatement;

import org.smeup.sys.db.syntax.impl.BindingStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Descriptor Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.SetDescriptorStatementImpl#getDescriptorName <em>Descriptor Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.SetDescriptorStatementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.SetDescriptorStatementImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetDescriptorStatementImpl extends BindingStatementImpl implements QSetDescriptorStatement {
	/**
	 * The default value of the '{@link #getDescriptorName() <em>Descriptor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptorName()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptorName() <em>Descriptor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptorName()
	 * @generated
	 * @ordered
	 */
	protected String descriptorName = DESCRIPTOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<QOption> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetDescriptorStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDBLPackage.Literals.SET_DESCRIPTOR_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptorName() {
		return descriptorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptorName(String newDescriptorName) {
		String oldDescriptorName = descriptorName;
		descriptorName = newDescriptorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME, oldDescriptorName, descriptorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QOption> getItems() {
		if (items == null) {
			items = new EObjectResolvingEList<QOption>(QOption.class, this, QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME:
				return getDescriptorName();
			case QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT__VALUE:
				return getValue();
			case QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT__ITEMS:
				return getItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME:
				setDescriptorName((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT__VALUE:
				setValue((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends QOption>)newValue);
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
			case QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME:
				setDescriptorName(DESCRIPTOR_NAME_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT__ITEMS:
				getItems().clear();
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
			case QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME:
				return DESCRIPTOR_NAME_EDEFAULT == null ? descriptorName != null : !DESCRIPTOR_NAME_EDEFAULT.equals(descriptorName);
			case QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT__ITEMS:
				return items != null && !items.isEmpty();
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
		result.append(" (descriptorName: ");
		result.append(descriptorName);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SetDescriptorStatementImpl
