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

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.def.BinaryType;

public final class NIOCharacterVaryingImpl extends NIOCharacterImpl implements QCharacter {

	private static final long serialVersionUID = 1L;

	public NIOCharacterVaryingImpl(final QDataContext dataContext, final int length, final boolean allocate) {
		super(dataContext, length);

		if (allocate) {
			checkAllocation();
			_buffer = ByteBuffer.allocate(getSize());
		}
	}

	@Override
	protected final void setLength(final short length) {
		final ByteBuffer buffer = getBuffer();
		NIOBufferHelper.prepare(buffer, getPosition(), 2);
		buffer.putShort(length);
	}

	@Override
	public final String toString() {
		return asString();
	}

	@Override
	public final void accept(final QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public final QNumeric qLen() {

		final QNumeric number = getDataContext().getDataFactory().createBinary(BinaryType.SHORT, true, false);
		assign(number);

		return number;
	}

	@Override
	public final int getSize() {
		return _length + 2;
	}

	@Override
	public final int getLength() {
		final ByteBuffer buffer = getBuffer();
		NIOBufferHelper.prepare(buffer, getPosition(), 2);
		return buffer.getShort();
	}

	@Override
	public final boolean isVarying() {
		return true;
	}

	@Override
	public final void eval(final String value) {
		_write(value.getBytes(getDataContext().getCharset()));
	}

	@Override
	protected final void cat(final byte[] factor1, final byte[] factor2, final Number space, final boolean clear) {

		final int length = getLength();
		if (length == 0)
			return;

		final ByteBuffer buffer = getBuffer();
		NIOBufferHelper.prepare(buffer, getPosition() + 2, length);

		buffer.put(factor1);

		if (space != null)
			for (int i = 0; i < space.intValue() && buffer.hasRemaining(); i++)
				buffer.put(INIT);

		if (buffer.remaining() > factor2.length) {
			buffer.put(factor2);

			if (clear)
				while (buffer.hasRemaining())
					buffer.put(INIT);
		} else
			buffer.put(factor2, 0, buffer.remaining());
	}

	@Override
	protected final void _clear() {

		setLength((short) 0);
		// NIOBufferHelper.fill(getBuffer(), getPosition()+2, _length, INIT);
	}

	@Override
	protected final void _write(final byte[] value) {

		if (value.length > _length)
			setLength((short) _length);
		else
			setLength((short) value.length);

		if (value.length > _length)
			NIOBufferHelper.movel(getBuffer(), getPosition() + 2, _length, value);
		else
			NIOBufferHelper.movel(getBuffer(), getPosition() + 2, value.length, value);
	}

	@Override
	protected final void _move(final byte[] value, final boolean clear) {
		if (clear)
			NIOBufferHelper.move(getBuffer(), getPosition() + 2, getLength(), value, INIT);
		else
			NIOBufferHelper.move(getBuffer(), getPosition() + 2, getLength(), value);
	}

	@Override
	protected final void _movel(final byte[] value, final boolean clear) {
		if (clear)
			NIOBufferHelper.movel(getBuffer(), getPosition() + 2, getLength(), value, INIT);
		else
			NIOBufferHelper.movel(getBuffer(), getPosition() + 2, getLength(), value);
	}

	@Override
	protected final byte[] _toBytes() {
		return NIOBufferHelper.read(getBuffer(), getPosition() + 2, getLength());
	}

	@Override
	protected final void _fill(final byte[] value, final boolean maxLength) {
		if (maxLength)
			NIOBufferHelper.fill(getBuffer(), getPosition() + 2, _length, value);
		else
			NIOBufferHelper.fill(getBuffer(), getPosition() + 2, getLength(), value);
	}

	@Override
	protected final void _fillr(final byte[] value, final boolean maxLength) {
		if (maxLength)
			NIOBufferHelper.fillr(getBuffer(), getPosition() + 2, _length, value);
		else
			NIOBufferHelper.fillr(getBuffer(), getPosition() + 2, getLength(), value);
	}

	@Override
	protected final NIODataImpl _copyDef(final QDataContext dataContext) {
		final NIOCharacterVaryingImpl copy = new NIOCharacterVaryingImpl(dataContext, _length, false);
		return copy;
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
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}