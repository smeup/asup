/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test;

import org.smeup.sys.il.core.ctx.QContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Suite Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.dk.test.QDevelopmentKitTestPackage#getTestSuiteLauncher()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QTestSuiteLauncher {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model categoryRequired="true"
	 * @generated
	 */
	QTestSuiteRunner createSuite(QContext context, String category);

} // QTestSuiteLauncher
