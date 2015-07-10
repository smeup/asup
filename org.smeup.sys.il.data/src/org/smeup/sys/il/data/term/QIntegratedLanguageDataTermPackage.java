/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
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
 * 
 * @see org.smeup.sys.il.data.term.QIntegratedLanguageDataTermFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageDataTermPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "term";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/data/term";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "il-data-term";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	QIntegratedLanguageDataTermPackage eINSTANCE = org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl.init();

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.term.impl.DataTermImpl <em>Data Term</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.smeup.sys.il.data.term.impl.DataTermImpl
	 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getDataTerm()
	 * @generated
	 */
	int DATA_TERM = 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__FACETS = QIntegratedLanguageCoreTermPackage.TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__CARDINALITY = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__CONSTANT = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__DEFAULT = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__DEFINITION = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__INITIALIZED = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Like</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__LIKE = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__NAME = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__RESTRICTED = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TERM__TEXT = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Data Term</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DATA_TERM_FEATURE_COUNT = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.term.QDataTermContainer
	 * <em>Data Term Container</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.smeup.sys.il.data.term.QDataTermContainer
	 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getDataTermContainer()
	 * @generated
	 */
	int DATA_TERM_CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Data Term Container</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TERM_CONTAINER_FEATURE_COUNT = QIntegratedLanguageCoreTermPackage.TERM_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.term.impl.DataTermVisitorImpl
	 * <em>Data Term Visitor</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.smeup.sys.il.data.term.impl.DataTermVisitorImpl
	 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getDataTermVisitor()
	 * @generated
	 */
	int DATA_TERM_VISITOR = 2;

	/**
	 * The number of structural features of the '<em>Data Term Visitor</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TERM_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.data.term.DataTermType <em>Data Term Type</em>}'
	 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.smeup.sys.il.data.term.DataTermType
	 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getDataTermType()
	 * @generated
	 */
	int DATA_TERM_TYPE = 3;

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
	 * Returns the meta object for the containment reference '
	 * {@link org.smeup.sys.il.data.term.QDataTerm#getCardinality
	 * <em>Cardinality</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Cardinality</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTerm#getCardinality()
	 * @see #getDataTerm()
	 * @generated
	 */
	EReference getDataTerm_Cardinality();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.data.term.QDataTerm#isConstant <em>Constant</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTerm#isConstant()
	 * @see #getDataTerm()
	 * @generated
	 */
	EAttribute getDataTerm_Constant();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.smeup.sys.il.data.term.QDataTerm#getDefault <em>Default</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTerm#getDefault()
	 * @see #getDataTerm()
	 * @generated
	 */
	EReference getDataTerm_Default();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.smeup.sys.il.data.term.QDataTerm#getDefinition
	 * <em>Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Definition</em>'.
	 * @see org.smeup.sys.il.data.term.QDataTerm#getDefinition()
	 * @see #getDataTerm()
	 * @generated
	 */
	EReference getDataTerm_Definition();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.data.term.QDataTerm#isInitialized
	 * <em>Initialized</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * Returns the meta object for the attribute '
	 * {@link org.smeup.sys.il.data.term.QDataTerm#isRestricted
	 * <em>Restricted</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * Returns the meta object for enum '
	 * {@link org.smeup.sys.il.data.term.DataTermType <em>Data Term Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Data Term Type</em>'.
	 * @see org.smeup.sys.il.data.term.DataTermType
	 * @generated
	 */
	EEnum getDataTermType();

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
	 * 
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
		 * The meta object literal for the '<em><b>Cardinality</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DATA_TERM__CARDINALITY = eINSTANCE.getDataTerm_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DATA_TERM__CONSTANT = eINSTANCE.getDataTerm_Constant();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DATA_TERM__DEFAULT = eINSTANCE.getDataTerm_Default();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DATA_TERM__DEFINITION = eINSTANCE.getDataTerm_Definition();

		/**
		 * The meta object literal for the '<em><b>Initialized</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DATA_TERM__INITIALIZED = eINSTANCE.getDataTerm_Initialized();

		/**
		 * The meta object literal for the '<em><b>Like</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DATA_TERM__LIKE = eINSTANCE.getDataTerm_Like();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DATA_TERM__NAME = eINSTANCE.getDataTerm_Name();

		/**
		 * The meta object literal for the '<em><b>Restricted</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DATA_TERM__RESTRICTED = eINSTANCE.getDataTerm_Restricted();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DATA_TERM__TEXT = eINSTANCE.getDataTerm_Text();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.term.QDataTermContainer
		 * <em>Data Term Container</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.smeup.sys.il.data.term.QDataTermContainer
		 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getDataTermContainer()
		 * @generated
		 */
		EClass DATA_TERM_CONTAINER = eINSTANCE.getDataTermContainer();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.term.impl.DataTermVisitorImpl
		 * <em>Data Term Visitor</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.smeup.sys.il.data.term.impl.DataTermVisitorImpl
		 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getDataTermVisitor()
		 * @generated
		 */
		EClass DATA_TERM_VISITOR = eINSTANCE.getDataTermVisitor();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.data.term.DataTermType
		 * <em>Data Term Type</em>}' enum. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.smeup.sys.il.data.term.DataTermType
		 * @see org.smeup.sys.il.data.term.impl.IntegratedLanguageDataTermPackageImpl#getDataTermType()
		 * @generated
		 */
		EEnum DATA_TERM_TYPE = eINSTANCE.getDataTermType();

	}

} // QIntegratedLanguageDataTermPackage
