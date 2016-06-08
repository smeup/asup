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
import java.util.Arrays;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.def.BinaryType;

public class NIOBinaryImpl extends NIONumericImpl implements QBinary {

	private static final long serialVersionUID = 1L;
//	private static byte INIT = (byte) 0;
	private static final byte LOVAL = (byte) 0;
	private static final byte HIVAL = (byte) 128;

	private BinaryType _type;
	private boolean _unsigned;
	private NIODecimalDef decimalDef = null;
	
	public NIOBinaryImpl(QDataContext dataContext, BinaryType type, boolean unsigned, boolean allocate) {
		super(dataContext);
		this._type = type;
		this._unsigned = unsigned;
		
		this.decimalDef = NIODecimalDef.getInstance(getLength(), 0);
		
		if(allocate) {
			checkAllocation();		
			_buffer = ByteBuffer.allocate(getSize());
		} 
	}

	protected NIODecimalDef getDecimalDef() {
		return decimalDef;
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
	public void _writeNumber(Number number, boolean halfAdjust) {

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
	public byte[] _toBytes() {;
		return getDecimalDef().getZoned().toBytes(asDouble());
	}

	@Override
	protected void _fill(byte[] filler, boolean maxLength) {

		ByteBuffer byteBuffer = ByteBuffer.allocate(getLength());
		NIOBufferHelper.fill(byteBuffer, 0, getLength(), filler);
		_write(byteBuffer.array());
	}

	@Override
	protected void _fillr(byte[] filler, boolean maxLength) {

		ByteBuffer byteBuffer = ByteBuffer.allocate(getLength());
		NIOBufferHelper.fillr(byteBuffer, 0, getLength(), filler);
		_write(byteBuffer.array());
	}

	@Override
	protected void _move(byte[] value, boolean clear) {
		

		double doubleValue;
		if (getLength() > value.length) {
			
			byte[] newValue = asBytes();
			System.arraycopy(value, 0, newValue, getLength() - value.length, value.length);
			
			doubleValue = getDecimalDef().getZoned().toDouble(newValue);
		} else
			doubleValue = getDecimalDef().getZoned().toDouble(value, value.length - getLength());

		_writeNumber(doubleValue, false);
	}

	@Override
	protected void _movel(byte[] value, boolean clear) {

		double doubleValue;
		if (getLength() > value.length) {
			byte[] newValue = asBytes();
			System.arraycopy(value, 0, newValue, 0, value.length);
			
			doubleValue = getDecimalDef().getZoned().toDouble(newValue);
		} else {
			doubleValue = getDecimalDef().getZoned().toDouble(value);
		}
		
		_writeNumber(doubleValue, false);
	}

	@Override
	protected void _write(byte[] value) {
		eval(getDecimalDef().getZoned().toDouble(value));
	}

	/*
	@Override
	protected final byte[] _toBytes(DataSpecial value) {

		byte[] bytes = new byte[getLength()];
		switch (value) {
		case LOVAL:
			Arrays.fill(bytes, LOVAL);
			break;
		case BLANK:
		case BLANKS:
			Arrays.fill(bytes, NIOCharacterImpl.INIT);
			break;
		case OFF:
		case ZERO:
		case ZEROS:
			Arrays.fill(bytes, INIT);
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

		bytes[bytes.length - 1] = 0x0F;
		return bytes;
	}
	*/

	@Override
	protected final byte[] _toBytes(DataSpecial value) {

		byte[] bytes = new byte[getLength()];
		switch (value) {
		case LOVAL:
			Arrays.fill(bytes, HIVAL);
			bytes[bytes.length - 1] = LOVAL;
			break;
		case BLANK:
		case BLANKS:
			Arrays.fill(bytes, NIOCharacterImpl.INIT);
			break;
		case OFF:
		case ZERO:
		case ZEROS:
			Arrays.fill(bytes, NIODecimalImpl.INIT);
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

		NIOBinaryImpl number = new NIOBinaryImpl(getDataContext(), _type, isSigned(), true);
		if (asShort() > 0)
			number.eval(this);
		else
			number.eval(this.asDouble() * -1);

		return number;
	}
	
	@Override
	protected NIODataImpl _copy(QDataContext dataContext) {
		NIOBinaryImpl copy = new NIOBinaryImpl(dataContext, _type, _unsigned, false);
		return copy;
	}
}