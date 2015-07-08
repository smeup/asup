/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.core.term;

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
 * 
 * @see org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageCoreTermPackage extends EPackage {
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
	String eNS_URI = "http://www.smeup.org/asup/il/core/term";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "il-core-term";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	QIntegratedLanguageCoreTermPackage eINSTANCE = org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.core.term.QTerm
	 * <em>Term</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.smeup.sys.il.core.term.QTerm
	 * @see org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 0;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TERM__FACETS = QIntegratedLanguageCorePackage.NAMED_NODE__FACETS;

	/**
	 * The number of structural features of the '<em>Term</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = QIntegratedLanguageCorePackage.NAMED_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.smeup.sys.il.core.term.QTermContainer <em>Term Container</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.smeup.sys.il.core.term.QTermContainer
	 * @see org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl#getTermContainer()
	 * @generated
	 */
	int TERM_CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Term Container</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TERM_CONTAINER_FEATURE_COUNT = 0;

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
	 * Returns the meta object for class '
	 * {@link org.smeup.sys.il.core.term.QTermContainer <em>Term Container</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * 
	 * @generated
	 */
	interface Literals {
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
		 * The meta object literal for the '
		 * {@link org.smeup.sys.il.core.term.QTermContainer
		 * <em>Term Container</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.smeup.sys.il.core.term.QTermContainer
		 * @see org.smeup.sys.il.core.term.impl.IntegratedLanguageCoreTermPackageImpl#getTermContainer()
		 * @generated
		 */
		EClass TERM_CONTAINER = eINSTANCE.getTermContainer();

	}

} // QIntegratedLanguageCoreTermPackage
