/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>View</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.db.core.QViewDef#getQuerySelect <em>Query Select</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getViewDef()
 * @model
 * @generated
 */
public interface QViewDef extends QTableDef {
	/**
	 * Returns the value of the '<em><b>Query Select</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Select</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Query Select</em>' attribute.
	 * @see #setQuerySelect(String)
	 * @see org.smeup.sys.db.core.QDatabaseCorePackage#getViewDef_QuerySelect()
	 * @model
	 * @generated
	 */
	String getQuerySelect();

	/**
	 * Sets the value of the '{@link org.smeup.sys.db.core.QViewDef#getQuerySelect <em>Query Select</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Query Select</em>' attribute.
	 * @see #getQuerySelect()
	 * @generated
	 */
	void setQuerySelect(String value);

} // View
