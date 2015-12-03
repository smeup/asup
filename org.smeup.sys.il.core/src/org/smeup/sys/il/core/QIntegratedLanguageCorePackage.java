/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaPackage;
import org.smeup.sys.mi.core.QMachineInterfaceCorePackage;

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
 * @see org.smeup.sys.il.core.QIntegratedLanguageCoreFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageCorePackage eINSTANCE = org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.QNameable <em>Nameable</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.QNameable
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getNameable()
	 * @generated
	 */
	int NAMEABLE = 6;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.AnnotationImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.AnnotationTestImpl <em>Annotation Test</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.AnnotationTestImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getAnnotationTest()
	 * @generated
	 */
	int ANNOTATION_TEST = 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.NodeImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 8;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.NamedNodeImpl <em>Named Node</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.NamedNodeImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getNamedNode()
	 * @generated
	 */
	int NAMED_NODE = 7;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.ConversionImpl <em>Conversion</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.ConversionImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getConversion()
	 * @generated
	 */
	int CONVERSION = 3;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.DerivedImpl <em>Derived</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.DerivedImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getDerived()
	 * @generated
	 */
	int DERIVED = 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.FormatImpl <em>Format</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.FormatImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getFormat()
	 * @generated
	 */
	int FORMAT = 5;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.ObjectImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 9;

	/**
	 * The number of structural features of the '<em>Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.AnnotationScopeImpl <em>Annotation Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.AnnotationScopeImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getAnnotationScope()
	 * @generated
	 */
	int ANNOTATION_SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SCOPE__NAME = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_SCOPE_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TEST__EXPRESSION = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TEST__MESSAGE = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation Test</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TEST_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CONVERSION__STATUS = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conversion</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_FEATURE_COUNT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Derived</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURE_COUNT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FORMAT__EXPRESSION = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FORMAT__TYPE = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Format</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FORMAT_FEATURE_COUNT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Nameable</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FACETS = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE__FACETS = NODE__FACETS;

	/**
	 * The number of structural features of the '<em>Named Node</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.ObjectContainerImpl <em>Object Container</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.ObjectContainerImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectContainer()
	 * @generated
	 */
	int OBJECT_CONTAINER = 10;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONTAINER__CONTENTS = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Container</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CONTAINER_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.QObjectIterator <em>Object Iterator</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.QObjectIterator
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectIterator()
	 * @generated
	 */
	int OBJECT_ITERATOR = 11;

	/**
	 * The number of structural features of the '<em>Object Iterator</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ITERATOR_FEATURE_COUNT = QMachineInterfaceCorePackage.JAVA_ITERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.ObjectNameableImpl <em>Object Nameable</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.ObjectNameableImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectNameable()
	 * @generated
	 */
	int OBJECT_NAMEABLE = 12;

	/**
	 * The number of structural features of the '<em>Object Nameable</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NAMEABLE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.OverlayImpl <em>Overlay</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.OverlayImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getOverlay()
	 * @generated
	 */
	int OVERLAY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OVERLAY__NAME = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OVERLAY__POSITION = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Overlay</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OVERLAY_FEATURE_COUNT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.RemapImpl <em>Remap</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.RemapImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getRemap()
	 * @generated
	 */
	int REMAP = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REMAP__NAME = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REMAP__INDEX = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remap</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int REMAP_FEATURE_COUNT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.SpecialImpl <em>Special</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.SpecialImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getSpecial()
	 * @generated
	 */
	int SPECIAL = 15;

	/**
	 * The feature id for the '<em><b>Class Delegate</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPECIAL__CLASS_DELEGATE = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL__ELEMENTS = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Special</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPECIAL_FEATURE_COUNT = QIntegratedLanguageCoreMetaPackage.FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.impl.SpecialElementImpl <em>Special Element</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.smeup.sys.il.core.impl.SpecialElementImpl
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getSpecialElement()
	 * @generated
	 */
	int SPECIAL_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT__FACETS = NAMED_NODE__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT__NAME = NAMED_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT__TEXT = NAMED_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unary</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT__UNARY = NAMED_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT__VALUE = NAMED_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Special Element</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ELEMENT_FEATURE_COUNT = NAMED_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.ConversionStatus <em>Conversion Status</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.ConversionStatus
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getConversionStatus()
	 * @generated
	 */
	int CONVERSION_STATUS = 17;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.FormatType
	 * <em>Format Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.core.FormatType
	 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getFormatType()
	 * @generated
	 */
	int FORMAT_TYPE = 18;

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.QAnnotation <em>Annotation</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.smeup.sys.il.core.QAnnotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QAnnotationScope <em>Annotation Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Scope</em>'.
	 * @see org.smeup.sys.il.core.QAnnotationScope
	 * @generated
	 */
	EClass getAnnotationScope();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.QAnnotationScope#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.il.core.QAnnotationScope#getName()
	 * @see #getAnnotationScope()
	 * @generated
	 */
	EAttribute getAnnotationScope_Name();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QAnnotationTest <em>Annotation Test</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Test</em>'.
	 * @see org.smeup.sys.il.core.QAnnotationTest
	 * @generated
	 */
	EClass getAnnotationTest();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.QAnnotationTest#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.smeup.sys.il.core.QAnnotationTest#getExpression()
	 * @see #getAnnotationTest()
	 * @generated
	 */
	EAttribute getAnnotationTest_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.QAnnotationTest#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.smeup.sys.il.core.QAnnotationTest#getMessage()
	 * @see #getAnnotationTest()
	 * @generated
	 */
	EAttribute getAnnotationTest_Message();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.QConversion <em>Conversion</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Conversion</em>'.
	 * @see org.smeup.sys.il.core.QConversion
	 * @generated
	 */
	EClass getConversion();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.QConversion#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.smeup.sys.il.core.QConversion#getStatus()
	 * @see #getConversion()
	 * @generated
	 */
	EAttribute getConversion_Status();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived</em>'.
	 * @see org.smeup.sys.il.core.QDerived
	 * @generated
	 */
	EClass getDerived();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QFormat <em>Format</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Format</em>'.
	 * @see org.smeup.sys.il.core.QFormat
	 * @generated
	 */
	EClass getFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.QFormat#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.smeup.sys.il.core.QFormat#getExpression()
	 * @see #getFormat()
	 * @generated
	 */
	EAttribute getFormat_Expression();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.core.QFormat#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.smeup.sys.il.core.QFormat#getType()
	 * @see #getFormat()
	 * @generated
	 */
	EAttribute getFormat_Type();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.QNameable <em>Nameable</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Nameable</em>'.
	 * @see org.smeup.sys.il.core.QNameable
	 * @generated
	 */
	EClass getNameable();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.QNamedNode <em>Named Node</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Named Node</em>'.
	 * @see org.smeup.sys.il.core.QNamedNode
	 * @generated
	 */
	EClass getNamedNode();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QNode <em>Node</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.smeup.sys.il.core.QNode
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.asup.il.flow.QNode#getFacets <em>Facets</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '
	 *         <em>Facets</em>'.
	 * @see org.asup.il.flow.QNode#getFacets()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Facets();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QObject <em>Object</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.smeup.sys.il.core.QObject
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QObjectContainer <em>Object Container</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Container</em>'.
	 * @see org.smeup.sys.il.core.QObjectContainer
	 * @generated
	 */
	EClass getObjectContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.il.core.QObjectContainer#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.smeup.sys.il.core.QObjectContainer#getContents()
	 * @see #getObjectContainer()
	 * @generated
	 */
	EReference getObjectContainer_Contents();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QObjectIterator <em>Object Iterator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Iterator</em>'.
	 * @see org.smeup.sys.il.core.QObjectIterator
	 * @generated
	 */
	EClass getObjectIterator();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QObjectNameable <em>Object Nameable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Nameable</em>'.
	 * @see org.smeup.sys.il.core.QObjectNameable
	 * @generated
	 */
	EClass getObjectNameable();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QOverlay <em>Overlay</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlay</em>'.
	 * @see org.smeup.sys.il.core.QOverlay
	 * @generated
	 */
	EClass getOverlay();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.core.QOverlay#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.il.core.QOverlay#getName()
	 * @see #getOverlay()
	 * @generated
	 */
	EAttribute getOverlay_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.QOverlay#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.smeup.sys.il.core.QOverlay#getPosition()
	 * @see #getOverlay()
	 * @generated
	 */
	EAttribute getOverlay_Position();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QRemap <em>Remap</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remap</em>'.
	 * @see org.smeup.sys.il.core.QRemap
	 * @generated
	 */
	EClass getRemap();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.core.QRemap#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.il.core.QRemap#getName()
	 * @see #getRemap()
	 * @generated
	 */
	EAttribute getRemap_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.core.QRemap#getIndex <em>Index</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.smeup.sys.il.core.QRemap#getIndex()
	 * @see #getRemap()
	 * @generated
	 */
	EAttribute getRemap_Index();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QSpecial <em>Special</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special</em>'.
	 * @see org.smeup.sys.il.core.QSpecial
	 * @generated
	 */
	EClass getSpecial();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.QSpecial#getClassDelegate <em>Class Delegate</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Delegate</em>'.
	 * @see org.smeup.sys.il.core.QSpecial#getClassDelegate()
	 * @see #getSpecial()
	 * @generated
	 */
	EAttribute getSpecial_ClassDelegate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.il.core.QSpecial#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.smeup.sys.il.core.QSpecial#getElements()
	 * @see #getSpecial()
	 * @generated
	 */
	EReference getSpecial_Elements();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.QSpecialElement <em>Special Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Element</em>'.
	 * @see org.smeup.sys.il.core.QSpecialElement
	 * @generated
	 */
	EClass getSpecialElement();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.QSpecialElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.il.core.QSpecialElement#getName()
	 * @see #getSpecialElement()
	 * @generated
	 */
	EAttribute getSpecialElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.QSpecialElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.smeup.sys.il.core.QSpecialElement#getText()
	 * @see #getSpecialElement()
	 * @generated
	 */
	EAttribute getSpecialElement_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.QSpecialElement#isUnary <em>Unary</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unary</em>'.
	 * @see org.smeup.sys.il.core.QSpecialElement#isUnary()
	 * @see #getSpecialElement()
	 * @generated
	 */
	EAttribute getSpecialElement_Unary();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.QSpecialElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.smeup.sys.il.core.QSpecialElement#getValue()
	 * @see #getSpecialElement()
	 * @generated
	 */
	EAttribute getSpecialElement_Value();

	/**
	 * Returns the meta object for enum '{@link org.smeup.sys.il.core.ConversionStatus <em>Conversion Status</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conversion Status</em>'.
	 * @see org.smeup.sys.il.core.ConversionStatus
	 * @generated
	 */
	EEnum getConversionStatus();

	/**
	 * Returns the meta object for enum '
	 * {@link org.smeup.sys.il.core.FormatType <em>Format Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Format Type</em>'.
	 * @see org.smeup.sys.il.core.FormatType
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
	QIntegratedLanguageCoreFactory getIntegratedLanguageCoreFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.AnnotationImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.AnnotationScopeImpl <em>Annotation Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.AnnotationScopeImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getAnnotationScope()
		 * @generated
		 */
		EClass ANNOTATION_SCOPE = eINSTANCE.getAnnotationScope();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_SCOPE__NAME = eINSTANCE.getAnnotationScope_Name();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.AnnotationTestImpl <em>Annotation Test</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.AnnotationTestImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getAnnotationTest()
		 * @generated
		 */
		EClass ANNOTATION_TEST = eINSTANCE.getAnnotationTest();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TEST__EXPRESSION = eINSTANCE.getAnnotationTest_Expression();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_TEST__MESSAGE = eINSTANCE.getAnnotationTest_Message();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.ConversionImpl <em>Conversion</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.ConversionImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getConversion()
		 * @generated
		 */
		EClass CONVERSION = eINSTANCE.getConversion();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION__STATUS = eINSTANCE.getConversion_Status();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.DerivedImpl <em>Derived</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.DerivedImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getDerived()
		 * @generated
		 */
		EClass DERIVED = eINSTANCE.getDerived();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.FormatImpl <em>Format</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.FormatImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getFormat()
		 * @generated
		 */
		EClass FORMAT = eINSTANCE.getFormat();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAT__EXPRESSION = eINSTANCE.getFormat_Expression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAT__TYPE = eINSTANCE.getFormat_Type();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.QNameable <em>Nameable</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.QNameable
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getNameable()
		 * @generated
		 */
		EClass NAMEABLE = eINSTANCE.getNameable();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.NamedNodeImpl <em>Named Node</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.NamedNodeImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getNamedNode()
		 * @generated
		 */
		EClass NAMED_NODE = eINSTANCE.getNamedNode();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.NodeImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Facets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FACETS = eINSTANCE.getNode_Facets();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.ObjectImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.ObjectContainerImpl <em>Object Container</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.ObjectContainerImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectContainer()
		 * @generated
		 */
		EClass OBJECT_CONTAINER = eINSTANCE.getObjectContainer();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CONTAINER__CONTENTS = eINSTANCE.getObjectContainer_Contents();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.QObjectIterator <em>Object Iterator</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.QObjectIterator
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectIterator()
		 * @generated
		 */
		EClass OBJECT_ITERATOR = eINSTANCE.getObjectIterator();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.ObjectNameableImpl <em>Object Nameable</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.ObjectNameableImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getObjectNameable()
		 * @generated
		 */
		EClass OBJECT_NAMEABLE = eINSTANCE.getObjectNameable();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.OverlayImpl <em>Overlay</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.OverlayImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getOverlay()
		 * @generated
		 */
		EClass OVERLAY = eINSTANCE.getOverlay();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY__NAME = eINSTANCE.getOverlay_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY__POSITION = eINSTANCE.getOverlay_Position();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.RemapImpl <em>Remap</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.RemapImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getRemap()
		 * @generated
		 */
		EClass REMAP = eINSTANCE.getRemap();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMAP__NAME = eINSTANCE.getRemap_Name();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMAP__INDEX = eINSTANCE.getRemap_Index();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.SpecialImpl <em>Special</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.SpecialImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getSpecial()
		 * @generated
		 */
		EClass SPECIAL = eINSTANCE.getSpecial();

		/**
		 * The meta object literal for the '<em><b>Class Delegate</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL__CLASS_DELEGATE = eINSTANCE.getSpecial_ClassDelegate();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SPECIAL__ELEMENTS = eINSTANCE.getSpecial_Elements();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.impl.SpecialElementImpl <em>Special Element</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.impl.SpecialElementImpl
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getSpecialElement()
		 * @generated
		 */
		EClass SPECIAL_ELEMENT = eINSTANCE.getSpecialElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_ELEMENT__NAME = eINSTANCE.getSpecialElement_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_ELEMENT__TEXT = eINSTANCE.getSpecialElement_Text();

		/**
		 * The meta object literal for the '<em><b>Unary</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_ELEMENT__UNARY = eINSTANCE.getSpecialElement_Unary();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_ELEMENT__VALUE = eINSTANCE.getSpecialElement_Value();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.ConversionStatus <em>Conversion Status</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.ConversionStatus
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getConversionStatus()
		 * @generated
		 */
		EEnum CONVERSION_STATUS = eINSTANCE.getConversionStatus();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.FormatType <em>Format Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.FormatType
		 * @see org.smeup.sys.il.core.impl.IntegratedLanguageCorePackageImpl#getFormatType()
		 * @generated
		 */
		EEnum FORMAT_TYPE = eINSTANCE.getFormatType();

	}

} // QIntegratedLanguageCorePackage
