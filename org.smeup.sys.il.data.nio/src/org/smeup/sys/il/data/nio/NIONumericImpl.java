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
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.def.DecimalType;

public abstract class NIONumericImpl extends NIOBufferedDataImpl implements QNumeric {

	private static final long serialVersionUID = 1L;

	public NIONumericImpl(QDataContext dataContext) {
		super(dataContext);
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
	public QNumeric divide(short value) {
		return divide(value, (String)null);
	}

	@Override
	public QNumeric divide(short value, String roundingMode) {
		eval(asDouble() / value);
		return this;
	}
	
	@Override
	public QNumeric divide(short value, QNumeric remainderTarget) {
		eval(asDouble() / value);
		remainderTarget.eval(asDouble() % value);
		return this;
	}
	
	@Override
	public QNumeric divide(long value) {
		return divide(value, (String)null);
	}

	@Override
	public QNumeric divide(long value, String roundingMode) {
		eval(asDouble() / value);
		return this;
	}
	
	@Override
	public QNumeric divide(long value, QNumeric remainderTarget) {
		eval(asDouble() / value);
		remainderTarget.eval(asDouble() % value);
		return this;
	}
	
	@Override
	public QNumeric divide(int value) {
		return divide(value, (String)null);
	}

	@Override
	public QNumeric divide(int value, String roundingMode) {
		eval(asDouble() / value);
		return this;
	}

	@Override
	public QNumeric divide(int value, QNumeric remainderTarget) {
		eval(asDouble() / value);
		remainderTarget.eval(asDouble() % value);
		return this;
	}
	
	@Override
	public QNumeric divide(double value) {
		return divide(value, (String)null);
	}

	@Override
	public QNumeric divide(double value, String haslRounding) {
		eval(asDouble() / value);
		return this;
	}

	@Override
	public QNumeric divide(double value, QNumeric remainderTarget) {
		eval(asDouble() / value);
		remainderTarget.eval(asDouble() % value);
		return this;
	}
	
	@Override
	public QNumeric divide(QNumeric value) {
		return divide(value, (String)null);
	}

	@Override
	public QNumeric divide(QNumeric value, String roundingMode) {
		eval(asDouble() / value.asDouble());
		return this;
	}

	@Override
	public QNumeric divide(QNumeric value, QNumeric remainderTarget) {
		eval(asDouble() / value.asDouble());
		remainderTarget.eval(asDouble() % value.asDouble());
		return this;
	}	
	
	@Override
	public QNumeric minus(int value) {
		return minus(value, null);
	}

	@Override
	public QNumeric minus(int value, String roundingMode) {
		eval(asDouble() - value);
		return this;
	}
	

	@Override
	public QNumeric minus(long value) {
		return minus(value, null);
	}

	@Override
	public QNumeric minus(long value, String roundingMode) {
		eval(asDouble() - value);
		return this;
	}

	@Override
	public QNumeric minus(QNumeric value) {
		return minus(value, null);
	}

	@Override
	public QNumeric minus(QNumeric value, String roundingMode) {
		eval(asDouble() - value.asDouble());
		return this;
	}
	
	@Override
	public QNumeric minus(short value) {
		return minus(value, null);
	}

	@Override
	public QNumeric minus(short value, String roundingMode) {
		eval(asDouble() - value);
		return this;
	}

	@Override
	public QNumeric minus(double value) {
		return minus(value, null);
	}

	@Override
	public QNumeric minus(double value, String roundingMode) {
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
		return mult(value, null);
	}

	@Override
	public QNumeric mult(int value, String roundingMode) {
		eval(asDouble() * value);
		return this;
	}

	@Override
	public QNumeric mult(long value) {
		return mult(value, null);
	}

	@Override
	public QNumeric mult(long value, String roundingMode) {
		eval(asDouble() * value);
		return this;
	}
	
	@Override
	public QNumeric mult(QNumeric value) {
		return mult(value, null);
	}

	@Override
	public QNumeric mult(QNumeric value, String roundingMode) {
		eval(asDouble() * value.asDouble());
		return this;
	}

	@Override
	public QNumeric mult(short value) {
		return mult(value, null);
	}

	@Override
	public QNumeric mult(short value, String roundingMode) {
		eval(asDouble() * value);
		return this;
	}
	
	@Override
	public QNumeric mult(double value) {
		return mult(value, null);
	}

	@Override
	public QNumeric mult(double value, String roundingMode) {
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
		return plus(value, null);
	}

	@Override
	public QNumeric plus(int value, String roundingMode) {
		eval(asDouble() + value);
		return this;
	}

	@Override
	public QNumeric plus(long value) {
		return plus(value, null);
	}

	@Override
	public QNumeric plus(long value, String roundingMode) {
		eval(asDouble() + value);
		return this;
	}

	@Override
	public QNumeric plus(QNumeric value) {
		return plus(value, null);
	}

	@Override
	public QNumeric plus(QNumeric value, String roundingMode) {
		eval(asDouble() + value.asDouble());
		return this;
	}

	@Override
	public QNumeric plus(short value) {
		return plus(value, null);
	}

	@Override
	public QNumeric plus(short value, String roundingMode) {
		eval(asDouble() + value);
		return this;
	}

	@Override
	public QNumeric plus(double value) {
		return plus(value, null);
	}

	@Override
	public QNumeric plus(double value, String roundingMode) {
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
		if(Double.isInfinite(value))  {
			System.err.println("Unexpected condition: c4564v94cr9ddvsdcrs");
			return;
		}
		eval(value, (String)null);
	}

	@Override
	public void eval(int value) {
		eval(value, (String)null);
	}

	@Override
	public void eval(long value) {
		eval(value, (String)null);
	}

	@Override
	public void eval(QBufferedData value) {
		move(value, true);
	}

	@Override
	public void eval(QNumeric value) {
		// TODO remove me
		if(value == null) {			
			clear();
			return;
		}
		eval(value, (String)null);
	}

	@Override
	public void eval(short value) {
		eval(value, (String)null);
	}

	@Override
	public void eval(BigInteger value) {

	}

	@Override
	public void eval(BigDecimal value) {
		eval(value, (String)null);
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
	public QNumeric qDiv(short value) {
		return qDivOperation(value, null);
	}

	@Override
	public QNumeric qDiv(short value, QNumeric remainderTarget) {
		return qDivOperation(value, remainderTarget);
	}

	@Override
	public QNumeric qDiv(long value) {
		return qDivOperation(value, null);
	}

	@Override
	public QNumeric qDiv(long value, QNumeric remainderTarget) {
		return qDivOperation(value, remainderTarget);
	}

	@Override
	public QNumeric qDiv(int value) {
		return qDivOperation(value, null);
	}

	@Override
	public QNumeric qDiv(int value, QNumeric remainderTarget) {
		return qDivOperation(value, remainderTarget);
	}

	@Override
	public QNumeric qDiv(double value) {
		return qDivOperation(value, null);
	}

	@Override
	public QNumeric qDiv(double value, QNumeric remainderTarget) {
		return qDivOperation(value, remainderTarget);
	}

	@Override
	public QNumeric qDiv(QNumeric value) {
		return qDivOperation(value.asDouble(), null);
	}

	@Override
	public QNumeric qDiv(QNumeric value, QNumeric remainderTarget) {
		return qDivOperation(value.asDouble(), remainderTarget);
	}

	@Override
	public QNumeric qUns() {

		NIONumericImpl number = (NIONumericImpl) copy();
		number.allocate();
		
		if(asShort() > 0)
			number.eval(this);
		else
			number.eval(this.asDouble()*-1);
			
		return number;
	}

	@Override
	public QNumeric qInt() {
		return qIntOperation(this.asDouble(), false);
	}

	@Override
	public QNumeric qInth() {
		return qIntOperation(this.asDouble(), true);
	}

	private QNumeric qIntOperation(Number value, boolean roundingMode) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 0, DecimalType.ZONED, true);
		number.eval(value.doubleValue());
		return number;
	}
	
