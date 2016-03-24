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
import org.smeup.sys.il.data.QString;

public class NIOCharacterVaryingImpl extends NIOCharacterImpl {

	private static final long serialVersionUID = 1L;

	public NIOCharacterVaryingImpl(QDataContext dataContext, int size) {
		super(dataContext, size);
	}

	@Override
	protected NIOBufferedDataImpl allocate() {
		super.allocate();

		setLength((short) 0);

		return this;
	}

	protected void setLength(short length) {

		ByteBuffer buffer = getBuffer();
		NIOBufferHelper.prepare(buffer, getPosition(), 2);
		buffer.putShort(length);
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
		switch (value) {
		case BLANK:
		case BLANKS:
			NIOBufferHelper.fill(getBuffer(), getPosition()+2, _length, getFiller());
			break;
		case ZERO:
		case ZEROS:
			NIOBufferHelper.fill(getBuffer(), getPosition()+2, _length, NIODecimalImpl.INIT);
			break;			
		case HIVAL:
			NIOBufferHelper.fill(getBuffer(), getPosition()+2, _length, HIVAL);
			break;
		case LOVAL:
			NIOBufferHelper.fill(getBuffer(), getPosition()+2, _length, LOVAL);
			break;
		case OFF:
			NIOBufferHelper.fill(getBuffer(), getPosition()+2, _length, NIOIndicatorImpl.OFF);
			break;
		case ON:
			NIOBufferHelper.fill(getBuffer(), getPosition()+2, _length, NIOIndicatorImpl.OFF);
			break;
		case OMIT:
		case NULL:
			// TODO
			throw new IntegratedLanguageDataRuntimeException("Unexpceted condition 9vxt87w5ec86w8etrv6wc8e");
		}

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
		if(length == 0)
			return;
		
		ByteBuffer buffer = getBuffer();
		NIOBufferHelper.prepare(buffer, getPosition() + 2, length);

		buffer.put(factor1);
		if(!buffer.hasRemaining())
			return;
		
		if (space != null)
			for (int i = 0; i < space.intValue(); i++)
				buffer.put(getFiller());

		if(!buffer.hasRemaining())
			return;

		buffer.put(factor2);

		if (clear)
			while (buffer.hasRemaining())
				buffer.put(getFiller());
	}

	@Override
	protected void _clear() {

		ByteBuffer buffer = getBuffer();
		NIOBufferHelper.prepare(buffer, getPosition(), 2);
		buffer.putShort((short) 0);

		NIOBufferHelper.clear(getBuffer(), getPosition() + 2, _length, getFiller());
	}

	@Override
	protected void _write(byte[] value) {

		ByteBuffer buffer = getBuffer();
		NIOBufferHelper.prepare(buffer, getPosition(), 2);
		if (value.length > _length)
			buffer.putShort((short) _length);
		else
			buffer.putShort((short) value.length);

		if (value.length > _length)
			NIOBufferHelper.movel(getBuffer(), getPosition() + 2, _length, value, true, getFiller());
		else
			NIOBufferHelper.movel(getBuffer(), getPosition() + 2, value.length, value, true, getFiller());
	}

	@Override
	protected void _move(byte[] value, boolean clear) {
		NIOBufferHelper.move(getBuffer(), getPosition() + 2, getLength(), value, clear, getFiller());
	}

	@Override
	protected void _movel(byte[] value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition() + 2, getLength(), value, clear, getFiller());
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
}