/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.cmd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.smeup.sys.os.cmd.QOperatingSystemCommandPackage
 * @generated
 */
public interface QOperatingSystemCommandFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QOperatingSystemCommandFactory eINSTANCE = org.smeup.sys.os.cmd.impl.OperatingSystemCommandFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Callable Command</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Callable Command</em>'.
	 * @generated
	 */
	QCallableCommand createCallableCommand();

	/**
	 * Returns a new object of class '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command</em>'.
	 * @generated
	 */
	QCommand createCommand();

	/**
	 * Returns a new object of class '<em>Command Container</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Command Container</em>'.
	 * @generated
	 */
	QCommandContainer createCommandContainer();

	/**
	 * Returns a new object of class '<em>Command Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Data</em>'.
	 * @generated
	 */
	QCommandData createCommandData();

	/**
	 * Returns a new object of class '<em>Command Parameter</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Command Parameter</em>'.
	 * @generated
	 */
	QCommandParameter createCommandParameter();

	/**
	 * Returns a new object of class '<em>Command Source</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Command Source</em>'.
	 * @generated
	 */
	QCommandSource createCommandSource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QOperatingSystemCommandPackage getOperatingSystemCommandPackage();

} // OSCommandCoreFactory
