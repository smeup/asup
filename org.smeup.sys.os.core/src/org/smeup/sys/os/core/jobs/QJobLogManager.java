/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.jobs;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QJob Log Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobLogManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QJobLogManager {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model jobRequired="true" messageRequired="true"
	 * @generated
	 */
	void info(QJob job, String message);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model jobRequired="true" messageRequired="true"
	 * @generated
	 */
	void warning(QJob job, String message);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model jobRequired="true"
	 * @generated
	 */
	void error(QJob job, String message);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model jobRequired="true"
	 * @generated
	 */
	QJobLog lookup(QJob job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" nameRequired="true" userRequired="true" numberRequired="true"
	 * @generated
	 */
	QJobLog lookup(String contextID, String name, String user, int number);

} // QJobLogManager
