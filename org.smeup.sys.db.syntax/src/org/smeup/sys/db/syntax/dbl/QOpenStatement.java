/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl;

import java.util.List;
import org.smeup.sys.db.syntax.QBindingStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QOpenStatement#getCursor <em>Cursor</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QOpenStatement#getUsing <em>Using</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QOpenStatement#getUsingType <em>Using Type</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getOpenStatement()
 * @model
 * @generated
 */
public interface QOpenStatement extends QBindingStatement {
	/**
	 * Returns the value of the '<em><b>Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor</em>' attribute.
	 * @see #setCursor(String)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getOpenStatement_Cursor()
	 * @model
	 * @generated
	 */
	String getCursor();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QOpenStatement#getCursor <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor</em>' attribute.
	 * @see #getCursor()
	 * @generated
	 */
	void setCursor(String value);

	/**
	 * Returns the value of the '<em><b>Using</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using</em>' attribute list.
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getOpenStatement_Using()
	 * @model
	 * @generated
	 */
	List<String> getUsing();

	/**
	 * Returns the value of the '<em><b>Using Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.smeup.sys.db.syntax.dbl.OpenUsingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using Type</em>' attribute.
	 * @see org.smeup.sys.db.syntax.dbl.OpenUsingType
	 * @see #setUsingType(OpenUsingType)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getOpenStatement_UsingType()
	 * @model
	 * @generated
	 */
	OpenUsingType getUsingType();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QOpenStatement#getUsingType <em>Using Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using Type</em>' attribute.
	 * @see org.smeup.sys.db.syntax.dbl.OpenUsingType
	 * @see #getUsingType()
	 * @generated
	 */
	void setUsingType(OpenUsingType value);

} // QOpenStatement
