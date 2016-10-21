/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax;

import java.util.List;
import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.smeup.sys.db.core.QIndexDef;
import org.smeup.sys.db.core.QSchemaDef;
import org.smeup.sys.db.core.QTableDef;
import org.smeup.sys.db.core.QViewDef;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syntax Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxPackage#getDefinitionWriter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QDefinitionWriter extends QStatementWriter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true" schemaRequired="true"
	 * @generated
	 */
	String createLabel(String name, QSchemaDef schema);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" nameRequired="true" tableRequired="true"
	 * @generated
	 */
	String createLabel(Schema schema, String name, QTableDef table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" nameRequired="true" tableRequired="true"
	 * @generated
	 */
	String createLabelForFields(Schema schema, String name, QTableDef table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true" schemaRequired="true"
	 * @generated
	 */
	String createSchema(String name, QSchemaDef schema);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" nameRequired="true" tableRequired="true"
	 * @generated
	 */
	String createTable(Schema schema, String name, QTableDef table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" nameRequired="true" viewRequired="true"
	 * @generated
	 */
	String createView(Schema schema, String name, QViewDef view);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true" nameRequired="true" indexRequired="true"
	 * @generated
	 */
	String createIndex(Table table, String name, QIndexDef index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" ignoreFailOnNonEmptyRequired="true"
	 * @generated
	 */
	String dropSchema(Schema schema, boolean ignoreFailOnNonEmpty);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String dropTable(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" viewRequired="true"
	 * @generated
	 */
	String dropView(ViewTable view);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" indexRequired="true"
	 * @generated
	 */
	String dropIndex(Index index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String deleteData(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String selectData(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String truncateTable(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String hasLogicals(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableFromRequired="true" tableToRequired="true" isCreateRelativeRecordNumberRequired="true"
	 * @generated
	 */
	String copyTableData(Table tableFrom, Table tableTo, boolean isCreateRelativeRecordNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String countRecords(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true" newNameRequired="true"
	 * @generated
	 */
	String renameTable(Table table, String newName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String resetIdentity(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" indexRequired="true" newNameRequired="true"
	 * @generated
	 */
	String renameIndex(Index index, String newName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true"
	 * @generated
	 */
	String insertData(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true" fieldNamesMany="true"
	 * @generated
	 */
	String insertData(Table table, List<String> fieldNames);

} // SyntaxBuilder
