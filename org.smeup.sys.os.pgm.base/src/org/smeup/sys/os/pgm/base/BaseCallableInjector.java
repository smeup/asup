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
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataManager;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QRecord;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.il.esam.AccessMode;
import org.smeup.sys.il.esam.QAccessFactory;
import org.smeup.sys.il.esam.QAccessManager;
import org.smeup.sys.il.esam.QDataSet;
import org.smeup.sys.il.esam.QKSDataSet;
import org.smeup.sys.il.esam.QSMDataSet;
import org.smeup.sys.il.esam.annotation.FileDef;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.pgm.QActivationGroup;
import org.smeup.sys.os.pgm.rpj.RPJProgramSupport.Specials;

public class BaseCallableInjector {

	@Inject
	private QDataManager dataManager;
	@Inject
	private QAccessManager esamManager;
	@Inject
	private QJob job;

	private QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();

	public <C> C makeCallable(QContext context, QActivationGroup activationGroup, Class<C> klass) {

		QDataFactory dataFactory = dataManager.createFactory(job.getContext());

		C callable = null;

		try {
			Map<String, Object> sharedModules = new HashMap<>();
			try {
				callable = injectData(klass, dataFactory, context, activationGroup, sharedModules);
			} catch (IllegalArgumentException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InstantiationException | IllegalAccessException e) {
			throw new OperatingSystemRuntimeException(e);
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

	private <C> C injectData(Class<C> klass, QDataFactory dataFactory, QContext context, QActivationGroup activationGroup, Map<String, Object> sharedModules) throws IllegalArgumentException,
			IllegalAccessException, InstantiationException {

//		if (klass.getAnnotation(Program.class) != null)
//			System.out.println(klass);

		C callable = klass.newInstance();

		injectFieldsData(klass, callable, dataFactory, context, activationGroup, sharedModules);

		try {
			Field £mubField = callable.getClass().getDeclaredField("£mub");
			if (£mubField != null) {
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

		} catch (NoSuchFieldException | SecurityException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
		}

		if (callable.getClass().getAnnotation(Program.class) == null)
			return callable;

		context.invoke(callable, PostConstruct.class);

		return callable;
	}

	@SuppressWarnings("unchecked")
	private void injectFieldsData(Class<?> klass, Object callable, QDataFactory dataFactory, QContext context, QActivationGroup activationGroup, Map<String, Object> sharedModules)
			throws IllegalArgumentException, IllegalAccessException, InstantiationException {

		if(klass.getSuperclass().getAnnotation(Program.class) != null)
			injectFieldsData(klass.getSuperclass(), callable, dataFactory, context, activationGroup, sharedModules);
			

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

			field.setAccessible(true);

			
//			if(field.getName().equals("qaambtb"))
//				System.out.println("\t\t"+field);
			
			Type type = field.getGenericType();

			Class<?> fieldKlass = null;

			if (type instanceof ParameterizedType) {
				fieldKlass = (Class<?>) ((ParameterizedType) type).getRawType();
			} else
				fieldKlass = (Class<?>) type;

			if (QDataFactory.class.isAssignableFrom(fieldKlass)) {
				field.set(callable, dataFactory);
			}
			// Module
			/*
			 * else if (field.getAnnotation(ModuleDef.class) != null) {
			 * ModuleDef moduleDef = field.getAnnotation(ModuleDef.class);
			 * Object callableModule = sharedModules.get(moduleDef.name()); if
			 * (callableModule == null) { callableModule =
			 * injectData(fieldKlass, dataFactory, job, activationGroup,
			 * sharedModules); sharedModules.put(moduleDef.name(),
			 * callableModule); } field.set(callable, callableModule); }
			 */
			// DataSet
			else if (QDataSet.class.isAssignableFrom(fieldKlass)) {

				ParameterizedType pType = (ParameterizedType) type;
				if (!(pType.getActualTypeArguments()[0] instanceof WildcardType))
					injectDataSet(job, dataFactory, callable, (Class<QDataSet<QRecord>>) fieldKlass, (Class<QRecord>) pType.getActualTypeArguments()[0], field);
			}
			// Data
			else if (QData.class.isAssignableFrom(fieldKlass)) {

				
				QDataDef<?> dataType = dataFactory.createDataDef(type, Arrays.asList(field.getAnnotations()));
				QData data = dataFactory.createData(dataType, true);

				DataDef dataDef = field.getAnnotation(DataDef.class);

				if (dataDef != null) {

					// default
					if (data instanceof QList<?>) {
						QList<?> array = (QList<?>) data;
						int i = 1;
						for (String value : dataDef.values()) {
							array.get(i).accept(dataWriter.set(value));
							i++;
						}
					} else {
						if (!dataDef.value().isEmpty()) {
							if (data instanceof QString) {

								String value = dataDef.value();
								if (value.startsWith("'") && value.endsWith("'")) {
									value = value.substring(1).substring(0, value.lastIndexOf("'") - 1);

									data.accept(dataWriter.set(value));
								} else if (value.startsWith("*")) {
									try {
										Specials special = Specials.valueOf(value.substring(1));
										data.accept(dataWriter.set(special));
									} catch (Exception e) {
										data.accept(dataWriter.set(value));
									}
								} else
									data.accept(dataWriter.set(value));
							} else {
								data.accept(dataWriter.set(dataDef.value()));
							}
						}
					}

				}

				field.set(callable, data);
			}
			// @Injection
			else if (field.getAnnotation(Inject.class) != null) {

				Object object = null;

				if (QJob.class.isAssignableFrom(fieldKlass)) {
					object = job;
				} 
				else {
					object = sharedModules.get(fieldKlass.getSimpleName());
					if (object == null) {
						object = context.get(fieldKlass);
					}
					if (object == null) {
//						System.out.println("\t" + fieldKlass);
						object = injectData(fieldKlass, dataFactory, context, activationGroup, sharedModules);
						sharedModules.put(fieldKlass.getSimpleName(), object);
					}
				}

				if (object == null) {
					field.setAccessible(false);
					throw new OperatingSystemRuntimeException("Unknown field type: " + type);
				} else
					field.set(callable, object);
			}

			field.setAccessible(false);
		}

	}

	private void injectDataSet(QJob job, QDataFactory dataFactory, Object callable, Class<QDataSet<QRecord>> fieldKlass, Class<QRecord> recordKlass, Field field) throws IllegalArgumentException,
			IllegalAccessException {

		QAccessFactory esamFactory = job.getContext().get(QAccessFactory.class);
		if (esamFactory == null) {
			esamFactory = esamManager.createFactory(job);
			job.getContext().set(QAccessFactory.class, esamFactory);
		}

		FileDef fileDef = field.getAnnotation(FileDef.class);
		if (fileDef != null) {

			QDataSet<QRecord> dataSet = null;

			if (QKSDataSet.class.isAssignableFrom(fieldKlass)) {
				dataSet = esamFactory.createKeySequencedDataSet(recordKlass, AccessMode.UPDATE, fileDef.userOpen());
			} else if (QSMDataSet.class.isAssignableFrom(fieldKlass)) {
				dataSet = esamFactory.createSourceMemberDataSet(recordKlass, AccessMode.UPDATE, fileDef.userOpen());
			} else {
				dataSet = esamFactory.createRelativeRecordDataSet(recordKlass, AccessMode.UPDATE, fileDef.userOpen());
			}

			field.set(callable, dataSet);
		}

	}
	
}