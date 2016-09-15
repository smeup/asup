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
package org.smeup.sys.il.data.nio;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Date;

import org.eclipse.emf.common.util.Enumerator;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.annotation.Special;

public final class NIOEnumImpl<E extends Enum<E>, D extends QBufferedElement> extends NIOBufferedElementDelegatorImpl implements QEnum<E, D> {

	private static final long serialVersionUID = 1L;

	private Class<E> _klass;

	public NIOEnumImpl(final QDataContext dataContext) {
		super(dataContext);
	}

	public NIOEnumImpl(final QDataContext dataContext, final Class<E> klass, final QBufferedElement delegate) {
		super(dataContext, delegate);
		this._klass = klass;
	}

	@SuppressWarnings("unchecked")
	@Override
	public final E asEnum() {

		// TODO encoding
		Object value = null;
		switch (getDelegate().getBufferedElementType()) {
		case DATETIME:
			value = ((QDatetime)getDelegate()).asDate();
			break;
		case NUMERIC:
			value = ((QNumeric)getDelegate()).asNumber();
			break;
		case STRING:
			value = ((QString)getDelegate()).asString();
			break;
		}

		if (Enumerator.class.isAssignableFrom(_klass))
			try {
				final Method method = _klass.getMethod("get", String.class);
				E enumerator = (E) method.invoke(_klass, value.toString().trim());
				if (enumerator == null)
					enumerator = (E) method.invoke(_klass, "*OTHER");
				return enumerator;
			} catch (final Exception e) {
				throw new IntegratedLanguageDataRuntimeException(e);
			}
		else {
			for (final Field field : _klass.getFields()) {

				final Special special = field.getAnnotation(Special.class);
				if (special == null) {
					if (value.toString().trim().equals("*" + field.getName().toUpperCase()))
						return Enum.valueOf(_klass, field.getName());
				} else {
					
					switch (getDelegate().getBufferedElementType()) {
					case DATETIME:
						if(((QDatetime)getDelegate()).eq(Date.valueOf(special.value())))
							return Enum.valueOf(_klass, field.getName());
						break;
					case NUMERIC:
						if(((QNumeric)getDelegate()).eq(new Double(special.value())))
							return Enum.valueOf(_klass, field.getName());
						break;
					case STRING:
						if(((QString)getDelegate()).eq(special.value()))
							return Enum.valueOf(_klass, field.getName());
						break;
					}
				}					
			}
			
			try {
				return Enum.valueOf(_klass, "OTHER");
			} catch (final Exception e) {
				return null;
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public final D asData() {
		return (D) getDelegate();
	}

	@Override
	public final QBufferedData eval(final DataSpecial value) {
		asData().eval(value);
		return this;
	}

	@Override
	public final String getSpecialName() {
		return "*" + asEnum().name();
	}

	@Override
	public final void eval(final E value) {

		try {
			final Field field = _klass.getField(value.name());
			if (field == null)
				throw new IntegratedLanguageDataRuntimeException("Invalid special " + value + " for enum " + _klass);

			final Special special = field.getAnnotation(Special.class);
			String valueString = null;
			if (special == null)
				valueString = value.name();
			else if (special.value().isEmpty())
				valueString = value.name();
			else
				valueString = special.value();

			final QBufferedElement element = asData();
			switch (element.getBufferedElementType()) {
			case DATETIME:
				element.movel(valueString, true);
				break;
			case NUMERIC:
				((QNumeric) element).eval(new BigDecimal(valueString));
				break;
			case STRING:
				((QString) element).eval(valueString);
				break;
			}

		} catch (final Exception e) {
			throw new IntegratedLanguageDataRuntimeException(e);
		}
	}
	
	@Override
	protected final NIODataImpl _copyDef(final QDataContext dataContext) {

		QBufferedElement tempDelegate = null;
		if (getDelegate() != null)
			tempDelegate = (QBufferedElement) NIOBufferHelper.getNIOBufferedElementImpl(getDelegate())._copyDef(dataContext);

		NIOEnumImpl<E, D> copy = new NIOEnumImpl<E, D>(dataContext, _klass, tempDelegate);
		
		return copy;
	}
}