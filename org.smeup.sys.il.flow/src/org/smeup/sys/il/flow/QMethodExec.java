/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Method Exec</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.QMethodExec#getObject <em>Object</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QMethodExec#getMethod <em>Method</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QMethodExec#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getMethodExec()
 * @model
 * @generated
 */
public interface QMethodExec extends QInvoke {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(String)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getMethodExec_Object()
	 * @model
	 * @generated
	 */
	String getObject();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QMethodExec#getObject
	 * <em>Object</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getMethodExec_Method()
	 * @model
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QMethodExec#getMethod
	 * <em>Method</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getMethodExec_Parameters()
	 * @model unique="false"
	 * @generated
	 */
	List<String> getParameters();

} // QMethodExec
