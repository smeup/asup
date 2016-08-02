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

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.smeup.sys.il.data.BufferedElementType;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.DatetimeFormat;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.DecimalType;

public abstract class NIONumericImpl extends NIOBufferedElementImpl implements QNumeric {

	private static final long serialVersionUID = 1L;
	protected static final byte INIT = (byte) 0xF0;

	public NIONumericImpl(final QDataContext dataContext) {
		super(dataContext);
	}

	@Override
	public final QBufferedData eval(final DataSpecial value) {
		_write(_toBytes(value));
		return this;
	}

	@Override
	protected final void _clear() {
		eval(0);
	}

	@Override
	protected final byte[] _toBytes(final Number value) {
		return _toBytes(value.toString());
	}

	@Override
	protected final byte[] _toBytes(final QDatetime value) {
		return value.asBytes();
	}

	@Override
	protected final byte[] _toBytes(final QNumeric value) {
		return value.asBytes();
	}

	@Override
	protected final byte[] _toBytes(final QString value) {
		final byte[] bytes = value.asBytes();
		for (int i = 0; i < bytes.length; i++)
			if (bytes[i] == NIOStringImpl.INIT)
				bytes[i] = NIONumericImpl.INIT;

		return bytes;
	}

	@Override
	protected final byte[] _toBytes(final String value) {
		return value.getBytes(getDataContext().getCharset());
	}

	protected abstract void _writeNumber(Number number, boolean halfAdjust);

	protected abstract Number _readNumber();

	@Override
	public final double asDouble() {
		return _readNumber().doubleValue();
	}

	@Override
	public final int asInteger() {
		return _readNumber().intValue();
	}

	@Override
	public final long asLong() {
		return _readNumber().longValue();
	}

	@Override
	public final Number asNumber() {
		return _readNumber();
	}

	@Override
	public final short asShort() {
		return _readNumber().shortValue();
	}

	protected final int compareNumber(final Number value) {
		final double d1 = asDouble();
		final double d2 = value.doubleValue();

		final int result = Double.compare(d1, d2);

		return result;
	}

	@Override
	public final double d() {
		return asDouble();
	}

	@Override
	public final QNumeric divide(final Number value) {
		return divide(value, false);
	}

	@Override
	public final QNumeric divide(final Number value, final boolean halfAdjust) {
		eval(asDouble() / value.doubleValue(), halfAdjust);
		return this;
	}

	@Override
	public final QNumeric divide(final Number value, final QNumeric remainderTarget) {
		qDivOperation(value, remainderTarget);
		return this;
	}

	@Override
	public final QNumeric divide(final QNumeric value) {
		return divide(value, false);
	}

	@Override
	public final QNumeric divide(final QNumeric value, final QNumeric remainderTarget) {
		qDivOperation(value.asDouble(), remainderTarget);
		return this;
	}

	@Override
	public final QNumeric divide(final QNumeric value, final boolean halfAdjust) {
		eval(asDouble() / value.asDouble(), halfAdjust);
		return this;
	}

	@Override
	public final boolean eq(final Number value) {
		return compareNumber(value) == 0;
	}

	@Override
	public final boolean eq(final QNumeric value) {
		return compareNumber(value.asDouble()) == 0;
	}

	@Override
	public final void eval(final Number value) {
		eval(value, false);
	}

	@Override
	public final void eval(final Number value, final boolean halfAdjust) {
		_writeNumber(value, halfAdjust);
	}

	@Override
	public final void eval(final QNumeric value) {
		eval(value, false);
	}

	@Override
	public final void eval(final QNumeric value, final boolean halfAdjust) {
		_writeNumber(value.asNumber(), halfAdjust);
	}

	@Override
	public final void eval(final Number value, final boolean halfAdjust, final boolean maxPrecision) {
		_writeNumber(value, halfAdjust);
	}

	@Override
	public final void eval(final QNumeric value, final boolean halfAdjust, final boolean maxPrecision) {
		_writeNumber(value.asDouble(), halfAdjust);
	}

	@Override
	public final void eval(final QScroller<? extends QNumeric> value) {
		eval(value.current(), false);
	}

	@Override
	public final boolean ge(final Number value) {
		return compareNumber(value) >= 0;
	}

