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
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.smeup.sys.db.esql.QCursor;
import org.smeup.sys.db.esql.QCursorTerm;
import org.smeup.sys.db.esql.QEsqlContext;
import org.smeup.sys.db.esql.QStatement;
import org.smeup.sys.db.esql.QStatementTerm;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.esam.AccessMode;
import org.smeup.sys.il.esam.QAccessContext;
import org.smeup.sys.il.esam.QDataSet;
import org.smeup.sys.il.esam.QFileHandler;
import org.smeup.sys.il.esam.QKSDataSet;
import org.smeup.sys.il.esam.QSMDataSet;
import org.smeup.sys.il.esam.annotation.FileDef;

public class RPJDatabaseHelper {

	public static QRecord createRecord(QDataFactory dataFactory, RPJInjectableField field, Class<QRecord> classRecord, FileDef fileDef, Map<String, QRecord> records) {

		String recordName = getRecordName(classRecord, fileDef);
		QRecord record = records.get(recordName.toLowerCase());
		if (record == null) {
			record = dataFactory.createRecord(classRecord, true);
			records.put(recordName.toLowerCase(), record);
		}
		// task rimozione contiguità record (BRRLCM)
		else {
			QRecord newRecord = dataFactory.createRecord(classRecord, false);
			((QDataStruct)record).assign(((QDataStruct)newRecord));
			record = newRecord;
		}

		return record;
	}
	
	public static String getRecordName(Class<QRecord> classRecord, FileDef fileDef) {
	
		Class<? extends QRecord> classPrimaryRecord = RPJInjectionHelper.getPrimaryRecord(classRecord);

		String recordName = classPrimaryRecord.getSimpleName();

		if (fileDef != null && !fileDef.prefix().isEmpty()) 
			recordName = fileDef.prefix() + "_" + recordName;

		return recordName;
	}
	
	@SuppressWarnings("unchecked")
	public static void injectDataSet(QAccessContext accessContext, QDataFactory dataFactory, Map<String, QRecord> records, RPJInjectableField field, List<QDataSet<?>> programDataSets) {

		boolean userOpen = false;

		FileDef fileDef = field.getField().getAnnotation(FileDef.class);
		if (fileDef != null)
			userOpen = fileDef.userOpen();

		Class<QRecord> classRecord = (Class<QRecord>) field.getArguments()[0];
		QRecord record = RPJDatabaseHelper.createRecord(dataFactory, field, classRecord, fileDef, records);

		QDataSet<?> dataSet = null;

		if (QKSDataSet.class.isAssignableFrom(field.getFieldClass())) {
			dataSet = accessContext.getAccessFactory().createKeySequencedDataSet(classRecord, record, AccessMode.UPDATE, userOpen, null);
		} else if (QSMDataSet.class.isAssignableFrom(field.getFieldClass())) {
			dataSet = accessContext.getAccessFactory().createSourceMemberDataSet(classRecord, record, AccessMode.UPDATE, userOpen, null);
		} else {
			dataSet = accessContext.getAccessFactory().createRelativeRecordDataSet(classRecord, record, AccessMode.UPDATE, userOpen, null);
		}

		programDataSets.add(dataSet);

		if (fileDef != null && !fileDef.name().isEmpty())
			dataSet.getFilePath().eval(fileDef.name());
		dataSet.clear();

		field.setValue(dataSet);
	}
	
	@SuppressWarnings("resource")
	public static void injectStatement(QEsqlContext esqlContext, RPJInjectableField field) {

		@SuppressWarnings("unused")
		QStatementTerm statementTerm = esqlContext.getEsqlFactory().createStatementTerm(field.getName(), field.getType(), Arrays.asList(field.getField().getAnnotations()));

		QStatement statement = esqlContext.getEsqlFactory().createStatement();

		field.setValue(statement);
	}

