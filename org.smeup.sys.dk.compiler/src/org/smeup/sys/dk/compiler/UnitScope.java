/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unit Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.dk.compiler.QDevelopmentKitCompilerPackage#getUnitScope()
 * @model
 * @generated
 */
public enum UnitScope implements Enumerator {
	/**
	 * The '<em><b>Friendly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIENDLY_VALUE
	 * @generated
	 * @ordered
	 */
	FRIENDLY(10, "Friendly", "FRIENDLY"),

	/**
	 * The '<em><b>Public</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC(20, "Public", "PUBLIC"),

	/**
	 * The '<em><b>Protected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTECTED_VALUE
	 * @generated
	 * @ordered
	 */
	PROTECTED(30, "Protected", "PROTECTED"),

	/**
	 * The '<em><b>Private</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATE(40, "Private", "PRIVATE");

	/**
	 * The '<em><b>Friendly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Friendly</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRIENDLY
	 * @model name="Friendly" literal="FRIENDLY"
	 * @generated
	 * @ordered
	 */
	public static final int FRIENDLY_VALUE = 10;

	/**
	 * The '<em><b>Public</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Public</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLIC
	 * @model name="Public" literal="PUBLIC"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_VALUE = 20;

	/**
	 * The '<em><b>Protected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Protected</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTECTED
	 * @model name="Protected" literal="PROTECTED"
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_VALUE = 30;

	/**
	 * The '<em><b>Private</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Private</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIVATE
	 * @model name="Private" literal="PRIVATE"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE_VALUE = 40;

	/**
	 * An array of all the '<em><b>Unit Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitScope[] VALUES_ARRAY =
		new UnitScope[] {
			FRIENDLY,
			PUBLIC,
			PROTECTED,
			PRIVATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Unit Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitScope> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unit Scope</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitScope get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitScope result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Scope</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitScope getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitScope result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unit Scope</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitScope get(int value) {
		switch (value) {
			case FRIENDLY_VALUE: return FRIENDLY;
			case PUBLIC_VALUE: return PUBLIC;
			case PROTECTED_VALUE: return PROTECTED;
			case PRIVATE_VALUE: return PRIVATE;
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
	private UnitScope(int value, String name, String literal) {
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
	
} //UnitScope
