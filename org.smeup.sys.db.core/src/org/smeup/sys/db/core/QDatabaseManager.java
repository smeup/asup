/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core;

import java.sql.SQLException;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Database Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getDatabaseManager()
 * @model abstract="true"
 * @generated
 */
public interface QDatabaseManager {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static final String TABLE_COLUMN_RELATIVE_RECORD_NUMBER_NAME = "QASRRN";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static final int TABLE_COLUMN_RELATIVE_RECORD_NUMBER_LENGTH = 10;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" tableRequired="true" nameRequired="true" indexRequired="true"
	 * @generated
	 */
	Index createIndex(QConnection connection, Table table, String name, QIndexDef index) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" nameRequired="true"
	 * @generated
	 */
	Schema createSchema(QConnection connection, String name, QSchemaDef schema) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" schemaRequired="true" nameRequired="true" tableRequired="true"
	 * @generated
	 */
	Table createTable(QConnection connection, Schema schema, String name, QTableDef table) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" schemaRequired="true" nameRequired="true"
	 * @generated
	 */
	ViewTable createView(QConnection connection, Schema schema, String name, QViewDef view) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" indexRequired="true"
	 * @generated
	 */
	void dropIndex(QConnection connection, Index index) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" schemaRequired="true" ignoreFailOnNonEmptyRequired="true"
	 * @generated
	 */
	void dropSchema(QConnection connection, Schema schema, boolean ignoreFailOnNonEmpty) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" tableRequired="true"
	 * @generated
	 */
	void dropTable(QConnection connection, Table table) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.smeup.sys.db.core.DatabaseException" viewRequired="true"
	 * @generated
	 */
	void dropView(QConnection connection, ViewTable view) throws SQLException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isStarted();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model databaseContainerRequired="true"
	 * @generated
	 */
	void start(QDatabaseContainer databaseContainer);

} // DatabaseManager
