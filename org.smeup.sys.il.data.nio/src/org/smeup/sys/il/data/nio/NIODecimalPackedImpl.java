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

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;

import org.smeup.sys.il.data.QDataContext;

import com.ibm.as400.access.AS400PackedDecimal;
import com.ibm.as400.access.AS400ZonedDecimal;

public class NIODecimalPackedImpl extends NIODecimalImpl {
	private static final long serialVersionUID = 1L;

	private static final AS400PackedDecimal packeds[][] = new AS400PackedDecimal[50][50];

	private AS400PackedDecimal packed = null;

	public NIODecimalPackedImpl(QDataContext dataContext, int precision, int scale) {
		super(dataContext, precision, scale);

		packed = getDecimal(precision, scale);
	}

	@Override
	public NIODecimalPackedImpl allocate() {
		super.allocate();

		_clear();

		return this;
	}

	@Override
	public int getSize() {
		return packed.getByteLength();
	}

	@Override
	public int getPrecision() {
		return packed.getNumberOfDigits();
	}

	@Override
	public int getScale() {
		return packed.getNumberOfDecimalPositions();
	}

	@Override
	public Number _readNumber() {

		Number result = 0;
		byte[] bytes = NIOBufferHelper.read(getBuffer(), getPosition(), getSize());
		if (getScale() > 0)
			result = packed.toDouble(bytes);
		else
			result = ((Double) packed.toDouble(bytes)).longValue();

		return result;
	}

	@Override
	public void _writeNumber(Number number, boolean halfAdjust) {

		byte[] bytes = null;
		if (halfAdjust) {
			BigDecimal bd = new BigDecimal(number.toString()).setScale(getScale(), RoundingMode.UP);
			bytes = packed.toBytes(bd.doubleValue());
		} else {
			BigDecimal bd = new BigDecimal(number.toString()).setScale(getScale(), RoundingMode.DOWN);
			bytes = packed.toBytes(bd);
		}
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), bytes, true, INIT);
	}

	private AS400PackedDecimal getDecimal(int precision, int scale) {

		AS400PackedDecimal decimal = packeds[precision - 1][scale];

		if (decimal == null)
			synchronized (packeds) {
				decimal = packeds[precision - 1][scale];
				if (decimal == null) {
					decimal = new AS400PackedDecimal(precision, scale);
					decimal.setUseDouble(true);
					packeds[precision - 1][scale] = decimal;
				}
			}

		return decimal;
	}

	@Override
	protected void _fill(byte[] filler, boolean maxLength) {

		ByteBuffer byteBuffer = ByteBuffer.allocate(getLength());
		NIOBufferHelper.fill(byteBuffer, 0, getLength(), filler);

		eval(NIODecimalZonedImpl.getDecimal(getPrecision(), getScale()).toDouble(byteBuffer.array()));
	}

	@Override
	protected void _fillr(byte[] filler, boolean maxLength) {

		ByteBuffer byteBuffer = ByteBuffer.allocate(getLength());
		NIOBufferHelper.fillr(byteBuffer, 0, getLength(), filler);

		eval(NIODecimalZonedImpl.getDecimal(getPrecision(), getScale()).toDouble(byteBuffer.array()));
	}

	@Override
	protected void _move(byte[] value, boolean clear) {

		AS400ZonedDecimal zoned = NIODecimalZonedImpl.getDecimal(getPrecision(), getScale());

		double doubleValue;
		if (getPrecision() > value.length)
			doubleValue = zoned.toDouble(value);
		else
			doubleValue = zoned.toDouble(value, value.length - getPrecision());

		NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), packed.toBytes(doubleValue), clear, getFiller());
	}

	@Override
	protected void _movel(byte[] value, boolean clear) {

		AS400ZonedDecimal zoned = NIODecimalZonedImpl.getDecimal(getPrecision(), getScale());
		double doubleValue = zoned.toDouble(value);

		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), packed.toBytes(doubleValue), clear, getFiller());
	}

	@Override
	protected void _write(byte[] value) {
		AS400ZonedDecimal zoned = NIODecimalZonedImpl.getDecimal(getPrecision(), getScale());
		double doubleValue = zoned.toDouble(value);

		eval(doubleValue);
	}

	@Override
	public byte[] _toBytes() {
		AS400ZonedDecimal zoned = NIODecimalZonedImpl.getDecimal(getPrecision(), getScale());
		return zoned.toBytes(asDouble());
	}
}
