/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.syntax.dbl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.db.syntax.dbl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseSyntaxDBLFactoryImpl extends EFactoryImpl implements QDatabaseSyntaxDBLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QDatabaseSyntaxDBLFactory init() {
		try {
			QDatabaseSyntaxDBLFactory theDatabaseSyntaxDBLFactory = (QDatabaseSyntaxDBLFactory)EPackage.Registry.INSTANCE.getEFactory(QDatabaseSyntaxDBLPackage.eNS_URI);
			if (theDatabaseSyntaxDBLFactory != null) {
				return theDatabaseSyntaxDBLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatabaseSyntaxDBLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseSyntaxDBLFactoryImpl() {
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
			case QDatabaseSyntaxDBLPackage.ALLOCATE_DESCRIPTOR_STATEMENT: return (EObject)createAllocateDescriptorStatement();
			case QDatabaseSyntaxDBLPackage.CLOSE_STATEMENT: return (EObject)createCloseStatement();
			case QDatabaseSyntaxDBLPackage.CONDITION_INFO_CLAUSE: return (EObject)createConditionInfoClause();
			case QDatabaseSyntaxDBLPackage.DEALLOCATE_DESCRIPTOR_STATEMENT: return (EObject)createDeallocateDescriptorStatement();
			case QDatabaseSyntaxDBLPackage.DECLARE_CURSOR_STATEMENT: return (EObject)createDeclareCursorStatement();
			case QDatabaseSyntaxDBLPackage.DECLARE_STATEMENT_STATEMENT: return (EObject)createDeclareStatementStatement();
			case QDatabaseSyntaxDBLPackage.DESCRIBE_STATEMENT: return (EObject)createDescribeStatement();
			case QDatabaseSyntaxDBLPackage.EXECUTE_IMMEDIATE_STATEMENT: return (EObject)createExecuteImmediateStatement();
			case QDatabaseSyntaxDBLPackage.EXECUTE_STATEMENT: return (EObject)createExecuteStatement();
			case QDatabaseSyntaxDBLPackage.FETCH_STATEMENT: return (EObject)createFetchStatement();
			case QDatabaseSyntaxDBLPackage.GET_DESCRIPTOR_STATEMENT: return (EObject)createGetDescriptorStatement();
			case QDatabaseSyntaxDBLPackage.GET_DIAGNOSTICS_STATEMENT: return (EObject)createGetDiagnosticsStatement();
			case QDatabaseSyntaxDBLPackage.INTO: return (EObject)createInto();
			case QDatabaseSyntaxDBLPackage.MULTIPLE_ROW_FETCH_CLAUSE: return (EObject)createMultipleRowFetchClause();
			case QDatabaseSyntaxDBLPackage.OPEN_STATEMENT: return (EObject)createOpenStatement();
			case QDatabaseSyntaxDBLPackage.OPTION: return (EObject)createOption();
			case QDatabaseSyntaxDBLPackage.PREPARE_STATEMENT: return (EObject)createPrepareStatement();
			case QDatabaseSyntaxDBLPackage.SET_DESCRIPTOR_STATEMENT: return (EObject)createSetDescriptorStatement();
			case QDatabaseSyntaxDBLPackage.SET_OPTION_STATEMENT: return (EObject)createSetOptionStatement();
			case QDatabaseSyntaxDBLPackage.SET_TRANSACTION_STATEMENT: return (EObject)createSetTransactionStatement();
			case QDatabaseSyntaxDBLPackage.SINGLE_ROW_FETCH_CLAUSE: return (EObject)createSingleRowFetchClause();
			case QDatabaseSyntaxDBLPackage.USING: return (EObject)createUsing();
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
			case QDatabaseSyntaxDBLPackage.CURSOR_TYPE:
				return createCursorTypeFromString(eDataType, initialValue);
			case QDatabaseSyntaxDBLPackage.DESCRIPTOR_SCOPE:
				return createDescriptorScopeFromString(eDataType, initialValue);
			case QDatabaseSyntaxDBLPackage.FETCH_POSITION:
				return createFetchPositionFromString(eDataType, initialValue);
			case QDatabaseSyntaxDBLPackage.ISOLATION_LEVEL:
				return createIsolationLevelFromString(eDataType, initialValue);
			case QDatabaseSyntaxDBLPackage.OPEN_USING_TYPE:
				return createOpenUsingTypeFromString(eDataType, initialValue);
			case QDatabaseSyntaxDBLPackage.RW_OPERATION:
				return createRWOperationFromString(eDataType, initialValue);
			case QDatabaseSyntaxDBLPackage.USING_TYPE:
				return createUsingTypeFromString(eDataType, initialValue);
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
			case QDatabaseSyntaxDBLPackage.CURSOR_TYPE:
				return convertCursorTypeToString(eDataType, instanceValue);
			case QDatabaseSyntaxDBLPackage.DESCRIPTOR_SCOPE:
				return convertDescriptorScopeToString(eDataType, instanceValue);
			case QDatabaseSyntaxDBLPackage.FETCH_POSITION:
				return convertFetchPositionToString(eDataType, instanceValue);
			case QDatabaseSyntaxDBLPackage.ISOLATION_LEVEL:
				return convertIsolationLevelToString(eDataType, instanceValue);
			case QDatabaseSyntaxDBLPackage.OPEN_USING_TYPE:
				return convertOpenUsingTypeToString(eDataType, instanceValue);
			case QDatabaseSyntaxDBLPackage.RW_OPERATION:
				return convertRWOperationToString(eDataType, instanceValue);
			case QDatabaseSyntaxDBLPackage.USING_TYPE:
				return convertUsingTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAllocateDescriptorStatement createAllocateDescriptorStatement() {
		AllocateDescriptorStatementImpl allocateDescriptorStatement = new AllocateDescriptorStatementImpl();
		return allocateDescriptorStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDeallocateDescriptorStatement createDeallocateDescriptorStatement() {
		DeallocateDescriptorStatementImpl deallocateDescriptorStatement = new DeallocateDescriptorStatementImpl();
		return deallocateDescriptorStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDeclareCursorStatement createDeclareCursorStatement() {
		DeclareCursorStatementImpl declareCursorStatement = new DeclareCursorStatementImpl();
		return declareCursorStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDeclareStatementStatement createDeclareStatementStatement() {
		DeclareStatementStatementImpl declareStatementStatement = new DeclareStatementStatementImpl();
		return declareStatementStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDescribeStatement createDescribeStatement() {
		DescribeStatementImpl describeStatement = new DescribeStatementImpl();
		return describeStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QExecuteImmediateStatement createExecuteImmediateStatement() {
		ExecuteImmediateStatementImpl executeImmediateStatement = new ExecuteImmediateStatementImpl();
		return executeImmediateStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QExecuteStatement createExecuteStatement() {
		ExecuteStatementImpl executeStatement = new ExecuteStatementImpl();
		return executeStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFetchStatement createFetchStatement() {
		FetchStatementImpl fetchStatement = new FetchStatementImpl();
		return fetchStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QGetDescriptorStatement createGetDescriptorStatement() {
		GetDescriptorStatementImpl getDescriptorStatement = new GetDescriptorStatementImpl();
		return getDescriptorStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QGetDiagnosticsStatement createGetDiagnosticsStatement() {
		GetDiagnosticsStatementImpl getDiagnosticsStatement = new GetDiagnosticsStatementImpl();
		return getDiagnosticsStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QInto createInto() {
		IntoImpl into = new IntoImpl();
		return into;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSingleRowFetchClause createSingleRowFetchClause() {
		SingleRowFetchClauseImpl singleRowFetchClause = new SingleRowFetchClauseImpl();
		return singleRowFetchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QUsing createUsing() {
		UsingImpl using = new UsingImpl();
		return using;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMultipleRowFetchClause createMultipleRowFetchClause() {
		MultipleRowFetchClauseImpl multipleRowFetchClause = new MultipleRowFetchClauseImpl();
		return multipleRowFetchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSetDescriptorStatement createSetDescriptorStatement() {
		SetDescriptorStatementImpl setDescriptorStatement = new SetDescriptorStatementImpl();
		return setDescriptorStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSetTransactionStatement createSetTransactionStatement() {
		SetTransactionStatementImpl setTransactionStatement = new SetTransactionStatementImpl();
		return setTransactionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSetOptionStatement createSetOptionStatement() {
		SetOptionStatementImpl setOptionStatement = new SetOptionStatementImpl();
		return setOptionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOpenStatement createOpenStatement() {
		OpenStatementImpl openStatement = new OpenStatementImpl();
		return openStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QPrepareStatement createPrepareStatement() {
		PrepareStatementImpl prepareStatement = new PrepareStatementImpl();
		return prepareStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCloseStatement createCloseStatement() {
		CloseStatementImpl closeStatement = new CloseStatementImpl();
		return closeStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConditionInfoClause createConditionInfoClause() {
		ConditionInfoClauseImpl conditionInfoClause = new ConditionInfoClauseImpl();
		return conditionInfoClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOption createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CursorType createCursorTypeFromString(EDataType eDataType, String initialValue) {
		CursorType result = CursorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCursorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptorScope createDescriptorScopeFromString(EDataType eDataType, String initialValue) {
		DescriptorScope result = DescriptorScope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptorScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetchPosition createFetchPositionFromString(EDataType eDataType, String initialValue) {
		FetchPosition result = FetchPosition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFetchPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsolationLevel createIsolationLevelFromString(EDataType eDataType, String initialValue) {
		IsolationLevel result = IsolationLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsolationLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWOperation createRWOperationFromString(EDataType eDataType, String initialValue) {
		RWOperation result = RWOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRWOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenUsingType createOpenUsingTypeFromString(EDataType eDataType, String initialValue) {
		OpenUsingType result = OpenUsingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpenUsingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsingType createUsingTypeFromString(EDataType eDataType, String initialValue) {
		UsingType result = UsingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDatabaseSyntaxDBLPackage getDatabaseSyntaxDBLPackage() {
		return (QDatabaseSyntaxDBLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QDatabaseSyntaxDBLPackage getPackage() {
		return QDatabaseSyntaxDBLPackage.eINSTANCE;
	}

} //DatabaseSyntaxDBLFactoryImpl
