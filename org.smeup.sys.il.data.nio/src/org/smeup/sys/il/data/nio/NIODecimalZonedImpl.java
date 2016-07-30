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

public final class NIODecimalZonedImpl extends NIODecimalImpl {
	private static final long serialVersionUID = 1L;

	public NIODecimalZonedImpl(QDataContext dataContext, int precision, int scale, boolean allocate) {
		super(dataContext, precision, scale);
		
		if(allocate) {
			checkAllocation();		
			_buffer = ByteBuffer.allocate(getSize());
			_buffer.put(getDecimalDef().getZonedInit());
		}
	}

	@Override
	public final int getSize() {
		return getDecimalDef().getZoned().getByteLength();
	}

	@Override
	public final int getPrecision() {
		return getDecimalDef().getZoned().getNumberOfDigits();
	}

	@Override
	public final int getScale() {
		return getDecimalDef().getZoned().getNumberOfDecimalPositions();
	}

	@Override
	public final Number _readNumber() {

		Number result = 0;
		if (getScale() > 0)
			result = getDecimalDef().getZoned().toDouble(asBytes());
		else
			result = ((Double) getDecimalDef().getZoned().toDouble(asBytes())).longValue();

		return result;
	}

	@Override
	public final void _writeNumber(Number number, boolean halfAdjust) {

		byte[] bytes = null;
				
		if (halfAdjust) {

			BigDecimal bd = null;
			if (number instanceof BigDecimal) {
				bd = (BigDecimal) number;
			}
			
			if(bd == null || bd.precision() > getPrecision()) {
				NumberFormat nf = getDecimalDef().getFormatUP();
				bd = new BigDecimal(nf.format(number));					
			}

			try {
				bytes = getDecimalDef().getZoned().toBytes(bd);
			} catch (Exception e) {
				e.toString();
			}
		} else {

			try {
				bytes = getDecimalDef().getZoned().toBytes(number.doubleValue());
				NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), bytes, INIT);
				return;
			}
			catch(Exception e) {
			}			

			BigDecimal bd = null;
			if (number instanceof BigDecimal) {
				bd = (BigDecimal) number;
			}
			
			if(bd == null || bd.precision() > getPrecision()) {
				NumberFormat nf = getDecimalDef().getFormatDW();
				bd = new BigDecimal(nf.format(number));					
			}

			try {
				bytes = getDecimalDef().getZoned().toBytes(bd);
			} catch (Exception e) {
				e.toString();
			}
		}
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), bytes, INIT);
	}

	@Override
	protected final void _fill(byte[] filler, boolean maxLength) {
		NIOBufferHelper.fill(getBuffer(), getPosition(), getSize(), filler);
	}

	@Override
	protected final void _fillr(byte[] filler, boolean maxLength) {
		NIOBufferHelper.fillr(getBuffer(), getPosition(), getSize(), filler);
	}

	@Override
	protected final void _move(byte[] value, boolean clear) {
		if(clear)
			NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value, INIT);
		else
			NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value);
	}

	@Override
	protected final void _movel(byte[] value, boolean clear) {
		if(clear)
			NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value, INIT);
		else
			NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value);
	}

	@Override
	protected final void _write(byte[] value) {
		NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value, INIT);
	}

	@Override
	protected final byte[] _toBytes() {
		return NIOBufferHelper.read(getBuffer(), getPosition(), getLength());
	}
	
	@Override
	protected final NIODataImpl _copyDef(QDataContext dataContext) {
		NIODecimalZonedImpl copy = new NIODecimalZonedImpl(dataContext, getPrecision(), getScale(), false);
		return copy;
	}
}