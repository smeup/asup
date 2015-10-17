package org.smeup.sys.dk.test.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.smeup.sys.dk.test.QTestLauncherListener;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.dk.test.impl.TestLauncherImpl;
import org.smeup.sys.il.core.ctx.QContext;


public abstract class BaseTestLauncherImpl extends TestLauncherImpl {
		
	Map<QContext, List<QTestLauncherListener>> listeners = new HashMap<QContext, List<QTestLauncherListener>>();
	 

	@Override
	public abstract void launch(QContext context, String object); 

	@Override
	public void registerListener(QContext context, QTestLauncherListener listener) {
		
		// Create context listeners list if not exists
		if (listeners.containsKey(context) == false) {
			List<QTestLauncherListener> contextList = new ArrayList<QTestLauncherListener>();
			listeners.put(context, contextList);		
		}
		
		listeners.get(context).add(listener);		
		
	}

	@Override
	public void removeListener(QContext context, QTestLauncherListener listener) {
		if (listeners.containsKey(context) == false) {
			listeners.get(context).remove(listener);
		}
		
		// If context listener list is empty, remove it from map register
		if (listeners.get(context).size() == 0) {
			listeners.remove(context);
		}
	}

	@Override
	public List<QTestLauncherListener> getListeners(QContext context) {
		return listeners.get(context);
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
