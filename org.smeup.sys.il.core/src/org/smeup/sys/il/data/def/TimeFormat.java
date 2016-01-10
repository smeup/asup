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
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getTimeFormat()
 * @model
 * @generated
 */
public enum TimeFormat implements Enumerator {
	/**
	 * The '<em><b>HMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HMS_VALUE
	 * @generated
	 * @ordered
	 */
	HMS(10, "HMS", "*HMS"),

	/**
	 * The '<em><b>ISO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_VALUE
	 * @generated
	 * @ordered
	 */
	ISO(20, "ISO", "*ISO"),

	/**
	 * The '<em><b>USA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USA_VALUE
	 * @generated
	 * @ordered
	 */
	USA(30, "USA", "*USA"),

	/**
	 * The '<em><b>EUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUR_VALUE
	 * @generated
	 * @ordered
	 */
	EUR(40, "EUR", "*EUR"),

	/**
	 * The '<em><b>JIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JIS_VALUE
	 * @generated
	 * @ordered
	 */
	JIS(50, "JIS", "*JIS"),

	/**
	 * The '<em><b>JOBRUN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOBRUN_VALUE
	 * @generated
	 * @ordered
	 */
	JOBRUN(60, "JOBRUN", "*JOBRUN");

	/**
	 * The '<em><b>HMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HMS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HMS
	 * @model literal="*HMS"
	 * @generated
	 * @ordered
	 */
	public static final int HMS_VALUE = 10;

	/**
	 * The '<em><b>ISO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISO
	 * @model literal="*ISO"
	 * @generated
	 * @ordered
	 */
	public static final int ISO_VALUE = 20;

	/**
	 * The '<em><b>USA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USA
	 * @model literal="*USA"
	 * @generated
	 * @ordered
	 */
	public static final int USA_VALUE = 30;

	/**
	 * The '<em><b>EUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EUR
	 * @model literal="*EUR"
	 * @generated
	 * @ordered
	 */
	public static final int EUR_VALUE = 40;

	/**
	 * The '<em><b>JIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JIS
	 * @model literal="*JIS"
	 * @generated
	 * @ordered
	 */
	public static final int JIS_VALUE = 50;

	/**
	 * The '<em><b>JOBRUN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOBRUN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOBRUN
	 * @model literal="*JOBRUN"
	 * @generated
	 * @ordered
	 */
	public static final int JOBRUN_VALUE = 60;

	/**
	 * An array of all the '<em><b>Time Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeFormat[] VALUES_ARRAY =
		new TimeFormat[] {
			HMS,
			ISO,
			USA,
			EUR,
			JIS,
			JOBRUN,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeFormat get(int value) {
		switch (value) {
			case HMS_VALUE: return HMS;
			case ISO_VALUE: return ISO;
			case USA_VALUE: return USA;
			case EUR_VALUE: return EUR;
			case JIS_VALUE: return JIS;
			case JOBRUN_VALUE: return JOBRUN;
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
	private TimeFormat(int value, String name, String literal) {
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
	
} //TimeFormat
