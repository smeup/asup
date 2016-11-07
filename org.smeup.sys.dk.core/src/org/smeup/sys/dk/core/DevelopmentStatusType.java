/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Development Status Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.dk.core.QDevelopmentKitCorePackage#getDevelopmentStatusType()
 * @model
 * @generated
 */
public enum DevelopmentStatusType implements Enumerator {
	/**
	 * The '<em><b>Supported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPORTED(10, "Supported", "SUP"),

	/**
	 * The '<em><b>Unsupported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUPPORTED(20, "Unsupported", "UNS"),

	/**
	 * The '<em><b>To Do</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_DO_VALUE
	 * @generated
	 * @ordered
	 */
	TO_DO(30, "ToDo", "TODO");

	/**
	 * The '<em><b>Supported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Supported</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPPORTED
	 * @model name="Supported" literal="SUP"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPORTED_VALUE = 10;

	/**
	 * The '<em><b>Unsupported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsupported</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSUPPORTED
	 * @model name="Unsupported" literal="UNS"
	 * @generated
	 * @ordered
	 */
	public static final int UNSUPPORTED_VALUE = 20;

	/**
	 * The '<em><b>To Do</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To Do</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_DO
	 * @model name="ToDo" literal="TODO"
	 * @generated
	 * @ordered
	 */
	public static final int TO_DO_VALUE = 30;

	/**
	 * An array of all the '<em><b>Development Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DevelopmentStatusType[] VALUES_ARRAY =
		new DevelopmentStatusType[] {
			SUPPORTED,
			UNSUPPORTED,
			TO_DO,
		};

	/**
	 * A public read-only list of all the '<em><b>Development Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DevelopmentStatusType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Development Status Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DevelopmentStatusType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DevelopmentStatusType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Development Status Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DevelopmentStatusType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DevelopmentStatusType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Development Status Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DevelopmentStatusType get(int value) {
		switch (value) {
			case SUPPORTED_VALUE: return SUPPORTED;
			case UNSUPPORTED_VALUE: return UNSUPPORTED;
			case TO_DO_VALUE: return TO_DO;
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
	private DevelopmentStatusType(int value, String name, String literal) {
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
	
} //DevelopmentStatusType
