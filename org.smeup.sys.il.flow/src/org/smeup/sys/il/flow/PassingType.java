/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Passing Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getPassingType()
 * @model
 * @generated
 */
public enum PassingType implements Enumerator {
	/**
	 * The '<em><b>By Name</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #BY_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	BY_NAME(10, "ByName", "NAM"),

	/**
	 * The '<em><b>By Reference</b></em>' literal object. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #BY_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	BY_REFERENCE(20, "ByReference", "REF"),

	/**
	 * The '<em><b>By Value</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #BY_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	BY_VALUE(30, "ByValue", "VAL");

	/**
	 * The '<em><b>By Name</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>By Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #BY_NAME
	 * @model name="ByName" literal="NAM"
	 * @generated
	 * @ordered
	 */
	public static final int BY_NAME_VALUE = 10;

	/**
	 * The '<em><b>By Reference</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>By Reference</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #BY_REFERENCE
	 * @model name="ByReference" literal="REF"
	 * @generated
	 * @ordered
	 */
	public static final int BY_REFERENCE_VALUE = 20;

	/**
	 * The '<em><b>By Value</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>By Value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #BY_VALUE
	 * @model name="ByValue" literal="VAL"
	 * @generated
	 * @ordered
	 */
	public static final int BY_VALUE_VALUE = 30;

	/**
	 * An array of all the '<em><b>Passing Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final PassingType[] VALUES_ARRAY = new PassingType[] { BY_NAME, BY_REFERENCE, BY_VALUE, };

	/**
	 * A public read-only list of all the '<em><b>Passing Type</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<PassingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Passing Type</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static PassingType get(String literal) {
		for (PassingType result : VALUES_ARRAY)
			if (result.toString().equals(literal))
				return result;
		return null;
	}

	/**
	 * Returns the '<em><b>Passing Type</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static PassingType getByName(String name) {
		for (PassingType result : VALUES_ARRAY)
			if (result.getName().equals(name))
				return result;
		return null;
	}

	/**
	 * Returns the '<em><b>Passing Type</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static PassingType get(int value) {
		switch (value) {
		case BY_NAME_VALUE:
			return BY_NAME;
		case BY_REFERENCE_VALUE:
			return BY_REFERENCE;
		case BY_VALUE_VALUE:
			return BY_VALUE;
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
	private PassingType(int value, String name, String literal) {
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

} // PassingType
