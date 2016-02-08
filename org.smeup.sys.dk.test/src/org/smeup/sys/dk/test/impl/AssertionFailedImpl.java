/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test.impl;

import org.eclipse.emf.ecore.EClass;
import org.smeup.sys.dk.test.AssertionState;
import org.smeup.sys.dk.test.QAssertionFailed;
import org.smeup.sys.dk.test.QDevelopmentKitTestPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Assertion Failed</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class AssertionFailedImpl extends AssertionResultImpl implements QAssertionFailed {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertionFailedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDevelopmentKitTestPackage.Literals.ASSERTION_FAILED;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public AssertionState getAssertionState() {
		return AssertionState.FAILED;
	}
} // AssertionFailedImpl
