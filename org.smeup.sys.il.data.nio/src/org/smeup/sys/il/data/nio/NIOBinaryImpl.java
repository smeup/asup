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

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.def.BinaryType;

import com.ibm.as400.access.AS400ZonedDecimal;

public class NIOBinaryImpl extends NIONumericImpl implements QBinary {

	private static final long serialVersionUID = 1L;
	private static byte INIT = (byte) 0;

	private BinaryType _type;
	private boolean _unsigned;

	public NIOBinaryImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIOBinaryImpl(QDataContext dataContext, BinaryType type, boolean unsigned) {
		super(dataContext);
		this._type = type;
		this._unsigned = unsigned;
	}

	@Override
	protected byte getFiller() {
		return INIT;
	}

	@Override
	public boolean isSigned() {
		return !_unsigned;
	}

	@Override
	public int getLength() {
		switch (_type) {
		case BYTE:
			return 3;
		case SHORT:
			return 5;
		case INTEGER:
			return 10;
		case LONG:
			return 20;
		}

		throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: sdbfsdsd456dfhg");
	}

	@Override
	public int getSize() {
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

		throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: sdbf6wq76ert");
	}

	@Override
	public Number _readNumber() {

		ByteBuffer buffer = getBuffer();
		int position = getPosition();

		NIOBufferHelper.prepare(buffer, position, getSize());
		switch (_type) {
		case BYTE:
			return buffer.get(position);
		case SHORT:
			return buffer.getShort(position);
		case INTEGER:
			return buffer.getInt(position);
		case LONG:
			return buffer.getLong(position);
		}

		throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: zv8rv8ewtrwe");
	}

	@Override
	public void _writeNumber(Number number, String roundingMode) {

		ByteBuffer buffer = getBuffer();
		int position = getPosition();

		NIOBufferHelper.prepare(buffer, position, getSize());
		switch (_type) {
		case BYTE:
			buffer.put(position, (byte) number.intValue());
			return;
		case SHORT:
			buffer.putShort(position, number.shortValue());
			return;
		case INTEGER:
			buffer.putInt(position, number.intValue());
			return;
		case LONG:
			buffer.putLong(position, number.longValue());
			return;
		}

		throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: dsbf8w68etrwe");
	}

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public byte[] _toBytes() {
		AS400ZonedDecimal zoned = NIODecimalZonedImpl.getDecimal(getLength(), 0);
		return zoned.toBytes(asDouble());
	}

	@Override
	protected void _fill(byte[] filler, boolean maxLength) {

		ByteBuffer byteBuffer = ByteBuffer.allocate(getLength());
		NIOBufferHelper.fill(byteBuffer, 0, getLength(), filler);

		eval(NIODecimalZonedImpl.getDecimal(getLength(), 0).toDouble(byteBuffer.array()));
	}

	@Override
	protected void _move(byte[] value, boolean clear) {
		// TODO
		NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value, clear, getFiller());
	}

	@Override
	protected void _movel(byte[] value, boolean clear) {
		// TODO
		NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value, clear, getFiller());
	}

	@Override
	protected void _write(byte[] value) {
		AS400ZonedDecimal zoned = NIODecimalZonedImpl.getDecimal(getLength(), 0);
		eval(zoned.toDouble(value));
	}
}