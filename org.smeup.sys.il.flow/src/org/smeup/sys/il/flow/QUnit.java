/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow;

import org.smeup.sys.il.core.QNamedNode;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Unit</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.QUnit#getName <em>Name</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QUnit#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getUnit()
 * @model abstract="true"
 * @generated
 */
public interface QUnit extends QNamedNode {
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
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getUnit_Name()
	 * @model
	 * @generated
	 */
	@Override
	String getName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' containment reference.
	 * @see #setMain(QStatement)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getUnit_Main()
	 * @model containment="true"
	 * @generated
	 */
	QStatement getMain();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QUnit#getMain <em>Main</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' containment reference.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(QStatement value);

} // QUnit
