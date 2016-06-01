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
package org.smeup.sys.os.pgm.base;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.QRecordWrapper;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.QStroller;
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
import org.smeup.sys.il.esam.QDisplay;
import org.smeup.sys.il.esam.QKSDataSet;
import org.smeup.sys.il.esam.QPrint;
import org.smeup.sys.il.esam.QRRDataSet;
import org.smeup.sys.il.esam.QSMDataSet;
import org.smeup.sys.il.esam.annotation.FileDef;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.il.memo.Scope;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobReference;
import org.smeup.sys.os.file.QFile;
import org.smeup.sys.os.file.QFileManager;
import org.smeup.sys.os.file.QFileOverride;
import org.smeup.sys.os.pgm.QActivationGroup;
import org.smeup.sys.os.pgm.QCallableProgram;
import org.smeup.sys.os.pgm.QOperatingSystemProgramFactory;
import org.smeup.sys.os.pgm.QProgram;
import org.smeup.sys.os.pgm.QProgramInfo;
import org.smeup.sys.os.pgm.QProgramStatus;

public class BaseCallableInjector {

	public static final String NAME_OWNER = "*OWNER";

	private static final String PROGRAM_STATUS = "*pgmstatus";

	@Inject
	private QDataManager dataManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QFileManager fileManager;
	@Inject
	private QAccessManager esamManager;
	@Inject
	private QJob job;
	
	private QActivationGroup activationGroup;
	private QResourceReader<QFile> fileReader;
	private QDataContext dataContext;
	private Map<String, Object> callerModules;

	public BaseCallableInjector(QActivationGroup activationGroup, QDataContext dataContext) {
		this.activationGroup = activationGroup;
		this.dataContext = dataContext;
		this.callerModules = new HashMap<String, Object>();
	}

	@PostConstruct
	private void init() {
		this.fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
	}

	public QDataContext getDataContext() {
		return dataContext;
	}

	public <P> QCallableProgram<P> prepareCallable(QProgram program, Class<P> klass) {

		QDataContainer dataContainer = dataManager.createDataContainer(dataContext);
				
		try {
			Date startDate = new Date();

			// program status
			QProgramStatus programStatus = getOrCreateProgramStatus(program, dataContainer);

			// memory info
			QProgramInfo programInfo = QOperatingSystemProgramFactory.eINSTANCE.createProgramInfo();

			P delegate = prepareDelegate(dataContainer, program, klass);

			programInfo.setMemorySize(dataContainer.getMemorySize());			
			programInfo.setLoadTime(new Date().getTime() - startDate.getTime());
			
			QCallableProgram<P> callableProgram = new BaseCallableProgramDelegator<P>(job, dataContext, activationGroup, program, programStatus, delegate, programInfo);

			return callableProgram;
		} catch (Exception e) {
			e.printStackTrace();
			throw new OperatingSystemRuntimeException(e);
		} finally {
			dataContainer.close();
		}
	}
	
	public <P> P prepareDelegate(QDataContainer dataContainer, QProgram program, Class<P> klass) {

		try {
			QAccessFactory accessFactory = esamManager.createFactory(job, dataContext);

			getOrCreateProgramStatus(program, dataContainer);
			
			P delegate = injectData(null, klass, dataContainer, accessFactory, new HashMap<String, Object>(), new HashMap<String, QRecord>());
			
			dataContext.getContext().invoke(delegate, PostConstruct.class);
			
			return delegate;
		} catch (Exception e) {
			e.printStackTrace();
			throw new OperatingSystemRuntimeException(e);
		}
	}
	
