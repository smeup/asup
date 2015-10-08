/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.os.pgm.base;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.QRecordWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Procedure;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.QCompoundDataDef;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.esam.AccessMode;
import org.smeup.sys.il.esam.QAccessFactory;
import org.smeup.sys.il.esam.QAccessManager;
import org.smeup.sys.il.esam.QDataSet;
import org.smeup.sys.il.esam.QKSDataSet;
import org.smeup.sys.il.esam.QSMDataSet;
import org.smeup.sys.il.esam.annotation.FileDef;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QFileOverride;

public class BaseCallableInjector {

	@Inject
	private QDataManager dataManager;
	@Inject
	private QAccessManager esamManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QFileManager fileManager;
	@Inject
	private QJob job;

	private QResourceReader<QFile> fileReader;

	@PostConstruct
	public void init() {
		this.fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
	}

	public <C> C prepareCallable(QContext context, Class<C> klass) {

		Map<String, QDataTerm<?>> dataTerms = new HashMap<String, QDataTerm<?>>();

		QDataContainer dataContainer = dataManager.createDataContainer(context, dataTerms, true);
		QAccessFactory accessFactory = esamManager.createFactory(job, dataContainer.getDataContext());

		C callable = null;
		try {
			callable = injectData(null, klass, accessFactory, dataContainer, context, new HashMap<String, Object>());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return callable;
	}

	public QData[] buildEntry(QContextProvider contextProvider, Method method) {

		QDataFactory dataFactory = dataManager.createFactory(contextProvider.getContext());

		Type[] types = method.getGenericParameterTypes();
		Annotation[][] annotationss = method.getParameterAnnotations();

		// build entry
		QData[] entry = new QData[types.length];
		int entryIndex = 0;

		for (Type type : types) {

			Annotation[] annotations = annotationss[entryIndex];

			// annotations
			List<Annotation> annotationsList = new ArrayList<Annotation>();
			for (Annotation annotation : annotations)
				annotationsList.add(annotation);

			QDataDef<?> dataType = dataFactory.createDataDef(type, annotationsList);
			QData data = dataFactory.createData(dataType, false);

			entry[entryIndex] = data;
			entryIndex++;
		}

		return entry;
	}

	private <C> C injectData(Object owner, Class<C> klass, QAccessFactory accessFactory, QDataContainer dataContainer, QContext context, Map<String, Object> sharedModules) throws IllegalArgumentException,
			IllegalAccessException, InstantiationException {

		C callable = klass.newInstance();

		if(owner == null)
			owner = callable;
		
		injectFieldsData(owner, klass, callable, accessFactory, dataContainer, context, sharedModules);

		injectSmeupData(callable);

		if (callable.getClass().getAnnotation(Program.class) == null)
			return callable;

		context.invoke(callable, PostConstruct.class);

		return callable;
	}

	@SuppressWarnings("unchecked")
	private void injectFieldsData(Object owner, Class<?> klass, Object callable, QAccessFactory accessFactory, QDataContainer dataContainer, QContext context, Map<String, Object> sharedModules)
			throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		// recursively on superClass
		if (klass.getSuperclass().getAnnotation(Program.class) != null)
			injectFieldsData(owner, klass.getSuperclass(), callable, accessFactory, dataContainer, context, sharedModules);

		List<Field> fieldDataSets = new ArrayList<Field>();
		Map<String, QDataStruct> classToStructs = new HashMap<String, QDataStruct>();

		for (Field field : klass.getDeclaredFields()) {

			// TODO
			if (field.getName().startsWith("$SWITCH_TABLE"))
				continue;

			if (Modifier.isStatic(field.getModifiers())) {
				if (Modifier.isFinal(field.getModifiers()))
					continue;
				if (field.get(callable) != null)
					continue;
			}


			Class<?> fieldClass = null;

			Type type = field.getGenericType();
			if (type instanceof ParameterizedType) {
				fieldClass = (Class<?>) ((ParameterizedType) type).getRawType();
			} else
				fieldClass = (Class<?>) type;			
			
			// Procedure lazy loading
			if (fieldClass.getAnnotation(Procedure.class) != null) 
				continue;

			field.setAccessible(true);

			// DataFactory
			if (QDataFactory.class.isAssignableFrom(fieldClass)) {
				field.set(callable, dataContainer.getDataFactory());
			}
			// DataSet
			else if (QDataSet.class.isAssignableFrom(fieldClass)) {
				fieldDataSets.add(field);
			}
			// Data
			else if (QData.class.isAssignableFrom(fieldClass)) {

				QDataTerm<?> dataTerm = dataContainer.createDataTerm(field.getName(), type, Arrays.asList(field.getAnnotations()));

				QData data = dataContainer.resetData(dataTerm);
				field.set(callable, data);

				if (dataTerm.getDataTermType().isCompound()) {
					QCompoundDataDef<?, ?> compoundDataDef = (QCompoundDataDef<?, ?>) dataTerm.getDefinition();
					Class<? extends QRecord> primaryRecord = getPrimaryRecord((Class<? extends QRecord>) data.getClass());
					String primaryRecordName = null;
					if (compoundDataDef.getPrefix() != null)
						primaryRecordName = compoundDataDef.getPrefix() + "_" + primaryRecord.getSimpleName();
					else
						primaryRecordName = primaryRecord.getSimpleName();

					classToStructs.put(primaryRecordName, (QDataStruct) data);
				}
			}
			// @Injection
			else if (field.getAnnotation(Inject.class) != null) {

				Object object = null;

				// Job
				if (QJob.class.isAssignableFrom(fieldClass)) {
					object = job;
				}
				// Caller
				else if (field.getAnnotation(Program.class) != null) {
					object = owner;
				}
				// Module
				else {
					object = sharedModules.get(fieldClass.getSimpleName());
					if (object == null)
						object = context.get(fieldClass);

					if (object == null) {
						object = injectData(owner, fieldClass, accessFactory, dataContainer, context, sharedModules);
						sharedModules.put(fieldClass.getSimpleName(), object);
					}
				}

				if (object == null) {
					field.setAccessible(false);
					throw new OperatingSystemRuntimeException("Unknown field type: " + type);
				} else
					field.set(callable, object);
			}
			// @DataDef
			else if (field.getAnnotation(DataDef.class) != null) {
				"".toCharArray();
			}

			field.setAccessible(false);
		}

		for (Field fieldDataSet : fieldDataSets) {

			Type type = fieldDataSet.getGenericType();

			ParameterizedType pType = (ParameterizedType) type;
			if (pType.getActualTypeArguments()[0] instanceof WildcardType)
				continue;

			Class<?> fieldClass = (Class<?>) pType.getRawType();

			fieldDataSet.setAccessible(true);

			FileDef fileDef = fieldDataSet.getAnnotation(FileDef.class);
			if (fileDef != null) {

				QDataSet<QDataStruct> dataSet = null;

				QDataStruct infoStruct = null;
				if (!fileDef.info().isEmpty())
					infoStruct = (QDataStruct) dataContainer.getData(fileDef.info());

				Class<QDataStruct> classRecord = (Class<QDataStruct>) pType.getActualTypeArguments()[0];
				Class<? extends QRecord> classPrimaryRecord = getPrimaryRecord(classRecord);

				String primaryRecordName = null;
				if (!fileDef.prefix().isEmpty())
					primaryRecordName = fileDef.prefix() + "_" + classPrimaryRecord.getSimpleName();
				else
					primaryRecordName = classPrimaryRecord.getSimpleName();

				QDataStruct primaryRecord = classToStructs.get(primaryRecordName);

				QDataStruct record = null;
				if (primaryRecord == null) {
					record = dataContainer.getDataFactory().createRecord(classRecord, true);
					classToStructs.put(primaryRecordName, record);
				} else {
					record = dataContainer.getDataFactory().createRecord(classRecord, false);
					primaryRecord.assign(record);
				}

				if (QKSDataSet.class.isAssignableFrom(fieldClass)) {
					dataSet = accessFactory.createKeySequencedDataSet(record, fileDef.name(), AccessMode.UPDATE, fileDef.userOpen(), infoStruct);
				} else if (QSMDataSet.class.isAssignableFrom(fieldClass)) {
					dataSet = accessFactory.createSourceMemberDataSet(record, fileDef.name(), AccessMode.UPDATE, fileDef.userOpen(), infoStruct);
				} else {
					dataSet = accessFactory.createRelativeRecordDataSet(record, fileDef.name(), AccessMode.UPDATE, fileDef.userOpen(), infoStruct);
				}

				fieldDataSet.set(callable, dataSet);
			}

			fieldDataSet.setAccessible(false);
		}
	}

