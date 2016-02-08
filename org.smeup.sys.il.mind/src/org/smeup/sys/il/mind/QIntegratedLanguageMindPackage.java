/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.mind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.smeup.sys.il.core.QIntegratedLanguageCorePackage;
import org.smeup.sys.il.core.ctx.QIntegratedLanguageCoreCtxPackage;
import org.smeup.sys.il.core.term.QIntegratedLanguageCoreTermPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.smeup.sys.il.mind.QIntegratedLanguageMindFactory
 * @model kind="package"
 * @generated
 */
public interface QIntegratedLanguageMindPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mind";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.smeup.org/asup/il/mind";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "il-mind";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageMindPackage eINSTANCE = org.smeup.sys.il.mind.impl.IntegratedLanguageMindPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.mind.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.mind.impl.GoalImpl
	 * @see org.smeup.sys.il.mind.impl.IntegratedLanguageMindPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 0;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TERMS = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.mind.QMindManager <em>Mind Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.mind.QMindManager
	 * @see org.smeup.sys.il.mind.impl.IntegratedLanguageMindPackageImpl#getMindManager()
	 * @generated
	 */
	int MIND_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>Mind Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.mind.impl.MindTermImpl <em>Mind Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.mind.impl.MindTermImpl
	 * @see org.smeup.sys.il.mind.impl.IntegratedLanguageMindPackageImpl#getMindTerm()
	 * @generated
	 */
	int MIND_TERM = 2;

	/**
	 * The feature id for the '<em><b>Facets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_TERM__FACETS = QIntegratedLanguageCoreTermPackage.TERM__FACETS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_TERM__NAME = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mind Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_TERM_FEATURE_COUNT = QIntegratedLanguageCoreTermPackage.TERM_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.smeup.sys.il.mind.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.mind.impl.QuestionImpl
	 * @see org.smeup.sys.il.mind.impl.IntegratedLanguageMindPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 3;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__OBJECT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__SUBJECT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__RELATION = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__RULE = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.smeup.sys.il.mind.impl.TheoryImpl <em>Theory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.mind.impl.TheoryImpl
	 * @see org.smeup.sys.il.mind.impl.IntegratedLanguageMindPackageImpl#getTheory()
	 * @generated
	 */
	int THEORY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY__NAME = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY__FACTS = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Theory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY_FEATURE_COUNT = QIntegratedLanguageCorePackage.OBJECT_NAMEABLE_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.smeup.sys.il.mind.QReasoner <em>Reasoner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.smeup.sys.il.mind.QReasoner
	 * @see org.smeup.sys.il.mind.impl.IntegratedLanguageMindPackageImpl#getReasoner()
	 * @generated
	 */
	int REASONER = 5;

	/**
	 * The number of structural features of the '<em>Reasoner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONER_FEATURE_COUNT = QIntegratedLanguageCoreCtxPackage.CONTEXT_PROVIDER_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.mind.QGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see org.smeup.sys.il.mind.QGoal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.il.mind.QGoal#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see org.smeup.sys.il.mind.QGoal#getTerms()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Terms();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.mind.QMindManager <em>Mind Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind Manager</em>'.
	 * @see org.smeup.sys.il.mind.QMindManager
	 * @generated
	 */
	EClass getMindManager();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.mind.QMindTerm <em>Mind Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind Term</em>'.
	 * @see org.smeup.sys.il.mind.QMindTerm
	 * @generated
	 */
	EClass getMindTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.mind.QMindTerm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.il.mind.QMindTerm#getName()
	 * @see #getMindTerm()
	 * @generated
	 */
	EAttribute getMindTerm_Name();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.mind.QQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see org.smeup.sys.il.mind.QQuestion
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.mind.QQuestion#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.smeup.sys.il.mind.QQuestion#getObject()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Object();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.mind.QQuestion#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.smeup.sys.il.mind.QQuestion#getSubject()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Subject();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.mind.QQuestion#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relation</em>'.
	 * @see org.smeup.sys.il.mind.QQuestion#getRelation()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Relation();

	/**
	 * Returns the meta object for the containment reference '{@link org.smeup.sys.il.mind.QQuestion#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see org.smeup.sys.il.mind.QQuestion#getRule()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Rule();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.mind.QTheory <em>Theory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theory</em>'.
	 * @see org.smeup.sys.il.mind.QTheory
	 * @generated
	 */
	EClass getTheory();

	/**
	 * Returns the meta object for the attribute '{@link org.smeup.sys.il.mind.QTheory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.smeup.sys.il.mind.QTheory#getName()
	 * @see #getTheory()
	 * @generated
	 */
	EAttribute getTheory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.smeup.sys.il.mind.QTheory#getFacts <em>Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facts</em>'.
	 * @see org.smeup.sys.il.mind.QTheory#getFacts()
	 * @see #getTheory()
	 * @generated
	 */
	EReference getTheory_Facts();

	/**
	 * Returns the meta object for class '{@link org.smeup.sys.il.mind.QReasoner <em>Reasoner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reasoner</em>'.
	 * @see org.smeup.sys.il.mind.QReasoner
	 * @generated
	 */
	EClass getReasoner();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QIntegratedLanguageMindFactory getIntegratedLanguageMindFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.mind.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.mind.impl.GoalImpl
		 * @see org.smeup.sys.il.mind.impl.IntegratedLanguageMindPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__TERMS = eINSTANCE.getGoal_Terms();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.mind.QMindManager <em>Mind Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.mind.QMindManager
		 * @see org.smeup.sys.il.mind.impl.IntegratedLanguageMindPackageImpl#getMindManager()
		 * @generated
		 */
		EClass MIND_MANAGER = eINSTANCE.getMindManager();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.mind.impl.MindTermImpl <em>Mind Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.mind.impl.MindTermImpl
		 * @see org.smeup.sys.il.mind.impl.IntegratedLanguageMindPackageImpl#getMindTerm()
		 * @generated
		 */
		EClass MIND_TERM = eINSTANCE.getMindTerm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIND_TERM__NAME = eINSTANCE.getMindTerm_Name();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.mind.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.mind.impl.QuestionImpl
		 * @see org.smeup.sys.il.mind.impl.IntegratedLanguageMindPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__OBJECT = eINSTANCE.getQuestion_Object();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__SUBJECT = eINSTANCE.getQuestion_Subject();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__RELATION = eINSTANCE.getQuestion_Relation();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__RULE = eINSTANCE.getQuestion_Rule();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.mind.impl.TheoryImpl <em>Theory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.mind.impl.TheoryImpl
		 * @see org.smeup.sys.il.mind.impl.IntegratedLanguageMindPackageImpl#getTheory()
		 * @generated
		 */
		EClass THEORY = eINSTANCE.getTheory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEORY__NAME = eINSTANCE.getTheory_Name();

		/**
		 * The meta object literal for the '<em><b>Facts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEORY__FACTS = eINSTANCE.getTheory_Facts();

		/**
		 * The meta object literal for the '{@link org.smeup.sys.il.mind.QReasoner <em>Reasoner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.smeup.sys.il.mind.QReasoner
		 * @see org.smeup.sys.il.mind.impl.IntegratedLanguageMindPackageImpl#getReasoner()
		 * @generated
		 */
		EClass REASONER = eINSTANCE.getReasoner();

	}

} //QIntegratedLanguageMindPackage