	public <P extends Object> P prepareProcedure(Object owner, Class<P> klass) {

		Constructor<?> constructor = null;
		QDataContainer dataContainer = null;
		try {
			constructor = klass.getDeclaredConstructor(owner.getClass());
			constructor.setAccessible(true);
			@SuppressWarnings("unchecked")
			P callable = (P) constructor.newInstance(owner);

			Map<String, Object> unitModules = new HashMap<String, Object>();
			Map<String, QRecord> records = new HashMap<String, QRecord>();

			dataContainer = dataManager.createDataContainer(dataContext.getContext(), callable);

			injectFields(owner, klass, callable, dataContainer, null, unitModules, records);

			return callable;
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e);
		} finally {
			if (constructor != null)
				constructor.setAccessible(false);
			if (dataContainer != null)
				dataContainer.close();
		}
	}

	private QProgramStatus getOrCreateProgramStatus(QProgram program, QDataContainer dataContainer) {

		QProgramStatus programStatus  = (QProgramStatus) dataContainer.getData(PROGRAM_STATUS);
		
		if(programStatus == null) {
			QDataTerm<?> programStatusTerm = dataContainer.addDataTerm(PROGRAM_STATUS, BaseProgramStatusImpl.class, null);
			programStatus = (QProgramStatus) dataContainer.getData(programStatusTerm);
//			programStatus.clear();
			
			programStatus.getProgramName().eval(program.getName());
			if (program.getLibrary() != null)
				programStatus.getProgramLibrary().eval(program.getLibrary());

			QJobReference jobReference = job.getJobReference();
			programStatus.getUserName().eval(jobReference.getJobUser());
			programStatus.getJobNumber().eval(jobReference.getJobNumber());
			programStatus.getJobName().eval(jobReference.getJobName());
		}

		return programStatus;
	}

	private <P> P injectData(Object owner, Class<P> klass, QDataContainer dataContainer, QAccessFactory accessFactory, Map<String, Object> unitModules, Map<String, QRecord> records)
			throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		P callable = klass.newInstance();

		if (owner == null)
			owner = callable;

		injectFields(owner, klass, callable, dataContainer, accessFactory, unitModules, records);

		return callable;
	}

	@SuppressWarnings({ "unchecked" })
	private void injectFields(Object owner, Class<?> klass, Object callable, QDataContainer dataContainer, QAccessFactory accessFactory, Map<String, Object> unitModules,
			Map<String, QRecord> records) throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		// recursively on superClass
		if (klass.getSuperclass().getAnnotation(Program.class) != null)
			injectFields(owner, klass.getSuperclass(), callable, dataContainer, accessFactory, unitModules, records);

		List<InjectableField> datas = new ArrayList<InjectableField>();
		List<InjectableField> dataStructures = new ArrayList<InjectableField>();
		List<InjectableField> dataSets = new LinkedList<InjectableField>();
		List<InjectableField> displays = new LinkedList<InjectableField>();
		List<InjectableField> prints = new LinkedList<InjectableField>();
		List<InjectableField> pointers = new ArrayList<InjectableField>();

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
			// Display
			else if (QDisplay.class.isAssignableFrom(fieldClass)) {
				if (argsType[0] instanceof WildcardType)
					continue;
				displays.add(injectableField);
			}
			// Print
			else if (QPrint.class.isAssignableFrom(fieldClass)) {
				if (argsType[0] instanceof WildcardType)
					continue;
				prints.add(injectableField);
			}
			// DataStruct
			else if (QDataStruct.class.isAssignableFrom(fieldClass))
				dataStructures.add(injectableField);
			// Pointers
			else if (QPointer.class.isAssignableFrom(fieldClass))
				pointers.add(injectableField);
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
				object = dataContext.getContext().get(fieldClass);

				if (object == null)
					throw new OperatingSystemRuntimeException("Invalid " + injectableField);

			} else if (field.getAnnotation(DataDef.class) != null) {
				DataDef dataDef = field.getAnnotation(DataDef.class);

				if (Integer.class.isAssignableFrom(fieldClass)) {
					object = Integer.parseInt(dataDef.value());
				} else if (Long.class.isAssignableFrom(fieldClass)) {
					object = Long.parseLong(dataDef.value());
				} else if (Double.class.isAssignableFrom(fieldClass)) {
					object = Double.parseDouble(dataDef.value());
				} else if (String.class.isAssignableFrom(fieldClass)) {
					object = dataDef.value();
				} else if (Byte.class.isAssignableFrom(fieldClass)) {
					if (dataDef.value().startsWith("X'")) {
						object = convertHexToByte(dataDef.value().substring(2, 4));
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

				// if (!fileDef.name().isEmpty())
				// primaryRecordName = fileDef.name();

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

			if (fileDef != null && !fileDef.name().isEmpty())
				dataSet.getFilePath().eval(fileDef.name());

			dataSet.clear();
			field.setValue(callable, dataSet);
		}

		// display
		for (InjectableField field : displays) {
			Class<?> classDisplay = (Class<?>) field.getArguments()[0];
			Object display = classDisplay.newInstance();
			injectFields(owner, classDisplay, display, dataContainer, accessFactory, unitModules, records);
			boolean userOpen = false;
			// from annotation
			FileDef fileDef = field.getField().getAnnotation(FileDef.class);
			if (fileDef != null)
				userOpen = fileDef.userOpen();

			field.setValue(callable, new BaseDisplayDelegator<Object>(display, userOpen));
		}

		// print
		for (InjectableField field : prints) {
			Class<?> classPrint = (Class<?>) field.getArguments()[0];
			Object print = classPrint.newInstance();
			injectFields(owner, classPrint, print, dataContainer, accessFactory, unitModules, records);
			boolean userOpen = false;
			// from annotation
			FileDef fileDef = field.getField().getAnnotation(FileDef.class);
			if (fileDef != null)
				userOpen = fileDef.userOpen();

			field.setValue(callable, new BasePrintDelegator<Object>(print, userOpen));
		}

		// pointer no default
		for (InjectableField field : pointers) {

			QDataTerm<?> dataTerm = dataContainer.addDataTerm(field.getName(), field.getType(), Arrays.asList(field.getField().getAnnotations()));
			if (dataTerm.getDefault() != null)
				continue;

			field.setValue(callable, dataContainer.getData(dataTerm));
		}

		// dataStructure no based
		injectDataStructures(callable, dataContainer, records, dataStructures, false);

		// data no based
		for (InjectableField field : datas) {

			QDataTerm<?> dataTerm = dataContainer.addDataTerm(field.getName(), field.getType(), Arrays.asList(field.getField().getAnnotations()));
			if (dataTerm.getBased() != null)
				continue;

			field.setValue(callable, dataContainer.getData(dataTerm));
		}

		// dataSet
		Set<String> dataSetRecords = new HashSet<String>();
		for (InjectableField field : dataSets) {

			QDataSet<?> dataSet = (QDataSet<?>) field.getValue(callable);
			QRecord dataSetRecord = dataSet.get();

			FileDef fileDef = field.getField().getAnnotation(FileDef.class);
			
			String primaryRecordName = dataSetRecord.getClass().getSimpleName();
			if (fileDef != null && !fileDef.prefix().isEmpty())
				primaryRecordName = fileDef.prefix() + "_" + primaryRecordName;
			
			if (dataSetRecords.contains(primaryRecordName))
				continue;
			
			for (String fieldName : dataSetRecord.getElementNames()) {

				QData data = null;
				if (fileDef != null && !fileDef.prefix().isEmpty())
					data = dataContainer.getData(fileDef.prefix() + fieldName);
				else
					data = dataContainer.getData(fieldName);
				
				if (data instanceof QBufferedData) {
					QBufferedData bufferedData = (QBufferedData) data;
					QBufferedData bufferedDataTo = dataSetRecord.getElement(fieldName);

					if (bufferedData.getStore() != bufferedDataTo.getStore())
						bufferedData.assign(bufferedDataTo);
				}
			}

			dataSetRecords.add(primaryRecordName);
		}

		// pointer with default
		for (InjectableField field : pointers) {

			QDataTerm<?> dataTerm = dataContainer.getDataTerm(field.getName());
			if (dataTerm.getDefault() == null)
				continue;

			field.setValue(callable, dataContainer.getData(dataTerm));
		}

		// dataStructure based
		injectDataStructures(callable, dataContainer, records, dataStructures, true);

		// data based
		for (InjectableField field : datas) {

			QDataTerm<?> dataTerm = dataContainer.getDataTerm(field.getName());
			if (dataTerm.getBased() == null)
				continue;

			field.setValue(callable, dataContainer.getData(dataTerm));
		}

		// recordInfo/fileName/memberName
		for (InjectableField field : dataSets) {
			FileDef fileDef = field.getField().getAnnotation(FileDef.class);
			if (fileDef == null)
				continue;

			// fileInfo
			if (!fileDef.info().isEmpty()) {
				QDataStruct infoStruct = (QDataStruct) records.get(fileDef.info().toLowerCase());
				if (infoStruct == null)
					System.err.println("Unused infoStruct" + fileDef.info());
				else {
					field.getField().setAccessible(true);
					QDataSet<?> dataSet = ((QDataSet<?>) field.getValue(callable));
					dataSet.getInfoStruct().assign(infoStruct);
					field.getField().setAccessible(false);
				}
			}

			QString externalFile = null;
			if (!fileDef.externalFile().isEmpty())
				externalFile = (QString) getFieldValue(callable, fileDef.externalFile());

			QString externalMember = null;
			if (!fileDef.externalMember().isEmpty())
				externalMember = (QString) getFieldValue(callable, fileDef.externalMember());

			if (externalFile != null) {
				if (QKSDataSet.class.isAssignableFrom(field.getClass_())) {
					QKSDataSet<?> dataSet = (QKSDataSet<?>) field.getValue(callable);
					externalFile.assign(dataSet.getFilePath());
				} else if (QSMDataSet.class.isAssignableFrom(field.getClass_())) {
					QSMDataSet<?> dataSet = (QSMDataSet<?>) field.getValue(callable);
					externalFile.assign(dataSet.getFilePath());
					externalMember.assign(dataSet.getMemberName());
				} else {
					QRRDataSet<?> dataSet = (QRRDataSet<?>) field.getValue(callable);
					externalFile.assign(dataSet.getFilePath());
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void injectDataStructures(Object callable, QDataContainer dataContainer, Map<String, QRecord> records, List<InjectableField> dataStructures, boolean based) {

		for (InjectableField field : dataStructures) {

			QDataTerm<QCompoundDataDef<?, QDataTerm<?>>> dataTerm = null;

			if (based)
				dataTerm = (QDataTerm<QCompoundDataDef<?, QDataTerm<?>>>) dataContainer.getDataTerm(field.getName());

			if (dataTerm == null)
				dataTerm = (QDataTerm<QCompoundDataDef<?, QDataTerm<?>>>) dataContainer.addDataTerm(field.getName(), field.getType(), Arrays.asList(field.getField().getAnnotations()));

			if (based) {
				if (dataTerm.getBased() == null)
					continue;
			} else {
				if (dataTerm.getBased() != null)
					continue;
			}
			
			QData data = dataContainer.getData(dataTerm);

			if (data instanceof QStroller<?>) {
				field.setValue(callable, data);
			} else {
				QDataStruct dataStruct = (QDataStruct) data;
				QCompoundDataDef<?, ?> compoundDataDef = (QCompoundDataDef<?, ?>) dataTerm.getDefinition();

				Class<? extends QRecord> primaryRecordClass = getPrimaryRecord((Class<? extends QRecord>) data.getClass());

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

				field.setValue(callable, dataStruct);
			}
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

		protected Object getValue(Object owner) {
			field.setAccessible(true);
			try {
				return field.get(owner);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				return null;
			} finally {
				field.setAccessible(false);
			}
		}

		@Override
		public String toString() {
			return "InjectableField [field=" + field + ", class_=" + class_ + ", type=" + type + ", arguments=" + Arrays.toString(arguments) + "]";
		}
	}

	private Object getFieldValue(Object owner, String externalFile) {

		String splits[] = externalFile.split("\\.");

		for (String split : splits) {

			try {
				Field externalFileField = owner.getClass().getDeclaredField(split);
				externalFileField.setAccessible(true);
				owner = externalFileField.get(owner);
				externalFileField.setAccessible(false);
			} catch (Exception e) {
				throw new OperatingSystemRuntimeException("Invalid externalFile: " + externalFile);
			}
		}

		return owner;
	}

	public static Byte convertHexToByte(String value) {
		byte[] bytes = new byte[value.length() / 2];

		for (int i = 0; i < bytes.length; i++) {
			String hex = new String(value.substring(2 * i, 2 * i + 2));
			bytes[i] = (byte) Integer.parseInt(hex, 16);
		}
		return bytes[0];
	}
}