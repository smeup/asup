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
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.QBinaryDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Binary Def</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.impl.BinaryDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.impl.BinaryDefImpl#isUnsigned <em>Unsigned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryDefImpl extends UnaryAtomicBufferedDataDefImpl<QBinary> implements QBinaryDef {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryType TYPE_EDEFAULT = BinaryType.BYTE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BinaryType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnsigned() <em>Unsigned</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isUnsigned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNSIGNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnsigned() <em>Unsigned</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isUnsigned()
	 * @generated
	 * @ordered
	 */
	protected boolean unsigned = UNSIGNED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataDefPackage.Literals.BINARY_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(BinaryType newType) {
		BinaryType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.BINARY_DEF__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnsigned() {
		return unsigned;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnsigned(boolean newUnsigned) {
		boolean oldUnsigned = unsigned;
		unsigned = newUnsigned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.BINARY_DEF__UNSIGNED, oldUnsigned, unsigned));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public int getLength() {

		int length = 0;

		switch (getType()) {
		case BYTE:
			length = 3;
			break;
		case SHORT:
			length = 5;
			break;
		case INTEGER:
			length = 10;
			break;
		case LONG:
			length = 20;
			break;
		}

		return length;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public int getSize() {

		int size = 0;

		switch (getType()) {
		case BYTE:
			size = 1;
			break;
		case SHORT:
			size = 2;
			break;
		case INTEGER:
			size = 4;
			break;
		case LONG:
			size = 8;
			break;
		}

		return size;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageDataDefPackage.BINARY_DEF__TYPE:
				return getType();
			case QIntegratedLanguageDataDefPackage.BINARY_DEF__UNSIGNED:
				return isUnsigned();
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
			case QIntegratedLanguageDataDefPackage.BINARY_DEF__TYPE:
				setType((BinaryType)newValue);
				return;
			case QIntegratedLanguageDataDefPackage.BINARY_DEF__UNSIGNED:
				setUnsigned((Boolean)newValue);
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
			case QIntegratedLanguageDataDefPackage.BINARY_DEF__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case QIntegratedLanguageDataDefPackage.BINARY_DEF__UNSIGNED:
				setUnsigned(UNSIGNED_EDEFAULT);
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
			case QIntegratedLanguageDataDefPackage.BINARY_DEF__TYPE:
				return type != TYPE_EDEFAULT;
			case QIntegratedLanguageDataDefPackage.BINARY_DEF__UNSIGNED:
				return unsigned != UNSIGNED_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", unsigned: ");
		result.append(unsigned);
		result.append(')');
		return result.toString();
	}

	@Override
	public Class<?> getJavaClass() {
		switch (getType()) {
		case BYTE:
			return Byte.class;
		case INTEGER:
			return Integer.class;
		case LONG:
			return Long.class;
		case SHORT:
			return Short.class;
		}
		return null;
	}

	@Override
	public Class<QBinary> getDataClass() {
		return QBinary.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.BINARY;
	}
} // BinaryDefImpl
