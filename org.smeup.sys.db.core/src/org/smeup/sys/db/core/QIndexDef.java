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
 * <em><b>Index</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.core.QIndexDef#isClustered <em>Clustered</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.QIndexDef#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.QIndexDef#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getIndexDef()
 * @model
 * @generated
 */
public interface QIndexDef extends QDatabaseObjectDef {
	/**
	 * Returns the value of the '<em><b>Clustered</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clustered</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Clustered</em>' attribute.
	 * @see #setClustered(boolean)
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getIndexDef_Clustered()
	 * @model
	 * @generated
	 */
	boolean isClustered();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.core.QIndexDef#isClustered
	 * <em>Clustered</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Clustered</em>' attribute.
	 * @see #isClustered()
	 * @generated
	 */
	void setClustered(boolean value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.db.core.QIndexColumnDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getIndexDef_Columns()
	 * @model containment="true"
	 * @generated
	 */
	List<QIndexColumnDef> getColumns();

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getIndex_Unique()
	 * @model
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.core.QIndexDef#isUnique
	 * <em>Unique</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

} // Index
