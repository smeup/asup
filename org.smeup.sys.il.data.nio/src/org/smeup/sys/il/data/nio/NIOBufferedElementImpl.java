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

import org.smeup.sys.il.data.BufferedDataType;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;

public abstract class NIOBufferedElementImpl extends NIOBufferedDataImpl implements QBufferedElement {

	private static final long serialVersionUID = 1L;

	public NIOBufferedElementImpl(final QDataContext dataContext) {
		super(dataContext);
	}

	protected abstract void _fill(byte[] filler, boolean maxLength);

	protected abstract void _fillr(byte[] filler, boolean maxLength);

	protected abstract void _move(byte[] value, boolean clear);

	protected abstract void _movel(byte[] value, boolean clear);

	protected abstract void _write(byte[] value);

	// external representation data, the length is current length
	protected abstract byte[] _toBytes(DataSpecial value);

	// external representation data, the length is datetime length
	protected abstract byte[] _toBytes(QDatetime value);

	// external representation data, the length is digits length
	protected abstract byte[] _toBytes(Number value);

	// external representation data, the length is digits length
	protected abstract byte[] _toBytes(QNumeric value);

	// external representation data, the length is string length
	protected abstract byte[] _toBytes(QString value);

	// external representation data, the length is string encoded length
	protected abstract byte[] _toBytes(String value);

	@Override
	public final void assign(final QBufferedData target) {

		if (target instanceof NIOAdapterImpl) {
			final NIOAdapterImpl nioAdapterImpl = (NIOAdapterImpl) target;
			nioAdapterImpl.setDelegate(this);
			return;
		}

		NIOBufferHelper.assign(this, target);
	}

	@Override
	public final void slice(final QBufferedData target, final int position) {

		if (target instanceof NIOAdapterImpl) {
			final NIOAdapterImpl nioAdapterImpl = (NIOAdapterImpl) target;
			nioAdapterImpl.setDelegate(this);
			return;
		}

		NIOBufferHelper.slice(this, target, position);
	}

	@Override
	public final boolean eq(final QDataFiller value) {
		return NIOComparatorHelper.compareBytes(this, value) == 0;
	}

	@Override
	public final QBufferedData eval(final QDataFiller value) {
		_fill(value.get().asBytes(), true);
		return this;
	}

	@Override
	public final boolean ge(final QDataFiller value) {
		return NIOComparatorHelper.compareBytes(this, value) >= 0;
	}

	@Override
	public final boolean gt(final QDataFiller value) {
		return NIOComparatorHelper.compareBytes(this, value) > 0;
	}

	@Override
	public final boolean le(final QDataFiller value) {
		return NIOComparatorHelper.compareBytes(this, value) <= 0;
	}

	@Override
	public final boolean lt(final QDataFiller value) {
		return NIOComparatorHelper.compareBytes(this, value) < 0;
	}

	@Override
	public final void move(final DataSpecial value) {
		move(value, false);
	}

	@Override
	public final void move(final DataSpecial special, final boolean clear) {
		_move(_toBytes(special), false);
	}

	@Override
	public final void move(final Number value) {
		move(value, false);
	}

	@Override
	public final void move(final Number value, final boolean clear) {
		_move(_toBytes(value), clear);
	}

	@Override
	public final void move(final QBufferedElement value) {
		move(value, false);
	}

	@Override
	public final void move(QBufferedElement value, final boolean clear) {

		value = NIOBufferHelper.getNIOBufferedElementImpl(value);
		switch (value.getBufferedElementType()) {
		case DATETIME:
			_move(_toBytes((QDatetime) value), clear);
			break;
		case NUMERIC:
			_move(_toBytes((QNumeric) value), clear);
			break;
		case STRING:
			_move(_toBytes((QString) value), clear);
			break;
		}
	}

	@Override
	public final void move(final QDataFiller value) {
		move(value, false);
	}

	@Override
	public final void move(final QDataFiller value, final boolean clear) {
		_fillr(value.get().asBytes(), false);
	}

	@Override
	public final void move(final String value) {
		move(value, false);
	}

	@Override
	public final void move(final String value, final boolean clear) {
		_move(_toBytes(value), clear);
	}

	@Override
	public final void movel(final DataSpecial value) {
		movel(value, false);
	}

	@Override
	public final void movel(final DataSpecial special, final boolean clear) {
		_movel(_toBytes(special), false);
	}

	@Override
	public final void movel(final Number value) {
		movel(value, false);
	}

	@Override
	public final void movel(final Number value, final boolean clear) {
		_movel(_toBytes(value), clear);
	}

	@Override
	public final void movel(final QBufferedElement value) {
		movel(value, false);
	}

	@Override
	public final void movel(QBufferedElement value, final boolean clear) {

		value = NIOBufferHelper.getNIOBufferedElementImpl(value);
		switch (value.getBufferedElementType()) {
		case DATETIME:
			_movel(_toBytes((QDatetime) value), clear);
			break;
		case NUMERIC:
			_movel(_toBytes((QNumeric) value), clear);
			break;
		case STRING:
			_movel(_toBytes((QString) value), clear);
			break;
		}
	}

	@Override
	public final void movel(final QDataFiller value) {
		movel(value, false);
	}

	@Override
	public final void movel(final QDataFiller value, final boolean clear) {
		_fill(value.get().asBytes(), false);
	}

	@Override
	public final void movel(final String value) {
		movel(value, false);
	}

	@Override
	public final void movel(final String value, final boolean clear) {
		_movel(_toBytes(value), clear);
	}

	@Override
	public final boolean ne(final QDataFiller value) {
		return !eq(value);
	}

	@Override
	public final BufferedDataType getBufferedDataType() {
		return BufferedDataType.ELEMENT;
	}

	@Override
	public final boolean ge(final DataSpecial value) {
		return !lt(value);
	}

	@Override
	public final boolean gt(final DataSpecial special) {
		return !le(special);
	}

	@Override
	public final boolean ne(final DataSpecial value) {
		return !eq(value);
	}

	@Override
	public final boolean le(final DataSpecial special) {
		return NIOComparatorHelper.compareBytes(this, special) <= 0;
	}

	@Override
	public final boolean lt(final DataSpecial special) {
		return NIOComparatorHelper.compareBytes(this, special) < 0;
	}

	@Override
	public final boolean eq(final DataSpecial special) {
		return NIOComparatorHelper.compareBytes(this, special) == 0;
	}
}