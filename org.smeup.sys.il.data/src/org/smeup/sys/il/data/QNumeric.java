/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Numeric</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getNumeric()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QNumeric extends QBufferedData {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true"
	 * @generated
	 */
	double asDouble();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true"
	 * @generated
	 */
	int asInteger();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true"
	 * @generated
	 */
	short asShort();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric divide(short value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric divide(long value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric divide(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric divide(double value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric divide(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true"
	 * @generated
	 */
	long asLong();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueType="org.smeup.sys.il.core.java.JavaNumber"
	 *        valueRequired="true"
	 * @generated
	 */
	boolean eq(Number value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean eq(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	@Override
	<E extends Enum<E>> boolean eq(E value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(double value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(short value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(long value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(BigInteger value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(BigDecimal value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueType="org.smeup.sys.il.core.java.JavaNumber"
	 *        valueRequired="true"
	 * @generated
	 */
	boolean ge(Number value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ge(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	@Override
	<E extends Enum<E>> boolean ge(E value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueType="org.smeup.sys.il.core.java.JavaNumber"
	 *        valueRequired="true"
	 * @generated
	 */
	boolean gt(Number value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean gt(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	@Override
	<E extends Enum<E>> boolean gt(E value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isSigned();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueType="org.smeup.sys.il.core.java.JavaNumber"
	 *        valueRequired="true"
	 * @generated
	 */
	boolean le(Number value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean le(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	@Override
	<E extends Enum<E>> boolean le(E value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueType="org.smeup.sys.il.core.java.JavaNumber"
	 *        valueRequired="true"
	 * @generated
	 */
	boolean lt(Number value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean lt(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	@Override
	<E extends Enum<E>> boolean lt(E value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric minus(short value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric minus(long value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric minus(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric minus(double value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric minus(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric mult(short value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric mult(long value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric mult(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric mult(double value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric mult(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueType="org.smeup.sys.il.core.java.JavaNumber"
	 *        valueRequired="true"
	 * @generated
	 */
	boolean ne(Number value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ne(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model EBounds="org.smeup.sys.il.core.java.JavaEnum"
	 * @generated
	 */
	@Override
	<E extends Enum<E>> boolean ne(E value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric plus(short value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric plus(long value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric plus(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric plus(double value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric plus(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric power(short value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric power(long value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric power(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric power(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric qRem(short value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric qRem(long value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric qRem(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric qRem(double value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric qRem(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true"
	 * @generated
	 */
	double d();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true"
	 * @generated
	 */
	int i();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model required="true"
	 * @generated
	 */
	long l();

} // QNumeric
