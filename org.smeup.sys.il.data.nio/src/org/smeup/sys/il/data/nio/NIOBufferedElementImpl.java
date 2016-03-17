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

	public NIOBufferedElementImpl(QDataContext dataContext) {
		super(dataContext);
	}

	protected abstract void _clear();

	protected abstract void _fill(byte[] filler, boolean maxLength);

	protected abstract void _fillr(byte[] filler, boolean maxLength);

	protected abstract void _move(byte[] value, boolean clear);

	protected abstract void _movel(byte[] value, boolean clear);

	protected abstract void _write(byte[] value);

	// external representation data, the length is current length
	protected abstract byte[] _toBytes();

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
	public final byte[] asBytes() {
		return _toBytes();
	}

	@Override
	public void assign(QBufferedData target, int position) {

		if (target instanceof NIOAdapterImpl) {
			NIOAdapterImpl nioAdapterImpl = (NIOAdapterImpl) target;
			nioAdapterImpl.setDelegate(this);
			return;
		}

		super.assign(target, position);
	}

	@Override
	public final void clear() {
		_clear();
	}

	@Override
	public final boolean eq(byte value) {
		return NIOBufferHelper.compareBytes(this, new byte[] { value }) == 0;
	}

	@Override
	public final boolean eq(DataSpecial special) {
		return NIOBufferHelper.compareBytes(this, special) == 0;
	}

	@Override
	public final boolean eq(QDataFiller value) {
		return NIOBufferHelper.compareBytes(this, value) == 0;
	}

	@Override
	public final boolean eq(QBufferedElement value) {

		switch (value.getBufferedElementType()) {
		case DATETIME:
			return NIOBufferHelper.compareBytes(this, _toBytes((QDatetime) value)) == 0;
		case NUMERIC:
			return NIOBufferHelper.compareBytes(this, _toBytes((QNumeric) value)) == 0;
		case STRING:
			return NIOBufferHelper.compareBytes(this, _toBytes((QString) value)) == 0;
		}
		
		return false;
	}

	@Override
	public final QBufferedData eval(byte value) {
		_write(new byte[] { value });
		return this;
	}

	@Override
	public final QBufferedData eval(DataSpecial value) {
		_fill(_toBytes(value), true);
		return this;
	}

	@Override
	public final QBufferedData eval(QDataFiller value) {
		_fill(value.get().asBytes(), true);
		return this;
	}

	@Override
	public final boolean ge(byte value) {
		return NIOBufferHelper.compareBytes(this, new byte[] { value }) >= 0;
	}

	@Override
	public final boolean ge(DataSpecial value) {
		return NIOBufferHelper.compareBytes(this, value) >= 0;
	}

	@Override
	public final boolean ge(QDataFiller value) {
		return NIOBufferHelper.compareBytes(this, value) >= 0;
	}

	@Override
	public final boolean gt(byte value) {
		return NIOBufferHelper.compareBytes(this, new byte[] { value }) > 0;
	}

	@Override
	public final boolean gt(DataSpecial special) {
		return NIOBufferHelper.compareBytes(this, special) > 0;
	}

	@Override
	public final boolean gt(QDataFiller value) {
		return NIOBufferHelper.compareBytes(this, value) > 0;
	}

	@Override
	public final boolean le(byte value) {
		return NIOBufferHelper.compareBytes(this, new byte[] { value }) <= 0;
	}

	@Override
	public final boolean le(DataSpecial special) {
		return NIOBufferHelper.compareBytes(this, special) <= 0;
	}

	@Override
	public final boolean le(QDataFiller value) {
		return NIOBufferHelper.compareBytes(this, value) <= 0;
	}

	@Override
	public final boolean lt(byte value) {
		return NIOBufferHelper.compareBytes(this, new byte[] { value }) < 0;
	}

	@Override
	public final boolean lt(DataSpecial special) {
		return NIOBufferHelper.compareBytes(this, special) < 0;
	}

	@Override
	public final boolean lt(QDataFiller value) {
		return NIOBufferHelper.compareBytes(this, value) < 0;
	}

	@Override
	public final void move(DataSpecial value) {
		move(value, false);
	}

	@Override
	public final void move(DataSpecial special, boolean clear) {
		_move(_toBytes(special), false);
	}

	@Override
	public final void move(Number value) {
		move(value, false);
	}

	@Override
	public final void move(Number value, boolean clear) {
		_move(_toBytes(value), clear);
	}

	@Override
	public final void move(QBufferedElement value) {
		move(value, false);
	}

	@Override
	public final void move(QBufferedElement value, boolean clear) {

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
	public final void move(QDataFiller value) {
		move(value, false);
	}

	@Override
	public final void move(QDataFiller value, boolean clear) {
		_fillr(value.get().asBytes(), false);
	}

	@Override
	public final void move(String value) {
		move(value, false);
	}

	@Override
	public final void move(String value, boolean clear) {
		_move(_toBytes(value), clear);
	}

	@Override
	public final void movel(DataSpecial value) {
		movel(value, false);
	}

	@Override
	public final void movel(DataSpecial special, boolean clear) {
		_movel(_toBytes(special), false);
	}

	@Override
	public final void movel(Number value) {
		movel(value, false);
	}

	@Override
	public final void movel(Number value, boolean clear) {
		_movel(_toBytes(value), clear);
	}

	@Override
	public final void movel(QBufferedElement value) {
		movel(value, false);
	}

	@Override
	public final void movel(QBufferedElement value, boolean clear) {

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
	public final void movel(QDataFiller value) {
		movel(value, false);
	}

	@Override
	public final void movel(QDataFiller value, boolean clear) {
		_fill(value.get().asBytes(), false);
	}

	@Override
	public final void movel(String value) {
		movel(value, false);
	}

	@Override
	public final void movel(String value, boolean clear) {
		_movel(_toBytes(value), clear);
	}

	@Override
	public final boolean ne(byte value) {
		return !eq(value);
	}

	@Override
	public final boolean ne(DataSpecial value) {
		return !eq(value);
	}

	@Override
	public final boolean ne(QDataFiller value) {
		return !eq(value);
	}
}