/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.rt.core.QServiceExecutor#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.smeup.sys.rt.core.QServiceExecutor#isRemoteExport <em>Remote Export</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getServiceExecutor()
 * @model
 * @generated
 */
public interface QServiceExecutor extends QServiceRef {
	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see #setInterfaceName(String)
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getServiceExecutor_InterfaceName()
	 * @model required="true"
	 * @generated
	 */
	String getInterfaceName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.rt.core.QServiceExecutor#getInterfaceName <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Name</em>' attribute.
	 * @see #getInterfaceName()
	 * @generated
	 */
	void setInterfaceName(String value);

	/**
	 * Returns the value of the '<em><b>Remote Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Export</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Export</em>' attribute.
	 * @see #setRemoteExport(boolean)
	 * @see org.smeup.sys.rt.core.QRuntimeCorePackage#getServiceExecutor_RemoteExport()
	 * @model required="true"
	 * @generated
	 */
	boolean isRemoteExport();

	/**
	 * Sets the value of the '{@link org.smeup.sys.rt.core.QServiceExecutor#isRemoteExport <em>Remote Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Export</em>' attribute.
	 * @see #isRemoteExport()
	 * @generated
	 */
	void setRemoteExport(boolean value);

} // QServiceExecutor
