/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core;

import java.io.Closeable;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getStatement()
 * @model interface="true" abstract="true" superTypes="org.smeup.sys.mi.core.JavaCloseable"
 * @generated
 */
public interface QStatement extends Closeable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.smeup.sys.db.core.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	boolean execute(String sql) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.smeup.sys.db.core.DatabaseResultSet" required="true" exceptions="org.smeup.sys.db.core.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	ResultSet executeQuery(String sql) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.smeup.sys.db.core.DatabaseException" sqlRequired="true" generatedKeysRequired="true"
	 * @generated
	 */
	int executeUpdate(String sql, boolean generatedKeys) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	void addBatch(String sql) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	void clearBatch() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.smeup.sys.db.core.StatementBatchResult" required="true" exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	int[] executeBatch() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.smeup.sys.db.core.DatabaseResultSet" required="true" exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	ResultSet getGeneratedKeys() throws SQLException;

} // QStatement
