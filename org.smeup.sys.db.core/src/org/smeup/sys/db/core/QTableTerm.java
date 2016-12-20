/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core;

import org.smeup.sys.il.core.QObjectNameable;

import org.smeup.sys.il.core.term.QTerm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.core.QTableTerm#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.core.QTableTerm#getTableDef <em>Table Def</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getTableTerm()
 * @model
 * @generated
 */
public interface QTableTerm extends QTerm, QObjectNameable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getTableTerm_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.core.QTableTerm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Table Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Def</em>' containment reference.
	 * @see #setTableDef(QTableDef)
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getTableTerm_TableDef()
	 * @model containment="true"
	 * @generated
	 */
	QTableDef getTableDef();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.core.QTableTerm#getTableDef <em>Table Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Def</em>' containment reference.
	 * @see #getTableDef()
	 * @generated
	 */
	void setTableDef(QTableDef value);

} // QTableTerm
