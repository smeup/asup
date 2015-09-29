/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.jobs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Job Date Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobDateFormat()
 * @model
 * @generated
 */
public enum JobDateFormat implements Enumerator {
	/**
	 * The '<em><b>Year Month Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR_MONTH_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR_MONTH_DAY(10, "YearMonthDay", "*YMD"),

	/**
	 * The '<em><b>Month Day Year</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTH_DAY_YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	MONTH_DAY_YEAR(20, "MonthDayYear", "*MDY"),

	/**
	 * The '<em><b>Day Month Year</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_MONTH_YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	DAY_MONTH_YEAR(30, "DayMonthYear", "*DMY"),

	/**
	 * The '<em><b>Julian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JULIAN_VALUE
	 * @generated
	 * @ordered
	 */
	JULIAN(40, "Julian", "*JUL");

	/**
	 * The '<em><b>Year Month Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Year Month Day</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YEAR_MONTH_DAY
	 * @model name="YearMonthDay" literal="*YMD"
	 * @generated
	 * @ordered
	 */
	public static final int YEAR_MONTH_DAY_VALUE = 10;

	/**
	 * The '<em><b>Month Day Year</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Month Day Year</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONTH_DAY_YEAR
	 * @model name="MonthDayYear" literal="*MDY"
	 * @generated
	 * @ordered
	 */
	public static final int MONTH_DAY_YEAR_VALUE = 20;

	/**
	 * The '<em><b>Day Month Year</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Day Month Year</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAY_MONTH_YEAR
	 * @model name="DayMonthYear" literal="*DMY"
	 * @generated
	 * @ordered
	 */
	public static final int DAY_MONTH_YEAR_VALUE = 30;

	/**
	 * The '<em><b>Julian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Julian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JULIAN
	 * @model name="Julian" literal="*JUL"
	 * @generated
	 * @ordered
	 */
	public static final int JULIAN_VALUE = 40;

	/**
	 * An array of all the '<em><b>Job Date Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JobDateFormat[] VALUES_ARRAY =
		new JobDateFormat[] {
			YEAR_MONTH_DAY,
			MONTH_DAY_YEAR,
			DAY_MONTH_YEAR,
			JULIAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Job Date Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JobDateFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Job Date Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobDateFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JobDateFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Job Date Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobDateFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JobDateFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Job Date Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JobDateFormat get(int value) {
		switch (value) {
			case YEAR_MONTH_DAY_VALUE: return YEAR_MONTH_DAY;
			case MONTH_DAY_YEAR_VALUE: return MONTH_DAY_YEAR;
			case DAY_MONTH_YEAR_VALUE: return DAY_MONTH_YEAR;
			case JULIAN_VALUE: return JULIAN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private JobDateFormat(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //JobDateFormat
