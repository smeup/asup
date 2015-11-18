/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.scde.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.smeup.sys.il.core.impl.ObjectNameableImpl;

import org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage;
import org.smeup.sys.os.scde.QScheduledEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduled Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduledEntryImpl#getScheduledDate <em>Scheduled Date</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduledEntryImpl#getScheduledTime <em>Scheduled Time</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduledEntryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduledEntryImpl#getCommandToRun <em>Command To Run</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.impl.ScheduledEntryImpl#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScheduledEntryImpl extends ObjectNameableImpl implements QScheduledEntry {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
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
	protected ScheduledEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QOperativeSystemScheduleEntryPackage.Literals.SCHEDULED_ENTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__SCHEDULED_DATE, oldScheduledDate, scheduledDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__SCHEDULED_TIME, oldScheduledTime, scheduledTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__COMMAND_TO_RUN, oldCommandToRun, commandToRun));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__SCHEDULED_DATE:
				return getScheduledDate();
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__SCHEDULED_TIME:
				return getScheduledTime();
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__DESCRIPTION:
				return getDescription();
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__COMMAND_TO_RUN:
				return getCommandToRun();
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__USER:
				return getUser();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__SCHEDULED_DATE:
				setScheduledDate((String)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__SCHEDULED_TIME:
				setScheduledTime((String)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__COMMAND_TO_RUN:
				setCommandToRun((String)newValue);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__USER:
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
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__SCHEDULED_DATE:
				setScheduledDate(SCHEDULED_DATE_EDEFAULT);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__SCHEDULED_TIME:
				setScheduledTime(SCHEDULED_TIME_EDEFAULT);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__COMMAND_TO_RUN:
				setCommandToRun(COMMAND_TO_RUN_EDEFAULT);
				return;
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__USER:
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
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__SCHEDULED_DATE:
				return SCHEDULED_DATE_EDEFAULT == null ? scheduledDate != null : !SCHEDULED_DATE_EDEFAULT.equals(scheduledDate);
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__SCHEDULED_TIME:
				return SCHEDULED_TIME_EDEFAULT == null ? scheduledTime != null : !SCHEDULED_TIME_EDEFAULT.equals(scheduledTime);
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__COMMAND_TO_RUN:
				return COMMAND_TO_RUN_EDEFAULT == null ? commandToRun != null : !COMMAND_TO_RUN_EDEFAULT.equals(commandToRun);
			case QOperativeSystemScheduleEntryPackage.SCHEDULED_ENTRY__USER:
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
		result.append(" (scheduledDate: ");
		result.append(scheduledDate);
		result.append(", scheduledTime: ");
		result.append(scheduledTime);
		result.append(", description: ");
		result.append(description);
		result.append(", commandToRun: ");
		result.append(commandToRun);
		result.append(", user: ");
		result.append(user);
		result.append(')');
		return result.toString();
	}

} //ScheduledEntryImpl
