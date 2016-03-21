/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.db.syntax.test;

import javax.inject.Inject;

import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestSuiteLauncher;
import org.smeup.sys.dk.test.QTestSuiteRunner;
import org.smeup.sys.il.core.ctx.QContext;

public class DBSyntaxTestLauncherImpl implements QTestSuiteLauncher {

	@Inject
	private QTestManager testManager;

	@Override
	public QTestSuiteRunner createSuite(QContext context) {
		return new DBSyntaxTestSuiteRunnerImpl(context, testManager);
	}
}
