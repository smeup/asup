/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.esql;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cursor Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.esql.QCursorTerm#getCursorType <em>Cursor Type</em>}</li>
 *   <li>{@link org.smeup.sys.db.esql.QCursorTerm#isHold <em>Hold</em>}</li>
 *   <li>{@link org.smeup.sys.db.esql.QCursorTerm#getSql <em>Sql</em>}</li>
 *   <li>{@link org.smeup.sys.db.esql.QCursorTerm#getStatementName <em>Statement Name</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.esql.QIntegratedLanguageEmbeddedSQLPackage#getCursorTerm()
 * @model
 * @generated
 */
public interface QCursorTerm extends QESqlTerm {
	/**
	 * Returns the value of the '<em><b>Cursor Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.db.esql.CursorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor Type</em>' attribute.
	 * @see org.smeup.sys.db.esql.CursorType
	 * @see #setCursorType(CursorType)
	 * @see org.smeup.sys.db.esql.QIntegratedLanguageEmbeddedSQLPackage#getCursorTerm_CursorType()
	 * @model
	 * @generated
	 */
	CursorType getCursorType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.esql.QCursorTerm#getCursorType <em>Cursor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor Type</em>' attribute.
	 * @see org.smeup.sys.db.esql.CursorType
	 * @see #getCursorType()
	 * @generated
	 */
	void setCursorType(CursorType value);

	/**
	 * Returns the value of the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hold</em>' attribute.
	 * @see #setHold(boolean)
	 * @see org.smeup.sys.db.esql.QIntegratedLanguageEmbeddedSQLPackage#getCursorTerm_Hold()
	 * @model required="true"
	 * @generated
	 */
	boolean isHold();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.esql.QCursorTerm#isHold <em>Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold</em>' attribute.
	 * @see #isHold()
	 * @generated
	 */
	void setHold(boolean value);

	/**
	 * Returns the value of the '<em><b>Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql</em>' attribute.
	 * @see #setSql(String)
	 * @see org.smeup.sys.db.esql.QIntegratedLanguageEmbeddedSQLPackage#getCursorTerm_Sql()
	 * @model
	 * @generated
	 */
	String getSql();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.esql.QCursorTerm#getSql <em>Sql</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql</em>' attribute.
	 * @see #getSql()
	 * @generated
	 */
	void setSql(String value);

	/**
	 * Returns the value of the '<em><b>Statement Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Name</em>' attribute.
	 * @see #setStatementName(String)
	 * @see org.smeup.sys.db.esql.QIntegratedLanguageEmbeddedSQLPackage#getCursorTerm_StatementName()
	 * @model
	 * @generated
	 */
	String getStatementName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.esql.QCursorTerm#getStatementName <em>Statement Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Name</em>' attribute.
	 * @see #getStatementName()
	 * @generated
	 */
	void setStatementName(String value);

} // QCursorTerm
