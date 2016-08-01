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

import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;

public final class NIOIndicatorImpl extends NIOCharacterImpl implements QIndicator {

	private static final long serialVersionUID = 1L;
	protected static final byte OFF = (byte) 0xF0;
	protected static final byte ON = (byte) 0xF1;

	public NIOIndicatorImpl(final QDataContext dataContext, final boolean allocate) {
		super(dataContext, 1);

		if (allocate) {
			checkAllocation();
			_buffer = ByteBuffer.allocate(getSize());
			_buffer.put(OFF);
		}
	}

	@Override
	public final boolean asBoolean() {
		final byte byte_ = asBytes()[0];
		return byte_ != OFF && byte_ != NIOStringImpl.INIT;
	}

	@Override
	public final boolean eq(final boolean value) {
		return asBoolean() == value;
	}

	@Override
	public final boolean ne(final boolean value) {
		return !eq(value);
	}

	@Override
	public final boolean eq(final QIndicator value) {
		return eq(value.asBoolean());
	}

	@Override
	public final boolean ne(final QIndicator value) {
		return !eq(value);
	}

	@Override
	public final boolean b() {
		return asBoolean();
	}

	@Override
	public final int getLength() {
		return 1;
	}

	@Override
	public final int getSize() {
		return 1;
	}

	@Override
	public final void eval(final String value) {
		if (value.equals("0"))
			eval(false);
		else if (value.equals("1"))
			eval(true);
		else
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition 237etxvq86rea invalid value " + value);
	}

	@Override
	public final void accept(final QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public final String toString() {
		return Boolean.toString(asBoolean());
	}

	@Override
	protected final NIODataImpl _copyDef(final QDataContext dataContext) {
		final NIOIndicatorImpl copy = new NIOIndicatorImpl(dataContext, false);
		return copy;
	}

	@Override
	public final boolean isVarying() {
		return false;
	}

	@Override
	protected final void cat(final byte[] factor1, final byte[] factor2, final Number space, final boolean clear) {
		_movel(factor1, false);
	}

	@Override
	protected final void _clear() {
		NIOBufferHelper.fill(getBuffer(), getPosition(), getSize(), OFF);
	}

	@Override
	protected final void _fill(final byte[] value, final boolean maxLength) {
		NIOBufferHelper.fill(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	protected final void _fillr(final byte[] value, final boolean maxLength) {
		NIOBufferHelper.fillr(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	protected final void _move(final byte[] value, final boolean clear) {
		if (clear)
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), value, OFF);
		else
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	protected final void _movel(final byte[] value, final boolean clear) {
		if (clear)
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value, OFF);
		else
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	protected final void _write(final byte[] value) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value, OFF);
	}

	@Override
	protected final byte[] _toBytes() {
		return NIOBufferHelper.read(getBuffer(), getPosition(), getLength());
	}

	@Override
	public final QNumeric qLen() {

//		final QDecimal number = getDataContext().getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);
		final QDecimal number = ((NIODataContextImpl)getDataContext()).DATA_LENGTH;	
		number.eval(getLength());

		return number;
	}

	@Override
	public final void snap() {
		if (!isEmpty())
			getDataContext().snap(this);
	}

	@Override
	public final void reset() {

		final QBufferedData snapData = getDataContext().getSnap(this);
		if (snapData != null)
			NIOBufferHelper.write(this, snapData);
		else
			clear();
	}

	@Override
	public final boolean isEmpty() {
		return eq(false);
	}

	@Override
	public final QBufferedData eval(final DataSpecial value) {

		_write(_toBytes(value));
		return this;
	}

	@Override
	public final void evalr(final QString value) {

		final byte[] bytes = value.asBytes();
		if (bytes.length > _length)
			_move(bytes, false);
		else
			_move(bytes, true);
	}

	@Override
	public final void evalr(final String value) {

		final byte[] bytes = value.getBytes(getDataContext().getCharset());
		if (bytes.length > _length)
			_move(bytes, false);
		else
			_move(bytes, true);
	}
}
