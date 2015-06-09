/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core;

import java.sql.SQLException;
import org.smeup.sys.il.core.ctx.QContextProvider;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Database Connection</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getConnection()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QConnection extends QContextProvider {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	void close() throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" exceptions="org.smeup.sys.db.core.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	QPreparedStatement prepareStatement(String sql) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" exceptions="org.smeup.sys.db.core.DatabaseException" sqlRequired="true" nativeRequired="true"
	 * @generated
	 */
	QPreparedStatement prepareStatement(String sql, boolean native_) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" exceptions="org.smeup.sys.db.core.DatabaseException" sqlRequired="true" nativeRequired="true" updatableRequired="true"
	 * @generated
	 */
	QPreparedStatement prepareStatement(String sql, boolean native_, boolean updatable) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	void setCatalog(String catalog) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" exceptions="org.smeup.sys.db.core.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	String translate(String sql) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	QStatement createStatement() throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" exceptions="org.smeup.sys.db.core.DatabaseException" nativeRequired="true"
	 * @generated
	 */
	QStatement createStatement(boolean native_) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" exceptions="org.smeup.sys.db.core.DatabaseException" nativeRequired="true" updatableRequired="true"
	 * @generated
	 */
	QStatement createStatement(boolean native_, boolean updatable) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" exceptions="org.smeup.sys.db.core.DatabaseException"
	 * @generated
	 */
	String getCatalog() throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QCatalogGenerationStrategy getCatalogGenerationStrategy();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	QCatalogMetaData getCatalogMetaData();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	QConnectionDescription getConnectionDescription();

} // DatabaseConnection
