/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checker</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getChecker()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QChecker {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true"
	 * @generated
	 */
	QNumeric qCheck(QCharacter base);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qCheck(QCharacter base, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startRequired="true"
	 * @generated
	 */
	QNumeric qCheck(QCharacter base, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qCheck(QCharacter base, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	QNumeric qCheck(QCharacter base, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qCheck(QCharacter base, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true"
	 * @generated
	 */
	QNumeric qCheck(String base);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qCheck(String base, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startRequired="true"
	 * @generated
	 */
	QNumeric qCheck(String base, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qCheck(String base, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	QNumeric qCheck(String base, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qCheck(String base, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true"
	 * @generated
	 */
	QNumeric qCheckr(QCharacter base);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qCheckr(QCharacter base, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startRequired="true"
	 * @generated
	 */
	QNumeric qCheckr(QCharacter base, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qCheckr(QCharacter base, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	QNumeric qCheckr(QCharacter base, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qCheckr(QCharacter base, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true"
	 * @generated
	 */
	QNumeric qCheckr(String base);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qCheckr(String base, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startRequired="true"
	 * @generated
	 */
	QNumeric qCheckr(String base, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qCheckr(String base, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	QNumeric qCheckr(String base, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" baseRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qCheckr(String base, Number start, QIndicator found);

} // QChecker
