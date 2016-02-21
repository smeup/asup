/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.jobs;

import org.smeup.sys.il.core.ctx.QCapability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJobCapability#getJobReference <em>Job Reference</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.jobs.QJobCapability#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobCapability()
 * @model
 * @generated
 */
public interface QJobCapability extends QCapability {

	/**
	 * Returns the value of the '<em><b>Job Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Reference</em>' reference.
	 * @see #setJobReference(QJobReference)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobCapability_JobReference()
	 * @model required="true"
	 * @generated
	 */
	QJobReference getJobReference();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJobCapability#getJobReference <em>Job Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Reference</em>' reference.
	 * @see #getJobReference()
	 * @generated
	 */
	void setJobReference(QJobReference value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see org.smeup.sys.os.core.jobs.QOperatingSystemJobsPackage#getJobCapability_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.jobs.QJobCapability#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);
} // QJobCapability
