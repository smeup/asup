/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.rt.auth.base;

import java.security.Principal;

import javax.management.remote.JMXPrincipal;

import org.smeup.sys.il.core.ctx.QIdentity;
import org.smeup.sys.il.core.ctx.impl.IdentityImpl;
import org.smeup.sys.rt.auth.QAuthentication;
import org.smeup.sys.rt.auth.QAuthenticationManager;
import org.smeup.sys.rt.auth.QAuthenticationUserPassword;

public class BaseDummyAuthenticationManagerImpl implements QAuthenticationManager {

	@Override
	public QIdentity<QAuthentication> authenticate(QAuthentication authentication) {

		if(authentication instanceof QAuthenticationUserPassword) {
			QAuthenticationUserPassword authenticationUserPassword = (QAuthenticationUserPassword) authentication;
			
			Principal principal = new JMXPrincipal(authenticationUserPassword.getUser());
			return new IdentityImpl<QAuthentication>(principal);
		}
		else
		 return null;
	}
}
