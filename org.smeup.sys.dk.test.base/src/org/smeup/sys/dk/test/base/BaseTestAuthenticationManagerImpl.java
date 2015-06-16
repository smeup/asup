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

import org.smeup.sys.il.core.ctx.QCredentials;
import org.smeup.sys.rt.core.auth.QAuthenticationManager;
import org.smeup.sys.rt.core.auth.QAuthenticationToken;

public class BaseTestAuthenticationManagerImpl implements QAuthenticationManager {

	@Override
	public QAuthenticationToken createAuthenticationToken(QCredentials credentials) {
		
		return new QAuthenticationToken() {
			
			@Override
			public String getID() {
				return this.toString();
			}
		};
	}

}
