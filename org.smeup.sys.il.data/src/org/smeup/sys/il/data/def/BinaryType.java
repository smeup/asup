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
 * <em><b>Binary Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getBinaryType()
 * @model
 * @generated
 */
public enum BinaryType implements Enumerator {
	/**
	 * The '<em><b>Byte</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	BYTE(10, "Byte", "BYTE"),

	/**
	 * The '<em><b>Short</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT(20, "Short", "SHORT"),

	/**
	 * The '<em><b>Integer</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(30, "Integer", "INTEGER"),

	/**
	 * The '<em><b>Long</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(40, "Long", "LONG");

	/**
	 * The '<em><b>Byte</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Byte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #BYTE
	 * @model name="Byte" literal="BYTE"
	 * @generated
	 * @ordered
	 */
	public static final int BYTE_VALUE = 10;

	/**
	 * The '<em><b>Short</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Short</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #SHORT
	 * @model name="Short" literal="SHORT"
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_VALUE = 20;

	/**
	 * The '<em><b>Integer</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #INTEGER
	 * @model name="Integer" literal="INTEGER"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 30;

	/**
	 * The '<em><b>Long</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #LONG
	 * @model name="Long" literal="LONG"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 40;

	/**
	 * An array of all the '<em><b>Binary Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final BinaryType[] VALUES_ARRAY = new BinaryType[] { BYTE,
			SHORT, INTEGER, LONG, };

	/**
	 * A public read-only list of all the '<em><b>Binary Type</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<BinaryType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binary Type</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static BinaryType get(String literal) {
		for (BinaryType result : VALUES_ARRAY)
			if (result.toString().equals(literal))
				return result;
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Type</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static BinaryType getByName(String name) {
		for (BinaryType result : VALUES_ARRAY)
			if (result.getName().equals(name))
				return result;
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Type</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static BinaryType get(int value) {
		switch (value) {
		case BYTE_VALUE:
			return BYTE;
		case SHORT_VALUE:
			return SHORT;
		case INTEGER_VALUE:
			return INTEGER;
		case LONG_VALUE:
			return LONG;
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
	private BinaryType(int value, String name, String literal) {
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

} // BinaryType
