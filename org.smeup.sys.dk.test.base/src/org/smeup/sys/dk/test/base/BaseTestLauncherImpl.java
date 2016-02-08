/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.dk.test.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.smeup.sys.dk.test.QTestLauncher;
import org.smeup.sys.dk.test.QTestLauncherListener;
import org.smeup.sys.dk.test.annotation.Test;
import org.smeup.sys.il.core.ctx.QContext;


public abstract class BaseTestLauncherImpl implements QTestLauncher {
		
	Map<QContext, List<QTestLauncherListener>> listeners = new HashMap<QContext, List<QTestLauncherListener>>();
	
	@Override
	public abstract void launch(QContext context, String object);
	 
	@Override
	public void init(QContext context) {
		TestLauncherHelper.notifyLauncherStarted(context, this);
	}
	
	@Override
	public void destroy(QContext context) {
		TestLauncherHelper.notifyLauncherStopped(context, this);
	}; 

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
		if (listeners.containsKey(context)) {
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
