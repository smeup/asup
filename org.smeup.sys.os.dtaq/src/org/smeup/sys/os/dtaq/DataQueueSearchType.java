/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.dtaq;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>QData Queue Search Type</b></em>', and utility methods for working
 * with them. <!-- end-user-doc -->
 * @see org.smeup.sys.os.dtaq.QOperatingSystemDataQueuePackage#getDataQueueSearchType()
 * @model
 * @generated
 */
public enum DataQueueSearchType implements Enumerator {
	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(10, "Equal", "*EQ"),

	/**
	 * The '<em><b>Not Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EQUAL(20, "NotEqual", "*NE"),

	/**
	 * The '<em><b>Less Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN(30, "LessThan", "*LT"),

	/**
	 * The '<em><b>Greater Than</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN(40, "GreaterThan", "*GT"),

	/**
	 * The '<em><b>Less Than Or Equal</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #LESS_THAN_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN_OR_EQUAL(50, "LessThanOrEqual", "*LE"),

	/**
	 * The '<em><b>Greater Than Or Equal</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #GREATER_THAN_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN_OR_EQUAL(60, "GreaterThanOrEqual", "*GE");

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="Equal" literal="*EQ"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 10;

	/**
	 * The '<em><b>Not Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL
	 * @model name="NotEqual" literal="*NE"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EQUAL_VALUE = 20;

	/**
	 * The '<em><b>Less Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN
	 * @model name="LessThan" literal="*LT"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_VALUE = 30;

	/**
	 * The '<em><b>Greater Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater Than</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN
	 * @model name="GreaterThan" literal="*GT"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_VALUE = 40;

	/**
	 * The '<em><b>Less Than Or Equal</b></em>' literal value. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less Than Or Equal</b></em>' literal object
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #LESS_THAN_OR_EQUAL
	 * @model name="LessThanOrEqual" literal="*LE"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_OR_EQUAL_VALUE = 50;

	/**
	 * The '<em><b>Greater Than Or Equal</b></em>' literal value. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater Than Or Equal</b></em>' literal object
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #GREATER_THAN_OR_EQUAL
	 * @model name="GreaterThanOrEqual" literal="*GE"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_OR_EQUAL_VALUE = 60;

	/**
	 * An array of all the '<em><b>Data Queue Search Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataQueueSearchType[] VALUES_ARRAY = new DataQueueSearchType[] {
			EQUAL,
			NOT_EQUAL,
			LESS_THAN,
			GREATER_THAN,
			LESS_THAN_OR_EQUAL,
			GREATER_THAN_OR_EQUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Queue Search Type</b></em>' enumerators.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataQueueSearchType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Queue Search Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataQueueSearchType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataQueueSearchType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Queue Search Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataQueueSearchType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataQueueSearchType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Queue Search Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataQueueSearchType get(int value) {
		switch (value) {
			case EQUAL_VALUE: return EQUAL;
			case NOT_EQUAL_VALUE: return NOT_EQUAL;
			case LESS_THAN_VALUE: return LESS_THAN;
			case GREATER_THAN_VALUE: return GREATER_THAN;
			case LESS_THAN_OR_EQUAL_VALUE: return LESS_THAN_OR_EQUAL;
			case GREATER_THAN_OR_EQUAL_VALUE: return GREATER_THAN_OR_EQUAL;
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
	private DataQueueSearchType(int value, String name, String literal) {
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

} // DataQueueSearchType
