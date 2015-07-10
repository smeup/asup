/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Datetime Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getDatetimeType()
 * @model
 * @generated
 */
public enum DatetimeType implements Enumerator {
	/**
	 * The '<em><b>Date</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(10, "Date", "DATE"),

	/**
	 * The '<em><b>Time</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(20, "Time", "TIME"),

	/**
	 * The '<em><b>Time Stamp</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #TIME_STAMP_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_STAMP(30, "TimeStamp", "TIMESTAMP");

	/**
	 * The '<em><b>Date</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #DATE
	 * @model name="Date" literal="DATE"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 10;

	/**
	 * The '<em><b>Time</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #TIME
	 * @model name="Time" literal="TIME"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 20;

	/**
	 * The '<em><b>Time Stamp</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time Stamp</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #TIME_STAMP
	 * @model name="TimeStamp" literal="TIMESTAMP"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_STAMP_VALUE = 30;

	/**
	 * An array of all the '<em><b>Datetime Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final DatetimeType[] VALUES_ARRAY = new DatetimeType[] {
			DATE, TIME, TIME_STAMP, };

	/**
	 * A public read-only list of all the '<em><b>Datetime Type</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<DatetimeType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Datetime Type</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static DatetimeType get(String literal) {
		for (DatetimeType result : VALUES_ARRAY)
			if (result.toString().equals(literal))
				return result;
		return null;
	}

	/**
	 * Returns the '<em><b>Datetime Type</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static DatetimeType getByName(String name) {
		for (DatetimeType result : VALUES_ARRAY)
			if (result.getName().equals(name))
				return result;
		return null;
	}

	/**
	 * Returns the '<em><b>Datetime Type</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static DatetimeType get(int value) {
		switch (value) {
		case DATE_VALUE:
			return DATE;
		case TIME_VALUE:
			return TIME;
		case TIME_STAMP_VALUE:
			return TIME_STAMP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	private DatetimeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string
	 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // DatetimeType
