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
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.pgm.QCallableProgram;
import org.smeup.sys.os.pgm.QProgram;
import org.smeup.sys.os.pgm.QProgramStatus;

public class BaseCallableProgramDelegator extends MinimalEObjectImpl.Container implements QCallableProgram {

	private static final long serialVersionUID = 1L;

	private QDataContext dataContext;
	private QProgram program;
	private QProgramStatus programStatus;
	private Object delegate;

	private InitStrategy initStrategy;

	private Method _open = null;
	private Method _entry = null;
	private Method _main = null;
	private Method _exit = null;

	private boolean isOpen = false;
	private QData[] entry = null;
	private QIndicator inlr = null;
	private boolean apiMode = false;

	protected BaseCallableProgramDelegator(QDataContext dataContext, QProgram program, QProgramStatus programStatus, Object delegate) {
		this.dataContext = dataContext;
		this.program = program;
		this.programStatus = programStatus;
		this.delegate = delegate;

		analyzeDelegate(delegate);
	}

	private void analyzeDelegate(Object delegate) {

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
			entry = buildEntry(_main);
			apiMode = entry != null;
		}
	}

	@Override
	public void open() {

		if (_open != null) {
			try {
				switch (initStrategy) {
				case BASE:
					_open.invoke(delegate);
					break;
				case LIGHT:
					_open.invoke(delegate);
					break;
				}
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

		try {
			Field qrpjField = delegate.getClass().getDeclaredField("qRPJ");
			qrpjField.setAccessible(true);
			Object qrpj = qrpjField.get(delegate);
			Field inlrField = qrpj.getClass().getDeclaredField("qINLR");
			inlr = (QIndicator) inlrField.get(qrpj);
			qrpjField.setAccessible(false);

		} catch (Exception e) {
		} 
		
		isOpen = true;
	}

	public QData[] call() {

		if (apiMode)
			return callAPIMode();

		try {
			if(inlr != null)
				inlr.eval(false);
			
			// @Pre Main
			if (_entry != null)
				_entry.invoke(getDelegate());

			_main.invoke(delegate);

			// @PostMain
			if (_exit != null)
				_exit.invoke(getDelegate());

			if(inlr != null && inlr.asBoolean())
				close();
				
			return getEntry();
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

	private QData[] callAPIMode() {

		try {
			// @PreMain
			if (_entry != null)
				_entry.invoke(getDelegate());

			if (getEntry() == null) {
				_main.invoke(delegate);
				return entry;
			} else {
				_main.invoke(delegate, (Object[]) getEntry());
			}

			// @PostMain
			if (_exit != null)
				_exit.invoke(getDelegate());

			return getEntry();
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

	@Override
	public void close() {
		isOpen = false;
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
	public QData[] getEntry() {
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
}