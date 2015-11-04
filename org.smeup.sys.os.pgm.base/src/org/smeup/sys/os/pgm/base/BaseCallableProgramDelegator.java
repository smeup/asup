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

import org.smeup.sys.il.data.InitStrategy;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Open;
import org.smeup.sys.il.data.annotation.PostMain;
import org.smeup.sys.il.data.annotation.PreMain;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.QDataDef;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.pgm.QCallableProgramDelegator;
import org.smeup.sys.os.pgm.impl.CallableProgramImpl;

public class BaseCallableProgramDelegator extends CallableProgramImpl implements QCallableProgramDelegator {

	private static final long serialVersionUID = 1L;

	private QDataContext dataContext;
	private Object delegate;
	private InitStrategy initStrategy;

	private Method _open = null;
	private Method _entry = null;
	private Method _main = null;
	private Method _exit = null;

	private boolean isOpen = false;
	private boolean isStateless = true;
	private QData[] entry = null;

	private boolean apiMode = false;

	protected BaseCallableProgramDelegator(QDataContext dataContext, Object delegate) {
		this.dataContext = dataContext;
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
				} 
				catch (InvocationTargetException e) {
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
			} 
			catch (InvocationTargetException e) {
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
			} 
			catch (InvocationTargetException e) {
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

		isOpen = true;
	}

	public QData[] call() {

		if (apiMode)
			return callAPIMode();

		try {
			// @PreMain
			if (_entry != null)
				_entry.invoke(getDelegate());

			if (getEntry() == null)
				((BaseProgramStatus) dataContext.getInfoStruct()).params.clear();
			else {
				int paramsLength = 0;
				for (QData param : getEntry()) {

					if (!(param instanceof QBufferedData)) {
						paramsLength++;
						continue;
					}

					if (((QBufferedData) param).isNull())
						break;

					paramsLength++;
				}
				((BaseProgramStatus) dataContext.getInfoStruct()).params.eval(paramsLength);
			}

			_main.invoke(delegate);

			// @PostMain
			if (_exit != null)
				_exit.invoke(getDelegate());

			return getEntry();
		} 
		catch (InvocationTargetException e) {
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
				((BaseProgramStatus) dataContext.getInfoStruct()).params.clear();
				// _main.invoke(delegate, new Object[0]());
				return entry;
			} else {
				int paramsLength = 0;
				for (QData param : getEntry()) {

					if (!(param instanceof QBufferedData)) {
						paramsLength++;
						continue;
					}

					if (((QBufferedData) param).isNull())
						break;

					paramsLength++;
				}
				((BaseProgramStatus) dataContext.getInfoStruct()).params.eval(paramsLength);
				_main.invoke(delegate, (Object[]) getEntry());
			}

			// @PostMain
			if (_exit != null)
				_exit.invoke(getDelegate());

			return getEntry();
		}
		catch (InvocationTargetException e) {
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

	}

	@Override
	public boolean isOpen() {
		return isOpen;
	}

	@Override
	public boolean isStateless() {
		return isStateless;
	}

	@Override
	public Object getDelegate() {
		return delegate;
	}

	@Override
	public Object getRawProgram() {
		return getDelegate();
	}

	private QData[] buildEntry(Method method) {

		Type[] types = method.getGenericParameterTypes();
		if(types.length == 0)
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
}