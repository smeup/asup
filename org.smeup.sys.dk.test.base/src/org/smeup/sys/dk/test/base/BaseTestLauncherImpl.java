package org.smeup.sys.dk.test.base;

import org.smeup.sys.dk.test.QTestLauncherListener;
import org.smeup.sys.dk.test.impl.TestLauncherImpl;


public abstract class BaseTestLauncherImpl extends TestLauncherImpl {

	@Override
	public abstract void launch(String oggetto); 		
	
	@Override
	public void addListener(QTestLauncherListener listener) {
		getListeners().add(listener);
	}

	@Override
	public void removeListener(QTestLauncherListener listener) {
		getListeners().remove(listener);
	}
}
