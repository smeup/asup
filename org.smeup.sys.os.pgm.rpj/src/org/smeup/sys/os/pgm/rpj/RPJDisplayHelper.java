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

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDisplayWrapper;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.esam.QDisplayFormatWrapper;
import org.smeup.sys.il.esam.annotation.FileDef;

public class RPJDisplayHelper {

	public static QDisplayWrapper createDisplay(QDataFactory dataFactory, RPJInjectableField field, Class<QRecord> classRecord, FileDef fileDef, Map<String, QRecord> records) {

		String recordName = getRecordName(classRecord, fileDef);
		QDisplayWrapper display = (QDisplayWrapper) records.get(recordName.toLowerCase());
		if (display == null) {
			display = (QDisplayWrapper) dataFactory.createRecord(classRecord, true);
			records.put(recordName.toLowerCase(), display);
		}
		// task rimozione contiguità record (BRRLCM)
		else {
			QDisplayWrapper newDisplay = (QDisplayWrapper) dataFactory.createRecord(classRecord, false);
			((QDataStruct)display).assign(((QDataStruct)newDisplay));
			display = newDisplay;
		}

		return display;
	}
	
	public static String getRecordName(Class<QRecord> classRecord, FileDef fileDef) {
	
		Class<? extends QRecord> classPrimaryRecord = RPJInjectionHelper.getPrimaryRecord(classRecord);

		String recordName = classPrimaryRecord.getSimpleName();

		if (fileDef != null && !fileDef.prefix().isEmpty()) 
			recordName = fileDef.prefix() + "_" + recordName;

		return recordName;
	}
	
	@SuppressWarnings("unchecked")
	public static void injectDisplay(QDataFactory dataFactory, Map<String, QRecord> records, RPJInjectableField field) {

		boolean userOpen = false;

		FileDef fileDef = field.getField().getAnnotation(FileDef.class);
		if (fileDef != null)
			userOpen = fileDef.userOpen();

		Class<QRecord> classRecord = (Class<QRecord>) field.getArguments()[0];
		QDisplayWrapper display = RPJDisplayHelper.createDisplay(dataFactory, field, classRecord, fileDef, records);
		
		for (final Field displayField : display.getClass().getDeclaredFields()) {
			if (!QDisplayFormatWrapper.class.isAssignableFrom(displayField.getType()))
				continue;
				
			try {
				
				RPJInjectableField displayInjectableField = RPJInjectionHelper.createInjectableField(display, displayField);
				Class<Enum<?>> ce = (Class<Enum<?>>) displayInjectableField.getArguments()[0];				
				Constructor<QDisplayFormatWrapper<?>> constructor = (Constructor<QDisplayFormatWrapper<?>>) displayInjectableField.getFieldClass().getConstructors()[0];
				
				QDisplayFormatWrapper<?> formatWrapper = constructor.newInstance(display, ce);
				displayField.set(display, formatWrapper);
			} catch (InstantiationException | IllegalAccessException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		
		RPJInfoStruct infoStruct = dataFactory.createDataStruct(RPJInfoStruct.class, 0, true);
		field.setValue(new RPJDisplayDelegator<QRecord>(display, userOpen, infoStruct));
	}
}
