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

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataContext;
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
import org.smeup.sys.os.pgm.QCallableProgram;
import org.smeup.sys.os.pgm.QProgram;
import org.smeup.sys.os.pgm.QProgramStatus;

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
	private QDataContext dataContext;
	private Map<String, Object> callerModules;

	@PostConstruct
	public void init() {
		this.fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
		this.dataContext = dataManager.createDataContext(job.getContext());
		this.callerModules = new HashMap<String, Object>();
	}

	public QDataContext getDataContext() {
		return dataContext;
	}

	public QCallableProgram prepareCallable(QProgram program, Class<?> klass) {

		QDataContainer dataContainer = dataManager.createDataContainer(dataContext, new HashMap<String, QDataTerm<?>>(), true);

		QDataTerm<?> programStatusTerm = dataContainer.createDataTerm("*pgmstatus", BaseProgramStatusImpl.class, new ArrayList<Annotation>());
		QProgramStatus programStatus = (QProgramStatus) dataContainer.getData(programStatusTerm);
		programStatus.getProgramName().eval(program.getName());
		programStatus.getProgramLibrary().eval(program.getLibrary());
		programStatus.getUserName().eval(job.getJobUser());
		programStatus.getJobNumber().eval(job.getJobNumber());
		programStatus.getJobName().eval(job.getJobName());
		programStatus.getStatusCode().clear();

		try {
			QAccessFactory accessFactory = esamManager.createFactory(job, dataContainer.getDataContext());

			Map<String, Object> unitModules = new HashMap<String, Object>();
			Map<String, QRecord> records = new HashMap<String, QRecord>();

			Object  delegate = injectData(null, klass, dataContainer, accessFactory, unitModules, records);
			QCallableProgram callableProgram = new BaseCallableProgramDelegator(dataContext, program, programStatus, delegate);
			
			QDataContext dataContext = getDataContext();
			dataContext.getContext().invoke(callableProgram.getRawProgram(), PostConstruct.class);

			return callableProgram;
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e);
		} finally {
			dataContainer.close();
		}
	}

	public <P extends Object> P prepareProcedure(Object owner, Class<P> klass) {

		QDataContainer dataContainer = dataManager.createDataContainer(dataContext, new HashMap<String, QDataTerm<?>>(), true);
		Constructor<?> constructor = null;
		
		try {
			constructor = klass.getDeclaredConstructor(owner.getClass());
			constructor.setAccessible(true);
			@SuppressWarnings("unchecked")
			P callable = (P) constructor.newInstance(owner);

			Map<String, Object> unitModules = new HashMap<String, Object>();
			Map<String, QRecord> records = new HashMap<String, QRecord>();

			injectFields(owner, klass, callable, dataContainer, null, unitModules, records);

			return callable;
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e);
		} finally {
			if(constructor != null)
				constructor.setAccessible(false);
			dataContainer.close();
		}
	}

	private <C> C injectData(Object owner, Class<C> klass, QDataContainer dataContainer, QAccessFactory accessFactory, Map<String, Object> unitModules, Map<String, QRecord> records)
			throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		C callable = klass.newInstance();

		if (owner == null)
			owner = callable;

		injectFields(owner, klass, callable, dataContainer, accessFactory, unitModules, records);

		// injectSmeupData(callable);

		return callable;
	}

	@SuppressWarnings("unchecked")
	private void injectFields(Object owner, Class<?> klass, Object callable, QDataContainer dataContainer, QAccessFactory accessFactory, Map<String, Object> unitModules,
			Map<String, QRecord> records) throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		// recursively on superClass
		if (klass.getSuperclass().getAnnotation(Program.class) != null)
			injectFields(owner, klass.getSuperclass(), callable, dataContainer, accessFactory, unitModules, records);

		QContext context = dataContainer.getDataContext().getContext();

		List<InjectableField> datas = new ArrayList<InjectableField>();
		List<InjectableField> dataStructures = new ArrayList<InjectableField>();
		List<InjectableField> dataSets = new LinkedList<InjectableField>();
		List<InjectableField> infoFields = new ArrayList<InjectableField>();

		for (Field field : klass.getDeclaredFields()) {

			// TODO
			if (field.getName().startsWith("$SWITCH_TABLE"))
				continue;
			if (field.getName().startsWith("this$"))
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
			// DataContext
			else if (QDataContext.class.isAssignableFrom(fieldClass))
				object = dataContainer.getDataContext();
			// Module
			else if (fieldClass.getAnnotation(Module.class) != null) {
				Module module = fieldClass.getAnnotation(Module.class);
				switch (module.scope()) {
				case OWNER:
					object = callerModules.get(fieldClass.getSimpleName());
					break;
				case UNIT:
					object = unitModules.get(fieldClass.getSimpleName());
					break;
				}
				
				if (object == null) {
					object = injectData(owner, fieldClass, dataContainer, accessFactory, unitModules, records);
					switch (module.scope()) {
					case OWNER:
						callerModules.put(fieldClass.getSimpleName(), object);
						break;
					case UNIT:
						unitModules.put(fieldClass.getSimpleName(), object);
						break;
					}
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
				} else if (String.class.isAssignableFrom(fieldClass)) {
					object = dataDef.value();
				} else if (Byte.class.isAssignableFrom(fieldClass)) {
					if (dataDef.value().startsWith("X'")) {
						object = convertHexToString(dataDef.value().substring(2, 4)).getBytes()[0];
					} else
						System.err.println("Unexpected condition " + field.getDeclaringClass() + ": xw09ert98ery87tyrew");
				} else
					System.err.println("Unexpected condition " + field.getDeclaringClass() + ": x456b6439b57w6ervdas5");
			}

			if (object != null)
				injectableField.setValue(callable, object);
		}

		// dataSet
		for (InjectableField field : dataSets) {
			QDataSet<QRecord> dataSet = null;

			Class<QRecord> classRecord = (Class<QRecord>) field.getArguments()[0];
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

			QRecord record = records.get(primaryRecordName.toLowerCase());
			if (record == null) {
				record = dataContainer.getDataContext().getDataFactory().createRecord(classRecord, true);
				records.put(primaryRecordName.toLowerCase(), record);
			}

			if (QKSDataSet.class.isAssignableFrom(field.getClass_())) {
				dataSet = accessFactory.createKeySequencedDataSet(classRecord, record, AccessMode.UPDATE, userOpen, null);
			} else if (QSMDataSet.class.isAssignableFrom(field.getClass_())) {
				dataSet = accessFactory.createSourceMemberDataSet(classRecord, record, AccessMode.UPDATE, userOpen, null);
			} else {
				dataSet = accessFactory.createRelativeRecordDataSet(classRecord, record, AccessMode.UPDATE, userOpen, null);
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

			String primaryRecordName = primaryRecordClass.getSimpleName();
			if (compoundDataDef.getPrefix() != null && !compoundDataDef.getPrefix().isEmpty())
				primaryRecordName = compoundDataDef.getPrefix() + "_" + primaryRecordName;

			QRecord primaryRecord = records.get(primaryRecordName.toLowerCase());
			if (primaryRecord == null)
				records.put(primaryRecordName.toLowerCase(), dataStruct);
			else
				((QDataStruct) primaryRecord).assign(dataStruct);

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

			QDataStruct infoStruct = (QDataStruct) records.get(fileDef.info().toLowerCase());
			if (infoStruct == null)
				System.err.println("Unexpected condition " + fileDef.info() + ": asggsu676rf7qwf7");
			else {
				field.getField().setAccessible(true);
				((QDataSet<?>) field.getField().get(callable)).getInfoStruct().assign(infoStruct);
				field.getField().setAccessible(false);
			}
		}
	}

	/*
	 * private void injectSmeupData(Object callable) throws
	 * IllegalArgumentException, IllegalAccessException {
	 * 
	 * Field £mubField = null; try { £mubField =
	 * callable.getClass().getField("£Mub"); } catch (NoSuchFieldException |
	 * SecurityException e1) { return; }
	 * 
	 * try { £mubField.setAccessible(true);
	 * 
	 * Object £mub = £mubField.get(callable); Object £mu_£pds_1 =
	 * £mub.getClass().getField("£mu_£pds_1").get(£mub);
	 * 
	 * // program name Object £pdsnp =
	 * £mu_£pds_1.getClass().getField("£pdsnp").get(£mu_£pds_1); String
	 * programName = callable.getClass().getSimpleName(); Program program =
	 * callable.getClass().getAnnotation(Program.class); if (program != null)
	 * programName = program.name(); £pdsnp.getClass().getMethod("eval",
	 * String.class).invoke(£pdsnp, new Object[] { programName });
	 * 
	 * // user name Object £pdsnu =
	 * £mu_£pds_1.getClass().getField("£pdsnu").get(£mu_£pds_1);
	 * £pdsnu.getClass().getMethod("eval", String.class).invoke(£pdsnu, new
	 * Object[] { job.getJobUser() });
	 * 
	 * // job number Object £pdsjz =
	 * £mu_£pds_1.getClass().getField("£pdsjz").get(£mu_£pds_1);
	 * £pdsjz.getClass().getMethod("eval", Integer.TYPE).invoke(£pdsjz, new
	 * Object[] { job.getJobNumber() });
	 * 
	 * } catch (NoSuchFieldException | InvocationTargetException |
	 * NoSuchMethodException e) { e.printStackTrace(); } finally {
	 * £mubField.setAccessible(false); } }
	 */

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

	public static String convertHexToString(String hex) {

		StringBuilder sb = new StringBuilder();
		StringBuilder temp = new StringBuilder();

		// 49204c6f7665204a617661 split into two characters 49, 20, 4c...
		for (int i = 0; i < hex.length() - 1; i += 2) {

			// grab the hex in pairs
			String output = hex.substring(i, (i + 2));
			// convert hex to decimal
			int decimal = Integer.parseInt(output, 16);
			// convert the decimal to character
			sb.append((char) decimal);

			temp.append(decimal);
		}

		return sb.toString();
	}
}