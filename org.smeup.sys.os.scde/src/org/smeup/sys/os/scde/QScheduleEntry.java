/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.scde;

import java.util.List;
import org.smeup.sys.il.core.QObjectNameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.scde.QScheduleEntry#getCommandToRun <em>Command To Run</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.QScheduleEntry#getDescription <em>Description</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.QScheduleEntry#getEntryNumber <em>Entry Number</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.QScheduleEntry#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.QScheduleEntry#getJobName <em>Job Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.QScheduleEntry#getScheduledDate <em>Scheduled Date</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.QScheduleEntry#getScheduledDay <em>Scheduled Day</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.QScheduleEntry#getScheduledTime <em>Scheduled Time</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.QScheduleEntry#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduleEntry()
 * @model
 * @generated
 */
public interface QScheduleEntry extends QObjectNameable {
	/**
	 * Returns the value of the '<em><b>Scheduled Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Date</em>' attribute.
	 * @see #setScheduledDate(String)
	 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduleEntry_ScheduledDate()
	 * @model
	 * @generated
	 */
	String getScheduledDate();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.QScheduleEntry#getScheduledDate <em>Scheduled Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Date</em>' attribute.
	 * @see #getScheduledDate()
	 * @generated
	 */
	void setScheduledDate(String value);

	/**
	 * Returns the value of the '<em><b>Scheduled Day</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Day</em>' attribute list.
	 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduleEntry_ScheduledDay()
	 * @model annotation="il-data length='8'"
	 * @generated
	 */
	List<String> getScheduledDay();

	/**
	 * Returns the value of the '<em><b>Scheduled Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Time</em>' attribute.
	 * @see #setScheduledTime(String)
	 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduleEntry_ScheduledTime()
	 * @model required="true"
	 *        annotation="il-data length='8'"
	 * @generated
	 */
	String getScheduledTime();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.QScheduleEntry#getScheduledTime <em>Scheduled Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Time</em>' attribute.
	 * @see #getScheduledTime()
	 * @generated
	 */
	void setScheduledTime(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduleEntry_Description()
	 * @model annotation="il-data length='50'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.QScheduleEntry#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Entry Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Number</em>' attribute.
	 * @see #setEntryNumber(String)
	 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduleEntry_EntryNumber()
	 * @model annotation="il-data length='6'"
	 * @generated
	 */
	String getEntryNumber();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.QScheduleEntry#getEntryNumber <em>Entry Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Number</em>' attribute.
	 * @see #getEntryNumber()
	 * @generated
	 */
	void setEntryNumber(String value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(String)
	 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduleEntry_Frequency()
	 * @model required="true"
	 *        annotation="il-data length='1'"
	 * @generated
	 */
	String getFrequency();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.QScheduleEntry#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(String value);

	/**
	 * Returns the value of the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Name</em>' attribute.
	 * @see #setJobName(String)
	 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduleEntry_JobName()
	 * @model required="true"
	 *        annotation="il-data length='10'"
	 * @generated
	 */
	String getJobName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.QScheduleEntry#getJobName <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Name</em>' attribute.
	 * @see #getJobName()
	 * @generated
	 */
	void setJobName(String value);

	/**
	 * Returns the value of the '<em><b>Command To Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command To Run</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command To Run</em>' attribute.
	 * @see #setCommandToRun(String)
	 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduleEntry_CommandToRun()
	 * @model required="true"
	 *        annotation="il-data length='256'"
	 * @generated
	 */
	String getCommandToRun();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.QScheduleEntry#getCommandToRun <em>Command To Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command To Run</em>' attribute.
	 * @see #getCommandToRun()
	 * @generated
	 */
	void setCommandToRun(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduleEntry_User()
	 * @model annotation="il-data length='10'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.QScheduleEntry#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

} // QScheduleEntry
