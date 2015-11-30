/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.core.env;

import java.util.List;

import org.smeup.sys.os.core.QEnvironmentVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Variable Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smeup.sys.os.core.env.QEnvironmentVariableContainer#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smeup.sys.os.core.env.QOperatingSystemEnvironmentPackage#getEnvironmentVariableContainer()
 * @model
 * @generated
 */
public interface QEnvironmentVariableContainer {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.os.core.QEnvironmentVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.smeup.sys.os.core.env.QOperatingSystemEnvironmentPackage#getEnvironmentVariableContainer_Variables()
	 * @model containment="true"
	 * @generated
	 */
	List<QEnvironmentVariable> getVariables();

} // QEnvironmentVariableContainer
