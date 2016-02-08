/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.esam;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermPackage;

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
 * @see org.smeup.sys.il.esam.QIntegratedLanguageEsamFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageEsamPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "esam";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/esam";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-esam";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageEsamPackage eINSTANCE = org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.QDataSet <em>Data Set</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.esam.QDataSet
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getDataSet()
	 * @generated
	 */
	int DATA_SET = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.impl.FileTermImpl <em>File Term</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.esam.impl.FileTermImpl
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getFileTerm()
	 * @generated
	 */
	int FILE_TERM = 6;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.impl.DataSetTermImpl <em>Data Set Term</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.esam.impl.DataSetTermImpl
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getDataSetTerm()
	 * @generated
	 */
	int DATA_SET_TERM = 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.QDisplay <em>Display</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.esam.QDisplay
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getDisplay()
	 * @generated
	 */
	int DISPLAY = 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.impl.DisplayTermImpl <em>Display Term</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.esam.impl.DisplayTermImpl
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getDisplayTerm()
	 * @generated
	 */
	int DISPLAY_TERM = 5;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.impl.KeyListTermImpl <em>Key List Term</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.esam.impl.KeyListTermImpl
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getKeyListTerm()
	 * @generated
	 */
	int KEY_LIST_TERM = 7;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.QKSDataSet
	 * <em>KS Data Set</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.il.esam.QKSDataSet
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getKSDataSet()
	 * @generated
	 */
	int KS_DATA_SET = 8;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.QIndex <em>Index</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.esam.QIndex
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 9;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.QIndexColumn
	 * <em>Index Column</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.il.esam.QIndexColumn
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getIndexColumn()
	 * @generated
	 */
	int INDEX_COLUMN = 10;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.QAccessManager <em>Access Manager</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.esam.QAccessManager
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getAccessManager()
	 * @generated
	 */
	int ACCESS_MANAGER = 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.QAccessFactory <em>Access Factory</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.esam.QAccessFactory
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getAccessFactory()
	 * @generated
	 */
	int ACCESS_FACTORY = 0;

	/**
	 * The number of structural features of the '<em>Access Factory</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Access Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Data Set</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SET_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TERM__FACETS = QIntegratedLanguageCoreTermPackage.TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TERM__FORMAT = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Info Struct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TERM__INFO_STRUCT = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TERM__NAME = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Open</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_TERM__USER_OPEN = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>File Term</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_TERM_FEATURE_COUNT = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__FACETS = FILE_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__FORMAT = FILE_TERM__FORMAT;

	/**
	 * The feature id for the '<em><b>Info Struct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__INFO_STRUCT = FILE_TERM__INFO_STRUCT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__NAME = FILE_TERM__NAME;

	/**
	 * The feature id for the '<em><b>User Open</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__USER_OPEN = FILE_TERM__USER_OPEN;

	/**
	 * The feature id for the '<em><b>Access Mode</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__ACCESS_MODE = FILE_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__EXTERNAL_FILE = FILE_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__EXTERNAL_MEMBER = FILE_TERM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Format Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__FORMAT_NAME = FILE_TERM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Keyed Access</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__KEYED_ACCESS = FILE_TERM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM__PREFIX = FILE_TERM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Data Set Term</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TERM_FEATURE_COUNT = FILE_TERM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Display</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_TERM__FACETS = FILE_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_TERM__FORMAT = FILE_TERM__FORMAT;

	/**
	 * The feature id for the '<em><b>Info Struct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_TERM__INFO_STRUCT = FILE_TERM__INFO_STRUCT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_TERM__NAME = FILE_TERM__NAME;

	/**
	 * The feature id for the '<em><b>User Open</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DISPLAY_TERM__USER_OPEN = FILE_TERM__USER_OPEN;

	/**
	 * The number of structural features of the '<em>Display Term</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_TERM_FEATURE_COUNT = FILE_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LIST_TERM__FACETS = QIntegratedLanguageCoreTermPackage.TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int KEY_LIST_TERM__NAME = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Fields</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int KEY_LIST_TERM__KEY_FIELDS = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Key List Term</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_LIST_TERM_FEATURE_COUNT = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>KS Data Set</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KS_DATA_SET_FEATURE_COUNT = DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Index Column</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.QPrint <em>Print</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.esam.QPrint
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 11;

	/**
	 * The number of structural features of the '<em>Print</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.impl.PrintTermImpl <em>Print Term</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.esam.impl.PrintTermImpl
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getPrintTerm()
	 * @generated
	 */
	int PRINT_TERM = 12;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_TERM__FACETS = FILE_TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_TERM__FORMAT = FILE_TERM__FORMAT;

	/**
	 * The feature id for the '<em><b>Info Struct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_TERM__INFO_STRUCT = FILE_TERM__INFO_STRUCT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_TERM__NAME = FILE_TERM__NAME;

	/**
	 * The feature id for the '<em><b>User Open</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRINT_TERM__USER_OPEN = FILE_TERM__USER_OPEN;

	/**
	 * The number of structural features of the '<em>Print Term</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_TERM_FEATURE_COUNT = FILE_TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.QRRDataSet
	 * <em>RR Data Set</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.il.esam.QRRDataSet
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getRRDataSet()
	 * @generated
	 */
	int RR_DATA_SET = 13;

	/**
	 * The number of structural features of the '<em>RR Data Set</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RR_DATA_SET_FEATURE_COUNT = DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.QSMDataSet
	 * <em>SM Data Set</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.il.esam.QSMDataSet
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getSMDataSet()
	 * @generated
	 */
	int SM_DATA_SET = 14;

	/**
	 * The number of structural features of the '<em>SM Data Set</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SM_DATA_SET_FEATURE_COUNT = RR_DATA_SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.AccessMode
	 * <em>Access Mode</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.il.esam.AccessMode
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getAccessMode()
	 * @generated
	 */
	int ACCESS_MODE = 15;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.OperationDirection <em>Operation Direction</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.esam.OperationDirection
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getOperationDirection()
	 * @generated
	 */
	int OPERATION_DIRECTION = 16;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.OperationSet
	 * <em>Operation Set</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.il.esam.OperationSet
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getOperationSet()
	 * @generated
	 */
	int OPERATION_SET = 17;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.esam.OperationRead
	 * <em>Operation Read</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.smeup.sys.il.esam.OperationRead
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getOperationRead()
	 * @generated
	 */
	int OPERATION_READ = 18;

	/**
	 * The meta object id for the '<em>Key List</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getKeyList()
	 * @generated
	 */
	int KEY_LIST = 19;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.esam.QDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set</em>'.
	 * @see org.smeup.sys.il.esam.QDataSet
	 * @generated
	 */
	EClass getDataSet();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.esam.QDataSetTerm <em>Data Set Term</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Set Term</em>'.
	 * @see org.smeup.sys.il.esam.QDataSetTerm
	 * @generated
	 */
	EClass getDataSetTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.esam.QDataSetTerm#getAccessMode <em>Access Mode</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Mode</em>'.
	 * @see org.smeup.sys.il.esam.QDataSetTerm#getAccessMode()
	 * @see #getDataSetTerm()
	 * @generated
	 */
	EAttribute getDataSetTerm_AccessMode();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.esam.QDataSetTerm#getExternalFile <em>External File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External File</em>'.
	 * @see org.smeup.sys.il.esam.QDataSetTerm#getExternalFile()
	 * @see #getDataSetTerm()
	 * @generated
	 */
	EAttribute getDataSetTerm_ExternalFile();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.esam.QDataSetTerm#getExternalMember <em>External Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Member</em>'.
	 * @see org.smeup.sys.il.esam.QDataSetTerm#getExternalMember()
	 * @see #getDataSetTerm()
	 * @generated
	 */
	EAttribute getDataSetTerm_ExternalMember();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.esam.QDataSetTerm#getFormatName <em>Format Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Name</em>'.
	 * @see org.smeup.sys.il.esam.QDataSetTerm#getFormatName()
	 * @see #getDataSetTerm()
	 * @generated
	 */
	EAttribute getDataSetTerm_FormatName();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.esam.QDataSetTerm#isKeyedAccess <em>Keyed Access</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyed Access</em>'.
	 * @see org.smeup.sys.il.esam.QDataSetTerm#isKeyedAccess()
	 * @see #getDataSetTerm()
	 * @generated
	 */
	EAttribute getDataSetTerm_KeyedAccess();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.esam.QDataSetTerm#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.smeup.sys.il.esam.QDataSetTerm#getPrefix()
	 * @see #getDataSetTerm()
	 * @generated
	 */
	EAttribute getDataSetTerm_Prefix();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.esam.QDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display</em>'.
	 * @see org.smeup.sys.il.esam.QDisplay
	 * @generated
	 */
	EClass getDisplay();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.esam.QDisplayTerm <em>Display Term</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Display Term</em>'.
	 * @see org.smeup.sys.il.esam.QDisplayTerm
	 * @generated
	 */
	EClass getDisplayTerm();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.esam.QFileTerm <em>File Term</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>File Term</em>'.
	 * @see org.smeup.sys.il.esam.QFileTerm
	 * @generated
	 */
	EClass getFileTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.esam.QFileTerm#isUserOpen <em>User Open</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Open</em>'.
	 * @see org.smeup.sys.il.esam.QFileTerm#isUserOpen()
	 * @see #getFileTerm()
	 * @generated
	 */
	EAttribute getFileTerm_UserOpen();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.esam.QFileTerm#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Format</em>'.
	 * @see org.smeup.sys.il.esam.QFileTerm#getFormat()
	 * @see #getFileTerm()
	 * @generated
	 */
	EReference getFileTerm_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.esam.QFileTerm#getInfoStruct <em>Info Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info Struct</em>'.
	 * @see org.smeup.sys.il.esam.QFileTerm#getInfoStruct()
	 * @see #getFileTerm()
	 * @generated
	 */
	EAttribute getFileTerm_InfoStruct();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.esam.QFileTerm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.il.esam.QFileTerm#getName()
	 * @see #getFileTerm()
	 * @generated
	 */
	EAttribute getFileTerm_Name();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.esam.QKeyListTerm <em>Key List Term</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Key List Term</em>'.
	 * @see org.smeup.sys.il.esam.QKeyListTerm
	 * @generated
	 */
	EClass getKeyListTerm();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.esam.QKeyListTerm#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.il.esam.QKeyListTerm#getName()
	 * @see #getKeyListTerm()
	 * @generated
	 */
	EAttribute getKeyListTerm_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.il.esam.QKeyListTerm#getKeyFields <em>Key Fields</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Key Fields</em>'.
	 * @see org.smeup.sys.il.esam.QKeyListTerm#getKeyFields()
	 * @see #getKeyListTerm()
	 * @generated
	 */
	EAttribute getKeyListTerm_KeyFields();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.esam.QKSDataSet <em>KS Data Set</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>KS Data Set</em>'.
	 * @see org.smeup.sys.il.esam.QKSDataSet
	 * @generated
	 */
	EClass getKSDataSet();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.esam.QIndex <em>Index</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see org.smeup.sys.il.esam.QIndex
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.esam.QIndexColumn <em>Index Column</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Index Column</em>'.
	 * @see org.smeup.sys.il.esam.QIndexColumn
	 * @generated
	 */
	EClass getIndexColumn();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.esam.QAccessManager <em>Access Manager</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Manager</em>'.
	 * @see org.smeup.sys.il.esam.QAccessManager
	 * @generated
	 */
	EClass getAccessManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.esam.QAccessFactory <em>Access Factory</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Factory</em>'.
	 * @see org.smeup.sys.il.esam.QAccessFactory
	 * @generated
	 */
	EClass getAccessFactory();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.esam.QPrint <em>Print</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print</em>'.
	 * @see org.smeup.sys.il.esam.QPrint
	 * @generated
	 */
	EClass getPrint();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.esam.QPrintTerm <em>Print Term</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Print Term</em>'.
	 * @see org.smeup.sys.il.esam.QPrintTerm
	 * @generated
	 */
	EClass getPrintTerm();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.esam.QRRDataSet <em>RR Data Set</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>RR Data Set</em>'.
	 * @see org.smeup.sys.il.esam.QRRDataSet
	 * @generated
	 */
	EClass getRRDataSet();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.esam.QSMDataSet <em>SM Data Set</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>SM Data Set</em>'.
	 * @see org.smeup.sys.il.esam.QSMDataSet
	 * @generated
	 */
	EClass getSMDataSet();

	/**
	 * Returns the meta object for enum '
	 * {@link org.smeup.sys.il.esam.AccessMode <em>Access Mode</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Access Mode</em>'.
	 * @see org.smeup.sys.il.esam.AccessMode
	 * @generated
	 */
	EEnum getAccessMode();

	/**
	 * Returns the meta object for enum '
	 * {@link org.smeup.sys.il.esam.OperationDirection
	 * <em>Operation Direction</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for enum '<em>Operation Direction</em>'.
	 * @see org.smeup.sys.il.esam.OperationDirection
	 * @generated
	 */
	EEnum getOperationDirection();

	/**
	 * Returns the meta object for enum '
	 * {@link org.smeup.sys.il.esam.OperationSet <em>Operation Set</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Operation Set</em>'.
	 * @see org.smeup.sys.il.esam.OperationSet
	 * @generated
	 */
	EEnum getOperationSet();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.il.esam.OperationRead <em>Operation Read</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Read</em>'.
	 * @see org.smeup.sys.il.esam.OperationRead
	 * @generated
	 */
	EEnum getOperationRead();

	/**
	 * Returns the meta object for data type '<em>Key List</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Key List</em>'.
	 * @model instanceClass="java.lang.Object[]"
	 * @generated
	 */
	EDataType getKeyList();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageEsamFactory getIntegratedLanguageEsamFactory();

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
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.esam.QDataSet <em>Data Set</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.smeup.sys.il.esam.QDataSet
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getDataSet()
		 * @generated
		 */
		EClass DATA_SET = eINSTANCE.getDataSet();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.impl.DataSetTermImpl <em>Data Set Term</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.esam.impl.DataSetTermImpl
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getDataSetTerm()
		 * @generated
		 */
		EClass DATA_SET_TERM = eINSTANCE.getDataSetTerm();

		/**
		 * The meta object literal for the '<em><b>Access Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET_TERM__ACCESS_MODE = eINSTANCE.getDataSetTerm_AccessMode();

		/**
		 * The meta object literal for the '<em><b>External File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET_TERM__EXTERNAL_FILE = eINSTANCE.getDataSetTerm_ExternalFile();

		/**
		 * The meta object literal for the '<em><b>External Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET_TERM__EXTERNAL_MEMBER = eINSTANCE.getDataSetTerm_ExternalMember();

		/**
		 * The meta object literal for the '<em><b>Format Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET_TERM__FORMAT_NAME = eINSTANCE.getDataSetTerm_FormatName();

		/**
		 * The meta object literal for the '<em><b>Keyed Access</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET_TERM__KEYED_ACCESS = eINSTANCE.getDataSetTerm_KeyedAccess();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET_TERM__PREFIX = eINSTANCE.getDataSetTerm_Prefix();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.esam.QDisplay <em>Display</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.smeup.sys.il.esam.QDisplay
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getDisplay()
		 * @generated
		 */
		EClass DISPLAY = eINSTANCE.getDisplay();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.impl.DisplayTermImpl <em>Display Term</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.esam.impl.DisplayTermImpl
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getDisplayTerm()
		 * @generated
		 */
		EClass DISPLAY_TERM = eINSTANCE.getDisplayTerm();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.impl.FileTermImpl <em>File Term</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.esam.impl.FileTermImpl
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getFileTerm()
		 * @generated
		 */
		EClass FILE_TERM = eINSTANCE.getFileTerm();

		/**
		 * The meta object literal for the '<em><b>User Open</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_TERM__USER_OPEN = eINSTANCE.getFileTerm_UserOpen();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_TERM__FORMAT = eINSTANCE.getFileTerm_Format();

		/**
		 * The meta object literal for the '<em><b>Info Struct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_TERM__INFO_STRUCT = eINSTANCE.getFileTerm_InfoStruct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_TERM__NAME = eINSTANCE.getFileTerm_Name();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.impl.KeyListTermImpl <em>Key List Term</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.esam.impl.KeyListTermImpl
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getKeyListTerm()
		 * @generated
		 */
		EClass KEY_LIST_TERM = eINSTANCE.getKeyListTerm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_LIST_TERM__NAME = eINSTANCE.getKeyListTerm_Name();

		/**
		 * The meta object literal for the '<em><b>Key Fields</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_LIST_TERM__KEY_FIELDS = eINSTANCE.getKeyListTerm_KeyFields();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.QKSDataSet <em>KS Data Set</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.esam.QKSDataSet
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getKSDataSet()
		 * @generated
		 */
		EClass KS_DATA_SET = eINSTANCE.getKSDataSet();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.QIndex <em>Index</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.esam.QIndex
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.QIndexColumn <em>Index Column</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.esam.QIndexColumn
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getIndexColumn()
		 * @generated
		 */
		EClass INDEX_COLUMN = eINSTANCE.getIndexColumn();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.QAccessManager <em>Access Manager</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.esam.QAccessManager
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getAccessManager()
		 * @generated
		 */
		EClass ACCESS_MANAGER = eINSTANCE.getAccessManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.QAccessFactory <em>Access Factory</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.esam.QAccessFactory
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getAccessFactory()
		 * @generated
		 */
		EClass ACCESS_FACTORY = eINSTANCE.getAccessFactory();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.QPrint <em>Print</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.esam.QPrint
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getPrint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getPrint();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.impl.PrintTermImpl <em>Print Term</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.esam.impl.PrintTermImpl
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getPrintTerm()
		 * @generated
		 */
		EClass PRINT_TERM = eINSTANCE.getPrintTerm();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.QRRDataSet <em>RR Data Set</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.esam.QRRDataSet
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getRRDataSet()
		 * @generated
		 */
		EClass RR_DATA_SET = eINSTANCE.getRRDataSet();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.QSMDataSet <em>SM Data Set</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.esam.QSMDataSet
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getSMDataSet()
		 * @generated
		 */
		EClass SM_DATA_SET = eINSTANCE.getSMDataSet();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.AccessMode <em>Access Mode</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.esam.AccessMode
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getAccessMode()
		 * @generated
		 */
		EEnum ACCESS_MODE = eINSTANCE.getAccessMode();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.OperationDirection <em>Operation Direction</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.esam.OperationDirection
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getOperationDirection()
		 * @generated
		 */
		EEnum OPERATION_DIRECTION = eINSTANCE.getOperationDirection();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.OperationSet <em>Operation Set</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.esam.OperationSet
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getOperationSet()
		 * @generated
		 */
		EEnum OPERATION_SET = eINSTANCE.getOperationSet();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.esam.OperationRead <em>Operation Read</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.esam.OperationRead
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getOperationRead()
		 * @generated
		 */
		EEnum OPERATION_READ = eINSTANCE.getOperationRead();

		/**
		 * The meta object literal for the '<em>Key List</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.smeup.sys.il.esam.impl.IntegratedLanguageEsamPackageImpl#getKeyList()
		 * @generated
		 */
		EDataType KEY_LIST = eINSTANCE.getKeyList();

	}

} // QIntegratedLanguageEsamPackage