	@Override
	public final boolean ge(final QNumeric value) {
		return compareNumber(value.asDouble()) >= 0;
	}

	@Override
	public final BufferedElementType getBufferedElementType() {
		return BufferedElementType.NUMERIC;
	}

	@Override
	public final boolean gt(final Number value) {
		return compareNumber(value) > 0;
	}

	@Override
	public final boolean gt(final QNumeric value) {
		return compareNumber(value.asDouble()) > 0;
	}

	@Override
	public final int i() {
		return asInteger();
	}

	@Override
	public final boolean isEmpty() {
		try {
			return eq(0);
		} catch (final Exception e) {
			return true;
		}
	}

	@Override
	public final long l() {
		return asLong();
	}

	@Override
	public final boolean le(final Number value) {
		return compareNumber(value) <= 0;
	}

	@Override
	public final boolean le(final QNumeric value) {
		return compareNumber(value.asDouble()) <= 0;
	}

	@Override
	public final boolean lt(final Number value) {
		return compareNumber(value) < 0;
	}

	@Override
	public final boolean lt(final QNumeric value) {
		return compareNumber(value.asDouble()) < 0;
	}

	@Override
	public final QNumeric minus(final Number value) {
		return minus(value, false);
	}

	@Override
	public final QNumeric minus(final Number value, final boolean halfAdjust) {
		eval(asDouble() - value.doubleValue());
		return this;
	}

	@Override
	public final QNumeric minus(final QNumeric value) {
		return minus(value, false);
	}

	@Override
	public final QNumeric minus(final QNumeric value, final boolean halfAdjust) {
		eval(asDouble() - value.asDouble(), halfAdjust);
		return this;
	}

	@Override
	public final QNumeric mult(final Number value) {
		return mult(value, false);
	}

	@Override
	public final QNumeric mult(final Number value, final boolean halfAdjust) {
		eval(asDouble() * value.doubleValue(), halfAdjust);
		return this;
	}

	@Override
	public final QNumeric mult(final QNumeric value) {
		return mult(value, false);
	}

	@Override
	public final QNumeric mult(final QNumeric value, final boolean halfAdjust) {
		eval(asDouble() * value.asDouble(), halfAdjust);
		return this;
	}

	@Override
	public final Number n() {
		return asNumber();
	}

	@Override
	public final boolean ne(final Number value) {
		return !eq(value);
	}

	@Override
	public final boolean ne(final QNumeric value) {
		return !eq(value);
	}

	@Override
	public final QNumeric plus(final Number value) {
		return plus(value, false);
	}

	@Override
	public final QNumeric plus(final Number value, final boolean halfAdjust) {
		eval(asDouble() + value.doubleValue(), halfAdjust);
		return this;
	}

	@Override
	public final QNumeric plus(final QNumeric value) {
		return plus(value, false);
	}

	@Override
	public final QNumeric plus(final QNumeric value, final boolean halfAdjust) {
		eval(asDouble() + value.asDouble(), halfAdjust);
		return this;
	}

	@Override
	public final QNumeric power(final Number value) {
		eval(asLong() ^ value.longValue());
		return this;
	}

	@Override
	public final QNumeric power(final QNumeric value) {
		eval(asLong() ^ value.asLong());
		return this;
	}

	@Override
	public final QDatetime qDate(final DatetimeFormat format) {
		throw new IntegratedLanguageDataRuntimeException("Unexpected condition ew8978wre8qwetr");
	}

	@Override
	public final QNumeric qDiv(final Number value) {
		return qDivOperation(value, null);
	}

	@Override
	public final QNumeric qDiv(final Number value, final QNumeric remainderTarget) {
		return qDivOperation(value, remainderTarget);
	}

	@Override
	public final QNumeric qDiv(final QNumeric value) {
		return qDivOperation(value.asDouble(), null);
	}

	@Override
	public final QNumeric qDiv(final QNumeric value, final QNumeric remainderTarget) {
		return qDivOperation(value.asDouble(), remainderTarget);
	}

	private final QNumeric qDivOperation(final Number value, final QNumeric remainderTarget) {

		final QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
		number.eval(asDouble() / value.doubleValue());
		
		if (remainderTarget != null)
			remainderTarget.eval(asDouble() % value.doubleValue());
		
		return number;
	}

