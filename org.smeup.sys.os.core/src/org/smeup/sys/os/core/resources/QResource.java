/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.resources;

import org.smeup.sys.il.core.QObjectNameable;
import org.smeup.sys.os.core.jobs.QJob;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QResource</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.resources.QResource#getJob <em>Job</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.resources.QResource#getNotifier <em>Notifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.core.resources.QOperatingSystemResourcesPackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface QResource<T extends QObjectNameable> {
	/**
	 * Returns the value of the '<em><b>Job</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Job</em>' reference.
	 * @see #setJob(QJob)
	 * @see org.smeup.sys.os.core.resources.QOperatingSystemResourcesPackage#getResource_Job()
	 * @model required="true"
	 * @generated
	 */
	QJob getJob();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.resources.QResource#getJob <em>Job</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' reference.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(QJob value);

	/**
	 * Returns the value of the '<em><b>Notifier</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notifier</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Notifier</em>' reference.
	 * @see #setNotifier(QResourceNotifier)
	 * @see org.smeup.sys.os.core.resources.QOperatingSystemResourcesPackage#getResource_Notifier()
	 * @model
	 * @generated
	 */
	QResourceNotifier<T> getNotifier();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.os.core.resources.QResource#getNotifier
	 * <em>Notifier</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Notifier</em>' reference.
	 * @see #getNotifier()
	 * @generated
	 */
	void setNotifier(QResourceNotifier<T> value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model eventRequired="true" eventTypeRequired="true" objectRequired="true"
	 * @generated
	 */
	void fireEvent(QResourceEvent<T> event, ResourceEventType eventType, T object);

} // QResource
