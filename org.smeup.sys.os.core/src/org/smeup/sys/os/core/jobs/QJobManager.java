/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.jobs;

import java.util.List;
import java.util.concurrent.ExecutorService;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QJob Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QJobManager {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model jobRequired="true"
	 * @generated
	 */
	void close(QJob job);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model jobRequired="true" statusRequired="true"
	 * @generated
	 */
	void updateStatus(QJob job, JobStatus status);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.smeup.sys.il.core.java.JavaExecutorService" required="true" jobRequired="true"
	 * @generated
	 */
	ExecutorService executorFor(QJob job);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" userRequired="true" passwordRequired="true"
	 * @generated
	 */
	QJob create(String user, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" userRequired="true" passwordRequired="true" jobNameRequired="true"
	 * @generated
	 */
	QJob create(String user, String password, String jobName);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" credentialRequired="true"
	 * @generated
	 */
	QJob create(QJob credential);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" credentialRequired="true" jobNameRequired="true"
	 * @generated
	 */
	QJob create(QJob credential, String jobName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model millisRequired="true"
	 * @generated
	 */
	void delay(long millis);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model resumeTimeRequired="true"
	 * @generated
	 */
	void delay(String resumeTime);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	List<QJob> getActiveJobs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" nameRequired="true" userRequired="true" numberRequired="true"
	 * @generated
	 */
	QJob lookup(String contextID, String name, String user, int number);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" nameRequired="true" userRequired="true" numberRequired="true"
	 * @generated
	 */
	QJob lookup(String contextID, String name, String user, String number);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" jobIDRequired="true"
	 * @generated
	 */
	QJob lookupActiveJob(String contextID, String jobID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true"
	 * @generated
	 */
	QJob lookup(String contextID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerRequired="true"
	 * @generated
	 */
	void registerListener(QJobListener listener);

} // QJobManager
