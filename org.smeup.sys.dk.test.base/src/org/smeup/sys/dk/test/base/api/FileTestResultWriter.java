package org.smeup.sys.dk.test.base.api;

import java.io.IOException;

import org.smeup.sys.dk.test.QAssertionResult;
import org.smeup.sys.dk.test.QTestLauncher;
import org.smeup.sys.dk.test.QTestLauncherListener;
import org.smeup.sys.dk.test.QTestResult;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.il.core.out.QObjectWriter;

public class FileTestResultWriter implements QTestLauncherListener {
	
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
}
