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
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Buffered List</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getBufferedList()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QBufferedList<D extends QBufferedElement> extends QList<D>, QBufferedData, QMoveable {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void eval(QList<? extends QNumeric> value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" halfAdjustRequired="true" maxPrecisionRequired="true"
	 * @generated
	 */
	void eval(QList<? extends QNumeric> value, boolean halfAdjust, boolean maxPrecision);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QBufferedData eval(DataSpecial value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QBufferedData eval(QDataFiller value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void eval(Number value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	void eval(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void eval(QNumeric value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void eval(QString value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QIndicator qFound();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QIndicator qEqual();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true" elementsRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, QNumeric start, QNumeric elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsType="org.smeup.sys.mi.core.JavaNumber" elementsRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, Number start, Number elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, Number start, QNumeric elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true" elementsType="org.smeup.sys.mi.core.JavaNumber" elementsRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, QNumeric start, Number elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" equalRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, QIndicator equal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true" equalRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, QNumeric start, QIndicator equal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" equalRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, Number start, QIndicator equal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true" elementsRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, QNumeric start, QNumeric elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsType="org.smeup.sys.mi.core.JavaNumber" elementsRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, Number start, Number elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, Number start, QNumeric elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true" elementsType="org.smeup.sys.mi.core.JavaNumber" elementsRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, QNumeric start, Number elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" equalRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, QIndicator equal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" foundRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, Number start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, QNumeric start, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, Number start, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true" elementsRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, QNumeric start, QNumeric elements, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsType="org.smeup.sys.mi.core.JavaNumber" elementsRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, Number start, Number elements, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, Number start, QNumeric elements, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true" elementsType="org.smeup.sys.mi.core.JavaNumber" elementsRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, QNumeric start, Number elements, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" foundRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, QIndicator found, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true" equalRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, QNumeric start, QIndicator equal, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" equalRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(D argument, Number start, QIndicator equal, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, QNumeric start, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, Number start, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true" elementsRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, QNumeric start, QNumeric elements, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsType="org.smeup.sys.mi.core.JavaNumber" elementsRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, Number start, Number elements, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, Number start, QNumeric elements, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true" elementsType="org.smeup.sys.mi.core.JavaNumber" elementsRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, QNumeric start, Number elements, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" equalRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, QIndicator equal, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true" equalRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, QNumeric start, QIndicator equal, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" equalRequired="true" comparatorRequired="true"
	 * @generated
	 */
	QNumeric qLookup(DataSpecial argument, Number start, QIndicator equal, DataComparator comparator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QDecimal qXfoot();
} // QBufferedList
