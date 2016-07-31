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
import java.nio.ByteBuffer;
import java.text.NumberFormat;

import org.smeup.sys.il.data.QDataContext;

public final class NIODecimalPackedImpl extends NIODecimalImpl {

	private static final long serialVersionUID = 1L;

	public NIODecimalPackedImpl(final QDataContext dataContext, final int precision, final int scale, final boolean allocate) {
		super(dataContext, precision, scale);

		if (allocate) {
			checkAllocation();
			_buffer = ByteBuffer.allocate(getSize());
			_buffer.put(getDecimalDef().getPackedInit());
		}
	}

	public NIODecimalPackedImpl(final QDataContext dataContext, final int value) {
		this(dataContext, 10, 0, true);
		eval(value);
	}

	@Override
	public final int getSize() {
		return getDecimalDef().getPacked().getByteLength();
	}

	@Override
	public final int getPrecision() {
		return getDecimalDef().getPacked().getNumberOfDigits();
	}

	@Override
	public final int getScale() {
		return getDecimalDef().getPacked().getNumberOfDecimalPositions();
	}

	@Override
	public final Number _readNumber() {

		Number result = 0;
		final byte[] bytes = NIOBufferHelper.read(getBuffer(), getPosition(), getSize());
		if (getScale() > 0)
			result = getDecimalDef().getPacked().toDouble(bytes);
		else
			result = ((Double) getDecimalDef().getPacked().toDouble(bytes)).longValue();

		return result;
	}

	@Override
	public final void _writeNumber(final Number number, final boolean halfAdjust) {

		byte[] bytes = null;

		if (halfAdjust) {
			BigDecimal bd = null;
			if (number instanceof BigDecimal)
				bd = (BigDecimal) number;

			if (bd == null || bd.precision() > getPrecision()) {
				final NumberFormat nf = getDecimalDef().getFormatUP();
				bd = new BigDecimal(nf.format(number));
			}

			try {
				bytes = getDecimalDef().getPacked().toBytes(bd);
			} catch (final Exception e) {
				e.toString();
			}
		} else {

			try {
				bytes = getDecimalDef().getPacked().toBytes(number.doubleValue());
				NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), bytes, INIT);
				return;
			} catch (final Exception e) {
			}

			BigDecimal bd = null;
			if (number instanceof BigDecimal)
				bd = (BigDecimal) number;

			if (bd == null || bd.precision() > getPrecision()) {
				final NumberFormat nf = getDecimalDef().getFormatDW();
				bd = new BigDecimal(nf.format(number));
			}

			try {
				bytes = getDecimalDef().getPacked().toBytes(bd);
			} catch (final Exception e) {
				e.toString();
			}
		}
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), bytes, INIT);
	}

	@Override
	protected final void _fill(final byte[] filler, final boolean maxLength) {

		final ByteBuffer byteBuffer = ByteBuffer.allocate(getLength());
		NIOBufferHelper.fill(byteBuffer, 0, getLength(), filler);

		eval(getDecimalDef().getZoned().toDouble(byteBuffer.array()));
	}

	@Override
	protected final void _fillr(final byte[] filler, final boolean maxLength) {

		final ByteBuffer byteBuffer = ByteBuffer.allocate(getLength());
		NIOBufferHelper.fillr(byteBuffer, 0, getLength(), filler);

		eval(getDecimalDef().getZoned().toDouble(byteBuffer.array()));
	}

	@Override
	protected final void _move(final byte[] value, final boolean clear) {

		double doubleValue;
		if (getPrecision() > value.length) {

			final byte[] newValue = asBytes();
			System.arraycopy(value, 0, newValue, getPrecision() - value.length, value.length);

			doubleValue = getDecimalDef().getZoned().toDouble(newValue);
		} else
			doubleValue = getDecimalDef().getZoned().toDouble(value, value.length - getPrecision());

		if (clear)
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), getDecimalDef().getPacked().toBytes(doubleValue), INIT);
		else
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), getDecimalDef().getPacked().toBytes(doubleValue));
	}

	@Override
	protected final void _movel(final byte[] value, final boolean clear) {

		double doubleValue;
		if (getPrecision() > value.length) {
			final byte[] newValue = asBytes();
			System.arraycopy(value, 0, newValue, 0, value.length);

			doubleValue = getDecimalDef().getZoned().toDouble(newValue);
		} else
			doubleValue = getDecimalDef().getZoned().toDouble(value);

		if (clear)
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), getDecimalDef().getPacked().toBytes(doubleValue), INIT);
		else
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), getDecimalDef().getPacked().toBytes(doubleValue));
	}

	@Override
	protected final void _write(final byte[] value) {

		final double doubleValue = getDecimalDef().getZoned().toDouble(value);
		NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), getDecimalDef().getPacked().toBytes(doubleValue), INIT);
	}

	@Override
	public final byte[] _toBytes() {
		return getDecimalDef().getZoned().toBytes(asDouble());
	}

	@Override
	protected final NIODataImpl _copyDef(final QDataContext dataContext) {
		final NIODecimalPackedImpl copy = new NIODecimalPackedImpl(dataContext, getPrecision(), getScale(), false);
		return copy;
	}
}
