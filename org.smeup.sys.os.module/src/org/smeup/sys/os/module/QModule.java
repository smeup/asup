/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.module;

import java.net.URI;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Module</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.module.QModule#getAddress <em>Address</em>}</li>
 *   <li>{@link org.smeup.sys.os.module.QModule#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.module.QOperatingSystemModulePackage#getModule()
 * @model
 * @generated
 */
public interface QModule extends org.smeup.sys.os.type.QTypedObject {

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.smeup.sys.os.module.QOperatingSystemModulePackage#getModule_Address()
	 * @model annotation="il-data length='128'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.module.QModule#getAddress
	 * <em>Address</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(QModuleSource)
	 * @see org.smeup.sys.os.module.QOperatingSystemModulePackage#getModule_Source()
	 * @model containment="true"
	 * @generated
	 */
	QModuleSource getSource();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.module.QModule#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(QModuleSource value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.smeup.sys.il.core.java.JavaURI"
	 * @generated
	 */
	URI getClassURI();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.smeup.sys.il.core.java.JavaURI"
	 * @generated
	 */
	URI getPackageInfoURI();
} // QModule
