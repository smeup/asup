/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.smeup.sys.il.core.QIntegratedLanguageCorePackage
 * @generated
 */
public interface QIntegratedLanguageCoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageCoreFactory eINSTANCE = org.smeup.sys.il.core.impl.IntegratedLanguageCoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	QObject createObject();

	/**
	 * Returns a new object of class '<em>Object Nameable</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Object Nameable</em>'.
	 * @generated
	 */
	QObjectNameable createObjectNameable();

	/**
	 * Returns a new object of class '<em>Thread Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thread Info</em>'.
	 * @generated
	 */
	QThreadInfo createThreadInfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QIntegratedLanguageCorePackage getIntegratedLanguageCorePackage();

} // QIntegratedLanguageCoreFactory
