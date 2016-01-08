/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.jobs;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobThread()
 * @model abstract="true"
 *        annotation="dk-core text='Ritengo questa classe assolutamente sbagliata, non dovrebbe essere astratta, ma un\'interfaccia pura'"
 * @generated
 */
public interface QJobThread extends QObject {
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="il-data precision='10'"
	 * @generated
	 */
	long getThreadID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="il-data length='96'"
	 * @generated
	 */
	String getThreadName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="il-data precision='10'"
	 * @generated
	 */
	int getThreadPriority();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="il-data length='12'"
	 * @generated
	 */
	JobThreadStatus getThreadStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="il-data length='10'"
	 * @generated
	 */
	boolean isThreadDaemon();

} // QJobThread
