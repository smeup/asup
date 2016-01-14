/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl;

import org.smeup.sys.db.core.QQualifiedName;
import org.smeup.sys.db.syntax.QDefinitionStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Alias Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QCreateAliasStatement#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QCreateAliasStatement#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getCreateAliasStatement()
 * @model
 * @generated
 */
public interface QCreateAliasStatement extends QDefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Alias Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Name</em>' containment reference.
	 * @see #setAliasName(QQualifiedName)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getCreateAliasStatement_AliasName()
	 * @model containment="true"
	 * @generated
	 */
	QQualifiedName getAliasName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QCreateAliasStatement#getAliasName <em>Alias Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias Name</em>' containment reference.
	 * @see #getAliasName()
	 * @generated
	 */
	void setAliasName(QQualifiedName value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' containment reference.
	 * @see #setTableName(QQualifiedName)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getCreateAliasStatement_TableName()
	 * @model containment="true"
	 * @generated
	 */
	QQualifiedName getTableName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QCreateAliasStatement#getTableName <em>Table Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' containment reference.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(QQualifiedName value);

} // QCreateAliasStatement
