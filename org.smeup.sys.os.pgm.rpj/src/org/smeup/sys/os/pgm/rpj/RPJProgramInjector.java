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
import java.lang.reflect.Modifier;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.smeup.sys.db.esql.QCommunicationArea;
import org.smeup.sys.db.esql.QCommunicationAreaImpl;
import org.smeup.sys.db.esql.QCursor;
import org.smeup.sys.db.esql.QCursorTerm;
import org.smeup.sys.db.esql.QESqlFactory;
import org.smeup.sys.db.esql.QESqlManager;
import org.smeup.sys.db.esql.QStatement;
import org.smeup.sys.db.esql.QStatementTerm;
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
import org.smeup.sys.os.pgm.QOperatingSystemProgramFactory;
import org.smeup.sys.os.pgm.QProgram;
import org.smeup.sys.os.pgm.QProgramCallable;
import org.smeup.sys.os.pgm.QProgramInfo;
import org.smeup.sys.os.pgm.QProgramStatus;

public class RPJProgramInjector {

	public static final String NAME_OWNER = "*OWNER";

	private static final String PROGRAM_STATUS = "*pgmstatus";
	private static final String SQL_COMMUNICATION_AREA = "*sqlca";

	@Inject
	private QDataManager dataManager;
	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QFileManager fileManager;
	@Inject
	private QAccessManager esamManager;
	@Inject
	private QESqlManager esqlManager;
	@Inject
	private QJob job;

	private QActivationGroup activationGroup;
	private QDataContext dataContext;

	private QResourceReader<QFile> fileReader;
	private Map<String, RPJModule> ownerModules;

	private static boolean serializationActive = false;
	private static int globalInjectionTime = 0;
	private static int globalInjectionIOTime = 0;
	
	public RPJProgramInjector(QActivationGroup activationGroup, QDataContext dataContext) {
		this.activationGroup = activationGroup;
		this.dataContext = dataContext;
		this.ownerModules = new HashMap<String, RPJModule>();
	}

	@PostConstruct
	private void init() {
		this.fileReader = resourceManager.getResourceReader(job, QFile.class, Scope.LIBRARY_LIST);
	}

	public QDataContext getDataContext() {
		return dataContext;
	}

	@SuppressWarnings("resource")
	public <P> QProgramCallable prepareCallable(QProgram program, Class<P> klass) {

		// System.out.println("cls:\t" + klass.getSimpleName());

		QProgramCallable programCallable = null;

		QDataContainer dataContainer = dataManager.createDataContainer(dataContext);

		try {
			long startTime = System.currentTimeMillis();

			Object delegate = prepareDelegate(dataContainer, program, klass);

			// program status
			QProgramStatus programStatus = (QProgramStatus) dataContainer.getData(PROGRAM_STATUS);
			if(programStatus == null)
				programStatus = addProgramStatus(dataContainer, program);

			// memory info
			QProgramInfo programInfo = QOperatingSystemProgramFactory.eINSTANCE.createProgramInfo();
			programInfo.setMemorySize(dataContainer.getMemorySize());
			programInfo.setLoadTime(System.currentTimeMillis() - startTime);

			if (delegate instanceof RPJProgram) {
				RPJProgram rpjProgram = (RPJProgram) delegate;
				rpjProgram._init(job, dataContext, program, programInfo, programStatus);
				programCallable = rpjProgram;
			} else {
				programCallable = new RPJProgramDelegator(job, dataContext, activationGroup, program, programStatus, delegate, programInfo);
			}

			return programCallable;
		} catch (Exception e) {
			e.printStackTrace();
			throw new OperatingSystemRuntimeException(e);
		} finally {
			dataContainer.close();
		}
	}

