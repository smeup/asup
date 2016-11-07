/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.mind;

import org.smeup.sys.il.core.QObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.smeup.sys.il.mind.QQuestion#getObject <em>Object</em>}</li>
 *   <li>{@link org.smeup.sys.il.mind.QQuestion#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.smeup.sys.il.mind.QQuestion#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.smeup.sys.il.mind.QQuestion#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see org.smeup.sys.il.mind.QIntegratedLanguageMindPackage#getQuestion()
 * @model
 * @generated
 */
public interface QQuestion extends QObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(QMindTerm)
	 * @see org.smeup.sys.il.mind.QIntegratedLanguageMindPackage#getQuestion_Object()
	 * @model containment="true"
	 * @generated
	 */
	QMindTerm getObject();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.mind.QQuestion#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(QMindTerm value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(QMindTerm)
	 * @see org.smeup.sys.il.mind.QIntegratedLanguageMindPackage#getQuestion_Subject()
	 * @model containment="true"
	 * @generated
	 */
	QMindTerm getSubject();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.mind.QQuestion#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(QMindTerm value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference.
	 * @see #setRelation(QMindTerm)
	 * @see org.smeup.sys.il.mind.QIntegratedLanguageMindPackage#getQuestion_Relation()
	 * @model containment="true"
	 * @generated
	 */
	QMindTerm getRelation();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.mind.QQuestion#getRelation <em>Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' containment reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(QMindTerm value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(QMindTerm)
	 * @see org.smeup.sys.il.mind.QIntegratedLanguageMindPackage#getQuestion_Rule()
	 * @model containment="true"
	 * @generated
	 */
	QMindTerm getRule();

	/**
	 * Sets the value of the '{@link org.smeup.sys.il.mind.QQuestion#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(QMindTerm value);

} // QQuestion
