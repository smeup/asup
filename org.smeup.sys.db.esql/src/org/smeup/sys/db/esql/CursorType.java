/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.esql;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cursor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.db.esql.QIntegratedLanguageEmbeddedSQLPackage#getCursorType()
 * @model
 * @generated
 */
public enum CursorType implements Enumerator {
	/**
	 * The '<em><b>Not Scrollable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SCROLLABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SCROLLABLE(10, "NotScrollable", "NOTSCROLL"),

	/**
	 * The '<em><b>Scrollable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCROLLABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SCROLLABLE(20, "Scrollable", "SCROLL"),

	/**
	 * The '<em><b>Dynamic Scroll</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC_SCROLL_VALUE
	 * @generated
	 * @ordered
	 */
	DYNAMIC_SCROLL(30, "DynamicScroll", "DYNSCROLL");

	/**
	 * The '<em><b>Not Scrollable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Scrollable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_SCROLLABLE
	 * @model name="NotScrollable" literal="NOTSCROLL"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SCROLLABLE_VALUE = 10;

	/**
	 * The '<em><b>Scrollable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scrollable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCROLLABLE
	 * @model name="Scrollable" literal="SCROLL"
	 * @generated
	 * @ordered
	 */
	public static final int SCROLLABLE_VALUE = 20;

	/**
	 * The '<em><b>Dynamic Scroll</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dynamic Scroll</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC_SCROLL
	 * @model name="DynamicScroll" literal="DYNSCROLL"
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC_SCROLL_VALUE = 30;

	/**
	 * An array of all the '<em><b>Cursor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CursorType[] VALUES_ARRAY =
		new CursorType[] {
			NOT_SCROLLABLE,
			SCROLLABLE,
			DYNAMIC_SCROLL,
		};

	/**
	 * A public read-only list of all the '<em><b>Cursor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CursorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cursor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CursorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CursorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cursor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CursorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CursorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cursor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CursorType get(int value) {
		switch (value) {
			case NOT_SCROLLABLE_VALUE: return NOT_SCROLLABLE;
			case SCROLLABLE_VALUE: return SCROLLABLE;
			case DYNAMIC_SCROLL_VALUE: return DYNAMIC_SCROLL;
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
	private CursorType(int value, String name, String literal) {
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
	
} //CursorType
