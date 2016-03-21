/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.dk.test.base;

import java.util.Collection;

import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.il.core.ctx.QContext;

public abstract class BaseTestSuiteDirectoryRunnerImpl extends BaseTestSuiteRunnerImpl {

	public BaseTestSuiteDirectoryRunnerImpl(QContext context, QTestManager testManager) {
		super(context, testManager);
	}

	private String runnerDirPath = "/runner/";	

	/**
	 * Override to define runners dir path
	 * @return
	 */
	public String getRunnersDirPath() {
		return runnerDirPath;
	}
	
	@Override
	public Collection<Class<?>> getTestClassList() {
		return BaseTestHelper.findTestClasses(this, getRunnersDirPath());	
	}
}
