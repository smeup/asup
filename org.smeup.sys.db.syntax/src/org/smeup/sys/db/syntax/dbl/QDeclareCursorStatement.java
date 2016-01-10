/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl;

import org.smeup.sys.db.syntax.QBindingStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declare Cursor Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getCursorName <em>Cursor Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getCursorType <em>Cursor Type</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getForQuery <em>For Query</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getForStatementName <em>For Statement Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#isHold <em>Hold</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getDeclareCursorStatement()
 * @model
 * @generated
 */
public interface QDeclareCursorStatement extends QBindingStatement {

	/**
	 * Returns the value of the '<em><b>Cursor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor Name</em>' attribute.
	 * @see #setCursorName(String)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getDeclareCursorStatement_CursorName()
	 * @model required="true"
	 * @generated
	 */
	String getCursorName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getCursorName <em>Cursor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor Name</em>' attribute.
	 * @see #getCursorName()
	 * @generated
	 */
	void setCursorName(String value);

	/**
	 * Returns the value of the '<em><b>Cursor Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.db.syntax.dbl.CursorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor Type</em>' attribute.
	 * @see org.smeup.sys.db.syntax.dbl.CursorType
	 * @see #setCursorType(CursorType)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getDeclareCursorStatement_CursorType()
	 * @model
	 * @generated
	 */
	CursorType getCursorType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getCursorType <em>Cursor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor Type</em>' attribute.
	 * @see org.smeup.sys.db.syntax.dbl.CursorType
	 * @see #getCursorType()
	 * @generated
	 */
	void setCursorType(CursorType value);

	/**
	 * Returns the value of the '<em><b>For Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Query</em>' attribute.
	 * @see #setForQuery(String)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getDeclareCursorStatement_ForQuery()
	 * @model
	 * @generated
	 */
	String getForQuery();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getForQuery <em>For Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Query</em>' attribute.
	 * @see #getForQuery()
	 * @generated
	 */
	void setForQuery(String value);

	/**
	 * Returns the value of the '<em><b>For Statement Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Statement Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Statement Name</em>' attribute.
	 * @see #setForStatementName(String)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getDeclareCursorStatement_ForStatementName()
	 * @model
	 * @generated
	 */
	String getForStatementName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#getForStatementName <em>For Statement Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Statement Name</em>' attribute.
	 * @see #getForStatementName()
	 * @generated
	 */
	void setForStatementName(String value);

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
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getDeclareCursorStatement_Hold()
	 * @model
	 * @generated
	 */
	boolean isHold();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QDeclareCursorStatement#isHold <em>Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold</em>' attribute.
	 * @see #isHold()
	 * @generated
	 */
	void setHold(boolean value);

} // QDeclareCursorStatement
