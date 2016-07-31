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

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFactory;
import org.smeup.sys.il.data.def.QBufferedDataDef;
import org.smeup.sys.il.data.term.QDataTerm;

public final class NIODataStructImpl extends NIOAbstractDataStruct {

	private static final long serialVersionUID = 1L;

	private final Map<String, QBufferedData> _elements;
	private final boolean _dynamicLength;

	public NIODataStructImpl(final QDataContext dataContext, final int length, final List<QDataTerm<QBufferedDataDef<?>>> dataTerms, final boolean allocate) {
		super(dataContext, length);

		this._elements = new ElementMap();
		this._dynamicLength = (length == 0 ? true : false);

		final QDataFactory dataFactory = getDataContext().getDataFactory();

		final NIODataStructBuilder dataStructBuilder = new NIODataStructBuilder(dataFactory, this);
		for (final QDataTerm<?> dataTerm : dataTerms) {
			final QBufferedData dataElement = (QBufferedData) dataFactory.createData(dataTerm, false);
			dataStructBuilder.addElement(dataTerm, dataElement);
		}

		if (allocate)
			_allocate();
	}

	@Override
	public final QBufferedData getElement(final String name) {
		return _elements.get(name);
	}

	protected final void addElement(String name, final QBufferedData element, final int position) {

		// virtual name '/n'
		if (name == null) {
			System.err.println("Unexpected condition: 61n67v8sh2756nv56");
			name = "/" + _elements.size() + 1;
		}

		this._elements.put(name, element);

		if (_dynamicLength)
			if (position - 1 + element.getSize() > _length)
				_length = position - 1 + element.getSize();

		slice(element, position);
	}

	@Override
	public final List<QBufferedData> getElements() {
		return new ArrayList<QBufferedData>(_elements.values());
	}

	@Override
	public final List<String> getElementNames() {
		return new ArrayList<String>(_elements.keySet());
	}

	@Override
	public final void reset() {

		final QBufferedData snapData = getDataContext().getSnap(this);
		if (snapData != null)
			NIOBufferHelper.write(this, snapData);
		else {
			clear();
			for (final QBufferedData element : getElements())
				element.reset();
		}
	}

	public final class ElementMap extends LinkedHashMap<String, QBufferedData> {

		private static final long serialVersionUID = 1L;

		@Override
		public QBufferedData get(final Object key) {
			return super.get(key.toString().toLowerCase());
		}

		@Override
		public QBufferedData put(final String key, final QBufferedData value) {
			return super.put(key.toLowerCase(), value);
		}
	}

}