	public Object prepareDelegate(QDataContainer dataContainer, QProgram program, Class<?> klass) {

		Object delegate = null;

		long timeIni = System.currentTimeMillis();
		long timeIOIni = timeIni;
		if (serializationActive && RPJProgram.class.isAssignableFrom(klass)) {
			delegate = dataContext.deserialize(klass, true, "injector");
		}
		long timeIOEnd = System.currentTimeMillis();
		
		try {

			QProgramStatus programStatus = addProgramStatus(dataContainer, program);

			QCommunicationArea communicationArea = addCommunicationArea(dataContainer, program);
			
			QAccessFactory accessFactory = esamManager.createFactory(job, dataContext);
			QESqlFactory sqlFactory = esqlManager.createFactory(job, dataContext, communicationArea);

			if(delegate == null) {
				
				delegate = klass.newInstance();
				
				// serializable
				if(delegate instanceof RPJProgram) {
					
					@SuppressWarnings("resource")
					RPJProgram rpjProgram = (RPJProgram)delegate;

					rpjProgram.getRecords().put(PROGRAM_STATUS, programStatus);
					rpjProgram.getRecords().put(SQL_COMMUNICATION_AREA, communicationArea);
					
					delegate = injectData(delegate, null, klass, dataContainer, accessFactory, sqlFactory, rpjProgram.getModules(), rpjProgram.getRecords());
					
					if (serializationActive) 
						dataContext.serialize(delegate, true, "injector");
				}
				else
					delegate = injectData(delegate, null, klass, dataContainer, accessFactory, sqlFactory, new HashMap<String, RPJModule>(), new HashMap<String, QRecord>());
				
			}
			// serialized
			else  {
				@SuppressWarnings("resource")
				RPJProgram rpjProgram = (RPJProgram)delegate;
				
				rpjProgram.getRecords().put(PROGRAM_STATUS, programStatus);
				rpjProgram.getRecords().put(SQL_COMMUNICATION_AREA, communicationArea);

				delegate = injectData(delegate, null, klass, dataContainer, accessFactory, sqlFactory, rpjProgram.getModules(), rpjProgram.getRecords());
			}
			
			dataContext.getContext().invoke(delegate, PostConstruct.class);
			
			long timeEnd = System.currentTimeMillis();
			globalInjectionTime += (timeEnd - timeIni);
			globalInjectionIOTime += (timeIOEnd - timeIOIni);
			if(timeEnd - timeIni > 100) {
//				System.out.println(klass.getSimpleName() + " time: " + (timeEnd - timeIni) + " IO: " + (timeIOEnd - timeIOIni));
			}
//			System.out.println("Global injection time: " + globalInjectionTime + " IO: " + globalInjectionIOTime);
			
			return delegate;
		} catch (Exception e) {
			e.printStackTrace();
			throw new OperatingSystemRuntimeException(e);
		}
	}

