/**
 * Copyright (c) 2012, 2014 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.flux.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.smeup.sys.co.flux.QFluxPackage;
import org.smeup.sys.co.flux.QFluxServerConnectionConfig;
import org.smeup.sys.il.core.impl.ObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Connection Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.smeup.sys.co.flux.impl.FluxServerConnectionConfigImpl#getChannelID <em>Channel ID</em>}</li>
 *   <li>{@link org.smeup.sys.co.flux.impl.FluxServerConnectionConfigImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.smeup.sys.co.flux.impl.FluxServerConnectionConfigImpl#isLazyStart <em>Lazy Start</em>}</li>
 *   <li>{@link org.smeup.sys.co.flux.impl.FluxServerConnectionConfigImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.smeup.sys.co.flux.impl.FluxServerConnectionConfigImpl#getUserName <em>User Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FluxServerConnectionConfigImpl extends ObjectImpl implements QFluxServerConnectionConfig {
	/**
	 * The default value of the '{@link #getChannelID() <em>Channel ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelID()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANNEL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannelID() <em>Channel ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelID()
	 * @generated
	 * @ordered
	 */
	protected String channelID = CHANNEL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #isLazyStart() <em>Lazy Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLazyStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAZY_START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLazyStart() <em>Lazy Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLazyStart()
	 * @generated
	 * @ordered
	 */
	protected boolean lazyStart = LAZY_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FluxServerConnectionConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFluxPackage.Literals.FLUX_SERVER_CONNECTION_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChannelID() {
		return channelID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelID(String newChannelID) {
		String oldChannelID = channelID;
		channelID = newChannelID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__CHANNEL_ID, oldChannelID, channelID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLazyStart() {
		return lazyStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLazyStart(boolean newLazyStart) {
		boolean oldLazyStart = lazyStart;
		lazyStart = newLazyStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__LAZY_START, oldLazyStart, lazyStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(String newToken) {
		String oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__CHANNEL_ID:
				return getChannelID();
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__HOST:
				return getHost();
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__LAZY_START:
				return isLazyStart();
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__TOKEN:
				return getToken();
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__USER_NAME:
				return getUserName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__CHANNEL_ID:
				setChannelID((String)newValue);
				return;
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__HOST:
				setHost((String)newValue);
				return;
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__LAZY_START:
				setLazyStart((Boolean)newValue);
				return;
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__TOKEN:
				setToken((String)newValue);
				return;
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__USER_NAME:
				setUserName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__CHANNEL_ID:
				setChannelID(CHANNEL_ID_EDEFAULT);
				return;
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__LAZY_START:
				setLazyStart(LAZY_START_EDEFAULT);
				return;
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__CHANNEL_ID:
				return CHANNEL_ID_EDEFAULT == null ? channelID != null : !CHANNEL_ID_EDEFAULT.equals(channelID);
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__LAZY_START:
				return lazyStart != LAZY_START_EDEFAULT;
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__TOKEN:
				return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
			case QFluxPackage.FLUX_SERVER_CONNECTION_CONFIG__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (channelID: ");
		result.append(channelID);
		result.append(", host: ");
		result.append(host);
		result.append(", lazyStart: ");
		result.append(lazyStart);
		result.append(", token: ");
		result.append(token);
		result.append(", userName: ");
		result.append(userName);
		result.append(')');
		return result.toString();
	}

} //FluxServerConnectionConfigImpl
