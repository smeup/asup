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
 * <em><b>Function Exec</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.smeup.sys.il.flow.QProcedureExec#getProcedure <em>Procedure</em>}</li>
 * <li>{@link org.smeup.sys.il.flow.QProcedureExec#getParameters <em>Parameters</em>}
 * </li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getProcedureExec()
 * @model
 * @generated
 */
public interface QProcedureExec extends QInvoke {
	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Procedure</em>' attribute.
	 * @see #setProcedure(String)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getProcedureExec_Procedure()
	 * @model
	 * @generated
	 */
	String getProcedure();

	/**
	 * Sets the value of the '
	 * {@link org.smeup.sys.il.flow.QProcedureExec#getProcedure <em>Procedure</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Procedure</em>' attribute.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list. The
	 * list contents are of type {@link java.lang.String}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getProcedureExec_Parameters()
	 * @model unique="false"
	 * @generated
	 */
	List<String> getParameters();

} // QFunctionExec