	private QNumeric qDivOperation(Number value, QNumeric remainderTarget) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true); 
		number.eval(asDouble() / value.doubleValue());
		if(remainderTarget!=null)
			remainderTarget.eval(asDouble() % value.doubleValue());
		return number;
	}
	
	@Override
	public QNumeric qMinus(short value) {
		return qMinusOperation(value);
	}

	@Override
	public QNumeric qMinus(long value) {
		return qMinusOperation(value);
	}

	@Override
	public QNumeric qMinus(int value) {
		return qMinusOperation(value);
	}

	@Override
	public QNumeric qMinus(double value) {
		return qMinusOperation(value);
	}

	@Override
	public QNumeric qMinus(QNumeric value) {
		return qMinusOperation(value.asDouble());
	}

	private QNumeric qMinusOperation(Number value) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
		number.eval(asDouble() - value.doubleValue());
		return number;
	}

	@Override
	public QNumeric qMult(short value) {
		return qMultOperation(value);
	}

	@Override
	public QNumeric qMult(long value) {
		return qMultOperation(value);
	}

	@Override
	public QNumeric qMult(int value) {
		return qMultOperation(value);
	}

	@Override
	public QNumeric qMult(double value) {
		return qMultOperation(value);
	}

	@Override
	public QNumeric qMult(QNumeric value) {
		return qMultOperation(value.asDouble());
	}

	private QNumeric qMultOperation(Number value) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
		number.eval(asDouble() * value.doubleValue());
		return number;
	}
	
	@Override
	public QNumeric qPlus(short value) {
		return qPlusOperation(value);
	}

	@Override
	public QNumeric qPlus(long value) {
		return qPlusOperation(value);
	}

	@Override
	public QNumeric qPlus(int value) {
		return qPlusOperation(value);
	}

	@Override
	public QNumeric qPlus(double value) {
		return qPlusOperation(value);
	}

	@Override
	public QNumeric qPlus(QNumeric value) {
		return qPlusOperation(value.asDouble());
	}

	private QNumeric qPlusOperation(Number value) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
		number.eval(asDouble() + value.doubleValue());
		return number;
	}
	
	@Override
	public QNumeric qRem(int value) {
		return qRemOperation(value);
	}

	@Override
	public QNumeric qRem(long value) {
		return qRemOperation(value);
	}

	@Override
	public QNumeric qRem(QNumeric value) {
		return qRemOperation(value.asDouble());
	}

	@Override
	public QNumeric qRem(short value) {
		return qRemOperation(value);
	}

	@Override
	public QNumeric qRem(double value) {
		return qRemOperation(value);
	}

	private QNumeric qRemOperation(Number value) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
		number.eval(asDouble() % value.doubleValue());
		return number;
	}
	
	@Override
	public void time() {

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
	public void xfoot(QArray<?> array) {
		xfoot(array, null);
	}

	@Override
	public void xfoot(QArray<?> array, String roundingMode) {
		for(int i=1; i<=array.capacity();i++){
			if(i > array.capacity())
				break;
			((QNumeric)this).plus((QNumeric)array.get(i));
		}
	}
}