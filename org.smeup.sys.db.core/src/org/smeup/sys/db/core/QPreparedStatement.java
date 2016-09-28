/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Prepared Statement</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getPreparedStatement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QPreparedStatement extends QStatement {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	void addBatch() throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	void clearParameters() throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	boolean execute() throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataType="org.smeup.sys.db.core.DatabaseResultSet" required="true" exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	ResultSet executeQuery() throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	int executeUpdate() throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" positionRequired="true" valueRequired="true"
	 * @generated
	 */
	void setDate(int position, Date value) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" positionRequired="true" valueRequired="true"
	 * @generated
	 */
	void setInt(int position, int value) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" positionRequired="true" valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	void setNumber(int position, Number value) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" positionRequired="true" valueRequired="true"
	 * @generated
	 */
	void setString(int position, String value) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" positionRequired="true" valueRequired="true"
	 * @generated
	 */
	void setObject(int position, Object value) throws SQLException;

} // QPreparedStatement
