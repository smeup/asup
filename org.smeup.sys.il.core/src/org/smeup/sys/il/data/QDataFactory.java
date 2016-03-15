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
	 * @model required="true" argumentRequired="true" dimensionRequired="true" sortDirectionRequired="true" initializeRequired="true"
	 * @generated
	 */
	<D extends QBufferedElement> QArray<D> createArray(QUnaryAtomicBufferedDataDef<D> argument, int dimension, SortDirection sortDirection, boolean initialize);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" typeRequired="true" unsignedRequired="true" initializeRequired="true"
	 * @generated
	 */
	QBinary createBinary(BinaryType type, boolean unsigned, boolean initialize);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" lengthRequired="true" varyingRequired="true" initializeRequired="true"
	 * @generated
	 */
	QCharacter createCharacter(int length, boolean varying, boolean initialize);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" dataDefRequired="true" initializeRequired="true"
	 * @generated
	 */
	<D extends QData> D createData(QDataDef<D> dataDef, boolean initialize);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" dataTermRequired="true" initializeRequired="true"
	 * @generated
	 */
	QData createData(QDataTerm<?> dataTerm, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" externalNameRequired="true" initializeRequired="true"
	 * @generated
	 */
	<D extends QBufferedElement> QDataArea<D> createDataArea(QUnaryBufferedDataDef<D> argument, String externalName, boolean initialize);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" typeDataType="org.smeup.sys.mi.core.JavaType" typeRequired="true" annotationsDataType="org.smeup.sys.mi.core.JavaAnnotation" annotationsRequired="true" annotationsMany="true"
	 * @generated
	 */
	QDataDef<?> createDataDef(Type type, List<Annotation> annotations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" elementsMany="true" lengthRequired="true" initializeRequired="true"
	 * @generated
	 */
	<D extends QDataStruct> D createDataStruct(String name, List<QDataTerm<QBufferedDataDef<?>>> elements, int length, boolean initialize);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" lengthRequired="true" initializeRequired="true"
	 * @generated
	 */
	<D extends QDataStruct> D createDataStruct(Class<D> wrapper, int length, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" typeRequired="true" dateFormatRequired="true" timeFormatRequired="true" initializeRequired="true"
	 * @generated
	 */
	QDatetime createDate(DatetimeType type, DateFormat dateFormat, TimeFormat timeFormat, boolean initialize);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" precisionRequired="true" scaleRequired="true" typeRequired="true" initializeRequired="true"
	 * @generated
	 */
	QDecimal createDecimal(int precision, int scale, DecimalType type, boolean initialize);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" dataDelegateRequired="true" initializeRequired="true" EBounds="org.smeup.sys.mi.core.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>, D extends QBufferedElement> QEnum<E, D> createEnum(Class<E> classEnumerator, D dataDelegate, boolean initialize);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" typeRequired="true" initializeRequired="true"
	 * @generated
	 */
	QFloating createFloating(FloatingType type, boolean initialize);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" lengthRequired="true" initializeRequired="true"
	 * @generated
	 */
	QHexadecimal createHexadecimal(int length, boolean initialize);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" initializeRequired="true"
	 * @generated
	 */
	QIndicator createIndicator(boolean initialize);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" dimensionRequired="true" initializeRequired="true"
	 * @generated
	 */
	<D extends QData> QList<D> createList(QUnaryAtomicDataDef<D> argument, int dimension, boolean initialize);

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
	 * @model required="true" initializeRequired="true"
	 * @generated
	 */
	<R extends QRecord> R createRecord(Class<R> wrapper, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" dimensionRequired="true" initializeRequired="true"
	 * @generated
	 */
	<D extends QBufferedElement> QScroller<D> createScroller(QUnaryAtomicBufferedDataDef<D> argument, int dimension, boolean initialize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" argumentRequired="true" dimensionRequired="true" initializeRequired="true"
	 * @generated
	 */
	<D extends QDataStruct> QStroller<D> createStroller(String name, QStrollerDef<?> argument, int dimension, boolean initialize);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" initializeRequired="true"
	 * @generated
	 */
	QDatetime createTime(boolean initialize);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" initializeRequired="true"
	 * @generated
	 */
	QDatetime createTimestamp(boolean initialize);

} // QDataFactory
