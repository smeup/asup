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

public abstract class DirectoryTestLauncherImpl extends MultipleTestLauncherImpl {

	

	private String runnerDirPath = "/runner/";	

	/**
	 * Override to define runners dir path
	 * @return
	 */
	public String getRunnersDirPath() {
		return runnerDirPath;
	}
	
	@Override
	public Collection<Class<?>> getTestClassList(String object) {
		return TestLauncherHelper.findTestClasses(this, getRunnersDirPath(), object);	
	}
	
	@Override
	public boolean breaksOnFirstFailedTest() {
		/*
		 * By default don't break on first failed test
		 */
		return false;
	}
}
