/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core;

import org.smeup.sys.il.data.def.QDataDef;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Table Column Def</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.db.core.QTableColumnDef#isDefault <em>Default</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.QTableColumnDef#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.QTableColumnDef#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.QTableColumnDef#isNullable <em>Nullable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getTableColumnDef()
 * @model
 * @generated
 */
public interface QTableColumnDef extends QDatabaseObjectDef {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getTableColumnDef_Default()
	 * @model
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.core.QTableColumnDef#isDefault
	 * <em>Default</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(QDataDef)
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getTableColumnDef_Definition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QDataDef<?> getDefinition();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.core.QTableColumnDef#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(QDataDef<?> value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getTableColumnDef_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.core.QTableColumnDef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getTableColumnDef_Nullable()
	 * @model
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.core.QTableColumnDef#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

} // QTableColumnDef