	private QProgramStatus addProgramStatus(QDataContainer dataContainer, QProgram program) {

		QProgramStatus programStatus = (QProgramStatus) dataContainer.getData(PROGRAM_STATUS);

		if (programStatus == null) {
			QDataTerm<?> programStatusTerm = dataContainer.addDataTerm(PROGRAM_STATUS, RPJProgramStatus.class, null);
			programStatus = (QProgramStatus) dataContainer.getData(programStatusTerm);

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
	
	private QCommunicationArea addCommunicationArea(QDataContainer dataContainer, QProgram program) {
		
		QCommunicationArea communicationArea = (QCommunicationArea) dataContainer.getData(SQL_COMMUNICATION_AREA);

		if (communicationArea == null) {
			QDataTerm<?> communicationAreaTerm = dataContainer.addDataTerm(SQL_COMMUNICATION_AREA, QCommunicationAreaImpl.class, null);
			communicationArea = (QCommunicationArea) dataContainer.getData(communicationAreaTerm);
		}

		return communicationArea;
	}
	
	public <P extends Object> P prepareProcedure(Object owner, Class<P> klass) {

		Constructor<?> constructor = null;
		QDataContainer dataContainer = null;
		try {
			constructor = klass.getDeclaredConstructor(owner.getClass());
			constructor.setAccessible(true);
			@SuppressWarnings("unchecked")
			P callable = (P) constructor.newInstance(owner);

			Map<String, RPJModule> unitModules = new HashMap<String, RPJModule>();
			Map<String, QRecord> records = new HashMap<String, QRecord>();

			dataContainer = dataManager.createDataContainer(dataContext.getContext(), callable);

			injectFields(owner, klass, callable, dataContainer, null, null, unitModules, records);

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

	private Object injectData(Object callable, Object owner, Class<?> klass, QDataContainer dataContainer, QAccessFactory accessFactory, QESqlFactory sqlFactory, Map<String, RPJModule> unitModules,
			Map<String, QRecord> records) throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		if(callable == null) 
			callable = klass.newInstance();
		
		if (owner == null)
			owner = callable;

		injectFields(owner, klass, callable, dataContainer, accessFactory, sqlFactory, unitModules, records);

		return callable;
	}

	private void injectFields(Object owner, Class<?> klass, Object callable, QDataContainer dataContainer, QAccessFactory accessFactory, QESqlFactory sqlFactory, Map<String, RPJModule> unitModules,
			Map<String, QRecord> records) throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		// recursively on superClass
		if (klass.getSuperclass().getAnnotation(Program.class) != null)
			injectFields(owner, klass.getSuperclass(), callable, dataContainer, accessFactory, sqlFactory, unitModules, records);

		List<RPJInjectableField> modules = new ArrayList<RPJInjectableField>();
		List<RPJInjectableField> datas = new ArrayList<RPJInjectableField>();
		List<RPJInjectableField> dataStructures = new ArrayList<RPJInjectableField>();
		List<RPJInjectableField> pointers = new ArrayList<RPJInjectableField>();

		List<RPJInjectableField> dataSets = new ArrayList<RPJInjectableField>();
		List<RPJInjectableField> displays = new ArrayList<RPJInjectableField>();
		List<RPJInjectableField> prints = new ArrayList<RPJInjectableField>();

		List<RPJInjectableField> statements = new ArrayList<RPJInjectableField>();
		List<RPJInjectableField> cursors = new ArrayList<RPJInjectableField>();

		for (Field field : klass.getDeclaredFields()) {

			// TODO
			if (field.getName().startsWith("$SWITCH_TABLE"))
				continue;

			if (field.getName().startsWith("this$"))
				continue;

			if (Modifier.isFinal(field.getModifiers()))
				continue;

			// Procedure lazy loading			
			if (field.getType().getAnnotation(Procedure.class) != null) {
				continue;
			}

			RPJInjectableField injectableField = RPJInjectionHelper.createInjectableField(field);

			// Module
			if (field.getType().getAnnotation(Module.class) != null) {
				modules.add(injectableField);
				continue;
			}

			// DataStruct
			if (QDataStruct.class.isAssignableFrom(injectableField.getFieldClass())) {
				if(injectableField.getValue(callable) == null) {
//					System.out.println(injectableField);
					dataStructures.add(injectableField);
				}
				continue;
			}

			// BufferedData
			if (QBufferedData.class.isAssignableFrom(injectableField.getFieldClass())) {
				if(injectableField.getValue(callable) == null) {
//					System.out.println(injectableField);
					datas.add(injectableField);
				}
				continue;
			}

			// Pointers
			if (QPointer.class.isAssignableFrom(injectableField.getFieldClass())) {
				if(injectableField.getValue(callable) == null) {
//					System.out.println(injectableField);
					pointers.add(injectableField);
				}
				continue;
			}

			// DataSet
			if (QDataSet.class.isAssignableFrom(injectableField.getFieldClass())) {
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
			// - Adapter
			// - List
			// - Structures
			if (QData.class.isAssignableFrom(injectableField.getFieldClass())) {
				datas.add(injectableField);
				continue;
			}

			// primitives
			if (injectableField.getAnnotation(DataDef.class) != null)
				RPJInjectionHelper.setPrimitiveValue(dataContext, injectableField, callable);
			// services
			else
				injectFieldValue(injectableField, callable, owner, dataContainer, accessFactory, unitModules, records);
		}

		// modules
		for (RPJInjectableField field : modules) {
			field.getField().setAccessible(true);
			RPJModule module = (RPJModule) field.getValue(callable);
			field.getField().setAccessible(false);

			injectModule(module, callable, owner, dataContainer, accessFactory, sqlFactory, unitModules, records, field);
		}

		// dataSet
		for (RPJInjectableField field : dataSets)
			injectDataSet(accessFactory, callable, dataContainer, records, field);

		// display
		for (RPJInjectableField field : displays)
			injectDisplay(callable, dataContainer, records, field);

		// print
		for (RPJInjectableField field : prints)
			injectPrint(callable, dataContainer, records, field);

		// statement
		for (RPJInjectableField field : statements)
			injectStatement(sqlFactory, callable, field);

		// cursor
		for (RPJInjectableField field : cursors)
			injectCursor(sqlFactory, callable, statements, field);

		// pointers no default
		for (RPJInjectableField field : pointers)
			RPJInjectionHelper.injectPointerNoDefault(callable, dataContainer, field);

		// dataStructure no based
		for (RPJInjectableField field : dataStructures)
			RPJInjectionHelper.injectDataStructure(callable, dataContainer, records, field, false);

		// data no based
		for (RPJInjectableField field : datas)
			RPJInjectionHelper.injectDataNoBased(callable, dataContainer, field);

		// dataSet
		Set<String> dataSetRecords = new HashSet<String>();
		for (RPJInjectableField field : dataSets) {
			QDataSet<?> dataSet = (QDataSet<?>) field.getValue(callable);
			RPJInjectionHelper.assignRecordFields(field, dataContainer, dataSetRecords, field, dataSet.get());
		}

		// display
		Set<String> displayRecords = new HashSet<String>();
		for (RPJInjectableField field : displays) {
			QDisplay<?> display = (QDisplay<?>) field.getValue(callable);
			RPJInjectionHelper.assignRecordFields(field, dataContainer, displayRecords, field, display.get());
		}

		// print
		Set<String> printRecords = new HashSet<String>();
		for (RPJInjectableField field : prints) {
			QPrint<?> print = (QPrint<?>) field.getValue(callable);
			RPJInjectionHelper.assignRecordFields(field, dataContainer, printRecords, field, print.get());
		}

		// pointer with default
		for (RPJInjectableField field : pointers)
			RPJInjectionHelper.injectPointerWithDefault(callable, dataContainer, field);

		// dataStructure based
		for (RPJInjectableField field : dataStructures)
			RPJInjectionHelper.injectDataStructure(callable, dataContainer, records, field, true);

		// data based
		for (RPJInjectableField field : datas)
			RPJInjectionHelper.injectDataBased(callable, dataContainer, field);

		// recordInfo/externalReference
		for (RPJInjectableField field : dataSets) {
			FileDef fileDef = field.getField().getAnnotation(FileDef.class);
			if (fileDef == null)
				continue;

			RPJInjectionHelper.setInfoValue(field, fileDef, callable, records);
			RPJInjectionHelper.setExternalValue(field, fileDef, callable);
		}

		for (RPJInjectableField field : displays) {
			FileDef fileDef = field.getField().getAnnotation(FileDef.class);
			if (fileDef == null)
				continue;

			RPJInjectionHelper.setInfoValue(field, fileDef, callable, records);
		}

		for (RPJInjectableField field : prints) {
			FileDef fileDef = field.getField().getAnnotation(FileDef.class);
			if (fileDef == null)
				continue;

			RPJInjectionHelper.setInfoValue(field, fileDef, callable, records);
		}
	}

	private void injectModule(RPJModule object, Object callable, Object owner, QDataContainer dataContainer, QAccessFactory accessFactory, QESqlFactory sqlFactory, Map<String, RPJModule> unitModules,
			Map<String, QRecord> records, RPJInjectableField field) throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		Module module = field.getFieldClass().getAnnotation(Module.class);

		if(module != null) {
			
			Object tempObject = null;
			switch (module.scope()) {
			case OWNER:
				tempObject = ownerModules.get(field.getFieldClass().getSimpleName());
				break;
			case UNIT:
				tempObject = unitModules.get(field.getFieldClass().getSimpleName());
				break;
			}
			
			if (tempObject != null) {
				field.setValue(callable, tempObject);
				if(module.name().equalsIgnoreCase("£MDV") || module.name().equalsIgnoreCase("£JAX"))
					object = (RPJModule) tempObject;
				else
					return;
			}
		}

		object = (RPJModule) injectData(object, owner, field.getFieldClass(), dataContainer, accessFactory, sqlFactory, unitModules, records);
		dataContext.getContext().invoke(object, PostConstruct.class);

		switch (module.scope()) {
		case OWNER:
			ownerModules.put(field.getFieldClass().getSimpleName(), object);
			break;
		case UNIT:
			unitModules.put(field.getFieldClass().getSimpleName(), object);
			break;
		}

		if (object != null)
			field.setValue(callable, object);
		else if (!Modifier.isTransient(field.getField().getModifiers()))
			System.err.println("Unexpected condition " + field.getName() + "(" + field.getFieldClass() + ")" + ": xo76sadfjhg6sagfu8h");
	}

	@SuppressWarnings("unchecked")
	private void injectDataSet(QAccessFactory accessFactory, Object callable, QDataContainer dataContainer, Map<String, QRecord> records, RPJInjectableField field) {

		boolean userOpen = false;

		FileDef fileDef = field.getField().getAnnotation(FileDef.class);
		if (fileDef != null)
			userOpen = fileDef.userOpen();

		Class<QRecord> classRecord = (Class<QRecord>) field.getArguments()[0];
		QRecord record = RPJInjectionHelper.createRecord(field, classRecord, fileDef, callable, dataContainer, records);

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

	@SuppressWarnings("unchecked")
	private void injectPrint(Object callable, QDataContainer dataContainer, Map<String, QRecord> records, RPJInjectableField field) {

		boolean userOpen = false;

		FileDef fileDef = field.getField().getAnnotation(FileDef.class);
		if (fileDef != null)
			userOpen = fileDef.userOpen();

		Class<QRecord> classRecord = (Class<QRecord>) field.getArguments()[0];
		QRecord record = RPJInjectionHelper.createRecord(field, classRecord, fileDef, callable, dataContainer, records);
		RPJInfoStruct infoStruct = dataContext.getDataFactory().createDataStruct(RPJInfoStruct.class, 0, true);
		field.setValue(callable, new RPJPrintDelegator<QRecord>(record, userOpen, infoStruct));
	}

	@SuppressWarnings("unchecked")
	private void injectDisplay(Object callable, QDataContainer dataContainer, Map<String, QRecord> records, RPJInjectableField field) {

		boolean userOpen = false;

		FileDef fileDef = field.getField().getAnnotation(FileDef.class);
		if (fileDef != null)
			userOpen = fileDef.userOpen();

		Class<QRecord> classRecord = (Class<QRecord>) field.getArguments()[0];
		QRecord record = RPJInjectionHelper.createRecord(field, classRecord, fileDef, callable, dataContainer, records);
		RPJInfoStruct infoStruct = dataContext.getDataFactory().createDataStruct(RPJInfoStruct.class, 0, true);
		field.setValue(callable, new RPJDisplayDelegator<QRecord>(record, userOpen, infoStruct));
	}

	@SuppressWarnings("resource")
	private void injectStatement(QESqlFactory sqlFactory, Object callable, RPJInjectableField field) {

		@SuppressWarnings("unused")
		QStatementTerm statementTerm = sqlFactory.createStatementTerm(field.getName(), field.getType(), Arrays.asList(field.getField().getAnnotations()));

		QStatement statement = sqlFactory.createStatement();

		field.setValue(callable, statement);
	}

	@SuppressWarnings("resource")
	private void injectCursor(QESqlFactory sqlFactory, Object callable, List<RPJInjectableField> statements, RPJInjectableField field) {

		QCursorTerm cursorTerm = sqlFactory.createCursorTerm(field.getName(), field.getType(), Arrays.asList(field.getField().getAnnotations()));

		QCursor cursor = null;

		if (cursorTerm.getSql() != null)
			cursor = sqlFactory.createCursor(cursorTerm.getCursorType(), cursorTerm.isHold(), cursorTerm.getSql());
		else {
			QStatement statement = null;

			for (RPJInjectableField statementField : statements) {
				if (statementField.getName().equalsIgnoreCase(cursorTerm.getStatementName())) {
					statement = (QStatement) statementField.getValue(callable);
					break;
				}
			}

			cursor = sqlFactory.createCursor(cursorTerm.getCursorType(), cursorTerm.isHold(), statement);
		}

		field.setValue(callable, cursor);
	}

	private void injectFieldValue(RPJInjectableField injectableField, Object callable, Object owner, QDataContainer dataContainer, QAccessFactory accessFactory, Map<String, RPJModule> unitModules,
			Map<String, QRecord> records) throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		Object object = null;

		// Job
		if (QJob.class.equals(injectableField.getFieldClass())) {
			object = job;
		}
		// Injector
		else if (RPJProgramInjector.class.equals(injectableField.getFieldClass())) {
			object = this;
		}
		// DataContext
		else if (QDataContext.class.equals(injectableField.getFieldClass())) {
			object = dataContainer.getDataContext();
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