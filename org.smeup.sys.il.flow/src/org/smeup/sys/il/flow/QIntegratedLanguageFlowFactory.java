/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.flow;

import org.eclipse.emf.ecore.EFactory;
import org.smeup.sys.il.core.term.QTerm;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.smeup.sys.il.flow.QIntegratedLanguageFlowPackage
 * @generated
 */
public interface QIntegratedLanguageFlowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	QIntegratedLanguageFlowFactory eINSTANCE = org.smeup.sys.il.flow.impl.IntegratedLanguageFlowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation Command</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Annotation Command</em>'.
	 * @generated
	 */
	QAnnotationCommand createAnnotationCommand();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	QBlock createBlock();

	/**
	 * Returns a new object of class '<em>Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break</em>'.
	 * @generated
	 */
	QBreak createBreak();

	/**
	 * Returns a new object of class '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call</em>'.
	 * @generated
	 */
	QCall createCall();

	/**
	 * Returns a new object of class '<em>Command Exec</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Command Exec</em>'.
	 * @generated
	 */
	QCommandExec createCommandExec();

	/**
	 * Returns a new object of class '<em>Continue</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Continue</em>'.
	 * @generated
	 */
	QContinue createContinue();

	/**
	 * Returns a new object of class '<em>Data Section</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Data Section</em>'.
	 * @generated
	 */
	QDataSection createDataSection();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	QEntry createEntry();

	/**
	 * Returns a new object of class '<em>Entry Parameter</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Entry Parameter</em>'.
	 * @generated
	 */
	<T extends QTerm> QEntryParameter<T> createEntryParameter();

	/**
	 * Returns a new object of class '<em>Eval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eval</em>'.
	 * @generated
	 */
	QEval createEval();

	/**
	 * Returns a new object of class '<em>File Section</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>File Section</em>'.
	 * @generated
	 */
	QFileSection createFileSection();

	/**
	 * Returns a new object of class '<em>Flow Data</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Data</em>'.
	 * @generated
	 */
	QFlowData createFlowData();

	/**
	 * Returns a new object of class '<em>Flow Section</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Flow Section</em>'.
	 * @generated
	 */
	QFlowSection createFlowSection();

	/**
	 * Returns a new object of class '<em>If</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>If</em>'.
	 * @generated
	 */
	QIf createIf();

	/**
	 * Returns a new object of class '<em>Jump</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jump</em>'.
	 * @generated
	 */
	QJump createJump();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	QLabel createLabel();

	/**
	 * Returns a new object of class '<em>Method Exec</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Exec</em>'.
	 * @generated
	 */
	QMethodExec createMethodExec();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	QModule createModule();

	/**
	 * Returns a new object of class '<em>Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitor</em>'.
	 * @generated
	 */
	QMonitor createMonitor();

	/**
	 * Returns a new object of class '<em>On Error</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>On Error</em>'.
	 * @generated
	 */
	QOnError createOnError();

	/**
	 * Returns a new object of class '<em>Parameter List</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Parameter List</em>'.
	 * @generated
	 */
	QParameterList createParameterList();

	/**
	 * Returns a new object of class '<em>Procedure</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure</em>'.
	 * @generated
	 */
	QProcedure createProcedure();

	/**
	 * Returns a new object of class '<em>Procedure Exec</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Procedure Exec</em>'.
	 * @generated
	 */
	QProcedureExec createProcedureExec();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	QProgram createProgram();

	/**
	 * Returns a new object of class '<em>Prototype</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Prototype</em>'.
	 * @generated
	 */
	QPrototype createPrototype();

	/**
	 * Returns a new object of class '<em>Reset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset</em>'.
	 * @generated
	 */
	QReset createReset();

	/**
	 * Returns a new object of class '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return</em>'.
	 * @generated
	 */
	QReturn createReturn();

	/**
	 * Returns a new object of class '<em>Routine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routine</em>'.
	 * @generated
	 */
	QRoutine createRoutine();

	/**
	 * Returns a new object of class '<em>Routine Exec</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Routine Exec</em>'.
	 * @generated
	 */
	QRoutineExec createRoutineExec();

	/**
	 * Returns a new object of class '<em>Setup Section</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Setup Section</em>'.
	 * @generated
	 */
	QSetupSection createSetupSection();

	/**
	 * Returns a new object of class '<em>SQL Exec</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SQL Exec</em>'.
	 * @generated
	 */
	QSQLExec createSQLExec();

	/**
	 * Returns a new object of class '<em>Until</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Until</em>'.
	 * @generated
	 */
	QUntil createUntil();

	/**
	 * Returns a new object of class '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While</em>'.
	 * @generated
	 */
	QWhile createWhile();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QIntegratedLanguageFlowPackage getIntegratedLanguageFlowPackage();

	/**
	 * Returns a new object of class '<em>For</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For</em>'.
	 * @generated
	 */
	QFor createFor();

} // QIntegratedLanguageFlowFactory
