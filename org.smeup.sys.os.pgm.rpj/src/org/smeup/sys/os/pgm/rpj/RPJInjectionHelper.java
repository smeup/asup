/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.pgm.rpj;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;

import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.QRecordWrapper;
import org.smeup.sys.il.data.QStroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.term.QDataTerm;

public class RPJInjectionHelper {

	public static RPJInjectableField createInjectableField(Object owner, Field field) {
		Class<?> fieldClass = null;

		Type fieldType = field.getGenericType();
		ParameterizedType parType = null;
		Type[] argsType = null;

		if (fieldType instanceof ParameterizedType) {
			parType = (ParameterizedType) fieldType;
			argsType = parType.getActualTypeArguments();
			fieldClass = (Class<?>) parType.getRawType();
		} else
			fieldClass = (Class<?>) fieldType;

		RPJInjectableField injectableField = new RPJInjectableField(owner, field, fieldClass, fieldType, argsType);

		return injectableField;
	}

	public static Object getFieldValue(Object owner, String fieldName) {

		String splits[] = fieldName.split("\\.");

		for (String split : splits) {

			try {
				Field externalFileField = owner.getClass().getDeclaredField(split);
				externalFileField.setAccessible(true);
				owner = externalFileField.get(owner);
				externalFileField.setAccessible(false);
			} catch (Exception e) {
				return null;
			}
		}

		return owner;
	}

	public static void injectDataNoBased(QDataContainer dataContainer, RPJInjectableField field) {

		QDataTerm<?> dataTerm = dataContainer.addDataTerm(field.getName(), field.getType(), Arrays.asList(field.getField().getAnnotations()));
		if (dataTerm.getBased() != null)
			return;

		field.setValue(dataContainer.getData(dataTerm));
	}

	public static void injectDataBased(QDataContainer dataContainer, RPJInjectableField field) {

		QDataTerm<?> dataTerm = dataContainer.getDataTerm(field.getName());
		if (dataTerm.getBased() == null)
			return;

		field.setValue(dataContainer.getData(dataTerm));
	}

	public static void injectPointerNoDefault(QDataContainer dataContainer, RPJInjectableField field) {

		QDataTerm<?> dataTerm = dataContainer.addDataTerm(field.getName(), field.getType(), Arrays.asList(field.getField().getAnnotations()));

		if (dataTerm.getDefault() != null)
			return;

		field.setValue(dataContainer.getData(dataTerm));
	}

	public static void injectPointerWithDefault(QDataContainer dataContainer, RPJInjectableField field) {

		QDataTerm<?> dataTerm = dataContainer.getDataTerm(field.getName());
		if (dataTerm.getDefault() == null)
			return;

		field.setValue(dataContainer.getData(dataTerm));
	}

	public static void setPrimitiveValue(QDataContext dataContext, RPJInjectableField injectableField) {

		DataDef dataDef = injectableField.getAnnotation(DataDef.class);
		if (dataDef == null)
			return;

		Object object = null;

		if (Integer.class.isAssignableFrom(injectableField.getFieldClass())) {
			object = Integer.parseInt(dataDef.value());
		} else if (Long.class.isAssignableFrom(injectableField.getFieldClass())) {
			object = Long.parseLong(dataDef.value());
		} else if (Double.class.isAssignableFrom(injectableField.getFieldClass())) {
			object = Double.parseDouble(dataDef.value());
		} else if (String.class.isAssignableFrom(injectableField.getFieldClass())) {
			if (dataDef.value().toUpperCase().startsWith("X'")) {
				object = new String(convertHexToBytes(dataDef.value().substring(2, dataDef.value().lastIndexOf("'"))), dataContext.getCharset());
			} else
				object = dataDef.value();
		} else if (Byte.class.isAssignableFrom(injectableField.getFieldClass())) {
			if (dataDef.value().toUpperCase().startsWith("X'")) {
				object = convertHexToBytes(dataDef.value().substring(2, 4))[0];
			} else
				System.err.println("Unexpected condition " + injectableField.getFieldClass() + ": xw09ert98ery87tyrew");
		} else
			System.err.println("Unexpected condition " + injectableField.getFieldClass() + ": x456b6439b57w6ervdas5");

		if (object != null)
			injectableField.setValue(object);
		else if (!Modifier.isTransient(injectableField.getField().getModifiers()))
			System.err.println("Unexpected condition " + injectableField.getName() + "(" + injectableField.getFieldClass() + ")" + ": x5647veewq456bdtas");
	}

	@SuppressWarnings("unchecked")
	public static void injectDataStructure(QDataContainer dataContainer, Map<String, QRecord> records, RPJInjectableField field, boolean based) {

		QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> dataTerm = null;

		if (based)
			dataTerm = (QDataTerm<QCompoundDataDef<?, QDataTerm<?>>>) dataContainer.getDataTerm(field.getName());

		if (dataTerm == null)
			dataTerm = (QDataTerm<QCompoundDataDef<?, QDataTerm<?>>>) dataContainer.addDataTerm(field.getName(), field.getType(), Arrays.asList(field.getField().getAnnotations()));

		if (based) {
			if (dataTerm.getBased() == null)
				return;
		} else {
			if (dataTerm.getBased() != null)
				return;
		}

		QData data = dataContainer.getData(dataTerm);

		if (data instanceof QStroller<?>) {
			field.setValue(data);
		} else {
			QDataStruct dataStruct = (QDataStruct) data;
			QCompoundDataDef<?, ?> compoundDataDef = (QCompoundDataDef<?, ?>) dataTerm.getDefinition();

			Class<? extends QRecord> primaryRecordClass = RPJInjectionHelper.getPrimaryRecord((Class<? extends QRecord>) data.getClass());

			String primaryRecordName = primaryRecordClass.getSimpleName();
			if (compoundDataDef.getPrefix() != null && !compoundDataDef.getPrefix().isEmpty())
				primaryRecordName = compoundDataDef.getPrefix() + "_" + primaryRecordName;

			if (compoundDataDef.isQualified())
				primaryRecordName = primaryRecordName + "(" + dataTerm.getName() + ")";

			primaryRecordName = primaryRecordName.toLowerCase();

			QRecord primaryRecord = records.get(primaryRecordName);
			if (primaryRecord == null)
				records.put(primaryRecordName, dataStruct);
			else
				((QDataStruct) primaryRecord).assign(dataStruct);

			field.setValue(dataStruct);
		}

	}
	
	@SuppressWarnings("unchecked")
	public static Class<? extends QRecord> getPrimaryRecord(Class<? extends QRecord> classRecord) {

		// dataStruct
		if (classRecord.getSuperclass() == QDataStructWrapper.class)
			return classRecord;
		// physical file
		else if (classRecord.getSuperclass() == QRecordWrapper.class)
			return classRecord;

		if (classRecord.getSuperclass() != null && classRecord.getSuperclass().getSuperclass() == QRecordWrapper.class)
			return (Class<? extends QRecord>) classRecord.getSuperclass();

		// logical
		boolean extended = false;
		for (Field field : classRecord.getDeclaredFields()) {
			if (Modifier.isStatic(field.getModifiers()))
				continue;

			extended = true;
			break;
		}

		if (extended)
			return classRecord;
		else
			return getPrimaryRecord((Class<? extends QRecord>) classRecord.getSuperclass());
	}
	
	public static byte[] convertHexToBytes(String value) {
		byte[] bytes = new byte[value.length() / 2];

		for (int i = 0; i < bytes.length; i++) {
			String hex = new String(value.substring(2 * i, 2 * i + 2));
			bytes[i] = (byte) Integer.parseInt(hex, 16);
		}
		return bytes;
	}
}