	private void injectSmeupData(Object callable) throws IllegalArgumentException, IllegalAccessException {

		Field £mubField = null;
		try {
			£mubField = callable.getClass().getField("£mub");

		} catch (NoSuchFieldException | SecurityException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
		}

		if (£mubField == null)
			return;

		try {
			£mubField.setAccessible(true);

			Object £mub = £mubField.get(callable);
			Object £mu_£pds_1 = £mub.getClass().getField("£mu_£pds_1").get(£mub);

			// program name
			Object £pdsnp = £mu_£pds_1.getClass().getField("£pdsnp").get(£mu_£pds_1);
			String programName = callable.getClass().getSimpleName();
			Program program = callable.getClass().getAnnotation(Program.class);
			if (program != null)
				programName = program.name();
			£pdsnp.getClass().getMethod("eval", String.class).invoke(£pdsnp, new Object[] { programName });

			// user name
			Object £pdsnu = £mu_£pds_1.getClass().getField("£pdsnu").get(£mu_£pds_1);
			£pdsnu.getClass().getMethod("eval", String.class).invoke(£pdsnu, new Object[] { job.getJobUser() });

			// job number
			Object £pdsjz = £mu_£pds_1.getClass().getField("£pdsjz").get(£mu_£pds_1);
			£pdsjz.getClass().getMethod("eval", Integer.TYPE).invoke(£pdsjz, new Object[] { job.getJobNumber() });

		} catch (NoSuchFieldException | InvocationTargetException | NoSuchMethodException e) {
			e.printStackTrace();
		} finally {
			£mubField.setAccessible(false);
		}
	}

