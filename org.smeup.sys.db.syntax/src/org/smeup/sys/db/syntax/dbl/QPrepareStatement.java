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
 * A representation of the model object '<em><b>Prepare Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QPrepareStatement#getFrom <em>From</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QPrepareStatement#getInto <em>Into</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QPrepareStatement#getStatementName <em>Statement Name</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getPrepareStatement()
 * @model
 * @generated
 */
public interface QPrepareStatement extends QBindingStatement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getPrepareStatement_From()
	 * @model required="true"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QPrepareStatement#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>Into</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Into</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Into</em>' containment reference.
	 * @see #setInto(QIntoClause)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getPrepareStatement_Into()
	 * @model containment="true"
	 * @generated
	 */
	QIntoClause getInto();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QPrepareStatement#getInto <em>Into</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Into</em>' containment reference.
	 * @see #getInto()
	 * @generated
	 */
	void setInto(QIntoClause value);

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
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getPrepareStatement_StatementName()
	 * @model
	 * @generated
	 */
	String getStatementName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QPrepareStatement#getStatementName <em>Statement Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Name</em>' attribute.
	 * @see #getStatementName()
	 * @generated
	 */
	void setStatementName(String value);

} // QPrepareStatement
