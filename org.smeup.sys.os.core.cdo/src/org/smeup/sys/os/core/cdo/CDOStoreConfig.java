/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.cdo;

import org.smeup.sys.co.core.QServerSocketConfig;
import org.smeup.sys.db.core.QConnectionCredentials;
import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>CDO Store Config</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getAdapter <em>Adapter</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getSocketConfig <em>Socket Config</em>}</li>
 *   <li>{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.core.cdo.CDOSystemCorePackage#getCDOStoreConfig()
 * @model
 * @generated
 */
public interface CDOStoreConfig extends QObject {

	/**
	 * Returns the value of the '<em><b>Adapter</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adapter</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Adapter</em>' attribute.
	 * @see #setAdapter(String)
	 * @see org.smeup.sys.os.core.cdo.CDOSystemCorePackage#getCDOStoreConfig_Adapter()
	 * @model required="true"
	 * @generated
	 */
	String getAdapter();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getAdapter <em>Adapter</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter</em>' attribute.
	 * @see #getAdapter()
	 * @generated
	 */
	void setAdapter(String value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see #setDriver(String)
	 * @see org.smeup.sys.os.core.cdo.CDOSystemCorePackage#getCDOStoreConfig_Driver()
	 * @model required="true"
	 * @generated
	 */
	String getDriver();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(String value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Repository</em>' attribute.
	 * @see #setRepository(String)
	 * @see org.smeup.sys.os.core.cdo.CDOSystemCorePackage#getCDOStoreConfig_Repository()
	 * @model required="true"
	 * @generated
	 */
	String getRepository();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getRepository <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' attribute.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(String value);

	/**
	 * Returns the value of the '<em><b>Socket Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Socket Config</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socket Config</em>' containment reference.
	 * @see #setSocketConfig(QServerSocketConfig)
	 * @see org.smeup.sys.os.core.cdo.CDOSystemCorePackage#getCDOStoreConfig_SocketConfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QServerSocketConfig getSocketConfig();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getSocketConfig <em>Socket Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Socket Config</em>' containment reference.
	 * @see #getSocketConfig()
	 * @generated
	 */
	void setSocketConfig(QServerSocketConfig value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.smeup.sys.os.core.cdo.CDOSystemCorePackage#getCDOStoreConfig_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credentials</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials</em>' containment reference.
	 * @see #setCredentials(QConnectionCredentials)
	 * @see org.smeup.sys.os.core.cdo.CDOSystemCorePackage#getCDOStoreConfig_Credentials()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QConnectionCredentials getCredentials();

	/**
	 * Sets the value of the '{@link org.smeup.sys.os.core.cdo.CDOStoreConfig#getCredentials <em>Credentials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentials</em>' containment reference.
	 * @see #getCredentials()
	 * @generated
	 */
	void setCredentials(QConnectionCredentials value);
} // QCDOStoreConfig
