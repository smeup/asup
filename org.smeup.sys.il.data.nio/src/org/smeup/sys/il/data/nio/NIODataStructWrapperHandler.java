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
import java.nio.ByteBuffer;
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
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.def.QDataDef;

public class NIODataStructWrapperHandler extends NIOAbstractDataStruct {

	private static final long serialVersionUID = 1L;

	private QDataStruct _wrapped;
	private boolean _dynamicLength;

	private List<QBufferedData> cachedElements = null;

	public NIODataStructWrapperHandler(QDataContext dataContext, int length, QDataStruct wrapped, boolean allocate) {
		super(dataContext, length);

		this._wrapped = wrapped;
		this._dynamicLength = (length == 0 ? true : false);

		QDataFactory dataFactory = getDataContext().getDataFactory();
		
		NIODataStructBuilder dataStructBuilder = new NIODataStructBuilder(dataFactory, this);
		List<Field> fields = NIODataStructHelper.getFields(wrapped.getClass());
		for (Field field : fields) {

			// create element
			QDataDef<?> dataDef = dataFactory.createDataDef(field.getGenericType(), Arrays.asList(field.getAnnotations()));
			QBufferedData dataElement = (QBufferedData) dataFactory.createData(dataDef, false);
			
			dataStructBuilder.addElement(field, dataElement);
		}
		
		if(allocate) {
			checkAllocation();
			
			_buffer = ByteBuffer.allocate(getSize());			
			NIOBufferHelper.fill(_buffer, 0, _buffer.capacity(), INIT);			
		}
	}

	@Override
	public QBufferedData getElement(String name) {

		try {
			Field field = _wrapped.getClass().getField(name);
			if (field == null)
				return null;

			return (QBufferedData) field.get(_wrapped);

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<QBufferedData> getElements() {

		if (cachedElements == null)
			synchronized (this) {
				if (cachedElements == null) {
					cachedElements = new ArrayList<>();

					try {
						for (Field field : NIODataStructHelper.getFields(_wrapped.getClass()))
							cachedElements.add((QBufferedData) field.get(_wrapped));
					} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
						e.printStackTrace();
					}

				}
			}

		return cachedElements;
	}

	protected void addElement(String name, QBufferedData element, int position) {

		if (this.cachedElements != null)
			throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: abmg8u9r7asr8v8cbx");

		try {
			Field field = _wrapped.getClass().getField(name);
			if (field == null)
				return;

			field.set(_wrapped, element);

			if (_dynamicLength)
				if (position - 1 + element.getSize() >= _length)
					_length = position - 1 + element.getSize();

		} catch (SecurityException | IllegalArgumentException | IllegalAccessException | NoSuchFieldException e) {
			e.printStackTrace();
		}

		assign(element, position);
	}

	@Override
	public List<String> getElementNames() {

		List<String> elementNames = new ArrayList<String>();

		for (Field field : NIODataStructHelper.getFields(_wrapped.getClass()))
			elementNames.add(field.getName());

		return elementNames;
	}

	@Override
	public void reset() {

		QBufferedData snapData = getDataContext().getSnap(this);
		if (snapData != null) {
			NIOBufferHelper.write(this, snapData);
			return;
		}
		
		clear();
		for (Field field : NIODataStructHelper.getFields(_wrapped.getClass())) {
			DataDef dataDef = field.getAnnotation(DataDef.class);
			if (dataDef == null)
				continue;

			try {
				Object fieldValue = field.get(_wrapped);
				QBufferedData data = (QBufferedData) fieldValue;
				QBufferedData snapElement = getDataContext().getSnap(data);
				if (snapElement != null) {
					NIOBufferHelper.write(data, snapElement);
					continue;
				}

				if (fieldValue instanceof QBufferedList) {
					QBufferedList<?> bufferedListImpl = (QBufferedList<?>) fieldValue;

					if(!dataDef.value().isEmpty()) {
						NIOBufferHelper.writeDefault(bufferedListImpl, dataDef.value());
					}
					else if(dataDef.values().length != 0) {
						NIOBufferHelper.writeDefault(bufferedListImpl, dataDef.values());
					}
					else 
						if(field.getAnnotation(Overlay.class) == null)
							bufferedListImpl.clear();
						
				} else {
						if(dataDef.value().isEmpty())
							data.clear();
						else
							NIOBufferHelper.writeDefault((QBufferedElement)data, dataDef.value());
				}

			} catch (IllegalArgumentException | IllegalAccessException e) {
				throw new IntegratedLanguageDataRuntimeException(e);
			}
		}
	}
}