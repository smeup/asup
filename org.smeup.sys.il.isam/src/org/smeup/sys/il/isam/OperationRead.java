/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.isam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Operation Read</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.il.isam.QIntegratedLanguageIsamPackage#getOperationRead()
 * @model
 * @generated
 */
public enum OperationRead implements Enumerator {
	/**
	 * The '<em><b>Chain</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #CHAIN_VALUE
	 * @generated
	 * @ordered
	 */
	CHAIN(10, "Chain", "CHAIN"),

	/**
	 * The '<em><b>Read</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #READ_VALUE
	 * @generated
	 * @ordered
	 */
	READ(20, "Read", "READ"),

	/**
	 * The '<em><b>Read Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	READ_EQUAL(30, "ReadEqual", "READE"),

	/**
	 * The '<em><b>Read Prior</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_PRIOR_VALUE
	 * @generated
	 * @ordered
	 */
	READ_PRIOR(40, "ReadPrior", "READP"),

	/**
	 * The '<em><b>Read Prior Equal</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #READ_PRIOR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	READ_PRIOR_EQUAL(50, "ReadPriorEqual", "READPE");

	/**
	 * The '<em><b>Chain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Chain</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHAIN
	 * @model name="Chain" literal="CHAIN"
	 * @generated
	 * @ordered
	 */
	public static final int CHAIN_VALUE = 10;

	/**
	 * The '<em><b>Read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ
	 * @model name="Read" literal="READ"
	 * @generated
	 * @ordered
	 */
	public static final int READ_VALUE = 20;

	/**
	 * The '<em><b>Read Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Equal</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_EQUAL
	 * @model name="ReadEqual" literal="READE"
	 * @generated
	 * @ordered
	 */
	public static final int READ_EQUAL_VALUE = 30;

	/**
	 * The '<em><b>Read Prior</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Prior</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_PRIOR
	 * @model name="ReadPrior" literal="READP"
	 * @generated
	 * @ordered
	 */
	public static final int READ_PRIOR_VALUE = 40;

	/**
	 * The '<em><b>Read Prior Equal</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Read Prior Equal</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_PRIOR_EQUAL
	 * @model name="ReadPriorEqual" literal="READPE"
	 * @generated
	 * @ordered
	 */
	public static final int READ_PRIOR_EQUAL_VALUE = 50;

	/**
	 * An array of all the '<em><b>Operation Read</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final OperationRead[] VALUES_ARRAY = new OperationRead[] {
			CHAIN,
			READ,
			READ_EQUAL,
			READ_PRIOR,
			READ_PRIOR_EQUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Operation Read</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperationRead> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operation Read</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationRead get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationRead result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Read</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationRead getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationRead result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Read</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationRead get(int value) {
		switch (value) {
			case CHAIN_VALUE: return CHAIN;
			case READ_VALUE: return READ;
			case READ_EQUAL_VALUE: return READ_EQUAL;
			case READ_PRIOR_VALUE: return READ_PRIOR;
			case READ_PRIOR_EQUAL_VALUE: return READ_PRIOR_EQUAL;
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
	private OperationRead(int value, String name, String literal) {
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

} // OperationRead
