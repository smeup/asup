/**
 *  Copyright (c) 2012, 2016 Sme.UP and others. *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.os.dtaq.test;


import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestSuiteLauncher;
import org.smeup.sys.dk.test.QTestSuiteRunner;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.base.BaseTestSuiteDirectoryRunnerImpl;
import org.smeup.sys.il.core.ctx.QContext;

public class OSDtaqTestLauncherImpl implements QTestSuiteLauncher {

	@Inject
	private QTestManager testManager;

	@Override
	public QTestSuiteRunner createSuite(QContext context, String category) {
		return new InternalSuiteDirectoryRunnerImpl(context, testManager, category);
	}	

	@Test(category = "OSDtaq")
	private class InternalSuiteDirectoryRunnerImpl extends BaseTestSuiteDirectoryRunnerImpl {

		public InternalSuiteDirectoryRunnerImpl(QContext context, QTestManager testManager, String category) {
			super(context, testManager, category);
		}		
	}
}

