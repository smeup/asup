/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getCommandToRun <em>Command To Run</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getEntryNumber <em>Entry Number</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getJobName <em>Job Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getScheduledDate <em>Scheduled Date</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getScheduledDay <em>Scheduled Day</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getScheduledTime <em>Scheduled Time</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduleEntryImpl#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduleEntryImpl extends ObjectNameableImpl implements QScheduleEntry {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getScheduledDate() <em>Scheduled Date</em>}' attribute.
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
	 * The default value of the '{@link #getScheduledDate() <em>Scheduled Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledDate()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduledDate() <em>Scheduled Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledDate()
	 * @generated
	 * @ordered
	 */
	protected String scheduledDate = SCHEDULED_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScheduledDay() <em>Scheduled Day</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledDay()
	 * @generated
	 * @ordered
	 */
	protected EList<String> scheduledDay;

	/**
	 * The default value of the '{@link #getScheduledTime() <em>Scheduled Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledTime()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduledTime() <em>Scheduled Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledTime()
	 * @generated
	 * @ordered
	 */
	protected String scheduledTime = SCHEDULED_TIME_EDEFAULT;

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
	public String getScheduledDate() {
		return scheduledDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledDate(String newScheduledDate) {
		String oldScheduledDate = scheduledDate;
		scheduledDate = newScheduledDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULED_DATE, oldScheduledDate, scheduledDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getScheduledDay() {
		if (scheduledDay == null) {
			scheduledDay = new EDataTypeUniqueEList<String>(String.class, this, QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULED_DAY);
		}
		return scheduledDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheduledTime() {
		return scheduledTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduledTime(String newScheduledTime) {
		String oldScheduledTime = scheduledTime;
		scheduledTime = newScheduledTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULED_TIME, oldScheduledTime, scheduledTime));
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
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULED_DATE:
				return getScheduledDate();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULED_DAY:
				return getScheduledDay();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULED_TIME:
				return getScheduledTime();
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
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULED_DATE:
				setScheduledDate((String)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULED_DAY:
				getScheduledDay().clear();
				getScheduledDay().addAll((Collection<? extends String>)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULED_TIME:
				setScheduledTime((String)newValue);
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
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULED_DATE:
				setScheduledDate(SCHEDULED_DATE_EDEFAULT);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULED_DAY:
				getScheduledDay().clear();
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULED_TIME:
				setScheduledTime(SCHEDULED_TIME_EDEFAULT);
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
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULED_DATE:
				return SCHEDULED_DATE_EDEFAULT == null ? scheduledDate != null : !SCHEDULED_DATE_EDEFAULT.equals(scheduledDate);
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULED_DAY:
				return scheduledDay != null && !scheduledDay.isEmpty();
			case QOperativeSystemScheduleEntryPackage.SCHEDULE_ENTRY__SCHEDULED_TIME:
				return SCHEDULED_TIME_EDEFAULT == null ? scheduledTime != null : !SCHEDULED_TIME_EDEFAULT.equals(scheduledTime);
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
		result.append(", scheduledDate: ");
		result.append(scheduledDate);
		result.append(", scheduledDay: ");
		result.append(scheduledDay);
		result.append(", scheduledTime: ");
		result.append(scheduledTime);
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
