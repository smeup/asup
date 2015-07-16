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
 * <li>{@link org.smeup.sys.il.data.def.QDatetimeDef#getType <em>Type</em>}</li>
 * <li>{@link org.smeup.sys.il.data.def.QDatetimeDef#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getDatetimeDef()
 * @model
 * @generated
 */
public interface QDatetimeDef extends QUnaryAtomicBufferedDataDef<QDatetime> {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. The literals
	 * are from the enumeration {@link org.smeup.sys.il.data.def.DatetimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.smeup.sys.il.data.def.DatetimeType
	 * @see #setType(DatetimeType)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getDatetimeDef_Type()
	 * @model required="true"
	 * @generated
	 */
	DatetimeType getType();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.il.data.def.QDatetimeDef#getType <em>Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see org.smeup.sys.il.data.def.DatetimeType
	 * @see #getType()
	 * @generated
	 */
	void setType(DatetimeType value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getDatetimeDef_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.il.data.def.QDatetimeDef#getFormat <em>Format</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

} // QDatetimeDef
