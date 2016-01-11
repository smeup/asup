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
package org.smeup.sys.il.core.e4;

import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.BundleContext;
import org.smeup.sys.il.core.ctx.QContextDescription;

public class E4ContextRootImpl extends E4ContextImpl {

	private IEclipseContext eclipseContext;

	public E4ContextRootImpl(BundleContext bundleContext, String contextID, QContextDescription contextDescription) {
		super(bundleContext, contextID, contextDescription);

		this.eclipseContext = EclipseContextFactory.getServiceContext(bundleContext);

		initializeContext(this.eclipseContext);
	}

	@Override
	public IEclipseContext getEclipseContext() {
		return eclipseContext;
	}
	
	@Override
	void removeEclipseContext() {
		this.eclipseContext = null;
	}
}