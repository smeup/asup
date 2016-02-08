/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl;

import java.util.List;

import org.smeup.sys.db.core.QQualifiedName;
import org.smeup.sys.db.syntax.QDefinitionStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create View Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QCreateViewStatement#getViewName <em>View Name</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QCreateViewStatement#getFields <em>Fields</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QCreateViewStatement#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getCreateViewStatement()
 * @model
 * @generated
 */
public interface QCreateViewStatement extends QDefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' attribute list.
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getCreateViewStatement_Fields()
	 * @model required="true"
	 * @generated
	 */
	List<String> getFields();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getCreateViewStatement_Query()
	 * @model
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QCreateViewStatement#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>View Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Name</em>' containment reference.
	 * @see #setViewName(QQualifiedName)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getCreateViewStatement_ViewName()
	 * @model containment="true"
	 * @generated
	 */
	QQualifiedName getViewName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QCreateViewStatement#getViewName <em>View Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Name</em>' containment reference.
	 * @see #getViewName()
	 * @generated
	 */
	void setViewName(QQualifiedName value);

} // QCreateViewStatement
