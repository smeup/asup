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
 * <em><b>Array</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getArray()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QArray<D extends QBufferedElement> extends QBufferedList<D> {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QArray<D> qSubarr(int start, int elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QArray<D> qSubarr(int start, QNumeric elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QArray<D> qSubarr(QNumeric start, QNumeric elements);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	QArray<D> qSubarr(QDecimal start, int elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true"
	 * @generated
	 */
	void divide(QArray<D> array);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void divide(QArray<D> array, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	void divide(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void divide(Number value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void divide(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void divide(QNumeric value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isContiguous();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true"
	 * @generated
	 */
	void minus(QArray<D> array);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void minus(QArray<D> array, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	void minus(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void minus(Number value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void minus(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void minus(QNumeric value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movea(DataSpecial value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void movea(DataSpecial value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, DataSpecial value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, DataSpecial value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true"
	 * @generated
	 */
	void movea(QNumeric targetIndex, DataSpecial value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(QNumeric targetIndex, DataSpecial value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movea(QDataFiller value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void movea(QDataFiller value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movea(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void movea(String value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QDataFiller value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true"
	 * @generated
	 */
	void movea(QNumeric targetIndex, QDataFiller value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movea(QBufferedElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void movea(QBufferedElement value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QBufferedElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QBufferedElement value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true"
	 * @generated
	 */
	void movea(QNumeric targetIndex, QBufferedElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(QNumeric targetIndex, QBufferedElement value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QArray<?> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QArray<?> value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(QNumeric targetIndex, QArray<?> value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, String value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true"
	 * @generated
	 */
	void movea(QNumeric targetIndex, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(QNumeric targetIndex, String value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movea(QArray<?> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void movea(QArray<?> value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(QArray<?> value, int sourceIndex, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceIndexRequired="true"
	 * @generated
	 */
	void movea(QArray<?> value, int sourceIndex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceIndexRequired="true"
	 * @generated
	 */
	void movea(QArray<?> value, QNumeric sourceIndex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(QArray<?> value, QNumeric sourceIndex, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" sourceIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QArray<?> value, int sourceIndex, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" sourceIndexRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QArray<?> value, int sourceIndex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" sourceIndexRequired="true"
	 * @generated
	 */
	void movea(QNumeric targetIndex, QArray<?> value, int sourceIndex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" sourceIndexRequired="true"
	 * @generated
	 */
	void movea(QNumeric targetIndex, QArray<?> value, QNumeric sourceIndex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void move(QArray<?> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void move(QArray<?> value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movel(QArray<?> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model clearRequired="true"
	 * @generated
	 */
	void movel(QArray<?> value, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" sourceIndexRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QArray<?> value, QNumeric sourceIndex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true" sourceIndexRequired="true" clearRequired="true"
	 * @generated
	 */
	void movea(int targetIndex, QArray<?> value, QNumeric sourceIndex, boolean clear);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetIndexRequired="true"
	 * @generated
	 */
	void movea(QNumeric targetIndex, QArray<?> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true"
	 * @generated
	 */
	void mult(QArray<D> array);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void mult(QArray<D> array, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	void mult(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void mult(Number value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void mult(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void mult(QNumeric value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true"
	 * @generated
	 */
	void plus(QArray<D> array);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrayRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void plus(QArray<D> array, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	void plus(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void plus(Number value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true"
	 * @generated
	 */
	void plus(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	void plus(QNumeric value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueRequired="true"
	 * @generated
	 */
	QArray<D> qDiv(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	QArray<D> qDiv(QNumeric value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	QArray<D> qDiv(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	QArray<D> qDiv(Number value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueRequired="true"
	 * @generated
	 */
	QArray<D> qMult(QNumeric value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	QArray<D> qMult(QNumeric value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true"
	 * @generated
	 */
	QArray<D> qMult(Number value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueType="org.smeup.sys.mi.core.JavaNumber" valueRequired="true" halfAdjustRequired="true"
	 * @generated
	 */
	QArray<D> qMult(Number value, boolean halfAdjust);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true"
	 * @generated
	 */
	QDecimal qLookup(String argument);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argumentRequired="true" foundRequired="true"
	 * @generated
	 */
	void qLookup(String argument, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" elementsRequired="true"
	 * @generated
	 */
	QDecimal qLookup(String argument, Number start, QNumeric elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" startRequired="true" elementsRequired="true"
	 * @generated
	 */
	QDecimal qLookup(String argument, QNumeric start, QNumeric elements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argumentRequired="true" startRequired="true" foundRequired="true"
	 * @generated
	 */
	void qLookup(String argument, QNumeric start, QIndicator found);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueRequired="true"
	 * @generated
	 */
	QArray<D> qPlus(QArray<D> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueRequired="true"
	 * @generated
	 */
	QArray<D> qPlus(QString value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" valueRequired="true"
	 * @generated
	 */
	QArray<D> qPlus(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startRequired="true" lengthRequired="true"
	 * @generated
	 */
	QArray<QCharacter> qSubst(QNumeric start, QNumeric length);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startRequired="true"
	 * @generated
	 */
	QArray<QCharacter> qSubst(QNumeric start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" lengthType="org.smeup.sys.mi.core.JavaNumber" lengthRequired="true"
	 * @generated
	 */
	QArray<QCharacter> qSubst(Number start, Number length);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true"
	 * @generated
	 */
	QArray<QCharacter> qSubst(Number start);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startRequired="true" lengthType="org.smeup.sys.mi.core.JavaNumber" lengthRequired="true"
	 * @generated
	 */
	QArray<QCharacter> qSubst(QNumeric start, Number length);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startType="org.smeup.sys.mi.core.JavaNumber" startRequired="true" lengthRequired="true"
	 * @generated
	 */
	QArray<QCharacter> qSubst(Number start, QNumeric length);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sorta();
} // QArray
