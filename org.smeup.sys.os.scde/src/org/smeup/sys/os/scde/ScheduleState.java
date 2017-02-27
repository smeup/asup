/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.scde;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Schedule State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduleState()
 * @model
 * @generated
 */
public enum ScheduleState implements Enumerator {
	/**
	 * The '<em><b>Holded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLDED_VALUE
	 * @generated
	 * @ordered
	 */
	HOLDED(0, "Holded", "HLD"),

	/**
	 * The '<em><b>Saved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAVED_VALUE
	 * @generated
	 * @ordered
	 */
	SAVED(1, "Saved", "SAV"),

	/**
	 * The '<em><b>Scheduled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEDULED_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEDULED(2, "Scheduled", "SCD"),

	/**
	 * The '<em><b>Changed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGED_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGED(3, "Changed", "CHG");

	/**
	 * The '<em><b>Holded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Holded</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOLDED
	 * @model name="Holded" literal="HLD"
	 * @generated
	 * @ordered
	 */
	public static final int HOLDED_VALUE = 0;

	/**
	 * The '<em><b>Saved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Saved</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAVED
	 * @model name="Saved" literal="SAV"
	 * @generated
	 * @ordered
	 */
	public static final int SAVED_VALUE = 1;

	/**
	 * The '<em><b>Scheduled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scheduled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHEDULED
	 * @model name="Scheduled" literal="SCD"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEDULED_VALUE = 2;

	/**
	 * The '<em><b>Changed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Changed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANGED
	 * @model name="Changed" literal="CHG"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Schedule State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ScheduleState[] VALUES_ARRAY =
		new ScheduleState[] {
			HOLDED,
			SAVED,
			SCHEDULED,
			CHANGED,
		};

	/**
	 * A public read-only list of all the '<em><b>Schedule State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ScheduleState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Schedule State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScheduleState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScheduleState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Schedule State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScheduleState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScheduleState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Schedule State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScheduleState get(int value) {
		switch (value) {
			case HOLDED_VALUE: return HOLDED;
			case SAVED_VALUE: return SAVED;
			case SCHEDULED_VALUE: return SCHEDULED;
			case CHANGED_VALUE: return CHANGED;
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
	private ScheduleState(int value, String name, String literal) {
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
	
} //ScheduleState
