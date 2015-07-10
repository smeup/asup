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
 * <em><b>Date Format</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getDateFormat()
 * @model
 * @generated
 */
public enum DateFormat implements Enumerator {
	/**
	 * The '<em><b>MDY</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #MDY_VALUE
	 * @generated
	 * @ordered
	 */
	MDY(10, "MDY", "*MDY"),

	/**
	 * The '<em><b>DMY</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #DMY_VALUE
	 * @generated
	 * @ordered
	 */
	DMY(20, "DMY", "*DMY"),

	/**
	 * The '<em><b>YMD</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #YMD_VALUE
	 * @generated
	 * @ordered
	 */
	YMD(30, "YMD", "*YMD"),

	/**
	 * The '<em><b>JUL</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #JUL_VALUE
	 * @generated
	 * @ordered
	 */
	JUL(40, "JUL", "*JUL"),

	/**
	 * The '<em><b>ISO</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #ISO_VALUE
	 * @generated
	 * @ordered
	 */
	ISO(50, "ISO", "*ISO"),

	/**
	 * The '<em><b>USA</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #USA_VALUE
	 * @generated
	 * @ordered
	 */
	USA(60, "USA", "*USA"),

	/**
	 * The '<em><b>EUR</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #EUR_VALUE
	 * @generated
	 * @ordered
	 */
	EUR(70, "EUR", "*EUR"),

	/**
	 * The '<em><b>JIS</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #JIS_VALUE
	 * @generated
	 * @ordered
	 */
	JIS(80, "JIS", "*JIS"),

	/**
	 * The '<em><b>JOBRUN</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #JOBRUN_VALUE
	 * @generated
	 * @ordered
	 */
	JOBRUN(90, "JOBRUN", "*JOBRUN");

	/**
	 * The '<em><b>MDY</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MDY</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #MDY
	 * @model literal="*MDY"
	 * @generated
	 * @ordered
	 */
	public static final int MDY_VALUE = 10;

	/**
	 * The '<em><b>DMY</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DMY</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #DMY
	 * @model literal="*DMY"
	 * @generated
	 * @ordered
	 */
	public static final int DMY_VALUE = 20;

	/**
	 * The '<em><b>YMD</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YMD</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #YMD
	 * @model literal="*YMD"
	 * @generated
	 * @ordered
	 */
	public static final int YMD_VALUE = 30;

	/**
	 * The '<em><b>JUL</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JUL</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #JUL
	 * @model literal="*JUL"
	 * @generated
	 * @ordered
	 */
	public static final int JUL_VALUE = 40;

	/**
	 * The '<em><b>ISO</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISO</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #ISO
	 * @model literal="*ISO"
	 * @generated
	 * @ordered
	 */
	public static final int ISO_VALUE = 50;

	/**
	 * The '<em><b>USA</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USA</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #USA
	 * @model literal="*USA"
	 * @generated
	 * @ordered
	 */
	public static final int USA_VALUE = 60;

	/**
	 * The '<em><b>EUR</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EUR</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #EUR
	 * @model literal="*EUR"
	 * @generated
	 * @ordered
	 */
	public static final int EUR_VALUE = 70;

	/**
	 * The '<em><b>JIS</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JIS</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #JIS
	 * @model literal="*JIS"
	 * @generated
	 * @ordered
	 */
	public static final int JIS_VALUE = 80;

	/**
	 * The '<em><b>JOBRUN</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOBRUN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #JOBRUN
	 * @model literal="*JOBRUN"
	 * @generated
	 * @ordered
	 */
	public static final int JOBRUN_VALUE = 90;

	/**
	 * An array of all the '<em><b>Date Format</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final DateFormat[] VALUES_ARRAY = new DateFormat[] { MDY,
			DMY, YMD, JUL, ISO, USA, EUR, JIS, JOBRUN, };

	/**
	 * A public read-only list of all the '<em><b>Date Format</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<DateFormat> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Date Format</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static DateFormat get(String literal) {
		for (DateFormat result : VALUES_ARRAY)
			if (result.toString().equals(literal))
				return result;
		return null;
	}

	/**
	 * Returns the '<em><b>Date Format</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static DateFormat getByName(String name) {
		for (DateFormat result : VALUES_ARRAY)
			if (result.getName().equals(name))
				return result;
		return null;
	}

	/**
	 * Returns the '<em><b>Date Format</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static DateFormat get(int value) {
		switch (value) {
		case MDY_VALUE:
			return MDY;
		case DMY_VALUE:
			return DMY;
		case YMD_VALUE:
			return YMD;
		case JUL_VALUE:
			return JUL;
		case ISO_VALUE:
			return ISO;
		case USA_VALUE:
			return USA;
		case EUR_VALUE:
			return EUR;
		case JIS_VALUE:
			return JIS;
		case JOBRUN_VALUE:
			return JOBRUN;
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
	private DateFormat(int value, String name, String literal) {
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

} // DateFormat
