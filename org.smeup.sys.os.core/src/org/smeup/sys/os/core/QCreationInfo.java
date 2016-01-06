/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core;

import java.util.Date;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Creation Info</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.QCreationInfo#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.QCreationInfo#getCreationUser <em>Creation User</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.QCreationInfo#getCreationSystem <em>Creation System</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getCreationInfo()
 * @model
 * @generated
 */
public interface QCreationInfo extends QObject {
	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getCreationInfo_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.QCreationInfo#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Creation User</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Creation User</em>' attribute.
	 * @see #setCreationUser(String)
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getCreationInfo_CreationUser()
	 * @model
	 * @generated
	 */
	String getCreationUser();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.QCreationInfo#getCreationUser <em>Creation User</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Creation User</em>' attribute.
	 * @see #getCreationUser()
	 * @generated
	 */
	void setCreationUser(String value);

	/**
	 * Returns the value of the '<em><b>Creation System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation System</em>' attribute.
	 * @see #setCreationSystem(String)
	 * @see org.smeup.sys.os.core.QOperatingSystemCorePackage#getCreationInfo_CreationSystem()
	 * @model
	 * @generated
	 */
	String getCreationSystem();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.QCreationInfo#getCreationSystem <em>Creation System</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Creation System</em>' attribute.
	 * @see #getCreationSystem()
	 * @generated
	 */
	void setCreationSystem(String value);

} // QCreationInfo
