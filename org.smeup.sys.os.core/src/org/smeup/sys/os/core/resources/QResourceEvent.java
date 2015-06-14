/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.resources;

import org.smeup.sys.il.core.QObjectNameable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QResource Event</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.resources.QResourceEvent#getSource <em>Source</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.resources.QResourceEvent#getType <em>Type</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.resources.QResourceEvent#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.core.resources.QOperatingSystemResourcesPackage#getResourceEvent()
 * @model
 * @generated
 */
public interface QResourceEvent<T extends QObjectNameable> {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(QObjectNameable)
	 * @see org.smeup.sys.os.core.resources.QOperatingSystemResourcesPackage#getResourceEvent_Source()
	 * @model
	 * @generated
	 */
	T getSource();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.os.core.resources.QResourceEvent#getSource
	 * <em>Source</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(T value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.os.core.resources.ResourceEventType}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.smeup.sys.os.core.resources.ResourceEventType
	 * @see #setType(ResourceEventType)
	 * @see org.smeup.sys.os.core.resources.QOperatingSystemResourcesPackage#getResourceEvent_Type()
	 * @model required="true"
	 * @generated
	 */
	ResourceEventType getType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.resources.QResourceEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.smeup.sys.os.core.resources.ResourceEventType
	 * @see #getType()
	 * @generated
	 */
	void setType(ResourceEventType value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(QResource)
	 * @see org.smeup.sys.os.core.resources.QOperatingSystemResourcesPackage#getResourceEvent_Resource()
	 * @model
	 * @generated
	 */
	QResource<T> getResource();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.os.core.resources.QResourceEvent#getResource
	 * <em>Resource</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(QResource<T> value);

} // QResourceEvent
