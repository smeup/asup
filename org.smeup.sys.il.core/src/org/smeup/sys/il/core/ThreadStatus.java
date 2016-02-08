/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Thread Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getThreadStatus()
 * @model
 * @generated
 */
public enum ThreadStatus implements Enumerator {
	/**
	 * The '<em><b>New</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_VALUE
	 * @generated
	 * @ordered
	 */
	NEW(10, "New", "NEW"), /**
	 * The '<em><b>Runnable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNNABLE_VALUE
	 * @generated
	 * @ordered
	 */
	RUNNABLE(20, "Runnable", "RUN"), /**
	 * The '<em><b>Blocked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCKED(30, "Blocked", "BLOCK"), /**
	 * The '<em><b>Waiting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAITING_VALUE
	 * @generated
	 * @ordered
	 */
	WAITING(40, "Waiting", "WAIT"),

	/**
	 * The '<em><b>Timed Waiting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMED_WAITING_VALUE
	 * @generated
	 * @ordered
	 */
	TIMED_WAITING(50, "TimedWaiting", "TIME_WAIT"), /**
	 * The '<em><b>Terminated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERMINATED_VALUE
	 * @generated
	 * @ordered
	 */
	TERMINATED(60, "Terminated", "END");

	/**
	 * The '<em><b>New</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>New</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEW
	 * @model name="New" literal="NEW"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_VALUE = 10;

	/**
	 * The '<em><b>Runnable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Runnable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUNNABLE
	 * @model name="Runnable" literal="RUN"
	 * @generated
	 * @ordered
	 */
	public static final int RUNNABLE_VALUE = 20;

	/**
	 * The '<em><b>Blocked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blocked</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLOCKED
	 * @model name="Blocked" literal="BLOCK"
	 * @generated
	 * @ordered
	 */
	public static final int BLOCKED_VALUE = 30;

	/**
	 * The '<em><b>Waiting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Waiting</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAITING
	 * @model name="Waiting" literal="WAIT"
	 * @generated
	 * @ordered
	 */
	public static final int WAITING_VALUE = 40;

	/**
	 * The '<em><b>Timed Waiting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Timed Waiting</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMED_WAITING
	 * @model name="TimedWaiting" literal="TIME_WAIT"
	 * @generated
	 * @ordered
	 */
	public static final int TIMED_WAITING_VALUE = 50;

	/**
	 * The '<em><b>Terminated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Terminated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TERMINATED
	 * @model name="Terminated" literal="END"
	 * @generated
	 * @ordered
	 */
	public static final int TERMINATED_VALUE = 60;

	/**
	 * An array of all the '<em><b>Thread Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ThreadStatus[] VALUES_ARRAY =
		new ThreadStatus[] {
			NEW,
			RUNNABLE,
			BLOCKED,
			WAITING,
			TIMED_WAITING,
			TERMINATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Thread Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ThreadStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Thread Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ThreadStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThreadStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Thread Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ThreadStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThreadStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Thread Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ThreadStatus get(int value) {
		switch (value) {
			case NEW_VALUE: return NEW;
			case RUNNABLE_VALUE: return RUNNABLE;
			case BLOCKED_VALUE: return BLOCKED;
			case WAITING_VALUE: return WAITING;
			case TIMED_WAITING_VALUE: return TIMED_WAITING;
			case TERMINATED_VALUE: return TERMINATED;
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
	private ThreadStatus(int value, String name, String literal) {
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
	
} //ThreadStatus
