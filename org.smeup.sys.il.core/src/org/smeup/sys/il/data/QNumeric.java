/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.lang.String;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Numeric</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getNumeric()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QNumeric extends QBufferedElement {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	double asDouble();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	int asInteger();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	short asShort();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true"
	 * @generated
	 */
	void check(QCharacter comparator, QCharacter base);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true"
	 * @generated
	 */
	void check(String comparator, QCharacter base);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" foundRequired="true"
	 * @generated
	 */
	void check(QCharacter comparator, QCharacter base, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" foundRequired="true"
	 * @generated
	 */
	void check(String comparator, QCharacter base, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true"
	 * @generated
	 */
	void check(QCharacter comparator, QCharacter base, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true"
	 * @generated
	 */
	void check(String comparator, QCharacter base, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void check(QCharacter comparator, QCharacter base, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void check(String comparator, QCharacter base, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	void check(QCharacter comparator, QCharacter base, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	void check(String comparator, QCharacter base, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void check(QCharacter comparator, QCharacter base, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void check(String comparator, QCharacter base, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true"
	 * @generated
	 */
	void check(QCharacter comparator, String base);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true"
	 * @generated
	 */
	void check(String comparator, String base);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" foundRequired="true"
	 * @generated
	 */
	void check(QCharacter comparator, String base, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" foundRequired="true"
	 * @generated
	 */
	void check(String comparator, String base, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true"
	 * @generated
	 */
	void check(QCharacter comparator, String base, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true"
	 * @generated
	 */
	void check(String comparator, String base, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void check(QCharacter comparator, String base, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void check(String comparator, String base, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	void check(QCharacter comparator, String base, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	void check(String comparator, String base, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void check(QCharacter comparator, String base, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void check(String comparator, String base, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true"
	 * @generated
	 */
	void checkr(QCharacter comparator, QCharacter base);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true"
	 * @generated
	 */
	void checkr(String comparator, QCharacter base);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" foundRequired="true"
	 * @generated
	 */
	void checkr(QCharacter comparator, QCharacter base, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" foundRequired="true"
	 * @generated
	 */
	void checkr(String comparator, QCharacter base, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true"
	 * @generated
	 */
	void checkr(QCharacter comparator, QCharacter base, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true"
	 * @generated
	 */
	void checkr(String comparator, QCharacter base, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void checkr(QCharacter comparator, QCharacter base, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void checkr(String comparator, QCharacter base, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	void checkr(QCharacter comparator, QCharacter base, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	void checkr(String comparator, QCharacter base, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void checkr(QCharacter comparator, QCharacter base, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void checkr(String comparator, QCharacter base, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true"
	 * @generated
	 */
	void checkr(QCharacter comparator, String base);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true"
	 * @generated
	 */
	void checkr(String comparator, String base);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" foundRequired="true"
	 * @generated
	 */
	void checkr(QCharacter comparator, String base, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" foundRequired="true"
	 * @generated
	 */
	void checkr(String comparator, String base, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true"
	 * @generated
	 */
	void checkr(QCharacter comparator, String base, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true"
	 * @generated
	 */
	void checkr(String comparator, String base, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void checkr(QCharacter comparator, String base, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void checkr(String comparator, String base, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	void checkr(QCharacter comparator, String base, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	void checkr(String comparator, String base, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void checkr(QCharacter comparator, String base, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comparatorRequired="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void checkr(String comparator, String base, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric divide(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	QNumeric divide(QNumeric value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" remainderTargetRequired="true"
	 * @generated
	 */
	QNumeric divide(QNumeric value, QNumeric remainderTarget);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	long asLong();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	boolean eq(Number value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean eq(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void eval(QNumeric value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	void eval(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void eval(Number value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" halfAdjustRequired="true" maxPrecisionRequired="true"
	 * @generated
	 */
	void eval(Number value, boolean halfAdjust, boolean maxPrecision);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" halfAdjustRequired="true" maxPrecisionRequired="true"
	 * @generated
	 */
	void eval(QNumeric value, boolean halfAdjust, boolean maxPrecision);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	boolean ge(Number value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ge(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	boolean gt(Number value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean gt(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isSigned();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	boolean le(Number value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean le(QNumeric value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	boolean lt(Number value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean lt(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	QNumeric minus(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	QNumeric minus(Number value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric minus(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	QNumeric minus(QNumeric value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	QNumeric mult(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	QNumeric mult(Number value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric mult(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	QNumeric mult(QNumeric value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.smeup.sys.mi.core.JavaNumber" required="true"
	 * @generated
	 */
	Number n();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	boolean ne(Number value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	boolean ne(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	QNumeric plus(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	QNumeric plus(Number value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric plus(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	QNumeric plus(QNumeric value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	QNumeric power(Number value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric power(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QDatetime qDate(DatetimeFormat format);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	QNumeric qDiv(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" remainderTargetRequired="true"
	 * @generated
	 */
	QNumeric qDiv(Number value, QNumeric remainderTarget);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric qRem(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric qDiv(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" remainderTargetRequired="true"
	 * @generated
	 */
	QNumeric qDiv(QNumeric value, QNumeric remainderTarget);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QNumeric qInt();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QNumeric qInth();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	QNumeric qMinus(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric qMinus(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	QNumeric qMult(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric qMult(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	QNumeric qPlus(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	QNumeric qPlus(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	QNumeric qRem(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true"
	 * @generated
	 */
	void xfoot(QArray<? extends QNumeric> array);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void xfoot(QArray<? extends QNumeric> array, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QNumeric qUns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void time();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	double d();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	QNumeric divide(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	QNumeric divide(Number value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" remainderTargetRequired="true"
	 * @generated
	 */
	QNumeric divide(Number value, QNumeric remainderTarget);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	int i();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	long l();

} // QNumeric
