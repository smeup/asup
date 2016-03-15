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

import java.util.Iterator;

import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QBufferedList;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.DecimalType;

public abstract class NIOBufferedListImpl<D extends QBufferedElement> extends NIOBufferedDataImpl implements QBufferedList<D> {

	private static final long serialVersionUID = 1L;
	private NIOBufferedListImpl<?> listOwner;	
	private QDataWriter dataWriter;
	private D _model;

	public NIOBufferedListImpl(QDataContext dataContext) {
		super(dataContext);
		this.dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
	}

	public NIOBufferedListImpl(QDataContext dataContext, D model) {
		this(dataContext);
		this._model = model;
	}

	@Override
	public QBufferedData eval(DataSpecial value) {
		for (D element : this)
			element.eval(value);
		
		return this;
	}

	@Override
	public final void eval(Number value) {
		for (D element : this)
			((QNumeric) element).eval(value);
	}

	@Override
	public QBufferedData eval(QDataFiller value) {
		for(D element: this)
			element.eval(value);

		return this;
	}

	@Override
	public final void eval(QList<D> value) {

		int capacity = capacity();
		if (value.capacity() < capacity)
			capacity = value.capacity();

		for (int e = 1; e <= capacity; e++) {
			dataWriter.set(value.get(e));
			get(e).accept(dataWriter);
		}

		for (int e = capacity + 1; e <= capacity(); e++)
			get(e).clear();
	}

	@Override
	public final void eval(QNumeric value) {
		for (D element : this)
			((QNumeric) element).eval(value);
	}

	@Override
	public final void eval(QString value) {
		for (D element : this)
			((QString) element).eval(value);
	}

	@Override
	public final void eval(String value) {
		for (D element : this)
			((QString) element).eval(value);
	}

	@Override
	public final D get(QNumeric index) {
		return get(index.asInteger());
	}
		
	@Override
	protected final byte getFiller() {
		return ((NIOBufferedDataImpl) getModel()).getFiller();
	}
	
	@Override
	public final int getLength() {
		return capacity() * getModel().getLength();
	}

	protected final NIOBufferedListImpl<?> getListOwner() {
		return this.listOwner;
	}

	protected final D getModel() {
		return _model;
	}

	@Override
	public final int getSize() {
		return capacity() * getModel().getSize();
	}

	@Override
	public final boolean isEmpty() {

		byte[] emptyElement = null;
		for (D element : this) {

			if (emptyElement != null) {
				if (NIOBufferHelper.compareBytes(element, emptyElement) == 0)
					continue;
				else
					return false;
			}

			if (!element.isEmpty())
				return false;

			emptyElement = element.asBytes();
		}

		return true;
	}

	@Override
	public final Iterator<D> iterator() {
		return new NIOListIteratorImpl<D>(this);
	}

	@Override
	public void move(DataSpecial value) {
		move(value, false);
	}

	@Override
	public void move(DataSpecial value, boolean clear) {
		for(D element: this)
			element.move(value, clear);		
	}

	@Override
	public void move(Number value) {
		move(value, false);
	}

	@Override
	public void move(Number value, boolean clear) {
		for(D element: this)
			element.move(value, clear);
	}

	@Override
	public void move(QBufferedElement value) {
		move(value, false);
	}

	@Override
	public void move(QBufferedElement value, boolean clear) {
		for(D element: this)
			element.move(value, clear);
	}

	@Override
	public void move(QDataFiller value) {
		move(value, false);
	}

	@Override
	public void move(QDataFiller value, boolean clear) {
		for(D element: this)
			element.move(value, clear);
	}

	@Override
	public void move(String value) {
		move(value, false);
	}

	@Override
	public void move(String value, boolean clear) {
		for(D element: this)
			element.move(value, clear);
	}

	@Override
	public void movel(DataSpecial value) {
		movel(value, false);
	}

	@Override
	public void movel(DataSpecial value, boolean clear) {
		for(D element: this)
			element.movel(value, clear);		
	}

	@Override
	public void movel(Number value) {
		movel(value, false);		
	}

	@Override
	public void movel(Number value, boolean clear) {
		for(D element: this)
			element.movel(value, clear);				
	}

	@Override
	public void movel(QBufferedElement value) {
		movel(value, false);		
	}

	@Override
	public void movel(QBufferedElement value, boolean clear) {
		for(D element: this)
			element.movel(value, clear);		
	}

	@Override
	public void movel(QDataFiller value) {
		movel(value, false);		
	}

	@Override
	public void movel(QDataFiller value, boolean clear) {
		for(D element: this)
			element.movel(value, clear);		
	}

	@Override
	public void movel(String value) {
		movel(value, false);		
	}

	@Override
	public void movel(String value, boolean clear) {
		for(D element: this)
			element.movel(value, clear);				
	}

	protected final void setListOwner(NIOBufferedListImpl<?> listOwner) {
		this.listOwner = listOwner;
	}

	protected final void setModel(D _model) {
		this._model = _model;
	}

	@Override
	public final String toString() {

		StringBuffer sb = new StringBuffer();
		QDecimal i = getDataContext().getDataFactory().createDecimal(4, 0, DecimalType.PACKED, true);
		i.eval(1);
		for (i.i(); i.le(capacity()); i.plus(1)) {
			D element = get(i);
			if (i.gt(1))
				sb.append("\n");

			sb.append(i + "[");
			sb.append(new String(element.asBytes(), getDataContext().getCharset()));
			sb.append("]");

			if (sb.length() > 5000)
				break;
		}

		return sb.toString();
	}
	
	private class NIOListIteratorImpl<E extends QBufferedData> implements Iterator<E> {

		private QList<E> list;
		private int current = 0;

		protected NIOListIteratorImpl(QList<E> list) {
			this.list = list;
		}

		@Override
		public boolean hasNext() {
			return current < list.capacity();
		}

		@Override
		public E next() {
			current++;
			return list.get(current);
		}

		@Override
		public void remove() {
			list.get(current).clear();
		}
	}
}