/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.flux;

import org.smeup.sys.il.core.QObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Connection Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.co.flux.FluxServerConnectionConfig#getChannelID <em>Channel ID</em>}</li>
 *   <li>{@link org.smeup.sys.co.flux.FluxServerConnectionConfig#getHost <em>Host</em>}</li>
 *   <li>{@link org.smeup.sys.co.flux.FluxServerConnectionConfig#isLazyStart <em>Lazy Start</em>}</li>
 *   <li>{@link org.smeup.sys.co.flux.FluxServerConnectionConfig#getToken <em>Token</em>}</li>
 *   <li>{@link org.smeup.sys.co.flux.FluxServerConnectionConfig#getUserName <em>User Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.co.flux.FluxPackage#getFluxServerConnectionConfig()
 * @model
 * @generated
 */
public interface FluxServerConnectionConfig extends QObject {
	/**
	 * Returns the value of the '<em><b>Channel ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel ID</em>' attribute.
	 * @see #setChannelID(String)
	 * @see org.smeup.sys.co.flux.FluxPackage#getFluxServerConnectionConfig_ChannelID()
	 * @model
	 * @generated
	 */
	String getChannelID();

	/**
	 * Sets the value of the '{@link org.smeup.sys.co.flux.FluxServerConnectionConfig#getChannelID <em>Channel ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel ID</em>' attribute.
	 * @see #getChannelID()
	 * @generated
	 */
	void setChannelID(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see org.smeup.sys.co.flux.FluxPackage#getFluxServerConnectionConfig_Host()
	 * @model required="true"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link org.smeup.sys.co.flux.FluxServerConnectionConfig#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Lazy Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lazy Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lazy Start</em>' attribute.
	 * @see #setLazyStart(boolean)
	 * @see org.smeup.sys.co.flux.FluxPackage#getFluxServerConnectionConfig_LazyStart()
	 * @model
	 * @generated
	 */
	boolean isLazyStart();

	/**
	 * Sets the value of the '{@link org.smeup.sys.co.flux.FluxServerConnectionConfig#isLazyStart <em>Lazy Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lazy Start</em>' attribute.
	 * @see #isLazyStart()
	 * @generated
	 */
	void setLazyStart(boolean value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see org.smeup.sys.co.flux.FluxPackage#getFluxServerConnectionConfig_UserName()
	 * @model required="true"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.co.flux.FluxServerConnectionConfig#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see org.smeup.sys.co.flux.FluxPackage#getFluxServerConnectionConfig_Token()
	 * @model
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link org.smeup.sys.co.flux.FluxServerConnectionConfig#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

} // FluxServerConnectionConfig
