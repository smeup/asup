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
package org.smeup.sys.il.data.nio;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.eclipse.emf.common.util.Enumerator;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.Special;

public class NIOEnumImpl<E extends Enum<E>, D extends QBufferedData> extends NIOBufferedDelegatorImpl implements QEnum<E, D> {

	private static final long serialVersionUID = 1L;

	private Class<E> _klass;

	public NIOEnumImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIOEnumImpl(QDataContext dataContext, Class<E> klass, QBufferedData delegate) {
		super(dataContext, delegate);
		this._klass = klass;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E asEnum() {

		// TODO encoding
		String value = new String(asBytes(), getDataContext().getCharset()).trim();

		if (Enumerator.class.isAssignableFrom(_klass)) {

			try {
				Method method = _klass.getMethod("get", String.class);
				E enumerator = (E) method.invoke(_klass, value);
				if(enumerator == null)
					enumerator = (E) method.invoke(_klass, "*OTHER");
				return enumerator;
			}
			catch(Exception e) {
				throw new IntegratedLanguageDataRuntimeException(e);
			}
		} else {
			for (Field field : _klass.getFields()) {

				Special special = field.getAnnotation(Special.class);
				if (special == null) {
					if (value.equals("*" + field.getName().toUpperCase()))
						return Enum.valueOf(_klass, field.getName());
				} else if (special.value().equals(value))
					return Enum.valueOf(_klass, field.getName());
			}
			try {
				return Enum.valueOf(_klass, "OTHER");
			} catch (Exception e) {
				return null;
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public D asData() {

		return (D) getDelegate();
	}

	@SuppressWarnings("hiding")
	@Override
	public <E extends Enum<E>> void eval(E value) {

		Field field = null;
		try {
			field = value.getClass().getField(value.name());
		} catch (NoSuchFieldException | SecurityException e) {
			throw new RuntimeException(e);
		}

		if (field == null)
			throw new RuntimeException("Unknown field " + value.name());

		Special special = field.getAnnotation(Special.class);
		if (special == null)
			throw new RuntimeException("Unknown value " + field.getName());

		eval(special.value());
	}

	@Override
	public String getSpecialName() {

		return "*" + asEnum().name();

	}

	@Override
	public void eval(String value) {

		Field field = null;
		try {
			field = value.getClass().getField(value);
		} catch (NoSuchFieldException | SecurityException e) {
			throw new RuntimeException(e);
		}

		if (field == null)
			throw new RuntimeException("Unknown field " + value);

		Special special = field.getAnnotation(Special.class);
		if (special == null)
			throw new RuntimeException("Unknown value " + field.getName());

		eval(special.value());

	}
}