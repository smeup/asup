/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.db.syntax.dml.QDatabaseSyntaxDMLPackage
 * @generated
 */
public interface QDatabaseSyntaxDMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDatabaseSyntaxDMLFactory eINSTANCE = org.smeup.sys.db.syntax.dml.impl.DatabaseSyntaxDMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Extended Query Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Query Select</em>'.
	 * @generated
	 */
	QExtendedQuerySelect createExtendedQuerySelect();

	/**
	 * Returns a new object of class '<em>Extended Query Expression Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Query Expression Body</em>'.
	 * @generated
	 */
	QExtendedQueryExpressionBody createExtendedQueryExpressionBody();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QDatabaseSyntaxDMLPackage getDatabaseSyntaxDMLPackage();

} //QDatabaseSyntaxDMLFactory
