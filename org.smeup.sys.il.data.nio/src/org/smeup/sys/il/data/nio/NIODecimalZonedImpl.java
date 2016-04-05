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

import org.smeup.sys.il.data.QDataContext;

import com.ibm.as400.access.AS400ZonedDecimal;

public class NIODecimalZonedImpl extends NIODecimalImpl {
	private static final long serialVersionUID = 1L;

	private static final AS400ZonedDecimal zoneds[][] = new AS400ZonedDecimal[50][50];

	private AS400ZonedDecimal zoned = null;

	public NIODecimalZonedImpl(QDataContext dataContext, int precision, int scale) {
		super(dataContext, precision, scale);

		zoned = getDecimal(precision, scale);
	}

	@Override
	public int getSize() {
		return zoned.getByteLength();
	}

	@Override
	public int getPrecision() {
		return zoned.getNumberOfDigits();
	}

	@Override
	public int getScale() {
		return zoned.getNumberOfDecimalPositions();
	}

	@Override
	public Number _readNumber() {

		Number result = 0;
		if (getScale() > 0)
			result = zoned.toDouble(asBytes());
		else
			result = ((Double) zoned.toDouble(asBytes())).longValue();

		return result;
	}

	@Override
	public void _writeNumber(Number number, boolean halfAdjust) {
		
		byte[] bytes = null;
		if(halfAdjust) {
			BigDecimal bd = new BigDecimal(number.doubleValue());
			bytes = zoned.toBytes(bd.setScale(getScale(), RoundingMode.HALF_UP).doubleValue());			
		}
		else {
			bytes = zoned.toBytes(number.doubleValue());			
		}		
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), bytes, true, INIT);
	}

	protected static AS400ZonedDecimal getDecimal(int precision, int scale) {

		AS400ZonedDecimal decimal = zoneds[precision - 1][scale];
		if (decimal == null)
			synchronized (zoneds) {
				decimal = zoneds[precision - 1][scale];
				if (decimal == null) {
					decimal = new AS400ZonedDecimal(precision, scale);
					decimal.setUseDouble(true);
					zoneds[precision - 1][scale] = decimal;
				}
			}

		return decimal;
	}

	@Override
	protected void _fill(byte[] filler, boolean maxLength) {
		NIOBufferHelper.fill(getBuffer(), getPosition(), getSize(), filler);
	}

	@Override
	protected void _fillr(byte[] filler, boolean maxLength) {
		NIOBufferHelper.fillr(getBuffer(), getPosition(), getSize(), filler);
	}

	@Override
	protected void _move(byte[] value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value, clear, getFiller());
	}

	@Override
	protected void _movel(byte[] value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value, clear, getFiller());
	}

	@Override
	protected void _write(byte[] value) {
		NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value, true, getFiller());
	}

	@Override
	protected byte[] _toBytes() {
		return NIOBufferHelper.read(getBuffer(), getPosition(), getLength());
	}
}