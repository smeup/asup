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

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QData;
import org.smeup.sys.os.core.OperatingSystemRuntimeException;
import org.smeup.sys.os.pgm.QCallableProgramDelegator;
import org.smeup.sys.os.pgm.impl.CallableProgramImpl;

public class BaseCallableProgramDelegator extends CallableProgramImpl implements QCallableProgramDelegator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Object delegate;

	protected Method open;
	protected Method entry;
	protected Method close;

	private boolean isOpen;
	private boolean isStateless;

	protected BaseCallableProgramDelegator(Object delegate) {
		this.delegate = delegate;
	}

	@Override
	public void open() {

		try {
			if (this.open != null)
				this.open.invoke(delegate, (Object[]) null);
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

			try {
				Field £mubField = delegate.getClass().getDeclaredField("£mub");
				if (£mubField != null) {
					try {
						£mubField.setAccessible(true);

						Object £mub = £mubField.get(delegate);
						Object £mu_£pds_1 = £mub.getClass().getField("£mu_£pds_1").get(£mub);

						Object £pdspr = £mu_£pds_1.getClass().getField("£pdspr").get(£mu_£pds_1);
						£pdspr.getClass().getMethod("eval", Integer.TYPE).invoke(£pdspr, new Object[] { paramsLength });

					} catch (NoSuchFieldException e) {
						e.printStackTrace();
					} finally {
						£mubField.setAccessible(false);
					}
				}
			} catch (Exception e) {

			}

			Field £qpdsqqField = null;
			try {
				£qpdsqqField = delegate.getClass().getDeclaredField("£mu_£pdsqq_1");

			} catch (Exception e) {
				try {

					if (£qpdsqqField == null && delegate.getClass().getSuperclass() != null)
						try {
							£qpdsqqField = delegate.getClass().getSuperclass().getDeclaredField("£mu_£pdsqq_1");
						} catch (Exception e1) {

						}
				} catch (Exception e2) {
				}

			}

			if (£qpdsqqField != null) {
				Object £qpdsqq = £qpdsqqField.get(delegate);
				Object £qpdspr = £qpdsqq.getClass().getField("£qdspr").get(£qpdsqq);
				£qpdspr.getClass().getMethod("eval", Integer.TYPE).invoke(£qpdspr, new Object[] { paramsLength });
			}
			if (getQEntry().length > 0) {
				this.entry.invoke(delegate, (Object[]) params);
			} else
				this.entry.invoke(delegate, (Object[]) params);

			return params;
		} catch (InvocationTargetException e) {
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