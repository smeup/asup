/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.scde;

import org.smeup.sys.il.core.QObjectNameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.scde.QScheduledEntry#getScheduledDate <em>Scheduled Date</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.QScheduledEntry#getScheduledTime <em>Scheduled Time</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.QScheduledEntry#getDescription <em>Description</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.QScheduledEntry#getCommandToRun <em>Command To Run</em>}</li>
 *   <li>{@link org.smeup.sys.os.scde.QScheduledEntry#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduledEntry()
 * @model
 * @generated
 */
public interface QScheduledEntry extends QObjectNameable {
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
	 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduledEntry_ScheduledDate()
	 * @model required="true"
	 *        annotation="il-data length='8'"
	 * @generated
	 */
	String getScheduledDate();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.QScheduledEntry#getScheduledDate <em>Scheduled Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Date</em>' attribute.
	 * @see #getScheduledDate()
	 * @generated
	 */
	void setScheduledDate(String value);

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
	 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduledEntry_ScheduledTime()
	 * @model required="true"
	 *        annotation="il-data length='8'"
	 * @generated
	 */
	String getScheduledTime();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.QScheduledEntry#getScheduledTime <em>Scheduled Time</em>}' attribute.
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
	 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduledEntry_Description()
	 * @model annotation="il-data length='50'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.QScheduledEntry#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduledEntry_CommandToRun()
	 * @model required="true"
	 *        annotation="il-data length='256'"
	 * @generated
	 */
	String getCommandToRun();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.QScheduledEntry#getCommandToRun <em>Command To Run</em>}' attribute.
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
	 * @see org.smeup.sys.os.scde.QOperativeSystemScheduleEntryPackage#getScheduledEntry_User()
	 * @model required="true"
	 *        annotation="il-data length='10'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.scde.QScheduledEntry#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

} // QScheduledEntry
