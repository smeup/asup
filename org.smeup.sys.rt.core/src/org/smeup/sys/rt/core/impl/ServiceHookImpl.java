/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.rt.core.QRuntimeCorePackage;
import org.smeup.sys.rt.core.QServiceHook;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Hook</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceHookImpl extends ServiceRefImpl implements QServiceHook {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceHookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QRuntimeCorePackage.Literals.SERVICE_HOOK;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getInterfaceName() {
		return getClassName();
	}

} //ServiceHookImpl
