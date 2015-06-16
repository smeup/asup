/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Operation Set</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getOperationSet()
 * @model
 * @generated
 */
public enum OperationSet implements Enumerator {
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
	 * The '<em><b>Set Lower Limit</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #SET_LOWER_LIMIT_VALUE
	 * @generated
	 * @ordered
	 */
	SET_LOWER_LIMIT(20, "SetLowerLimit", "SETLL"),

	/**
	 * The '<em><b>Set Greater Than</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #SET_GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	SET_GREATER_THAN(30, "SetGreaterThan", "SETGT");

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
	 * The '<em><b>Set Lower Limit</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Set Lower Limit</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_LOWER_LIMIT
	 * @model name="SetLowerLimit" literal="SETLL"
	 * @generated
	 * @ordered
	 */
	public static final int SET_LOWER_LIMIT_VALUE = 20;

	/**
	 * The '<em><b>Set Greater Than</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Set Greater Than</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_GREATER_THAN
	 * @model name="SetGreaterThan" literal="SETGT"
	 * @generated
	 * @ordered
	 */
	public static final int SET_GREATER_THAN_VALUE = 30;

	/**
	 * An array of all the '<em><b>Operation Set</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final OperationSet[] VALUES_ARRAY = new OperationSet[] {
			CHAIN,
			SET_LOWER_LIMIT,
			SET_GREATER_THAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Operation Set</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperationSet> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operation Set</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationSet get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationSet result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Set</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationSet getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationSet result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Set</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationSet get(int value) {
		switch (value) {
			case CHAIN_VALUE: return CHAIN;
			case SET_LOWER_LIMIT_VALUE: return SET_LOWER_LIMIT;
			case SET_GREATER_THAN_VALUE: return SET_GREATER_THAN;
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
	private OperationSet(int value, String name, String literal) {
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

} // OperationSet
