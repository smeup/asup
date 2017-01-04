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

import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;

public final class NIODecimalPackedImpl extends NIODecimalImpl {

	private static final long serialVersionUID = 1L;

	public NIODecimalPackedImpl(final QDataContext dataContext, final int precision, final int scale, final boolean allocate) {
		super(dataContext, precision, scale);

		if (allocate)
			_storage = ByteBuffer.allocate(getSize()).put(_decimalDef.packed_init);
	}

	public NIODecimalPackedImpl(final QDataContext dataContext, final int value) {
		super(dataContext, 10, 0);
		
		_storage = ByteBuffer.allocate(getSize());

		eval(value);
	}

	@Override
	public final int getSize() {
		return _decimalDef.packed.getByteLength();
	}

	@Override
	public final int getPrecision() {
		return _decimalDef.packed.getNumberOfDigits();
	}

	@Override
	public final int getScale() {
		return _decimalDef.packed.getNumberOfDecimalPositions();
	}

	@Override
	public final QBufferedData eval(final DataSpecial value) {
		
		switch (value) {
		case ZERO:
		case ZEROS:
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), _decimalDef.packed_init, INIT);
			break;
		case LOVAL:
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), _decimalDef.packed_loval, INIT);
			break;
		case HIVAL:
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), _decimalDef.packed_hival, INIT);
			break;
		case BLANK:
		case BLANKS:
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), _decimalDef.packed_init, INIT);
			break;
		case ON:
		case OFF:
		case NULL:
		case OMIT:
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition 237rv4trewe87vb9stf");
		}

		return this;
	}

	@Override
	public final void clear() {
		NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), _decimalDef.packed_init, INIT);		
	}

	@Override
	protected final void _write(final byte[] value) {
	
		final Object objectValue = NIODecimalDef.getInstance(value.length, 0).zoned.toObject(value);
		NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), _decimalDef.packed.toBytes(objectValue), INIT);
	}

	@Override
	public final byte[] asBytes() {
		return _decimalDef.zoned.toBytes(asNumber());
	}

	@Override
	public final Number _readNumber() {

		final byte[] bytes = NIOBufferHelper.read(getBuffer(), getPosition(), getSize());
		Number result = (Number)_decimalDef.packed.toObject(bytes);

		return result;
	}

	@Override
	public final void _writeNumber(final Number number, final boolean halfAdjust) {

		BigDecimal bd = _toBigDecimal(number, halfAdjust);

		byte[] bytes = null;
		try {
			bytes = _decimalDef.packed.toBytes(bd);
		} catch (final Exception e) {
			e.printStackTrace();
		}

		NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), bytes, INIT);
	}
	
	@Override
	protected final void _fill(final byte[] filler, final boolean maxLength) {

		final ByteBuffer byteBuffer = ByteBuffer.allocate(getLength());
		NIOBufferHelper.fill(byteBuffer, 0, byteBuffer.capacity(), filler);

		eval((Number)_decimalDef.zoned.toObject(byteBuffer.array()));
	}

	@Override
	protected final void _fillr(final byte[] filler, final boolean maxLength) {

		final ByteBuffer byteBuffer = ByteBuffer.allocate(getLength());
		NIOBufferHelper.fillr(byteBuffer, 0, byteBuffer.capacity(), filler);

		eval((Number)_decimalDef.zoned.toObject(byteBuffer.array()));
	}

	@Override
	protected final void _move(final byte[] value, final boolean clear) {
		
		Object objectValue;
		if (getPrecision() > value.length) {

			final byte[] newValue = asBytes();
			System.arraycopy(value, 0, newValue, getPrecision() - value.length, value.length);

			objectValue = _decimalDef.zoned.toObject(newValue);
		} else
			objectValue = _decimalDef.zoned.toObject(value, value.length - getPrecision());

		if (clear)
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), _decimalDef.packed.toBytes(objectValue), INIT);
		else
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), _decimalDef.packed.toBytes(objectValue));		
	}

	@Override
	protected final void _movel(final byte[] value, final boolean clear) {

		Object objectValue;
		if (getPrecision() > value.length) {
			final byte[] newValue = asBytes();
			System.arraycopy(value, 0, newValue, 0, value.length);

			objectValue = _decimalDef.zoned.toObject(newValue);
		} else
			objectValue = _decimalDef.zoned.toObject(value);

		if (clear)
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), _decimalDef.packed.toBytes(objectValue), INIT);
		else
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), _decimalDef.packed.toBytes(objectValue));
	}

	@Override
	protected final NIODataImpl _copyDef(final QDataContext dataContext) {
		final NIODecimalPackedImpl copy = new NIODecimalPackedImpl(dataContext, getPrecision(), getScale(), false);
		return copy;
	}
	
	@Override
	public final void snap() {
		if (!isEmpty())
			_reset = NIOBufferHelper.read(this);
	}
}