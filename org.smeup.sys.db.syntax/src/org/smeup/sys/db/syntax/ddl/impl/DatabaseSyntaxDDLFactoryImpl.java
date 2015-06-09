/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.ddl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.db.syntax.ddl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseSyntaxDDLFactoryImpl extends EFactoryImpl implements QDatabaseSyntaxDDLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QDatabaseSyntaxDDLFactory init() {
		try {
			QDatabaseSyntaxDDLFactory theDatabaseSyntaxDDLFactory = (QDatabaseSyntaxDDLFactory)EPackage.Registry.INSTANCE.getEFactory(QDatabaseSyntaxDDLPackage.eNS_URI);
			if (theDatabaseSyntaxDDLFactory != null) {
				return theDatabaseSyntaxDDLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatabaseSyntaxDDLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSyntaxDDLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QDatabaseSyntaxDDLPackage.CALL_STATEMENT: return (EObject)createCallStatement();
			case QDatabaseSyntaxDDLPackage.COMMIT_STATEMENT: return (EObject)createCommitStatement();
			case QDatabaseSyntaxDDLPackage.CONNECT_STATEMENT: return (EObject)createConnectStatement();
			case QDatabaseSyntaxDDLPackage.CREATE_ALIAS_STATEMENT: return (EObject)createCreateAliasStatement();
			case QDatabaseSyntaxDDLPackage.CREATE_INDEX_STATEMENT: return (EObject)createCreateIndexStatement();
			case QDatabaseSyntaxDDLPackage.CREATE_TABLE_STATEMENT: return (EObject)createCreateTableStatement();
			case QDatabaseSyntaxDDLPackage.CREATE_VIEW_STATEMENT: return (EObject)createCreateViewStatement();
			case QDatabaseSyntaxDDLPackage.DISCONNECT_STATEMENT: return (EObject)createDisconnectStatement();
			case QDatabaseSyntaxDDLPackage.DROP_STATEMENT: return (EObject)createDropStatement();
			case QDatabaseSyntaxDDLPackage.LOCK_TABLE_STATEMENT: return (EObject)createLockTableStatement();
			case QDatabaseSyntaxDDLPackage.RELEASE_STATEMENT: return (EObject)createReleaseStatement();
			case QDatabaseSyntaxDDLPackage.RENAME_STATEMENT: return (EObject)createRenameStatement();
			case QDatabaseSyntaxDDLPackage.ROLLBACK_STATEMENT: return (EObject)createRollbackStatement();
			case QDatabaseSyntaxDDLPackage.SET_CONNECTION_STATEMENT: return (EObject)createSetConnectionStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QDatabaseSyntaxDDLPackage.DROP_RANGE:
				return createDropRangeFromString(eDataType, initialValue);
			case QDatabaseSyntaxDDLPackage.TARGET_ELEMENT:
				return createTargetElementFromString(eDataType, initialValue);
			case QDatabaseSyntaxDDLPackage.SHARE_MODE:
				return createShareModeFromString(eDataType, initialValue);
			case QDatabaseSyntaxDDLPackage.TARGET_ITEM:
				return createTargetItemFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QDatabaseSyntaxDDLPackage.DROP_RANGE:
				return convertDropRangeToString(eDataType, instanceValue);
			case QDatabaseSyntaxDDLPackage.TARGET_ELEMENT:
				return convertTargetElementToString(eDataType, instanceValue);
			case QDatabaseSyntaxDDLPackage.SHARE_MODE:
				return convertShareModeToString(eDataType, instanceValue);
			case QDatabaseSyntaxDDLPackage.TARGET_ITEM:
				return convertTargetItemToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCallStatement createCallStatement() {
		CallStatementImpl callStatement = new CallStatementImpl();
		return callStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCommitStatement createCommitStatement() {
		CommitStatementImpl commitStatement = new CommitStatementImpl();
		return commitStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConnectStatement createConnectStatement() {
		ConnectStatementImpl connectStatement = new ConnectStatementImpl();
		return connectStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCreateAliasStatement createCreateAliasStatement() {
		CreateAliasStatementImpl createAliasStatement = new CreateAliasStatementImpl();
		return createAliasStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCreateIndexStatement createCreateIndexStatement() {
		CreateIndexStatementImpl createIndexStatement = new CreateIndexStatementImpl();
		return createIndexStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCreateTableStatement createCreateTableStatement() {
		CreateTableStatementImpl createTableStatement = new CreateTableStatementImpl();
		return createTableStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCreateViewStatement createCreateViewStatement() {
		CreateViewStatementImpl createViewStatement = new CreateViewStatementImpl();
		return createViewStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDisconnectStatement createDisconnectStatement() {
		DisconnectStatementImpl disconnectStatement = new DisconnectStatementImpl();
		return disconnectStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDropStatement createDropStatement() {
		DropStatementImpl dropStatement = new DropStatementImpl();
		return dropStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QLockTableStatement createLockTableStatement() {
		LockTableStatementImpl lockTableStatement = new LockTableStatementImpl();
		return lockTableStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QReleaseStatement createReleaseStatement() {
		ReleaseStatementImpl releaseStatement = new ReleaseStatementImpl();
		return releaseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRenameStatement createRenameStatement() {
		RenameStatementImpl renameStatement = new RenameStatementImpl();
		return renameStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRollbackStatement createRollbackStatement() {
		RollbackStatementImpl rollbackStatement = new RollbackStatementImpl();
		return rollbackStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSetConnectionStatement createSetConnectionStatement() {
		SetConnectionStatementImpl setConnectionStatement = new SetConnectionStatementImpl();
		return setConnectionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropRange createDropRangeFromString(EDataType eDataType, String initialValue) {
		DropRange result = DropRange.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDropRangeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElement createTargetElementFromString(EDataType eDataType, String initialValue) {
		TargetElement result = TargetElement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetElementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareMode createShareModeFromString(EDataType eDataType, String initialValue) {
		ShareMode result = ShareMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShareModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetItem createTargetItemFromString(EDataType eDataType, String initialValue) {
		TargetItem result = TargetItem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetItemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseSyntaxDDLPackage getDatabaseSyntaxDDLPackage() {
		return (QDatabaseSyntaxDDLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QDatabaseSyntaxDDLPackage getPackage() {
		return QDatabaseSyntaxDDLPackage.eINSTANCE;
	}

} //DatabaseSyntaxDDLFactoryImpl
