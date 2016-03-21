/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti	- Initial API and implementation
 *   Mattia Rocchi  - Implementation
 */
package org.smeup.sys.dk.test.base;

import java.util.ArrayList;
import java.util.List;

import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.QTestRunnerEvent;
import org.smeup.sys.dk.test.QTestRunnerListener;
import org.smeup.sys.il.core.ctx.QContext;

public abstract class BaseTestRunnerImpl implements QTestRunner {

	private QContext context;
	private List<QTestRunnerListener> listeners = new ArrayList<QTestRunnerListener>();
	protected BaseTestRunnerImpl(QContext context) {
		this.context = context;
	}
	
	@Override
	public QContext getContext() {
		return this.context;
	}

	@Override
	public void registerListener(QTestRunnerListener listener) {
		this.listeners.add(listener);
	}

	@Override
	public void removeListener(QTestRunnerListener listener) {
		this.listeners.remove(listener);
	}

	protected void fireEvent(QTestRunnerEvent event) {
		for (QTestRunnerListener listener : this.listeners)
			listener.handleEvent(event);
	}
}
