/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.scde.impl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.smeup.sys.il.core.impl.ObjectNameableImpl;
import org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage;
import org.smeup.sys.os.scde.QScheduleEntry;
import org.smeup.sys.os.scde.ScheduleState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getCommandToRun <em>Command To Run</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getEntryNumber <em>Entry Number</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getJobName <em>Job Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getScheduleDate <em>Schedule Date</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getScheduleDay <em>Schedule Day</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getOmitDate <em>Omit Date</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getRelativeDayOfMonth <em>Relative Day Of Month</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getScheduleTime <em>Schedule Time</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getState <em>State</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleEntryImpl extends ObjectNameableImpl implements QScheduleEntry {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getCommandToRun() <em>Command To Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandToRun()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_TO_RUN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandToRun() <em>Command To Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandToRun()
	 * @generated
	 * @ordered
	 */
	protected String commandToRun = COMMAND_TO_RUN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntryNumber() <em>Entry Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryNumber() <em>Entry Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryNumber()
	 * @generated
	 * @ordered
	 */
	protected String entryNumber = ENTRY_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected String frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobName()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobName()
	 * @generated
	 * @ordered
	 */
	protected String jobName = JOB_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduleDate() <em>Schedule Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDate()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduleDate() <em>Schedule Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDate()
	 * @generated
	 * @ordered
	 */
	protected String scheduleDate = SCHEDULE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScheduleDay() <em>Schedule Day</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDay()
	 * @generated
	 * @ordered
	 */
	protected EList<String> scheduleDay;

	/**
	 * The cached value of the '{@link #getOmitDate() <em>Omit Date</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOmitDate()
	 * @generated
	 * @ordered
	 */
	protected EList<String> omitDate;

	/**
	 * The cached value of the '{@link #getRelativeDayOfMonth() <em>Relative Day Of Month</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeDayOfMonth()
	 * @generated
	 * @ordered
	 */
	protected EList<String> relativeDayOfMonth;

	/**
	 * The default value of the '{@link #getScheduleTime() <em>Schedule Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleTime()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduleTime() <em>Schedule Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleTime()
	 * @generated
	 * @ordered
	 */
	protected String scheduleTime = SCHEDULE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final ScheduleState STATE_EDEFAULT = ScheduleState.HOLDED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ScheduleState state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperativeSystemScheduleEntryPackage.Literals.SCHEDULE_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ScheduleState newState) {
		ScheduleState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntryNumber() {
		return entryNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryNumber(String newEntryNumber) {
		String oldEntryNumber = entryNumber;
		entryNumber = newEntryNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__ENTRY_NUMBER, oldEntryNumber, entryNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(String newFrequency) {
		String oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobName() {
		return jobName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobName(String newJobName) {
		String oldJobName = jobName;
		jobName = newJobName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__JOB_NAME, oldJobName, jobName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheduleDate() {
		return scheduleDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleDate(String newScheduleDate) {
		String oldScheduleDate = scheduleDate;
		scheduleDate = newScheduleDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_DATE, oldScheduleDate, scheduleDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getScheduleDay() {
		if (scheduleDay == null) {
			scheduleDay = new EDataTypeUniqueEList<String>(String.class, this, QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_DAY);
		}
		return scheduleDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getOmitDate() {
		if (omitDate == null) {
			omitDate = new EDataTypeUniqueEList<String>(String.class, this, QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__OMIT_DATE);
		}
		return omitDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getRelativeDayOfMonth() {
		if (relativeDayOfMonth == null) {
			relativeDayOfMonth = new EDataTypeUniqueEList<String>(String.class, this, QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__RELATIVE_DAY_OF_MONTH);
		}
		return relativeDayOfMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheduleTime() {
		return scheduleTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleTime(String newScheduleTime) {
		String oldScheduleTime = scheduleTime;
		scheduleTime = newScheduleTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_TIME, oldScheduleTime, scheduleTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommandToRun() {
		return commandToRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandToRun(String newCommandToRun) {
		String oldCommandToRun = commandToRun;
		commandToRun = newCommandToRun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__COMMAND_TO_RUN, oldCommandToRun, commandToRun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__COMMAND_TO_RUN:
				return getCommandToRun();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__DESCRIPTION:
				return getDescription();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__ENTRY_NUMBER:
				return getEntryNumber();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__FREQUENCY:
				return getFrequency();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__JOB_NAME:
				return getJobName();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_DATE:
				return getScheduleDate();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_DAY:
				return getScheduleDay();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__OMIT_DATE:
				return getOmitDate();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__RELATIVE_DAY_OF_MONTH:
				return getRelativeDayOfMonth();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_TIME:
				return getScheduleTime();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__STATE:
				return getState();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__USER:
				return getUser();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__COMMAND_TO_RUN:
				setCommandToRun((String)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__ENTRY_NUMBER:
				setEntryNumber((String)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__FREQUENCY:
				setFrequency((String)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__JOB_NAME:
				setJobName((String)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_DATE:
				setScheduleDate((String)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_DAY:
				getScheduleDay().clear();
				getScheduleDay().addAll((Collection<? extends String>)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__OMIT_DATE:
				getOmitDate().clear();
				getOmitDate().addAll((Collection<? extends String>)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__RELATIVE_DAY_OF_MONTH:
				getRelativeDayOfMonth().clear();
				getRelativeDayOfMonth().addAll((Collection<? extends String>)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_TIME:
				setScheduleTime((String)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__STATE:
				setState((ScheduleState)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__USER:
				setUser((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__COMMAND_TO_RUN:
				setCommandToRun(COMMAND_TO_RUN_EDEFAULT);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__ENTRY_NUMBER:
				setEntryNumber(ENTRY_NUMBER_EDEFAULT);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__JOB_NAME:
				setJobName(JOB_NAME_EDEFAULT);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_DATE:
				setScheduleDate(SCHEDULE_DATE_EDEFAULT);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_DAY:
				getScheduleDay().clear();
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__OMIT_DATE:
				getOmitDate().clear();
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__RELATIVE_DAY_OF_MONTH:
				getRelativeDayOfMonth().clear();
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_TIME:
				setScheduleTime(SCHEDULE_TIME_EDEFAULT);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__STATE:
				setState(STATE_EDEFAULT);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__USER:
				setUser(USER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__COMMAND_TO_RUN:
				return COMMAND_TO_RUN_EDEFAULT == null ? commandToRun != null : !COMMAND_TO_RUN_EDEFAULT.equals(commandToRun);
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__ENTRY_NUMBER:
				return ENTRY_NUMBER_EDEFAULT == null ? entryNumber != null : !ENTRY_NUMBER_EDEFAULT.equals(entryNumber);
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__FREQUENCY:
				return FREQUENCY_EDEFAULT == null ? frequency != null : !FREQUENCY_EDEFAULT.equals(frequency);
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__JOB_NAME:
				return JOB_NAME_EDEFAULT == null ? jobName != null : !JOB_NAME_EDEFAULT.equals(jobName);
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_DATE:
				return SCHEDULE_DATE_EDEFAULT == null ? scheduleDate != null : !SCHEDULE_DATE_EDEFAULT.equals(scheduleDate);
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_DAY:
				return scheduleDay != null && !scheduleDay.isEmpty();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__OMIT_DATE:
				return omitDate != null && !omitDate.isEmpty();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__RELATIVE_DAY_OF_MONTH:
				return relativeDayOfMonth != null && !relativeDayOfMonth.isEmpty();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULE_TIME:
				return SCHEDULE_TIME_EDEFAULT == null ? scheduleTime != null : !SCHEDULE_TIME_EDEFAULT.equals(scheduleTime);
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__STATE:
				return state != STATE_EDEFAULT;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (commandToRun: ");
		result.append(commandToRun);
		result.append(", description: ");
		result.append(description);
		result.append(", entryNumber: ");
		result.append(entryNumber);
		result.append(", frequency: ");
		result.append(frequency);
		result.append(", jobName: ");
		result.append(jobName);
		result.append(", scheduleDate: ");
		result.append(scheduleDate);
		result.append(", scheduleDay: ");
		result.append(scheduleDay);
		result.append(", omitDate: ");
		result.append(omitDate);
		result.append(", relativeDayOfMonth: ");
		result.append(relativeDayOfMonth);
		result.append(", scheduleTime: ");
		result.append(scheduleTime);
		result.append(", state: ");
		result.append(state);
		result.append(", user: ");
		result.append(user);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		
		return getJobName();
	}

} //ScheduleEntryImpl
