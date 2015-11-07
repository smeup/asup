/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler.anz;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.dk.compiler.anz.QVariableRef#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link org.smeup.sys.dk.compiler.anz.QVariableRef#getOccourence <em>Occourence</em>}</li>
 *   <li>{@link org.smeup.sys.dk.compiler.anz.QVariableRef#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.dk.compiler.anz.QDevelopmentKitCompilerAnalyzerPackage#getVariableRef()
 * @model
 * @generated
 */
public interface QVariableRef {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see org.smeup.sys.dk.compiler.anz.QDevelopmentKitCompilerAnalyzerPackage#getVariableRef_VariableName()
	 * @model required="true"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link org.smeup.sys.dk.compiler.anz.QVariableRef#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Occourence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occourence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occourence</em>' attribute.
	 * @see #setOccourence(int)
	 * @see org.smeup.sys.dk.compiler.anz.QDevelopmentKitCompilerAnalyzerPackage#getVariableRef_Occourence()
	 * @model required="true"
	 * @generated
	 */
	int getOccourence();

	/**
	 * Sets the value of the '{@link org.smeup.sys.dk.compiler.anz.QVariableRef#getOccourence <em>Occourence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occourence</em>' attribute.
	 * @see #getOccourence()
	 * @generated
	 */
	void setOccourence(int value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' attribute list.
	 * @see org.smeup.sys.dk.compiler.anz.QDevelopmentKitCompilerAnalyzerPackage#getVariableRef_Uses()
	 * @model
	 * @generated
	 */
	List<String> getUses();

} // QVariableRef
