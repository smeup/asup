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
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.db.esql.QCursor;
import org.smeup.sys.db.esql.QStatement;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Module;
import org.smeup.sys.il.data.annotation.Procedure;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.term.QDataTerm;
import org.smeup.sys.il.esam.AccessMode;
import org.smeup.sys.il.esam.QAccessFactory;
import org.smeup.sys.il.esam.QAccessManager;
import org.smeup.sys.il.esam.QDataSet;
import org.smeup.sys.il.esam.QDisplay;
import org.smeup.sys.il.esam.QKSDataSet;
import org.smeup.sys.il.esam.QPrint;
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
	private QDataContext dataContext;

	private QResourceReader<QFile> fileReader;
	private Map<String, Object> ownerModules;

	public BaseCallableInjector(QActivationGroup activationGroup, QDataContext dataContext) {
		this.activationGroup = activationGroup;
		this.dataContext = dataContext;
		this.ownerModules = new HashMap<String, Object>();
	}

	@PostConstruct
	private void init() {
		this.fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
	}

	public QDataContext getDataContext() {
		return dataContext;
	}

	public <P> QCallableProgram<P> prepareCallable(QProgram program, Class<P> klass) {

		// System.out.println("cls:\t" + klass.getSimpleName());

		QDataContainer dataContainer = dataManager.createDataContainer(dataContext);

		try {
			long startTime = System.currentTimeMillis();

			// program status
			QProgramStatus programStatus = getOrCreateProgramStatus(program, dataContainer);

			// memory info
			QProgramInfo programInfo = QOperatingSystemProgramFactory.eINSTANCE.createProgramInfo();

			P delegate = prepareDelegate(dataContainer, program, klass);

			programInfo.setMemorySize(dataContainer.getMemorySize());
			programInfo.setLoadTime(System.currentTimeMillis() - startTime);

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

		QProgramStatus programStatus = (QProgramStatus) dataContainer.getData(PROGRAM_STATUS);

		if (programStatus == null) {
			QDataTerm<?> programStatusTerm = dataContainer.addDataTerm(PROGRAM_STATUS, BaseProgramStatusImpl.class, null);
			programStatus = (QProgramStatus) dataContainer.getData(programStatusTerm);
			// programStatus.clear();

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

	private void injectFields(Object owner, Class<?> klass, Object callable, QDataContainer dataContainer, QAccessFactory accessFactory, Map<String, Object> unitModules,
			Map<String, QRecord> records) throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		// recursively on superClass
		if (klass.getSuperclass().getAnnotation(Program.class) != null)
			injectFields(owner, klass.getSuperclass(), callable, dataContainer, accessFactory, unitModules, records);

		List<BaseInjectableField> datas = new ArrayList<BaseInjectableField>();
		List<BaseInjectableField> dataStructures = new ArrayList<BaseInjectableField>();
		List<BaseInjectableField> pointers = new ArrayList<BaseInjectableField>();

		List<BaseInjectableField> dataSets = new LinkedList<BaseInjectableField>();
		List<BaseInjectableField> displays = new LinkedList<BaseInjectableField>();
		List<BaseInjectableField> prints = new LinkedList<BaseInjectableField>();

		List<BaseInjectableField> statements = new ArrayList<BaseInjectableField>();
		List<BaseInjectableField> cursors = new ArrayList<BaseInjectableField>();

		for (Field field : klass.getDeclaredFields()) {

			// TODO
			if (field.getName().startsWith("$SWITCH_TABLE"))
				continue;

			if (field.getName().startsWith("this$"))
				continue;

			if (Modifier.isFinal(field.getModifiers()))
				continue;

			if (Modifier.isStatic(field.getModifiers())) {
				if (field.get(callable) != null)
					continue;
			}

			BaseInjectableField injectableField = BaseInjectionHelper.createInjectableField(field);

			// Procedure lazy loading
			if (injectableField.getFieldClass().getAnnotation(Procedure.class) != null)
				continue;

			// DataStruct
			if (QDataStruct.class.isAssignableFrom(injectableField.getFieldClass())) {
				dataStructures.add(injectableField);
				continue;
			}

			// BufferedData
			if (QBufferedData.class.isAssignableFrom(injectableField.getFieldClass())) {
				datas.add(injectableField);
				continue;
			}

			// Pointers
			if (QPointer.class.isAssignableFrom(injectableField.getFieldClass())) {
				pointers.add(injectableField);
				continue;
			}

			// DataSet
			if (QDataSet.class.isAssignableFrom(injectableField.getFieldClass())) {
				if (injectableField.getArguments()[0] instanceof WildcardType)
					continue;
				dataSets.add(injectableField);
				continue;
			}

			// Display
			if (QDisplay.class.isAssignableFrom(injectableField.getFieldClass())) {
				if (injectableField.getArguments()[0] instanceof WildcardType)
					continue;
				displays.add(injectableField);
				continue;
			}

			// Print
			if (QPrint.class.isAssignableFrom(injectableField.getFieldClass())) {
				if (injectableField.getArguments()[0] instanceof WildcardType)
					continue;
				prints.add(injectableField);
				continue;
			}

			// Statement
			if (QStatement.class.isAssignableFrom(injectableField.getFieldClass())) {
				statements.add(injectableField);
				continue;
			}

			// Cursor
			if (QCursor.class.isAssignableFrom(injectableField.getFieldClass())) {
				cursors.add(injectableField);
				continue;
			}

			// Data
			if (QData.class.isAssignableFrom(injectableField.getFieldClass())) {
				datas.add(injectableField);
				continue;
			}

			if (injectableField.getAnnotation(DataDef.class) != null)
				BaseInjectionHelper.setPrimitiveValue(dataContext, injectableField, callable);
			else
				injectFieldValue(injectableField, callable, owner, dataContainer, accessFactory, unitModules, records);
		}

		// dataSet
		for (BaseInjectableField field : dataSets)
			injectDataSet(accessFactory, callable, dataContainer, records, field);

		// display
		for (BaseInjectableField field : displays)
			injectDisplay(callable, dataContainer, records, field);

		// print
		for (BaseInjectableField field : prints)
			injectPrint(callable, dataContainer, records, field);

		// pointers no default
		for (BaseInjectableField field : pointers)
			BaseInjectionHelper.injectPointerNoDefault(callable, dataContainer, field);

		// dataStructure no based
		for (BaseInjectableField field : dataStructures)
			BaseInjectionHelper.injectDataStructure(callable, dataContainer, records, field, false);

		// data no based
		for (BaseInjectableField field : datas)
			BaseInjectionHelper.injectDataNoBased(callable, dataContainer, field);

		// dataSet
		Set<String> dataSetRecords = new HashSet<String>();
		for (BaseInjectableField field : dataSets) {
			QDataSet<?> dataSet = (QDataSet<?>) field.getValue(callable);
			BaseInjectionHelper.assignRecordFields(field, dataContainer, dataSetRecords, field, dataSet.get());
		}
		
		// display
		Set<String> displayRecords = new HashSet<String>();
		for (BaseInjectableField field : displays) {
			QDisplay<?> display = (QDisplay<?>) field.getValue(callable);
			BaseInjectionHelper.assignRecordFields(field, dataContainer, displayRecords, field, display.get());
		}
		
		// print
		Set<String> printRecords = new HashSet<String>();
		for (BaseInjectableField field : prints) {
			QPrint<?> print = (QPrint<?>) field.getValue(callable);
			BaseInjectionHelper.assignRecordFields(field, dataContainer, printRecords, field, print.get());
		}
		
		// pointer with default
		for (BaseInjectableField field : pointers)
			BaseInjectionHelper.injectPointerWithDefault(callable, dataContainer, field);

		// dataStructure based
		for (BaseInjectableField field : dataStructures)
			BaseInjectionHelper.injectDataStructure(callable, dataContainer, records, field, true);

		// data based
		for (BaseInjectableField field : datas)
			BaseInjectionHelper.injectDataBased(callable, dataContainer, field);

		// recordInfo/externalRefernce
		for (BaseInjectableField field : dataSets) {
			FileDef fileDef = field.getField().getAnnotation(FileDef.class);
			if (fileDef == null)
				continue;

			BaseInjectionHelper.setInfoValue(field, fileDef, callable, records);
			BaseInjectionHelper.setExternalValue(field, fileDef, callable);
		}
		
		for (BaseInjectableField field : displays) {
			FileDef fileDef = field.getField().getAnnotation(FileDef.class);
			if (fileDef == null)
				continue;

			BaseInjectionHelper.setInfoValue(field, fileDef, callable, records);
		}
		
		for (BaseInjectableField field : prints) {
			FileDef fileDef = field.getField().getAnnotation(FileDef.class);
			if (fileDef == null)
				continue;

			BaseInjectionHelper.setInfoValue(field, fileDef, callable, records);
		}
	}

	@SuppressWarnings("unchecked")
	private void injectPrint(Object callable, QDataContainer dataContainer, Map<String, QRecord> records, BaseInjectableField field) {

		boolean userOpen = false;

		FileDef fileDef = field.getField().getAnnotation(FileDef.class);
		if (fileDef != null)
			userOpen = fileDef.userOpen();

		Class<QRecord> classRecord = (Class<QRecord>) field.getArguments()[0];
		QRecord record = BaseInjectionHelper.createRecord(field, classRecord, fileDef, callable, dataContainer, records);
		BaseInfoStruct infoStruct = dataContext.getDataFactory().createDataStruct(BaseInfoStruct.class, 0, true);
		field.setValue(callable, new BasePrintDelegator<QRecord>(record, userOpen, infoStruct));
	}

	@SuppressWarnings("unchecked")
	private void injectDisplay(Object callable, QDataContainer dataContainer, Map<String, QRecord> records, BaseInjectableField field) {

		boolean userOpen = false;

		FileDef fileDef = field.getField().getAnnotation(FileDef.class);
		if (fileDef != null)
			userOpen = fileDef.userOpen();

		Class<QRecord> classRecord = (Class<QRecord>) field.getArguments()[0];
		QRecord record = BaseInjectionHelper.createRecord(field, classRecord, fileDef, callable, dataContainer, records);
		BaseInfoStruct infoStruct = dataContext.getDataFactory().createDataStruct(BaseInfoStruct.class, 0, true);
		field.setValue(callable, new BaseDisplayDelegator<QRecord>(record, userOpen, infoStruct));
	}

	@SuppressWarnings("unchecked")
	private void injectDataSet(QAccessFactory accessFactory, Object callable, QDataContainer dataContainer, Map<String, QRecord> records, BaseInjectableField field) {

		boolean userOpen = false;

		FileDef fileDef = field.getField().getAnnotation(FileDef.class);
		if (fileDef != null)
			userOpen = fileDef.userOpen();

		Class<QRecord> classRecord = (Class<QRecord>) field.getArguments()[0];
		QRecord record = BaseInjectionHelper.createRecord(field, classRecord, fileDef, callable, dataContainer, records);

		QDataSet<?> dataSet = null;

		if (QKSDataSet.class.isAssignableFrom(field.getFieldClass())) {
			dataSet = accessFactory.createKeySequencedDataSet(classRecord, record, AccessMode.UPDATE, userOpen, null);
		} else if (QSMDataSet.class.isAssignableFrom(field.getFieldClass())) {
			dataSet = accessFactory.createSourceMemberDataSet(classRecord, record, AccessMode.UPDATE, userOpen, null);
		} else {
			dataSet = accessFactory.createRelativeRecordDataSet(classRecord, record, AccessMode.UPDATE, userOpen, null);
		}

		if (fileDef != null && !fileDef.name().isEmpty())
			dataSet.getFilePath().eval(fileDef.name());
		dataSet.clear();

		field.setValue(callable, dataSet);
	}


	private void injectFieldValue(BaseInjectableField injectableField, Object callable, Object owner, QDataContainer dataContainer, QAccessFactory accessFactory, Map<String, Object> unitModules,
			Map<String, QRecord> records) throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		Object object = null;

		// Job
		if (QJob.class.equals(injectableField.getFieldClass())) {
			object = job;
		}
		// Injector
		else if (BaseCallableInjector.class.equals(injectableField.getFieldClass())) {
			object = this;
		}
		// DataContext
		else if (QDataContext.class.equals(injectableField.getFieldClass())) {
			object = dataContainer.getDataContext();
		}

		// Module
		else if (injectableField.getFieldClass().getAnnotation(Module.class) != null) {
			Module module = injectableField.getFieldClass().getAnnotation(Module.class);
			switch (module.scope()) {
			case OWNER:
				object = ownerModules.get(injectableField.getFieldClass().getSimpleName());
				break;
			case UNIT:
				object = unitModules.get(injectableField.getFieldClass().getSimpleName());
				break;
			}

			if (object == null) {
				long startTime = System.currentTimeMillis();
				object = injectData(owner, injectableField.getFieldClass(), dataContainer, accessFactory, unitModules, records);
				// System.out.println("\t\t" +
				// injectableField.getClass_().getSimpleName() + "[" + new
				// DecimalFormat("00000").format(System.currentTimeMillis() -
				// startTime) + "]");

				dataContext.getContext().invoke(object, PostConstruct.class);

				switch (module.scope()) {
				case OWNER:
					ownerModules.put(injectableField.getFieldClass().getSimpleName(), object);
					break;
				case UNIT:
					unitModules.put(injectableField.getFieldClass().getSimpleName(), object);
					break;
				}
			}
		}
		// Caller
		else if (injectableField.getAnnotation(Program.class) != null && injectableField.getAnnotation(Program.class).name().equals(NAME_OWNER))
			object = owner;
		// Inject
		else if (injectableField.getAnnotation(Inject.class) != null) {
			object = dataContext.getContext().get(injectableField.getFieldClass());

			if (object == null)
				throw new OperatingSystemRuntimeException("Invalid " + injectableField);

		}

		if (object != null)
			injectableField.setValue(callable, object);
		else if (!Modifier.isTransient(injectableField.getField().getModifiers()) && !injectableField.getFieldClass().getSimpleName().endsWith("Wrapper"))
			System.err.println("Unexpected condition " + injectableField.getName() + "(" + injectableField.getFieldClass() + ")" + ": xouys547faid5trastdt");
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

}