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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;

public final class NIOListImpl<D extends QBufferedData> extends NIODataImpl implements QList<D> {

	private static final long serialVersionUID = 1L;

	private ArrayList<D> _elements;
	private D _model;
	private int _dimension;
	private QDataWriter dataWriter;

	public NIOListImpl(QDataContext dataContext) {
		super(dataContext);
		this.dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
	}

	public NIOListImpl(QDataContext dataContext, D model, int dimension) {
		this(dataContext);
		this._model = model;
		this._dimension = dimension;
		this._elements = new ArrayList<D>(_dimension);
	}
	
	@Override
	protected final QDataContext getDataContext() {		
		return _dataContext;
	}
	
	@Override
	public final void accept(QDataVisitor visitor) {

		if (visitor.visit(this)) {

			Iterator<D> datas = this.iterator();
			while (datas.hasNext())
				datas.next().accept(visitor);
		}

		visitor.endVisit(this);
	}

	@SuppressWarnings("unchecked")
	@Override
	public final D[] asArray() {

		D[] array = (D[]) Array.newInstance(_model.getClass(), _dimension);

		System.arraycopy(_elements.toArray(), 0, array, 0, _dimension);

		return array;
	}

	@Override
	public final int capacity() {
		if (count() >= _dimension)
			return count();
		else
			return _dimension;
	}

	@Override
	public final void clear() {
		_elements.clear();
	}

	@Override
	public final NIODataImpl _copyDef(QDataContext dataContext) {

		try {
			NIODataImpl copy = null;

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			oos.close();

			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			copy = (NIODataImpl) ois.readObject();
			ois.close();
			copy._dataContext = dataContext;
			return copy;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public final int count() {
		return _elements.size();
	}

	@Override
	public final void eval(QList<D> value) {

		clear();

		int i = 1;
		for (D element : value) {
			dataWriter.set(element);
			get(i).accept(dataWriter);
			i++;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public final D get(int index) {

		D element = null;
		if (_elements.size() >= index)
			element = _elements.get(index - 1);

		if (element == null) {
			element = (D) ((NIODataImpl) _model)._copyDef(getDataContext());
			_elements.add(index - 1, element);

			return element;
		} else
			return element;
	}

	@Override
	public final D get(QNumeric index) {
		return get(index.asInteger());
	}

	@Override
	public final boolean isEmpty() {

		for (D element : this)
			if (!element.isEmpty())
				return false;

		return true;
	}

	@Override
	public final Iterator<D> iterator() {
		return _elements.iterator();
	}

	@Override
	public final String toString() {

		StringBuffer sb = new StringBuffer();
		sb.append("[");

		boolean first = true;
		for (D element : this) {
			if (!first)
				sb.append(", ");
			sb.append(element.toString().trim());
			first = false;

			if (sb.length() > 1000)
				break;
		}

		sb.append("]");
		return sb.toString();
	}
}