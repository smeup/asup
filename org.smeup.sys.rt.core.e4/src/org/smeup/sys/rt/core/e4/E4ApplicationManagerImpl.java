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

import java.io.OutputStream;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.QApplicationManager;

public class E4ApplicationManagerImpl implements QApplicationManager {

	private boolean restart = false;

	@Override
	public QApplication start(QApplication application, OutputStream output) {

		try {
			// Start application
			BundleContext bundleContext = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
			return new E4ApplicationStarter(application, bundleContext, output).start();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void restart() {
		restart = true;
	}

	@Override
	public boolean restartCalled() {
		return restart;
	}

}
