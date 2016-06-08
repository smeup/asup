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

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.smeup.sys.il.data.InitStrategy;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Open;
import org.smeup.sys.il.data.annotation.PostMain;
import org.smeup.sys.il.data.annotation.PreMain;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Snap;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobRunInfo;
import org.smeup.sys.os.pgm.QActivationGroup;
import org.smeup.sys.os.pgm.QProgramCallable;
import org.smeup.sys.os.pgm.QProgram;
import org.smeup.sys.os.pgm.QProgramInfo;
import org.smeup.sys.os.pgm.QProgramStatus;
import org.smeup.sys.os.pgm.impl.ProgramCallableImpl;

public class RPJProgramDelegator extends ProgramCallableImpl {

	private static final long serialVersionUID = 1L;

	private QJob job;

	private QDataContext dataContext;
	private QProgram program;
	private QProgramStatus programStatus;
	private Object delegate;

	private InitStrategy initStrategy;

	private Method _open = null;
	private Method _snap = null;
	private Method _entry = null;
	private Method _main = null;
	private Method _exit = null;

	private boolean isOpen = false;
	private QData[] entry = null;
	private QIndicator inlr = null;
	private boolean apiMode = false;

	private QProgramInfo programInfo = null;

	protected RPJProgramDelegator(QJob job, QDataContext dataContext, QActivationGroup activationGroup, QProgram program, QProgramStatus programStatus, Object delegate, QProgramInfo programInfo) {
		this.job = job;
		this.dataContext = dataContext;
		this.program = program;
		this.programStatus = programStatus;
		this.delegate = delegate;
		this.programInfo = programInfo;
		
		setActivationGroup(activationGroup);
		
		analyzeDelegate();
	}

	private void analyzeDelegate() {

		Class<?> klass = delegate.getClass();

		initStrategy = InitStrategy.BASE;
		Program programAnnotation = klass.getAnnotation(Program.class);
		if (programAnnotation != null)
			initStrategy = programAnnotation.initStrategy();

		for (Method method : klass.getMethods()) {
			if (method.isAnnotationPresent(Open.class)) {
				_open = method;
			} else if (method.isAnnotationPresent(PreMain.class)) {
				_entry = method;
			} else if (method.isAnnotationPresent(Main.class)) {
				_main = method;
			} else if (method.isAnnotationPresent(Snap.class)) {
				_snap = method;
			} else if (method.isAnnotationPresent(PostMain.class)) {
				_exit = method;
			} else if (method.isAnnotationPresent(Entry.class)) {
				try {
					entry = (QData[]) method.invoke(delegate);
				} catch (InvocationTargetException e) {
					if (e.getTargetException() instanceof OperatingSystemMessageException)
						throw (OperatingSystemMessageException) e.getTargetException();
					if (e.getTargetException() instanceof OperatingSystemRuntimeException)
						throw (OperatingSystemRuntimeException) e.getTargetException();
					else
						throw new OperatingSystemRuntimeException(e.getTargetException());
				} catch (Exception e) {
					throw new OperatingSystemRuntimeException(e);
				}
			}
		}

		// try API mode
		if (entry == null) {
			if (_main != null)
				entry = buildEntry(_main);
			apiMode = entry != null;
		}
		
		//
		try {
			Field qrpjField = delegate.getClass().getDeclaredField("qRPJ");
			if(qrpjField != null) {
				qrpjField.setAccessible(true);
				Object qrpj = qrpjField.get(delegate);
				Field inlrField = qrpj.getClass().getDeclaredField("qINLR");
				inlr = (QIndicator) inlrField.get(qrpj);
				qrpjField.setAccessible(false);
			}

		} catch (Exception e) {
		}
	}

	public QData[] call() {
		// open
		if (!isOpen())
			open();

		if (apiMode)
			callAPIMode();
		else
			callProgramMode();

		return getParameters();
	}

