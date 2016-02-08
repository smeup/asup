/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.smeup.sys.db.syntax.ddl.QDatabaseSyntaxDDLPackage
 * @generated
 */
public interface QDatabaseSyntaxDDLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QDatabaseSyntaxDDLFactory eINSTANCE = org.smeup.sys.db.syntax.ddl.impl.DatabaseSyntaxDDLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Call Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Statement</em>'.
	 * @generated
	 */
	QCallStatement createCallStatement();

	/**
	 * Returns a new object of class '<em>Commit Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commit Statement</em>'.
	 * @generated
	 */
	QCommitStatement createCommitStatement();

	/**
	 * Returns a new object of class '<em>Connect Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connect Statement</em>'.
	 * @generated
	 */
	QConnectStatement createConnectStatement();

	/**
	 * Returns a new object of class '<em>Create Alias Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Alias Statement</em>'.
	 * @generated
	 */
	QCreateAliasStatement createCreateAliasStatement();

	/**
	 * Returns a new object of class '<em>Create Index Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Index Statement</em>'.
	 * @generated
	 */
	QCreateIndexStatement createCreateIndexStatement();

	/**
	 * Returns a new object of class '<em>Create Table Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Table Statement</em>'.
	 * @generated
	 */
	QCreateTableStatement createCreateTableStatement();

	/**
	 * Returns a new object of class '<em>Create View Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create View Statement</em>'.
	 * @generated
	 */
	QCreateViewStatement createCreateViewStatement();

	/**
	 * Returns a new object of class '<em>Disconnect Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disconnect Statement</em>'.
	 * @generated
	 */
	QDisconnectStatement createDisconnectStatement();

	/**
	 * Returns a new object of class '<em>Drop Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Statement</em>'.
	 * @generated
	 */
	QDropStatement createDropStatement();

	/**
	 * Returns a new object of class '<em>Lock Table Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lock Table Statement</em>'.
	 * @generated
	 */
	QLockTableStatement createLockTableStatement();

	/**
	 * Returns a new object of class '<em>Release Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release Statement</em>'.
	 * @generated
	 */
	QReleaseStatement createReleaseStatement();

	/**
	 * Returns a new object of class '<em>Rename Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Statement</em>'.
	 * @generated
	 */
	QRenameStatement createRenameStatement();

	/**
	 * Returns a new object of class '<em>Rollback Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rollback Statement</em>'.
	 * @generated
	 */
	QRollbackStatement createRollbackStatement();

	/**
	 * Returns a new object of class '<em>Set Connection Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Connection Statement</em>'.
	 * @generated
	 */
	QSetConnectionStatement createSetConnectionStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QDatabaseSyntaxDDLPackage getDatabaseSyntaxDDLPackage();

} //QDatabaseSyntaxDDLFactory
