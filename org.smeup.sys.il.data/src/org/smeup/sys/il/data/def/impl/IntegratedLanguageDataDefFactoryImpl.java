/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.QStroller;
import org.smeup.sys.il.data.def.*;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.data.def.DecimalType;
import org.smeup.sys.il.data.def.FloatingType;
import org.smeup.sys.il.data.def.QAdapterDef;
import org.smeup.sys.il.data.def.QArrayDef;
import org.smeup.sys.il.data.def.QBinaryDef;
import org.smeup.sys.il.data.def.QBufferDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QDataStructDef;
import org.smeup.sys.il.data.def.QDatetimeDef;
import org.smeup.sys.il.data.def.QDecimalDef;
import org.smeup.sys.il.data.def.QFloatingDef;
import org.smeup.sys.il.data.def.QHexadecimalDef;
import org.smeup.sys.il.data.def.QIdentityDef;
import org.smeup.sys.il.data.def.QIndicatorDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.il.data.def.QListDef;
import org.smeup.sys.il.data.def.QNumericDef;
import org.smeup.sys.il.data.def.QPointerDef;
import org.smeup.sys.il.data.def.QScrollerDef;
import org.smeup.sys.il.data.def.QStringDef;
import org.smeup.sys.il.data.def.QStrollerDef;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class IntegratedLanguageDataDefFactoryImpl extends EFactoryImpl implements QIntegratedLanguageDataDefFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static QIntegratedLanguageDataDefFactory init() {
		try {
			QIntegratedLanguageDataDefFactory theIntegratedLanguageDataDefFactory = (QIntegratedLanguageDataDefFactory)EPackage.Registry.INSTANCE.getEFactory(QIntegratedLanguageDataDefPackage.eNS_URI);
			if (theIntegratedLanguageDataDefFactory != null) {
				return theIntegratedLanguageDataDefFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegratedLanguageDataDefFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public IntegratedLanguageDataDefFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QIntegratedLanguageDataDefPackage.ADAPTER_DEF: return (EObject)createAdapterDef();
			case QIntegratedLanguageDataDefPackage.ARRAY_DEF: return (EObject)createArrayDef();
			case QIntegratedLanguageDataDefPackage.BINARY_DEF: return (EObject)createBinaryDef();
			case QIntegratedLanguageDataDefPackage.BUFFER_DEF: return (EObject)createBufferDef();
			case QIntegratedLanguageDataDefPackage.CHARACTER_DEF: return (EObject)createCharacterDef();
			case QIntegratedLanguageDataDefPackage.DATA_STRUCT_DEF: return (EObject)createDataStructDef();
			case QIntegratedLanguageDataDefPackage.DATETIME_DEF: return (EObject)createDatetimeDef();
			case QIntegratedLanguageDataDefPackage.DECIMAL_DEF: return (EObject)createDecimalDef();
			case QIntegratedLanguageDataDefPackage.FLOATING_DEF: return (EObject)createFloatingDef();
			case QIntegratedLanguageDataDefPackage.HEXADECIMAL_DEF: return (EObject)createHexadecimalDef();
			case QIntegratedLanguageDataDefPackage.IDENTITY_DEF: return (EObject)createIdentityDef();
			case QIntegratedLanguageDataDefPackage.INDICATOR_DEF: return (EObject)createIndicatorDef();
			case QIntegratedLanguageDataDefPackage.LIST_DEF: return (EObject)createListDef();
			case QIntegratedLanguageDataDefPackage.NUMERIC_DEF: return (EObject)createNumericDef();
			case QIntegratedLanguageDataDefPackage.POINTER_DEF: return (EObject)createPointerDef();
			case QIntegratedLanguageDataDefPackage.SCROLLER_DEF: return (EObject)createScrollerDef();
			case QIntegratedLanguageDataDefPackage.STRING_DEF: return (EObject)createStringDef();
			case QIntegratedLanguageDataDefPackage.STROLLER_DEF: return (EObject)createStrollerDef();
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
			case QIntegratedLanguageDataDefPackage.BINARY_TYPE:
				return createBinaryTypeFromString(eDataType, initialValue);
			case QIntegratedLanguageDataDefPackage.DATA_DEF_TYPE:
				return createDataDefTypeFromString(eDataType, initialValue);
			case QIntegratedLanguageDataDefPackage.DATETIME_TYPE:
				return createDatetimeTypeFromString(eDataType, initialValue);
			case QIntegratedLanguageDataDefPackage.DATE_FORMAT:
				return createDateFormatFromString(eDataType, initialValue);
			case QIntegratedLanguageDataDefPackage.DECIMAL_TYPE:
				return createDecimalTypeFromString(eDataType, initialValue);
			case QIntegratedLanguageDataDefPackage.FLOATING_TYPE:
				return createFloatingTypeFromString(eDataType, initialValue);
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
			case QIntegratedLanguageDataDefPackage.BINARY_TYPE:
				return convertBinaryTypeToString(eDataType, instanceValue);
			case QIntegratedLanguageDataDefPackage.DATA_DEF_TYPE:
				return convertDataDefTypeToString(eDataType, instanceValue);
			case QIntegratedLanguageDataDefPackage.DATETIME_TYPE:
				return convertDatetimeTypeToString(eDataType, instanceValue);
			case QIntegratedLanguageDataDefPackage.DATE_FORMAT:
				return convertDateFormatToString(eDataType, instanceValue);
			case QIntegratedLanguageDataDefPackage.DECIMAL_TYPE:
				return convertDecimalTypeToString(eDataType, instanceValue);
			case QIntegratedLanguageDataDefPackage.FLOATING_TYPE:
				return convertFloatingTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QAdapterDef createAdapterDef() {
		AdapterDefImpl adapterDef = new AdapterDefImpl();
		return adapterDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <D extends QArray<?>> QArrayDef<D> createArrayDef() {
		ArrayDefImpl<D> arrayDef = new ArrayDefImpl<D>();
		return arrayDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QBinaryDef createBinaryDef() {
		BinaryDefImpl binaryDef = new BinaryDefImpl();
		return binaryDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QBufferDef createBufferDef() {
		BufferDefImpl bufferDef = new BufferDefImpl();
		return bufferDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QCharacterDef createCharacterDef() {
		CharacterDefImpl characterDef = new CharacterDefImpl();
		return characterDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDataStructDef createDataStructDef() {
		DataStructDefImpl dataStructDef = new DataStructDefImpl();
		return dataStructDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDatetimeDef createDatetimeDef() {
		DatetimeDefImpl datetimeDef = new DatetimeDefImpl();
		return datetimeDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QDecimalDef createDecimalDef() {
		DecimalDefImpl decimalDef = new DecimalDefImpl();
		return decimalDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QFloatingDef createFloatingDef() {
		FloatingDefImpl floatingDef = new FloatingDefImpl();
		return floatingDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QHexadecimalDef createHexadecimalDef() {
		HexadecimalDefImpl hexadecimalDef = new HexadecimalDefImpl();
		return hexadecimalDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIdentityDef createIdentityDef() {
		IdentityDefImpl identityDef = new IdentityDefImpl();
		return identityDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIndicatorDef createIndicatorDef() {
		IndicatorDefImpl indicatorDef = new IndicatorDefImpl();
		return indicatorDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <D extends QList<?>> QListDef<D> createListDef() {
		ListDefImpl<D> listDef = new ListDefImpl<D>();
		return listDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QNumericDef createNumericDef() {
		NumericDefImpl numericDef = new NumericDefImpl();
		return numericDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QPointerDef createPointerDef() {
		PointerDefImpl pointerDef = new PointerDefImpl();
		return pointerDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <D extends QScroller<QBufferedData>> QScrollerDef<D> createScrollerDef() {
		ScrollerDefImpl<D> scrollerDef = new ScrollerDefImpl<D>();
		return scrollerDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QStringDef createStringDef() {
		StringDefImpl stringDef = new StringDefImpl();
		return stringDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <D extends QStroller<?>> QStrollerDef<D> createStrollerDef() {
		StrollerDefImpl<D> strollerDef = new StrollerDefImpl<D>();
		return strollerDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryType createBinaryTypeFromString(EDataType eDataType, String initialValue) {
		BinaryType result = BinaryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataDefType createDataDefTypeFromString(EDataType eDataType, String initialValue) {
		DataDefType result = DataDefType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataDefTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DatetimeType createDatetimeTypeFromString(EDataType eDataType, String initialValue) {
		DatetimeType result = DatetimeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatetimeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DateFormat createDateFormatFromString(EDataType eDataType, String initialValue) {
		DateFormat result = DateFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalType createDecimalTypeFromString(EDataType eDataType, String initialValue) {
		DecimalType result = DecimalType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingType createFloatingTypeFromString(EDataType eDataType, String initialValue) {
		FloatingType result = FloatingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIntegratedLanguageDataDefPackage getIntegratedLanguageDataDefPackage() {
		return (QIntegratedLanguageDataDefPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QIntegratedLanguageDataDefPackage getPackage() {
		return QIntegratedLanguageDataDefPackage.eINSTANCE;
	}

} // IntegratedLanguageDataDefFactoryImpl