	@SuppressWarnings("resource")
	public static void injectCursor(QEsqlContext esqlContext, List<RPJInjectableField> statements, RPJInjectableField field) {

		QCursorTerm cursorTerm = esqlContext.getEsqlFactory().createCursorTerm(field.getName(), field.getType(), Arrays.asList(field.getField().getAnnotations()));

		QCursor cursor = null;

		if (cursorTerm.getSql() != null)
			cursor = esqlContext.getEsqlFactory().createCursor(cursorTerm.getCursorType(), cursorTerm.isHold(), cursorTerm.getSql());
		else if(cursorTerm.getStatementName() != null) {
			QStatement statement = null;

			for (RPJInjectableField statementField : statements) {
				if (statementField.getName().equalsIgnoreCase(cursorTerm.getStatementName())) {
					statement = (QStatement) statementField.getValue();
					break;
				}
			}

			cursor = esqlContext.getEsqlFactory().createCursor(cursorTerm.getCursorType(), cursorTerm.isHold(), statement);
		}

		if(cursor != null)
			field.setValue(cursor);
	}
	
	public static void assignRecordFields(RPJInjectableField field, Set<String> records, QDataContainer dataContainer, QRecord record) {

		FileDef fileDef = field.getAnnotation(FileDef.class);

		@SuppressWarnings("unchecked")
		String recordName = getRecordName((Class<QRecord>) record.getClass(), fileDef);
/*		String recordName = record.getClass().getSimpleName();
		if (fileDef != null && !fileDef.prefix().isEmpty())
			recordName = fileDef.prefix() + "_" + recordName;*/

		if (records.contains(recordName))
			return;

		for (String fieldName : record.getElementNames()) {

			QData data = null;
			if (fileDef != null && !fileDef.prefix().isEmpty()) {
				data = dataContainer.getData(fileDef.prefix() + fieldName);
/*				String[] splits = fileDef.prefix().split(":");
				if(splits.length > 1)
					data = (QData)RPJInjectionHelper.getFieldValue(field.getOwner(), splits[0].toLowerCase() + fieldName.substring(Integer.parseInt(splits[1])));
				else
					data = (QData)RPJInjectionHelper.getFieldValue(field.getOwner(), fileDef.prefix().toLowerCase() + fieldName);*/
			}
			else
				data = dataContainer.getData(fieldName);
//				data = (QData)RPJInjectionHelper.getFieldValue(field.getOwner(), fieldName);

			if(data == null)
				continue;
			
			if (data instanceof QBufferedData) {
				QBufferedData bufferedData = (QBufferedData) data;
				QBufferedData bufferedDataTo = record.getElement(fieldName);

				bufferedData.assign(bufferedDataTo);
			}
		}

		records.add(recordName);
	}
	
	public static void setInfoValue(RPJInjectableField field, FileDef fileDef, Map<String, QRecord> records) {

		// fileInfo
		if (fileDef.info().isEmpty()) 
			return;
		
		QDataStruct infoStruct = (QDataStruct) records.get(fileDef.info().toLowerCase());
		if (infoStruct == null) {
			try {
				Field javaField = field.getOwner().getClass().getDeclaredField(fileDef.info());
				javaField.setAccessible(true);
				infoStruct = (QDataStruct) javaField.get(field.getOwner());
				javaField.setAccessible(false);

			} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
				if(field.getOwner() instanceof RPJProgram) {
					@SuppressWarnings("resource")
					RPJProgram rpjProgram = (RPJProgram)field.getOwner();
					infoStruct = (QDataStruct) rpjProgram.getRecords().get(fileDef.info());
					if(infoStruct != null)
						"".toCharArray();
				}
				else
					e.printStackTrace();
			}				
		}

		if (infoStruct == null)
			System.err.println("Unused infoStruct" + fileDef.info());
		else {
			field.getField().setAccessible(true);
			QFileHandler<?> dataSet = ((QFileHandler<?>) field.getValue());
			dataSet.getInfoStruct().assign(infoStruct);
			field.getField().setAccessible(false);
		}
	}

	public static void setExternalValue(RPJInjectableField field, FileDef fileDef) {

		if (fileDef.externalFile().isEmpty())
			return;

		QString externalFile = (QString) RPJInjectionHelper.getFieldValue(field.getOwner(), fileDef.externalFile());
		if (externalFile == null)
			return;

		QDataSet<?> dataSet = (QDataSet<?>) field.getValue();
		externalFile.assign(dataSet.getFilePath());

		if (QSMDataSet.class.isAssignableFrom(field.getFieldClass())) {
			if (!fileDef.externalMember().isEmpty()) {
				QString externalMember = (QString) RPJInjectionHelper.getFieldValue(field.getOwner(), fileDef.externalMember());
				externalMember.assign(((QSMDataSet<?>)dataSet).getMemberName());
			}
		} 
	}
}
