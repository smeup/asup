/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.dk.test.base.api;

import java.io.IOException;

import org.smeup.sys.dk.test.QTestLauncher;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.il.core.QObject;

public class FileTestResultWriter extends AbstractTestResultWriter {
	
	// Implements QTestLauncherListener methods

	@Override
	public void launcherStopped(QTestLauncher launcher) {
	}

	@Override
	public void launcherStarted(QTestLauncher launcher) {		
		
	}

	@Override
	public void resultAdded(QTestRunner runner, QTestResult result) {
		
			
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write(QObject object) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
