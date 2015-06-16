/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage
 * @generated
 */
public interface QIntegratedLanguageEsamFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageEsamFactory eINSTANCE = org.smeup.sys.il.esam.impl.IntegratedLanguageEsamFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Set Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Set Term</em>'.
	 * @generated
	 */
	QDataSetTerm createDataSetTerm();

	/**
	 * Returns a new object of class '<em>Display Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display Term</em>'.
	 * @generated
	 */
	QDisplayTerm createDisplayTerm();

	/**
	 * Returns a new object of class '<em>Key List Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key List Term</em>'.
	 * @generated
	 */
	QKeyListTerm createKeyListTerm();

	/**
	 * Returns a new object of class '<em>Print Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Print Term</em>'.
	 * @generated
	 */
	QPrintTerm createPrintTerm();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QIntegratedLanguageEsamPackage getIntegratedLanguageEsamPackage();

} //QIntegratedLanguageEsamFactory
