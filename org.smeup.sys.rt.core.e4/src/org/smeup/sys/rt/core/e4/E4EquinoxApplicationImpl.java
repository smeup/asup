/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.rt.core.e4;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.QApplicationManager;
import org.smeup.sys.rt.core.QRuntimeCorePackage;

public class E4EquinoxApplicationImpl implements IApplication {

	private QApplication application = null;

	@Override
	public Object start(IApplicationContext context) throws Exception {

		String applicationConfig = null;

		String[] arguments = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
		for (int i = 0; i < arguments.length; i++)
			if (arguments[i].equals("-asupConfig")) {
				applicationConfig = arguments[i + 1];
				i++;
				continue;
			}

		if (applicationConfig == null) {
			System.out.println("Configuration required: see -asupConfig parameter");
			return null;
		}

		context.applicationRunning();
		// BundleContext bundleContext =
		// InternalPlatform.getDefault().getBundleContext();
		// Load application
		QRuntimeCorePackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = null;
		
		if(applicationConfig.startsWith("http"))
			uri = URI.createURI(applicationConfig);
		else
			uri = URI.createFileURI(applicationConfig);
		Resource resource = resourceSet.getResource(uri, true);
		resource.load(Collections.EMPTY_MAP);
		application = (QApplication) resource.getContents().get(0);

		System.out.println("Starting " + application);

		BundleContext bundleContext = FrameworkUtil.getBundle(QApplication.class).getBundleContext();
		ServiceReference<QApplicationManager> applicationManagerReference = bundleContext.getServiceReference(QApplicationManager.class);

		QApplicationManager applicationManager = bundleContext.getService(applicationManagerReference);
		applicationManager.start(application, System.out);
		
		return waitForStopOrRestart(applicationManager);
	}

	private Object waitForStopOrRestart(QApplicationManager applicationManager) {
		for(;;) {
			try {
			    TimeUnit.SECONDS.sleep(100);
			    if (applicationManager.restartCalled()) {
			    	return EXIT_RESTART;
			    }
			    if (applicationManager.stopCalled()) {
			    	return EXIT_OK;
			    }
			} catch (InterruptedException e) {
			}
		}
	}

	@Override
	public void stop() {
		System.out.println("Stopping " + application.getText());
	}

}
