/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial API and implementation
 * 	Mattia Rocchi
 */
package org.smeup.sys.os.core.base;

import javax.inject.Inject;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.rt.core.QBundleManager;

public class BaseBundleCommandProviderImpl implements CommandProvider {

	@Inject
	private QBundleManager bundleManager;
	@Inject
	private QJob job;

	public void _loadomac(CommandInterpreter interpreter) throws Exception {

		BundleContext bundleContext = FrameworkUtil.getBundle(QSystem.class).getBundleContext();

		for (Bundle bundle : bundleContext.getBundles()) {

			if (!bundleManager.isRegisterable(job.getContext(), bundle.getSymbolicName()))
				continue;

			if (bundle.getState() == Bundle.UNINSTALLED)
				bundleManager.unregister(job.getContext(), bundle.getSymbolicName());
			else
				bundleManager.register(job.getContext(), bundle.getSymbolicName());
		}

	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}