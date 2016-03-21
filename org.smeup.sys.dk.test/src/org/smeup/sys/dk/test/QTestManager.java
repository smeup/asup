/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test;

import java.util.List;
import org.smeup.sys.il.core.ctx.QContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.dk.test.QDevelopmentKitTestPackage#getTestManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QTestManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model componentRequired="true"
	 * @generated
	 */
	List<QTestSuiteRunner> prepareSuiteRunner(QContext context, QTestRunnerMaker testMaker, String component);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" klassRequired="true"
	 * @generated
	 */
	QTestUnitRunner prepareUnitRunner(QContext context, QTestRunnerMaker testMaker, Class<?> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" classURIRequired="true"
	 * @generated
	 */
	QTestUnitRunner prepareUnitRunner(QContext context, QTestRunnerMaker testMaker, String classURI);

} // QTestManager
