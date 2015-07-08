/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.il.esam.AccessMode;
import org.smeup.sys.il.esam.OperationDirection;
import org.smeup.sys.il.esam.OperationRead;
import org.smeup.sys.il.esam.OperationSet;
import org.smeup.sys.il.esam.QDataSetTerm;
import org.smeup.sys.il.esam.QDisplayTerm;
import org.smeup.sys.il.esam.QIntegratedLanguageEsamFactory;
import org.smeup.sys.il.esam.QIntegratedLanguageEsamPackage;
import org.smeup.sys.il.esam.QKeyListTerm;
import org.smeup.sys.il.esam.QPrintTerm;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class IntegratedLanguageEsamFactoryImpl extends EFactoryImpl implements QIntegratedLanguageEsamFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static QIntegratedLanguageEsamFactory init() {
		try {
			QIntegratedLanguageEsamFactory theIntegratedLanguageEsamFactory = (QIntegratedLanguageEsamFactory) EPackage.Registry.INSTANCE.getEFactory(QIntegratedLanguageEsamPackage.eNS_URI);
			if (theIntegratedLanguageEsamFactory != null)
				return theIntegratedLanguageEsamFactory;
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageEsamFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public IntegratedLanguageEsamFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case QIntegratedLanguageEsamPackage.DATA_SET_TERM:
			return (EObject) createDataSetTerm();
		case QIntegratedLanguageEsamPackage.DISPLAY_TERM:
			return (EObject) createDisplayTerm();
		case QIntegratedLanguageEsamPackage.KEY_LIST_TERM:
			return (EObject) createKeyListTerm();
		case QIntegratedLanguageEsamPackage.PRINT_TERM:
			return (EObject) createPrintTerm();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case QIntegratedLanguageEsamPackage.ACCESS_MODE:
			return createAccessModeFromString(eDataType, initialValue);
		case QIntegratedLanguageEsamPackage.OPERATION_DIRECTION:
			return createOperationDirectionFromString(eDataType, initialValue);
		case QIntegratedLanguageEsamPackage.OPERATION_SET:
			return createOperationSetFromString(eDataType, initialValue);
		case QIntegratedLanguageEsamPackage.OPERATION_READ:
			return createOperationReadFromString(eDataType, initialValue);
		case QIntegratedLanguageEsamPackage.KEY_LIST:
			return createKeyListFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case QIntegratedLanguageEsamPackage.ACCESS_MODE:
			return convertAccessModeToString(eDataType, instanceValue);
		case QIntegratedLanguageEsamPackage.OPERATION_DIRECTION:
			return convertOperationDirectionToString(eDataType, instanceValue);
		case QIntegratedLanguageEsamPackage.OPERATION_SET:
			return convertOperationSetToString(eDataType, instanceValue);
		case QIntegratedLanguageEsamPackage.OPERATION_READ:
			return convertOperationReadToString(eDataType, instanceValue);
		case QIntegratedLanguageEsamPackage.KEY_LIST:
			return convertKeyListToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QDataSetTerm createDataSetTerm() {
		DataSetTermImpl dataSetTerm = new DataSetTermImpl();
		return dataSetTerm;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QDisplayTerm createDisplayTerm() {
		DisplayTermImpl displayTerm = new DisplayTermImpl();
		return displayTerm;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QKeyListTerm createKeyListTerm() {
		KeyListTermImpl keyListTerm = new KeyListTermImpl();
		return keyListTerm;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QPrintTerm createPrintTerm() {
		PrintTermImpl printTerm = new PrintTermImpl();
		return printTerm;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AccessMode createAccessModeFromString(EDataType eDataType, String initialValue) {
		AccessMode result = AccessMode.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertAccessModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationDirection createOperationDirectionFromString(EDataType eDataType, String initialValue) {
		OperationDirection result = OperationDirection.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertOperationDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationSet createOperationSetFromString(EDataType eDataType, String initialValue) {
		OperationSet result = OperationSet.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertOperationSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationRead createOperationReadFromString(EDataType eDataType, String initialValue) {
		OperationRead result = OperationRead.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertOperationReadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object[] createKeyListFromString(EDataType eDataType, String initialValue) {
		return (Object[]) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertKeyListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public QIntegratedLanguageEsamPackage getIntegratedLanguageEsamPackage() {
		return (QIntegratedLanguageEsamPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageEsamPackage getPackage() {
		return QIntegratedLanguageEsamPackage.eINSTANCE;
	}

} // IntegratedLanguageEsamFactoryImpl
