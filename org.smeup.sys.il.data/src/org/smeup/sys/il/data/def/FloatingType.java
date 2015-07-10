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
 * <em><b>Floating Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 *
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#getFloatingType()
 * @model
 * @generated
 */
public enum FloatingType implements Enumerator {
	/**
	 * The '<em><b>Single</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #SINGLE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE(10, "Single", "SINGLE"),

	/**
	 * The '<em><b>Double</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(20, "Double", "DOUBLE");

	/**
	 * The '<em><b>Single</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Single</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #SINGLE
	 * @model name="Single" literal="SINGLE"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_VALUE = 10;

	/**
	 * The '<em><b>Double</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #DOUBLE
	 * @model name="Double" literal="DOUBLE"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 20;

	/**
	 * An array of all the '<em><b>Floating Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final FloatingType[] VALUES_ARRAY = new FloatingType[] {
			SINGLE, DOUBLE, };

	/**
	 * A public read-only list of all the '<em><b>Floating Type</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<FloatingType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Floating Type</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static FloatingType get(String literal) {
		for (FloatingType result : VALUES_ARRAY)
			if (result.toString().equals(literal))
				return result;
		return null;
	}

	/**
	 * Returns the '<em><b>Floating Type</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static FloatingType getByName(String name) {
		for (FloatingType result : VALUES_ARRAY)
			if (result.getName().equals(name))
				return result;
		return null;
	}

	/**
	 * Returns the '<em><b>Floating Type</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static FloatingType get(int value) {
		switch (value) {
		case SINGLE_VALUE:
			return SINGLE;
		case DOUBLE_VALUE:
			return DOUBLE;
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
	private FloatingType(int value, String name, String literal) {
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

} // FloatingType