	private void callAPIMode() {

		try {
			// @PreMain
			if (_entry != null)
				_entry.invoke(getDelegate());

			if (getParameters() == null) {
				_main.invoke(delegate);
			} else {
				_main.invoke(delegate, (Object[]) getParameters());
			}

			// @PostMain
			if (_exit != null)
				_exit.invoke(getDelegate());

		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof OperatingSystemMessageException)
				throw (OperatingSystemMessageException) e.getTargetException();
			if (e.getTargetException() instanceof OperatingSystemRuntimeException)
				throw (OperatingSystemRuntimeException) e.getTargetException();
			else
				throw new OperatingSystemRuntimeException(e.getTargetException());
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	private void callProgramMode() {

		try {
			if (inlr != null)
				inlr.eval(false);

			// @Pre Main
			if (_entry != null)
				_entry.invoke(getDelegate());

			_main.invoke(delegate);

			// @PostMain
			if (_exit != null)
				_exit.invoke(getDelegate());

			if (inlr != null && inlr.asBoolean())
				close();

		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof OperatingSystemMessageException)
				throw (OperatingSystemMessageException) e.getTargetException();
			if (e.getTargetException() instanceof OperatingSystemRuntimeException)
				throw (OperatingSystemRuntimeException) e.getTargetException();
			else
				throw new OperatingSystemRuntimeException(e.getTargetException());
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	private void open() {

		if (_open != null) {
			try {
				switch (initStrategy) {
				case BASE:
				case LIGHT:
					_open.invoke(delegate);
					break;
				}
			} catch (InvocationTargetException e) {
				if (e.getTargetException() instanceof OperatingSystemMessageException)
					throw (OperatingSystemMessageException) e.getTargetException();

				if (e.getTargetException() instanceof OperatingSystemRuntimeException)
					throw (OperatingSystemRuntimeException) e.getTargetException();

				throw new OperatingSystemRuntimeException(e.getTargetException());
			} catch (Exception e) {
				throw new OperatingSystemRuntimeException(e);
			}

		} else {

			try {
				Field £mubField = delegate.getClass().getDeclaredField("£Mub");
				£mubField.setAccessible(true);
				Object £mub = £mubField.get(delegate);
				switch (initStrategy) {
				case BASE:
					£mub.getClass().getMethod("£mu_inzsr").invoke(£mub);
					break;
				case LIGHT:
					£mub.getClass().getMethod("£mu_inzsrlt").invoke(£mub);
					break;
				}
				£mubField.setAccessible(false);

			} catch (NoSuchFieldException | SecurityException | NoSuchMethodException e) {
			} catch (InvocationTargetException e) {
				if (e.getTargetException() instanceof OperatingSystemMessageException)
					throw (OperatingSystemMessageException) e.getTargetException();
				if (e.getTargetException() instanceof OperatingSystemRuntimeException)
					throw (OperatingSystemRuntimeException) e.getTargetException();
				else
					throw new OperatingSystemRuntimeException(e.getTargetException());
			} catch (Exception e) {
				throw new OperatingSystemRuntimeException(e);
			}
		}

		// take a snapshot
		if (_snap != null) {
			try {
				switch (initStrategy) {
				case BASE:
				case LIGHT:
					_snap.invoke(delegate);

					break;
				}
			} catch (InvocationTargetException e) {
				if (e.getTargetException() instanceof OperatingSystemMessageException)
					throw (OperatingSystemMessageException) e.getTargetException();

				if (e.getTargetException() instanceof OperatingSystemRuntimeException)
					throw (OperatingSystemRuntimeException) e.getTargetException();

				throw new OperatingSystemRuntimeException(e.getTargetException());
			} catch (Exception e) {
				throw new OperatingSystemRuntimeException(e);
			}
		}


		isOpen = true;
	}

	@Override
	public void close() {

		try {
			QJobRunInfo jobRunInfo = job.getJobRunInfo();
			if (jobRunInfo != null)
				jobRunInfo.setMemorySize(jobRunInfo.getMemorySize() - programInfo.getMemorySize());
	
			QActivationGroup currentActivationGroup = getActivationGroup();
			setActivationGroup(null);
			
			if(currentActivationGroup != null && program.getActivationGroup().equals("*NEW")) {
				for(QProgramCallable callableProgram: new ArrayList<QProgramCallable>(currentActivationGroup.getPrograms()))
					callableProgram.close();
			}
		}
		finally {
			isOpen = false;
			delegate = null;
		}
	}

	@Override
	public boolean isOpen() {
		return isOpen;
	}

	public Object getDelegate() {
		return delegate;
	}

	@Override
	public Object getRawProgram() {
		return getDelegate();
	}

	private QData[] buildEntry(Method method) {

		Type[] types = method.getGenericParameterTypes();
		if (types.length == 0)
			return null;

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

			QDataDef<?> dataType = dataContext.getDataFactory().createDataDef(type, annotationsList);
			QData data = dataContext.getDataFactory().createData(dataType, false);

			entry[entryIndex] = data;
			entryIndex++;
		}

		return entry;
	}

	@Override
	public QData[] getParameters() {
		return entry;
	}

	@Override
	public QDataContext getDataContext() {
		return dataContext;
	}

	@Override
	public QProgram getProgram() {
		return program;
	}

	@Override
	public QProgramStatus getProgramStatus() {
		return this.programStatus;
	}

	@Override
	public QProgramInfo getProgramInfo() {
		return this.programInfo;
	}
}