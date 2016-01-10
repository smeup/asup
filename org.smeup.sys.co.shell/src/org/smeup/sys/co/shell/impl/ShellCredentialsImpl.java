/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.co.shell.impl;

import org.eclipse.emf.ecore.EClass;

import org.smeup.sys.co.shell.QCommunicationShellPackage;
import org.smeup.sys.co.shell.QShellCredentials;

import org.smeup.sys.il.core.ctx.impl.CredentialsImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shell Credentials</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ShellCredentialsImpl extends CredentialsImpl implements QShellCredentials {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShellCredentialsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QCommunicationShellPackage.Literals.SHELL_CREDENTIALS;
	}

} //ShellCredentialsImpl
