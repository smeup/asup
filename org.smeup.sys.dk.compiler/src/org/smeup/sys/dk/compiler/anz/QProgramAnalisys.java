/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.compiler.anz;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Analisys</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.dk.compiler.anz.QProgramAnalisys#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.dk.compiler.anz.QDevelopmentKitCompilerAnalyzerPackage#getProgramAnalisys()
 * @model
 * @generated
 */
public interface QProgramAnalisys {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.dk.compiler.anz.QVariableRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.smeup.sys.dk.compiler.anz.QDevelopmentKitCompilerAnalyzerPackage#getProgramAnalisys_Variables()
	 * @model containment="true"
	 * @generated
	 */
	List<QVariableRef> getVariables();

} // QProgramAnalisys
