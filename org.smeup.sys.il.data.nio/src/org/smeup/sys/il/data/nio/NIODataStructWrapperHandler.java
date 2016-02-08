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
import java.util.List;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStruct;

public class NIODataStructWrapperHandler extends NIOAbstractDataStruct {

	private static final long serialVersionUID = 1L;

	private QDataStruct _wrapped;
	private boolean _dynamicLength;

	private List<QBufferedData> cachedElements = null;

	public NIODataStructWrapperHandler(QDataContext dataContext) {
		super(dataContext);
	}

	public NIODataStructWrapperHandler(QDataContext dataContext, int length, QDataStruct wrapped) {
		super(dataContext, length);

		this._wrapped = wrapped;
		this._dynamicLength = (length == 0 ? true : false);
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
						for (Field field : NIOStructHelper.getFields(_wrapped.getClass()))
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
				if (position -1 + element.getSize() >= _length)
					_length = position -1 + element.getSize();

		} catch (SecurityException | IllegalArgumentException | IllegalAccessException | NoSuchFieldException e) {
			e.printStackTrace();
		}
	
		assign(element, position);
	}

	@Override
	public List<String> getElementNames() {
		
		List<String> elementNames = new ArrayList<String>();
		
		for (Field field : NIOStructHelper.getFields(_wrapped.getClass()))
			elementNames.add(field.getName());
		
		return elementNames;
	}
}