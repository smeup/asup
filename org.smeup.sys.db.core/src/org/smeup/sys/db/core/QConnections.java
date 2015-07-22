/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core;

import java.sql.ResultSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connections</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getConnections()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QConnections {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close(QStatement stmt);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rsDataType="org.smeup.sys.db.core.DatabaseResultSet"
	 * @generated
	 */
	void close(ResultSet rs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rsDataType="org.smeup.sys.db.core.DatabaseResultSet"
	 * @generated
	 */
	String getString(ResultSet rs, String fieldName);

} // QConnections
