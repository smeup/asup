/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.DecimalType;
import org.smeup.sys.il.data.def.QDecimalDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Decimal Def</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.impl.DecimalDefImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.impl.DecimalDefImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.impl.DecimalDefImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecimalDefImpl extends UnaryAtomicBufferedDataDefImpl<QDecimal> implements QDecimalDef {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECISION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected int precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected int scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DecimalType TYPE_EDEFAULT = DecimalType.ZONED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DecimalType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DecimalDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageDataDefPackage.Literals.DECIMAL_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecision(int newPrecision) {
		int oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.DECIMAL_DEF__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale(int newScale) {
		int oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.DECIMAL_DEF__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecimalType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(DecimalType newType) {
		DecimalType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QIntegratedLanguageDataDefPackage.DECIMAL_DEF__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public int getLength() {
		return getPrecision();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getSize() {
		if(getType().equals(DecimalType.PACKED))
			return getLength()/2+1;
		else
			return getLength();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QIntegratedLanguageDataDefPackage.DECIMAL_DEF__PRECISION:
				return getPrecision();
			case QIntegratedLanguageDataDefPackage.DECIMAL_DEF__SCALE:
				return getScale();
			case QIntegratedLanguageDataDefPackage.DECIMAL_DEF__TYPE:
				return getType();
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
			case QIntegratedLanguageDataDefPackage.DECIMAL_DEF__PRECISION:
				setPrecision((Integer)newValue);
				return;
			case QIntegratedLanguageDataDefPackage.DECIMAL_DEF__SCALE:
				setScale((Integer)newValue);
				return;
			case QIntegratedLanguageDataDefPackage.DECIMAL_DEF__TYPE:
				setType((DecimalType)newValue);
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
			case QIntegratedLanguageDataDefPackage.DECIMAL_DEF__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case QIntegratedLanguageDataDefPackage.DECIMAL_DEF__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case QIntegratedLanguageDataDefPackage.DECIMAL_DEF__TYPE:
				setType(TYPE_EDEFAULT);
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
			case QIntegratedLanguageDataDefPackage.DECIMAL_DEF__PRECISION:
				return precision != PRECISION_EDEFAULT;
			case QIntegratedLanguageDataDefPackage.DECIMAL_DEF__SCALE:
				return scale != SCALE_EDEFAULT;
			case QIntegratedLanguageDataDefPackage.DECIMAL_DEF__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (precision: ");
		result.append(precision);
		result.append(", scale: ");
		result.append(scale);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	@Override
	public Class<?> getJavaClass() {
		// TODO calculate short/integer/long
		return Integer.class;
	}

	@Override
	public Class<QDecimal> getDataClass() {
		return QDecimal.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.DECIMAL;
	}
} // DecimalDefImpl
