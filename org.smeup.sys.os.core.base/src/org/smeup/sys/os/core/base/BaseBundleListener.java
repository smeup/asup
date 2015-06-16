/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial API and implementation
 * 	Mattia Rocchi
 */
package org.smeup.sys.os.core.base;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.osgi.framework.FrameworkUtil;
import org.smeup.sys.os.core.QSystem;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.rt.core.QBundleManager;

public class BaseBundleListener implements BundleListener, CommandProvider {

	@Inject
	private QBundleManager bundleManager;

	private QJob job;

	@PostConstruct
	public void init(QJob job) {
		this.job = job;

		BundleContext bundleContext = FrameworkUtil.getBundle(QSystem.class).getBundleContext();
		bundleContext.addBundleListener(this);
	}

	@Override
	public void bundleChanged(BundleEvent event) {

		Bundle bundle = event.getBundle();

		if (!bundleManager.isRegisterable(job.getContext(), bundle.getSymbolicName()))
			return;

		switch (event.getType()) {

		case BundleEvent.STARTED:
			bundleManager.register(job.getContext(), bundle.getSymbolicName());
			break;

		case BundleEvent.STOPPED:
			bundleManager.unregister(job.getContext(), bundle.getSymbolicName());
			break;

		default:
			break;
		}
	}

	public String decode(int type) {
		switch (type) {
		case 1:
			return "INSTALLED";
		case 2:
			return "STARTED";
		case 4:
			return "STOPPED";
		case 8:
			return "UPDATED";
		case 16:
			return "UNINSTALLED";
		case 32:
			return "RESOLVED";
		case 64:
			return "UNRESOLVED";
		case 128:
			return "STARTING";
		case 256:
			return "STOPPING";
		case 512:
			return "LAZY_ACTIVATION";
		default:
			return "??" + type + "??";
		}
	}

	public void _loadOMAC(CommandInterpreter interpreter) throws Exception {

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