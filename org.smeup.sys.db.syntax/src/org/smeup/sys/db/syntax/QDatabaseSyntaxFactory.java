/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.db.syntax.QDatabaseSyntaxPackage
 * @generated
 */
public interface QDatabaseSyntaxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDatabaseSyntaxFactory eINSTANCE = org.smeup.sys.db.syntax.impl.DatabaseSyntaxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Binding Parse Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Parse Error</em>'.
	 * @generated
	 */
	QBindingParseError createBindingParseError();

	/**
	 * Returns a new object of class '<em>Binding Parse Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Parse Result</em>'.
	 * @generated
	 */
	QBindingParseResult createBindingParseResult();

	/**
	 * Returns a new object of class '<em>Definition Parse Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition Parse Error</em>'.
	 * @generated
	 */
	QDefinitionParseError createDefinitionParseError();

	/**
	 * Returns a new object of class '<em>Definition Parse Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition Parse Result</em>'.
	 * @generated
	 */
	QDefinitionParseResult createDefinitionParseResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QDatabaseSyntaxPackage getDatabaseSyntaxPackage();

} //QDatabaseSyntaxFactory
