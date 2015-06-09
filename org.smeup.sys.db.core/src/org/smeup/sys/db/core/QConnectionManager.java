/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core;

import java.sql.SQLException;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Connection Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getConnectionManager()
 * @model abstract="true"
 * @generated
 */
public interface QConnectionManager {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	QConnection createConnection() throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	QConnection createConnection(String catalog) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	QConnection createConnection(String user, String password) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	QConnection createConnection(String catalog, String user, String password) throws SQLException;

} // QConnectionManager
