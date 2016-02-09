/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.term;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageCoreTermPackage extends EPackage {
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
	String eNS_URI = "http://www.smeup.org/asup/il/core/term";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-core-term";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageCoreTermPackage eINSTANCE = org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.term.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.term.impl.NodeImpl
	 * @see org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FACETS = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.term.impl.NamedNodeImpl <em>Named Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.term.impl.NamedNodeImpl
	 * @see org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl#getNamedNode()
	 * @generated
	 */
	int NAMED_NODE = 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE__FACETS = NODE__FACETS;

	/**
	 * The number of structural features of the '<em>Named Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.term.QTerm <em>Term</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.term.QTerm
	 * @see org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 2;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__FACETS = NAMED_NODE__FACETS;

	/**
	 * The number of structural features of the '<em>Term</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = NAMED_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.term.QTermContainer <em>Term Container</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.smeup.sys.il.core.term.QTermContainer
	 * @see org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl#getTermContainer()
	 * @generated
	 */
	int TERM_CONTAINER = 3;

	/**
	 * The number of structural features of the '<em>Term Container</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_CONTAINER_FEATURE_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.term.QNamedNode <em>Named Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Node</em>'.
	 * @see org.smeup.sys.il.core.term.QNamedNode
	 * @generated
	 */
	EClass getNamedNode();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.term.QNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.smeup.sys.il.core.term.QNode
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.il.core.term.QNode#getFacets <em>Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facets</em>'.
	 * @see org.smeup.sys.il.core.term.QNode#getFacets()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Facets();

	/**
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.term.QTerm <em>Term</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Term</em>'.
	 * @see org.smeup.sys.il.core.term.QTerm
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.core.term.QTermContainer <em>Term Container</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Container</em>'.
	 * @see org.smeup.sys.il.core.term.QTermContainer
	 * @generated
	 */
	EClass getTermContainer();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageCoreTermFactory getIntegratedLanguageCoreTermFactory();

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
		 * The meta object literal for the '{@link org.smeup.sys.il.core.term.impl.NamedNodeImpl <em>Named Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.term.impl.NamedNodeImpl
		 * @see org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl#getNamedNode()
		 * @generated
		 */
		EClass NAMED_NODE = eINSTANCE.getNamedNode();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.term.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.core.term.impl.NodeImpl
		 * @see org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Facets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FACETS = eINSTANCE.getNode_Facets();

		/**
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.core.term.QTerm <em>Term</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.smeup.sys.il.core.term.QTerm
		 * @see org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.core.term.QTermContainer <em>Term Container</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.smeup.sys.il.core.term.QTermContainer
		 * @see org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl#getTermContainer()
		 * @generated
		 */
		EClass TERM_CONTAINER = eINSTANCE.getTermContainer();

	}

} // QIntegratedLanguageCoreTermPackage
