package org.smeup.sys.dk.test.base;

import java.util.ArrayList;
import java.util.List;

import org.smeup.sys.dk.test.QTestLauncherListener;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.impl.TestLauncherImpl;


public abstract class BaseTestLauncherImpl extends TestLauncherImpl {
	
	List<QTestLauncherListener> listeners = new ArrayList<QTestLauncherListener>();

	@Override
	public abstract void launch(String object); 

	@Override
	public void registerListener(QTestLauncherListener listener) {
		listeners.add(listener);
	}

	@Override
	public void removeListener(QTestLauncherListener listener) {
		listeners.remove(listener);
	}

	@Override
	public List<QTestLauncherListener> getListeners() {
		return listeners;
	}
	
	public String getCategory() {
		
		String result = "";
		
		Test annotation = this.getClass().getAnnotation(Test.class);
		
		if (annotation != null) {
			result = annotation.category();
		}
		return result;
	}

	
}
