/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core;

import java.util.List;

import org.smeup.sys.il.core.meta.QFacet;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Special</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.core.QSpecial#getClassDelegate <em>Class Delegate</em>}</li>
 *   <li>{@link org.smeup.sys.il.core.QSpecial#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getSpecial()
 * @model
 * @generated
 */
public interface QSpecial extends QFacet {
	/**
	 * Returns the value of the '<em><b>Class Delegate</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Delegate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Class Delegate</em>' attribute.
	 * @see #setClassDelegate(String)
	 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getSpecial_ClassDelegate()
	 * @model
	 * @generated
	 */
	String getClassDelegate();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.core.QSpecial#getClassDelegate <em>Class Delegate</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Class Delegate</em>' attribute.
	 * @see #getClassDelegate()
	 * @generated
	 */
	void setClassDelegate(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.core.QSpecialElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getSpecial_Elements()
	 * @model containment="true"
	 * @generated
	 */
	List<QSpecialElement> getElements();

} // QSpecial
