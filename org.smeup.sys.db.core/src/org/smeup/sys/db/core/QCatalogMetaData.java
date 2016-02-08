/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core;

import java.util.List;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.eclipse.datatools.modelbase.sql.schema.Schema;
import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;
import org.smeup.sys.il.core.ctx.QContextDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Catalog Meta Data</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getCatalogMetaData()
 * @model abstract="true"
 * @generated
 */
public interface QCatalogMetaData {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model schemaRequired="true" tableRequired="true" indexRequired="true"
	 * @generated
	 */
	Index getIndex(String schema, String table, String index);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true"
	 * @generated
	 */
	Schema getSchema(String schema);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	List<Schema> getSchemas();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model schemaRequired="true" tableRequired="true"
	 * @generated
	 */
	Table getTable(String schema, String table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextDescriptionRequired="true" tableRequired="true"
	 * @generated
	 */
	Table getTable(QContextDescription contextDescription, String table);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model schemaRequired="true" tableRequired="true"
	 * @generated
	 */
	ViewTable getView(String schema, String table);

} // QCatalogMetaData
