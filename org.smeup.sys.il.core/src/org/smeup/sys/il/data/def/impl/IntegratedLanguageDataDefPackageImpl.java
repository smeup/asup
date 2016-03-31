/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.ctx.impl.IntegratedLanguageCoreCtxPackageImpl;
import org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
import org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl;
import org.smeup.sys.il.core.out.QIntegratedLanguageCoreOutPackage;
import org.smeup.sys.il.core.out.impl.IntegratedLanguageCoreOutPackageImpl;
import org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermPackage;
import org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl;
import org.smeup.sys.il.data.QIntegratedLanguageDataPackage;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DataDefType;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.data.def.DecimalType;
import org.smeup.sys.il.data.def.FloatingType;
import org.smeup.sys.il.data.def.QAdapterDef;
import org.smeup.sys.il.data.def.QArrayDef;
import org.smeup.sys.il.data.def.QAtomicDataDef;
import org.smeup.sys.il.data.def.QBinaryDef;
import org.smeup.sys.il.data.def.QBufferDef;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.def.QCharacterDef;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataAreaDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QDataStructDef;
import org.smeup.sys.il.data.def.QDatetimeDef;
import org.smeup.sys.il.data.def.QDecimalDef;
import org.smeup.sys.il.data.def.QEnumDef;
import org.smeup.sys.il.data.def.QFloatingDef;
import org.smeup.sys.il.data.def.QHexadecimalDef;
import org.smeup.sys.il.data.def.QIdentityDef;
import org.smeup.sys.il.data.def.QIndicatorDef;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory;
import org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage;
import org.smeup.sys.il.data.def.QListDef;
import org.smeup.sys.il.data.def.QMultipleAtomicBufferedDataDef;
import org.smeup.sys.il.data.def.QMultipleAtomicDataDef;
import org.smeup.sys.il.data.def.QMultipleCompoundDataDef;
import org.smeup.sys.il.data.def.QMultipleDataDef;
import org.smeup.sys.il.data.def.QNumericDef;
import org.smeup.sys.il.data.def.QPointerDef;
import org.smeup.sys.il.data.def.QScrollerDef;
import org.smeup.sys.il.data.def.QStringDef;
import org.smeup.sys.il.data.def.QStrollerDef;
import org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef;
import org.smeup.sys.il.data.def.QUnaryAtomicDataDef;
import org.smeup.sys.il.data.def.QUnaryBufferedDataDef;
import org.smeup.sys.il.data.def.QUnaryCompoundDataDef;
import org.smeup.sys.il.data.def.QUnaryDataDef;
import org.smeup.sys.il.data.def.QWrapperDef;
import org.smeup.sys.il.data.def.TimeFormat;
import org.smeup.sys.il.data.impl.IntegratedLanguageDataPackageImpl;
import org.smeup.sys.il.data.term.QIntegratedLanguageDataTermPackage;
import org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class IntegratedLanguageDataDefPackageImpl extends EPackageImpl implements QIntegratedLanguageDataDefPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicDataDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferedDataDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundDataDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAreaDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStructDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datetimeDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatingDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexadecimalDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indicatorDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleAtomicDataDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleAtomicBufferedDataDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleCompoundDataDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleDataDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollerDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strollerDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryAtomicDataDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryAtomicBufferedDataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryBufferedDataDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryCompoundDataDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryDataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wrapperDefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataDefTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datetimeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateFormatEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decimalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum floatingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeFormatEEnum = null;

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
	 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegratedLanguageDataDefPackageImpl() {
		super(eNS_URI, QIntegratedLanguageDataDefFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QIntegratedLanguageDataDefPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QIntegratedLanguageDataDefPackage init() {
		if (isInited) return (QIntegratedLanguageDataDefPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataDefPackage.eNS_URI);

		// Obtain or create and register package
		IntegratedLanguageDataDefPackageImpl theIntegratedLanguageDataDefPackage = (IntegratedLanguageDataDefPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegratedLanguageDataDefPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegratedLanguageDataDefPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QMachineInterfaceCorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		IntegratedLanguageCorePackageImpl theIntegratedLanguageCorePackage = (IntegratedLanguageCorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI) instanceof IntegratedLanguageCorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI) : QIntegratedLanguageCorePackage.eINSTANCE);
		IntegratedLanguageCoreCtxPackageImpl theIntegratedLanguageCoreCtxPackage = (IntegratedLanguageCoreCtxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI) instanceof IntegratedLanguageCoreCtxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreCtxPackage.eNS_URI) : QIntegratedLanguageCoreCtxPackage.eINSTANCE);
		IntegratedLanguageCoreMetaPackageImpl theIntegratedLanguageCoreMetaPackage = (IntegratedLanguageCoreMetaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI) instanceof IntegratedLanguageCoreMetaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreMetaPackage.eNS_URI) : QIntegratedLanguageCoreMetaPackage.eINSTANCE);
		IntegratedLanguageCoreOutPackageImpl theIntegratedLanguageCoreOutPackage = (IntegratedLanguageCoreOutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreOutPackage.eNS_URI) instanceof IntegratedLanguageCoreOutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreOutPackage.eNS_URI) : QIntegratedLanguageCoreOutPackage.eINSTANCE);
		IntegratedLanguageCoreTermPackageImpl theIntegratedLanguageCoreTermPackage = (IntegratedLanguageCoreTermPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreTermPackage.eNS_URI) instanceof IntegratedLanguageCoreTermPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCoreTermPackage.eNS_URI) : QIntegratedLanguageCoreTermPackage.eINSTANCE);
		IntegratedLanguageDataPackageImpl theIntegratedLanguageDataPackage = (IntegratedLanguageDataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI) instanceof IntegratedLanguageDataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI) : QIntegratedLanguageDataPackage.eINSTANCE);
		IntegratedLanguageDataTermPackageImpl theIntegratedLanguageDataTermPackage = (IntegratedLanguageDataTermPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataTermPackage.eNS_URI) instanceof IntegratedLanguageDataTermPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataTermPackage.eNS_URI) : QIntegratedLanguageDataTermPackage.eINSTANCE);

		// Create package meta-data objects
		theIntegratedLanguageDataDefPackage.createPackageContents();
		theIntegratedLanguageCorePackage.createPackageContents();
		theIntegratedLanguageCoreCtxPackage.createPackageContents();
		theIntegratedLanguageCoreMetaPackage.createPackageContents();
		theIntegratedLanguageCoreOutPackage.createPackageContents();
		theIntegratedLanguageCoreTermPackage.createPackageContents();
		theIntegratedLanguageDataPackage.createPackageContents();
		theIntegratedLanguageDataTermPackage.createPackageContents();

		// Initialize created meta-data
		theIntegratedLanguageDataDefPackage.initializePackageContents();
		theIntegratedLanguageCorePackage.initializePackageContents();
		theIntegratedLanguageCoreCtxPackage.initializePackageContents();
		theIntegratedLanguageCoreMetaPackage.initializePackageContents();
		theIntegratedLanguageCoreOutPackage.initializePackageContents();
		theIntegratedLanguageCoreTermPackage.initializePackageContents();
		theIntegratedLanguageDataPackage.initializePackageContents();
		theIntegratedLanguageDataTermPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegratedLanguageDataDefPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QIntegratedLanguageDataDefPackage.eNS_URI, theIntegratedLanguageDataDefPackage);
		return theIntegratedLanguageDataDefPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdapterDef() {
		return adapterDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayDef() {
		return arrayDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDef_Order() {
		return (EAttribute)arrayDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtomicDataDef() {
		return atomicDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryDef() {
		return binaryDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryDef_Type() {
		return (EAttribute)binaryDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryDef_Unsigned() {
		return (EAttribute)binaryDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBufferDef() {
		return bufferDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBufferedDataDef() {
		return bufferedDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCharacterDef() {
		return characterDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCharacterDef_Length() {
		return (EAttribute)characterDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCharacterDef_Varying() {
		return (EAttribute)characterDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompoundDataDef() {
		return compoundDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundDataDef_ClassDelegator() {
		return (EAttribute)compoundDataDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundDataDef_Elements() {
		return (EReference)compoundDataDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundDataDef_Prefix() {
		return (EAttribute)compoundDataDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundDataDef_Qualified() {
		return (EAttribute)compoundDataDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataDef() {
		return dataDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataDef_Formulas() {
		return (EAttribute)dataDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAreaDef() {
		return dataAreaDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAreaDef_ExternalName() {
		return (EAttribute)dataAreaDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataStructDef() {
		return dataStructDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataStructDef_Length() {
		return (EAttribute)dataStructDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatetimeDef() {
		return datetimeDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatetimeDef_Type() {
		return (EAttribute)datetimeDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeDef_DateFormat() {
		return (EAttribute)datetimeDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatetimeDef_TimeFormat() {
		return (EAttribute)datetimeDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecimalDef() {
		return decimalDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimalDef_Precision() {
		return (EAttribute)decimalDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimalDef_Scale() {
		return (EAttribute)decimalDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimalDef_Type() {
		return (EAttribute)decimalDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumDef() {
		return enumDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumDef_Delegate() {
		return (EReference)enumDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumDef_Klass() {
		return (EAttribute)enumDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFloatingDef() {
		return floatingDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFloatingDef_Type() {
		return (EAttribute)floatingDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHexadecimalDef() {
		return hexadecimalDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHexadecimalDef_Length() {
		return (EAttribute)hexadecimalDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentityDef() {
		return identityDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndicatorDef() {
		return indicatorDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListDef() {
		return listDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListDef_Argument() {
		return (EReference)listDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultipleAtomicDataDef() {
		return multipleAtomicDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultipleAtomicBufferedDataDef() {
		return multipleAtomicBufferedDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultipleAtomicBufferedDataDef_Argument() {
		return (EReference)multipleAtomicBufferedDataDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultipleCompoundDataDef() {
		return multipleCompoundDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultipleDataDef() {
		return multipleDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultipleDataDef_Dimension() {
		return (EAttribute)multipleDataDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericDef() {
		return numericDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointerDef() {
		return pointerDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScrollerDef() {
		return scrollerDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringDef() {
		return stringDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrollerDef() {
		return strollerDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrollerDef_Length() {
		return (EAttribute)strollerDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryAtomicDataDef() {
		return unaryAtomicDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryAtomicBufferedDataDef() {
		return unaryAtomicBufferedDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryBufferedDataDef() {
		return unaryBufferedDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryCompoundDataDef() {
		return unaryCompoundDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryDataDef() {
		return unaryDataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWrapperDef() {
		return wrapperDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWrapperDef_Argument() {
		return (EReference)wrapperDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBinaryType() {
		return binaryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataDefType() {
		return dataDefTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDatetimeType() {
		return datetimeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDateFormat() {
		return dateFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDecimalType() {
		return decimalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFloatingType() {
		return floatingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeFormat() {
		return timeFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QIntegratedLanguageDataDefFactory getIntegratedLanguageDataDefFactory() {
		return (QIntegratedLanguageDataDefFactory)getEFactoryInstance();
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
		adapterDefEClass = createEClass(ADAPTER_DEF);

		arrayDefEClass = createEClass(ARRAY_DEF);
		createEAttribute(arrayDefEClass, ARRAY_DEF__ORDER);

		atomicDataDefEClass = createEClass(ATOMIC_DATA_DEF);

		binaryDefEClass = createEClass(BINARY_DEF);
		createEAttribute(binaryDefEClass, BINARY_DEF__TYPE);
		createEAttribute(binaryDefEClass, BINARY_DEF__UNSIGNED);

		bufferDefEClass = createEClass(BUFFER_DEF);

		bufferedDataDefEClass = createEClass(BUFFERED_DATA_DEF);

		characterDefEClass = createEClass(CHARACTER_DEF);
		createEAttribute(characterDefEClass, CHARACTER_DEF__LENGTH);
		createEAttribute(characterDefEClass, CHARACTER_DEF__VARYING);

		compoundDataDefEClass = createEClass(COMPOUND_DATA_DEF);
		createEAttribute(compoundDataDefEClass, COMPOUND_DATA_DEF__CLASS_DELEGATOR);
		createEReference(compoundDataDefEClass, COMPOUND_DATA_DEF__ELEMENTS);
		createEAttribute(compoundDataDefEClass, COMPOUND_DATA_DEF__PREFIX);
		createEAttribute(compoundDataDefEClass, COMPOUND_DATA_DEF__QUALIFIED);

		dataDefEClass = createEClass(DATA_DEF);
		createEAttribute(dataDefEClass, DATA_DEF__FORMULAS);

		dataAreaDefEClass = createEClass(DATA_AREA_DEF);
		createEAttribute(dataAreaDefEClass, DATA_AREA_DEF__EXTERNAL_NAME);

		dataStructDefEClass = createEClass(DATA_STRUCT_DEF);
		createEAttribute(dataStructDefEClass, DATA_STRUCT_DEF__LENGTH);

		datetimeDefEClass = createEClass(DATETIME_DEF);
		createEAttribute(datetimeDefEClass, DATETIME_DEF__TYPE);
		createEAttribute(datetimeDefEClass, DATETIME_DEF__DATE_FORMAT);
		createEAttribute(datetimeDefEClass, DATETIME_DEF__TIME_FORMAT);

		decimalDefEClass = createEClass(DECIMAL_DEF);
		createEAttribute(decimalDefEClass, DECIMAL_DEF__PRECISION);
		createEAttribute(decimalDefEClass, DECIMAL_DEF__SCALE);
		createEAttribute(decimalDefEClass, DECIMAL_DEF__TYPE);

		enumDefEClass = createEClass(ENUM_DEF);
		createEReference(enumDefEClass, ENUM_DEF__DELEGATE);
		createEAttribute(enumDefEClass, ENUM_DEF__KLASS);

		floatingDefEClass = createEClass(FLOATING_DEF);
		createEAttribute(floatingDefEClass, FLOATING_DEF__TYPE);

		hexadecimalDefEClass = createEClass(HEXADECIMAL_DEF);
		createEAttribute(hexadecimalDefEClass, HEXADECIMAL_DEF__LENGTH);

		identityDefEClass = createEClass(IDENTITY_DEF);

		indicatorDefEClass = createEClass(INDICATOR_DEF);

		listDefEClass = createEClass(LIST_DEF);
		createEReference(listDefEClass, LIST_DEF__ARGUMENT);

		multipleAtomicDataDefEClass = createEClass(MULTIPLE_ATOMIC_DATA_DEF);

		multipleAtomicBufferedDataDefEClass = createEClass(MULTIPLE_ATOMIC_BUFFERED_DATA_DEF);
		createEReference(multipleAtomicBufferedDataDefEClass, MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__ARGUMENT);

		multipleCompoundDataDefEClass = createEClass(MULTIPLE_COMPOUND_DATA_DEF);

		multipleDataDefEClass = createEClass(MULTIPLE_DATA_DEF);
		createEAttribute(multipleDataDefEClass, MULTIPLE_DATA_DEF__DIMENSION);

		numericDefEClass = createEClass(NUMERIC_DEF);

		pointerDefEClass = createEClass(POINTER_DEF);

		scrollerDefEClass = createEClass(SCROLLER_DEF);

		stringDefEClass = createEClass(STRING_DEF);

		strollerDefEClass = createEClass(STROLLER_DEF);
		createEAttribute(strollerDefEClass, STROLLER_DEF__LENGTH);

		unaryAtomicDataDefEClass = createEClass(UNARY_ATOMIC_DATA_DEF);

		unaryAtomicBufferedDataDefEClass = createEClass(UNARY_ATOMIC_BUFFERED_DATA_DEF);

		unaryBufferedDataDefEClass = createEClass(UNARY_BUFFERED_DATA_DEF);

		unaryCompoundDataDefEClass = createEClass(UNARY_COMPOUND_DATA_DEF);

		unaryDataDefEClass = createEClass(UNARY_DATA_DEF);

		wrapperDefEClass = createEClass(WRAPPER_DEF);
		createEReference(wrapperDefEClass, WRAPPER_DEF__ARGUMENT);

		// Create enums
		binaryTypeEEnum = createEEnum(BINARY_TYPE);
		dataDefTypeEEnum = createEEnum(DATA_DEF_TYPE);
		datetimeTypeEEnum = createEEnum(DATETIME_TYPE);
		dateFormatEEnum = createEEnum(DATE_FORMAT);
		decimalTypeEEnum = createEEnum(DECIMAL_TYPE);
		floatingTypeEEnum = createEEnum(FLOATING_TYPE);
		timeFormatEEnum = createEEnum(TIME_FORMAT);
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
		QIntegratedLanguageDataPackage theIntegratedLanguageDataPackage = (QIntegratedLanguageDataPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataPackage.eNS_URI);
		QIntegratedLanguageDataTermPackage theIntegratedLanguageDataTermPackage = (QIntegratedLanguageDataTermPackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageDataTermPackage.eNS_URI);
		QIntegratedLanguageCorePackage theIntegratedLanguageCorePackage = (QIntegratedLanguageCorePackage)EPackage.Registry.INSTANCE.getEPackage(QIntegratedLanguageCorePackage.eNS_URI);
		QMachineInterfaceCorePackage theMachineInterfaceCorePackage = (QMachineInterfaceCorePackage)EPackage.Registry.INSTANCE.getEPackage(QMachineInterfaceCorePackage.eNS_URI);

		// Create type parameters
		ETypeParameter arrayDefEClass_D = addETypeParameter(arrayDefEClass, "D");
		ETypeParameter atomicDataDefEClass_D = addETypeParameter(atomicDataDefEClass, "D");
		ETypeParameter bufferedDataDefEClass_D = addETypeParameter(bufferedDataDefEClass, "D");
		ETypeParameter compoundDataDefEClass_D = addETypeParameter(compoundDataDefEClass, "D");
		ETypeParameter compoundDataDefEClass_E = addETypeParameter(compoundDataDefEClass, "E");
		ETypeParameter dataDefEClass_D = addETypeParameter(dataDefEClass, "D");
		ETypeParameter dataAreaDefEClass_D = addETypeParameter(dataAreaDefEClass, "D");
		ETypeParameter enumDefEClass_E = addETypeParameter(enumDefEClass, "E");
		ETypeParameter enumDefEClass_D = addETypeParameter(enumDefEClass, "D");
		ETypeParameter listDefEClass_D = addETypeParameter(listDefEClass, "D");
		ETypeParameter multipleAtomicDataDefEClass_D = addETypeParameter(multipleAtomicDataDefEClass, "D");
		ETypeParameter multipleAtomicBufferedDataDefEClass_D = addETypeParameter(multipleAtomicBufferedDataDefEClass, "D");
		ETypeParameter multipleCompoundDataDefEClass_D = addETypeParameter(multipleCompoundDataDefEClass, "D");
		ETypeParameter multipleCompoundDataDefEClass_E = addETypeParameter(multipleCompoundDataDefEClass, "E");
		ETypeParameter multipleDataDefEClass_D = addETypeParameter(multipleDataDefEClass, "D");
		ETypeParameter scrollerDefEClass_D = addETypeParameter(scrollerDefEClass, "D");
		ETypeParameter strollerDefEClass_D = addETypeParameter(strollerDefEClass, "D");
		ETypeParameter unaryAtomicDataDefEClass_D = addETypeParameter(unaryAtomicDataDefEClass, "D");
		ETypeParameter unaryAtomicBufferedDataDefEClass_D = addETypeParameter(unaryAtomicBufferedDataDefEClass, "D");
		ETypeParameter unaryBufferedDataDefEClass_D = addETypeParameter(unaryBufferedDataDefEClass, "D");
		ETypeParameter unaryCompoundDataDefEClass_D = addETypeParameter(unaryCompoundDataDefEClass, "D");
		ETypeParameter unaryCompoundDataDefEClass_E = addETypeParameter(unaryCompoundDataDefEClass, "E");
		ETypeParameter unaryDataDefEClass_D = addETypeParameter(unaryDataDefEClass, "D");
		ETypeParameter wrapperDefEClass_D = addETypeParameter(wrapperDefEClass, "D");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theIntegratedLanguageDataPackage.getArray());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		arrayDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getData());
		atomicDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getBufferedData());
		bufferedDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getStruct());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		compoundDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		compoundDataDefEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getData());
		dataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getBufferedElement());
		dataAreaDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theMachineInterfaceCorePackage.getJavaEnum());
		enumDefEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getBufferedElement());
		enumDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		listDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		multipleAtomicDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getBufferedList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		multipleAtomicBufferedDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getStroller());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		multipleCompoundDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		multipleCompoundDataDefEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		multipleDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getScroller());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		scrollerDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getStroller());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		strollerDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getData());
		unaryAtomicDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getBufferedElement());
		unaryAtomicBufferedDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getBufferedElement());
		unaryBufferedDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getStruct());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		unaryCompoundDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		unaryCompoundDataDefEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getData());
		unaryDataDefEClass_D.getEBounds().add(g1);
		g1 = createEGenericType(theIntegratedLanguageDataPackage.getBufferedElement());
		wrapperDefEClass_D.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getUnaryAtomicDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getAdapter());
		g1.getETypeArguments().add(g2);
		adapterDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultipleAtomicBufferedDataDef());
		g2 = createEGenericType(arrayDefEClass_D);
		g1.getETypeArguments().add(g2);
		arrayDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(atomicDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		atomicDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getBinary());
		g1.getETypeArguments().add(g2);
		binaryDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getBufferedElement());
		g1.getETypeArguments().add(g2);
		bufferDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(bufferedDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		bufferedDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getCharacter());
		g1.getETypeArguments().add(g2);
		characterDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(compoundDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		compoundDataDefEClass.getEGenericSuperTypes().add(g1);
		dataDefEClass.getESuperTypes().add(theIntegratedLanguageCorePackage.getObject());
		g1 = createEGenericType(this.getUnaryBufferedDataDef());
		g2 = createEGenericType(dataAreaDefEClass_D);
		g1.getETypeArguments().add(g2);
		dataAreaDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getWrapperDef());
		g2 = createEGenericType(dataAreaDefEClass_D);
		g1.getETypeArguments().add(g2);
		dataAreaDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryCompoundDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getDataStruct());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getBufferedDataDef());
		g2.getETypeArguments().add(g3);
		EGenericType g4 = createEGenericType();
		g3.getETypeArguments().add(g4);
		dataStructDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryBufferedDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getDataStruct());
		g1.getETypeArguments().add(g2);
		dataStructDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getDatetime());
		g1.getETypeArguments().add(g2);
		datetimeDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getDecimal());
		g1.getETypeArguments().add(g2);
		decimalDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(enumDefEClass_D);
		g1.getETypeArguments().add(g2);
		enumDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getFloating());
		g1.getETypeArguments().add(g2);
		floatingDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getHexadecimal());
		g1.getETypeArguments().add(g2);
		hexadecimalDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getIdentity());
		g1.getETypeArguments().add(g2);
		identityDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getIndicator());
		g1.getETypeArguments().add(g2);
		indicatorDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultipleAtomicDataDef());
		g2 = createEGenericType(listDefEClass_D);
		g1.getETypeArguments().add(g2);
		listDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultipleDataDef());
		g2 = createEGenericType(multipleAtomicDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		multipleAtomicDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAtomicDataDef());
		g2 = createEGenericType(multipleAtomicDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		multipleAtomicDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultipleAtomicDataDef());
		g2 = createEGenericType(multipleAtomicBufferedDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		multipleAtomicBufferedDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBufferedDataDef());
		g2 = createEGenericType(multipleAtomicBufferedDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		multipleAtomicBufferedDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultipleDataDef());
		g2 = createEGenericType(multipleCompoundDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		multipleCompoundDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCompoundDataDef());
		g2 = createEGenericType(multipleCompoundDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(multipleCompoundDataDefEClass_E);
		g1.getETypeArguments().add(g2);
		multipleCompoundDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(multipleDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		multipleDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getNumeric());
		g1.getETypeArguments().add(g2);
		numericDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getPointer());
		g1.getETypeArguments().add(g2);
		pointerDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultipleAtomicBufferedDataDef());
		g2 = createEGenericType(scrollerDefEClass_D);
		g1.getETypeArguments().add(g2);
		scrollerDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType(theIntegratedLanguageDataPackage.getString());
		g1.getETypeArguments().add(g2);
		stringDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultipleCompoundDataDef());
		g2 = createEGenericType(strollerDefEClass_D);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theIntegratedLanguageDataTermPackage.getDataTerm());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getBufferedDataDef());
		g2.getETypeArguments().add(g3);
		g4 = createEGenericType();
		g3.getETypeArguments().add(g4);
		strollerDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBufferedDataDef());
		g2 = createEGenericType(strollerDefEClass_D);
		g1.getETypeArguments().add(g2);
		strollerDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryDataDef());
		g2 = createEGenericType(unaryAtomicDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		unaryAtomicDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAtomicDataDef());
		g2 = createEGenericType(unaryAtomicDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		unaryAtomicDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryAtomicDataDef());
		g2 = createEGenericType(unaryAtomicBufferedDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		unaryAtomicBufferedDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBufferedDataDef());
		g2 = createEGenericType(unaryAtomicBufferedDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		unaryAtomicBufferedDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryDataDef());
		g2 = createEGenericType(unaryBufferedDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		unaryBufferedDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBufferedDataDef());
		g2 = createEGenericType(unaryBufferedDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		unaryBufferedDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUnaryDataDef());
		g2 = createEGenericType(unaryCompoundDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		unaryCompoundDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCompoundDataDef());
		g2 = createEGenericType(unaryCompoundDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(unaryCompoundDataDefEClass_E);
		g1.getETypeArguments().add(g2);
		unaryCompoundDataDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(unaryDataDefEClass_D);
		g1.getETypeArguments().add(g2);
		unaryDataDefEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(adapterDefEClass, QAdapterDef.class, "AdapterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayDefEClass, QArrayDef.class, "ArrayDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayDef_Order(), theIntegratedLanguageDataPackage.getSortDirection(), "order", "A", 0, 1, QArrayDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicDataDefEClass, QAtomicDataDef.class, "AtomicDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryDefEClass, QBinaryDef.class, "BinaryDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryDef_Type(), this.getBinaryType(), "type", null, 1, 1, QBinaryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryDef_Unsigned(), ecorePackage.getEBoolean(), "unsigned", null, 0, 1, QBinaryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bufferDefEClass, QBufferDef.class, "BufferDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bufferedDataDefEClass, QBufferedDataDef.class, "BufferedDataDef", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(bufferedDataDefEClass, ecorePackage.getEInt(), "getLength", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(bufferedDataDefEClass, ecorePackage.getEInt(), "getSize", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(characterDefEClass, QCharacterDef.class, "CharacterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterDef_Length(), ecorePackage.getEInt(), "length", null, 1, 1, QCharacterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterDef_Varying(), ecorePackage.getEBoolean(), "varying", null, 0, 1, QCharacterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compoundDataDefEClass, QCompoundDataDef.class, "CompoundDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompoundDataDef_ClassDelegator(), ecorePackage.getEString(), "classDelegator", null, 0, 1, QCompoundDataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(compoundDataDefEClass_E);
		initEReference(getCompoundDataDef_Elements(), g1, null, "elements", null, 0, -1, QCompoundDataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompoundDataDef_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, QCompoundDataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompoundDataDef_Qualified(), ecorePackage.getEBoolean(), "qualified", null, 0, 1, QCompoundDataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataDefEClass, QDataDef.class, "DataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataDef_Formulas(), ecorePackage.getEString(), "formulas", null, 0, -1, QDataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(dataDefEClass, null, "getDataClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(dataDefEClass_D);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(dataDefEClass, null, "getJavaClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(dataDefEClass, this.getDataDefType(), "getDataDefType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataAreaDefEClass, QDataAreaDef.class, "DataAreaDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAreaDef_ExternalName(), ecorePackage.getEString(), "externalName", null, 0, 1, QDataAreaDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataStructDefEClass, QDataStructDef.class, "DataStructDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataStructDef_Length(), ecorePackage.getEInt(), "length", null, 0, 1, QDataStructDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datetimeDefEClass, QDatetimeDef.class, "DatetimeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatetimeDef_Type(), this.getDatetimeType(), "type", null, 1, 1, QDatetimeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeDef_DateFormat(), this.getDateFormat(), "dateFormat", null, 0, 1, QDatetimeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeDef_TimeFormat(), this.getTimeFormat(), "timeFormat", null, 0, 1, QDatetimeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalDefEClass, QDecimalDef.class, "DecimalDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalDef_Precision(), ecorePackage.getEInt(), "precision", null, 1, 1, QDecimalDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalDef_Scale(), ecorePackage.getEInt(), "scale", null, 0, 1, QDecimalDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalDef_Type(), this.getDecimalType(), "type", null, 0, 1, QDecimalDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumDefEClass, QEnumDef.class, "EnumDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getBufferedDataDef());
		g2 = createEGenericType(enumDefEClass_D);
		g1.getETypeArguments().add(g2);
		initEReference(getEnumDef_Delegate(), g1, null, "delegate", null, 1, 1, QEnumDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(enumDefEClass_E);
		g1.getETypeArguments().add(g2);
		initEAttribute(getEnumDef_Klass(), g1, "klass", null, 1, 1, QEnumDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatingDefEClass, QFloatingDef.class, "FloatingDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatingDef_Type(), this.getFloatingType(), "type", null, 1, 1, QFloatingDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hexadecimalDefEClass, QHexadecimalDef.class, "HexadecimalDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHexadecimalDef_Length(), ecorePackage.getEInt(), "length", null, 1, 1, QHexadecimalDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identityDefEClass, QIdentityDef.class, "IdentityDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indicatorDefEClass, QIndicatorDef.class, "IndicatorDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listDefEClass, QListDef.class, "ListDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getUnaryAtomicDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getListDef_Argument(), g1, null, "argument", null, 0, 1, QListDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleAtomicDataDefEClass, QMultipleAtomicDataDef.class, "MultipleAtomicDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(multipleAtomicDataDefEClass, null, "getArgument", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getUnaryAtomicDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(multipleAtomicBufferedDataDefEClass, QMultipleAtomicBufferedDataDef.class, "MultipleAtomicBufferedDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getUnaryAtomicBufferedDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getMultipleAtomicBufferedDataDef_Argument(), g1, null, "argument", null, 1, 1, QMultipleAtomicBufferedDataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleCompoundDataDefEClass, QMultipleCompoundDataDef.class, "MultipleCompoundDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleDataDefEClass, QMultipleDataDef.class, "MultipleDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleDataDef_Dimension(), ecorePackage.getEInt(), "dimension", null, 1, 1, QMultipleDataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericDefEClass, QNumericDef.class, "NumericDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pointerDefEClass, QPointerDef.class, "PointerDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scrollerDefEClass, QScrollerDef.class, "ScrollerDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringDefEClass, QStringDef.class, "StringDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strollerDefEClass, QStrollerDef.class, "StrollerDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrollerDef_Length(), ecorePackage.getEInt(), "length", null, 0, 1, QStrollerDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryAtomicDataDefEClass, QUnaryAtomicDataDef.class, "UnaryAtomicDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryAtomicBufferedDataDefEClass, QUnaryAtomicBufferedDataDef.class, "UnaryAtomicBufferedDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(unaryAtomicBufferedDataDefEClass, null, "setLength", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "length", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unaryBufferedDataDefEClass, QUnaryBufferedDataDef.class, "UnaryBufferedDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryCompoundDataDefEClass, QUnaryCompoundDataDef.class, "UnaryCompoundDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryDataDefEClass, QUnaryDataDef.class, "UnaryDataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wrapperDefEClass, QWrapperDef.class, "WrapperDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getUnaryBufferedDataDef());
		g2 = createEGenericType(wrapperDefEClass_D);
		g1.getETypeArguments().add(g2);
		initEReference(getWrapperDef_Argument(), g1, null, "argument", null, 1, 1, QWrapperDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(binaryTypeEEnum, BinaryType.class, "BinaryType");
		addEEnumLiteral(binaryTypeEEnum, BinaryType.BYTE);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.SHORT);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.INTEGER);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.LONG);

		initEEnum(dataDefTypeEEnum, DataDefType.class, "DataDefType");
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.ADAPTER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.ARRAY);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.BINARY);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.BUFFER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.CHARACTER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.DATA_STRUCT);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.DATETIME);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.DECIMAL);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.FLOATING);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.HEXADECIMAL);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.IDENTITY);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.INDICATOR);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.LIST);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.POINTER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.SCROLLER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.STRING);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.STROLLER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.STRUCT);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.WRAPPER);

		initEEnum(datetimeTypeEEnum, DatetimeType.class, "DatetimeType");
		addEEnumLiteral(datetimeTypeEEnum, DatetimeType.DATE);
		addEEnumLiteral(datetimeTypeEEnum, DatetimeType.TIME);
		addEEnumLiteral(datetimeTypeEEnum, DatetimeType.TIME_STAMP);

		initEEnum(dateFormatEEnum, DateFormat.class, "DateFormat");
		addEEnumLiteral(dateFormatEEnum, DateFormat.MDY);
		addEEnumLiteral(dateFormatEEnum, DateFormat.DMY);
		addEEnumLiteral(dateFormatEEnum, DateFormat.YMD);
		addEEnumLiteral(dateFormatEEnum, DateFormat.YYMD);
		addEEnumLiteral(dateFormatEEnum, DateFormat.JUL);
		addEEnumLiteral(dateFormatEEnum, DateFormat.ISO);
		addEEnumLiteral(dateFormatEEnum, DateFormat.USA);
		addEEnumLiteral(dateFormatEEnum, DateFormat.EUR);
		addEEnumLiteral(dateFormatEEnum, DateFormat.JIS);
		addEEnumLiteral(dateFormatEEnum, DateFormat.JOBRUN);

		initEEnum(decimalTypeEEnum, DecimalType.class, "DecimalType");
		addEEnumLiteral(decimalTypeEEnum, DecimalType.ZONED);
		addEEnumLiteral(decimalTypeEEnum, DecimalType.PACKED);

		initEEnum(floatingTypeEEnum, FloatingType.class, "FloatingType");
		addEEnumLiteral(floatingTypeEEnum, FloatingType.SINGLE);
		addEEnumLiteral(floatingTypeEEnum, FloatingType.DOUBLE);

		initEEnum(timeFormatEEnum, TimeFormat.class, "TimeFormat");
		addEEnumLiteral(timeFormatEEnum, TimeFormat.HMS);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.ISO);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.USA);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.EUR);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.JIS);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.JOBRUN);
	}

} // IntegratedLanguageDataDefPackageImpl
