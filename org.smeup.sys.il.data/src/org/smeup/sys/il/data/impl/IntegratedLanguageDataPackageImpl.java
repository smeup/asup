/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.data.InitStrategy;
import org.smeup.sys.il.data.QAdapter;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedDataDelegator;
import org.smeup.sys.il.data.QBufferedList;
import org.smeup.sys.il.data.QCattable;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDataAreaFactory;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataDelegator;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QDataReader;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QFloating;
import org.smeup.sys.il.data.QGraphic;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIdentity;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QLookuppable;
import org.smeup.sys.il.data.QMoveable;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.QScanner;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.QStorable;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.QStroller;
import org.smeup.sys.il.data.QStruct;
import org.smeup.sys.il.data.SortDirection;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;
import org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class IntegratedLanguageDataPackageImpl extends EPackageImpl implements QIntegratedLanguageDataPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferedDataEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferedDataDelegatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferedListEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cattableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAreaFactoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataContextEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDelegatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataWriterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFactoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataReaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFillerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStructEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataVisitorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datetimeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexadecimalEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indicatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookuppableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scannerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum initStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strollerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataArrayEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageDataPackageImpl() {
		super(eNS_URI, QIntegratedLanguageDataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QIntegratedLanguageDataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageDataPackage init() {
		if (isInited) return (QIntegratedLanguageDataPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageDataPackageImpl theIntegratedLanguageDataPackage = (IntegratedLanguageDataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageDataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageDataPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QIntegratedLanguageCorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		IntegratedLanguageDataDefPackageImpl theIntegratedLanguageDataDefPackage = (IntegratedLanguageDataDefPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataDefPackage.eNS_URI) instanceof IntegratedLanguageDataDefPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataDefPackage.eNS_URI) : QIntegratedLanguageDataDefPackage.eINSTANCE);
		IntegratedLanguageDataTermPackageImpl theIntegratedLanguageDataTermPackage = (IntegratedLanguageDataTermPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataTermPackage.eNS_URI) instanceof IntegratedLanguageDataTermPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataTermPackage.eNS_URI) : QIntegratedLanguageDataTermPackage.eINSTANCE);

		// Create package meta-data objects
		theIntegratedLanguageDataPackage.createPackageContents();
		theIntegratedLanguageDataDefPackage.createPackageContents();
		theIntegratedLanguageDataTermPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageDataPackage.initializePackageContents();
		theIntegratedLanguageDataDefPackage.initializePackageContents();
		theIntegratedLanguageDataTermPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageDataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageDataPackage.eNS_URI, theIntegratedLanguageDataPackage);
		return theIntegratedLanguageDataPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdapter() {
		return adapterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArray() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinary() {
		return binaryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBufferedData() {
		return bufferedDataEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBufferedDataDelegator() {
		return bufferedDataDelegatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBufferedList() {
		return bufferedListEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCharacter() {
		return characterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCattable() {
		return cattableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataArea() {
		return dataAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAreaFactory() {
		return dataAreaFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataContainer() {
		return dataContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataContext() {
		return dataContextEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataDelegator() {
		return dataDelegatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataWriter() {
		return dataWriterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataFactory() {
		return dataFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataManager() {
		return dataManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataReader() {
		return dataReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFiller() {
		return dataFillerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataStruct() {
		return dataStructEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataVisitor() {
		return dataVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatetime() {
		return datetimeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecimal() {
		return decimalEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnum() {
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFloating() {
		return floatingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphic() {
		return graphicEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHexadecimal() {
		return hexadecimalEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentity() {
		return identityEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndicator() {
		return indicatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoveable() {
		return moveableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLookuppable() {
		return lookuppableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumeric() {
		return numericEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointer() {
		return pointerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecord() {
		return recordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScanner() {
		return scannerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScroller() {
		return scrollerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorable() {
		return storableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStruct() {
		return structEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInitStrategy() {
		return initStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSortDirection() {
		return sortDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStroller() {
		return strollerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDataArray() {
		return dataArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIntegratedLanguageDataFactory getIntegratedLanguageDataFactory() {
		return (QIntegratedLanguageDataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		adapterEClass = createEClass(ADAPTER);

		arrayEClass = createEClass(ARRAY);

		binaryEClass = createEClass(BINARY);

		bufferedDataEClass = createEClass(BUFFERED_DATA);

		bufferedDataDelegatorEClass = createEClass(BUFFERED_DATA_DELEGATOR);

		bufferedListEClass = createEClass(BUFFERED_LIST);

		characterEClass = createEClass(CHARACTER);

		cattableEClass = createEClass(CATTABLE);

		dataEClass = createEClass(DATA);

		dataAreaEClass = createEClass(DATA_AREA);

		dataAreaFactoryEClass = createEClass(DATA_AREA_FACTORY);

		dataContainerEClass = createEClass(DATA_CONTAINER);

		dataContextEClass = createEClass(DATA_CONTEXT);

		dataDelegatorEClass = createEClass(DATA_DELEGATOR);

		dataFactoryEClass = createEClass(DATA_FACTORY);

		dataFillerEClass = createEClass(DATA_FILLER);

		dataManagerEClass = createEClass(DATA_MANAGER);

		dataReaderEClass = createEClass(DATA_READER);

		dataStructEClass = createEClass(DATA_STRUCT);

		dataVisitorEClass = createEClass(DATA_VISITOR);

		dataWriterEClass = createEClass(DATA_WRITER);

		datetimeEClass = createEClass(DATETIME);

		decimalEClass = createEClass(DECIMAL);

		enumEClass = createEClass(ENUM);

		floatingEClass = createEClass(FLOATING);

		graphicEClass = createEClass(GRAPHIC);

		hexadecimalEClass = createEClass(HEXADECIMAL);

		identityEClass = createEClass(IDENTITY);

		indicatorEClass = createEClass(INDICATOR);

		listEClass = createEClass(LIST);

		lookuppableEClass = createEClass(LOOKUPPABLE);

		moveableEClass = createEClass(MOVEABLE);

		numericEClass = createEClass(NUMERIC);

		pointerEClass = createEClass(POINTER);

		recordEClass = createEClass(RECORD);

		scannerEClass = createEClass(SCANNER);

		scrollerEClass = createEClass(SCROLLER);

		storableEClass = createEClass(STORABLE);

		stringEClass = createEClass(STRING);

		strollerEClass = createEClass(STROLLER);

		structEClass = createEClass(STRUCT);

		// Create enums
		initStrategyEEnum = createEEnum(INIT_STRATEGY);
		sortDirectionEEnum = createEEnum(SORT_DIRECTION);

		// Create data types
		dataArrayEDataType = createEDataType(DATA_ARRAY);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QIntegratedLanguageDataDefPackage theIntegratedLanguageDataDefPackage = (QIntegratedLanguageDataDefPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataDefPackage.eNS_URI);
		QIntegratedLanguageDataTermPackage theIntegratedLanguageDataTermPackage = (QIntegratedLanguageDataTermPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataTermPackage.eNS_URI);
		QMachineInterfaceCorePackage theMachineInterfaceCorePackage = (QMachineInterfaceCorePackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI);
		QIntegratedLanguageCoreCtxPackage theIntegratedLanguageCoreCtxPackage = (QIntegratedLanguageCoreCtxPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI);
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theIntegratedLanguageDataDefPackage);
		getESubpackages().add(theIntegratedLanguageDataTermPackage);

		// Create type parameters
		ETypeParameter arrayEClass_D = addETypeParameter(arrayEClass, "D");
		ETypeParameter bufferedListEClass_D = addETypeParameter(bufferedListEClass, "D");
		ETypeParameter cattableEClass_D = addETypeParameter(cattableEClass, "D");
		ETypeParameter dataAreaEClass_D = addETypeParameter(dataAreaEClass, "D");
		ETypeParameter dataDelegatorEClass_D = addETypeParameter(dataDelegatorEClass, "D");
		ETypeParameter enumEClass_E = addETypeParameter(enumEClass, "E");
		ETypeParameter enumEClass_D = addETypeParameter(enumEClass, "D");
		ETypeParameter listEClass_D = addETypeParameter(listEClass, "D");
		ETypeParameter scrollerEClass_D = addETypeParameter(scrollerEClass, "D");
		ETypeParameter strollerEClass_D = addETypeParameter(strollerEClass, "D");
		ETypeParameter structEClass_D = addETypeParameter(structEClass, "D");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getBufferedData());
		arrayEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getBufferedData());
		bufferedListEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getData());
		cattableEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getBufferedData());
		dataAreaEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getData());
		dataDelegatorEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		enumEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(this.getBufferedData());
		enumEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getData());
		listEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getBufferedData());
		scrollerEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getDataStruct());
		strollerEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(this.getData());
		structEClass_D.getEBounds().add(g1);

		// Add supertypes to classes
		adapterEClass.getESuperTypes().add(this.getData());
		adapterEClass.getESuperTypes().add(this.getBufferedDataDelegator());
		g1 = createEGenericType(this.getBufferedList());
		EGenericType g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		arrayEClass.getEGenericSuperTypes().add(g1);
		binaryEClass.getESuperTypes().add(this.getNumeric());
		bufferedDataEClass.getESuperTypes().add(this.getData());
		bufferedDataEClass.getESuperTypes().add(this.getMoveable());
		bufferedDataEClass.getESuperTypes().add(this.getStorable());
		g1 = createEGenericType(this.getDataDelegator());
		g2 = createEGenericType(this.getBufferedData());
		g1.getETypeArguments().add(g2);
		bufferedDataDelegatorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBufferedData());
		bufferedDataDelegatorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(bufferedListEClass_D);
		g1.getETypeArguments().add(g2);
		bufferedListEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBufferedData());
		bufferedListEClass.getEGenericSuperTypes().add(g1);
		characterEClass.getESuperTypes().add(this.getString());
		dataAreaEClass.getESuperTypes().add(this.getBufferedData());
		dataContainerEClass.getESuperTypes().add(theIntegratedLanguageDataTermPackage.getDataTermContainer());
		dataContainerEClass.getESuperTypes().add(theMachineInterfaceCorePackage.getJavaCloseable());
		dataContextEClass.getESuperTypes().add(theIntegratedLanguageCoreCtxPackage.getContextProvider());
		dataFillerEClass.getESuperTypes().add(this.getDataVisitor());
		dataReaderEClass.getESuperTypes().add(this.getDataVisitor());
		dataStructEClass.getESuperTypes().add(this.getCharacter());
		dataStructEClass.getESuperTypes().add(this.getRecord());
		dataWriterEClass.getESuperTypes().add(this.getDataVisitor());
		datetimeEClass.getESuperTypes().add(this.getBufferedData());
		decimalEClass.getESuperTypes().add(this.getNumeric());
		enumEClass.getESuperTypes().add(this.getBufferedData());
		floatingEClass.getESuperTypes().add(this.getNumeric());
		graphicEClass.getESuperTypes().add(this.getString());
		hexadecimalEClass.getESuperTypes().add(this.getBufferedData());
		identityEClass.getESuperTypes().add(this.getBufferedData());
		indicatorEClass.getESuperTypes().add(this.getBufferedData());
		listEClass.getESuperTypes().add(this.getData());
		numericEClass.getESuperTypes().add(this.getBufferedData());
		pointerEClass.getESuperTypes().add(this.getData());
		pointerEClass.getESuperTypes().add(this.getStorable());
		g1 = createEGenericType(this.getStruct());
		g2 = createEGenericType(this.getBufferedData());
		g1.getETypeArguments().add(g2);
		recordEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBufferedList());
		g2 = createEGenericType(scrollerEClass_D);
		g1.getETypeArguments().add(g2);
		scrollerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBufferedData());
		stringEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getScanner());
		stringEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCattable());
		g2 = createEGenericType(this.getString());
		g1.getETypeArguments().add(g2);
		stringEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLookuppable());
		stringEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getScroller());
		g2 = createEGenericType(strollerEClass_D);
		g1.getETypeArguments().add(g2);
		strollerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataStruct());
		strollerEClass.getEGenericSuperTypes().add(g1);
		structEClass.getESuperTypes().add(this.getData());

		// Initialize classes and features; add operations and parameters
		initEClass(adapterEClass, QAdapter.class, "Adapter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(adapterEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdapter(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(adapterEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(arrayEClass, QArray.class, "Array", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(arrayEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "qSubarr", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "start", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(arrayEClass, null, "qSubarr", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "start", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDecimal(), "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(arrayEClass, null, "qSubarr", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDecimal(), "start", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDecimal(), "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(arrayEClass, null, "qSubarr", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDecimal(), "start", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "elements", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(arrayEClass, null, "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(arrayEClass, ecorePackage.getEBoolean(), "isContiguous", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(arrayEClass_D);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(arrayEClass, null, "qSubst", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(this.getCharacter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(arrayEClass, null, "qSubst", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(this.getCharacter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(arrayEClass, null, "qSubst", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(this.getCharacter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(arrayEClass, null, "qSubst", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(this.getCharacter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(arrayEClass, null, "qSubst", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(this.getCharacter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(arrayEClass, null, "qSubst", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(this.getCharacter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(binaryEClass, QBinary.class, "Binary", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bufferedDataEClass, QBufferedData.class, "BufferedData", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(bufferedDataEClass, ecorePackage.getEByteArray(), "asBytes", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataFiller(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataFiller(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, null, "fill", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "isNull", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataFiller(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(bufferedDataEClass, ecorePackage.getEInt(), "getLength", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(bufferedDataEClass, ecorePackage.getEInt(), "getSize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "gt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "gt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "gt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataFiller(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataFiller(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "lt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "lt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "lt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataFiller(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedDataEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataFiller(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(bufferedDataEClass, this.getPointer(), "qAddr", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(bufferedDataEClass, this.getNumeric(), "qLen", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bufferedDataDelegatorEClass, QBufferedDataDelegator.class, "BufferedDataDelegator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(bufferedDataDelegatorEClass, this.getBufferedData(), "getDelegate", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bufferedListEClass, QBufferedList.class, "BufferedList", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(bufferedListEClass, null, "sorta", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataFiller(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getNumeric(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getNumeric(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataFiller(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sourceIndex", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sourceIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "sourceIndex", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "sourceIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sourceIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sourceIndex", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sourceIndex", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "sourceIndex", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(bufferedListEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "targetIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "sourceIndex", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(characterEClass, QCharacter.class, "Character", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(characterEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(characterEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDecimal(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(characterEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDecimal(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cattableEClass, QCattable.class, "Cattable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(cattableEClass_D);
		initEOperation(op, g1);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor2", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "space", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "cat", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(cattableEClass_D);
		initEOperation(op, g1);

		op = addEOperation(cattableEClass, null, "cat", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cattableEClass, null, "qPlus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(cattableEClass_D);
		initEOperation(op, g1);

		op = addEOperation(cattableEClass, null, "qPlus", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "factor1", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(cattableEClass_D);
		initEOperation(op, g1);

		initEClass(dataEClass, QData.class, "Data", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataVisitor(), "visitor", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataEClass, null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "gt", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataEClass, ecorePackage.getEBoolean(), "isEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "lt", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataAreaEClass, QDataArea.class, "DataArea", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataAreaEClass, null, "get", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(dataAreaEClass_D);
		initEOperation(op, g1);

		addEOperation(dataAreaEClass, null, "in", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataAreaEClass, null, "in", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "error", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataAreaEClass, null, "out", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataAreaEClass, null, "out", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "error", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataAreaFactoryEClass, QDataAreaFactory.class, "DataAreaFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataAreaFactoryEClass, null, "createDataArea", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getBufferedData());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getDataContext(), "dataContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "argument", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "externalName", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getDataArea());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(dataContainerEClass, QDataContainer.class, "DataContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(dataContainerEClass, null, "clearData", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataContainerEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataContainerEClass, null, "createDataTerm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaAnnotation(), "annotations", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(dataContainerEClass, this.getData(), "getData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataContainerEClass, this.getData(), "getData", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataTerm", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataContainerEClass, this.getDataContext(), "getDataContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataContainerEClass, null, "getDataTerm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(dataContainerEClass, ecorePackage.getEString(), "getKeys", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataContainerEClass, ecorePackage.getEBoolean(), "hasDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataContainerEClass, ecorePackage.getEBoolean(), "hasDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataTerm", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataContainerEClass, null, "removeDataTerm", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataTerm", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataContainerEClass, null, "resetData", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataContainerEClass, this.getData(), "resetData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataContainerEClass, this.getData(), "resetData", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataTerm", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataContextEClass, QDataContext.class, "DataContext", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(dataContextEClass, this.getIndicator(), "endOfData", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataContextEClass, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataContextEClass, theMachineInterfaceCorePackage.getJavaCharset(), "getCharset", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataContextEClass, this.getDataFactory(), "getDataFactory", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataContextEClass, theIntegratedLanguageDataDefPackage.getDateFormat(), "getDateFormat", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataContextEClass, theIntegratedLanguageDataDefPackage.getTimeFormat(), "getTimeFormat", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataContextEClass, this.getString(), "getTemporaryString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataDelegatorEClass, QDataDelegator.class, "DataDelegator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(dataDelegatorEClass, this.getData(), "getDelegate", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataFactoryEClass, QDataFactory.class, "DataFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataFactoryEClass, null, "createArray", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getBufferedData());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataDefPackage.getUnaryAtomicDataDef());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "argument", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "dimension", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSortDirection(), "sortDirection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, this.getBinary(), "createBinary", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataDefPackage.getBinaryType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "unsigned", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, this.getCharacter(), "createCharacter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "varying", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, null, "createData", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getData());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataDefPackage.getDataDef());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataDef", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, this.getData(), "createData", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "dataTerm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, null, "createDataArea", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getBufferedData());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataDefPackage.getBufferedDataDef());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "argument", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "externalName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getDataArea());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, null, "createDataDef", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaAnnotation(), "annotations", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataDefPackage.getDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, null, "createDataStruct", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getDataStruct());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType(theIntegratedLanguageDataDefPackage.getBufferedDataDef());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		addEParameter(op, g1, "elements", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, null, "createDataStruct", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getDataStruct());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "wrapper", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, this.getDatetime(), "createDate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataDefPackage.getDatetimeType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataDefPackage.getDateFormat(), "dateFormat", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataDefPackage.getTimeFormat(), "timeFormat", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, this.getDecimal(), "createDecimal", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "precision", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "scale", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataDefPackage.getDecimalType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, null, "createEnum", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		ETypeParameter t2 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getBufferedData());
		t2.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "classEnumerator", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t2);
		addEParameter(op, g1, "dataDelegate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEnum());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(t2);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, this.getFloating(), "createFloating", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataDefPackage.getFloatingType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, this.getHexadecimal(), "createHexadecimal", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, this.getIndicator(), "createIndicator", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, null, "createList", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getData());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataDefPackage.getUnaryAtomicDataDef());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "argument", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "dimension", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, this.getPointer(), "createPointer", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "size", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, this.getPointer(), "createPointer", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPointer(), "pointer", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "newSize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, null, "createRecord", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "R");
		g1 = createEGenericType(this.getRecord());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "wrapper", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, null, "createScroller", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getBufferedData());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataDefPackage.getAtomicDataDef());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "argument", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "dimension", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSortDirection(), "sortDirection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getScroller());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, null, "createStroller", 1, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "D");
		g1 = createEGenericType(this.getDataStruct());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theIntegratedLanguageDataDefPackage.getStrollerDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "argument", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "dimension", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSortDirection(), "sortDirection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getStroller());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(dataFactoryEClass, this.getDatetime(), "createTime", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataFactoryEClass, this.getDatetime(), "createTimestamp", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initialize", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataFillerEClass, QDataFiller.class, "DataFiller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataFillerEClass, this.getDataFiller(), "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataFillerEClass, this.getBufferedData(), "get", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataManagerEClass, QDataManager.class, "DataManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataManagerEClass, this.getDataContainer(), "createDataContainer", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataContext(), "dataContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		addEParameter(op, g1, "dataTerms", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataManagerEClass, this.getDataContainer(), "createDataContainer", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		addEParameter(op, g1, "dataTerms", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataManagerEClass, this.getDataContainer(), "createDataContainer", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCorePackage.getObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataManagerEClass, this.getDataContext(), "createDataContext", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCoreCtxPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataManagerEClass, null, "validateDataContainer", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataContainer(), "container", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataReaderEClass, QDataReader.class, "DataReader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataStructEClass, QDataStruct.class, "DataStruct", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataVisitorEClass, QDataVisitor.class, "DataVisitor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getData(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdapter(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBinary(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCharacter(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataStruct(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDatetime(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDecimal(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEnum());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFloating(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraphic(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHexadecimal(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIdentity(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPointer(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getScroller());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, null, "endVisit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getStroller());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getData(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAdapter(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBinary(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCharacter(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataStruct(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDatetime(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDecimal(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEnum());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFloating(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraphic(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHexadecimal(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIdentity(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPointer(), "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getScroller());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataVisitorEClass, ecorePackage.getEBoolean(), "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getStroller());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "data", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataWriterEClass, QDataWriter.class, "DataWriter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dataWriterEClass, this.getDataWriter(), "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataWriterEClass, this.getDataWriter(), "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataWriterEClass, this.getDataWriter(), "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageCorePackage.getSpecialElement(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataWriterEClass, this.getDataWriter(), "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataWriterEClass, this.getDataWriter(), "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(datetimeEClass, QDatetime.class, "Datetime", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(datetimeEClass, null, "adddur", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "duration", 1, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "format", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDatetime(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(datetimeEClass, null, "adddur", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getNumeric(), "duration", 1, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "format", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDatetime(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(datetimeEClass, null, "adddur", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "duration", 1, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "format", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(datetimeEClass, null, "adddur", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getNumeric(), "duration", 1, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "format", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(datetimeEClass, ecorePackage.getEDate(), "asDate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(datetimeEClass, ecorePackage.getELong(), "asTime", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(datetimeEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(datetimeEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(datetimeEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDatetime(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(datetimeEClass, this.getDatetime(), "qDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "format", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(datetimeEClass, this.getNumeric(), "qDiff", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getDatetime(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "format", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(datetimeEClass, ecorePackage.getEString(), "qEditd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataDefPackage.getDateFormat(), "dateFormat", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "dateSeparator", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theIntegratedLanguageDataDefPackage.getTimeFormat(), "timeFormat", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "timeSeparator", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(datetimeEClass, this.getNumeric(), "qSubdt", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "portion", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(datetimeEClass, null, "subdur", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "duration", 1, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "format", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDatetime(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(datetimeEClass, null, "subdur", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getNumeric(), "duration", 1, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "format", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDatetime(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(datetimeEClass, null, "subdur", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEInt(), "duration", 1, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "format", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(datetimeEClass, null, "subdur", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		addEParameter(op, this.getNumeric(), "duration", 1, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "format", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(datetimeEClass, ecorePackage.getELong(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(datetimeEClass, null, "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(decimalEClass, QDecimal.class, "Decimal", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(decimalEClass, ecorePackage.getEInt(), "getPrecision", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(decimalEClass, ecorePackage.getEInt(), "getScale", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(enumEClass, QEnum.class, "Enum", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(enumEClass, null, "asData", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(enumEClass_D);
		initEOperation(op, g1);

		op = addEOperation(enumEClass, null, "asEnum", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(enumEClass_E);
		initEOperation(op, g1);

		op = addEOperation(enumEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(enumEClass, ecorePackage.getEString(), "getSpecialName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(floatingEClass, QFloating.class, "Floating", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(floatingEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(floatingEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(graphicEClass, QGraphic.class, "Graphic", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hexadecimalEClass, QHexadecimal.class, "Hexadecimal", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(hexadecimalEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHexadecimal(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(hexadecimalEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(identityEClass, QIdentity.class, "Identity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indicatorEClass, QIndicator.class, "Indicator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(indicatorEClass, ecorePackage.getEBoolean(), "asBoolean", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(indicatorEClass, ecorePackage.getEBoolean(), "b", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(indicatorEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(indicatorEClass, this.getCharacter(), "qTrim", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listEClass, QList.class, "List", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(listEClass, this.getDataArray(), "asArray", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(listEClass, ecorePackage.getEInt(), "capacity", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(listEClass, ecorePackage.getEInt(), "count", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(listEClass_D);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(listEClass, null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(listEClass_D);
		initEOperation(op, g1);

		op = addEOperation(listEClass, null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(listEClass_D);
		initEOperation(op, g1);

		initEClass(lookuppableEClass, QLookuppable.class, "Lookuppable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "elements", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "elements", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "elements", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "elements", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "elements", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "elements", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookupgt", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookupgt", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookupgt", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookupgt", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "elements", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookupgt", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "elements", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookupgt", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "elements", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookupgt", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "elements", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookuplt", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookuplt", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookuplt", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookuplt", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "elements", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookuplt", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "elements", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookuplt", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "elements", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(lookuppableEClass, this.getNumeric(), "qLookuplt", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "elements", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(moveableEClass, QMoveable.class, "Moveable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataFiller(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataFiller(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "startIndex", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "startIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "startIndex", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movea", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "startIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataFiller(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataFiller(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(moveableEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(numericEClass, QNumeric.class, "Numeric", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(numericEClass, ecorePackage.getEDouble(), "asDouble", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(numericEClass, ecorePackage.getEInt(), "asInteger", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(numericEClass, ecorePackage.getELong(), "asLong", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(numericEClass, ecorePackage.getEShort(), "asShort", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(numericEClass, ecorePackage.getEDouble(), "d", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "remainderTarget", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "remainderTarget", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "remainderTarget", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "remainderTarget", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "remainderTarget", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigInteger(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBigDecimal(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "gt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "gt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(numericEClass, ecorePackage.getEInt(), "i", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(numericEClass, ecorePackage.getEBoolean(), "isSigned", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(numericEClass, ecorePackage.getELong(), "l", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "lt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "lt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getDatetime(), "qDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "format", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qDiv", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qDiv", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "remainderTarget", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qDiv", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qDiv", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "remainderTarget", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qDiv", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qDiv", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "remainderTarget", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qDiv", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qDiv", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "remainderTarget", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qDiv", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qDiv", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "remainderTarget", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(numericEClass, this.getNumeric(), "qInt", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(numericEClass, this.getNumeric(), "qInth", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qMinus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qMinus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qMinus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qMinus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qMinus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qMult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qMult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qMult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qMult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qMult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qPlus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qPlus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qPlus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qPlus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qPlus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qRem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qRem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qRem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qRem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, this.getNumeric(), "qRem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(numericEClass, this.getNumeric(), "qUns", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(numericEClass, null, "time", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "xfoot", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(numericEClass, null, "xfoot", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getArray());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "array", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roundingMode", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pointerEClass, QPointer.class, "Pointer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(pointerEClass, null, "dealloc", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "divide", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPointer(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "minus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "mult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "plus", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEShort(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getPointer(), "power", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pointerEClass, this.getString(), "qStr", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getString(), "qStr", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(pointerEClass, this.getString(), "qStr", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(recordEClass, QRecord.class, "Record", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scannerEClass, QScanner.class, "Scanner", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(scannerEClass, this.getNumeric(), "qScan", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCharacter(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(scannerEClass, this.getNumeric(), "qScan", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCharacter(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(scannerEClass, this.getNumeric(), "qScan", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCharacter(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(scannerEClass, this.getNumeric(), "qScan", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCharacter(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(scannerEClass, this.getNumeric(), "qScan", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCharacter(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(scannerEClass, this.getNumeric(), "qScan", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCharacter(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(scannerEClass, this.getNumeric(), "qScan", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(scannerEClass, this.getNumeric(), "qScan", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(scannerEClass, this.getNumeric(), "qScan", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(scannerEClass, this.getNumeric(), "qScan", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(scannerEClass, this.getNumeric(), "qScan", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(scannerEClass, this.getNumeric(), "qScan", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "found", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(scrollerEClass, QScroller.class, "Scroller", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(scrollerEClass, null, "absolute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(scrollerEClass_D);
		initEOperation(op, g1);

		op = addEOperation(scrollerEClass, null, "current", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(scrollerEClass_D);
		initEOperation(op, g1);

		op = addEOperation(scrollerEClass, null, "first", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(scrollerEClass_D);
		initEOperation(op, g1);

		op = addEOperation(scrollerEClass, null, "last", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(scrollerEClass_D);
		initEOperation(op, g1);

		op = addEOperation(scrollerEClass, null, "next", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(scrollerEClass_D);
		initEOperation(op, g1);

		op = addEOperation(scrollerEClass, null, "previous", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(scrollerEClass_D);
		initEOperation(op, g1);

		initEClass(storableEClass, QStorable.class, "Storable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(storableEClass, null, "assign", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(storableEClass, null, "assign", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedData(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(storableEClass, ecorePackage.getEInt(), "getPosition", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(storableEClass, ecorePackage.getEJavaObject(), "getStore", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(storableEClass, ecorePackage.getEBoolean(), "isEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringEClass, QString.class, "String", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(stringEClass, ecorePackage.getEString(), "asString", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "eq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHexadecimal(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "evalr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "evalr", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "ge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHexadecimal(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "gt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "gt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "le", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHexadecimal(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "lt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "lt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "move", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "movel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, ecorePackage.getEBoolean(), "ne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHexadecimal(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, this.getDatetime(), "qDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "E");
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "format", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stringEClass, this.getNumeric(), "qInt", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stringEClass, this.getNumeric(), "qInth", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, this.getCharacter(), "qSubst", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, this.getCharacter(), "qSubst", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, this.getCharacter(), "qSubst", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, this.getCharacter(), "qSubst", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, this.getCharacter(), "qSubst", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, this.getCharacter(), "qSubst", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stringEClass, this.getCharacter(), "qTrim", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stringEClass, this.getCharacter(), "qTriml", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stringEClass, this.getCharacter(), "qTrimr", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stringEClass, ecorePackage.getEString(), "s", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "testn", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndicator(), "numeric", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stringEClass, ecorePackage.getEString(), "trim", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stringEClass, ecorePackage.getEString(), "trimL", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(stringEClass, ecorePackage.getEString(), "trimR", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMachineInterfaceCorePackage.getJavaNumber(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumeric(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "clear", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stringEClass, null, "xlate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByte(), "from", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "to", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(strollerEClass, QStroller.class, "Stroller", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(strollerEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getStroller());
		g2 = createEGenericType(strollerEClass_D);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "value", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(structEClass, QStruct.class, "Struct", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(structEClass, null, "getElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(structEClass_D);
		initEOperation(op, g1);

		op = addEOperation(structEClass, null, "getElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(structEClass_D);
		initEOperation(op, g1);

		// Initialize enums and add enum literals
		initEEnum(initStrategyEEnum, InitStrategy.class, "InitStrategy");
		addEEnumLiteral(initStrategyEEnum, InitStrategy.BASE);
		addEEnumLiteral(initStrategyEEnum, InitStrategy.LIGHT);

		initEEnum(sortDirectionEEnum, SortDirection.class, "SortDirection");
		addEEnumLiteral(sortDirectionEEnum, SortDirection.ASCEND);
		addEEnumLiteral(sortDirectionEEnum, SortDirection.DESCEND);

		// Initialize data types
		initEDataType(dataArrayEDataType, Object[].class, "DataArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // IntegratedLanguageDataPackageImpl
