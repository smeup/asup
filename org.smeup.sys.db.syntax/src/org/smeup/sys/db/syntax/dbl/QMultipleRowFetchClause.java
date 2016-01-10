/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Row Fetch Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause#getRowsNumber <em>Rows Number</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause#isUsingDescriptor <em>Using Descriptor</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getMultipleRowFetchClause()
 * @model
 * @generated
 */
public interface QMultipleRowFetchClause {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' attribute.
	 * @see #setDescriptor(String)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getMultipleRowFetchClause_Descriptor()
	 * @model
	 * @generated
	 */
	String getDescriptor();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause#getDescriptor <em>Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' attribute.
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(String value);

	/**
	 * Returns the value of the '<em><b>Rows Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows Number</em>' attribute.
	 * @see #setRowsNumber(String)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getMultipleRowFetchClause_RowsNumber()
	 * @model required="true"
	 * @generated
	 */
	String getRowsNumber();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause#getRowsNumber <em>Rows Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows Number</em>' attribute.
	 * @see #getRowsNumber()
	 * @generated
	 */
	void setRowsNumber(String value);

	/**
	 * Returns the value of the '<em><b>Using Descriptor</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using Descriptor</em>' attribute.
	 * @see #setUsingDescriptor(boolean)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getMultipleRowFetchClause_UsingDescriptor()
	 * @model default="false"
	 * @generated
	 */
	boolean isUsingDescriptor();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QMultipleRowFetchClause#isUsingDescriptor <em>Using Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using Descriptor</em>' attribute.
	 * @see #isUsingDescriptor()
	 * @generated
	 */
	void setUsingDescriptor(boolean value);

} // QMultipleRowFetchClause
