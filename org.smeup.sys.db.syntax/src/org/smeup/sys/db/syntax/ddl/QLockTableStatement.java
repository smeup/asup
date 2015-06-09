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
 * A representation of the model object '<em><b>Lock Table Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QLockTableStatement#isAllowRead <em>Allow Read</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QLockTableStatement#getShareMode <em>Share Mode</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QLockTableStatement#getTableName <em>Table Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getLockTableStatement()
 * @model
 * @generated
 */
public interface QLockTableStatement extends QDefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Allow Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Read</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Read</em>' attribute.
	 * @see #setAllowRead(boolean)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getLockTableStatement_AllowRead()
	 * @model
	 * @generated
	 */
	boolean isAllowRead();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QLockTableStatement#isAllowRead <em>Allow Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Read</em>' attribute.
	 * @see #isAllowRead()
	 * @generated
	 */
	void setAllowRead(boolean value);

	/**
	 * Returns the value of the '<em><b>Share Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.db.syntax.ddl.ShareMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Share Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share Mode</em>' attribute.
	 * @see org.smeup.sys.db.syntax.ddl.ShareMode
	 * @see #setShareMode(ShareMode)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getLockTableStatement_ShareMode()
	 * @model
	 * @generated
	 */
	ShareMode getShareMode();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QLockTableStatement#getShareMode <em>Share Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share Mode</em>' attribute.
	 * @see org.smeup.sys.db.syntax.ddl.ShareMode
	 * @see #getShareMode()
	 * @generated
	 */
	void setShareMode(ShareMode value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' containment reference.
	 * @see #setTableName(QQualifiedName)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getLockTableStatement_TableName()
	 * @model containment="true"
	 * @generated
	 */
	QQualifiedName getTableName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QLockTableStatement#getTableName <em>Table Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' containment reference.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(QQualifiedName value);

} // QLockTableStatement
