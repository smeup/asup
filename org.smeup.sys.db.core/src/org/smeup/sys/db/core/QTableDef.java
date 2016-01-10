/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Table Def</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.core.QTableDef#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getTableDef()
 * @model
 * @generated
 */
public interface QTableDef extends QDatabaseObjectDef {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.db.core.QTableColumnDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getTableDef_Columns()
	 * @model containment="true"
	 * @generated
	 */
	List<QTableColumnDef> getColumns();

} // QTableDef
