/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.mi.core.util;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strings</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.mi.core.util.QMachineInterfaceUtilPackage#getStrings()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QStrings extends QSingleton<QStrings> {
	
	QStrings qINSTANCE = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true" charsRequired="true" timesRequired="true" beforeRequired="true"
	 * @generated
	 */
	String appendChars(String string, String chars, int times, boolean before);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true"
	 * @generated
	 */
	String firstToUpper(String string);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true"
	 * @generated
	 */
	String firstToLower(String string);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true"
	 * @generated
	 */
	String removeFirstChar(String string);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true"
	 * @generated
	 */
	String removeLastChar(String string);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true"
	 * @generated
	 */
	String trimL(String string);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true"
	 * @generated
	 */
	String trimR(String string);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true"
	 * @generated
	 */
	Boolean isEmptyTrim(String string);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true" valuesMany="true"
	 * @generated
	 */
	Boolean isOneOf(String string, List<String> values);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" string1Required="true" string2Required="true"
	 * @generated
	 */
	Boolean checkEquals(String string1, String string2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true" nrOfCharsRequired="true"
	 * @generated
	 */
	String left(String string, int nrOfChars);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true" nrOfCharsRequired="true"
	 * @generated
	 */
	String lSet(String string, int nrOfChars);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true" nrOfCharsRequired="true" fillerRequired="true"
	 * @generated
	 */
	String lSet(String string, int nrOfChars, String filler);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nrOfCharsRequired="true" fillerRequired="true"
	 * @generated
	 */
	String string(int nrOfChars, String filler);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true" nrOfCharsRequired="true"
	 * @generated
	 */
	String rSet(String string, int nrOfChars);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true" nrOfCharsRequired="true" fillerRequired="true"
	 * @generated
	 */
	String rSet(String string, int nrOfChars, String filler);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" stringRequired="true" nrOfCharsRequired="true"
	 * @generated
	 */
	String right(String string, int nrOfChars);

} // QStrings
