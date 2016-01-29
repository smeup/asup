/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.usrprf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>User Class</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.os.usrprf.QOperatingSystemUserProfilePackage#getUserClass()
 * @model
 * @generated
 */
public enum UserClass implements Enumerator {
	/**
	 * The '<em><b>User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_VALUE
	 * @generated
	 * @ordered
	 */
	USER(100, "User", "*USER"),

	/**
	 * The '<em><b>Sysopr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSOPR_VALUE
	 * @generated
	 * @ordered
	 */
	SYSOPR(200, "Sysopr", "*SYSOPR"), /**
	 * The '<em><b>Pgmr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PGMR_VALUE
	 * @generated
	 * @ordered
	 */
	PGMR(300, "Pgmr", "*PGMR"),

	/**
	 * The '<em><b>Secadm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECADM_VALUE
	 * @generated
	 * @ordered
	 */
	SECADM(400, "Secadm", "*SECADM"), /**
	 * The '<em><b>Secofr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOFR_VALUE
	 * @generated
	 * @ordered
	 */
	SECOFR(500, "Secofr", "*SECOFR");

	/**
	 * The '<em><b>User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>User</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER
	 * @model name="User" literal="*USER"
	 * @generated
	 * @ordered
	 */
	public static final int USER_VALUE = 100;

	/**
	 * The '<em><b>Sysopr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sysopr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSOPR
	 * @model name="Sysopr" literal="*SYSOPR"
	 * @generated
	 * @ordered
	 */
	public static final int SYSOPR_VALUE = 200;

	/**
	 * The '<em><b>Pgmr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pgmr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PGMR
	 * @model name="Pgmr" literal="*PGMR"
	 * @generated
	 * @ordered
	 */
	public static final int PGMR_VALUE = 300;

	/**
	 * The '<em><b>Secadm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Secadm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECADM
	 * @model name="Secadm" literal="*SECADM"
	 * @generated
	 * @ordered
	 */
	public static final int SECADM_VALUE = 400;

	/**
	 * The '<em><b>Secofr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Secofr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECOFR
	 * @model name="Secofr" literal="*SECOFR"
	 * @generated
	 * @ordered
	 */
	public static final int SECOFR_VALUE = 500;

	/**
	 * An array of all the '<em><b>User Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UserClass[] VALUES_ARRAY =
		new UserClass[] {
			USER,
			SYSOPR,
			PGMR,
			SECADM,
			SECOFR,
		};

	/**
	 * A public read-only list of all the '<em><b>User Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UserClass> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>User Class</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserClass get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserClass result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Class</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserClass getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserClass result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Class</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserClass get(int value) {
		switch (value) {
			case USER_VALUE: return USER;
			case SYSOPR_VALUE: return SYSOPR;
			case PGMR_VALUE: return PGMR;
			case SECADM_VALUE: return SECADM;
			case SECOFR_VALUE: return SECOFR;
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
	private UserClass(int value, String name, String literal) {
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
	
} //UserClass
