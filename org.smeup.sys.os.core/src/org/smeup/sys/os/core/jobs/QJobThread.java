/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.jobs;

import org.smeup.sys.il.core.QObjectNameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJobThread#getThreadID <em>Thread ID</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJobThread#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJobThread#getThreadStatus <em>Thread Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobThread()
 * @model abstract="true"
 *        annotation="dk-core text='Ritengo questa classe assolutamente sbagliata, non dovrebbe essere astratta, ma un\'interfaccia pura'"
 * @generated
 */
public interface QJobThread extends QObjectNameable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobThread_Name()
	 * @model required="true" changeable="false" derived="true"
	 *        annotation="il-data length='30'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Thread ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread ID</em>' attribute.
	 * @see #setThreadID(long)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobThread_ThreadID()
	 * @model
	 * @generated
	 */
	long getThreadID();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJobThread#getThreadID <em>Thread ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread ID</em>' attribute.
	 * @see #getThreadID()
	 * @generated
	 */
	void setThreadID(long value);

	/**
	 * Returns the value of the '<em><b>Thread Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.os.core.jobs.JobThreadStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Status</em>' attribute.
	 * @see org.smeup.sys.os.core.jobs.JobThreadStatus
	 * @see #setThreadStatus(JobThreadStatus)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobThread_ThreadStatus()
	 * @model required="true"
	 * @generated
	 */
	JobThreadStatus getThreadStatus();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJobThread#getThreadStatus <em>Thread Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Status</em>' attribute.
	 * @see org.smeup.sys.os.core.jobs.JobThreadStatus
	 * @see #getThreadStatus()
	 * @generated
	 */
	void setThreadStatus(JobThreadStatus value);

} // QJobThread
