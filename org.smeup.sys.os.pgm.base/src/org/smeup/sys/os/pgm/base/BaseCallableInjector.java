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
import java.lang.reflect.Constructor;
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
import java.util.Stack;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.ctx.QContextProvider;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataStructWrapper;
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
		Map<String, Object> sharedModules = new HashMap<String, Object>();

		C callable = null;
		try {
			callable = injectData(null, klass, dataContainer, accessFactory, context, sharedModules);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dataContainer.close();
		}

		return callable;
	}

	public <P extends Object> P prepareProcedure(QContext context, Object owner, Class<P> klass) {

		Map<String, QDataTerm<?>> dataTerms = new HashMap<String, QDataTerm<?>>();
		QDataContainer dataContainer = dataManager.createDataContainer(context, dataTerms, true);
		Map<String, Object> sharedModules = new HashMap<String, Object>();

		try {
			Constructor<?> constructor = klass.getDeclaredConstructor(owner.getClass());
			@SuppressWarnings("unchecked")
			P callable = (P) constructor.newInstance(owner);

			injectFields(owner, klass, callable, dataContainer, null, context, sharedModules);

			return callable;
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e);
		} finally {
			dataContainer.close();
		}
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

	private <C> C injectData(Object owner, Class<C> klass, QDataContainer dataContainer, QAccessFactory accessFactory, QContext context, Map<String, Object> sharedModules)
			throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		C callable = klass.newInstance();

		if (owner == null)
			owner = callable;

		injectFields(owner, klass, callable, dataContainer, accessFactory, context, sharedModules);

		injectSmeupData(callable);

		if (callable.getClass().getAnnotation(Program.class) == null)
			return callable;

		context.invoke(callable, PostConstruct.class);

		return callable;
	}

	@SuppressWarnings("unchecked")
	private void injectFields(Object owner, Class<?> klass, Object callable, QDataContainer dataContainer, QAccessFactory accessFactory, QContext context, Map<String, Object> sharedModules)
			throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		// recursively on superClass
		if (klass.getSuperclass().getAnnotation(Program.class) != null)
			injectFields(owner, klass.getSuperclass(), callable, dataContainer, accessFactory, context, sharedModules);

		Map<String, QDataStruct> structures = new HashMap<String, QDataStruct>();
		Stack<Field> infoFields = new Stack<Field>();

		for (Field field : klass.getDeclaredFields()) {

			// TODO
			if (field.getName().startsWith("$SWITCH_TABLE"))
				continue;

			if (Modifier.isStatic(field.getModifiers())) {
				if (Modifier.isFinal(field.getModifiers()))
					continue;

				// TODO
				if (field.get(callable) != null)
					continue;
			}

			Class<?> fieldClass = null;

			Type fieldType = field.getGenericType();
			ParameterizedType parType = null;
			Type[] argsType = null;

			if (fieldType instanceof ParameterizedType) {
				parType = (ParameterizedType) fieldType;
				argsType = parType.getActualTypeArguments();
				fieldClass = (Class<?>) ((ParameterizedType) fieldType).getRawType();
			} else
				fieldClass = (Class<?>) fieldType;

			// Procedure lazy loading
			if (fieldClass.getAnnotation(Procedure.class) != null)
				continue;

			field.setAccessible(true);

			Object object = null;

			// Data
			if (QData.class.isAssignableFrom(fieldClass)) {

				QDataTerm<?> dataTerm = dataContainer.createDataTerm(field.getName(), fieldType, Arrays.asList(field.getAnnotations()));
				QData data = dataContainer.resetData(dataTerm);

				// DataStruct
				if (data instanceof QDataStruct) {
					QDataStruct dataStruct = (QDataStruct) data;

					Class<? extends QRecord> primaryRecordClass = getPrimaryRecord((Class<? extends QRecord>) data.getClass());
					QCompoundDataDef<?, ?> compoundDataDef = (QCompoundDataDef<?, ?>) dataTerm.getDefinition();

					String primaryRecordName = null;
					if (compoundDataDef.getPrefix() != null && !compoundDataDef.getPrefix().isEmpty())
						primaryRecordName = compoundDataDef.getPrefix() + "_" + primaryRecordClass.getSimpleName();
					else
						primaryRecordName = primaryRecordClass.getSimpleName();

					QDataStruct primaryRecord = structures.get(primaryRecordName.toLowerCase());
					if (primaryRecord == null) {
						structures.put(primaryRecordName.toLowerCase(), dataStruct);
					} else {
						primaryRecord.assign(dataStruct);
					}
				}

				object = data;
			}
			// DataSet
			else if (QDataSet.class.isAssignableFrom(fieldClass)) {
				if (argsType[0] instanceof WildcardType)
					continue;

				QDataSet<QDataStruct> dataSet = null;

				Class<QDataStruct> classRecord = (Class<QDataStruct>) argsType[0];
				Class<? extends QRecord> classPrimaryRecord = getPrimaryRecord(classRecord);
				String primaryRecordName = classPrimaryRecord.getSimpleName();

				QDataStruct record = null;
				String fileName = classRecord.getSimpleName();
				boolean userOpen = false;
				QDataStruct infoStruct = null;

				// from annotation
				FileDef fileDef = field.getAnnotation(FileDef.class);
				if (fileDef != null) {
					userOpen = fileDef.userOpen();
					if (!fileDef.name().isEmpty())
						primaryRecordName = fileDef.name();
					if (!fileDef.info().isEmpty()) {
						infoStruct = structures.get(fileDef.info().toLowerCase());
						if (infoStruct == null)
							infoFields.add(field);
					}
					if (!fileDef.prefix().isEmpty())
						primaryRecordName = fileDef.prefix() + "_" + primaryRecordName;
				}

				QDataStruct primaryRecord = structures.get(primaryRecordName.toLowerCase());
				if (primaryRecord == null) {
					record = dataContainer.getDataFactory().createRecord(classRecord, true);
					structures.put(primaryRecordName.toLowerCase(), record);
				} else {
					record = dataContainer.getDataFactory().createRecord(classRecord, false);
					primaryRecord.assign(record);
				}

				if (QKSDataSet.class.isAssignableFrom(fieldClass)) {
					dataSet = accessFactory.createKeySequencedDataSet(record, fileName, AccessMode.UPDATE, userOpen, infoStruct);
				} else if (QSMDataSet.class.isAssignableFrom(fieldClass)) {
					dataSet = accessFactory.createSourceMemberDataSet(record, fileName, AccessMode.UPDATE, userOpen, infoStruct);
				} else {
					dataSet = accessFactory.createRelativeRecordDataSet(record, fileName, AccessMode.UPDATE, userOpen, infoStruct);
				}

				object = dataSet;
			}
			// Job
			else if (QJob.class.isAssignableFrom(fieldClass))
				object = job;
			// Injector
			else if (BaseCallableInjector.class.isAssignableFrom(fieldClass))
				object = this;
			// DataFactory
			else if (QDataFactory.class.isAssignableFrom(fieldClass))
				object = dataContainer.getDataFactory();
			// Caller
			else if (field.getAnnotation(Program.class) != null && field.getAnnotation(Program.class).name().equals(Program.NAME_OWNER))
				object = owner;
			// @Injection
			else if (field.getAnnotation(Inject.class) != null) {

				object = sharedModules.get(fieldClass.getSimpleName());

				if (object == null)
					object = context.get(fieldClass);

				if (object == null) {
					object = injectData(owner, fieldClass, dataContainer, accessFactory, context, sharedModules);
					sharedModules.put(fieldClass.getSimpleName(), object);
				}

				if (object == null) {
					field.setAccessible(false);
					throw new OperatingSystemRuntimeException("Unknown field type: " + fieldType);
				}
			} else if (field.getAnnotation(DataDef.class) != null) {
				DataDef dataDef = field.getAnnotation(DataDef.class);

				if (Integer.class.isAssignableFrom(fieldClass)) {
					object = Integer.parseInt(dataDef.value());
				} else
					System.err.println("Unexpected condition " + field.getDeclaringClass() + ": x456b6439b57w6ervdas5");
			}

			if (object != null)
				field.set(callable, object);

			field.setAccessible(false);
		}

		while (!infoFields.isEmpty()) {
			Field field = infoFields.pop();
			
			FileDef fileDef = field.getAnnotation(FileDef.class);
			QDataStruct infoStruct = structures.get(fileDef.info().toLowerCase());
			if(infoStruct == null)
				System.err.println("Unexpected condition " + fileDef.info() + ": asggsu676rf7qwf7");
			else
				((QDataSet<?>)field.get(callable)).getInfoStruct().assign(infoStruct);				
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

		// dataStruct
		if (classRecord.getSuperclass() == QDataStructWrapper.class)
			return classRecord;
		// physical file
		else if (classRecord.getSuperclass() == QRecordWrapper.class)
			return classRecord;

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
}