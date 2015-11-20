/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.meta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
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
 * @see org.smeup.sys.il.core.meta.QIntegratedLanguageCoreMetaFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageCoreMetaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "meta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/core/meta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-core-meta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageCoreMetaPackage eINSTANCE = org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.meta.impl.FacetImpl <em>Facet</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.meta.impl.FacetImpl
	 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getFacet()
	 * @generated
	 */
	int FACET = 3;

	/**
	 * The number of structural features of the '<em>Facet</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FACET_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.core.meta.impl.CardinalityImpl
	 * <em>Cardinality</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see org.smeup.sys.il.core.meta.impl.CardinalityImpl
	 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__MAX = FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__MIN = FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.meta.impl.DefaultImpl <em>Default</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.meta.impl.DefaultImpl
	 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getDefault()
	 * @generated
	 */
	int DEFAULT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT__VALUE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT__VALUES = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Default</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.meta.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.meta.impl.DomainImpl
	 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOMAIN__TEXT = FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.meta.QFrame <em>Frame</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.meta.QFrame
	 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 4;

	/**
	 * The number of structural features of the '<em>Frame</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = QIntegratedLanguageCorePackage.NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.meta.QFrameManager <em>Frame Manager</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.meta.QFrameManager
	 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getFrameManager()
	 * @generated
	 */
	int FRAME_MANAGER = 5;

	/**
	 * The number of structural features of the '<em>Frame Manager</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.meta.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.meta.impl.RangeImpl
	 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 6;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGE__MAX = FACET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGE__MIN = FACET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = FACET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.meta.QSlot <em>Slot</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.meta.QSlot
	 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getSlot()
	 * @generated
	 */
	int SLOT = 7;

	/**
	 * The number of structural features of the '<em>Slot</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = QIntegratedLanguageCorePackage.NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.meta.QCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see org.smeup.sys.il.core.meta.QCardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.meta.QCardinality#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.smeup.sys.il.core.meta.QCardinality#getMax()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.meta.QCardinality#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.smeup.sys.il.core.meta.QCardinality#getMin()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Min();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.meta.QDefault <em>Default</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Default</em>'.
	 * @see org.smeup.sys.il.core.meta.QDefault
	 * @generated
	 */
	EClass getDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.core.meta.QDefault#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.smeup.sys.il.core.meta.QDefault#getValue()
	 * @see #getDefault()
	 * @generated
	 */
	EAttribute getDefault_Value();

	/**
	 * Returns the meta object for the attribute list '{@link org.smeup.sys.il.core.meta.QDefault#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see org.smeup.sys.il.core.meta.QDefault#getValues()
	 * @see #getDefault()
	 * @generated
	 */
	EAttribute getDefault_Values();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.meta.QDomain <em>Domain</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see org.smeup.sys.il.core.meta.QDomain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.core.meta.QDomain#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.il.core.meta.QDomain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.core.meta.QDomain#getText <em>Text</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.smeup.sys.il.core.meta.QDomain#getText()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Text();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.meta.QFacet <em>Facet</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Facet</em>'.
	 * @see org.smeup.sys.il.core.meta.QFacet
	 * @generated
	 */
	EClass getFacet();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.meta.QFrame <em>Frame</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see org.smeup.sys.il.core.meta.QFrame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.meta.QFrameManager <em>Frame Manager</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame Manager</em>'.
	 * @see org.smeup.sys.il.core.meta.QFrameManager
	 * @generated
	 */
	EClass getFrameManager();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.meta.QRange <em>Range</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Range</em>'.
	 * @see org.smeup.sys.il.core.meta.QRange
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.core.meta.QRange#getMax <em>Max</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.smeup.sys.il.core.meta.QRange#getMax()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Max();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.core.meta.QRange#getMin <em>Min</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.smeup.sys.il.core.meta.QRange#getMin()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Min();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.meta.QSlot <em>Slot</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Slot</em>'.
	 * @see org.smeup.sys.il.core.meta.QSlot
	 * @generated
	 */
	EClass getSlot();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageCoreMetaFactory getIntegratedLanguageCoreMetaFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.il.core.meta.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.meta.impl.CardinalityImpl
		 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__MAX = eINSTANCE.getCardinality_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__MIN = eINSTANCE.getCardinality_Min();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.meta.impl.DefaultImpl <em>Default</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.meta.impl.DefaultImpl
		 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getDefault()
		 * @generated
		 */
		EClass DEFAULT = eINSTANCE.getDefault();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT__VALUE = eINSTANCE.getDefault_Value();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT__VALUES = eINSTANCE.getDefault_Values();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.meta.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.meta.impl.DomainImpl
		 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__TEXT = eINSTANCE.getDomain_Text();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.meta.impl.FacetImpl <em>Facet</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.meta.impl.FacetImpl
		 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getFacet()
		 * @generated
		 */
		EClass FACET = eINSTANCE.getFacet();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.core.meta.QFrame <em>Frame</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.core.meta.QFrame
		 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.meta.QFrameManager <em>Frame Manager</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.meta.QFrameManager
		 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getFrameManager()
		 * @generated
		 */
		EClass FRAME_MANAGER = eINSTANCE.getFrameManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.meta.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.meta.impl.RangeImpl
		 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MAX = eINSTANCE.getRange_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__MIN = eINSTANCE.getRange_Min();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.core.meta.QSlot <em>Slot</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.core.meta.QSlot
		 * @see org.smeup.sys.il.core.meta.impl.IntegratedLanguageCoreMetaPackageImpl#getSlot()
		 * @generated
		 */
		EClass SLOT = eINSTANCE.getSlot();

	}

} // QIntegratedLanguageCoreMetaPackage
