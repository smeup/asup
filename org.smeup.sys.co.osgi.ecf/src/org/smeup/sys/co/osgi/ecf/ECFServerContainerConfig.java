/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.osgi.ecf;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>ECF Server Container Config</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.co.osgi.ecf.ECFServerContainerConfig#getServerContainerType <em>Server Container Type</em>}</li>
 *   <li>{@link org.smeup.sys.co.osgi.ecf.ECFServerContainerConfig#getContainerId <em>Container Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.co.osgi.ecf.ECFConnectorOSGIPackage#getECFServerContainerConfig()
 * @model
 * @generated
 */
public interface ECFServerContainerConfig {
	/**
	 * Returns the value of the '<em><b>Server Container Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Container Type</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Container Type</em>' attribute.
	 * @see #setServerContainerType(String)
	 * @see org.smeup.sys.co.osgi.ecf.ECFConnectorOSGIPackage#getECFServerContainerConfig_ServerContainerType()
	 * @model required="true"
	 * @generated
	 */
	String getServerContainerType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.co.osgi.ecf.ECFServerContainerConfig#getServerContainerType <em>Server Container Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Server Container Type</em>' attribute.
	 * @see #getServerContainerType()
	 * @generated
	 */
	void setServerContainerType(String value);

	/**
	 * Returns the value of the '<em><b>Container Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Container Id</em>' attribute.
	 * @see #setContainerId(String)
	 * @see org.smeup.sys.co.osgi.ecf.ECFConnectorOSGIPackage#getECFServerContainerConfig_ContainerId()
	 * @model required="true"
	 * @generated
	 */
	String getContainerId();

	/**
	 * Sets the value of the '{@link org.smeup.sys.co.osgi.ecf.ECFServerContainerConfig#getContainerId <em>Container Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Container Id</em>' attribute.
	 * @see #getContainerId()
	 * @generated
	 */
	void setContainerId(String value);

} // ECFServerContainerConfig
