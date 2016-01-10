/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.lang.String;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scanner</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getScanner()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QScanner {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true"
	 * @generated
	 */
	QNumeric qScan(QCharacter source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qScan(QCharacter source, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true" startRequired="true"
	 * @generated
	 */
	QNumeric qScan(QCharacter source, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qScan(QCharacter source, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	QNumeric qScan(QCharacter source, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qScan(QCharacter source, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true"
	 * @generated
	 */
	QNumeric qScan(String source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qScan(String source, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true" startRequired="true"
	 * @generated
	 */
	QNumeric qScan(String source, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qScan(String source, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	QNumeric qScan(String source, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sourceRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qScan(String source, Number start, QIndicator found);

} // QScanner
