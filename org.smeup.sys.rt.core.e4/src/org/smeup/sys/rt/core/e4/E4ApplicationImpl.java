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

import java.util.List;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.rt.core.ApplicationStatus;
import org.smeup.sys.rt.core.QApplication;
import org.smeup.sys.rt.core.QApplicationComponent;
import org.smeup.sys.rt.core.QServiceHook;

public class E4ApplicationImpl implements QApplication {

	private static final long serialVersionUID = 1L;
	private QApplication application;
	private QContext context;

	public E4ApplicationImpl(QApplication application, QContext context) {
		this.application = application;
		this.context = context;
	}

	public List<QServiceHook> getHooks() {
		return application.getHooks();
	}

	public List<QApplicationComponent> getComponents() {
		return application.getComponents();
	}

	public String getText() {
		return application.getText();
	}

	public void setText(String value) {
		application.setText(value);
	}

	public QContext getContext() {
		return this.context;
	}

	@Override
	public String getName() {
		return application.getName();
	}

	@Override
	public void setName(String value) {
		application.setName(value);
	}

	@Override
	public String getInstallPath() {
		return System.getProperty("osgi.instance.area");
	}

	@Override
	public ApplicationStatus getStatus() {
		return ApplicationStatus.ACTIVE;
	}

	@Override
	public boolean isStartable() {
		return application.isStartable();
	}

	@Override
	public boolean isStoppable() {
		return application.isStoppable();
	}
}
