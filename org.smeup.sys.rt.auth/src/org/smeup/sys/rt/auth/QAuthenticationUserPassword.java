/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.auth;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication User Password</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.rt.auth.QAuthenticationUserPassword#getUser <em>User</em>}</li>
 *   <li>{@link org.smeup.sys.rt.auth.QAuthenticationUserPassword#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.rt.auth.QRuntimeAuthenticationPackage#getAuthenticationUserPassword()
 * @model abstract="true"
 * @generated
 */
public interface QAuthenticationUserPassword extends QAuthentication {
	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.smeup.sys.rt.auth.QRuntimeAuthenticationPackage#getAuthenticationUserPassword_User()
	 * @model required="true"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.smeup.sys.rt.auth.QAuthenticationUserPassword#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.smeup.sys.rt.auth.QRuntimeAuthenticationPackage#getAuthenticationUserPassword_Password()
	 * @model required="true"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.smeup.sys.rt.auth.QAuthenticationUserPassword#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // QAuthenticationUserPassword
