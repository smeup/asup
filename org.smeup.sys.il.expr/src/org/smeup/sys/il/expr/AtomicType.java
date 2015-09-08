/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.expr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Term Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 * @see org.smeup.sys.il.expr.QIntegratedLanguageExpressionPackage#getAtomicType()
 * @model
 * @generated
 */
public enum AtomicType implements Enumerator {
	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(3, "Boolean", "BOOLEAN"),

	/**
	 * The '<em><b>Datetime</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME(2, "Datetime", "DATETIME"),

	/**
	 * The '<em><b>Floating</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOATING_VALUE
	 * @generated
	 * @ordered
	 */
	FLOATING(1, "Floating", "FLOATING"),

	/**
	 * The '<em><b>Hexadecimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXADECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	HEXADECIMAL(8, "Hexadecimal", "HEXADECIMAL"),

	/**
	 * The '<em><b>Indicator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDICATOR_VALUE
	 * @generated
	 * @ordered
	 */
	INDICATOR(6, "Indicator", "INDICATOR"),

	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(0, "Integer", "INTEGER"),

	/**
	 * The '<em><b>Name</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NAME(5, "Name", "NAME"),

	/**
	 * The '<em><b>Special</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIAL(7, "Special", "SPECIAL"),

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(4, "String", "STRING");

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @model name="Boolean" literal="BOOLEAN"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 3;

	/**
	 * The '<em><b>Datetime</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Datetime</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATETIME
	 * @model name="Datetime" literal="DATETIME"
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_VALUE = 2;

	/**
	 * The '<em><b>Floating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Floating</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOATING
	 * @model name="Floating" literal="FLOATING"
	 * @generated
	 * @ordered
	 */
	public static final int FLOATING_VALUE = 1;

	/**
	 * The '<em><b>Hexadecimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hexadecimal</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEXADECIMAL
	 * @model name="Hexadecimal" literal="HEXADECIMAL"
	 * @generated
	 * @ordered
	 */
	public static final int HEXADECIMAL_VALUE = 8;

	/**
	 * The '<em><b>Indicator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Indicator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDICATOR
	 * @model name="Indicator" literal="INDICATOR"
	 * @generated
	 * @ordered
	 */
	public static final int INDICATOR_VALUE = 6;

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @model name="Integer" literal="INTEGER"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 0;

	/**
	 * The '<em><b>Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAME
	 * @model name="Name" literal="NAME"
	 * @generated
	 * @ordered
	 */
	public static final int NAME_VALUE = 5;

	/**
	 * The '<em><b>Special</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Special</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIAL
	 * @model name="Special" literal="SPECIAL"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIAL_VALUE = 7;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="String" literal="STRING"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 4;

	/**
	 * An array of all the '<em><b>Atomic Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final AtomicType[] VALUES_ARRAY = new AtomicType[] {
			BOOLEAN,
			DATETIME,
			FLOATING,
			HEXADECIMAL,
			INDICATOR,
			INTEGER,
			NAME,
			SPECIAL,
			STRING,
		};

	/**
	 * A public read-only list of all the '<em><b>Atomic Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AtomicType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Atomic Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static AtomicType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AtomicType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Atomic Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static AtomicType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AtomicType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Atomic Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static AtomicType get(int value) {
		switch (value) {
			case BOOLEAN_VALUE: return BOOLEAN;
			case DATETIME_VALUE: return DATETIME;
			case FLOATING_VALUE: return FLOATING;
			case HEXADECIMAL_VALUE: return HEXADECIMAL;
			case INDICATOR_VALUE: return INDICATOR;
			case INTEGER_VALUE: return INTEGER;
			case NAME_VALUE: return NAME;
			case SPECIAL_VALUE: return SPECIAL;
			case STRING_VALUE: return STRING;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private AtomicType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // TermType
