/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam;

import java.util.List;

import org.smeup.sys.il.core.term.QTerm;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Key List Term</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.smeup.sys.il.esam.QKeyListTerm#getName <em>Name</em>}</li>
 * <li>{@link org.smeup.sys.il.esam.QKeyListTerm#getKeyFields <em>Key Fields
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getKeyListTerm()
 * @model
 * @generated
 */
public interface QKeyListTerm extends QTerm {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getKeyListTerm_Name()
	 * @model required="true"
	 * @generated
	 */
	@Override
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.esam.QKeyListTerm#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Key Fields</b></em>' attribute list. The
	 * list contents are of type {@link java.lang.String}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Key Fields</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Key Fields</em>' attribute list.
	 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage#getKeyListTerm_KeyFields()
	 * @model required="true"
	 * @generated
	 */
	List<String> getKeyFields();

} // QKeyListTerm
