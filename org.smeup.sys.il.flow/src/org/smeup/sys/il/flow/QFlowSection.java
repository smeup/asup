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
 * <em><b>Flow Section</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.flow.QFlowSection#getParameterLists <em>Parameter Lists</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QFlowSection#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QFlowSection#getPrototypes <em>Prototypes</em>}</li>
 *   <li>{@link org.smeup.sys.il.flow.QFlowSection#getRoutines <em>Routines</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getFlowSection()
 * @model
 * @generated
 */
public interface QFlowSection extends QUnitSection {
	/**
	 * Returns the value of the '<em><b>Parameter Lists</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.flow.QParameterList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Lists</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Lists</em>' containment reference list.
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getFlowSection_ParameterLists()
	 * @model containment="true"
	 * @generated
	 */
	List<QParameterList> getParameterLists();

	/**
	 * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.flow.QProcedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedures</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedures</em>' containment reference list.
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getFlowSection_Procedures()
	 * @model containment="true"
	 * @generated
	 */
	List<QProcedure> getProcedures();

	/**
	 * Returns the value of the '<em><b>Prototypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.flow.QPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prototypes</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prototypes</em>' containment reference list.
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getFlowSection_Prototypes()
	 * @model containment="true"
	 * @generated
	 */
	List<QPrototype> getPrototypes();

	/**
	 * Returns the value of the '<em><b>Routines</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.il.flow.QRoutine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routines</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routines</em>' containment reference list.
	 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage#getFlowSection_Routines()
	 * @model containment="true"
	 * @generated
	 */
	List<QRoutine> getRoutines();

} // QFlowSection
