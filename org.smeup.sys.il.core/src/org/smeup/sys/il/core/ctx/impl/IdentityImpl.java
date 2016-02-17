/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.ctx.impl;

import java.security.Principal;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.il.core.QObject;
import org.smeup.sys.il.core.ctx.QIdentity;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.impl.ObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IdentityImpl<T extends QObject> extends ObjectImpl implements QIdentity<T> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Principal principal;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IdentityImpl(Principal principal) {
		super();
		this.principal = principal;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QIntegratedLanguageCoreCtxPackage.Literals.IDENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Principal getJavaPrincipal() {
		return this.principal;
	}

} //IdentityImpl
