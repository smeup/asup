/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Launcher Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.dk.test.QDevelopmentKitTestPackage#getTestLauncherListener()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QTestLauncherListener {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void launcherStopped(QTestLauncher launcher);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void launcherStarted(QTestLauncher launcher);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resultAdded(QTestRunner runner, QTestResult result);

} // QTestLauncherListener
