/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage
 * @generated
 */
public interface QIntegratedLanguageDataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageDataFactory eINSTANCE = org.smeup.sys.il.data.impl.IntegratedLanguageDataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Filler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Filler</em>'.
	 * @generated
	 */
	QDataFiller createDataFiller();

	/**
	 * Returns a new object of class '<em>Data Reader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Reader</em>'.
	 * @generated
	 */
	QDataReader createDataReader();

	/**
	 * Returns a new object of class '<em>Data Writer</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Writer</em>'.
	 * @generated
	 */
	QDataWriter createDataWriter();

	/**
	 * Returns a new object of class '<em>Data Manager Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Manager Config</em>'.
	 * @generated
	 */
	QDataManagerConfig createDataManagerConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QIntegratedLanguageDataPackage getIntegratedLanguageDataPackage();

} // QIntegratedLanguageDataFactory
