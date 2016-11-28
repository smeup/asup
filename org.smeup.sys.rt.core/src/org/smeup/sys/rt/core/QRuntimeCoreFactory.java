/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.rt.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.rt.core.QRuntimeCorePackage
 * @generated
 */
public interface QRuntimeCoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QRuntimeCoreFactory eINSTANCE = org.smeup.sys.rt.core.impl.RuntimeCoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	QApplication createApplication();

	/**
	 * Returns a new object of class '<em>Application Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Component</em>'.
	 * @generated
	 */
	QApplicationComponent createApplicationComponent();

	/**
	 * Returns a new object of class '<em>Application Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Module</em>'.
	 * @generated
	 */
	QApplicationModule createApplicationModule();

	/**
	 * Returns a new object of class '<em>Service Command Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Command Provider</em>'.
	 * @generated
	 */
	QServiceCommandProvider createServiceCommandProvider();

	/**
	 * Returns a new object of class '<em>Service Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Hook</em>'.
	 * @generated
	 */
	QServiceHook createServiceHook();

	/**
	 * Returns a new object of class '<em>Service Executor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Executor</em>'.
	 * @generated
	 */
	QServiceExecutor createServiceExecutor();

	/**
	 * Returns a new object of class '<em>Service Resource Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Resource Listener</em>'.
	 * @generated
	 */
	QServiceResourceListener createServiceResourceListener();

	/**
	 * Returns a new object of class '<em>Service Resource Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Resource Provider</em>'.
	 * @generated
	 */
	QServiceResourceProvider createServiceResourceProvider();

	/**
	 * Returns a new object of class '<em>Service Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Registry</em>'.
	 * @generated
	 */
	QServiceRegistry createServiceRegistry();

	/**
	 * Returns a new object of class '<em>Service Registry Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Registry Entry</em>'.
	 * @generated
	 */
	QServiceRegistryEntry createServiceRegistryEntry();

	/**
	 * Returns a new object of class '<em>Service Tester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Tester</em>'.
	 * @generated
	 */
	QServiceTester createServiceTester();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QRuntimeCorePackage getRuntimeCorePackage();

} //QFrameworkCoreFactory
