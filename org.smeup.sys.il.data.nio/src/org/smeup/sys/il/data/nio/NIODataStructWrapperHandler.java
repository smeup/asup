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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QBufferedList;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QStorable;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.def.QDataDef;

public final class NIODataStructWrapperHandler extends NIOAbstractDataStruct {

	private static final long serialVersionUID = 1L;

	protected QDataStruct _wrapped;
	private final boolean _dynamicLength;

	private List<QBufferedData> cachedElements = null;

	public NIODataStructWrapperHandler(final QDataContext dataContext, final int length, final QDataStruct wrapped, final boolean allocate) {
		super(dataContext, length);

		this._wrapped = wrapped;
		this._dynamicLength = (length == 0 ? true : false);

		final QDataFactory dataFactory = getDataContext().getDataFactory();
		final NIODataStructBuilder dataStructBuilder = new NIODataStructBuilder(dataFactory, this);
		final List<Field> fields = NIODataStructHelper.getFields(wrapped.getClass());
		for (final Field field : fields) {
			final QDataDef<?> dataDef = dataFactory.createDataDef(field.getGenericType(), Arrays.asList(field.getAnnotations()));
			final QBufferedData dataElement = (QBufferedData) dataFactory.createData(dataDef, false);
			dataStructBuilder.addElement(field, dataElement);
		}

		if (allocate)
			_allocate();
	}

	@Override
	public final QBufferedData getElement(final String name) {

		try {
			final Field field = _wrapped.getClass().getField(name);
			if (field == null)
				return null;

			return (QBufferedData) field.get(_wrapped);

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public final List<QBufferedData> getElements() {

		if (cachedElements == null)
			synchronized (this) {
				if (cachedElements == null) {
					cachedElements = new ArrayList<>();

					try {
						for (final Field field : NIODataStructHelper.getFields(_wrapped.getClass()))
							cachedElements.add((QBufferedData) field.get(_wrapped));
					} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
						e.printStackTrace();
					}

				}
			}

		return cachedElements;
	}

	protected final void addElement(final String name, final QBufferedData element, final int position) {

		if (this.cachedElements != null)
			throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: abmg8u9r7asr8v8cbx");

		try {
			final Field field = _wrapped.getClass().getField(name);
			if (field == null)
				return;

			field.set(_wrapped, element);

			if (_dynamicLength)
				if (position - 1 + element.getSize() > _maxLength)
					_maxLength = position - 1 + element.getSize();

		} catch (SecurityException | IllegalArgumentException | IllegalAccessException | NoSuchFieldException e) {
			e.printStackTrace();
		}

		slice(element, position);
	}

	@Override
	public final List<String> getElementNames() {

		final List<String> elementNames = new ArrayList<String>();

		for (final Field field : NIODataStructHelper.getFields(_wrapped.getClass()))
			elementNames.add(field.getName());

		return elementNames;
	}
	

	@Override
	public final void reset() {

		if (_reset != null) {
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), _reset);
			return;
		}

//		clear();
		NIOBufferHelper.fill(getBuffer(), getPosition(), getSize(), INIT);
		for (final Field field : NIODataStructHelper.getFields(_wrapped.getClass())) {
			final DataDef dataDef = field.getAnnotation(DataDef.class);
			if (dataDef == null)
				continue;

			try {
				final Object fieldValue = field.get(_wrapped);
				final NIOBufferedDataImpl data = NIOBufferHelper.getNIOBufferedDataImpl((QStorable) fieldValue);
				if (data._reset != null) {
					NIOBufferHelper.movel(data.getBuffer(), data.getPosition(), data.getSize(), _reset);
					continue;
				}

				if (fieldValue instanceof QBufferedList) {
					final QBufferedList<?> bufferedListImpl = (QBufferedList<?>) fieldValue;

					if (!dataDef.value().isEmpty())
						NIOBufferHelper.writeDefault(bufferedListImpl, dataDef.value());
					else if (dataDef.values().length != 0)
						NIOBufferHelper.writeDefault(bufferedListImpl, dataDef.values());
					else if (field.getAnnotation(Overlay.class) == null)
						bufferedListImpl.clear();

				} else if (dataDef.value().isEmpty())
					data.clear();
				else
					NIOBufferHelper.writeDefault((QBufferedElement) data, dataDef.value());

			} catch (IllegalArgumentException | IllegalAccessException e) {
				throw new IntegratedLanguageDataRuntimeException(e);
			}
		}
	}
}