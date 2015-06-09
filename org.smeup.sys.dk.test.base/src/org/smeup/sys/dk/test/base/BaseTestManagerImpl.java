/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti	- Initial API and implementation
 *   Mattia Rocchi	- Implementation
 */
package org.smeup.sys.dk.test.base;

import javax.inject.Inject;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.QUnitTestRunner;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.rt.core.QApplication;

public class BaseTestManagerImpl implements QTestManager {

	@Inject
	private QApplication application;
	
	@Override
	public QTestRunner prepareRunner(QContext context, String classURI) {

		QUnitTestRunner testRunner = new BaseUnitTestRunnerImpl(context, classURI);

		return testRunner;
	}

	@Override
	public QTestRunner prepareRunner(QContext context, Class<?> klass) {

		Bundle bundle = FrameworkUtil.getBundle(klass);
		String classURI = "asup:/bundle/" + bundle.getSymbolicName() + "/" + klass.getName();

		QUnitTestRunner testRunner = new BaseUnitTestRunnerImpl(context, classURI);

		return testRunner;
	}

	@Override
	public QContext prepareContext(Class<?> klass) {

		QContext context = application.getContext().createChildContext(klass.getSimpleName());
		
		return context;
	}
}
