/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.smeup.sys.db.syntax.dbl.DescriptorScope;
import org.smeup.sys.db.syntax.dbl.QAllocateDescriptorStatement;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;

import org.smeup.sys.db.syntax.impl.BindingStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocate Descriptor Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.AllocateDescriptorStatementImpl#getDescriptorName <em>Descriptor Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.AllocateDescriptorStatementImpl#getDescriptorScope <em>Descriptor Scope</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.AllocateDescriptorStatementImpl#getWithMax <em>With Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllocateDescriptorStatementImpl extends BindingStatementImpl implements QAllocateDescriptorStatement {
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
	 * The default value of the '{@link #getWithMax() <em>With Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithMax()
	 * @generated
	 * @ordered
	 */
	protected static final String WITH_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWithMax() <em>With Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithMax()
	 * @generated
	 * @ordered
	 */
	protected String withMax = WITH_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocateDescriptorStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDBLPackage.Literals.ALLOCATE_DESCRIPTOR_STATEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME, oldDescriptorName, descriptorName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE, oldDescriptorScope, descriptorScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWithMax() {
		return withMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithMax(String newWithMax) {
		String oldWithMax = withMax;
		withMax = newWithMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT__WITH_MAX, oldWithMax, withMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME:
				return getDescriptorName();
			case QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE:
				return getDescriptorScope();
			case QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT__WITH_MAX:
				return getWithMax();
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
			case QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME:
				setDescriptorName((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE:
				setDescriptorScope((DescriptorScope)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT__WITH_MAX:
				setWithMax((String)newValue);
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
			case QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME:
				setDescriptorName(DESCRIPTOR_NAME_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE:
				setDescriptorScope(DESCRIPTOR_SCOPE_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT__WITH_MAX:
				setWithMax(WITH_MAX_EDEFAULT);
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
			case QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_NAME:
				return DESCRIPTOR_NAME_EDEFAULT == null ? descriptorName != null : !DESCRIPTOR_NAME_EDEFAULT.equals(descriptorName);
			case QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT__DESCRIPTOR_SCOPE:
				return descriptorScope != DESCRIPTOR_SCOPE_EDEFAULT;
			case QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT__WITH_MAX:
				return WITH_MAX_EDEFAULT == null ? withMax != null : !WITH_MAX_EDEFAULT.equals(withMax);
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
		result.append(", withMax: ");
		result.append(withMax);
		result.append(')');
		return result.toString();
	}

} //AllocateDescriptorStatementImpl
