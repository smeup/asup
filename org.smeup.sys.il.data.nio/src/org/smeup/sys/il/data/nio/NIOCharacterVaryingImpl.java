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

import org.smeup.sys.il.data.QDataContext;

public class NIOCharacterVaryingImpl extends NIOCharacterImpl {

	private static final long serialVersionUID = 1L;

	public NIOCharacterVaryingImpl(QDataContext dataContext, int size) {
		super(dataContext, size);
	}

	@Override
	protected NIOBufferedDataImpl allocate() {
		super.allocate();
		
		ByteBuffer buffer = getBuffer();
		NIOBufferHelper.prepare(buffer, getPosition(), 2);
		buffer.putShort((short) 0);
		
		return this;
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
		
		if(value.length > _length)
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
		if(maxLength)
			NIOBufferHelper.fill(getBuffer(), getPosition()+2, _length, value);
		else
			NIOBufferHelper.fill(getBuffer(), getPosition()+2, getLength(), value);
	}
}