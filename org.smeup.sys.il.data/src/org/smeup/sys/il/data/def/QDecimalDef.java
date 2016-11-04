/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import org.smeup.sys.il.data.QDecimal;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Decimal Def</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.data.def.QDecimalDef#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.QDecimalDef#getScale <em>Scale</em>}</li>
 *   <li>{@link org.smeup.sys.il.data.def.QDecimalDef#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.data.def.QDefPackage#getDecimalDef()
 * @model
 * @generated
 */
public interface QDecimalDef extends QUnaryAtomicBufferedDataDef<QDecimal> {
	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(int)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getDecimalDef_Precision()
	 * @model required="true"
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.il.data.def.QDecimalDef#getPrecision
	 * <em>Precision</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(int)
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getDecimalDef_Scale()
	 * @model
	 * @generated
	 */
	int getScale();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.def.QDecimalDef#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.il.data.def.DecimalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.smeup.sys.il.data.def.DecimalType
	 * @see #setType(DecimalType)
	 * @see org.smeup.sys.il.data.def.QDefPackage#getDecimalDef_Type()
	 * @model
	 * @generated
	 */
	DecimalType getType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.data.def.QDecimalDef#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.smeup.sys.il.data.def.DecimalType
	 * @see #getType()
	 * @generated
	 */
	void setType(DecimalType value);

} // QDecimalDef
