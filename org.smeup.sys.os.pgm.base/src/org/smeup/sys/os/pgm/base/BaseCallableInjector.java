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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

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
import org.smeup.sys.il.data.annotation.Module;
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
	
	public static final String NAME_OWNER = "*OWNER";
	
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

		Queue<InjectableField> dataSets = new LinkedList<InjectableField>();
		Map<String, QDataStruct> records = new HashMap<String, QDataStruct>();
		Queue<InjectableField> dataStructures = new LinkedList<InjectableField>();
		Queue<InjectableField> datas = new LinkedList<InjectableField>();
		Queue<InjectableField> infoFields = new LinkedList<InjectableField>();

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
				fieldClass = (Class<?>) parType.getRawType();
			} else
				fieldClass = (Class<?>) fieldType;

			// Procedure lazy loading
			if (fieldClass.getAnnotation(Procedure.class) != null)
				continue;

			InjectableField injectableField = new InjectableField(field, fieldClass, fieldType, argsType);

			Object object = null;

			// DataSet
			if (QDataSet.class.isAssignableFrom(fieldClass)) {
				if (argsType[0] instanceof WildcardType)
					continue;
				dataSets.add(injectableField);
			}
			// DataStruct
			else if (QDataStruct.class.isAssignableFrom(fieldClass))
				dataStructures.add(injectableField);
			// Data
			else if (QData.class.isAssignableFrom(fieldClass))
				datas.add(injectableField);
			// Job
			else if (QJob.class.isAssignableFrom(fieldClass))
				object = job;
			// Injection
			else if (BaseCallableInjector.class.isAssignableFrom(fieldClass))
				object = this;
			// DataFactory
			else if (QDataFactory.class.isAssignableFrom(fieldClass))
				object = dataContainer.getDataFactory();
			// Module
			else if (fieldClass.getAnnotation(Module.class) != null) {
				object = sharedModules.get(fieldClass.getSimpleName());
				if (object == null) {
					object = injectData(owner, fieldClass, dataContainer, accessFactory, context, sharedModules);
					sharedModules.put(fieldClass.getSimpleName(), object);
				}
			}
			// Caller
			else if (field.getAnnotation(Program.class) != null && field.getAnnotation(Program.class).name().equals(NAME_OWNER))
				object = owner;
			// Inject
			else if (field.getAnnotation(Inject.class) != null) {
				object = context.get(fieldClass);

				if (object == null)
					throw new OperatingSystemRuntimeException("Invalid " + injectableField);

			} else if (field.getAnnotation(DataDef.class) != null) {
				DataDef dataDef = field.getAnnotation(DataDef.class);

				if (Integer.class.isAssignableFrom(fieldClass)) {
					object = Integer.parseInt(dataDef.value());
				} else 	if (String.class.isAssignableFrom(fieldClass)) {
					object = dataDef.value();
				} else
					System.err.println("Unexpected condition " + field.getDeclaringClass() + ": x456b6439b57w6ervdas5");
			}

			if (object != null)
				injectableField.setValue(callable, object);
		}

		// dataSet
		for (InjectableField field : dataSets) {
			QDataSet<QDataStruct> dataSet = null;

			Class<QDataStruct> classRecord = (Class<QDataStruct>) field.getArguments()[0];
			Class<? extends QRecord> classPrimaryRecord = getPrimaryRecord(classRecord);

			String primaryRecordName = classPrimaryRecord.getSimpleName();
			boolean userOpen = false;

			// from annotation
			FileDef fileDef = field.getField().getAnnotation(FileDef.class);
			if (fileDef != null) {
				userOpen = fileDef.userOpen();
				if (!fileDef.name().isEmpty())
					primaryRecordName = fileDef.name();
				if (!fileDef.info().isEmpty())
					infoFields.add(field);

				if (!fileDef.prefix().isEmpty())
					primaryRecordName = fileDef.prefix() + "_" + primaryRecordName;
			}

			QDataStruct record = records.get(primaryRecordName.toLowerCase());
			if (record == null) {
				record = dataContainer.getDataFactory().createRecord(classRecord, true);
				records.put(primaryRecordName.toLowerCase(), record);
			}
			else
				record.toString();
			
			String fileName = classRecord.getSimpleName();
			if (QKSDataSet.class.isAssignableFrom(field.getClass_())) {
				dataSet = accessFactory.createKeySequencedDataSet(record, fileName, AccessMode.UPDATE, userOpen, null);
			} else if (QSMDataSet.class.isAssignableFrom(field.getClass_())) {
				dataSet = accessFactory.createSourceMemberDataSet(record, fileName, AccessMode.UPDATE, userOpen, null);
			} else {
				dataSet = accessFactory.createRelativeRecordDataSet(record, fileName, AccessMode.UPDATE, userOpen, null);
			}

			field.setValue(callable, dataSet);
		}

		// dataStructure
		for (InjectableField field : dataStructures) {

			QDataTerm<?> dataTerm = dataContainer.createDataTerm(field.getName(), field.getType(), Arrays.asList(field.getField().getAnnotations()));
			QData data = dataContainer.resetData(dataTerm);

			QDataStruct dataStruct = (QDataStruct) data;
			QCompoundDataDef<?, ?> compoundDataDef = (QCompoundDataDef<?, ?>) dataTerm.getDefinition();
			
			Class<? extends QRecord> primaryRecordClass = getPrimaryRecord((Class<? extends QRecord>) data.getClass());

			String primaryRecordName = null;
			if (compoundDataDef.getPrefix() != null && !compoundDataDef.getPrefix().isEmpty())
				primaryRecordName = compoundDataDef.getPrefix() + "_" + primaryRecordClass.getSimpleName();
			else
				primaryRecordName = primaryRecordClass.getSimpleName();

			QDataStruct primaryRecord = records.get(primaryRecordName.toLowerCase());
			if (primaryRecord == null) {
				records.put(primaryRecordName.toLowerCase(), dataStruct);
			} else {
				primaryRecord.assign(dataStruct);
			}

			field.setValue(callable, dataStruct);
		}

		// data
		for (InjectableField field : datas) {

			QDataTerm<?> dataTerm = dataContainer.createDataTerm(field.getName(), field.getType(), Arrays.asList(field.getField().getAnnotations()));
			QData data = dataContainer.resetData(dataTerm);

			field.setValue(callable, data);
		}

		// recordInfo
		for (InjectableField field : infoFields) {

			FileDef fileDef = field.getField().getAnnotation(FileDef.class);
			
			QDataStruct infoStruct = records.get(fileDef.info().toLowerCase());
			if (infoStruct == null)
				System.err.println("Unexpected condition " + fileDef.info() + ": asggsu676rf7qwf7");
			else
				((QDataSet<?>) field.getField().get(callable)).getInfoStruct().assign(infoStruct);
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

	private class InjectableField {

		private Field field;
		private Class<?> class_;
		private Type type;
		private Type[] arguments;

		protected InjectableField(Field field, Class<?> fieldClass, Type fieldType, Type[] fieldArgs) {
			this.field = field;
			this.class_ = fieldClass;
			this.type = fieldType;
			this.arguments = fieldArgs;
		}

		public String getName() {
			return this.field.getName();
		}

		protected Field getField() {
			return field;
		}

		protected Class<?> getClass_() {
			return class_;
		}

		protected Type getType() {
			return type;
		}

		protected Type[] getArguments() {
			return arguments;
		}

		protected void setValue(Object owner, Object value) {
			field.setAccessible(true);
			try {
				field.set(owner, value);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
			field.setAccessible(false);
		}

		@Override
		public String toString() {
			return "InjectableField [field=" + field + ", class_=" + class_ + ", type=" + type + ", arguments=" + Arrays.toString(arguments) + "]";
		}
	}
}