/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.def;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;

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
 * @see org.smeup.sys.il.data.def.QIntegratedLanguageDataDefFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageDataDefPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "def";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/data/def";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-data-def";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageDataDefPackage eINSTANCE = org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.DataDefImpl <em>Data Def</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.DataDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDataDef()
	 * @generated
	 */
	int DATA_DEF = 8;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__FORMULAS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Def</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_DEF_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.UnaryDataDefImpl <em>Unary Data Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.UnaryDataDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getUnaryDataDef()
	 * @generated
	 */
	int UNARY_DATA_DEF = 30;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNARY_DATA_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Unary Data Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DATA_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.UnaryAtomicDataDefImpl <em>Unary Atomic Data Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.UnaryAtomicDataDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getUnaryAtomicDataDef()
	 * @generated
	 */
	int UNARY_ATOMIC_DATA_DEF = 27;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_DATA_DEF__FORMULAS = UNARY_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Unary Atomic Data Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_DATA_DEF_FEATURE_COUNT = UNARY_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.def.impl.AdapterDefImpl
	 * <em>Adapter Def</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.def.impl.AdapterDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getAdapterDef()
	 * @generated
	 */
	int ADAPTER_DEF = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.MultipleDataDefImpl <em>Multiple Data Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.MultipleDataDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getMultipleDataDef()
	 * @generated
	 */
	int MULTIPLE_DATA_DEF = 21;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.MultipleAtomicDataDefImpl <em>Multiple Atomic Data Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.MultipleAtomicDataDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getMultipleAtomicDataDef()
	 * @generated
	 */
	int MULTIPLE_ATOMIC_DATA_DEF = 18;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.MultipleAtomicBufferedDataDefImpl <em>Multiple Atomic Buffered Data Def</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.MultipleAtomicBufferedDataDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getMultipleAtomicBufferedDataDef()
	 * @generated
	 */
	int MULTIPLE_ATOMIC_BUFFERED_DATA_DEF = 19;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.ArrayDefImpl <em>Array Def</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.ArrayDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getArrayDef()
	 * @generated
	 */
	int ARRAY_DEF = 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.AtomicDataDefImpl <em>Atomic Data Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.AtomicDataDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getAtomicDataDef()
	 * @generated
	 */
	int ATOMIC_DATA_DEF = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.UnaryAtomicBufferedDataDefImpl <em>Unary Atomic Buffered Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.UnaryAtomicBufferedDataDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getUnaryAtomicBufferedDataDef()
	 * @generated
	 */
	int UNARY_ATOMIC_BUFFERED_DATA_DEF = 28;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ADAPTER_DEF__FORMULAS = UNARY_ATOMIC_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Adapter Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_DEF_FEATURE_COUNT = UNARY_ATOMIC_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_DEF__DIMENSION = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Data Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_DATA_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_DEF__FORMULAS = MULTIPLE_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_DEF__DIMENSION = MULTIPLE_DATA_DEF__DIMENSION;

	/**
	 * The number of structural features of the '<em>Multiple Atomic Data Def</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_DATA_DEF_FEATURE_COUNT = MULTIPLE_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__FORMULAS = MULTIPLE_ATOMIC_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__DIMENSION = MULTIPLE_ATOMIC_DATA_DEF__DIMENSION;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__ARGUMENT = MULTIPLE_ATOMIC_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Atomic Buffered Data Def</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT = MULTIPLE_ATOMIC_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEF__FORMULAS = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEF__DIMENSION = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__DIMENSION;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEF__ARGUMENT = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__ARGUMENT;

	/**
	 * The number of structural features of the '<em>Array Def</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEF_FEATURE_COUNT = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Atomic Data Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DATA_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS = UNARY_ATOMIC_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Unary Atomic Buffered Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT = UNARY_ATOMIC_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.BinaryDefImpl <em>Binary Def</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.BinaryDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getBinaryDef()
	 * @generated
	 */
	int BINARY_DEF = 3;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF__TYPE = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unsigned</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF__UNSIGNED = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.BufferDefImpl <em>Buffer Def</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.BufferDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getBufferDef()
	 * @generated
	 */
	int BUFFER_DEF = 4;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BUFFER_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Buffer Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.QBufferedDataDef <em>Buffered Data Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.data.def.QBufferedDataDef
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getBufferedDataDef()
	 * @generated
	 */
	int BUFFERED_DATA_DEF = 5;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Buffered Data Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFERED_DATA_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.def.impl.CharacterDefImpl
	 * <em>Character Def</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.def.impl.CharacterDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getCharacterDef()
	 * @generated
	 */
	int CHARACTER_DEF = 6;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF__LENGTH = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Varying</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF__VARYING = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Character Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.CompoundDataDefImpl <em>Compound Data Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.CompoundDataDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getCompoundDataDef()
	 * @generated
	 */
	int COMPOUND_DATA_DEF = 7;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Class Delegator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_DEF__CLASS_DELEGATOR = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_DEF__ELEMENTS = DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_DEF__PREFIX = DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualified</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_DEF__QUALIFIED = DATA_DEF_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Compound Data Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_DATA_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.UnaryCompoundDataDefImpl <em>Unary Compound Data Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.UnaryCompoundDataDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getUnaryCompoundDataDef()
	 * @generated
	 */
	int UNARY_COMPOUND_DATA_DEF = 29;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_DEF__FORMULAS = UNARY_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Class Delegator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_DEF__CLASS_DELEGATOR = UNARY_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_DEF__ELEMENTS = UNARY_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_DEF__PREFIX = UNARY_DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualified</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_DEF__QUALIFIED = UNARY_DATA_DEF_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Unary Compound Data Def</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_COMPOUND_DATA_DEF_FEATURE_COUNT = UNARY_DATA_DEF_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.DataStructDefImpl <em>Data Struct Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.DataStructDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDataStructDef()
	 * @generated
	 */
	int DATA_STRUCT_DEF = 9;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_DEF__FORMULAS = UNARY_COMPOUND_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Class Delegator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_DEF__CLASS_DELEGATOR = UNARY_COMPOUND_DATA_DEF__CLASS_DELEGATOR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_DEF__ELEMENTS = UNARY_COMPOUND_DATA_DEF__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_DEF__PREFIX = UNARY_COMPOUND_DATA_DEF__PREFIX;

	/**
	 * The feature id for the '<em><b>Qualified</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_DEF__QUALIFIED = UNARY_COMPOUND_DATA_DEF__QUALIFIED;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_DEF__LENGTH = UNARY_COMPOUND_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Struct Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCT_DEF_FEATURE_COUNT = UNARY_COMPOUND_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.def.impl.DatetimeDefImpl
	 * <em>Datetime Def</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.def.impl.DatetimeDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDatetimeDef()
	 * @generated
	 */
	int DATETIME_DEF = 10;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF__TYPE = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF__FORMAT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Datetime Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.def.impl.DecimalDefImpl
	 * <em>Decimal Def</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.def.impl.DecimalDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDecimalDef()
	 * @generated
	 */
	int DECIMAL_DEF = 11;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__PRECISION = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__SCALE = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__TYPE = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Decimal Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.EnumDefImpl <em>Enum Def</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.EnumDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getEnumDef()
	 * @generated
	 */
	int ENUM_DEF = 12;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF__FORMULAS = UNARY_ATOMIC_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Delegate</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF__DELEGATE = UNARY_ATOMIC_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Klass</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF__KLASS = UNARY_ATOMIC_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Def</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ENUM_DEF_FEATURE_COUNT = UNARY_ATOMIC_DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.def.impl.FloatingDefImpl
	 * <em>Floating Def</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.def.impl.FloatingDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getFloatingDef()
	 * @generated
	 */
	int FLOATING_DEF = 13;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF__TYPE = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Floating Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.HexadecimalDefImpl <em>Hexadecimal Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.HexadecimalDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getHexadecimalDef()
	 * @generated
	 */
	int HEXADECIMAL_DEF = 14;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int HEXADECIMAL_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int HEXADECIMAL_DEF__LENGTH = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hexadecimal Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEXADECIMAL_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.def.impl.IdentityDefImpl
	 * <em>Identity Def</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.def.impl.IdentityDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getIdentityDef()
	 * @generated
	 */
	int IDENTITY_DEF = 15;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int IDENTITY_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Identity Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.def.impl.IndicatorDefImpl
	 * <em>Indicator Def</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.def.impl.IndicatorDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getIndicatorDef()
	 * @generated
	 */
	int INDICATOR_DEF = 16;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int INDICATOR_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Indicator Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATOR_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.ListDefImpl <em>List Def</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.ListDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getListDef()
	 * @generated
	 */
	int LIST_DEF = 17;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LIST_DEF__FORMULAS = MULTIPLE_ATOMIC_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LIST_DEF__DIMENSION = MULTIPLE_ATOMIC_DATA_DEF__DIMENSION;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DEF__ARGUMENT = MULTIPLE_ATOMIC_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Def</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LIST_DEF_FEATURE_COUNT = MULTIPLE_ATOMIC_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.MultipleCompoundDataDefImpl <em>Multiple Compound Data Def</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.MultipleCompoundDataDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getMultipleCompoundDataDef()
	 * @generated
	 */
	int MULTIPLE_COMPOUND_DATA_DEF = 20;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_DEF__FORMULAS = MULTIPLE_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_DEF__DIMENSION = MULTIPLE_DATA_DEF__DIMENSION;

	/**
	 * The feature id for the '<em><b>Class Delegator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_DEF__CLASS_DELEGATOR = MULTIPLE_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_DEF__ELEMENTS = MULTIPLE_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_DEF__PREFIX = MULTIPLE_DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualified</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_DEF__QUALIFIED = MULTIPLE_DATA_DEF_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multiple Compound Data Def</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_COMPOUND_DATA_DEF_FEATURE_COUNT = MULTIPLE_DATA_DEF_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.def.impl.NumericDefImpl
	 * <em>Numeric Def</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.def.impl.NumericDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getNumericDef()
	 * @generated
	 */
	int NUMERIC_DEF = 22;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Numeric Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.def.impl.PointerDefImpl
	 * <em>Pointer Def</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.def.impl.PointerDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getPointerDef()
	 * @generated
	 */
	int POINTER_DEF = 23;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int POINTER_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int POINTER_DEF__TARGET = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pointer Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.def.impl.ScrollerDefImpl
	 * <em>Scroller Def</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.def.impl.ScrollerDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getScrollerDef()
	 * @generated
	 */
	int SCROLLER_DEF = 24;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SCROLLER_DEF__FORMULAS = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SCROLLER_DEF__DIMENSION = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__DIMENSION;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER_DEF__ARGUMENT = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__ARGUMENT;

	/**
	 * The number of structural features of the '<em>Scroller Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLLER_DEF_FEATURE_COUNT = MULTIPLE_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.impl.StringDefImpl <em>String Def</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.def.impl.StringDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getStringDef()
	 * @generated
	 */
	int STRING_DEF = 25;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__FORMULAS = UNARY_ATOMIC_BUFFERED_DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>String Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF_FEATURE_COUNT = UNARY_ATOMIC_BUFFERED_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.def.impl.StrollerDefImpl
	 * <em>Stroller Def</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.def.impl.StrollerDefImpl
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getStrollerDef()
	 * @generated
	 */
	int STROLLER_DEF = 26;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF__FORMULAS = MULTIPLE_COMPOUND_DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF__DIMENSION = MULTIPLE_COMPOUND_DATA_DEF__DIMENSION;

	/**
	 * The feature id for the '<em><b>Class Delegator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF__CLASS_DELEGATOR = MULTIPLE_COMPOUND_DATA_DEF__CLASS_DELEGATOR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF__ELEMENTS = MULTIPLE_COMPOUND_DATA_DEF__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF__PREFIX = MULTIPLE_COMPOUND_DATA_DEF__PREFIX;

	/**
	 * The feature id for the '<em><b>Qualified</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF__QUALIFIED = MULTIPLE_COMPOUND_DATA_DEF__QUALIFIED;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF__LENGTH = MULTIPLE_COMPOUND_DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stroller Def</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROLLER_DEF_FEATURE_COUNT = MULTIPLE_COMPOUND_DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.BinaryType
	 * <em>Binary Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.def.BinaryType
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getBinaryType()
	 * @generated
	 */
	int BINARY_TYPE = 31;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.DataDefType
	 * <em>Data Def Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.def.DataDefType
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDataDefType()
	 * @generated
	 */
	int DATA_DEF_TYPE = 32;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.DatetimeType <em>Datetime Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.def.DatetimeType
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDatetimeType()
	 * @generated
	 */
	int DATETIME_TYPE = 33;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.DateFormat
	 * <em>Date Format</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.def.DateFormat
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDateFormat()
	 * @generated
	 */
	int DATE_FORMAT = 34;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.DecimalType
	 * <em>Decimal Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.data.def.DecimalType
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDecimalType()
	 * @generated
	 */
	int DECIMAL_TYPE = 35;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.def.FloatingType <em>Floating Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.def.FloatingType
	 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getFloatingType()
	 * @generated
	 */
	int FLOATING_TYPE = 36;

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.def.QAdapterDef <em>Adapter Def</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Adapter Def</em>'.
	 * @see org.smeup.sys.il.data.def.QAdapterDef
	 * @generated
	 */
	EClass getAdapterDef();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.def.QArrayDef <em>Array Def</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Array Def</em>'.
	 * @see org.smeup.sys.il.data.def.QArrayDef
	 * @generated
	 */
	EClass getArrayDef();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QAtomicDataDef <em>Atomic Data Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Data Def</em>'.
	 * @see org.smeup.sys.il.data.def.QAtomicDataDef
	 * @generated
	 */
	EClass getAtomicDataDef();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.def.QBinaryDef <em>Binary Def</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Binary Def</em>'.
	 * @see org.smeup.sys.il.data.def.QBinaryDef
	 * @generated
	 */
	EClass getBinaryDef();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.data.def.QBinaryDef#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.smeup.sys.il.data.def.QBinaryDef#getType()
	 * @see #getBinaryDef()
	 * @generated
	 */
	EAttribute getBinaryDef_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QBinaryDef#isUnsigned <em>Unsigned</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsigned</em>'.
	 * @see org.smeup.sys.il.data.def.QBinaryDef#isUnsigned()
	 * @see #getBinaryDef()
	 * @generated
	 */
	EAttribute getBinaryDef_Unsigned();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.def.QBufferDef <em>Buffer Def</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Buffer Def</em>'.
	 * @see org.smeup.sys.il.data.def.QBufferDef
	 * @generated
	 */
	EClass getBufferDef();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.def.QBufferedDataDef
	 * <em>Buffered Data Def</em>} '. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Buffered Data Def</em>'.
	 * @see org.smeup.sys.il.data.def.QBufferedDataDef
	 * @generated
	 */
	EClass getBufferedDataDef();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QCharacterDef <em>Character Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Def</em>'.
	 * @see org.smeup.sys.il.data.def.QCharacterDef
	 * @generated
	 */
	EClass getCharacterDef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QCharacterDef#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.smeup.sys.il.data.def.QCharacterDef#getLength()
	 * @see #getCharacterDef()
	 * @generated
	 */
	EAttribute getCharacterDef_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QCharacterDef#isVarying <em>Varying</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varying</em>'.
	 * @see org.smeup.sys.il.data.def.QCharacterDef#isVarying()
	 * @see #getCharacterDef()
	 * @generated
	 */
	EAttribute getCharacterDef_Varying();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.def.QCompoundDataDef
	 * <em>Compound Data Def</em>} '. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Compound Data Def</em>'.
	 * @see org.smeup.sys.il.data.def.QCompoundDataDef
	 * @generated
	 */
	EClass getCompoundDataDef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QCompoundDataDef#getClassDelegator <em>Class Delegator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Delegator</em>'.
	 * @see org.smeup.sys.il.data.def.QCompoundDataDef#getClassDelegator()
	 * @see #getCompoundDataDef()
	 * @generated
	 */
	EAttribute getCompoundDataDef_ClassDelegator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.il.data.def.QCompoundDataDef#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.smeup.sys.il.data.def.QCompoundDataDef#getElements()
	 * @see #getCompoundDataDef()
	 * @generated
	 */
	EReference getCompoundDataDef_Elements();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QCompoundDataDef#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.smeup.sys.il.data.def.QCompoundDataDef#getPrefix()
	 * @see #getCompoundDataDef()
	 * @generated
	 */
	EAttribute getCompoundDataDef_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QCompoundDataDef#isQualified <em>Qualified</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified</em>'.
	 * @see org.smeup.sys.il.data.def.QCompoundDataDef#isQualified()
	 * @see #getCompoundDataDef()
	 * @generated
	 */
	EAttribute getCompoundDataDef_Qualified();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.def.QDataDef <em>Data Def</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Data Def</em>'.
	 * @see org.smeup.sys.il.data.def.QDataDef
	 * @generated
	 */
	EClass getDataDef();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.il.data.def.QDataDef#getFormulas <em>Formulas</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formulas</em>'.
	 * @see org.smeup.sys.il.data.def.QDataDef#getFormulas()
	 * @see #getDataDef()
	 * @generated
	 */
	EAttribute getDataDef_Formulas();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QDataStructDef <em>Data Struct Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Struct Def</em>'.
	 * @see org.smeup.sys.il.data.def.QDataStructDef
	 * @generated
	 */
	EClass getDataStructDef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QDataStructDef#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.smeup.sys.il.data.def.QDataStructDef#getLength()
	 * @see #getDataStructDef()
	 * @generated
	 */
	EAttribute getDataStructDef_Length();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QDatetimeDef <em>Datetime Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datetime Def</em>'.
	 * @see org.smeup.sys.il.data.def.QDatetimeDef
	 * @generated
	 */
	EClass getDatetimeDef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QDatetimeDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.smeup.sys.il.data.def.QDatetimeDef#getType()
	 * @see #getDatetimeDef()
	 * @generated
	 */
	EAttribute getDatetimeDef_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QDatetimeDef#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.smeup.sys.il.data.def.QDatetimeDef#getFormat()
	 * @see #getDatetimeDef()
	 * @generated
	 */
	EAttribute getDatetimeDef_Format();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.def.QDecimalDef <em>Decimal Def</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Decimal Def</em>'.
	 * @see org.smeup.sys.il.data.def.QDecimalDef
	 * @generated
	 */
	EClass getDecimalDef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QDecimalDef#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.smeup.sys.il.data.def.QDecimalDef#getPrecision()
	 * @see #getDecimalDef()
	 * @generated
	 */
	EAttribute getDecimalDef_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QDecimalDef#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.smeup.sys.il.data.def.QDecimalDef#getScale()
	 * @see #getDecimalDef()
	 * @generated
	 */
	EAttribute getDecimalDef_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QDecimalDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.smeup.sys.il.data.def.QDecimalDef#getType()
	 * @see #getDecimalDef()
	 * @generated
	 */
	EAttribute getDecimalDef_Type();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.def.QEnumDef <em>Enum Def</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Enum Def</em>'.
	 * @see org.smeup.sys.il.data.def.QEnumDef
	 * @generated
	 */
	EClass getEnumDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.data.def.QEnumDef#getDelegate <em>Delegate</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delegate</em>'.
	 * @see org.smeup.sys.il.data.def.QEnumDef#getDelegate()
	 * @see #getEnumDef()
	 * @generated
	 */
	EReference getEnumDef_Delegate();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.data.def.QEnumDef#getKlass <em>Klass</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Klass</em>'.
	 * @see org.smeup.sys.il.data.def.QEnumDef#getKlass()
	 * @see #getEnumDef()
	 * @generated
	 */
	EAttribute getEnumDef_Klass();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QFloatingDef <em>Floating Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating Def</em>'.
	 * @see org.smeup.sys.il.data.def.QFloatingDef
	 * @generated
	 */
	EClass getFloatingDef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QFloatingDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.smeup.sys.il.data.def.QFloatingDef#getType()
	 * @see #getFloatingDef()
	 * @generated
	 */
	EAttribute getFloatingDef_Type();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QHexadecimalDef <em>Hexadecimal Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hexadecimal Def</em>'.
	 * @see org.smeup.sys.il.data.def.QHexadecimalDef
	 * @generated
	 */
	EClass getHexadecimalDef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QHexadecimalDef#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.smeup.sys.il.data.def.QHexadecimalDef#getLength()
	 * @see #getHexadecimalDef()
	 * @generated
	 */
	EAttribute getHexadecimalDef_Length();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QIdentityDef <em>Identity Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity Def</em>'.
	 * @see org.smeup.sys.il.data.def.QIdentityDef
	 * @generated
	 */
	EClass getIdentityDef();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QIndicatorDef <em>Indicator Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indicator Def</em>'.
	 * @see org.smeup.sys.il.data.def.QIndicatorDef
	 * @generated
	 */
	EClass getIndicatorDef();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.def.QListDef <em>List Def</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>List Def</em>'.
	 * @see org.smeup.sys.il.data.def.QListDef
	 * @generated
	 */
	EClass getListDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.data.def.QListDef#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see org.smeup.sys.il.data.def.QListDef#getArgument()
	 * @see #getListDef()
	 * @generated
	 */
	EReference getListDef_Argument();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QMultipleAtomicDataDef <em>Multiple Atomic Data Def</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Multiple Atomic Data Def</em>'.
	 * @see org.smeup.sys.il.data.def.QMultipleAtomicDataDef
	 * @generated
	 */
	EClass getMultipleAtomicDataDef();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QMultipleAtomicBufferedDataDef <em>Multiple Atomic Buffered Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Atomic Buffered Data Def</em>'.
	 * @see org.smeup.sys.il.data.def.QMultipleAtomicBufferedDataDef
	 * @generated
	 */
	EClass getMultipleAtomicBufferedDataDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.data.def.QMultipleAtomicBufferedDataDef#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see org.smeup.sys.il.data.def.QMultipleAtomicBufferedDataDef#getArgument()
	 * @see #getMultipleAtomicBufferedDataDef()
	 * @generated
	 */
	EReference getMultipleAtomicBufferedDataDef_Argument();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QMultipleCompoundDataDef <em>Multiple Compound Data Def</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Multiple Compound Data Def</em>'.
	 * @see org.smeup.sys.il.data.def.QMultipleCompoundDataDef
	 * @generated
	 */
	EClass getMultipleCompoundDataDef();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.def.QMultipleDataDef
	 * <em>Multiple Data Def</em>} '. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Multiple Data Def</em>'.
	 * @see org.smeup.sys.il.data.def.QMultipleDataDef
	 * @generated
	 */
	EClass getMultipleDataDef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QMultipleDataDef#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see org.smeup.sys.il.data.def.QMultipleDataDef#getDimension()
	 * @see #getMultipleDataDef()
	 * @generated
	 */
	EAttribute getMultipleDataDef_Dimension();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.def.QNumericDef <em>Numeric Def</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Numeric Def</em>'.
	 * @see org.smeup.sys.il.data.def.QNumericDef
	 * @generated
	 */
	EClass getNumericDef();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.def.QPointerDef <em>Pointer Def</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Pointer Def</em>'.
	 * @see org.smeup.sys.il.data.def.QPointerDef
	 * @generated
	 */
	EClass getPointerDef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QPointerDef#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.smeup.sys.il.data.def.QPointerDef#getTarget()
	 * @see #getPointerDef()
	 * @generated
	 */
	EAttribute getPointerDef_Target();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QScrollerDef <em>Scroller Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroller Def</em>'.
	 * @see org.smeup.sys.il.data.def.QScrollerDef
	 * @generated
	 */
	EClass getScrollerDef();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.def.QStringDef <em>String Def</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>String Def</em>'.
	 * @see org.smeup.sys.il.data.def.QStringDef
	 * @generated
	 */
	EClass getStringDef();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QStrollerDef <em>Stroller Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stroller Def</em>'.
	 * @see org.smeup.sys.il.data.def.QStrollerDef
	 * @generated
	 */
	EClass getStrollerDef();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.def.QStrollerDef#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.smeup.sys.il.data.def.QStrollerDef#getLength()
	 * @see #getStrollerDef()
	 * @generated
	 */
	EAttribute getStrollerDef_Length();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QUnaryAtomicDataDef <em>Unary Atomic Data Def</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Unary Atomic Data Def</em>'.
	 * @see org.smeup.sys.il.data.def.QUnaryAtomicDataDef
	 * @generated
	 */
	EClass getUnaryAtomicDataDef();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef <em>Unary Atomic Buffered Data Def</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Unary Atomic Buffered Data Def</em>'.
	 * @see org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef
	 * @generated
	 */
	EClass getUnaryAtomicBufferedDataDef();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QUnaryCompoundDataDef <em>Unary Compound Data Def</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Unary Compound Data Def</em>'.
	 * @see org.smeup.sys.il.data.def.QUnaryCompoundDataDef
	 * @generated
	 */
	EClass getUnaryCompoundDataDef();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.def.QUnaryDataDef <em>Unary Data Def</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Data Def</em>'.
	 * @see org.smeup.sys.il.data.def.QUnaryDataDef
	 * @generated
	 */
	EClass getUnaryDataDef();

	/**
	 * Returns the meta object for enum '
	 * {@link org.smeup.sys.il.data.def.BinaryType <em>Binary Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Binary Type</em>'.
	 * @see org.smeup.sys.il.data.def.BinaryType
	 * @generated
	 */
	EEnum getBinaryType();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.il.data.def.DataDefType <em>Data Def Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Def Type</em>'.
	 * @see org.smeup.sys.il.data.def.DataDefType
	 * @generated
	 */
	EEnum getDataDefType();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.il.data.def.DatetimeType <em>Datetime Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datetime Type</em>'.
	 * @see org.smeup.sys.il.data.def.DatetimeType
	 * @generated
	 */
	EEnum getDatetimeType();

	/**
	 * Returns the meta object for enum '
	 * {@link org.smeup.sys.il.data.def.DateFormat <em>Date Format</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Date Format</em>'.
	 * @see org.smeup.sys.il.data.def.DateFormat
	 * @generated
	 */
	EEnum getDateFormat();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.il.data.def.DecimalType <em>Decimal Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decimal Type</em>'.
	 * @see org.smeup.sys.il.data.def.DecimalType
	 * @generated
	 */
	EEnum getDecimalType();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.il.data.def.FloatingType <em>Floating Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Floating Type</em>'.
	 * @see org.smeup.sys.il.data.def.FloatingType
	 * @generated
	 */
	EEnum getFloatingType();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageDataDefFactory getIntegratedLanguageDataDefFactory();

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
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.AdapterDefImpl <em>Adapter Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.AdapterDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getAdapterDef()
		 * @generated
		 */
		EClass ADAPTER_DEF = eINSTANCE.getAdapterDef();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.def.impl.ArrayDefImpl
		 * <em>Array Def</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see org.smeup.sys.il.data.def.impl.ArrayDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getArrayDef()
		 * @generated
		 */
		EClass ARRAY_DEF = eINSTANCE.getArrayDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.AtomicDataDefImpl <em>Atomic Data Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.AtomicDataDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getAtomicDataDef()
		 * @generated
		 */
		EClass ATOMIC_DATA_DEF = eINSTANCE.getAtomicDataDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.BinaryDefImpl <em>Binary Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.BinaryDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getBinaryDef()
		 * @generated
		 */
		EClass BINARY_DEF = eINSTANCE.getBinaryDef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_DEF__TYPE = eINSTANCE.getBinaryDef_Type();

		/**
		 * The meta object literal for the '<em><b>Unsigned</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_DEF__UNSIGNED = eINSTANCE.getBinaryDef_Unsigned();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.BufferDefImpl <em>Buffer Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.BufferDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getBufferDef()
		 * @generated
		 */
		EClass BUFFER_DEF = eINSTANCE.getBufferDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.QBufferedDataDef <em>Buffered Data Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.QBufferedDataDef
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getBufferedDataDef()
		 * @generated
		 */
		EClass BUFFERED_DATA_DEF = eINSTANCE.getBufferedDataDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.CharacterDefImpl <em>Character Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.CharacterDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getCharacterDef()
		 * @generated
		 */
		EClass CHARACTER_DEF = eINSTANCE.getCharacterDef();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_DEF__LENGTH = eINSTANCE.getCharacterDef_Length();

		/**
		 * The meta object literal for the '<em><b>Varying</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_DEF__VARYING = eINSTANCE.getCharacterDef_Varying();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.CompoundDataDefImpl <em>Compound Data Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.CompoundDataDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getCompoundDataDef()
		 * @generated
		 */
		EClass COMPOUND_DATA_DEF = eINSTANCE.getCompoundDataDef();

		/**
		 * The meta object literal for the '<em><b>Class Delegator</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_DATA_DEF__CLASS_DELEGATOR = eINSTANCE.getCompoundDataDef_ClassDelegator();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_DATA_DEF__ELEMENTS = eINSTANCE.getCompoundDataDef_Elements();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_DATA_DEF__PREFIX = eINSTANCE.getCompoundDataDef_Prefix();

		/**
		 * The meta object literal for the '<em><b>Qualified</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_DATA_DEF__QUALIFIED = eINSTANCE.getCompoundDataDef_Qualified();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.DataDefImpl <em>Data Def</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.DataDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDataDef()
		 * @generated
		 */
		EClass DATA_DEF = eINSTANCE.getDataDef();

		/**
		 * The meta object literal for the '<em><b>Formulas</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DEF__FORMULAS = eINSTANCE.getDataDef_Formulas();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.DataStructDefImpl <em>Data Struct Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.DataStructDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDataStructDef()
		 * @generated
		 */
		EClass DATA_STRUCT_DEF = eINSTANCE.getDataStructDef();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STRUCT_DEF__LENGTH = eINSTANCE.getDataStructDef_Length();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.DatetimeDefImpl <em>Datetime Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.DatetimeDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDatetimeDef()
		 * @generated
		 */
		EClass DATETIME_DEF = eINSTANCE.getDatetimeDef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_DEF__TYPE = eINSTANCE.getDatetimeDef_Type();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_DEF__FORMAT = eINSTANCE.getDatetimeDef_Format();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.DecimalDefImpl <em>Decimal Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.DecimalDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDecimalDef()
		 * @generated
		 */
		EClass DECIMAL_DEF = eINSTANCE.getDecimalDef();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_DEF__PRECISION = eINSTANCE.getDecimalDef_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_DEF__SCALE = eINSTANCE.getDecimalDef_Scale();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_DEF__TYPE = eINSTANCE.getDecimalDef_Type();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.EnumDefImpl <em>Enum Def</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.EnumDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getEnumDef()
		 * @generated
		 */
		EClass ENUM_DEF = eINSTANCE.getEnumDef();

		/**
		 * The meta object literal for the '<em><b>Delegate</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ENUM_DEF__DELEGATE = eINSTANCE.getEnumDef_Delegate();

		/**
		 * The meta object literal for the '<em><b>Klass</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_DEF__KLASS = eINSTANCE.getEnumDef_Klass();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.FloatingDefImpl <em>Floating Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.FloatingDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getFloatingDef()
		 * @generated
		 */
		EClass FLOATING_DEF = eINSTANCE.getFloatingDef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_DEF__TYPE = eINSTANCE.getFloatingDef_Type();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.HexadecimalDefImpl <em>Hexadecimal Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.HexadecimalDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getHexadecimalDef()
		 * @generated
		 */
		EClass HEXADECIMAL_DEF = eINSTANCE.getHexadecimalDef();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEXADECIMAL_DEF__LENGTH = eINSTANCE.getHexadecimalDef_Length();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.IdentityDefImpl <em>Identity Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.IdentityDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getIdentityDef()
		 * @generated
		 */
		EClass IDENTITY_DEF = eINSTANCE.getIdentityDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.IndicatorDefImpl <em>Indicator Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.IndicatorDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getIndicatorDef()
		 * @generated
		 */
		EClass INDICATOR_DEF = eINSTANCE.getIndicatorDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.ListDefImpl <em>List Def</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.ListDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getListDef()
		 * @generated
		 */
		EClass LIST_DEF = eINSTANCE.getListDef();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference LIST_DEF__ARGUMENT = eINSTANCE.getListDef_Argument();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.MultipleAtomicDataDefImpl <em>Multiple Atomic Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.MultipleAtomicDataDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getMultipleAtomicDataDef()
		 * @generated
		 */
		EClass MULTIPLE_ATOMIC_DATA_DEF = eINSTANCE.getMultipleAtomicDataDef();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.def.impl.MultipleAtomicBufferedDataDefImpl
		 * <em>Multiple Atomic Buffered Data Def</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.data.def.impl.MultipleAtomicBufferedDataDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getMultipleAtomicBufferedDataDef()
		 * @generated
		 */
		EClass MULTIPLE_ATOMIC_BUFFERED_DATA_DEF = eINSTANCE.getMultipleAtomicBufferedDataDef();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_ATOMIC_BUFFERED_DATA_DEF__ARGUMENT = eINSTANCE.getMultipleAtomicBufferedDataDef_Argument();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.MultipleCompoundDataDefImpl <em>Multiple Compound Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.MultipleCompoundDataDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getMultipleCompoundDataDef()
		 * @generated
		 */
		EClass MULTIPLE_COMPOUND_DATA_DEF = eINSTANCE.getMultipleCompoundDataDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.MultipleDataDefImpl <em>Multiple Data Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.MultipleDataDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getMultipleDataDef()
		 * @generated
		 */
		EClass MULTIPLE_DATA_DEF = eINSTANCE.getMultipleDataDef();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_DATA_DEF__DIMENSION = eINSTANCE.getMultipleDataDef_Dimension();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.NumericDefImpl <em>Numeric Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.NumericDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getNumericDef()
		 * @generated
		 */
		EClass NUMERIC_DEF = eINSTANCE.getNumericDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.PointerDefImpl <em>Pointer Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.PointerDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getPointerDef()
		 * @generated
		 */
		EClass POINTER_DEF = eINSTANCE.getPointerDef();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTER_DEF__TARGET = eINSTANCE.getPointerDef_Target();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.ScrollerDefImpl <em>Scroller Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.ScrollerDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getScrollerDef()
		 * @generated
		 */
		EClass SCROLLER_DEF = eINSTANCE.getScrollerDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.StringDefImpl <em>String Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.StringDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getStringDef()
		 * @generated
		 */
		EClass STRING_DEF = eINSTANCE.getStringDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.StrollerDefImpl <em>Stroller Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.StrollerDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getStrollerDef()
		 * @generated
		 */
		EClass STROLLER_DEF = eINSTANCE.getStrollerDef();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STROLLER_DEF__LENGTH = eINSTANCE.getStrollerDef_Length();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.UnaryAtomicDataDefImpl <em>Unary Atomic Data Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.UnaryAtomicDataDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getUnaryAtomicDataDef()
		 * @generated
		 */
		EClass UNARY_ATOMIC_DATA_DEF = eINSTANCE.getUnaryAtomicDataDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.UnaryAtomicBufferedDataDefImpl <em>Unary Atomic Buffered Data Def</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.UnaryAtomicBufferedDataDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getUnaryAtomicBufferedDataDef()
		 * @generated
		 */
		EClass UNARY_ATOMIC_BUFFERED_DATA_DEF = eINSTANCE.getUnaryAtomicBufferedDataDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.UnaryCompoundDataDefImpl <em>Unary Compound Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.UnaryCompoundDataDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getUnaryCompoundDataDef()
		 * @generated
		 */
		EClass UNARY_COMPOUND_DATA_DEF = eINSTANCE.getUnaryCompoundDataDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.impl.UnaryDataDefImpl <em>Unary Data Def</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.def.impl.UnaryDataDefImpl
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getUnaryDataDef()
		 * @generated
		 */
		EClass UNARY_DATA_DEF = eINSTANCE.getUnaryDataDef();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.BinaryType <em>Binary Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.def.BinaryType
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getBinaryType()
		 * @generated
		 */
		EEnum BINARY_TYPE = eINSTANCE.getBinaryType();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.DataDefType <em>Data Def Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.def.DataDefType
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDataDefType()
		 * @generated
		 */
		EEnum DATA_DEF_TYPE = eINSTANCE.getDataDefType();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.DatetimeType <em>Datetime Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.def.DatetimeType
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDatetimeType()
		 * @generated
		 */
		EEnum DATETIME_TYPE = eINSTANCE.getDatetimeType();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.DateFormat <em>Date Format</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.def.DateFormat
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDateFormat()
		 * @generated
		 */
		EEnum DATE_FORMAT = eINSTANCE.getDateFormat();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.DecimalType <em>Decimal Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.def.DecimalType
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getDecimalType()
		 * @generated
		 */
		EEnum DECIMAL_TYPE = eINSTANCE.getDecimalType();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.def.FloatingType <em>Floating Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.def.FloatingType
		 * @see org.smeup.sys.il.data.def.impl.IntegratedLanguageDataDefPackageImpl#getFloatingType()
		 * @generated
		 */
		EEnum FLOATING_TYPE = eINSTANCE.getFloatingType();

	}

} // QIntegratedLanguageDataDefPackage
