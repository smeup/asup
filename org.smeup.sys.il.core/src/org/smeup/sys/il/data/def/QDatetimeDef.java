/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import org.smeup.sys.il.data.QDatetime;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Datetime Def</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.QDatetimeDef#getType <em>Type</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.QDatetimeDef#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.QDatetimeDef#getTimeFormat <em>Time Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getDatetimeDef()
 * @model
 * @generated
 */
public interface QDatetimeDef extends QUnaryAtomicBufferedDataDef<QDatetime> {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.il.data.def.DatetimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.smeup.sys.il.data.def.DatetimeType
	 * @see #setType(DatetimeType)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getDatetimeDef_Type()
	 * @model required="true"
	 * @generated
	 */
	DatetimeType getType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.def.QDatetimeDef#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.smeup.sys.il.data.def.DatetimeType
	 * @see #getType()
	 * @generated
	 */
	void setType(DatetimeType value);

	/**
	 * Returns the value of the '<em><b>Date Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.il.data.def.DateFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Format</em>' attribute.
	 * @see org.smeup.sys.il.data.def.DateFormat
	 * @see #setDateFormat(DateFormat)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getDatetimeDef_DateFormat()
	 * @model
	 * @generated
	 */
	DateFormat getDateFormat();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.def.QDatetimeDef#getDateFormat <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Format</em>' attribute.
	 * @see org.smeup.sys.il.data.def.DateFormat
	 * @see #getDateFormat()
	 * @generated
	 */
	void setDateFormat(DateFormat value);

	/**
	 * Returns the value of the '<em><b>Time Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.il.data.def.TimeFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Format</em>' attribute.
	 * @see org.smeup.sys.il.data.def.TimeFormat
	 * @see #setTimeFormat(TimeFormat)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getDatetimeDef_TimeFormat()
	 * @model
	 * @generated
	 */
	TimeFormat getTimeFormat();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.def.QDatetimeDef#getTimeFormat <em>Time Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Format</em>' attribute.
	 * @see org.smeup.sys.il.data.def.TimeFormat
	 * @see #getTimeFormat()
	 * @generated
	 */
	void setTimeFormat(TimeFormat value);

} // QDatetimeDef
