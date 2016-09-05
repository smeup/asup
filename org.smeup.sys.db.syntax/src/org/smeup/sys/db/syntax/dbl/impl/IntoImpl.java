/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage;
import org.smeup.sys.db.syntax.dbl.QInto;
import org.smeup.sys.db.syntax.dbl.UsingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Into Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.IntoImpl#getDescriptorName <em>Descriptor Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.impl.IntoImpl#getUsing <em>Using</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntoImpl extends EObjectImpl implements QInto {
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
	 * The default value of the '{@link #getUsing() <em>Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsing()
	 * @generated
	 * @ordered
	 */
	protected static final UsingType USING_EDEFAULT = UsingType.NONE;

	/**
	 * The cached value of the '{@link #getUsing() <em>Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsing()
	 * @generated
	 * @ordered
	 */
	protected UsingType using = USING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseSyntaxDBLPackage.Literals.INTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.INTO__DESCRIPTOR_NAME, oldDescriptorName, descriptorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsingType getUsing() {
		return using;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsing(UsingType newUsing) {
		UsingType oldUsing = using;
		using = newUsing == null ? USING_EDEFAULT : newUsing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDatabaseSyntaxDBLPackage.INTO__USING, oldUsing, using));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDatabaseSyntaxDBLPackage.INTO__DESCRIPTOR_NAME:
				return getDescriptorName();
			case QDatabaseSyntaxDBLPackage.INTO__USING:
				return getUsing();
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
			case QDatabaseSyntaxDBLPackage.INTO__DESCRIPTOR_NAME:
				setDescriptorName((String)newValue);
				return;
			case QDatabaseSyntaxDBLPackage.INTO__USING:
				setUsing((UsingType)newValue);
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
			case QDatabaseSyntaxDBLPackage.INTO__DESCRIPTOR_NAME:
				setDescriptorName(DESCRIPTOR_NAME_EDEFAULT);
				return;
			case QDatabaseSyntaxDBLPackage.INTO__USING:
				setUsing(USING_EDEFAULT);
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
			case QDatabaseSyntaxDBLPackage.INTO__DESCRIPTOR_NAME:
				return DESCRIPTOR_NAME_EDEFAULT == null ? descriptorName != null : !DESCRIPTOR_NAME_EDEFAULT.equals(descriptorName);
			case QDatabaseSyntaxDBLPackage.INTO__USING:
				return using != USING_EDEFAULT;
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
		result.append(", using: ");
		result.append(using);
		result.append(')');
		return result.toString();
	}

} //IntoClauseImpl
