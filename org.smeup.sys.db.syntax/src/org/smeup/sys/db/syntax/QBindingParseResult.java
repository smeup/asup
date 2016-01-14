/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Parse Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.QBindingParseResult#getBindingStatement <em>Binding Statement</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.QBindingParseResult#getErrorList <em>Error List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxPackage#getBindingParseResult()
 * @model
 * @generated
 */
public interface QBindingParseResult {
	/**
	 * Returns the value of the '<em><b>Binding Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Statement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Statement</em>' reference.
	 * @see #setBindingStatement(QBindingStatement)
	 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxPackage#getBindingParseResult_BindingStatement()
	 * @model
	 * @generated
	 */
	QBindingStatement getBindingStatement();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.QBindingParseResult#getBindingStatement <em>Binding Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Statement</em>' reference.
	 * @see #getBindingStatement()
	 * @generated
	 */
	void setBindingStatement(QBindingStatement value);

	/**
	 * Returns the value of the '<em><b>Error List</b></em>' reference list.
	 * The list contents are of type {@link org.smeup.sys.db.syntax.QBindingParseError}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error List</em>' reference list.
	 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxPackage#getBindingParseResult_ErrorList()
	 * @model
	 * @generated
	 */
	List<QBindingParseError> getErrorList();

} // QBindingParseResult
