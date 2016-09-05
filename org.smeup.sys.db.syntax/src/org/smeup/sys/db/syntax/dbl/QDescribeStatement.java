/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl;

import org.smeup.sys.db.syntax.QBindingStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Describe Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QDescribeStatement#getInto <em>Into</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QDescribeStatement#getUsing <em>Using</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QDescribeStatement#getStatementName <em>Statement Name</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getDescribeStatement()
 * @model
 * @generated
 */
public interface QDescribeStatement extends QBindingStatement {
	/**
	 * Returns the value of the '<em><b>Into</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Into</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Into</em>' containment reference.
	 * @see #setInto(QInto)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getDescribeStatement_Into()
	 * @model containment="true"
	 * @generated
	 */
	QInto getInto();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QDescribeStatement#getInto <em>Into</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Into</em>' containment reference.
	 * @see #getInto()
	 * @generated
	 */
	void setInto(QInto value);

	/**
	 * Returns the value of the '<em><b>Using</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using</em>' containment reference.
	 * @see #setUsing(QUsing)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getDescribeStatement_Using()
	 * @model containment="true"
	 * @generated
	 */
	QUsing getUsing();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QDescribeStatement#getUsing <em>Using</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using</em>' containment reference.
	 * @see #getUsing()
	 * @generated
	 */
	void setUsing(QUsing value);

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
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getDescribeStatement_StatementName()
	 * @model
	 * @generated
	 */
	String getStatementName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QDescribeStatement#getStatementName <em>Statement Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Name</em>' attribute.
	 * @see #getStatementName()
	 * @generated
	 */
	void setStatementName(String value);

} // QDescribeStatement
