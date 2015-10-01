/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test;

import java.util.List;
import org.smeup.sys.il.core.ctx.QContextProvider;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Test Runner</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.dk.test.QTestRunner#getListeners <em>Listeners</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.dk.test.QDevelopmentKitTestPackage#getTestRunner()
 * @model abstract="true"
 * @generated
 */
public interface QTestRunner extends QCallableTest, QContextProvider {
	/**
	 * Returns the value of the '<em><b>Listeners</b></em>' containment reference list.
	 * The list contents are of type {@link org.smeup.sys.dk.test.QTestListener}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listeners</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listeners</em>' containment reference list.
	 * @see org.smeup.sys.dk.test.QDevelopmentKitTestPackage#getTestRunner_Listeners()
	 * @model containment="true"
	 * @generated
	 */
	List<QTestListener> getListeners();

} // QTestRunner
