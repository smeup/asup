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
import java.math.BigInteger;
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

	protected abstract void _writeNumber(Number number, String roundingMode);
	
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
	public final QNumeric divide(double value) {
		return divide(value, (String) null);
	}

	@Override
	public final QNumeric divide(double value, QNumeric remainderTarget) {
		eval(asDouble() / value);
		remainderTarget.eval(asDouble() % value);
		return this;
	}

	@Override
	public final QNumeric divide(double value, String haslRounding) {
		eval(asDouble() / value);
		return this;
	}

	@Override
	public final QNumeric divide(int value) {
		return divide(value, (String) null);
	}

	@Override
	public final QNumeric divide(int value, QNumeric remainderTarget) {
		eval(asDouble() / value);
		remainderTarget.eval(asDouble() % value);
		return this;
	}

	@Override
	public final QNumeric divide(int value, String roundingMode) {
		eval(asDouble() / value);
		return this;
	}

	@Override
	public final QNumeric divide(long value) {
		return divide(value, (String) null);
	}

	@Override
	public final QNumeric divide(long value, QNumeric remainderTarget) {
		eval(asDouble() / value);
		remainderTarget.eval(asDouble() % value);
		return this;
	}

	@Override
	public final QNumeric divide(long value, String roundingMode) {
		eval(asDouble() / value);
		return this;
	}

	@Override
	public final QNumeric divide(QNumeric value) {
		return divide(value, (String) null);
	}

	@Override
	public final QNumeric divide(QNumeric value, QNumeric remainderTarget) {
		eval(asDouble() / value.asDouble());
		remainderTarget.eval(asDouble() % value.asDouble());
		return this;
	}

	@Override
	public final QNumeric divide(QNumeric value, String roundingMode) {
		eval(asDouble() / value.asDouble());
		return this;
	}

	@Override
	public final QNumeric divide(short value) {
		return divide(value, (String) null);
	}

	@Override
	public final QNumeric divide(short value, QNumeric remainderTarget) {
		eval(asDouble() / value);
		remainderTarget.eval(asDouble() % value);
		return this;
	}

	@Override
	public final QNumeric divide(short value, String roundingMode) {
		eval(asDouble() / value);
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
		eval(value, null);
	}

	@Override
	public final void eval(Number value, String roundingMode) {
		_writeNumber(value, null);		
	}

	@Override
	public final void eval(BigDecimal value) {
		eval(value, (String) null);
	}

	@Override
	public final void eval(BigDecimal value, String roundingMode) {
		_writeNumber(value, roundingMode);
	}

	@Override
	public final void eval(BigInteger value) {
		eval(value, (String) null);
	}

	@Override
	public final void eval(BigInteger value, String roundingMode) {
		_writeNumber(value, roundingMode);
	}

	@Override
	public final void eval(double value) {
		eval(value, (String) null);
	}

	@Override
	public final void eval(double value, String roundingMode) {
		_writeNumber(value, roundingMode);
	}

	@Override
	public final void eval(int value) {
		eval(value, (String) null);
	}

	@Override
	public final void eval(int value, String roundingMode) {
		_writeNumber(value, roundingMode);
	}

	@Override
	public final void eval(long value) {
		eval(value, (String) null);
	}

	@Override
	public final void eval(long value, String roundingMode) {
		_writeNumber(value, roundingMode);
	}

	@Override
	public final void eval(QNumeric value) {
		eval(value, (String) null);
	}

	@Override
	public final void eval(QNumeric value, String roundingMode) {
		_writeNumber(value.asDouble(), roundingMode);
	}

	@Override
	public final void eval(short value) {
		eval(value, (String) null);
	}

	@Override
	public final void eval(short value, String roundingMode) {
		_writeNumber(value, roundingMode);
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
	public final QNumeric minus(double value) {
		return minus(value, null);
	}

	@Override
	public final QNumeric minus(double value, String roundingMode) {
		eval(asDouble() - value);
		return this;
	}

	@Override
	public final QNumeric minus(int value) {
		return minus(value, null);
	}

	@Override
	public final QNumeric minus(int value, String roundingMode) {
		eval(asDouble() - value);
		return this;
	}

	@Override
	public final QNumeric minus(long value) {
		return minus(value, null);
	}

	@Override
	public final QNumeric minus(long value, String roundingMode) {
		eval(asDouble() - value);
		return this;
	}

	@Override
	public final QNumeric minus(QNumeric value) {
		return minus(value, null);
	}

	@Override
	public final QNumeric minus(QNumeric value, String roundingMode) {
		eval(asDouble() - value.asDouble());
		return this;
	}

	@Override
	public final QNumeric minus(short value) {
		return minus(value, null);
	}

	@Override
	public final QNumeric minus(short value, String roundingMode) {
		eval(asDouble() - value);
		return this;
	}

	@Override
	public final QNumeric mult(double value) {
		return mult(value, null);
	}

	@Override
	public final QNumeric mult(double value, String roundingMode) {
		eval(asDouble() * value);
		return this;
	}

	@Override
	public final QNumeric mult(int value) {
		return mult(value, null);
	}

	@Override
	public final QNumeric mult(int value, String roundingMode) {
		eval(asDouble() * value);
		return this;
	}

	@Override
	public final QNumeric mult(long value) {
		return mult(value, null);
	}

	@Override
	public final QNumeric mult(long value, String roundingMode) {
		eval(asDouble() * value);
		return this;
	}

	@Override
	public final QNumeric mult(QNumeric value) {
		return mult(value, null);
	}

	@Override
	public final QNumeric mult(QNumeric value, String roundingMode) {
		eval(asDouble() * value.asDouble());
		return this;
	}

	@Override
	public final QNumeric mult(short value) {
		return mult(value, null);
	}

	@Override
	public final QNumeric mult(short value, String roundingMode) {
		eval(asDouble() * value);
		return this;
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
	public final QNumeric plus(double value) {
		return plus(value, null);
	}

	@Override
	public final QNumeric plus(double value, String roundingMode) {
		eval(asDouble() + value);
		return this;
	}

	@Override
	public final QNumeric plus(int value) {
		return plus(value, null);
	}

	@Override
	public final QNumeric plus(int value, String roundingMode) {
		eval(asDouble() + value);
		return this;
	}

	@Override
	public final QNumeric plus(long value) {
		return plus(value, null);
	}

	@Override
	public final QNumeric plus(long value, String roundingMode) {
		eval(asDouble() + value);
		return this;
	}

	@Override
	public final QNumeric plus(QNumeric value) {
		return plus(value, null);
	}

	@Override
	public final QNumeric plus(QNumeric value, String roundingMode) {
		eval(asDouble() + value.asDouble());
		return this;
	}

	@Override
	public final QNumeric plus(short value) {
		return plus(value, null);
	}

	@Override
	public final QNumeric plus(short value, String roundingMode) {
		eval(asDouble() + value);
		return this;
	}

	@Override
	public final QNumeric power(int value) {
		eval(asLong() ^ value);
		return this;
	}

	@Override
	public final QNumeric power(long value) {
		eval(asLong() ^ value);
		return this;
	}

	@Override
	public final QNumeric power(QNumeric value) {
		eval(asLong() ^ value.asLong());
		return this;
	}

	@Override
	public final QNumeric power(short value) {
		eval(asLong() ^ value);
		return this;
	}

	@Override
	public final QDatetime qDate(DatetimeFormat format) {
		throw new IntegratedLanguageDataRuntimeException("Unexpected condition ew8978wre8qwetr");
	}

	@Override
	public final QNumeric qDiv(double value) {
		return qDivOperation(value, null);
	}

	@Override
	public final QNumeric qDiv(double value, QNumeric remainderTarget) {
		return qDivOperation(value, remainderTarget);
	}

	@Override
	public final QNumeric qDiv(int value) {
		return qDivOperation(value, null);
	}

	@Override
	public final QNumeric qDiv(int value, QNumeric remainderTarget) {
		return qDivOperation(value, remainderTarget);
	}

	@Override
	public final QNumeric qDiv(long value) {
		return qDivOperation(value, null);
	}

	@Override
	public final QNumeric qDiv(long value, QNumeric remainderTarget) {
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

	@Override
	public final QNumeric qDiv(short value) {
		return qDivOperation(value, null);
	}

	@Override
	public final QNumeric qDiv(short value, QNumeric remainderTarget) {
		return qDivOperation(value, remainderTarget);
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
	public final QNumeric qMinus(double value) {
		return qMinusOperation(value);
	}

	@Override
	public final QNumeric qMinus(int value) {
		return qMinusOperation(value);
	}

	@Override
	public final QNumeric qMinus(long value) {
		return qMinusOperation(value);
	}

	@Override
	public final QNumeric qMinus(QNumeric value) {
		return qMinusOperation(value.asDouble());
	}

	@Override
	public final QNumeric qMinus(short value) {
		return qMinusOperation(value);
	}

	private QNumeric qMinusOperation(Number value) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
		number.eval(asDouble() - value.doubleValue());
		return number;
	}

	@Override
	public final QNumeric qMult(double value) {
		return qMultOperation(value);
	}

	@Override
	public final QNumeric qMult(int value) {
		return qMultOperation(value);
	}

	@Override
	public final QNumeric qMult(long value) {
		return qMultOperation(value);
	}

	@Override
	public final QNumeric qMult(QNumeric value) {
		return qMultOperation(value.asDouble());
	}

	@Override
	public final QNumeric qMult(short value) {
		return qMultOperation(value);
	}

	private QNumeric qMultOperation(Number value) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
		number.eval(asDouble() * value.doubleValue());
		return number;
	}

	@Override
	public final QNumeric qPlus(double value) {
		return qPlusOperation(value);
	}

	@Override
	public final QNumeric qPlus(int value) {
		return qPlusOperation(value);
	}

	@Override
	public final QNumeric qPlus(long value) {
		return qPlusOperation(value);
	}

	@Override
	public final QNumeric qPlus(QNumeric value) {
		return qPlusOperation(value.asDouble());
	}

	@Override
	public final QNumeric qPlus(short value) {
		return qPlusOperation(value);
	}

	private QNumeric qPlusOperation(Number value) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
		number.eval(asDouble() + value.doubleValue());
		return number;
	}

	@Override
	public final QNumeric qRem(double value) {
		return qRemOperation(value);
	}

	@Override
	public final QNumeric qRem(int value) {
		return qRemOperation(value);
	}

	@Override
	public final QNumeric qRem(long value) {
		return qRemOperation(value);
	}

	@Override
	public final QNumeric qRem(QNumeric value) {
		return qRemOperation(value.asDouble());
	}

	@Override
	public final QNumeric qRem(short value) {
		return qRemOperation(value);
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
		xfoot(array, null);
	}

	@Override
	public final void xfoot(QArray<? extends QNumeric> array, String roundingMode) {
		for (QNumeric numeric: array) 
			this.plus(numeric, roundingMode);
	}
}