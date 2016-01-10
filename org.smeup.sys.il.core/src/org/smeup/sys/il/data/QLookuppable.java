/**
 * Copyright (c) 2012, 2015 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;


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
	 * @model required="true" arrayRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QArray<?> array, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QArray<?> array);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QArray<?> array, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QArray<?> array, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startRequired="true" elementsRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QArray<?> array, QNumeric start, QNumeric elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsType="org.smeup.sys.mi.core.JavaNumber" elementsRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QArray<?> array, Number start, Number elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QArray<?> array, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QArray<?> array, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QArray<?> array, QNumeric start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsType="org.smeup.sys.mi.core.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QArray<?> array, Number start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startRequired="true" elementsType="org.smeup.sys.mi.core.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QArray<?> array, QNumeric start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(QArray<?> array, Number start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(QArray<?> array, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(QArray<?> array, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(QArray<?> array, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(QArray<?> array, QNumeric start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsType="org.smeup.sys.mi.core.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(QArray<?> array, Number start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startRequired="true" elementsType="org.smeup.sys.mi.core.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(QArray<?> array, QNumeric start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookupgt(QArray<?> array, Number start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(QArray<?> array, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(QArray<?> array, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(QArray<?> array, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(QArray<?> array, QNumeric start, QNumeric elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsType="org.smeup.sys.mi.core.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(QArray<?> array, Number start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startRequired="true" elementsType="org.smeup.sys.mi.core.JavaNumber" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(QArray<?> array, QNumeric start, Number elements, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" arrayRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookuplt(QArray<?> array, Number start, QNumeric elements, QIndicator found);

} // QLookuppable
