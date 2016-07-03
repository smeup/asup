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
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.BinaryType;

public class NIOCharacterVaryingImpl extends NIOCharacterImpl {

	private static final long serialVersionUID = 1L;

	public NIOCharacterVaryingImpl(QDataContext dataContext, int length, boolean allocate) {
		super(dataContext, length, false);
		
		if(allocate) {
			checkAllocation();
			_buffer = ByteBuffer.allocate(getSize());
		}
	}

	private void setLength(short length) {

		ByteBuffer buffer = getBuffer();
		NIOBufferHelper.prepare(buffer, getPosition(), 2);
		buffer.putShort(length);
	}

	@Override
	public final QNumeric qLen() {

		QNumeric number = getDataContext().getDataFactory().createBinary(BinaryType.SHORT, true, false);
		slice(number);

		return number;
	}

	@Override
	public int getSize() {
		return _length + 2;
	}

	@Override
	public int getLength() {
		ByteBuffer buffer = getBuffer();
		NIOBufferHelper.prepare(buffer, getPosition(), 2);
		return buffer.getShort();
	}

	@Override
	public final boolean isVarying() {
		return true;
	}

	@Override
	public final QBufferedData eval(DataSpecial value) {

		setLength((short) _length);
		super.eval(value);

		return this;
	}

	@Override
	public final void evalr(QString value) {
		setLength((short) _length);
		super.evalr(value);
	}

	@Override
	public final void evalr(String value) {
		setLength((short) _length);
		super.evalr(value);
	}

	@Override
	protected void cat(byte[] factor1, byte[] factor2, Number space, boolean clear) {

		int length = getLength();
		if (length == 0)
			return;

		ByteBuffer buffer = getBuffer();
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
	protected void _clear() {

		setLength((short) 0);
		// NIOBufferHelper.fill(getBuffer(), getPosition()+2, _length, INIT);
	}

	@Override
	protected void _write(byte[] value) {

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
	protected void _move(byte[] value, boolean clear) {
		if (clear)
			NIOBufferHelper.move(getBuffer(), getPosition() + 2, getLength(), value, INIT);
		else
			NIOBufferHelper.move(getBuffer(), getPosition() + 2, getLength(), value);
	}

	@Override
	protected void _movel(byte[] value, boolean clear) {
		if (clear)
			NIOBufferHelper.movel(getBuffer(), getPosition() + 2, getLength(), value, INIT);
		else
			NIOBufferHelper.movel(getBuffer(), getPosition() + 2, getLength(), value);
	}

	@Override
	protected byte[] _toBytes() {
		return NIOBufferHelper.read(getBuffer(), getPosition() + 2, getLength());
	}

	@Override
	protected void _fill(byte[] value, boolean maxLength) {
		if (maxLength)
			NIOBufferHelper.fill(getBuffer(), getPosition() + 2, _length, value);
		else
			NIOBufferHelper.fill(getBuffer(), getPosition() + 2, getLength(), value);
	}

	@Override
	protected void _fillr(byte[] value, boolean maxLength) {
		if (maxLength)
			NIOBufferHelper.fillr(getBuffer(), getPosition() + 2, _length, value);
		else
			NIOBufferHelper.fillr(getBuffer(), getPosition() + 2, getLength(), value);
	}
	
	@Override
	protected NIODataImpl _copyDef(QDataContext dataContext) {
		NIOCharacterVaryingImpl copy = new NIOCharacterVaryingImpl(dataContext, _length, false);
		return copy;
	}
}