	@Override
	public final QNumeric qInt() {
		return qIntOperation(this.asDouble(), false);
	}

	@Override
	public final QNumeric qInth() {
		return qIntOperation(this.asDouble(), true);
	}

	private final QNumeric qIntOperation(final Number value, final boolean roundingMode) {

		final QDecimal number = getDataContext().getDataFactory().createDecimal(15, 0, DecimalType.ZONED, true);
		number.eval(value.doubleValue());
		
		return number;
	}

	@Override
	public final QNumeric qMinus(final Number value) {
		return qMinusOperation(value);
	}

	@Override
	public final QNumeric qMinus(final QNumeric value) {
		return qMinusOperation(value.asDouble());
	}

	private final QNumeric qMinusOperation(final Number value) {

		final QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
		number.eval(asDouble() - value.doubleValue());
		return number;
	}

	@Override
	public final QNumeric qMult(final Number value) {
		return qMultOperation(value);
	}

	@Override
	public final QNumeric qMult(final QNumeric value) {
		return qMultOperation(value.asDouble());
	}

	private final QNumeric qMultOperation(final Number value) {

		final QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);		
		number.eval(asDouble() * value.doubleValue());
		
		return number;
	}

	@Override
	public final QNumeric qPlus(final Number value) {
		return qPlusOperation(value);
	}

	@Override
	public final QNumeric qPlus(final QNumeric value) {
		return qPlusOperation(value.asDouble());
	}

	private final QNumeric qPlusOperation(final Number value) {
		
		final QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
		number.eval(asDouble() + value.doubleValue());
		
		return number;
	}

	@Override
	public final QNumeric qRem(final Number value) {
		return qRemOperation(value);
	}

	@Override
	public final QNumeric qRem(final QNumeric value) {
		return qRemOperation(value.asDouble());
	}

	private final QNumeric qRemOperation(final Number value) {

		final QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
		number.eval(asDouble() % value.doubleValue());
		
		return number;
	}

	@Override
	public final void time() {

		// TODO verify
		final Calendar CALENDAR = Calendar.getInstance();
		if (getLength() == 14)
			eval(Long.parseLong(new SimpleDateFormat("HHmmssddMMyyyy").format(CALENDAR.getTime())));
		else if (getLength() == 12)
			eval(Long.parseLong(new SimpleDateFormat("HHmmssddMMyy").format(CALENDAR.getTime())));
		else if (getLength() == 6)
			eval(Long.parseLong(new SimpleDateFormat("HHmmss").format(CALENDAR.getTime())));
		else
			System.err.println("Unknown length: " + getLength());
	}

	@Override
	public final String toString() {
		try {
			return _readNumber().toString();
		} catch (final Exception e) {
			return "error";
		}
	}

	@Override
	public final void xfoot(final QArray<? extends QNumeric> array) {
		xfoot(array, false);
	}

	@Override
	public final void xfoot(final QArray<? extends QNumeric> array, final boolean halfAdjust) {
		for (final QNumeric numeric : array)
			this.plus(numeric, halfAdjust);
	}

	@Override
	public final QDecimal qAbs() {

		final QDecimal number = new NIODecimalZonedImpl(getDataContext(), getLength(), 0, true);
		if (ge(DataSpecial.ZEROS))
			number.eval(this);
		else
			number.eval(mult(-1));

		return number;
	}

	@Override
	public final QArray<QDecimal> qMult(final QArray<? extends QNumeric> value) {

		@SuppressWarnings("unchecked")
		final NIOArrayImpl<QDecimal> arrayValue = (NIOArrayImpl<QDecimal>) value;
		final NIOArrayImpl<QDecimal> newArray = new NIOArrayImpl<QDecimal>(getDataContext(), arrayValue.getModel(), arrayValue.capacity(), arrayValue.getSortDirection(), true);
		newArray.movea(this);
		newArray.mult(this);

		return newArray;
	}

	@Override
	public final void reset() {

		final QBufferedData snapData = getDataContext().getSnap(this);
		if (snapData != null)
			NIOBufferHelper.write(this, snapData);
		else
			clear();
	}
}