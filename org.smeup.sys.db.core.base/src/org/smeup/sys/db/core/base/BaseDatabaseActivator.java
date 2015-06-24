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
package org.smeup.sys.db.core.base;

import org.smeup.sys.db.core.QDatabaseManager;
import org.smeup.sys.rt.core.ComponentStarted;

public class BaseDatabaseActivator {

	@ComponentStarted
	public void start(QDatabaseManager databaseManager) {
		
		databaseManager.start();
	}	
}
