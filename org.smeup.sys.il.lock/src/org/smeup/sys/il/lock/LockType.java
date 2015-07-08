/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.lock;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Lock Type</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 * 
 * @see org.smeup.sys.il.lock.QIntegratedLanguageLockPackage#getLockType()
 * @model
 * @generated
 */
public enum LockType implements Enumerator {
	/**
	 * The '<em><b>Read</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #READ_VALUE
	 * @generated
	 * @ordered
	 */
	READ(10, "Read", "READ"),

	/**
	 * The '<em><b>Write</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE(20, "Write", "WRITE");

	/**
	 * The '<em><b>Read</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #READ
	 * @model name="Read" literal="READ"
	 * @generated
	 * @ordered
	 */
	public static final int READ_VALUE = 10;

	/**
	 * The '<em><b>Write</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #WRITE
	 * @model name="Write" literal="WRITE"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_VALUE = 20;

	/**
	 * An array of all the '<em><b>Lock Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final LockType[] VALUES_ARRAY = new LockType[] { READ, WRITE, };

	/**
	 * A public read-only list of all the '<em><b>Lock Type</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<LockType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Lock Type</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static LockType get(String literal) {
		for (LockType result : VALUES_ARRAY) {
			if (result.toString().equals(literal))
				return result;
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lock Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static LockType getByName(String name) {
		for (LockType result : VALUES_ARRAY) {
			if (result.getName().equals(name))
				return result;
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lock Type</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static LockType get(int value) {
		switch (value) {
		case READ_VALUE:
			return READ;
		case WRITE_VALUE:
			return WRITE;
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
	private LockType(int value, String name, String literal) {
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

} // LockType
