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
package org.smeup.sys.dk.test.base;

import java.util.Map;

import org.smeup.sys.co.shell.QShellManager;
import org.smeup.sys.il.data.QDataContainer;

public class BaseTestShellManagerImpl implements QShellManager {

	@Override
	public void executeCommand(String contextID, String command, Map<String, Object> variables, boolean defaults) {

		System.out.println(command);
	}

	@Override
	public QDataContainer decodeCommand(String contextID, String command) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String encodeCommand(String contextID, QDataContainer container, boolean useDefaults) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDefaultWriter(String contextID, String name) {
		// TODO Auto-generated method stub
		
	}
}
