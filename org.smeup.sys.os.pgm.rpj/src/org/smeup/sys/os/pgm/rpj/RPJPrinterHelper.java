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
import org.smeup.sys.il.data.QPrinterWrapper;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.esam.QPrinterFormatWrapper;
import org.smeup.sys.il.esam.annotation.FileDef;

public class RPJPrinterHelper {

	public static QPrinterWrapper createPrinter(QDataFactory dataFactory, RPJInjectableField field, Class<QRecord> classRecord, FileDef fileDef, Map<String, QRecord> records) {

		String recordName = getRecordName(classRecord, fileDef);
		QPrinterWrapper printer = (QPrinterWrapper) records.get(recordName.toLowerCase());
		if (printer == null) {
			printer = (QPrinterWrapper) dataFactory.createRecord(classRecord, true);
			records.put(recordName.toLowerCase(), printer);
		}
		// task rimozione contiguità record (BRRLCM)
		else {
			QPrinterWrapper newPrinter = (QPrinterWrapper) dataFactory.createRecord(classRecord, false);
			((QDataStruct)printer).assign(((QDataStruct)newPrinter));
			printer = newPrinter;
		}

		return printer;
	}
	
	public static String getRecordName(Class<QRecord> classRecord, FileDef fileDef) {
	
		Class<? extends QRecord> classPrimaryRecord = RPJInjectionHelper.getPrimaryRecord(classRecord);

		String recordName = classPrimaryRecord.getSimpleName();

		if (fileDef != null && !fileDef.prefix().isEmpty()) 
			recordName = fileDef.prefix() + "_" + recordName;

		return recordName;
	}
	
	@SuppressWarnings("unchecked")
	public static void injectPrinter(QDataFactory dataFactory, Map<String, QRecord> records, RPJInjectableField field) {

		boolean userOpen = false;

		FileDef fileDef = field.getField().getAnnotation(FileDef.class);
		if (fileDef != null)
			userOpen = fileDef.userOpen();

		Class<QRecord> classRecord = (Class<QRecord>) field.getArguments()[0];
		QPrinterWrapper printer = RPJPrinterHelper.createPrinter(dataFactory, field, classRecord, fileDef, records);
		
		for (final Field printerField : printer.getClass().getDeclaredFields()) {
			if (!QPrinterFormatWrapper.class.isAssignableFrom(printerField.getType()))
				continue;
				
			try {
				
				RPJInjectableField printerInjectableField = RPJInjectionHelper.createInjectableField(printer, printerField);
				Class<Enum<?>> ce = (Class<Enum<?>>) printerInjectableField.getArguments()[0];				
				Constructor<QPrinterFormatWrapper<?>> constructor = (Constructor<QPrinterFormatWrapper<?>>) printerInjectableField.getFieldClass().getConstructors()[0];
				
				QPrinterFormatWrapper<?> formatWrapper = constructor.newInstance(printer, ce);
				printerField.set(printer, formatWrapper);
			} catch (InstantiationException | IllegalAccessException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		
		RPJInfoStruct infoStruct = dataFactory.createDataStruct(RPJInfoStruct.class, 0, true);
		field.setValue(new RPJPrinterDelegator<QRecord>(printer, userOpen, infoStruct));
	}
}
