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
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;

public final class NIOCharacterFixedImpl extends NIOCharacterImpl {

	private static final long serialVersionUID = 1L;
	
	public NIOCharacterFixedImpl(final QDataContext dataContext, final int length, final boolean allocate) {
		super(dataContext, length);
		
		if (allocate) {
			ByteBuffer byteBuffer = ByteBuffer.allocate(getSize());
			NIOBufferHelper.fill(byteBuffer, 0, byteBuffer.capacity(), INIT);
			_storage = byteBuffer;
		}
	}

	public NIOCharacterFixedImpl(final QDataContext dataContext, final String value) {
		this(dataContext, value.length(), true);
		eval(value);
	}

	@Override
	public final String toString() {
		return asString();
	}

	@Override
	public final int getLength() {
		return _maxLength;
	}

	@Override
	public final int getSize() {
		return _maxLength;
	}

	@Override
	public final void clear() {
		NIOBufferHelper.fill(getBuffer(), getPosition(), getSize(), INIT);
	}
	
	@Override
	public final void accept(final QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public final boolean isVarying() {
		return false;
	}

	@Override
	protected final void cat(final byte[] factor1, final byte[] factor2, final Number space, final boolean clear) {

		final ByteBuffer buffer = getBuffer();
		NIOBufferHelper.prepare(buffer, getPosition(), getLength());

		int remaining = buffer.remaining();
		if (remaining > factor1.length) {
			buffer.put(factor1);
			remaining = remaining - factor1.length;
		} else {
			buffer.put(factor1, 0, remaining);
			return;
		}

		if (space != null) {
			final int s = space.intValue();
			if (s > remaining) {
				for (int i = 0; i < remaining; i++)
					buffer.put(INIT);
				return;
			} else {
				for (int i = 0; i < s; i++)
					buffer.put(INIT);

				remaining = remaining - s;
			}
		}

		if (remaining > factor2.length)
			buffer.put(factor2);
		else {
			buffer.put(factor2, 0, remaining);
			return;
		}

		if (clear)
			while (buffer.hasRemaining())
				buffer.put(INIT);
	}

	@Override
	protected final NIODataImpl _copyDef(final QDataContext dataContext) {
		final NIOCharacterImpl copy = new NIOCharacterFixedImpl(dataContext, _maxLength, false);
		return copy;
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
	protected final void _write(final byte[] value) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value, INIT);
	}

	@Override
	protected final void _move(final byte[] value, final boolean clear) {
		if (clear)
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), value, INIT);
		else
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	protected final void _movel(final byte[] value, final boolean clear) {
		if (clear)
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value, INIT);
		else
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	public final void eval(final String value) {
		_write(value.getBytes(getDataContext().getCharset()));
	}

	@Override
	public final QBufferedData eval(final DataSpecial value) {
		_write(_toBytes(value));
		return this;
	}

	@Override
	public final void evalr(final QString value) {
		final byte[] bytes = value.asBytes();
		if (bytes.length > _maxLength)
			_move(bytes, false);
		else
			_move(bytes, true);
	}

	@Override
	public final void evalr(final String value) {

		final byte[] bytes = value.getBytes(getDataContext().getCharset());
		if (bytes.length > _maxLength)
			_move(bytes, false);
		else
			_move(bytes, true);
	}

	@Override
	public final QNumeric qLen() {

		final QNumeric number = new NIOBinaryImpl(getDataContext(), false, getLength());
		return number;
	}

	@Override
	public final void snap() {
		if (!isEmpty())
			_reset = NIOBufferHelper.read(this);
	}

	@Override
	public final boolean isEmpty() {
		return eq(DataSpecial.BLANKS);
	}

	@Override
	public final byte[] asBytes() {
		return NIOBufferHelper.read(getBuffer(), getPosition(), getLength());
	}
	
	@Override
	public final void reset() {

		if (_reset != null)
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), _reset);
		else
			clear();
	}
}