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

import java.nio.ByteBuffer;
import java.util.Iterator;

import org.smeup.sys.il.data.BufferedElementType;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.SortDirection;

public class NIOScrollerImpl<D extends QBufferedElement> extends NIOBufferedListImpl<D> implements QScroller<D> {

	private static final long serialVersionUID = 1L;

	private int _dimension;
	private int _index;

	D _current = current();

	public NIOScrollerImpl(QDataContext dataContext, D model, int dimension, boolean allocate) {
		super(dataContext, model, SortDirection.ASCEND);
		_dimension = dimension;
		
		if (allocate) {
			checkAllocation();
			_buffer = ByteBuffer.allocate(getSize());

			for (D element : this)
				element.clear();

			absolute(1);
		}
		else
			absolute(1);
	}

	@Override
	public D absolute(int position) {
		return get(position);
	}

	@Override
	public void accept(QDataVisitor visitor) {

		if (visitor.visit(this)) {

			Iterator<D> datas = this.iterator();
			while (datas.hasNext())
				datas.next().accept(visitor);

			visitor.endVisit(this);
		}
	}

	@Override
	public D[] asArray() {
		throw new UnsupportedOperationException();
	}

	@Override
	public byte[] asBytes() {
		return current().asBytes();
	}

	@Override
	public int capacity() {
		return _dimension;
	}

	@Override
	public void clear() {
		current().clear();
	}

	@Override
	public int count() {
		return _dimension;
	}

	@Override
	public D current() {
		return (D) getModel();
	}

	@Override
	public boolean eq(DataSpecial value) {
		return current().eq(value);
	}

	@Override
	public boolean eq(QDataFiller value) {
		return current().eq(value);
	}

	@Override
	public QBufferedData eval(DataSpecial value) {
		return current().eval(value);
	}

	@Override
	public QBufferedData eval(QDataFiller value) {
		return current().eval(value);
	}

	@Override
	public D first() {
		return get(1);
	}

	@Override
	public boolean ge(DataSpecial value) {
		return current().ge(value);
	}

	@Override
	public boolean ge(QDataFiller value) {
		return current().ge(value);
	}

	@Override
	public D get(int index) {

		if (_index == index)
			return (D) getModel();

		int position = 0;

		if (getListOwner() == null)
			position = getModel().getSize() * (index - 1);
		else
			position = getListOwner().getModel().getLength() * (index - 1);

		slice(getModel(), position + 1);

		_index = index;

		return (D) getModel();
	}

	@Override
	public BufferedElementType getBufferedElementType() {
		return current().getBufferedElementType();
	}

	@Override
	public boolean gt(DataSpecial value) {
		return current().gt(value);
	}

	@Override
	public boolean gt(QDataFiller value) {
		return current().gt(value);
	}

	@Override
	public D last() {
		return get(_dimension);
	}

	@Override
	public boolean le(DataSpecial value) {
		return current().le(value);
	}

	@Override
	public boolean le(QDataFiller value) {
		return current().le(value);
	}

	@Override
	public boolean lt(DataSpecial value) {
		return current().lt(value);
	}

	@Override
	public boolean lt(QDataFiller value) {
		return current().lt(value);
	}

	@Override
	public void move(DataSpecial value) {
		current().move(value);
	}

	@Override
	public void move(DataSpecial value, boolean clear) {
		current().move(value, clear);
	}

	@Override
	public void move(Number value) {
		current().move(value);
	}

	@Override
	public void move(Number value, boolean clear) {
		current().move(value, clear);
	}

	@Override
	public void move(QBufferedElement value) {
		current().move(value);
	}

	@Override
	public void move(QBufferedElement value, boolean clear) {
		current().move(value, clear);
	}

	@Override
	public void move(QDataFiller value) {
		current().move(value);
	}

	@Override
	public void move(QDataFiller value, boolean clear) {
		current().move(value, clear);
	}

	@Override
	public void move(String value) {
		current().move(value);
	}

	@Override
	public void move(String value, boolean clear) {
		current().move(value, clear);
	}

	@Override
	public void movel(DataSpecial value) {
		current().movel(value);
	}

	@Override
	public void movel(DataSpecial value, boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public void movel(Number value) {
		current().movel(value);
	}

	@Override
	public void movel(Number value, boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public void movel(QBufferedElement value) {
		current().movel(value);
	}

	@Override
	public void movel(QBufferedElement value, boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public void movel(QDataFiller value) {
		current().movel(value);
	}

	@Override
	public void movel(QDataFiller value, boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public void movel(String value) {
		current().movel(value);
	}

	@Override
	public void movel(String value, boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public boolean ne(DataSpecial value) {
		return current().ne(value);
	}

	@Override
	public boolean ne(QDataFiller value) {
		return current().ne(value);
	}

	@Override
	public D next() {
		return get(position() + 1);
	}

	@Override
	public D previous() {
		return get(position() - 1);
	}

	@Override
	public int position() {
		return _index;
	}

	@Override
	public void qPosition(QScroller<?> scroller) {
		absolute(scroller.position());
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected NIODataImpl _copy(QDataContext dataContext) {
		NIOScrollerImpl<D> copy = new NIOScrollerImpl<D>(dataContext, (D) NIOBufferHelper.getNIOBufferedElementImpl(getModel())._copy(dataContext), _dimension, false);
		return copy;
	}
}