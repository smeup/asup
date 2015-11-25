/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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

import java.io.UnsupportedEncodingException;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QString;

public class NIOCharacterVaryingImpl extends NIOCharacterImpl {

	private static final long serialVersionUID = 1L;

	private short length;

	public NIOCharacterVaryingImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIOCharacterVaryingImpl(QDataContext dataContext, int size) {
		super(dataContext, size);
	}

	@Override
	public void clear() {
		super.clear();
		this.length = 0;
	}

	@Override
	public byte[] asBytes() {
		return NIOBufferHelper.readBytes(this);
	}

	@Override
	public void eval(boolean value) {
		this.length = 1;
		super.eval(value);
	}

	@Override
	public void eval(QString value) {
		this.length = (value.getLength() > getSize() ? (short) getSize() : (short) value.getLength());

		super.eval(value);
	}

	@Override
	public void eval(String value) {

		if (value == null) {
			clear();
			return;
		}

		this.length = (value.length() > getSize() ? (short) getSize() : (short) value.length());

		super.eval(value);
	}

	@Override
	public int getLength() {
		return this.length;
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value.asBytes(), clear, getFiller());
	}

	@Override
	public void move(String value, boolean clear) {

		try {
			NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value.getBytes(getEncoding()), clear, getFiller());
		} catch (UnsupportedEncodingException e) {
			NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value.getBytes(), clear, getFiller());
		}
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {

		NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value.asBytes(), clear, getFiller());
	}

	@Override
	public void movel(String value, boolean clear) {

		try {
			NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value.getBytes(getEncoding()), clear, getFiller());
		} catch (UnsupportedEncodingException e) {
			NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value.getBytes(), clear, getFiller());
		}
	}

	@Override
	public void eval(byte value) {

		this.length = 1;

		super.eval(value);
	}
}