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
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.DecimalType;

public abstract class NIONumericImpl extends NIOBufferedElementImpl implements QNumeric {

	private static final long serialVersionUID = 1L;

	
	public NIONumericImpl(QDataContext dataContext) {
		super(dataContext);
	}

	@Override
	public final QBufferedData eval(DataSpecial value) {
		_write(_toBytes(value));
		return this;
	}

	@Override
	protected void _clear() {
		eval(0);
	}

	@Override
	protected final byte[] _toBytes(Number value) {
		return _toBytes(value.toString());
	}

	@Override
	protected final byte[] _toBytes(QDatetime value) {
		return value.asBytes();
	}

	@Override
	protected final byte[] _toBytes(QNumeric value) {
		return value.asBytes();
	}

	@Override
	protected final byte[] _toBytes(QString value) {
		return value.asBytes();
	}

	@Override
	protected final byte[] _toBytes(String value) {
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
	
	protected final int compareNumber(Number value) {
		double d1 = asDouble();
		double d2 = value.doubleValue();

		int result = Double.compare(d1, d2);

		return result;
	}

	@Override
	public void check(QCharacter comparator, QCharacter base) {
		eval(comparator.qCheck(base));
	}

	@Override
	public void check(String comparator, QCharacter base) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheck(base));
	}

	@Override
	public void check(QCharacter comparator, QCharacter base, QIndicator found) {
		eval(comparator.qCheck(base, found));
	}

	@Override
	public void check(String comparator, QCharacter base, QIndicator found) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheck(base, found));
	}

	@Override
	public void check(QCharacter comparator, QCharacter base, QNumeric start) {
		eval(comparator.qCheck(base, start));
	}

	@Override
	public void check(String comparator, QCharacter base, QNumeric start) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheck(base, start));
	}

	@Override
	public void check(QCharacter comparator, QCharacter base, QNumeric start, QIndicator found) {
		eval(comparator.qCheck(base, start, found));
	}

	@Override
	public void check(String comparator, QCharacter base, QNumeric start, QIndicator found) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheck(base, start, found));
	}

	@Override
	public void check(QCharacter comparator, QCharacter base, Number start) {
		eval(comparator.qCheck(base, start));
	}

	@Override
	public void check(String comparator, QCharacter base, Number start) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheck(base, start));
	}

	@Override
	public void check(QCharacter comparator, QCharacter base, Number start, QIndicator found) {
		eval(comparator.qCheck(base, start, found));
	}

	@Override
	public void check(String comparator, QCharacter base, Number start, QIndicator found) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheck(base, start, found));
	}

	@Override
	public void check(QCharacter comparator, String base) {
		eval(comparator.qCheck(base));
	}

	@Override
	public void check(String comparator, String base) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheck(base));
	}

	@Override
	public void check(QCharacter comparator, String base, QIndicator found) {
		eval(comparator.qCheck(base, found));
	}

	@Override
	public void check(String comparator, String base, QIndicator found) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheck(base, found));
	}

	@Override
	public void check(QCharacter comparator, String base, QNumeric start) {
		eval(comparator.qCheck(base, start));
	}

	@Override
	public void check(String comparator, String base, QNumeric start) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheck(base, start));
	}

	@Override
	public void check(QCharacter comparator, String base, QNumeric start, QIndicator found) {
		eval(comparator.qCheck(base, start, found));
	}

	@Override
	public void check(String comparator, String base, QNumeric start, QIndicator found) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheck(base, start, found));
	}

	@Override
	public void check(QCharacter comparator, String base, Number start) {
		eval(comparator.qCheck(base, start));
	}

	@Override
	public void check(String comparator, String base, Number start) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheck(base, start));
	}

	@Override
	public void check(QCharacter comparator, String base, Number start, QIndicator found) {
		eval(comparator.qCheck(base, start, found));
	}

	@Override
	public void check(String comparator, String base, Number start, QIndicator found) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheck(base, start, found));
	}

	@Override
	public void checkr(QCharacter comparator, QCharacter base) {
		eval(comparator.qCheckr(base));
	}

	@Override
	public void checkr(String comparator, QCharacter base) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheckr(base));
	}

	@Override
	public void checkr(QCharacter comparator, QCharacter base, QIndicator found) {
		eval(comparator.qCheckr(base, found));	}

	@Override
	public void checkr(String comparator, QCharacter base, QIndicator found) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheckr(base, found));
	}

	@Override
	public void checkr(QCharacter comparator, QCharacter base, QNumeric start) {
		eval(comparator.qCheckr(base, start));	}

	@Override
	public void checkr(String comparator, QCharacter base, QNumeric start) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheckr(base, start));
	}

	@Override
	public void checkr(QCharacter comparator, QCharacter base, QNumeric start, QIndicator found) {
		eval(comparator.qCheckr(base, start, found));
	}

	@Override
	public void checkr(String comparator, QCharacter base, QNumeric start, QIndicator found) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheckr(base, start, found));
	}

	@Override
	public void checkr(QCharacter comparator, QCharacter base, Number start) {
		eval(comparator.qCheckr(base, start));
	}

	@Override
	public void checkr(String comparator, QCharacter base, Number start) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheckr(base, start));
	}

	@Override
	public void checkr(QCharacter comparator, QCharacter base, Number start, QIndicator found) {
		eval(comparator.qCheckr(base, start, found));
	}

	@Override
	public void checkr(String comparator, QCharacter base, Number start, QIndicator found) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheckr(base, start, found));
	}

	@Override
	public void checkr(QCharacter comparator, String base) {
		eval(comparator.qCheckr(base));
	}

	@Override
	public void checkr(String comparator, String base) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheckr(base));
	}

	@Override
	public void checkr(QCharacter comparator, String base, QIndicator found) {
		eval(comparator.qCheckr(base, found));
	}

	@Override
	public void checkr(String comparator, String base, QIndicator found) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheckr(base, found));
	}

	@Override
	public void checkr(QCharacter comparator, String base, QNumeric start) {
		eval(comparator.qCheckr(base, start));
	}

	@Override
	public void checkr(String comparator, String base, QNumeric start) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheckr(base, start));
	}

	@Override
	public void checkr(QCharacter comparator, String base, QNumeric start, QIndicator found) {
		eval(comparator.qCheckr(base, start, found));
	}

	@Override
	public void checkr(String comparator, String base, QNumeric start, QIndicator found) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheckr(base, start, found));
	}

	@Override
	public void checkr(QCharacter comparator, String base, Number start) {
		eval(comparator.qCheckr(base, start));
	}

	@Override
	public void checkr(String comparator, String base, Number start) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheckr(base, start));
	}

	@Override
	public void checkr(QCharacter comparator, String base, Number start, QIndicator found) {
		eval(comparator.qCheckr(base, start, found));
	}

	@Override
	public void checkr(String comparator, String base, Number start, QIndicator found) {
		QCharacter character = getDataContext().getDataFactory().createCharacter(comparator.length(), false, true);
		character.eval(comparator);
		eval(character.qCheckr(base, start, found));
	}
	
	@Override
	public final double d() {
		return asDouble();
	}

	@Override
	public final QNumeric divide(Number value) {
		return divide(value, false);
	}

	@Override
	public final QNumeric divide(Number value, boolean halfAdjust) {
		eval(asDouble() / value.doubleValue(), halfAdjust);
		return this;
	}

	@Override
	public final QNumeric divide(Number value, QNumeric remainderTarget) {		
		qDivOperation(value, remainderTarget);
		return this;
	}

	@Override
	public final QNumeric divide(QNumeric value) {
		return divide(value, false);
	}

	@Override
	public final QNumeric divide(QNumeric value, QNumeric remainderTarget) {
		qDivOperation(value.asDouble(), remainderTarget);
		return this;
	}

	@Override
	public final QNumeric divide(QNumeric value, boolean halfAdjust) {
		eval(asDouble() / value.asDouble(), halfAdjust);
		return this;
	}

	@Override
	public final boolean eq(Number value) {
		return compareNumber(value) == 0;
	}

	@Override
	public final boolean eq(QNumeric value) {
		return compareNumber(value.asDouble()) == 0;
	}

	@Override
	public final void eval(Number value) {
		eval(value, false);
	}

	@Override
	public final void eval(Number value, boolean halfAdjust) {
		_writeNumber(value, halfAdjust);		
	}

	@Override
	public final void eval(QNumeric value) {
		eval(value, false);
	}

	@Override
	public final void eval(QNumeric value, boolean halfAdjust) {
		_writeNumber(value.asNumber(), halfAdjust);
	}

	@Override
	public void eval(Number value, boolean halfAdjust, boolean maxPrecision) {
		_writeNumber(value, halfAdjust);
	}

	@Override
	public void eval(QNumeric value, boolean halfAdjust, boolean maxPrecision) {
		_writeNumber(value.asDouble(), halfAdjust);
	}

	@Override
	public boolean ge(Number value) {
		return compareNumber(value) >= 0;
	}

	@Override
	public final boolean ge(QNumeric value) {
		return compareNumber(value.asDouble()) >= 0;
	}

	@Override
	public final BufferedElementType getBufferedElementType() {
		return BufferedElementType.NUMERIC;
	}

	@Override
	public final boolean gt(Number value) {
		return compareNumber(value) > 0;
	}

	@Override
	public final boolean gt(QNumeric value) {
		return compareNumber(value.asDouble()) > 0;
	}

	@Override
	public final int i() {
		return asInteger();
	}

	@Override
	public final boolean isEmpty() {

		for (byte b : asBytes())
			if (b != getFiller())
				return false;
		return true;
	}

	@Override
	public final long l() {
		return asLong();
	}

	@Override
	public final boolean le(Number value) {
		return compareNumber(value) <= 0;
	}

	@Override
	public final boolean le(QNumeric value) {
		return compareNumber(value.asDouble()) <= 0;
	}

	@Override
	public final boolean lt(Number value) {
		return compareNumber(value) < 0;
	}

	@Override
	public final boolean lt(QNumeric value) {
		return compareNumber(value.asDouble()) < 0;
	}

	@Override
	public final QNumeric minus(Number value) {
		return minus(value, false);
	}

	@Override
	public final QNumeric minus(Number value, boolean halfAdjust) {
		eval(asDouble() - value.doubleValue());
		return this;
	}

	@Override
	public final QNumeric minus(QNumeric value) {
		return minus(value, false);
	}

	@Override
	public final QNumeric minus(QNumeric value,  boolean halfAdjust) {
		eval(asDouble() - value.asDouble(), halfAdjust);
		return this;
	}

	@Override
	public final QNumeric mult(Number value) {
		return mult(value, false);
	}

	@Override
	public final QNumeric mult(Number value,  boolean halfAdjust) {
		eval(asDouble() * value.doubleValue(), halfAdjust);
		return this;
	}

	@Override
	public final QNumeric mult(QNumeric value) {
		return mult(value, false);
	}

	@Override
	public final QNumeric mult(QNumeric value, boolean halfAdjust) {
		eval(asDouble() * value.asDouble(), halfAdjust);
		return this;
	}
	
	@Override
	public final Number n() {
		return asNumber();
	}
	
	@Override
	public final boolean ne(Number value) {
		return !eq(value);
	}

	@Override
	public final boolean ne(QNumeric value) {
		return !eq(value);
	}

	@Override
	public final QNumeric plus(Number value) {
		return plus(value, false);
	}

	@Override
	public final QNumeric plus(Number value, boolean halfAdjust) {
		eval(asDouble() + value.doubleValue(), halfAdjust);
		return this;
	}

	@Override
	public final QNumeric plus(QNumeric value) {
		return plus(value, false);
	}

	@Override
	public final QNumeric plus(QNumeric value, boolean halfAdjust) {
		eval(asDouble() + value.asDouble(), halfAdjust);
		return this;
	}

	@Override
	public final QNumeric power(Number value) {
		eval(asLong() ^ value.longValue());
		return this;
	}

	@Override
	public final QNumeric power(QNumeric value) {
		eval(asLong() ^ value.asLong());
		return this;
	}

	@Override
	public final QDatetime qDate(DatetimeFormat format) {
		throw new IntegratedLanguageDataRuntimeException("Unexpected condition ew8978wre8qwetr");
	}

	@Override
	public final QNumeric qDiv(Number value) {
		return qDivOperation(value, null);
	}

	@Override
	public final QNumeric qDiv(Number value, QNumeric remainderTarget) {
		return qDivOperation(value, remainderTarget);
	}

	@Override
	public final QNumeric qDiv(QNumeric value) {
		return qDivOperation(value.asDouble(), null);
	}

	@Override
	public final QNumeric qDiv(QNumeric value, QNumeric remainderTarget) {
		return qDivOperation(value.asDouble(), remainderTarget);
	}

	private QNumeric qDivOperation(Number value, QNumeric remainderTarget) {
		
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);		
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

	private QNumeric qIntOperation(Number value, boolean roundingMode) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 0, DecimalType.ZONED, true);
		number.eval(value.doubleValue());
		return number;
	}

	@Override
	public final QNumeric qMinus(Number value) {
		return qMinusOperation(value);
	}

	@Override
	public final QNumeric qMinus(QNumeric value) {
		return qMinusOperation(value.asDouble());
	}

	private QNumeric qMinusOperation(Number value) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
		number.eval(asDouble() - value.doubleValue());
		return number;
	}

	@Override
	public final QNumeric qMult(Number value) {
		return qMultOperation(value);
	}

	@Override
	public final QNumeric qMult(QNumeric value) {
		return qMultOperation(value.asDouble());
	}

	private QNumeric qMultOperation(Number value) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
		number.eval(asDouble() * value.doubleValue());
		return number;
	}

	@Override
	public final QNumeric qPlus(Number value) {
		return qPlusOperation(value);
	}

	@Override
	public final QNumeric qPlus(QNumeric value) {
		return qPlusOperation(value.asDouble());
	}

	private QNumeric qPlusOperation(Number value) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
		number.eval(asDouble() + value.doubleValue());
		return number;
	}

	@Override
	public final QNumeric qRem(Number value) {
		return qRemOperation(value);
	}

	@Override
	public final QNumeric qRem(QNumeric value) {
		return qRemOperation(value.asDouble());
	}

	private QNumeric qRemOperation(Number value) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
		number.eval(asDouble() % value.doubleValue());
		return number;
	}
	
	@Override
	public final QNumeric qUns() {

		NIONumericImpl number = (NIONumericImpl) copy();
		number.allocate();

		if (asShort() > 0)
			number.eval(this);
		else
			number.eval(this.asDouble() * -1);

		return number;
	}

	@Override
	public void time() {

		// TODO verify
		Calendar CALENDAR = Calendar.getInstance();
		if (getLength() == 14) {
			eval(Long.parseLong(new SimpleDateFormat("HHmmssddMMyyyy").format(CALENDAR.getTime())));
		} else if (getLength() == 12) {
			eval(Long.parseLong(new SimpleDateFormat("HHmmssddMMyy").format(CALENDAR.getTime())));
		} else if (getLength() == 6) {
			eval(Long.parseLong(new SimpleDateFormat("HHmmss").format(CALENDAR.getTime())));
		} else
			System.err.println("Unknown length: " + getLength());
	}

	@Override
	public final String toString() {
		try {
			return _readNumber().toString();
		} catch (Exception e) {
			return "error";
		}
	}

	@Override
	public final void xfoot(QArray<? extends QNumeric> array) {
		xfoot(array, false);
	}

	@Override
	public final void xfoot(QArray<? extends QNumeric> array, boolean halfAdjust) {
		for (QNumeric numeric: array) 
			this.plus(numeric, halfAdjust);
	}

	@Override
	public QNumeric qAbs() {
		if(ge(DataSpecial.ZEROS))
			return this;
		else
			return mult(-1);
	}
}