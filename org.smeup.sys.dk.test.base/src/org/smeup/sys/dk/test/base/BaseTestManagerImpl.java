/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi	- Initial API and implementation
 *   Dario Foresti	- Implementation
 */
package org.smeup.sys.dk.test.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.smeup.sys.dk.test.DevelopmentKitTestRuntimeException;
import org.smeup.sys.dk.test.QTestManager;
import org.smeup.sys.dk.test.QTestRunnerMaker;
import org.smeup.sys.dk.test.QTestSuiteLauncher;
import org.smeup.sys.dk.test.QTestSuiteRunner;
import org.smeup.sys.dk.test.QTestUnitRunner;
import org.smeup.sys.il.core.ctx.QContext;

public class BaseTestManagerImpl implements QTestManager {
	
	@SuppressWarnings("resource")
	@Override
	public QTestUnitRunner prepareUnitRunner(QContext context, QTestRunnerMaker testMaker, Class<?> klass) {

		Bundle bundle = FrameworkUtil.getBundle(klass);
		String classURI = "asup:/bundle/" + bundle.getSymbolicName() + "/" + klass.getName();

		QContext testContext = new BaseTestContextImpl(context.createChildContext(klass.getSimpleName()), testMaker);
		QTestUnitRunner testRunner = new BaseTestUnitRunnerImpl(testContext, classURI);
		return testRunner;
	}

	@SuppressWarnings("resource")
	@Override
	public QTestUnitRunner prepareUnitRunner(QContext context, QTestRunnerMaker testMaker, String classURI) {

		QContext testContext = new BaseTestContextImpl(context.createChildContext(classURI), testMaker);
		QTestUnitRunner testRunner = new BaseTestUnitRunnerImpl(testContext, classURI);
		return testRunner;
	}

	@SuppressWarnings("resource")
	@Override
	public List<QTestSuiteRunner> prepareSuiteRunner(QContext context, QTestRunnerMaker testMaker, String component) {
		BundleContext bundleContext = FrameworkUtil.getBundle(QContext.class).getBundleContext();

		// Search QTestLauncher services for specific component
		String filter = null;

		if (component != null && component.length() > 0) 
			filter = "(org.smeup.sys.rt.core.component.name=" + component + ")";

		Collection<ServiceReference<QTestSuiteLauncher>> serviceReferences;
		try {
			serviceReferences = bundleContext.getServiceReferences(QTestSuiteLauncher.class, filter);
		} catch (InvalidSyntaxException e) {
			throw new DevelopmentKitTestRuntimeException(e);
		}

		List<QTestSuiteRunner> suiteRunners = new ArrayList<QTestSuiteRunner>();
		for (ServiceReference<QTestSuiteLauncher> serviceRef : serviceReferences) {
			QTestSuiteLauncher testSuiteLauncher = bundleContext.getService(serviceRef);

			QContext testContext = new BaseTestContextImpl(context.createChildContext(testSuiteLauncher.getClass().getSimpleName()), testMaker);
			QTestSuiteRunner suiteRunner = testSuiteLauncher.createSuite(testContext);
			suiteRunners.add(suiteRunner);
		}
		return suiteRunners;
	}
}
