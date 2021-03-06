/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.jobs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>QJob Status</b></em>', and utility methods for working with them. <!--
 * end-user-doc -->
 *
 * @see org.smeup.sys.os.core.jobs.OSCoreJobsPackage#getQJobStatus()
 * @model
 * @generated
 */
public enum QJobStatus implements Enumerator {
	/**
	 * The '<em><b>Active</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE(10, "Active", "ACT"),

	/**
	 * The '<em><b>Time Waiting</b></em>' literal object. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #TIME_WAITING_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_WAITING(20, "TimeWaiting", "TIMW"),

	/**
	 * The '<em><b>Run</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #RUN_VALUE
	 * @generated
	 * @ordered
	 */
	RUN(30, "Run", "RUN"),

	/**
	 * The '<em><b>Message Waiting</b></em>' literal object. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #MESSAGE_WAITING_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_WAITING(40, "MessageWaiting", "MSGW"),

	/**
	 * The '<em><b>Lock Waiting</b></em>' literal object. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #LOCK_WAITING_VALUE
	 * @generated
	 * @ordered
	 */
	LOCK_WAITING(50, "LockWaiting", "LCKW"),

	/**
	 * The '<em><b>Event Waiting</b></em>' literal object. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #EVENT_WAITING_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_WAITING(60, "EventWaiting", "EVTW"),

	/**
	 * The '<em><b>End Of Job</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #END_OF_JOB_VALUE
	 * @generated
	 * @ordered
	 */
	END_OF_JOB(70, "EndOfJob", "EOJ"),

	/**
	 * The '<em><b>End</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #END_VALUE
	 * @generated
	 * @ordered
	 */
	END(80, "End", "END");

	/**
	 * The '<em><b>Active</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Active</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #ACTIVE
	 * @model name="Active" literal="ACT"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_VALUE = 10;

	/**
	 * The '<em><b>Time Waiting</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time Waiting</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #TIME_WAITING
	 * @model name="TimeWaiting" literal="TIMW"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_WAITING_VALUE = 20;

	/**
	 * The '<em><b>Run</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Run</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #RUN
	 * @model name="Run" literal="RUN"
	 * @generated
	 * @ordered
	 */
	public static final int RUN_VALUE = 30;

	/**
	 * The '<em><b>Message Waiting</b></em>' literal value. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Message Waiting</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #MESSAGE_WAITING
	 * @model name="MessageWaiting" literal="MSGW"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_WAITING_VALUE = 40;

	/**
	 * The '<em><b>Lock Waiting</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lock Waiting</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #LOCK_WAITING
	 * @model name="LockWaiting" literal="LCKW"
	 * @generated
	 * @ordered
	 */
	public static final int LOCK_WAITING_VALUE = 50;

	/**
	 * The '<em><b>Event Waiting</b></em>' literal value. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Event Waiting</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #EVENT_WAITING
	 * @model name="EventWaiting" literal="EVTW"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_WAITING_VALUE = 60;

	/**
	 * The '<em><b>End Of Job</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>End Of Job</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #END_OF_JOB
	 * @model name="EndOfJob" literal="EOJ"
	 * @generated
	 * @ordered
	 */
	public static final int END_OF_JOB_VALUE = 70;

	/**
	 * The '<em><b>End</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>End</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @see #END
	 * @model name="End" literal="END"
	 * @generated
	 * @ordered
	 */
	public static final int END_VALUE = 80;

	/**
	 * An array of all the '<em><b>QJob Status</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final QJobStatus[] VALUES_ARRAY = new QJobStatus[] { ACTIVE, TIME_WAITING, RUN, MESSAGE_WAITING, LOCK_WAITING, EVENT_WAITING, END_OF_JOB, END, };

	/**
	 * A public read-only list of all the '<em><b>QJob Status</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<QJobStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>QJob Status</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static QJobStatus get(String literal) {
		for (QJobStatus result : VALUES_ARRAY)
			if (result.toString().equals(literal))
				return result;
		return null;
	}

	/**
	 * Returns the '<em><b>QJob Status</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static QJobStatus getByName(String name) {
		for (QJobStatus result : VALUES_ARRAY)
			if (result.getName().equals(name))
				return result;
		return null;
	}

	/**
	 * Returns the '<em><b>QJob Status</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static QJobStatus get(int value) {
		switch (value) {
		case ACTIVE_VALUE:
			return ACTIVE;
		case TIME_WAITING_VALUE:
			return TIME_WAITING;
		case RUN_VALUE:
			return RUN;
		case MESSAGE_WAITING_VALUE:
			return MESSAGE_WAITING;
		case LOCK_WAITING_VALUE:
			return LOCK_WAITING;
		case EVENT_WAITING_VALUE:
			return EVENT_WAITING;
		case END_OF_JOB_VALUE:
			return END_OF_JOB;
		case END_VALUE:
			return END;
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
	private QJobStatus(int value, String name, String literal) {
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

} // QJobStatus
