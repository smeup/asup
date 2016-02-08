/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.jobs;

import java.util.List;

import org.smeup.sys.il.core.QObjectNameable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QJob Log</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJobLog#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJobLog#getJob <em>Job</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobLog()
 * @model
 * @generated
 */
public interface QJobLog extends QObjectNameable {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.os.core.jobs.QJobLogEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobLog_Entries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<QJobLogEntry> getEntries();

	/**
	 * Returns the value of the '<em><b>Job</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' reference.
	 * @see #setJob(QJob)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobLog_Job()
	 * @model required="true" transient="true"
	 * @generated
	 */
	QJob getJob();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJobLog#getJob <em>Job</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' reference.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(QJob value);

} // QJobLog
