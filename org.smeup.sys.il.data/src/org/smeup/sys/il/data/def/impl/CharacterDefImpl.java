/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QDefPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Character Def</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.impl.CharacterDefImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.impl.CharacterDefImpl#isVarying <em>Varying</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterDefImpl extends UnaryAtomicBufferedDataDefImpl<QCharacter> implements QCharacterDef {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isVarying() <em>Varying</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isVarying()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VARYING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVarying() <em>Varying</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isVarying()
	 * @generated
	 * @ordered
	 */
	protected boolean varying = VARYING_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDefPackage.Literals.CHARACTER_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getSize() {
		if(isVarying())
			return getLength()+2;
		else
			return getLength();
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDefPackage.CHARACTER_DEF__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVarying() {
		return varying;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarying(boolean newVarying) {
		boolean oldVarying = varying;
		varying = newVarying;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDefPackage.CHARACTER_DEF__VARYING, oldVarying, varying));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDefPackage.CHARACTER_DEF__LENGTH:
				return getLength();
			case QDefPackage.CHARACTER_DEF__VARYING:
				return isVarying();
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
			case QDefPackage.CHARACTER_DEF__LENGTH:
				setLength((Integer)newValue);
				return;
			case QDefPackage.CHARACTER_DEF__VARYING:
				setVarying((Boolean)newValue);
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
			case QDefPackage.CHARACTER_DEF__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case QDefPackage.CHARACTER_DEF__VARYING:
				setVarying(VARYING_EDEFAULT);
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
			case QDefPackage.CHARACTER_DEF__LENGTH:
				return length != LENGTH_EDEFAULT;
			case QDefPackage.CHARACTER_DEF__VARYING:
				return varying != VARYING_EDEFAULT;
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
		result.append(" (length: ");
		result.append(length);
		result.append(", varying: ");
		result.append(varying);
		result.append(')');
		return result.toString();
	}

	@Override
	public Class<?> getJavaClass() {
		return String.class;
	}

	@Override
	public Class<QCharacter> getDataClass() {
		return QCharacter.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.CHARACTER;
	}
} // CharacterDefImpl
