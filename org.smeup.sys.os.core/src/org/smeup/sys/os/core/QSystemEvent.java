/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.QSystemEvent#getSource <em>Source</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.QSystemEvent#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getSystemEvent()
 * @model
 * @generated
 */
public interface QSystemEvent {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(QSystem)
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getSystemEvent_Source()
	 * @model
	 * @generated
	 */
	QSystem getSource();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.QSystemEvent#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(QSystem value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.os.core.SystemEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.smeup.sys.os.core.SystemEventType
	 * @see #setType(SystemEventType)
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getSystemEvent_Type()
	 * @model required="true"
	 * @generated
	 */
	SystemEventType getType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.QSystemEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.smeup.sys.os.core.SystemEventType
	 * @see #getType()
	 * @generated
	 */
	void setType(SystemEventType value);

} // QSystemEvent
