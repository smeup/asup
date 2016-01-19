/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.db.syntax.dbl.QDatabaseSyntaxDBLPackage
 * @generated
 */
public interface QDatabaseSyntaxDBLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDatabaseSyntaxDBLFactory eINSTANCE = org.smeup.sys.db.syntax.dbl.impl.DatabaseSyntaxDBLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Allocate Descriptor Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocate Descriptor Statement</em>'.
	 * @generated
	 */
	QAllocateDescriptorStatement createAllocateDescriptorStatement();

	/**
	 * Returns a new object of class '<em>Deallocate Descriptor Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deallocate Descriptor Statement</em>'.
	 * @generated
	 */
	QDeallocateDescriptorStatement createDeallocateDescriptorStatement();

	/**
	 * Returns a new object of class '<em>Declare Cursor Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declare Cursor Statement</em>'.
	 * @generated
	 */
	QDeclareCursorStatement createDeclareCursorStatement();

	/**
	 * Returns a new object of class '<em>Describe Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Describe Statement</em>'.
	 * @generated
	 */
	QDescribeStatement createDescribeStatement();

	/**
	 * Returns a new object of class '<em>Execute Immediate Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute Immediate Statement</em>'.
	 * @generated
	 */
	QExecuteImmediateStatement createExecuteImmediateStatement();

	/**
	 * Returns a new object of class '<em>Execute Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute Statement</em>'.
	 * @generated
	 */
	QExecuteStatement createExecuteStatement();

	/**
	 * Returns a new object of class '<em>Fetch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fetch Statement</em>'.
	 * @generated
	 */
	QFetchStatement createFetchStatement();

	/**
	 * Returns a new object of class '<em>Get Descriptor Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Descriptor Statement</em>'.
	 * @generated
	 */
	QGetDescriptorStatement createGetDescriptorStatement();

	/**
	 * Returns a new object of class '<em>Get Diagnostics Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Diagnostics Statement</em>'.
	 * @generated
	 */
	QGetDiagnosticsStatement createGetDiagnosticsStatement();

	/**
	 * Returns a new object of class '<em>Into Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Into Clause</em>'.
	 * @generated
	 */
	QIntoClause createIntoClause();

	/**
	 * Returns a new object of class '<em>Single Row Fetch Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Row Fetch Clause</em>'.
	 * @generated
	 */
	QSingleRowFetchClause createSingleRowFetchClause();

	/**
	 * Returns a new object of class '<em>Multiple Row Fetch Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Row Fetch Clause</em>'.
	 * @generated
	 */
	QMultipleRowFetchClause createMultipleRowFetchClause();

	/**
	 * Returns a new object of class '<em>Set Descriptor Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Descriptor Statement</em>'.
	 * @generated
	 */
	QSetDescriptorStatement createSetDescriptorStatement();

	/**
	 * Returns a new object of class '<em>Set Transaction Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Transaction Statement</em>'.
	 * @generated
	 */
	QSetTransactionStatement createSetTransactionStatement();

	/**
	 * Returns a new object of class '<em>Set Option Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Option Statement</em>'.
	 * @generated
	 */
	QSetOptionStatement createSetOptionStatement();

	/**
	 * Returns a new object of class '<em>Open Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Statement</em>'.
	 * @generated
	 */
	QOpenStatement createOpenStatement();

	/**
	 * Returns a new object of class '<em>Prepare Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prepare Statement</em>'.
	 * @generated
	 */
	QPrepareStatement createPrepareStatement();

	/**
	 * Returns a new object of class '<em>Close Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Close Statement</em>'.
	 * @generated
	 */
	QCloseStatement createCloseStatement();

	/**
	 * Returns a new object of class '<em>Condition Info Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Info Clause</em>'.
	 * @generated
	 */
	QConditionInfoClause createConditionInfoClause();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	QOption createOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QDatabaseSyntaxDBLPackage getDatabaseSyntaxDBLPackage();

} //QDatabaseSyntaxDBLFactory