	@SuppressWarnings("unused")
	private QFile getFile(String name) {

		QFile file = null;
		QFileOverride fileOverride = fileManager.getFileOverride(job.getContext(), name);
		if (fileOverride == null)
			file = fileReader.lookup(name);
		else
			file = fileOverride.getFileTo();

		return file;
	}

	@SuppressWarnings("unchecked")
	private Class<? extends QRecord> getPrimaryRecord(Class<? extends QRecord> classRecord) {

		if (classRecord.getSuperclass() == QRecordWrapper.class)
			return classRecord;

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
	/*
	 * public static QTerm getPrimaryRecord(QCallableUnit callableUnit,
	 * QDataSetTerm dataSetTerm) {
	 * 
	 * if (dataSetTerm.getFacet(QExternalFile.class) == null) return null;
	 * 
	 * QTerm primaryRecord = null;
	 * 
	 * // search on external dataStructure if (callableUnit.getDataSection() !=
	 * null) for (QDataTerm<?> dataTerm :
	 * callableUnit.getDataSection().getDatas()) if
	 * (dataTerm.getFacet(QExternalFile.class) != null) { QExternalFile
	 * externalFile = dataTerm.getFacet(QExternalFile.class);
	 * 
	 * if
	 * (dataSetTerm.getFacet(QExternalFile.class).getFormat().equalsIgnoreCase
	 * (externalFile.getFormat())) { primaryRecord = dataTerm; break; } else
	 * continue; }
	 * 
	 * if (primaryRecord != null) return primaryRecord;
	 * 
	 * // search on dataSet if (callableUnit.getFileSection() != null) for
	 * (QDataSetTerm dst : callableUnit.getFileSection().getDataSets()) if
	 * (dst.getFacet(QExternalFile.class) != null) { QExternalFile externalFile
	 * = dst.getFacet(QExternalFile.class); if
	 * (dataSetTerm.getFacet(QExternalFile
	 * .class).getFormat().equalsIgnoreCase(externalFile.getFormat())) {
	 * primaryRecord = dst; break; } else continue; } else
	 * System.out.println("Unexpected condition: pxnqt9r87x93q46t");
	 * 
	 * if (primaryRecord != null) return primaryRecord;
	 * 
	 * return primaryRecord; }
	 */
}