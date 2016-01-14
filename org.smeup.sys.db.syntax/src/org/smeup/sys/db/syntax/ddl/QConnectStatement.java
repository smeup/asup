/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl;

import org.smeup.sys.db.syntax.QDefinitionStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connect Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QConnectStatement#getPwd <em>Pwd</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QConnectStatement#isReset <em>Reset</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QConnectStatement#getTo <em>To</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.ddl.QConnectStatement#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getConnectStatement()
 * @model
 * @generated
 */
public interface QConnectStatement extends QDefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwd</em>' attribute.
	 * @see #setPwd(String)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getConnectStatement_Pwd()
	 * @model
	 * @generated
	 */
	String getPwd();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QConnectStatement#getPwd <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwd</em>' attribute.
	 * @see #getPwd()
	 * @generated
	 */
	void setPwd(String value);

	/**
	 * Returns the value of the '<em><b>Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset</em>' attribute.
	 * @see #setReset(boolean)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getConnectStatement_Reset()
	 * @model
	 * @generated
	 */
	boolean isReset();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QConnectStatement#isReset <em>Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset</em>' attribute.
	 * @see #isReset()
	 * @generated
	 */
	void setReset(boolean value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getConnectStatement_To()
	 * @model
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QConnectStatement#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage#getConnectStatement_User()
	 * @model
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.ddl.QConnectStatement#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

} // QConnectStatement
