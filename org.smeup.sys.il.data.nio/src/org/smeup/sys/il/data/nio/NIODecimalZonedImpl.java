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
import java.text.NumberFormat;

import org.smeup.sys.il.data.QDataContext;

public class NIODecimalZonedImpl extends NIODecimalImpl {
	private static final long serialVersionUID = 1L;

	public NIODecimalZonedImpl(QDataContext dataContext, int precision, int scale) {
		super(dataContext, precision, scale);
	}

	@Override
	public int getSize() {
		return getDecimalDef().getZoned().getByteLength();
	}

	@Override
	public int getPrecision() {
		return getDecimalDef().getZoned().getNumberOfDigits();
	}

	@Override
	public int getScale() {
		return getDecimalDef().getZoned().getNumberOfDecimalPositions();
	}

	@Override
	public Number _readNumber() {

		Number result = 0;
		if (getScale() > 0)
			result = getDecimalDef().getZoned().toDouble(asBytes());
		else
			result = ((Double) getDecimalDef().getZoned().toDouble(asBytes())).longValue();

		return result;
	}

	@Override
	public void _writeNumber(Number number, boolean halfAdjust) {

		byte[] bytes = null;
		if (halfAdjust) {
			NumberFormat nf = getDecimalDef().getFormatUP();
			BigDecimal bd = new BigDecimal(nf.format(number));

			try {
				bytes = getDecimalDef().getZoned().toBytes(bd.setScale(getScale()));
			} catch (Exception e) {
				e.toString();
			}
		} else {
			
			NumberFormat nf = getDecimalDef().getFormatDW();
			BigDecimal bd = new BigDecimal(nf.format(number));

			try {
				bytes = getDecimalDef().getZoned().toBytes(bd);
			} catch (Exception e) {
				e.toString();
			}
		}
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), bytes, true, INIT);
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
		NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value, clear, getFiller());
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