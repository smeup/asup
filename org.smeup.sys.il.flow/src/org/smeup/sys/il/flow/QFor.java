/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>For</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.QFor#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QFor#getInitialization <em>Initialization</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getFor()
 * @model
 * @generated
 */
public interface QFor extends QIteration {
	/**
	 * Returns the value of the '<em><b>Increment</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Increment</em>' attribute.
	 * @see #setIncrement(String)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getFor_Increment()
	 * @model required="true"
	 * @generated
	 */
	String getIncrement();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QFor#getIncrement
	 * <em>Increment</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Increment</em>' attribute.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(String value);

	/**
	 * Returns the value of the '<em><b>Initialization</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Initialization</em>' attribute.
	 * @see #setInitialization(String)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getFor_Initialization()
	 * @model required="true"
	 * @generated
	 */
	String getInitialization();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QFor#getInitialization <em>Initialization</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Initialization</em>' attribute.
	 * @see #getInitialization()
	 * @generated
	 */
	void setInitialization(String value);

} // For
