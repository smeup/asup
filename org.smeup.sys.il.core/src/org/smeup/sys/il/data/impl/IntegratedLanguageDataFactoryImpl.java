/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.il.data.BufferedDataType;
import org.smeup.sys.il.data.BufferedElementType;
import org.smeup.sys.il.data.DataComparator;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.DatetimeFormat;
import org.smeup.sys.il.data.InitStrategy;
import org.smeup.sys.il.data.InjectionStrategyType;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDataManagerConfig;
import org.smeup.sys.il.data.QDataReader;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.SortDirection;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class IntegratedLanguageDataFactoryImpl extends EFactoryImpl implements QIntegratedLanguageDataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QIntegratedLanguageDataFactory init() {
		try {
			QIntegratedLanguageDataFactory theIntegratedLanguageDataFactory = (QIntegratedLanguageDataFactory)EPackage.Registry.INSTANCE.getEFactory(QIntegratedLanguageDataPackage.eNS_URI);
			if (theIntegratedLanguageDataFactory != null) {
				return theIntegratedLanguageDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageDataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public IntegratedLanguageDataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QIntegratedLanguageDataPackage.DATA_FILLER: return (EObject)createDataFiller();
			case QIntegratedLanguageDataPackage.DATA_MANAGER_CONFIG: return (EObject)createDataManagerConfig();
			case QIntegratedLanguageDataPackage.DATA_READER: return (EObject)createDataReader();
			case QIntegratedLanguageDataPackage.DATA_WRITER: return (EObject)createDataWriter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QIntegratedLanguageDataPackage.BUFFERED_DATA_TYPE:
				return createBufferedDataTypeFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.BUFFERED_ELEMENT_TYPE:
				return createBufferedElementTypeFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.DATA_COMPARATOR:
				return createDataComparatorFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.DATA_SPECIAL:
				return createDataSpecialFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.DATETIME_FORMAT:
				return createDatetimeFormatFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.INIT_STRATEGY:
				return createInitStrategyFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.INJECTION_STRATEGY_TYPE:
				return createInjectionStrategyTypeFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.SORT_DIRECTION:
				return createSortDirectionFromString(eDataType, initialValue);
			case QIntegratedLanguageDataPackage.DATA_ARRAY:
				return createDataArrayFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QIntegratedLanguageDataPackage.BUFFERED_DATA_TYPE:
				return convertBufferedDataTypeToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.BUFFERED_ELEMENT_TYPE:
				return convertBufferedElementTypeToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.DATA_COMPARATOR:
				return convertDataComparatorToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.DATA_SPECIAL:
				return convertDataSpecialToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.DATETIME_FORMAT:
				return convertDatetimeFormatToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.INIT_STRATEGY:
				return convertInitStrategyToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.INJECTION_STRATEGY_TYPE:
				return convertInjectionStrategyTypeToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.SORT_DIRECTION:
				return convertSortDirectionToString(eDataType, instanceValue);
			case QIntegratedLanguageDataPackage.DATA_ARRAY:
				return convertDataArrayToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDataFiller createDataFiller() {
		DataFillerImpl dataFiller = new DataFillerImpl();
		return dataFiller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDataReader createDataReader() {
		DataReaderImpl dataReader = new DataReaderImpl();
		return dataReader;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDataWriter createDataWriter() {
		DataWriterImpl dataWriter = new DataWriterImpl();
		return dataWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QDataManagerConfig createDataManagerConfig() {
		DataManagerConfigImpl dataManagerConfig = new DataManagerConfigImpl();
		return dataManagerConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferedDataType createBufferedDataTypeFromString(EDataType eDataType, String initialValue) {
		BufferedDataType result = BufferedDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBufferedDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferedElementType createBufferedElementTypeFromString(EDataType eDataType, String initialValue) {
		BufferedElementType result = BufferedElementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBufferedElementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataComparator createDataComparatorFromString(EDataType eDataType, String initialValue) {
		DataComparator result = DataComparator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataComparatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSpecial createDataSpecialFromString(EDataType eDataType, String initialValue) {
		DataSpecial result = DataSpecial.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSpecialToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatetimeFormat createDatetimeFormatFromString(EDataType eDataType, String initialValue) {
		DatetimeFormat result = DatetimeFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatetimeFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitStrategy createInitStrategyFromString(EDataType eDataType, String initialValue) {
		InitStrategy result = InitStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirection createSortDirectionFromString(EDataType eDataType, String initialValue) {
		SortDirection result = SortDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjectionStrategyType createInjectionStrategyTypeFromString(EDataType eDataType, String initialValue) {
		InjectionStrategyType result = InjectionStrategyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInjectionStrategyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Object[] createDataArrayFromString(EDataType eDataType, String initialValue) {
		return (Object[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIntegratedLanguageDataPackage getIntegratedLanguageDataPackage() {
		return (QIntegratedLanguageDataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageDataPackage getPackage() {
		return QIntegratedLanguageDataPackage.eINSTANCE;
	}

} // IntegratedLanguageDataFactoryImpl
