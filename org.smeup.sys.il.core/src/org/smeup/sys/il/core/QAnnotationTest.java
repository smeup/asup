/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Annotation Test</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.core.QAnnotationTest#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.smeup.sys.il.core.QAnnotationTest#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getAnnotationTest()
 * @model
 * @generated
 */
public interface QAnnotationTest extends QAnnotation {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getAnnotationTest_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.core.QAnnotationTest#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage#getAnnotationTest_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.core.QAnnotationTest#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // QAnnotationTest
