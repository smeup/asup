/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.data.def.QDatetimeDef;
import org.smeup.sys.il.data.def.QDefPackage;
import org.smeup.sys.il.data.def.TimeFormat;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Datetime Def</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.impl.DatetimeDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.impl.DatetimeDefImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.impl.DatetimeDefImpl#getTimeFormat <em>Time Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatetimeDefImpl extends UnaryAtomicBufferedDataDefImpl<QDatetime> implements QDatetimeDef {
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
	protected static final DatetimeType TYPE_EDEFAULT = DatetimeType.DATE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DatetimeType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final DateFormat DATE_FORMAT_EDEFAULT = DateFormat.MDY;

	/**
	 * The cached value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormat()
	 * @generated
	 * @ordered
	 */
	protected DateFormat dateFormat = DATE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeFormat() <em>Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected static final TimeFormat TIME_FORMAT_EDEFAULT = TimeFormat.HMS;

	/**
	 * The cached value of the '{@link #getTimeFormat() <em>Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFormat()
	 * @generated
	 * @ordered
	 */
	protected TimeFormat timeFormat = TIME_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DatetimeDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDefPackage.Literals.DATETIME_DEF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatetimeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(DatetimeType newType) {
		DatetimeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDefPackage.DATETIME_DEF__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateFormat getDateFormat() {
		return dateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFormat(DateFormat newDateFormat) {
		DateFormat oldDateFormat = dateFormat;
		dateFormat = newDateFormat == null ? DATE_FORMAT_EDEFAULT : newDateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDefPackage.DATETIME_DEF__DATE_FORMAT, oldDateFormat, dateFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeFormat getTimeFormat() {
		return timeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeFormat(TimeFormat newTimeFormat) {
		TimeFormat oldTimeFormat = timeFormat;
		timeFormat = newTimeFormat == null ? TIME_FORMAT_EDEFAULT : newTimeFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QDefPackage.DATETIME_DEF__TIME_FORMAT, oldTimeFormat, timeFormat));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QDefPackage.DATETIME_DEF__TYPE:
				return getType();
			case QDefPackage.DATETIME_DEF__DATE_FORMAT:
				return getDateFormat();
			case QDefPackage.DATETIME_DEF__TIME_FORMAT:
				return getTimeFormat();
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
			case QDefPackage.DATETIME_DEF__TYPE:
				setType((DatetimeType)newValue);
				return;
			case QDefPackage.DATETIME_DEF__DATE_FORMAT:
				setDateFormat((DateFormat)newValue);
				return;
			case QDefPackage.DATETIME_DEF__TIME_FORMAT:
				setTimeFormat((TimeFormat)newValue);
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
			case QDefPackage.DATETIME_DEF__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case QDefPackage.DATETIME_DEF__DATE_FORMAT:
				setDateFormat(DATE_FORMAT_EDEFAULT);
				return;
			case QDefPackage.DATETIME_DEF__TIME_FORMAT:
				setTimeFormat(TIME_FORMAT_EDEFAULT);
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
			case QDefPackage.DATETIME_DEF__TYPE:
				return type != TYPE_EDEFAULT;
			case QDefPackage.DATETIME_DEF__DATE_FORMAT:
				return dateFormat != DATE_FORMAT_EDEFAULT;
			case QDefPackage.DATETIME_DEF__TIME_FORMAT:
				return timeFormat != TIME_FORMAT_EDEFAULT;
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
		result.append(", dateFormat: ");
		result.append(dateFormat);
		result.append(", timeFormat: ");
		result.append(timeFormat);
		result.append(')');
		return result.toString();
	}

	@Override
	public Class<?> getJavaClass() {
		return Date.class;
	}

	@Override
	public Class<QDatetime> getDataClass() {
		return QDatetime.class;
	}

	@Override
	public DataDefType getDataDefType() {
		return DataDefType.DATETIME;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getLength() {

		int length = 0;
		// default format
		
		// TODO format		
		switch (getType()) {
		case DATE:
			switch (getDateFormat()) {
			case DMY:
				length = 8;
				break;
			case EUR:
				length = 10;
				break;
			case ISO:
				length = 10;
				break;
			case JIS:
				length = 10;
				break;
			case JOBRUN:
				length = 10;
				break;
			case JUL:
				length = 6;
				break;
			case MDY:
				length = 8;
				break;
			case USA:
				length = 10;
				break;
			case YMD:
				length = 8;
				break;
			case YYMD:
				length = 10;
				break;
			}
		case TIME:
			// TODO
			return length = 8;
		case TIME_STAMP:
			// TODO
			return length = 26;
		}
		
		return length; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getSize() {
		return getLength();
	}
} // DatetimeDefImpl
