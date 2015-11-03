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
 * A representation of the model object '<em><b>Lookuppable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getLookuppable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QLookuppable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QCharacter argument, QArray<?> array, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QCharacter argument, QArray<?> array, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QCharacter argument, QArray<?> array, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QCharacter argument, QArray<?> array, QNumeric start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" elementsType="org.smeup.sys.il.core.java.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QCharacter argument, QArray<?> array, Number start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" elementsType="org.smeup.sys.il.core.java.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QCharacter argument, QArray<?> array, QNumeric start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QCharacter argument, QArray<?> array, Number start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(String argument, QArray<?> array, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(String argument, QArray<?> array, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(String argument, QArray<?> array, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(String argument, QArray<?> array, QNumeric start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" elementsType="org.smeup.sys.il.core.java.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(String argument, QArray<?> array, Number start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" elementsType="org.smeup.sys.il.core.java.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(String argument, QArray<?> array, QNumeric start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(String argument, QArray<?> array, Number start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(QCharacter argument, QArray<?> array, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(QCharacter argument, QArray<?> array, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(QCharacter argument, QArray<?> array, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(QCharacter argument, QArray<?> array, QNumeric start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" elementsType="org.smeup.sys.il.core.java.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(QCharacter argument, QArray<?> array, Number start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" elementsType="org.smeup.sys.il.core.java.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(QCharacter argument, QArray<?> array, QNumeric start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(QCharacter argument, QArray<?> array, Number start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(String argument, QArray<?> array, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(String argument, QArray<?> array, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(String argument, QArray<?> array, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(String argument, QArray<?> array, QNumeric start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" elementsType="org.smeup.sys.il.core.java.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(String argument, QArray<?> array, Number start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" elementsType="org.smeup.sys.il.core.java.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(String argument, QArray<?> array, QNumeric start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(String argument, QArray<?> array, Number start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(QCharacter argument, QArray<?> array, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(QCharacter argument, QArray<?> array, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(QCharacter argument, QArray<?> array, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(QCharacter argument, QArray<?> array, QNumeric start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" elementsType="org.smeup.sys.il.core.java.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(QCharacter argument, QArray<?> array, Number start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" elementsType="org.smeup.sys.il.core.java.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(QCharacter argument, QArray<?> array, QNumeric start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(QCharacter argument, QArray<?> array, Number start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(String argument, QArray<?> array, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(String argument, QArray<?> array, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(String argument, QArray<?> array, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(String argument, QArray<?> array, QNumeric start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" elementsType="org.smeup.sys.il.core.java.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(String argument, QArray<?> array, Number start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startRequired="true" elementsType="org.smeup.sys.il.core.java.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(String argument, QArray<?> array, QNumeric start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" arrayRequired="true" startType="org.smeup.sys.il.core.java.JavaNumber" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(String argument, QArray<?> array, Number start, QNumeric elements, QIndicator found);

} // QLookuppable
