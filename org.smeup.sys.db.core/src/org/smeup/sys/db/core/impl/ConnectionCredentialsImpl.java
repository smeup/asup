/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.db.core.QConnectionCredentials;
import org.smeup.sys.db.core.QDatabaseCorePackage;
import org.smeup.sys.rt.auth.impl.AuthenticationUserPasswordImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Connection Credentials</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ConnectionCredentialsImpl extends AuthenticationUserPasswordImpl implements QConnectionCredentials {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionCredentialsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDatabaseCorePackage.Literals.CONNECTION_CREDENTIALS;
	}

} // ConnectionCredentialsImpl
