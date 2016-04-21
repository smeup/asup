/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.il.data;

import java.lang.Enum;
import java.lang.String;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;

import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.data.def.DecimalType;
import org.smeup.sys.il.data.def.FloatingType;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.def.QStrollerDef;
import org.smeup.sys.il.data.def.QUnaryAtomicBufferedDataDef;
import org.smeup.sys.il.data.def.QUnaryAtomicDataDef;
import org.smeup.sys.il.data.def.QUnaryBufferedDataDef;
import org.smeup.sys.il.data.def.TimeFormat;
import org.smeup.sys.il.data.term.QDataTerm;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Factory</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.smeup.sys.il.data.QIntegratedLanguageDataPackage#getDataFactory()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QDataFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" dimensionRequired="true" sortDirectionRequired="true" allocateRequired="true"
	 * @generated
	 */
	<D extends QBufferedElement> QArray<D> createArray(QUnaryAtomicBufferedDataDef<D> argument, int dimension, SortDirection sortDirection, boolean allocate);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" typeRequired="true" unsignedRequired="true" allocateRequired="true"
	 * @generated
	 */
	QBinary createBinary(BinaryType type, boolean unsigned, boolean allocate);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" lengthRequired="true" varyingRequired="true" allocateRequired="true"
	 * @generated
	 */
	QCharacter createCharacter(int length, boolean varying, boolean allocate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" dataDefRequired="true" allocateRequired="true"
	 * @generated
	 */
	<D extends QData> D createData(QDataDef<D> dataDef, boolean allocate);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" dataTermRequired="true" allocateRequired="true"
	 * @generated
	 */
	QData createData(QDataTerm<?> dataTerm, boolean allocate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" externalNameRequired="true" allocateRequired="true"
	 * @generated
	 */
	<D extends QBufferedElement> QDataArea<D> createDataArea(QUnaryBufferedDataDef<D> argument, String externalName, boolean allocate);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" typeDataType="org.smeup.sys.mi.core.JavaType" typeRequired="true" annotationsDataType="org.smeup.sys.mi.core.JavaAnnotation" annotationsRequired="true" annotationsMany="true"
	 * @generated
	 */
	QDataDef<?> createDataDef(Type type, List<Annotation> annotations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" elementsMany="true" lengthRequired="true" allocateRequired="true"
	 * @generated
	 */
	<D extends QDataStruct> D createDataStruct(List<QDataTerm<QBufferedDataDef<?>>> elements, int length, boolean allocate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" lengthRequired="true" allocateRequired="true"
	 * @generated
	 */
	<D extends QDataStruct> D createDataStruct(Class<D> wrapper, int length, boolean allocate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typeRequired="true" dateFormatRequired="true" timeFormatRequired="true" allocateRequired="true"
	 * @generated
	 */
	QDatetime createDate(DatetimeType type, DateFormat dateFormat, TimeFormat timeFormat, boolean allocate);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" precisionRequired="true" scaleRequired="true" typeRequired="true" allocateRequired="true"
	 * @generated
	 */
	QDecimal createDecimal(int precision, int scale, DecimalType type, boolean allocate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" dataDelegateRequired="true" EBounds="org.smeup.sys.mi.core.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>, D extends QBufferedElement> QEnum<E, D> createEnum(Class<E> classEnumerator, D dataDelegate);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" typeRequired="true" allocateRequired="true"
	 * @generated
	 */
	QFloating createFloating(FloatingType type, boolean allocate);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" lengthRequired="true" allocateRequired="true"
	 * @generated
	 */
	QHexadecimal createHexadecimal(int length, boolean allocate);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" allocateRequired="true"
	 * @generated
	 */
	QIndicator createIndicator(boolean allocate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" dimensionRequired="true"
	 * @generated
	 */
	<D extends QData> QList<D> createList(QUnaryAtomicDataDef<D> argument, int dimension);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" sizeRequired="true"
	 * @generated
	 */
	QPointer createPointer(int size);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" pointerRequired="true" newSizeRequired="true"
	 * @generated
	 */
	QPointer createPointer(QPointer pointer, int newSize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" allocateRequired="true"
	 * @generated
	 */
	<R extends QRecord> R createRecord(Class<R> wrapper, boolean allocate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" dimensionRequired="true" allocateRequired="true"
	 * @generated
	 */
	<D extends QBufferedElement> QScroller<D> createScroller(QUnaryAtomicBufferedDataDef<D> argument, int dimension, boolean allocate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" dimensionRequired="true" allocateRequired="true"
	 * @generated
	 */
	<D extends QDataStruct> QStroller<D> createStroller(QStrollerDef<?> argument, int dimension, boolean allocate);

} // QDataFactory
