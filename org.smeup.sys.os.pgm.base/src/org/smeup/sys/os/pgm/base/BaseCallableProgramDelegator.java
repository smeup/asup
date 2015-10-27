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

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.annotation.PostConstruct;

import org.smeup.sys.il.data.InitStrategy;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.os.core.OperatingSystemMessageException;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.pgm.QCallableProgramDelegator;
import org.smeup.sys.os.pgm.impl.CallableProgramImpl;

public class BaseCallableProgramDelegator extends CallableProgramImpl implements QCallableProgramDelegator {

	private static final long serialVersionUID = 1L;

	private QDataContext dataContext;
	private Object delegate;

	protected Method open;
	protected Method entry;
	protected Method close;

	private boolean isOpen;
	private boolean isStateless;

	private InitStrategy initStrategy;

	protected BaseCallableProgramDelegator(QDataContext dataContext, Object delegate, InitStrategy initStrategy) {
		this.dataContext = dataContext;
		this.delegate = delegate;
		this.initStrategy = initStrategy;
	}

	@Override
	public void open() {

		dataContext.getContext().invoke(delegate, PostConstruct.class);
		
		Field £mubField = null;
		try {
			£mubField = delegate.getClass().getDeclaredField("£Mub");
		} catch (NoSuchFieldException | SecurityException e1) {
		}

		try {
			if (this.open == null && £mubField != null) {
				£mubField.setAccessible(true);
				Object £mub = £mubField.get(delegate);
				switch (initStrategy) {
				case BASE:
					£mub.getClass().getMethod("£mu_inzsr").invoke(£mub, (Object[]) null);
					break;
				case LIGHT:
					£mub.getClass().getMethod("£mu_inzsrlt").invoke(£mub, (Object[]) null);
					break;
				}
				£mubField.setAccessible(false);
			}
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e.getMessage());
		} finally {
			this.isOpen = true;
		}
	}

	public QData[] call() {
		try {

			QData[] params = getQEntry();

			if (params == null) {
				this.entry.invoke(delegate, new Object[0]);
				return params;
			}

			int paramsLength = 0;
			for (QData param : params) {

				if (!(param instanceof QBufferedData)) {
					paramsLength++;
					continue;
				}

				if (((QBufferedData) param).isNull())
					break;

				paramsLength++;
			}

			((BaseProgramStatus)dataContext.getInfoStruct()).params.eval(paramsLength);
	
			if (getQEntry().length > 0) {
				this.entry.invoke(delegate, (Object[]) params);
			} else
				this.entry.invoke(delegate, (Object[]) params);

			return params;
		} catch (InvocationTargetException e) {
			if(e.getTargetException() instanceof OperatingSystemMessageException)
				throw (OperatingSystemMessageException)e.getTargetException();
			else
				throw new OperatingSystemRuntimeException(e.getTargetException());
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e);
		}
	}

	@Override
	public void close() {

		try {
			if (this.close != null)
				this.close.invoke(delegate, (Object[]) null);
		} catch (Exception e) {
			throw new OperatingSystemRuntimeException(e.getMessage());
		} finally {
			this.isOpen = false;
		}
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
}