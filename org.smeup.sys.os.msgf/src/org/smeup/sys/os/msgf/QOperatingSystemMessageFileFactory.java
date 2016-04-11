/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.msgf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.smeup.sys.os.msgf.QOperatingSystemMessageFilePackage
 * @generated
 */
public interface QOperatingSystemMessageFileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QOperatingSystemMessageFileFactory eINSTANCE = org.smeup.sys.os.msgf.impl.OperatingSystemMessageFileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Message Description</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Message Description</em>'.
	 * @generated
	 */
	QMessageDescription createMessageDescription();

	/**
	 * Returns a new object of class '<em>Message Data Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Data Field</em>'.
	 * @generated
	 */
	QMessageDataField createMessageDataField();

	/**
	 * Returns a new object of class '<em>Message File</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Message File</em>'.
	 * @generated
	 */
	QMessageFile createMessageFile();

	/**
	 * Returns a new object of class '<em>Message File Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message File Container</em>'.
	 * @generated
	 */
	QMessageFileContainer createMessageFileContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QOperatingSystemMessageFilePackage getOperatingSystemMessageFilePackage();

} // QOperatingSystemMessageFileFactory
