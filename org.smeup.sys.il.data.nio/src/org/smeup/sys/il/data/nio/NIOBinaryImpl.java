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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DecimalType;

public final class NIOBinaryImpl extends NIONumericImpl implements QBinary {

	private static final long serialVersionUID = 1L;
	private static final byte LOVAL = (byte) 0;
	private static final byte HIVAL = (byte) 128;

	private final BinaryType _type;
	private final boolean _unsigned;
	private transient NIODecimalDef _decimalDef;

	public NIOBinaryImpl(final QDataContext dataContext, final BinaryType type, final boolean unsigned, final boolean allocate) {
		super(dataContext);
		
		this._type = type;
		this._unsigned = unsigned;
		this._decimalDef = NIODecimalDef.getInstance(getLength(), 0);

		if (allocate) 
			_storage = ByteBuffer.allocate(getSize());
	}

	public NIOBinaryImpl(final QDataContext dataContext, final boolean unsigned, final int value) {
		super(dataContext);

		this._type = BinaryType.INTEGER;
		this._unsigned = unsigned;
		this._decimalDef = NIODecimalDef.getInstance(getLength(), 0);

		_storage = ByteBuffer.allocate(getSize()).putInt(value);
	}
	

	@Override
	public final boolean isSigned() {
		return !_unsigned;
	}

	@Override
	public final int getLength() {
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
	public final int getSize() {
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
	public final void clear() {
		_writeNumber(0, false);
	}
	
	@Override
	public final QBufferedData eval(final DataSpecial value) {
		_write(_toBytes(value));
		return this;
	}

	@Override
	public final Number _readNumber() {

		final ByteBuffer buffer = getBuffer();
		final int position = getPosition();

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
	public final void _writeNumber(final Number number, final boolean halfAdjust) {

		final ByteBuffer buffer = getBuffer();
		final int position = getPosition();

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
	public final void accept(final QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public final byte[] asBytes() {
		return _decimalDef.zoned.toBytes(asDouble());
	}

	@Override
	protected final void _fill(final byte[] filler, final boolean maxLength) {

		final ByteBuffer byteBuffer = ByteBuffer.allocate(getLength());
		NIOBufferHelper.fill(byteBuffer, 0, getLength(), filler);
		_write(byteBuffer.array());
	}

	@Override
	protected final void _fillr(final byte[] filler, final boolean maxLength) {

		final ByteBuffer byteBuffer = ByteBuffer.allocate(getLength());
		NIOBufferHelper.fillr(byteBuffer, 0, getLength(), filler);
		_write(byteBuffer.array());
	}

	@Override
	protected final void _move(final byte[] value, final boolean clear) {

		double doubleValue;
		if (getLength() > value.length) {

			final byte[] newValue = asBytes();
			System.arraycopy(value, 0, newValue, getLength() - value.length, value.length);

			doubleValue = _decimalDef.zoned.toDouble(newValue);
		} else
			doubleValue = _decimalDef.zoned.toDouble(value, value.length - getLength());

		_writeNumber(doubleValue, false);
	}

	@Override
	protected final void _movel(final byte[] value, final boolean clear) {

		double doubleValue;
		if (getLength() > value.length) {
			final byte[] newValue = asBytes();
			System.arraycopy(value, 0, newValue, 0, value.length);

			doubleValue = _decimalDef.zoned.toDouble(newValue);
		} else
			doubleValue = _decimalDef.zoned.toDouble(value);

		_writeNumber(doubleValue, false);
	}

	@Override
	protected final void _write(final byte[] value) {
		eval(_decimalDef.zoned.toDouble(value));
	}

	/*
	 * @Override protected final byte[] _toBytes(DataSpecial value) {
	 *
	 * byte[] bytes = new byte[getLength()]; switch (value) { case LOVAL:
	 * Arrays.fill(bytes, LOVAL); break; case BLANK: case BLANKS:
	 * Arrays.fill(bytes, NIOCharacterImpl.INIT); break; case OFF: case ZERO:
	 * case ZEROS: Arrays.fill(bytes, INIT); break; case ON: Arrays.fill(bytes,
	 * NIOIndicatorImpl.ON); break; case HIVAL: Arrays.fill(bytes, HIVAL);
	 * break; case NULL: case OMIT: throw new
	 * IntegratedLanguageDataRuntimeException(
	 * "Unexpected condition 237rvbwe87vb9stf"); }
	 *
	 * bytes[bytes.length - 1] = 0x0F; return bytes; }
	 */

	@Override
	protected final byte[] _toBytes(final DataSpecial value) {

		final byte[] bytes = new byte[getLength()];
		switch (value) {
		case LOVAL:
			Arrays.fill(bytes, HIVAL);
			bytes[bytes.length - 1] = LOVAL;
			break;
		case BLANK:
		case BLANKS:
			Arrays.fill(bytes, NIOStringImpl.INIT);
			break;
		case OFF:
		case ZERO:
		case ZEROS:
			Arrays.fill(bytes, NIONumericImpl.INIT);
			break;
		case ON:
			Arrays.fill(bytes, NIOIndicatorImpl.ON);
			break;
		case HIVAL:
			Arrays.fill(bytes, HIVAL);
			break;
		case NULL:
		case OMIT:
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition 237rvbwe87vb9stf");
		}

		return bytes;
	}

	@Override
	public final QNumeric qUns() {

		final NIOBinaryImpl number = new NIOBinaryImpl(getDataContext(), _type, isSigned(), true);
		if (asShort() > 0)
			number.eval(this);
		else
			number.eval(this.asDouble() * -1);

		return number;
	}

	@Override
	protected final NIODataImpl _copyDef(final QDataContext dataContext) {
		final NIOBinaryImpl copy = new NIOBinaryImpl(dataContext, _type, _unsigned, false);
		return copy;
	}

	@Override
	public final QNumeric qLen() {

		final QDecimal number = getDataContext().getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);
		number.eval(getLength());

		return number;
	}

	@Override
	public final void snap() {
		if (!isEmpty())
			_reset = NIOBufferHelper.read(this);
	}
	
	private final void readObject(final ObjectInputStream stream) throws IOException, ClassNotFoundException {

		stream.defaultReadObject();
		
		final int length = stream.readInt();
		_decimalDef = NIODecimalDef.getInstance(length, 0);
	}

	private final void writeObject(final ObjectOutputStream stream) throws IOException {

		stream.defaultWriteObject();
		
		stream.writeInt(getLength());
	}
}