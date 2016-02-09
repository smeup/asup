/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data.term;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
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
 * @see org.smeup.sys.il.data.term.QIntegratedLanguageDataTermFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageDataTermPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "term";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/data/term";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-data-term";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageDataTermPackage eINSTANCE = org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.term.impl.DataTermImpl <em>Data Term</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.term.impl.DataTermImpl
	 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getDataTerm()
	 * @generated
	 */
	int DATA_TERM = 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__FACETS = QIntegratedLanguageCoreTermPackage.TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__BASED = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__CARDINALITY = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__CONSTANT = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__DEFAULT = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__DEFINITION = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__INITIALIZED = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__LIKE = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__NAME = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__RESTRICTED = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__TEXT = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Data Term</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TERM_FEATURE_COUNT = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.term.QDataTermContainer <em>Data Term Container</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.data.term.QDataTermContainer
	 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getDataTermContainer()
	 * @generated
	 */
	int DATA_TERM_CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Data Term Container</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM_CONTAINER_FEATURE_COUNT = QIntegratedLanguageCoreTermPackage.TERM_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.term.impl.DataTermVisitorImpl <em>Data Term Visitor</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.data.term.impl.DataTermVisitorImpl
	 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getDataTermVisitor()
	 * @generated
	 */
	int DATA_TERM_VISITOR = 2;

	/**
	 * The number of structural features of the '<em>Data Term Visitor</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TERM_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.term.impl.FormatImpl <em>Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.term.impl.FormatImpl
	 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getFormat()
	 * @generated
	 */
	int FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT__EXPRESSION = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT__TYPE = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_FEATURE_COUNT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.term.impl.OverlayImpl <em>Overlay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.term.impl.OverlayImpl
	 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getOverlay()
	 * @generated
	 */
	int OVERLAY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__NAME = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY__POSITION = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Overlay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_FEATURE_COUNT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.term.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.term.impl.RangeImpl
	 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 5;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MAX = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__MIN = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.term.impl.RemapImpl <em>Remap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.term.impl.RemapImpl
	 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getRemap()
	 * @generated
	 */
	int REMAP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP__NAME = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP__INDEX = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMAP_FEATURE_COUNT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.term.impl.SpecialImpl <em>Special</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.term.impl.SpecialImpl
	 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getSpecial()
	 * @generated
	 */
	int SPECIAL = 7;

	/**
	 * The feature id for the '<em><b>Class Delegate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL__CLASS_DELEGATE = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL__ELEMENTS = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Special</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_FEATURE_COUNT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.term.impl.SpecialElementImpl <em>Special Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.term.impl.SpecialElementImpl
	 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getSpecialElement()
	 * @generated
	 */
	int SPECIAL_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT__FACETS = QIntegratedLanguageCoreTermPackage.NAMED_NODE__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT__NAME = QIntegratedLanguageCoreTermPackage.NAMED_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT__TEXT = QIntegratedLanguageCoreTermPackage.NAMED_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT__UNARY = QIntegratedLanguageCoreTermPackage.NAMED_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT__VALUE = QIntegratedLanguageCoreTermPackage.NAMED_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Special Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT_FEATURE_COUNT = QIntegratedLanguageCoreTermPackage.NAMED_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.term.DataTermType <em>Data Term Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.term.DataTermType
	 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getDataTermType()
	 * @generated
	 */
	int DATA_TERM_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.data.term.FormatType <em>Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.data.term.FormatType
	 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getFormatType()
	 * @generated
	 */
	int FORMAT_TYPE = 10;

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.term.QDataTerm <em>Data Term</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Data Term</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTerm
	 * @generated
	 */
	EClass getDataTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QDataTerm#getBased <em>Based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Based</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTerm#getBased()
	 * @see #getDataTerm()
	 * @generated
	 */
	EAttribute getDataTerm_Based();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.data.term.QDataTerm#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTerm#getCardinality()
	 * @see #getDataTerm()
	 * @generated
	 */
	EReference getDataTerm_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QDataTerm#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTerm#isConstant()
	 * @see #getDataTerm()
	 * @generated
	 */
	EAttribute getDataTerm_Constant();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.data.term.QDataTerm#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTerm#getDefault()
	 * @see #getDataTerm()
	 * @generated
	 */
	EReference getDataTerm_Default();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.data.term.QDataTerm#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTerm#getDefinition()
	 * @see #getDataTerm()
	 * @generated
	 */
	EReference getDataTerm_Definition();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QDataTerm#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTerm#isInitialized()
	 * @see #getDataTerm()
	 * @generated
	 */
	EAttribute getDataTerm_Initialized();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.data.term.QDataTerm#getLike <em>Like</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Like</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTerm#getLike()
	 * @see #getDataTerm()
	 * @generated
	 */
	EAttribute getDataTerm_Like();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.data.term.QDataTerm#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTerm#getName()
	 * @see #getDataTerm()
	 * @generated
	 */
	EAttribute getDataTerm_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QDataTerm#isRestricted <em>Restricted</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restricted</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTerm#isRestricted()
	 * @see #getDataTerm()
	 * @generated
	 */
	EAttribute getDataTerm_Restricted();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.data.term.QDataTerm#getText <em>Text</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTerm#getText()
	 * @see #getDataTerm()
	 * @generated
	 */
	EAttribute getDataTerm_Text();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.term.QDataTermContainer
	 * <em>Data Term Container</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Data Term Container</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTermContainer
	 * @generated
	 */
	EClass getDataTermContainer();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.data.term.QDataTermVisitor
	 * <em>Data Term Visitor</em>} '. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the meta object for class '<em>Data Term Visitor</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTermVisitor
	 * @generated
	 */
	EClass getDataTermVisitor();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.term.QFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Format</em>'.
	 * @see org.smeup.sys.il.data.term.QFormat
	 * @generated
	 */
	EClass getFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QFormat#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.smeup.sys.il.data.term.QFormat#getExpression()
	 * @see #getFormat()
	 * @generated
	 */
	EAttribute getFormat_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QFormat#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.smeup.sys.il.data.term.QFormat#getType()
	 * @see #getFormat()
	 * @generated
	 */
	EAttribute getFormat_Type();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.term.QOverlay <em>Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlay</em>'.
	 * @see org.smeup.sys.il.data.term.QOverlay
	 * @generated
	 */
	EClass getOverlay();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QOverlay#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.il.data.term.QOverlay#getName()
	 * @see #getOverlay()
	 * @generated
	 */
	EAttribute getOverlay_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QOverlay#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.smeup.sys.il.data.term.QOverlay#getPosition()
	 * @see #getOverlay()
	 * @generated
	 */
	EAttribute getOverlay_Position();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.term.QRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see org.smeup.sys.il.data.term.QRange
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.smeup.sys.il.data.term.QRange#getMax()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.smeup.sys.il.data.term.QRange#getMin()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Min();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.term.QRemap <em>Remap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remap</em>'.
	 * @see org.smeup.sys.il.data.term.QRemap
	 * @generated
	 */
	EClass getRemap();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QRemap#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.il.data.term.QRemap#getName()
	 * @see #getRemap()
	 * @generated
	 */
	EAttribute getRemap_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QRemap#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.smeup.sys.il.data.term.QRemap#getIndex()
	 * @see #getRemap()
	 * @generated
	 */
	EAttribute getRemap_Index();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.term.QSpecial <em>Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special</em>'.
	 * @see org.smeup.sys.il.data.term.QSpecial
	 * @generated
	 */
	EClass getSpecial();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QSpecial#getClassDelegate <em>Class Delegate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Delegate</em>'.
	 * @see org.smeup.sys.il.data.term.QSpecial#getClassDelegate()
	 * @see #getSpecial()
	 * @generated
	 */
	EAttribute getSpecial_ClassDelegate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.il.data.term.QSpecial#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.smeup.sys.il.data.term.QSpecial#getElements()
	 * @see #getSpecial()
	 * @generated
	 */
	EReference getSpecial_Elements();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.data.term.QSpecialElement <em>Special Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Element</em>'.
	 * @see org.smeup.sys.il.data.term.QSpecialElement
	 * @generated
	 */
	EClass getSpecialElement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QSpecialElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.il.data.term.QSpecialElement#getName()
	 * @see #getSpecialElement()
	 * @generated
	 */
	EAttribute getSpecialElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QSpecialElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.smeup.sys.il.data.term.QSpecialElement#getText()
	 * @see #getSpecialElement()
	 * @generated
	 */
	EAttribute getSpecialElement_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QSpecialElement#isUnary <em>Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unary</em>'.
	 * @see org.smeup.sys.il.data.term.QSpecialElement#isUnary()
	 * @see #getSpecialElement()
	 * @generated
	 */
	EAttribute getSpecialElement_Unary();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.data.term.QSpecialElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.smeup.sys.il.data.term.QSpecialElement#getValue()
	 * @see #getSpecialElement()
	 * @generated
	 */
	EAttribute getSpecialElement_Value();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.il.data.term.DataTermType <em>Data Term Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Term Type</em>'.
	 * @see org.smeup.sys.il.data.term.DataTermType
	 * @generated
	 */
	EEnum getDataTermType();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.il.data.term.FormatType <em>Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format Type</em>'.
	 * @see org.smeup.sys.il.data.term.FormatType
	 * @generated
	 */
	EEnum getFormatType();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageDataTermFactory getIntegratedLanguageDataTermFactory();

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
		 * {@link org.smeup.sys.il.data.term.impl.DataTermImpl
		 * <em>Data Term</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see org.smeup.sys.il.data.term.impl.DataTermImpl
		 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getDataTerm()
		 * @generated
		 */
		EClass DATA_TERM = eINSTANCE.getDataTerm();

		/**
		 * The meta object literal for the '<em><b>Based</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TERM__BASED = eINSTANCE.getDataTerm_Based();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DATA_TERM__CARDINALITY = eINSTANCE.getDataTerm_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TERM__CONSTANT = eINSTANCE.getDataTerm_Constant();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TERM__DEFAULT = eINSTANCE.getDataTerm_Default();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DATA_TERM__DEFINITION = eINSTANCE.getDataTerm_Definition();

		/**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TERM__INITIALIZED = eINSTANCE.getDataTerm_Initialized();

		/**
		 * The meta object literal for the '<em><b>Like</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TERM__LIKE = eINSTANCE.getDataTerm_Like();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TERM__NAME = eINSTANCE.getDataTerm_Name();

		/**
		 * The meta object literal for the '<em><b>Restricted</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TERM__RESTRICTED = eINSTANCE.getDataTerm_Restricted();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TERM__TEXT = eINSTANCE.getDataTerm_Text();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.term.QDataTermContainer <em>Data Term Container</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.term.QDataTermContainer
		 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getDataTermContainer()
		 * @generated
		 */
		EClass DATA_TERM_CONTAINER = eINSTANCE.getDataTermContainer();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.term.impl.DataTermVisitorImpl <em>Data Term Visitor</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.term.impl.DataTermVisitorImpl
		 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getDataTermVisitor()
		 * @generated
		 */
		EClass DATA_TERM_VISITOR = eINSTANCE.getDataTermVisitor();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.term.impl.FormatImpl <em>Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.term.impl.FormatImpl
		 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getFormat()
		 * @generated
		 */
		EClass FORMAT = eINSTANCE.getFormat();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAT__EXPRESSION = eINSTANCE.getFormat_Expression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAT__TYPE = eINSTANCE.getFormat_Type();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.term.impl.OverlayImpl <em>Overlay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.term.impl.OverlayImpl
		 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getOverlay()
		 * @generated
		 */
		EClass OVERLAY = eINSTANCE.getOverlay();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY__NAME = eINSTANCE.getOverlay_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY__POSITION = eINSTANCE.getOverlay_Position();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.term.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.term.impl.RangeImpl
		 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MAX = eINSTANCE.getRange_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MIN = eINSTANCE.getRange_Min();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.term.impl.RemapImpl <em>Remap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.term.impl.RemapImpl
		 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getRemap()
		 * @generated
		 */
		EClass REMAP = eINSTANCE.getRemap();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMAP__NAME = eINSTANCE.getRemap_Name();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMAP__INDEX = eINSTANCE.getRemap_Index();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.term.impl.SpecialImpl <em>Special</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.term.impl.SpecialImpl
		 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getSpecial()
		 * @generated
		 */
		EClass SPECIAL = eINSTANCE.getSpecial();

		/**
		 * The meta object literal for the '<em><b>Class Delegate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL__CLASS_DELEGATE = eINSTANCE.getSpecial_ClassDelegate();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIAL__ELEMENTS = eINSTANCE.getSpecial_Elements();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.term.impl.SpecialElementImpl <em>Special Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.term.impl.SpecialElementImpl
		 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getSpecialElement()
		 * @generated
		 */
		EClass SPECIAL_ELEMENT = eINSTANCE.getSpecialElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_ELEMENT__NAME = eINSTANCE.getSpecialElement_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_ELEMENT__TEXT = eINSTANCE.getSpecialElement_Text();

		/**
		 * The meta object literal for the '<em><b>Unary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_ELEMENT__UNARY = eINSTANCE.getSpecialElement_Unary();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_ELEMENT__VALUE = eINSTANCE.getSpecialElement_Value();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.term.DataTermType <em>Data Term Type</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.data.term.DataTermType
		 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getDataTermType()
		 * @generated
		 */
		EEnum DATA_TERM_TYPE = eINSTANCE.getDataTermType();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.data.term.FormatType <em>Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.data.term.FormatType
		 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getFormatType()
		 * @generated
		 */
		EEnum FORMAT_TYPE = eINSTANCE.getFormatType();

	}

} // QIntegratedLanguageDataTermPackage
