/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.lang.String;


/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Array</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getArray()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QArray<D extends QBufferedData> extends QBufferedList<D> {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(QArray<D> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(QString value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QArray<D> qSubarr(int start, int elements);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QArray<D> qSubarr(int start, QDecimal elements);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QArray<D> qSubarr(QDecimal start, QDecimal elements);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QArray<D> qSubarr(QDecimal start, int elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true"
	 * @generated
	 */
	void divide(QArray<D> array);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void divide(QArray<D> array, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void divide(short value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void divide(short value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void divide(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void divide(long value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void divide(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void divide(int value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void divide(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void divide(double value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void divide(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void divide(QNumeric value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isContiguous();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true"
	 * @generated
	 */
	void minus(QArray<D> array);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void minus(QArray<D> array, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void minus(short value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void minus(short value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void minus(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void minus(long value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void minus(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void minus(int value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void minus(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void minus(double value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void minus(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void minus(QNumeric value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true"
	 * @generated
	 */
	void mult(QArray<D> array);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void mult(QArray<D> array, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void mult(short value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void mult(short value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void mult(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void mult(long value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void mult(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void mult(int value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void mult(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void mult(double value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void mult(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void mult(QNumeric value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true"
	 * @generated
	 */
	void plus(QArray<D> array);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void plus(QArray<D> array, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void plus(short value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void plus(short value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void plus(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void plus(long value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void plus(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void plus(int value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void plus(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void plus(double value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void plus(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" roundingModeRequired="true"
	 * @generated
	 */
	void plus(QNumeric value, String roundingMode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startRequired="true" lengthRequired="true"
	 * @generated
	 */
	QArray<QCharacter> qSubst(QNumeric start, QNumeric length);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startRequired="true"
	 * @generated
	 */
	QArray<QCharacter> qSubst(QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" lengthType="org.smeup.sys.il.core.java.JavaNumber" lengthRequired="true"
	 * @generated
	 */
	QArray<QCharacter> qSubst(Number start, Number length);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true"
	 * @generated
	 */
	QArray<QCharacter> qSubst(Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startRequired="true" lengthType="org.smeup.sys.il.core.java.JavaNumber" lengthRequired="true"
	 * @generated
	 */
	QArray<QCharacter> qSubst(QNumeric start, Number length);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" lengthRequired="true"
	 * @generated
	 */
	QArray<QCharacter> qSubst(Number start, QNumeric length);
} // QArray
