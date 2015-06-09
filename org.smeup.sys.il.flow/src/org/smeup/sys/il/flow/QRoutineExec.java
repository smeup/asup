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
 * <em><b>Routine Exec</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.smeup.sys.il.flow.QRoutineExec#getRoutine <em>Routine</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getRoutineExec()
 * @model
 * @generated
 */
public interface QRoutineExec extends QInvoke {
	/**
	 * Returns the value of the '<em><b>Routine</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routine</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Routine</em>' attribute.
	 * @see #setRoutine(String)
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getRoutineExec_Routine()
	 * @model
	 * @generated
	 */
	String getRoutine();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.flow.QRoutineExec#getRoutine
	 * <em>Routine</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Routine</em>' attribute.
	 * @see #getRoutine()
	 * @generated
	 */
	void setRoutine(String value);

} // QRoutineExec
