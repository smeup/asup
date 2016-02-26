/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.esql.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.db.esql.*;
import org.smeup.sys.il.data.QBufferedData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegratedLanguageEmbeddedSQLFactoryImpl extends EFactoryImpl implements QIntegratedLanguageEmbeddedSQLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QIntegratedLanguageEmbeddedSQLFactory init() {
		try {
			QIntegratedLanguageEmbeddedSQLFactory theIntegratedLanguageEmbeddedSQLFactory = (QIntegratedLanguageEmbeddedSQLFactory)EPackage.Registry.INSTANCE.getEFactory(QIntegratedLanguageEmbeddedSQLPackage.eNS_URI);
			if (theIntegratedLanguageEmbeddedSQLFactory != null) {
				return theIntegratedLanguageEmbeddedSQLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageEmbeddedSQLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegratedLanguageEmbeddedSQLFactoryImpl() {
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
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TERM: return (EObject)createCursorTerm();
			case QIntegratedLanguageEmbeddedSQLPackage.STATEMENT_TERM: return (EObject)createStatementTerm();
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
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TYPE:
				return createCursorTypeFromString(eDataType, initialValue);
			case QIntegratedLanguageEmbeddedSQLPackage.FETCH_POSITIONING:
				return createFetchPositioningFromString(eDataType, initialValue);
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_RECORD:
				return createCursorRecordFromString(eDataType, initialValue);
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
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_TYPE:
				return convertCursorTypeToString(eDataType, instanceValue);
			case QIntegratedLanguageEmbeddedSQLPackage.FETCH_POSITIONING:
				return convertFetchPositioningToString(eDataType, instanceValue);
			case QIntegratedLanguageEmbeddedSQLPackage.CURSOR_RECORD:
				return convertCursorRecordToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QCursorTerm createCursorTerm() {
		CursorTermImpl cursorTerm = new CursorTermImpl();
		return cursorTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QStatementTerm createStatementTerm() {
		StatementTermImpl statementTerm = new StatementTermImpl();
		return statementTerm;
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
	public FetchPositioning createFetchPositioningFromString(EDataType eDataType, String initialValue) {
		FetchPositioning result = FetchPositioning.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFetchPositioningToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QBufferedData[] createCursorRecordFromString(EDataType eDataType, String initialValue) {
		return (QBufferedData[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCursorRecordToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIntegratedLanguageEmbeddedSQLPackage getIntegratedLanguageEmbeddedSQLPackage() {
		return (QIntegratedLanguageEmbeddedSQLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageEmbeddedSQLPackage getPackage() {
		return QIntegratedLanguageEmbeddedSQLPackage.eINSTANCE;
	}

} //IntegratedLanguageEmbeddedSQLFactoryImpl
