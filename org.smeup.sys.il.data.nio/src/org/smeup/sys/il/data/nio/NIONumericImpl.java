/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QNumeric;

public abstract class NIONumericImpl extends NIOBufferedDataImpl implements QNumeric {

	private static final long serialVersionUID = 1L;

	public NIONumericImpl(QDataContainer dataContainer) {
		super(dataContainer);
	}

	@Override
	public void clear() {
		eval(0);
	}

	@Override
	public double asDouble() {
		return readNumber().doubleValue();
	}

	@Override
	public int asInteger() {
		return readNumber().intValue();
	}

	@Override
	public long asLong() {
		return readNumber().longValue();
	}

	@Override
	public short asShort() {
		return readNumber().shortValue();
	}

	@Override
	public String asString() {
		return new String(asBytes());
	}

	public abstract int compareNumber(Number value);

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		return eq(getPrimitive(value));
	}

	@Override
	public boolean eq(Number value) {
		return compareNumber(value) == 0;
	}

	@Override
	public boolean eq(QNumeric value) {
		return compareNumber(value.asDouble()) == 0;
	}

	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		return ge(getPrimitive(value));
	}

	@Override
	public boolean ge(Number value) {
		return compareNumber(value) >= 0;
	}

	@Override
	public boolean ge(QNumeric value) {
		return compareNumber(value.asDouble()) >= 0;
	}

	private <E extends Enum<E>> Integer getPrimitive(E value) {
		if (value.name().equals("ZEROS"))
			return 0;
		else if (value.name().equals("ZERO"))
			return 0;
		else if (value.name().equals("LOVAL"))
			return Integer.MIN_VALUE;
		else if (value.name().equals("HIVAL"))
			return Integer.MAX_VALUE;

		return 0;
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		return gt(getPrimitive(value));
	}

	@Override
	public boolean gt(Number value) {
		return compareNumber(value) > 0;
	}

	@Override
	public boolean gt(QNumeric value) {
		return compareNumber(value.asDouble()) > 0;
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		return le(getPrimitive(value));
	}

	@Override
	public boolean le(Number value) {
		return compareNumber(value) <= 0;
	}

	@Override
	public boolean le(QNumeric value) {
		return compareNumber(value.asDouble()) <= 0;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		return lt(getPrimitive(value));
	}

	@Override
	public boolean lt(Number value) {
		return compareNumber(value) < 0;
	}

	@Override
	public boolean lt(QNumeric value) {
		return compareNumber(value.asDouble()) < 0;
	}

	@Override
	public QNumeric minus(int value) {
		eval(asDouble() - value);
		return this;
	}

	@Override
	public QNumeric minus(long value) {
		eval(asDouble() - value);
		return this;
	}

	@Override
	public QNumeric minus(QNumeric value) {
		eval(asDouble() - value.asDouble());
		return this;
	}

	@Override
	public QNumeric minus(short value) {
		eval(asDouble() - value);
		return this;
	}

	@Override
	public QNumeric minus(double value) {
		eval(asDouble() - value);
		return this;
	}

	@Override
	public <E extends Enum<E>> void move(E value) {
		move(getPrimitive(value));
	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		move(getPrimitive(value), clear);
	}

	@Override
	public void move(String value, boolean clear) {
		NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), value.getBytes(), clear, getFiller());
	}

	@Override
	public <E extends Enum<E>> void movel(E value) {
		movel(getPrimitive(value));
	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		movel(getPrimitive(value), clear);
	}

	@Override
	public void movel(String value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value.getBytes(), clear, getFiller());
	}

	@Override
	public QNumeric mult(int value) {
		eval(asDouble() * value);
		return this;
	}

	@Override
	public QNumeric mult(long value) {
		eval(asDouble() * value);
		return this;
	}

	@Override
	public QNumeric mult(QNumeric value) {
		eval(asDouble() * value.asDouble());
		return this;
	}

	@Override
	public QNumeric mult(short value) {
		eval(asDouble() * value);
		return this;
	}

	@Override
	public QNumeric mult(double value) {
		eval(asDouble() * value);
		return this;
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		return !eq(value);
	}

	@Override
	public boolean ne(Number value) {
		return !eq(value);
	}

	@Override
	public boolean ne(QNumeric value) {
		return !eq(value);
	}

	@Override
	public QNumeric plus(int value) {
		eval(asDouble() + value);
		return this;
	}

	@Override
	public QNumeric plus(long value) {
		eval(asDouble() + value);
		return this;
	}

	@Override
	public QNumeric plus(QNumeric value) {
		eval(asDouble() + value.asDouble());
		return this;
	}

	@Override
	public QNumeric plus(short value) {
		eval(asDouble() + value);
		return this;
	}

	@Override
	public QNumeric plus(double value) {
		eval(asDouble() + value);
		return this;
	}

	@Override
	public QNumeric power(int value) {
		eval(asLong() ^ value);
		return this;
	}

	@Override
	public QNumeric power(long value) {
		eval(asLong() ^ value);
		return this;
	}

	@Override
	public QNumeric power(QNumeric value) {
		eval(asLong() ^ value.asLong());
		return this;
	}

	@Override
	public QNumeric power(short value) {
		eval(asLong() ^ value);
		return this;
	}

	@Override
	public QNumeric qRem(int value) {
		eval(asDouble() % value);
		return this;
	}

	@Override
	public QNumeric qRem(long value) {
		eval(asDouble() % value);
		return this;
	}

	@Override
	public QNumeric qRem(QNumeric value) {
		eval(asDouble() % value.asDouble());
		return this;
	}

	@Override
	public QNumeric qRem(short value) {
		eval(asDouble() % value);
		return this;
	}

	@Override
	public QNumeric qRem(double value) {
		eval(asDouble() % value);
		return this;
	}

	public abstract Number readNumber();

	@Override
	public String toString() {
		try {
			return readNumber().toString();
		} catch (Exception e) {
			// TODO
			return "";
		}
	}

	public abstract void writeNumber(Number number, String roundingMode);

	@Override
	public double d() {
		return asDouble();
	}

	@Override
	public int i() {
		return asInteger();
	}

	@Override
	public long l() {
		return asLong();
	}

	@Override
	protected byte getFiller() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		Integer number = getPrimitive(value);
		eval(number);
	}

	@Override
	public void eval(double value) {
		eval(value, null);
	}

	@Override
	public void eval(int value) {
		eval(value, null);
	}

	@Override
	public void eval(long value) {
		eval(value, null);
	}

	@Override
	public void eval(QBufferedData value) {
		move(value, true);
	}

	@Override
	public void eval(QNumeric value) {
		eval(value, null);
	}

	@Override
	public void eval(short value) {
		eval(value, null);
	}

	@Override
	public void eval(BigInteger value) {

	}

	@Override
	public void eval(BigDecimal value) {
		eval(value, null);
	}

	@Override
	public void eval(double value, String roundingMode) {
		try {
			writeNumber(value, roundingMode);
		} catch (Exception e) {
			System.out.println("Unexpcted condition: bq5804q956943534");
		}
	}

	@Override
	public void eval(short value, String roundingMode) {
		try {
			writeNumber(value, roundingMode);
		} catch (Exception e) {
			System.out.println("Unexpcted condition: bq5804q956943534");
		}
	}

	@Override
	public void eval(long value, String roundingMode) {
		try {
			writeNumber(value, roundingMode);
		} catch (Exception e) {
			System.out.println("Unexpcted condition: bq5804q956943534");
		}
	}

	@Override
	public void eval(int value, String roundingMode) {
		try {
			writeNumber(value, roundingMode);
		} catch (Exception e) {
			System.out.println("Unexpcted condition: bq5804q956943534");
		}
	}

	@Override
	public void eval(QNumeric value, String roundingMode) {
		// TODO remove
		if (value == null)
			writeNumber(0, null);
		else
			writeNumber(value.asDouble(), roundingMode);
	}

	@Override
	public void eval(BigInteger value, String roundingMode) {
		writeNumber(value, roundingMode);
	}

	@Override
	public void eval(BigDecimal value, String roundingMode) {
		writeNumber(value, roundingMode);
	}

	@Override
	public QNumeric divide(short value) {
		return divide(value, null);
	}

	@Override
	public QNumeric divide(long value) {
		return divide(value, null);
	}

	@Override
	public QNumeric divide(int value) {
		return divide(value, null);
	}

	@Override
	public QNumeric divide(double value) {
		return divide(value, null);
	}

	@Override
	public QNumeric divide(QNumeric value) {
		return divide(value, null);
	}
	

	@Override
	public QNumeric divide(int value, String roundingMode) {
		eval(asDouble() / value);
		return this;
	}

	@Override
	public QNumeric divide(long value, String roundingMode) {
		eval(asDouble() / value);
		return this;
	}

	@Override
	public QNumeric divide(QNumeric value, String roundingMode) {
		eval(asDouble() / value.asDouble());
		return this;
	}

	@Override
	public QNumeric divide(short value, String roundingMode) {
		eval(asDouble() / value);
		return this;
	}

	@Override
	public QNumeric divide(double value, String haslRounding) {
		eval(asDouble() / value);
		return this;
	}
}