/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Test Runner Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.dk.test.QDevelopmentKitTestPackage#getTestRunnerEventType()
 * @model
 * @generated
 */
public enum TestRunnerEventType implements Enumerator {
	/**
	 * The '<em><b>Unit Starting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_STARTING_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_STARTING(10, "UnitStarting", "UNIT_STARTING"), /**
	 * The '<em><b>Unit Stopping</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_STOPPING_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_STOPPING(20, "UnitStopping", "UNIT_STOPPING"), /**
	 * The '<em><b>Unit Stopped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_STOPPED_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_STOPPED(30, "UnitStopped", "UNIT_STOPPED"), /**
	 * The '<em><b>Suite Starting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUITE_STARTING_VALUE
	 * @generated
	 * @ordered
	 */
	SUITE_STARTING(110, "SuiteStarting", "SUITE_STARTING"), /**
	 * The '<em><b>Suite Stopping</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUITE_STOPPING_VALUE
	 * @generated
	 * @ordered
	 */
	SUITE_STOPPING(120, "SuiteStopping", "SUITE_STOPPING"), /**
	 * The '<em><b>Suite Stopped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUITE_STOPPED_VALUE
	 * @generated
	 * @ordered
	 */
	SUITE_STOPPED(130, "SuiteStopped", "SUITE_STOPPED")
	;

	/**
	 * The '<em><b>Unit Starting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unit Starting</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT_STARTING
	 * @model name="UnitStarting" literal="UNIT_STARTING"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_STARTING_VALUE = 10;

	/**
	 * The '<em><b>Unit Stopping</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unit Stopping</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT_STOPPING
	 * @model name="UnitStopping" literal="UNIT_STOPPING"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_STOPPING_VALUE = 20;

	/**
	 * The '<em><b>Unit Stopped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unit Stopped</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT_STOPPED
	 * @model name="UnitStopped" literal="UNIT_STOPPED"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_STOPPED_VALUE = 30;

/**
	 * The '<em><b>Suite Starting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Suite Starting</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUITE_STARTING
	 * @model name="SuiteStarting" literal="SUITE_STARTING"
	 * @generated
	 * @ordered
	 */
	public static final int SUITE_STARTING_VALUE = 110;

/**
	 * The '<em><b>Suite Stopping</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Suite Stopping</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUITE_STOPPING
	 * @model name="SuiteStopping" literal="SUITE_STOPPING"
	 * @generated
	 * @ordered
	 */
	public static final int SUITE_STOPPING_VALUE = 120;

/**
	 * The '<em><b>Suite Stopped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Suite Stopped</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUITE_STOPPED
	 * @model name="SuiteStopped" literal="SUITE_STOPPED"
	 * @generated
	 * @ordered
	 */
	public static final int SUITE_STOPPED_VALUE = 130;

	/**
	 * An array of all the '<em><b>Test Runner Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TestRunnerEventType[] VALUES_ARRAY =
		new TestRunnerEventType[] {
			UNIT_STARTING,
			UNIT_STOPPING,
			UNIT_STOPPED,
			SUITE_STARTING,
			SUITE_STOPPING,
			SUITE_STOPPED,
		};

	/**
	 * A public read-only list of all the '<em><b>Test Runner Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TestRunnerEventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Test Runner Event Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestRunnerEventType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestRunnerEventType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Test Runner Event Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestRunnerEventType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestRunnerEventType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Test Runner Event Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TestRunnerEventType get(int value) {
		switch (value) {
			case UNIT_STARTING_VALUE: return UNIT_STARTING;
			case UNIT_STOPPING_VALUE: return UNIT_STOPPING;
			case UNIT_STOPPED_VALUE: return UNIT_STOPPED;
			case SUITE_STARTING_VALUE: return SUITE_STARTING;
			case SUITE_STOPPING_VALUE: return SUITE_STOPPING;
			case SUITE_STOPPED_VALUE: return SUITE_STOPPED;
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
	private TestRunnerEventType(int value, String name, String literal) {
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
	
} //TestRunnerEventType
