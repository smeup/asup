/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.mind;

import java.io.Closeable;

import java.util.List;

import org.smeup.sys.il.core.ctx.QContextProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reasoner</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.mind.QIntegratedLanguageMindPackage#getReasoner()
 * @model interface="true" abstract="true" superTypes="org.smeup.sys.il.core.ctx.ContextProvider org.smeup.sys.mi.core.JavaCloseable"
 * @generated
 */
public interface QReasoner extends QContextProvider, Closeable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" questionRequired="true"
	 * @generated
	 */
	QQuestion buildQuestion(String question);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model theoryRequired="true"
	 * @generated
	 */
	void loadTheory(QTheory theory);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" questionRequired="true"
	 * @generated
	 */
	List<QGoal> query(String question);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" questionRequired="true"
	 * @generated
	 */
	List<QGoal> query(QQuestion question);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reload();

} // QReasoner
