/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.dk.test.impl;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.smeup.sys.dk.test.QDevelopmentKitTestPackage;
import org.smeup.sys.dk.test.QTestRunner;
import org.smeup.sys.dk.test.QTestRunnerListener;
import org.smeup.sys.il.core.ctx.QContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Runner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TestRunnerImpl extends MinimalEObjectImpl.Container implements QTestRunner {
	
	/**
	 * @generated NOT
	 */
	private List<QTestRunnerListener> listeners = new ArrayList<QTestRunnerListener>();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestRunnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QDevelopmentKitTestPackage.Literals.TEST_RUNNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<QTestRunnerListener> getListeners() {
		return listeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void registerListener(QTestRunnerListener listener) {
		listeners.add(listener);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeListener(QTestRunnerListener listener) {
		listeners.remove(listener);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QContext getContext() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //TestRunnerImpl
