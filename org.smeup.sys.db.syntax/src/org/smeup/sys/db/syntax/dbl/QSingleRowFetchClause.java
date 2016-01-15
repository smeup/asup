/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Row Fetch Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QSingleRowFetchClause#getInto <em>Into</em>}</li>
 *   <li>{@link org.smeup.sys.db.syntax.dbl.QSingleRowFetchClause#isUsingDescriptor <em>Using Descriptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getSingleRowFetchClause()
 * @model
 * @generated
 */
public interface QSingleRowFetchClause {
	/**
	 * Returns the value of the '<em><b>Into</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Into</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Into</em>' attribute list.
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getSingleRowFetchClause_Into()
	 * @model required="true"
	 * @generated
	 */
	List<String> getInto();

	/**
	 * Returns the value of the '<em><b>Using Descriptor</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using Descriptor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using Descriptor</em>' attribute.
	 * @see #setUsingDescriptor(boolean)
	 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage#getSingleRowFetchClause_UsingDescriptor()
	 * @model default="false"
	 * @generated
	 */
	boolean isUsingDescriptor();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.syntax.dbl.QSingleRowFetchClause#isUsingDescriptor <em>Using Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using Descriptor</em>' attribute.
	 * @see #isUsingDescriptor()
	 * @generated
	 */
	void setUsingDescriptor(boolean value);

} // QSingleRowFetchClause
