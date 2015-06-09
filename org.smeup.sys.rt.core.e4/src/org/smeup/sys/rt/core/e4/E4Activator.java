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

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.smeup.sys.rt.core.QApplicationManager;

public class E4Activator implements BundleActivator {

	private ServiceRegistration<QApplicationManager> applicationManagerRegistration;

	@Override
	public void start(BundleContext context) throws Exception {

		this.applicationManagerRegistration = context.registerService(QApplicationManager.class, new E4ApplicationManagerImpl(), null);

	}

	@Override
	public void stop(BundleContext context) throws Exception {

		if (this.applicationManagerRegistration != null)
			context.ungetService(applicationManagerRegistration.getReference());

	}

}
