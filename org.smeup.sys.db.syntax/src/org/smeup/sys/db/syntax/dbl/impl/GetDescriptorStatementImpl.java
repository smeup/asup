/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
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

import org.smeup.sys.db.syntax.dbl.DescriptorScope;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.QGetDescriptorStatement;
import org.smeup.sys.db.syntax.dbl.QOption;

import org.smeup.sys.db.syntax.impl.BindingStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Descriptor Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.GetDescriptorStatementImpl#getDescriptorName <em>Descriptor Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.GetDescriptorStatementImpl#getDescriptorScope <em>Descriptor Scope</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.GetDescriptorStatementImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.GetDescriptorStatementImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetDescriptorStatementImpl extends BindingStatementImpl implements QGetDescriptorStatement {
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
	 * The default value of the '{@link #getDescriptorScope() <em>Descriptor Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptorScope()
	 * @generated
	 * @ordered
	 */
	protected static final DescriptorScope DESCRIPTOR_SCOPE_EDEFAULT = DescriptorScope.NONE;

	/**
	 * The cached value of the '{@link #getDescriptorScope() <em>Descriptor Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptorScope()
	 * @generated
	 * @ordered
	 */
	protected DescriptorScope descriptorScope = DESCRIPTOR_SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected String index = INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<QOption> options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetDescriptorStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDBLPackage.Literals.GET_DESCRIPTOR_STATEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME, oldDescriptorName, descriptorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptorScope getDescriptorScope() {
		return descriptorScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptorScope(DescriptorScope newDescriptorScope) {
		DescriptorScope oldDescriptorScope = descriptorScope;
		descriptorScope = newDescriptorScope == null ? DESCRIPTOR_SCOPE_EDEFAULT : newDescriptorScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE, oldDescriptorScope, descriptorScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(String newIndex) {
		String oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QOption> getOptions() {
		if (options == null) {
			options = new EObjectResolvingEList<QOption>(QOption.class, this, QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME:
				return getDescriptorName();
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE:
				return getDescriptorScope();
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__INDEX:
				return getIndex();
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__OPTIONS:
				return getOptions();
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
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME:
				setDescriptorName((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE:
				setDescriptorScope((DescriptorScope)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__INDEX:
				setIndex((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends QOption>)newValue);
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
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME:
				setDescriptorName(DESCRIPTOR_NAME_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE:
				setDescriptorScope(DESCRIPTOR_SCOPE_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__OPTIONS:
				getOptions().clear();
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
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME:
				return DESCRIPTOR_NAME_EDEFAULT == null ? descriptorName != null : !DESCRIPTOR_NAME_EDEFAULT.equals(descriptorName);
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE:
				return descriptorScope != DESCRIPTOR_SCOPE_EDEFAULT;
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT__OPTIONS:
				return options != null && !options.isEmpty();
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
		result.append(", descriptorScope: ");
		result.append(descriptorScope);
		result.append(", index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //GetDescriptorStatementImpl
