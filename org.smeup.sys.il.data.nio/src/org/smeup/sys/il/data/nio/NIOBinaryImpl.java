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

import java.nio.ByteBuffer;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.def.BinaryType;

public class NIOBinaryImpl extends NIONumericImpl implements QBinary {

	private static final long serialVersionUID = 1L;
	private static byte FILLER = (byte) 0;

	private BinaryType _type;
	private boolean _unsigned;

	public NIOBinaryImpl() {
		super();
	}

	public NIOBinaryImpl(BinaryType type, boolean unsigned) {
		super();
		this._type = type;
		this._unsigned = unsigned;
	}

	@Override
	protected byte getFiller() {
		return FILLER;
	}

	@Override
	public boolean isSigned() {
		return !_unsigned;
	}

	@Override
	public void eval(QBufferedData value) {
		// TODO Auto-generated method stub
		value.toString();
	}

	@Override
	public int getLength() {
		switch (_type) {
		case BYTE:
			return 1;
		case SHORT:
			return 2;
		case INTEGER:
			return 4;
		case LONG:
			return 8;
		}

		throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: sdbfsdsd456dfhg");
	}

	@Override
	public int getSize() {
		return getLength();
	}

	@Override
	public Number readNumber() {

		ByteBuffer byteBuffer = getBuffer();
		int position = getPosition();

		NIOBufferHelper.prepare(byteBuffer, position, getSize());
		switch (_type) {
		case BYTE:
			return byteBuffer.get(position);
		case SHORT:
			return byteBuffer.getShort(position);
		case INTEGER:
			return byteBuffer.getInt(position);
		case LONG:
			return byteBuffer.getLong(position);
		}

		throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: zv8rv8ewtrwe");
	}

	@Override
	public void writeNumber(Number number, boolean halfRounding) {

		ByteBuffer buffer = getBuffer();
		int position = getPosition();

		NIOBufferHelper.prepare(buffer, position, getSize());
		switch (_type) {
		case BYTE:
			buffer.put(getPosition(), (byte) number.intValue());
			return;
		case SHORT:
			buffer.putShort(getPosition(), number.shortValue());
			return;
		case INTEGER:
			buffer.putInt(getPosition(), number.intValue());
			return;
		case LONG:
			buffer.putLong(getPosition(), number.longValue());
			return;
		}

		throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: dsbf8w68etrwe");
	}

	@Override
	public int compareNumber(Number value) {

		try {

			switch (_type) {
			case BYTE:
				return ((Byte) getBuffer().get(getPosition())).compareTo((Byte) value);
			case SHORT:
				return ((Short) getBuffer().getShort(getPosition())).compareTo((Short) value);
			case INTEGER:
				return ((Integer) getBuffer().getInt(getPosition())).compareTo((Integer) value);
			case LONG:
				return ((Long) getBuffer().getLong(getPosition())).compareTo((Long) value);
			}
		} catch (ClassCastException e) {
			System.err.println(e.getMessage());
			return -1;
		}

		throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: sv8df5sd7fsd6");
	}

	@Override
	public double asDouble() {
		return asInteger();
	}
}