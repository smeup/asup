/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Parser Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.QDefinitionParseResult#getDefinitionStatement <em>Definition Statement</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.QDefinitionParseResult#getErrorList <em>Error List</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxPackage#getDefinitionParseResult()
 * @model
 * @generated
 */
public interface QDefinitionParseResult {
	/**
	 * Returns the value of the '<em><b>Definition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Statement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Statement</em>' reference.
	 * @see #setDefinitionStatement(QDefinitionStatement)
	 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxPackage#getDefinitionParseResult_DefinitionStatement()
	 * @model
	 * @generated
	 */
	QDefinitionStatement getDefinitionStatement();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.QDefinitionParseResult#getDefinitionStatement <em>Definition Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Statement</em>' reference.
	 * @see #getDefinitionStatement()
	 * @generated
	 */
	void setDefinitionStatement(QDefinitionStatement value);

	/**
	 * Returns the value of the '<em><b>Error List</b></em>' reference list.
	 * The list contents are of type {@link org.smeup.sys.db.syntax.QDefinitionParseError}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error List</em>' reference list.
	 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxPackage#getDefinitionParseResult_ErrorList()
	 * @model
	 * @generated
	 */
	List<QDefinitionParseError> getErrorList();

} // QDefinitionParserResult
