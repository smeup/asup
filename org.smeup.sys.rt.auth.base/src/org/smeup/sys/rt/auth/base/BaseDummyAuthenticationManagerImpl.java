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

import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.QObjectAdapter;
import org.smeup.sys.il.core.ctx.QIdentity;
import org.smeup.sys.rt.auth.QAuthentication;
import org.smeup.sys.rt.auth.QAuthenticationManager;
import org.smeup.sys.rt.auth.QAuthenticationUserPassword;

public class BaseDummyAuthenticationManagerImpl implements QAuthenticationManager {

	@Override
	public QIdentity<QAuthentication> authenticate(QAuthentication authentication) {

		if(authentication instanceof QAuthenticationUserPassword) {
			QAuthenticationUserPassword authenticationUserPassword = (QAuthenticationUserPassword) authentication;
			
			return new QIdentity<QAuthentication>() {

				private static final long serialVersionUID = 1L;
				private QObject qObject = QObjectAdapter.adapt(this);
				@Override
				public Principal getJavaPrincipal() {
					return new Principal() {
						
						@Override
						public String getName() {
							return authenticationUserPassword.getUser();
						}
					};
				}

				@Override
				public String qURI() {
					return this.qObject.qURI();
				}
			};
		}
		else
		 return null;
	}
}
