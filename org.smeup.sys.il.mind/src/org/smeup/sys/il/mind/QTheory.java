/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.mind;

import java.util.List;
import org.smeup.sys.il.core.QObjectNameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.mind.QTheory#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.il.mind.QTheory#getFacts <em>Facts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.mind.QIntegratedLanguageMindPackage#getTheory()
 * @model
 * @generated
 */
public interface QTheory extends QObjectNameable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.smeup.sys.il.mind.QIntegratedLanguageMindPackage#getTheory_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.mind.QTheory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Facts</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.mind.QMindTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facts</em>' containment reference list.
	 * @see org.smeup.sys.il.mind.QIntegratedLanguageMindPackage#getTheory_Facts()
	 * @model containment="true"
	 * @generated
	 */
	List<QMindTerm> getFacts();

} // QTheory
