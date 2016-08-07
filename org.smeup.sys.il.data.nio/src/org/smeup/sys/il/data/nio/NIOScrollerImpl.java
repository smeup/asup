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

	private final int _dimension;
	private int _index;

	public NIOScrollerImpl(final QDataContext dataContext, final D model, final int dimension, final boolean allocate) {
		super(dataContext, model, SortDirection.ASCEND);
		_dimension = dimension;

		if (allocate) {
			checkAllocation();
			_buffer = ByteBuffer.allocate(getSize());

			for (final D element : this)
				element.clear();
		}

		absolute(1);
	}

	@Override
	public final D absolute(final int position) {
		return get(position);
	}

	@Override
	public final void accept(final QDataVisitor visitor) {

		if (visitor.visit(this)) {

			final Iterator<D> datas = this.iterator();
			while (datas.hasNext())
				datas.next().accept(visitor);

			visitor.endVisit(this);
		}
	}

	@Override
	public final D[] asArray() {
		throw new UnsupportedOperationException();
	}

	@Override
	public final byte[] asBytes() {
		return current().asBytes();
	}

	@Override
	public final int capacity() {
		return _dimension;
	}

	@Override
	public final void clear() {
		current().clear();
	}

	@Override
	public final int count() {
		return _dimension;
	}

	@Override
	public final D current() {
		return getModel();
	}

	@Override
	public final boolean eq(final DataSpecial value) {
		return current().eq(value);
	}

	@Override
	public final boolean eq(final QDataFiller value) {
		return current().eq(value);
	}

	@Override
	public final QBufferedData eval(final DataSpecial value) {
		return current().eval(value);
	}

	@Override
	public final QBufferedData eval(final QDataFiller value) {
		return current().eval(value);
	}

	@Override
	public final D first() {
		return get(1);
	}

	@Override
	public final boolean ge(final DataSpecial value) {
		return current().ge(value);
	}

	@Override
	public final boolean ge(final QDataFiller value) {
		return current().ge(value);
	}

	@Override
	public final D get(final int index) {

		if (_index == index)
			return getModel();

		int position = 0;

		if (getListOwner() == null)
			position = getModel().getSize() * (index - 1);
		else
			position = getListOwner().getModel().getLength() * (index - 1);

		slice(getModel(), position + 1);

		_index = index;

		return getModel();
	}

	@Override
	public final BufferedElementType getBufferedElementType() {
		return current().getBufferedElementType();
	}

	@Override
	public final boolean gt(final DataSpecial value) {
		return current().gt(value);
	}

	@Override
	public final boolean gt(final QDataFiller value) {
		return current().gt(value);
	}

	@Override
	public final D last() {
		return get(_dimension);
	}

	@Override
	public final boolean le(final DataSpecial value) {
		return current().le(value);
	}

	@Override
	public final boolean le(final QDataFiller value) {
		return current().le(value);
	}

	@Override
	public final boolean lt(final DataSpecial value) {
		return current().lt(value);
	}

	@Override
	public final boolean lt(final QDataFiller value) {
		return current().lt(value);
	}

	@Override
	public final void move(final DataSpecial value) {
		current().move(value);
	}

	@Override
	public final void move(final DataSpecial value, final boolean clear) {
		current().move(value, clear);
	}

	@Override
	public final void move(final Number value) {
		current().move(value);
	}

	@Override
	public final void move(final Number value, final boolean clear) {
		current().move(value, clear);
	}

	@Override
	public final void move(final QBufferedElement value) {
		current().move(value);
	}

	@Override
	public final void move(final QBufferedElement value, final boolean clear) {
		current().move(value, clear);
	}

	@Override
	public final void move(final QDataFiller value) {
		current().move(value);
	}

	@Override
	public final void move(final QDataFiller value, final boolean clear) {
		current().move(value, clear);
	}

	@Override
	public final void move(final String value) {
		current().move(value);
	}

	@Override
	public final void move(final String value, final boolean clear) {
		current().move(value, clear);
	}

	@Override
	public final void movel(final DataSpecial value) {
		current().movel(value);
	}

	@Override
	public final void movel(final DataSpecial value, final boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public final void movel(final Number value) {
		current().movel(value);
	}

	@Override
	public final void movel(final Number value, final boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public final void movel(final QBufferedElement value) {
		current().movel(value);
	}

	@Override
	public final void movel(final QBufferedElement value, final boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public final void movel(final QDataFiller value) {
		current().movel(value);
	}

	@Override
	public final void movel(final QDataFiller value, final boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public final void movel(final String value) {
		current().movel(value);
	}

	@Override
	public final void movel(final String value, final boolean clear) {
		current().movel(value, clear);
	}

	@Override
	public final boolean ne(final DataSpecial value) {
		return current().ne(value);
	}

	@Override
	public final boolean ne(final QDataFiller value) {
		return current().ne(value);
	}

	@Override
	public final D next() {
		return get(position() + 1);
	}

	@Override
	public final D previous() {
		return get(position() - 1);
	}

	@Override
	public final int position() {
		return _index;
	}

	@Override
	public final void qPosition(final QScroller<?> scroller) {
		absolute(scroller.position());
	}

	@SuppressWarnings("unchecked")
	@Override
	protected NIODataImpl _copyDef(final QDataContext dataContext) {
		final NIOScrollerImpl<D> copy = new NIOScrollerImpl<D>(dataContext, (D) NIOBufferHelper.getNIOBufferedElementImpl(getModel())._copyDef(dataContext), _dimension, false);
		return copy;
	}
	
	@Override
	public void reset() {

		if (_reset != null)
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), _reset);
		else
			clear();
	}
}