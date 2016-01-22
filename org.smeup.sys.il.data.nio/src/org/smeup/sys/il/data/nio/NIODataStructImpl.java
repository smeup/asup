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

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;

public class NIODataStructImpl extends NIOAbstractDataStruct {

	private static final long serialVersionUID = 1L;

	private Map<String, QBufferedData> _elements;
	private boolean _dynamicLength;

	public NIODataStructImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIODataStructImpl(QDataContext dataContext, int length) {
		super(dataContext, length);

		this._elements = new LinkedHashMap<String, QBufferedData>();
		this._dynamicLength = (length == 0 ? true : false);
	}

	@Override
	public QBufferedData getElement(String name) {
		return _elements.get(name);
	}

	protected void addElement(String name, QBufferedData element, int position) {

		// virtual name '/n'
		if (name == null) {
			System.err.println("Unexpected condition: 61n67v8sh2756nv56");
			name = "/" + _elements.size() + 1;
		}

		this._elements.put(name, element);

		if (_dynamicLength)
			if (position -1 + element.getSize() >= _length)
				_length = position - 1 + element.getSize();
		
		assign(element, position);
	}

	@Override
	public List<QBufferedData> getElements() {
		return new ArrayList<QBufferedData>(_elements.values());
	}

	@Override
	public List<String> getElementNames() {
		return new ArrayList<String>(_elements.keySet());
	}
}