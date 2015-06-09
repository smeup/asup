/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Connection Config</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.db.core.QConnectionConfig#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.QConnectionConfig#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.QConnectionConfig#getVersion <em>Version</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.QConnectionConfig#getUrl <em>Url</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.QConnectionConfig#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.QConnectionConfig#isPersistent <em>Persistent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getConnectionConfig()
 * @model
 * @generated
 */
public interface QConnectionConfig {
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
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getConnectionConfig_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.core.QConnectionConfig#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Catalog</em>' attribute.
	 * @see #setCatalog(String)
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getConnectionConfig_Catalog()
	 * @model
	 * @generated
	 */
	String getCatalog();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.core.QConnectionConfig#getCatalog <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' attribute.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(String value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(boolean)
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getConnectionConfig_Persistent()
	 * @model
	 * @generated
	 */
	boolean isPersistent();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.core.QConnectionConfig#isPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #isPersistent()
	 * @generated
	 */
	void setPersistent(boolean value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getConnectionConfig_Vendor()
	 * @model required="true"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.core.QConnectionConfig#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getConnectionConfig_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.core.QConnectionConfig#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

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
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getConnectionConfig_Credentials()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QConnectionCredentials getCredentials();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.core.QConnectionConfig#getCredentials <em>Credentials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentials</em>' containment reference.
	 * @see #getCredentials()
	 * @generated
	 */
	void setCredentials(QConnectionCredentials value);

} // QConnectionConfig
