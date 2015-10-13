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
 *
 * @see org.smeup.sys.dk.test.QDevelopmentKitTestPackage#getTestRunner()
 * @model abstract="true"
 * @generated
 */
public interface QTestRunner extends QCallableTest, QContextProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerListener(QTestRunnerListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listeners</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	List<QTestRunnerListener> getListeners();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeListener(QTestRunnerListener listener);

} // QTestRunner
