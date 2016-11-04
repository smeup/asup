/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.term;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Data Def Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.il.data.term.QTermPackage#getDataTermType()
 * @model
 * @generated
 */
public enum DataTermType implements Enumerator {
	/**
	 * The '<em><b>Unary Atomic</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #UNARY_ATOMIC_VALUE
	 * @generated
	 * @ordered
	 */
	UNARY_ATOMIC(10, "UnaryAtomic", "UNARY_ATOM"), /**
	 * The '<em><b>Unary Compound</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNARY_COMPOUND_VALUE
	 * @generated
	 * @ordered
	 */
	UNARY_COMPOUND(20, "UnaryCompound", "UNARY_COMP"), /**
	 * The '<em><b>Multiple Atomic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_ATOMIC_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_ATOMIC(30, "MultipleAtomic", "MULT_ATOM"), /**
	 * The '<em><b>Multiple Compound</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #MULTIPLE_COMPOUND_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_COMPOUND(40, "MultipleCompound", "MULT_COMP");

	/**
	 * The '<em><b>Unary Atomic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unary Atomic</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNARY_ATOMIC
	 * @model name="UnaryAtomic" literal="UNARY_ATOM"
	 * @generated
	 * @ordered
	 */
	public static final int UNARY_ATOMIC_VALUE = 10;

	/**
	 * The '<em><b>Unary Compound</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Unary Compound</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNARY_COMPOUND
	 * @model name="UnaryCompound" literal="UNARY_COMP"
	 * @generated
	 * @ordered
	 */
	public static final int UNARY_COMPOUND_VALUE = 20;

	/**
	 * The '<em><b>Multiple Atomic</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Multiple Atomic</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_ATOMIC
	 * @model name="MultipleAtomic" literal="MULT_ATOM"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_ATOMIC_VALUE = 30;

	/**
	 * The '<em><b>Multiple Compound</b></em>' literal value. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiple Compound</b></em>' literal object
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #MULTIPLE_COMPOUND
	 * @model name="MultipleCompound" literal="MULT_COMP"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_COMPOUND_VALUE = 40;

	/**
	 * An array of all the '<em><b>Data Term Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final DataTermType[] VALUES_ARRAY = new DataTermType[] {
			UNARY_ATOMIC,
			UNARY_COMPOUND,
			MULTIPLE_ATOMIC,
			MULTIPLE_COMPOUND,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Term Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataTermType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Term Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTermType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTermType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Term Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTermType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataTermType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Term Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataTermType get(int value) {
		switch (value) {
			case UNARY_ATOMIC_VALUE: return UNARY_ATOMIC;
			case UNARY_COMPOUND_VALUE: return UNARY_COMPOUND;
			case MULTIPLE_ATOMIC_VALUE: return MULTIPLE_ATOMIC;
			case MULTIPLE_COMPOUND_VALUE: return MULTIPLE_COMPOUND;
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
	private DataTermType(int value, String name, String literal) {
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

	public boolean isAtomic() {
		return !isCompound();
	}

	public boolean isCompound() {
		return (this == UNARY_COMPOUND || this == MULTIPLE_COMPOUND) ? true : false;
	}

	public boolean isUnary() {
		return !isMultiple();
	}

	public boolean isMultiple() {
		return (this == MULTIPLE_ATOMIC || this == MULTIPLE_COMPOUND) ? true : false;
	}
} // DataDefType
