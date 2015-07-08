/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageDataPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/data";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "il-data";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	QIntegratedLanguageDataPackage eINSTANCE = org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QData
	 * <em>Data</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QData
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getData()
	 * @generated
	 */
	int DATA = 8;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QBufferedData
	 * <em>Buffered Data</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.QBufferedData
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedData()
	 * @generated
	 */
	int BUFFERED_DATA = 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QNumeric
	 * <em>Numeric</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QNumeric
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getNumeric()
	 * @generated
	 */
	int NUMERIC = 27;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QBinary
	 * <em>Binary</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QBinary
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QBoolean
	 * <em>Boolean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QBoolean
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QString
	 * <em>String</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QString
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getString()
	 * @generated
	 */
	int STRING = 31;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QCharacter
	 * <em>Character</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QCharacter
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 7;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QDataFactory
	 * <em>Data Factory</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.QDataFactory
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataFactory()
	 * @generated
	 */
	int DATA_FACTORY = 11;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QDataManager
	 * <em>Data Manager</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.QDataManager
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataManager()
	 * @generated
	 */
	int DATA_MANAGER = 12;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QDatetime
	 * <em>Datetime</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QDatetime
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDatetime()
	 * @generated
	 */
	int DATETIME = 17;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QDecimal
	 * <em>Decimal</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QDecimal
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDecimal()
	 * @generated
	 */
	int DECIMAL = 18;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QEnum
	 * <em>Enum</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QEnum
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 19;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QFloating
	 * <em>Floating</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QFloating
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getFloating()
	 * @generated
	 */
	int FLOATING = 20;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QGraphic
	 * <em>Graphic</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QGraphic
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getGraphic()
	 * @generated
	 */
	int GRAPHIC = 21;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QHexadecimal
	 * <em>Hexadecimal</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.QHexadecimal
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getHexadecimal()
	 * @generated
	 */
	int HEXADECIMAL = 22;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QIndicator
	 * <em>Indicator</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QIndicator
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getIndicator()
	 * @generated
	 */
	int INDICATOR = 24;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QMoveable
	 * <em>Moveable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QMoveable
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getMoveable()
	 * @generated
	 */
	int MOVEABLE = 26;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QList
	 * <em>List</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QList
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getList()
	 * @generated
	 */
	int LIST = 25;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QArray
	 * <em>Array</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QArray
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QAdapter
	 * <em>Adapter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QAdapter
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getAdapter()
	 * @generated
	 */
	int ADAPTER = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QBufferedList
	 * <em>Buffered List</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.QBufferedList
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedList()
	 * @generated
	 */
	int BUFFERED_LIST = 6;

	/**
	 * The number of structural features of the '<em>Adapter</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ADAPTER_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Buffered List</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BUFFERED_LIST_FEATURE_COUNT = LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = BUFFERED_LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Buffered Data</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numeric</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FEATURE_COUNT = BUFFERED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = NUMERIC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QPointer
	 * <em>Pointer</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QPointer
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getPointer()
	 * @generated
	 */
	int POINTER = 28;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QScroller
	 * <em>Scroller</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QScroller
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getScroller()
	 * @generated
	 */
	int SCROLLER = 30;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QStruct
	 * <em>Struct</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QStruct
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getStruct()
	 * @generated
	 */
	int STRUCT = 33;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QStroller
	 * <em>Stroller</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QStroller
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getStroller()
	 * @generated
	 */
	int STROLLER = 32;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QDataStruct
	 * <em>Data Struct</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.QDataStruct
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataStruct()
	 * @generated
	 */
	int DATA_STRUCT = 14;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QDataDelegator
	 * <em>Data Delegator</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QDataDelegator
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataDelegator()
	 * @generated
	 */
	int DATA_DELEGATOR = 10;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.impl.DataVisitorImpl <em>Data Visitor</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.impl.DataVisitorImpl
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataVisitor()
	 * @generated
	 */
	int DATA_VISITOR = 15;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Delegator</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_DELEGATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.QBufferedDataDelegator
	 * <em>Buffered Data Delegator</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QBufferedDataDelegator
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedDataDelegator()
	 * @generated
	 */
	int BUFFERED_DATA_DELEGATOR = 5;

	/**
	 * The number of structural features of the '
	 * <em>Buffered Data Delegator</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_DELEGATOR_FEATURE_COUNT = DATA_DELEGATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = BUFFERED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Character</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QDataContainer
	 * <em>Data Container</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QDataContainer
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataContainer()
	 * @generated
	 */
	int DATA_CONTAINER = 9;

	/**
	 * The number of structural features of the '<em>Data Container</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_CONTAINER_FEATURE_COUNT = QIntegratedLanguageDataTermPackage.DATA_TERM_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.impl.DataReaderImpl <em>Data Reader</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.impl.DataReaderImpl
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataReader()
	 * @generated
	 */
	int DATA_READER = 13;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.impl.DataWriterImpl <em>Data Writer</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.impl.DataWriterImpl
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataWriter()
	 * @generated
	 */
	int DATA_WRITER = 16;

	/**
	 * The number of structural features of the '<em>Data Factory</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Data Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Data Visitor</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Data Reader</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_READER_FEATURE_COUNT = DATA_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Struct</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_FEATURE_COUNT = CHARACTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Writer</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_WRITER_FEATURE_COUNT = DATA_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datetime</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATETIME_FEATURE_COUNT = BUFFERED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DECIMAL_FEATURE_COUNT = NUMERIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = BUFFERED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Floating</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FLOATING_FEATURE_COUNT = NUMERIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Graphic</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_FEATURE_COUNT = STRING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hexadecimal</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int HEXADECIMAL_FEATURE_COUNT = BUFFERED_DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QIdentity
	 * <em>Identity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QIdentity
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 23;

	/**
	 * The number of structural features of the '<em>Identity</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = BUFFERED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Indicator</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INDICATOR_FEATURE_COUNT = BUFFERED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Moveable</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MOVEABLE_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Pointer</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int POINTER_FEATURE_COUNT = BUFFERED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRUCT_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.QRecord
	 * <em>Record</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.QRecord
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 29;

	/**
	 * The number of structural features of the '<em>Record</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = STRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scroller</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SCROLLER_FEATURE_COUNT = BUFFERED_LIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stroller</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STROLLER_FEATURE_COUNT = SCROLLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Data Array</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataArray()
	 * @generated
	 */
	int DATA_ARRAY = 34;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.QAdapter
	 * <em>Adapter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Adapter</em>'.
	 * @see org.smeup.sys.il.data.QAdapter
	 * @generated
	 */
	EClass getAdapter();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.QArray
	 * <em>Array</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Array</em>'.
	 * @see org.smeup.sys.il.data.QArray
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.QBinary
	 * <em>Binary</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see org.smeup.sys.il.data.QBinary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.QBoolean
	 * <em>Boolean</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see org.smeup.sys.il.data.QBoolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QBufferedData <em>Buffered Data</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Buffered Data</em>'.
	 * @see org.smeup.sys.il.data.QBufferedData
	 * @generated
	 */
	EClass getBufferedData();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QBufferedDataDelegator
	 * <em>Buffered Data Delegator</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for class '<em>Buffered Data Delegator</em>'.
	 * @see org.smeup.sys.il.data.QBufferedDataDelegator
	 * @generated
	 */
	EClass getBufferedDataDelegator();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QBufferedList <em>Buffered List</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Buffered List</em>'.
	 * @see org.smeup.sys.il.data.QBufferedList
	 * @generated
	 */
	EClass getBufferedList();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QCharacter <em>Character</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Character</em>'.
	 * @see org.smeup.sys.il.data.QCharacter
	 * @generated
	 */
	EClass getCharacter();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.QData
	 * <em>Data</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.smeup.sys.il.data.QData
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QDataContainer <em>Data Container</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Data Container</em>'.
	 * @see org.smeup.sys.il.data.QDataContainer
	 * @generated
	 */
	EClass getDataContainer();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QDataDelegator <em>Data Delegator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Data Delegator</em>'.
	 * @see org.smeup.sys.il.data.QDataDelegator
	 * @generated
	 */
	EClass getDataDelegator();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QDataWriter <em>Data Writer</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Data Writer</em>'.
	 * @see org.smeup.sys.il.data.QDataWriter
	 * @generated
	 */
	EClass getDataWriter();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QDataFactory <em>Data Factory</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Data Factory</em>'.
	 * @see org.smeup.sys.il.data.QDataFactory
	 * @generated
	 */
	EClass getDataFactory();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QDataManager <em>Data Manager</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Data Manager</em>'.
	 * @see org.smeup.sys.il.data.QDataManager
	 * @generated
	 */
	EClass getDataManager();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QDataReader <em>Data Reader</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Data Reader</em>'.
	 * @see org.smeup.sys.il.data.QDataReader
	 * @generated
	 */
	EClass getDataReader();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QDataStruct <em>Data Struct</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Data Struct</em>'.
	 * @see org.smeup.sys.il.data.QDataStruct
	 * @generated
	 */
	EClass getDataStruct();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QDataVisitor <em>Data Visitor</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Data Visitor</em>'.
	 * @see org.smeup.sys.il.data.QDataVisitor
	 * @generated
	 */
	EClass getDataVisitor();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QDatetime <em>Datetime</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Datetime</em>'.
	 * @see org.smeup.sys.il.data.QDatetime
	 * @generated
	 */
	EClass getDatetime();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.QDecimal
	 * <em>Decimal</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Decimal</em>'.
	 * @see org.smeup.sys.il.data.QDecimal
	 * @generated
	 */
	EClass getDecimal();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.QEnum
	 * <em>Enum</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see org.smeup.sys.il.data.QEnum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QFloating <em>Floating</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Floating</em>'.
	 * @see org.smeup.sys.il.data.QFloating
	 * @generated
	 */
	EClass getFloating();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.QGraphic
	 * <em>Graphic</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Graphic</em>'.
	 * @see org.smeup.sys.il.data.QGraphic
	 * @generated
	 */
	EClass getGraphic();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QHexadecimal <em>Hexadecimal</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Hexadecimal</em>'.
	 * @see org.smeup.sys.il.data.QHexadecimal
	 * @generated
	 */
	EClass getHexadecimal();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QIdentity <em>Identity</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see org.smeup.sys.il.data.QIdentity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QIndicator <em>Indicator</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Indicator</em>'.
	 * @see org.smeup.sys.il.data.QIndicator
	 * @generated
	 */
	EClass getIndicator();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QMoveable <em>Moveable</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Moveable</em>'.
	 * @see org.smeup.sys.il.data.QMoveable
	 * @generated
	 */
	EClass getMoveable();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.QList
	 * <em>List</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.smeup.sys.il.data.QList
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.QNumeric
	 * <em>Numeric</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Numeric</em>'.
	 * @see org.smeup.sys.il.data.QNumeric
	 * @generated
	 */
	EClass getNumeric();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.QPointer
	 * <em>Pointer</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Pointer</em>'.
	 * @see org.smeup.sys.il.data.QPointer
	 * @generated
	 */
	EClass getPointer();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.QRecord
	 * <em>Record</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Record</em>'.
	 * @see org.smeup.sys.il.data.QRecord
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QScroller <em>Scroller</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Scroller</em>'.
	 * @see org.smeup.sys.il.data.QScroller
	 * @generated
	 */
	EClass getScroller();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.QString
	 * <em>String</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.smeup.sys.il.data.QString
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.QStruct
	 * <em>Struct</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Struct</em>'.
	 * @see org.smeup.sys.il.data.QStruct
	 * @generated
	 */
	EClass getStruct();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.QStroller <em>Stroller</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Stroller</em>'.
	 * @see org.smeup.sys.il.data.QStroller
	 * @generated
	 */
	EClass getStroller();

	/**
	 * Returns the meta object for data type '<em>Data Array</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for data type '<em>Data Array</em>'.
	 * @model instanceClass="java.lang.Object[]"
	 * @generated
	 */
	EDataType getDataArray();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageDataFactory getIntegratedLanguageDataFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QAdapter <em>Adapter</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QAdapter
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getAdapter()
		 * @generated
		 */
		EClass ADAPTER = eINSTANCE.getAdapter();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.QArray
		 * <em>Array</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QArray
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QBinary <em>Binary</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QBinary
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getBinary()
		 * @generated
		 */
		EClass BINARY = eINSTANCE.getBinary();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QBoolean <em>Boolean</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QBoolean
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QBufferedData <em>Buffered Data</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QBufferedData
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedData()
		 * @generated
		 */
		EClass BUFFERED_DATA = eINSTANCE.getBufferedData();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QBufferedDataDelegator
		 * <em>Buffered Data Delegator</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QBufferedDataDelegator
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedDataDelegator()
		 * @generated
		 */
		EClass BUFFERED_DATA_DELEGATOR = eINSTANCE.getBufferedDataDelegator();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QBufferedList <em>Buffered List</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QBufferedList
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getBufferedList()
		 * @generated
		 */
		EClass BUFFERED_LIST = eINSTANCE.getBufferedList();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QCharacter <em>Character</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QCharacter
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getCharacter()
		 * @generated
		 */
		EClass CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.QData
		 * <em>Data</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QData
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QDataContainer <em>Data Container</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QDataContainer
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataContainer()
		 * @generated
		 */
		EClass DATA_CONTAINER = eINSTANCE.getDataContainer();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QDataDelegator <em>Data Delegator</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QDataDelegator
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataDelegator()
		 * @generated
		 */
		EClass DATA_DELEGATOR = eINSTANCE.getDataDelegator();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.impl.DataWriterImpl
		 * <em>Data Writer</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.impl.DataWriterImpl
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataWriter()
		 * @generated
		 */
		EClass DATA_WRITER = eINSTANCE.getDataWriter();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QDataFactory <em>Data Factory</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QDataFactory
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataFactory()
		 * @generated
		 */
		EClass DATA_FACTORY = eINSTANCE.getDataFactory();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QDataManager <em>Data Manager</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QDataManager
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataManager()
		 * @generated
		 */
		EClass DATA_MANAGER = eINSTANCE.getDataManager();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.impl.DataReaderImpl
		 * <em>Data Reader</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.impl.DataReaderImpl
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataReader()
		 * @generated
		 */
		EClass DATA_READER = eINSTANCE.getDataReader();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QDataStruct <em>Data Struct</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QDataStruct
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataStruct()
		 * @generated
		 */
		EClass DATA_STRUCT = eINSTANCE.getDataStruct();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.impl.DataVisitorImpl
		 * <em>Data Visitor</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.impl.DataVisitorImpl
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataVisitor()
		 * @generated
		 */
		EClass DATA_VISITOR = eINSTANCE.getDataVisitor();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QDatetime <em>Datetime</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QDatetime
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDatetime()
		 * @generated
		 */
		EClass DATETIME = eINSTANCE.getDatetime();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QDecimal <em>Decimal</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QDecimal
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDecimal()
		 * @generated
		 */
		EClass DECIMAL = eINSTANCE.getDecimal();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.QEnum
		 * <em>Enum</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QEnum
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QFloating <em>Floating</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QFloating
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getFloating()
		 * @generated
		 */
		EClass FLOATING = eINSTANCE.getFloating();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QGraphic <em>Graphic</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QGraphic
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getGraphic()
		 * @generated
		 */
		EClass GRAPHIC = eINSTANCE.getGraphic();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QHexadecimal <em>Hexadecimal</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QHexadecimal
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getHexadecimal()
		 * @generated
		 */
		EClass HEXADECIMAL = eINSTANCE.getHexadecimal();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QIdentity <em>Identity</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QIdentity
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getIdentity()
		 * @generated
		 */
		EClass IDENTITY = eINSTANCE.getIdentity();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QIndicator <em>Indicator</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QIndicator
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getIndicator()
		 * @generated
		 */
		EClass INDICATOR = eINSTANCE.getIndicator();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QMoveable <em>Moveable</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QMoveable
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getMoveable()
		 * @generated
		 */
		EClass MOVEABLE = eINSTANCE.getMoveable();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.QList
		 * <em>List</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QList
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QNumeric <em>Numeric</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QNumeric
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getNumeric()
		 * @generated
		 */
		EClass NUMERIC = eINSTANCE.getNumeric();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QPointer <em>Pointer</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QPointer
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getPointer()
		 * @generated
		 */
		EClass POINTER = eINSTANCE.getPointer();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QRecord <em>Record</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QRecord
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QScroller <em>Scroller</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QScroller
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getScroller()
		 * @generated
		 */
		EClass SCROLLER = eINSTANCE.getScroller();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QString <em>String</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QString
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QStruct <em>Struct</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QStruct
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getStruct()
		 * @generated
		 */
		EClass STRUCT = eINSTANCE.getStruct();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.QStroller <em>Stroller</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.QStroller
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getStroller()
		 * @generated
		 */
		EClass STROLLER = eINSTANCE.getStroller();

		/**
		 * The meta object literal for the '<em>Data Array</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl#getDataArray()
		 * @generated
		 */
		EDataType DATA_ARRAY = eINSTANCE.getDataArray();

	}

} // QIntegratedLanguageDataPackage
