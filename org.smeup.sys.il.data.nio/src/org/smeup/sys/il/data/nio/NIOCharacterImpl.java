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

import java.util.Arrays;

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.DecimalType;

public class NIOCharacterImpl extends NIOStringImpl implements QCharacter {

	private static final long serialVersionUID = 1L;
	protected static final byte INIT = (byte) 64; // 32;

	protected int _length;

	public NIOCharacterImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIOCharacterImpl(QDataContext dataContext, int length) {
		super(dataContext);
		_length = length;
	}

	@Override
	public void assign(QBufferedData target) {
		super.assign(target);
		// TODO remove
		if (target instanceof NIOCharacterVaryingImpl) {
			if(!isNull()) {
				NIOCharacterVaryingImpl nioCharacterVaryingImpl = (NIOCharacterVaryingImpl) target;
				nioCharacterVaryingImpl.eval(this);
			}
		}
	}

	@Override
	public void eval(QIndicator value) {
		movel(value);
	}

	@Override
	public void eval(boolean value) {
		movel(value);
	}

	@Override
	public void eval(String value) {
		movel(value, true);
	}

	@Override
	public void evalr(String value) {
		move(value, true);
	}

	@Override
	public void evalr(QString value) {
		evalr(value.asString());
	}

	@Override
	public int getLength() {
		return _length;
	}

	@Override
	public int getSize() {
		return _length;
	}

	@Override
	public void move(boolean value) {
		NIOBufferHelper.move(getBuffer(), getPosition(), _length, new byte[] { 49 }, true, (byte) 49);
	}

	@Override
	public void move(QDecimal value) {
		move(value, false);
	}

	@Override
	public void move(QDecimal value, boolean clear) {
		NIOBufferHelper.move(getBuffer(), getPosition(), _length, value.asBytes(), clear, INIT);
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
	public void movel(boolean value) {
		if (value)
			NIOBufferHelper.movel(getBuffer(), getPosition(), _length, new byte[] { NIOIndicatorImpl.ON }, true, NIOIndicatorImpl.OFF);
		else
			NIOBufferHelper.movel(getBuffer(), getPosition(), _length, new byte[] { NIOIndicatorImpl.OFF }, true, NIOIndicatorImpl.OFF);
	}

	@Override
	public String asString() {
		return new String(asBytes(), getDataContext().getCharset());
	}

	@Override
	public String toString() {
		return asString();
	}

	@Override
	public String trim() {
		return asString().trim();
	}

	@Override
	public String trimL() {
		return trimL(asString());
	}

	@Override
	public String trimR() {
		return trimR(asString());
	}

	/* cat */
	@Override
	public QCharacter cat(QString factor1) {
		cat(factor1, false);
		return this;
	}

	@Override
	public void cat(QString factor1, boolean clear) {
		if (clear)
			this.clear();
		eval(trimR() + factor1.asString());
	}

	@Override
	public QCharacter cat(String factor1) {
		cat(factor1, false);
		return this;
	}

	@Override
	public void cat(String factor1, boolean clear) {
		cat(factor1, (String) null, (Number) null, clear);
	}

	@Override
	public void cat(String factor1, QString factor2) {
		cat(factor1, factor2.asString(), (Number) null, false);
	}

	@Override
	public void cat(String factor1, QString factor2, boolean clear) {
		cat(factor1, factor2.asString(), (Number) null, clear);
	}

	@Override
	public void cat(QString factor1, QString factor2) {
		cat(factor1.asString(), factor2.asString(), (Number) null, false);
	}

	@Override
	public void cat(QString factor1, QString factor2, boolean clear) {
		cat(factor1.asString(), factor2.asString(), (Number) null, clear);
	}

	@Override
	public void cat(QString factor1, String factor2) {
		cat(factor1.asString(), factor2, (Number) null, false);
	}

	@Override
	public void cat(QString factor1, String factor2, boolean clear) {
		cat(factor1.asString(), factor2, (Number) null, clear);
	}

	@Override
	public void cat(String factor1, String factor2) {
		cat(factor1, factor2, (Number) null, false);
	}

	@Override
	public void cat(String factor1, String factor2, boolean clear) {
		cat(factor1, factor2, (Number) null, clear);
	}

	@Override
	public void cat(QString factor1, Number space) {
		cat(factor1.asString(), space, false);
	}

	@Override
	public void cat(QString factor1, Number space, boolean clear) {
		cat(factor1.asString(), space, clear);
	}

	@Override
	public void cat(QString factor1, QNumeric space) {
		cat(factor1.asString(), space.i(), false);
	}

	@Override
	public void cat(QString factor1, QNumeric space, boolean clear) {
		cat(factor1.asString(), space.i(), clear);
	}

	@Override
	public void cat(String factor1, QNumeric space) {
		cat(factor1, space.i(), false);
	}

	@Override
	public void cat(String factor1, QNumeric space, boolean clear) {
		cat(factor1, space.i(), clear);
	}

	@Override
	public void cat(String factor1, String factor2, Number space, boolean clear) {
		if (factor2 == null) {
			if (space == null)
				eval(this + factor1);
			else {
				String value = trimR();
				int length = value.length() + space.intValue();
				NIOBufferHelper.movel(getBuffer(), getPosition(), length, value.getBytes(getDataContext().getCharset()), clear, INIT);
				NIOBufferHelper.movel(getBuffer(), getPosition() + length, _length, factor1.getBytes(getDataContext().getCharset()), clear, INIT);
			}
		} else {
			if (space == null)
				eval(factor1 + factor2);
			else {
				String value = factor1.trim();
				int length = value.length() + space.intValue();
				NIOBufferHelper.movel(getBuffer(), getPosition(), length, value.getBytes(getDataContext().getCharset()), clear, INIT);
				NIOBufferHelper.movel(getBuffer(), getPosition() + length, _length, factor2.getBytes(getDataContext().getCharset()), clear, INIT);
			}
		}

	}

	@Override
	public void cat(String factor1, String factor2, QNumeric space) {
		cat(factor1, factor2, space.i(), false);
	}

	@Override
	public void cat(String factor1, String factor2, QNumeric space, boolean clear) {
		cat(factor1, factor2, space.i(), clear);
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space) {
		cat(factor1, factor2.asString(), space.i(), false);
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space, boolean clear) {
		cat(factor1, factor2.asString(), space.i(), clear);
	}

	@Override
	public void cat(QString factor1, QString factor2, QNumeric space) {
		cat(factor1.asString(), factor2.asString(), space.i(), false);
	}

	@Override
	public void cat(QString factor1, QString factor2, QNumeric space, boolean clear) {
		cat(factor1.asString(), factor2.asString(), space.i(), clear);
	}

	@Override
	public void cat(String factor1, Number space) {
		cat(factor1, space, false);
	}

	@Override
	public void cat(String factor1, Number space, boolean clear) {
		cat(factor1, (String) null, space.intValue(), clear);
	}

	@Override
	public void cat(QString factor1, QString factor2, Number space) {
		cat(factor1.asString(), factor2.asString(), space.intValue(), false);
	}

	@Override
	public void cat(QString factor1, QString factor2, Number space, boolean clear) {
		cat(factor1.asString(), factor2.asString(), space.intValue(), clear);
	}

	@Override
	public void cat(QString factor1, String factor2, Number space) {
		cat(factor1.asString(), factor2, space.intValue(), false);
	}

	@Override
	public void cat(QString factor1, String factor2, Number space, boolean clear) {
		cat(factor1.asString(), factor2, space.intValue(), clear);
	}

	@Override
	public void cat(String factor1, String factor2, Number space) {
		cat(factor1, factor2, space.intValue(), false);
	}

	@Override
	public void cat(String factor1, QString factor2, Number space) {
		cat(factor1, factor2.asString(), space.intValue(), false);
	}

	@Override
	public void cat(String factor1, QString factor2, Number space, boolean clear) {
		cat(factor1, factor2.asString(), space, clear);
	}

	@Override
	public boolean eq(String value) {

		return compareString(value) == 0;
	}

	@Override
	public boolean eq(QHexadecimal value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eq(byte value) {
		return compareBytes(asBytes(), new byte[] { value }) == 0;
	}

	@Override
	public boolean ge(String value) {

		return compareString(value) >= 0;
	}

	@Override
	public boolean gt(String value) {
		return compareString(value) > 0;
	}

	@Override
	public boolean le(String value) {
		return compareString(value) <= 0;
	}

	@Override
	public boolean lt(String value) {
		return compareString(value) < 0;
	}

	@Override
	public boolean ne(String value) {
		return !eq(value);
	}

	@Override
	public boolean ne(QHexadecimal value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eq(QString value) {
		return eq(value.asString());
	}

	@Override
	public boolean ge(QString value) {
		return ge(value.asString());
	}

	@Override
	public boolean gt(QString value) {
		return gt(value.asString());
	}

	@Override
	public boolean le(QString value) {
		return le(value.asString());
	}

	@Override
	public boolean lt(QString value) {
		return lt(value.asString());
	}

	@Override
	public boolean ne(QString value) {
		return ne(value.asString());
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
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		eval(getPrimitive(value));
	}

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		return eq(getPrimitive(value));
	}

	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		return ge(getPrimitive(value));
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		return gt(getPrimitive(value));
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		return le(getPrimitive(value));
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		return lt(getPrimitive(value));
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		return ne(getPrimitive(value));
	}

	private <E extends Enum<E>> String getPrimitive(E value) {

		char[] charArray = new char[getLength()];

		if (value.name().equals("BLANKS"))
			Arrays.fill(charArray, ' ');
		else if (value.name().equals("BLANK"))
			Arrays.fill(charArray, ' ');
		// return " ";
		else if (value.name().equals("ZEROS"))
			Arrays.fill(charArray, '0');
		else if (value.name().equals("ZERO"))
			Arrays.fill(charArray, '0');
		// return "0";
		else if (value.name().equals("HIVAL"))
			Arrays.fill(charArray, '9');
		else if (value.name().equals("LOVAL"))
			Arrays.fill(charArray, ' ');
		else if (value.name().equals("ON"))
			Arrays.fill(charArray, '1');
		else if (value.name().equals("OFF"))
			Arrays.fill(charArray, '0');
		else
			"".toCharArray();

		return new String(charArray);
	}

	public static String trimL(String str) {
		int i = 0;
		while (i < str.length() && (Character.isWhitespace(str.charAt(i)) || str.charAt(i) == 0))
			i++;
		return str.substring(i);
	}

	public static String trimR(String str) {
		int i = str.length() - 1;
		while (i >= 0 && (Character.isWhitespace(str.charAt(i)) || str.charAt(i) == 0))
			i--;
		return str.substring(0, i + 1);
	}

	@Override
	public void eval(QString value) {
		movel(value, true);
	}

	@Override
	protected byte getFiller() {
		return INIT;
	}

	// TODO rimosso, introdotto in NioBufferedDataImpl
	// protected String getEncoding() {
	// return ENCODING;
	// }

	@Override
	public void xlate(QString from, QString to, QString source) {
		xlate(from.asString(), to.asString(), source.asString(), 1, false);
	}

	@Override
	public void xlate(String from, String to, QString source) {
		xlate(from, to, source.asString(), 1, false);
	}

	@Override
	public void xlate(String from, String to, QString source, boolean clear) {
		xlate(from, to, source.asString(), 1, clear);
	}

	@Override
	public void xlate(String from, String to, QString source, Number start) {
		xlate(from, to, source.asString(), start, false);
	}

	@Override
	public void xlate(String from, String to, QString source, Number start, boolean clear) {
		xlate(from, to, source.asString(), start, false);
	}

	@Override
	public void xlate(String from, String to, QString source, QNumeric start) {
		xlate(from, to, source.asString(), start.i(), false);
	}

	@Override
	public void xlate(String from, String to, QString source, QNumeric start, boolean clear) {
		xlate(from, to, source.asString(), start.i(), clear);
	}

	@Override
	public void xlate(String from, QString to, QString source) {
		xlate(from, to.asString(), source.asString(), 1, false);
	}

	@Override
	public void xlate(String from, QString to, QString source, boolean clear) {
		xlate(from, to.asString(), source.asString(), 1, clear);
	}

	@Override
	public void xlate(String from, QString to, QString source, Number start) {
		xlate(from, to.asString(), source.asString(), start, false);
	}

	@Override
	public void xlate(String from, QString to, QString source, Number start, boolean clear) {
		xlate(from, to.asString(), source.asString(), start, clear);
	}

	@Override
	public void xlate(String from, QString to, QString source, QNumeric start) {
		xlate(from, to.asString(), source.asString(), start.i(), false);
	}

	@Override
	public void xlate(String from, QString to, QString source, QNumeric start, boolean clear) {
		xlate(from, to.asString(), source.asString(), start.i(), clear);
	}

	@Override
	public void xlate(QString from, String to, QString source) {
		xlate(from.asString(), to, source.asString(), 1, false);
	}

	@Override
	public void xlate(QString from, String to, QString source, boolean clear) {
		xlate(from.asString(), to, source.asString(), 1, clear);
	}

	@Override
	public void xlate(QString from, String to, QString source, Number start) {
		xlate(from.asString(), to, source.asString(), start, false);
	}

	@Override
	public void xlate(QString from, String to, QString source, Number start, boolean clear) {
		xlate(from.asString(), to, source.asString(), start, clear);
	}

	@Override
	public void xlate(QString from, String to, QString source, QNumeric start) {
		xlate(from.asString(), to, source.asString(), start.i(), false);
	}

	@Override
	public void xlate(QString from, String to, QString source, QNumeric start, boolean clear) {
		xlate(from.asString(), to, source.asString(), start.i(), clear);
	}

	@Override
	public void xlate(byte from, String to, QString source) {
		// TODO Auto-generated method stub
	}

	@Override
	public void xlate(QString from, QString to, String source) {
		xlate(from.asString(), to.asString(), source, 1, false);
	}

	@Override
	public void xlate(QString from, QString to, String source, boolean clear) {
		xlate(from.asString(), to.asString(), source, 1, clear);
	}

	@Override
	public void xlate(QString from, QString to, String source, Number start) {
		xlate(from.asString(), to.asString(), source, start, false);
	}

	@Override
	public void xlate(QString from, QString to, String source, Number start, boolean clear) {
		xlate(from.asString(), to.asString(), source, start, clear);
	}

	@Override
	public void xlate(QString from, QString to, String source, QNumeric start) {
		xlate(from.asString(), to.asString(), source, start.i(), false);
	}

	@Override
	public void xlate(QString from, QString to, String source, QNumeric start, boolean clear) {
		xlate(from.asString(), to.asString(), source, start.i(), clear);
	}

	@Override
	public void xlate(QString from, QString to, QString source, boolean clear) {
		xlate(from.asString(), to.asString(), source.asString(), 1, clear);
	}

	@Override
	public void xlate(QString from, QString to, QString source, Number start) {
		xlate(from.asString(), to.asString(), source.asString(), start, false);
	}

	@Override
	public void xlate(QString from, QString to, QString source, Number start, boolean clear) {
		xlate(from.asString(), to.asString(), source.asString(), start, clear);
	}

	@Override
	public void xlate(QString from, QString to, QString source, QNumeric start) {
		xlate(from.asString(), to.asString(), source.asString(), start.i(), false);
	}

	@Override
	public void xlate(QString from, QString to, QString source, QNumeric start, boolean clear) {
		xlate(from.asString(), to.asString(), source.asString(), start.i(), clear);
	}

	@Override
	public void xlate(String from, String to, String source) {
		xlate(from, to, source, 1, false);
	}

	@Override
	public void xlate(String from, String to, String source, boolean clear) {
		xlate(from, to, source, 1, clear);
	}

	@Override
	public void xlate(String from, String to, String source, Number start) {
		xlate(from, to, source, start, false);
	}

	@Override
	public void xlate(String from, String to, String source, Number start, boolean clear) {
		StringBuffer sb = new StringBuffer();
		int startId = 1;
		for (char c : source.toCharArray()) {
			int i = from.indexOf(c);
			if (startId >= start.intValue() && (to.length() >= i && i >= 0)) {
				sb.append(to.substring(i, i + 1));
			} else {
				sb.append(c);
			}
			startId++;
		}
		movel(sb.toString(), clear);
	}

	@Override
	public void xlate(String from, String to, String source, QNumeric start) {
		xlate(from, to, source, start.i(), false);
	}

	@Override
	public void xlate(String from, String to, String source, QNumeric start, boolean clear) {
		xlate(from, to, source, start.i(), clear);
	}

	@Override
	public boolean ge(QHexadecimal value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean le(QHexadecimal value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> QDatetime qDate(E format) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookup(QArray<?> array) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookup(QArray<?> array, QNumeric start) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookup(QArray<?> array, Number start) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookup(QArray<?> array, QNumeric start, QNumeric elements) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookup(QArray<?> array, Number start, Number elements) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookup(QArray<?> array, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookup(QArray<?> array, QNumeric start, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookup(QArray<?> array, Number start, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookup(QArray<?> array, QNumeric start, QNumeric elements, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookup(QArray<?> array, Number start, Number elements, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookup(QArray<?> array, QNumeric start, Number elements, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookup(QArray<?> array, Number start, QNumeric elements, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookupgt(QArray<?> array, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookupgt(QArray<?> array, QNumeric start, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookupgt(QArray<?> array, Number start, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookupgt(QArray<?> array, QNumeric start, QNumeric elements, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookupgt(QArray<?> array, Number start, Number elements, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookupgt(QArray<?> array, QNumeric start, Number elements, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookupgt(QArray<?> array, Number start, QNumeric elements, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookuplt(QArray<?> array, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookuplt(QArray<?> array, QNumeric start, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookuplt(QArray<?> array, Number start, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookuplt(QArray<?> array, QNumeric start, QNumeric elements, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookuplt(QArray<?> array, Number start, Number elements, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookuplt(QArray<?> array, QNumeric start, Number elements, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qLookuplt(QArray<?> array, Number start, QNumeric elements, QIndicator found) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QCharacter qTrim() {

		String str = trim();

		NIOCharacterImpl character = new NIOCharacterImpl(getDataContext(), str.length());
		character.allocate();
		character.eval(str);

		return character;
	}

	@Override
	public QCharacter qTriml() {
		String str = trimL();

		NIOCharacterImpl character = new NIOCharacterImpl(getDataContext(), str.length());
		character.allocate();
		character.eval(str);

		return character;
	}

	@Override
	public QCharacter qTrimr() {
		String str = trimR();

		NIOCharacterImpl character = new NIOCharacterImpl(getDataContext(), str.length());
		character.allocate();
		character.eval(str);

		return character;

	}

	@Override
	public void testn(QIndicator numeric) {
		numeric.eval(true);
		try {
			Double.parseDouble(asString());
		} catch (Exception e) {
			numeric.eval(false);
		}
	}

	public int compareString(String value) {
		int result = compareBytes(asBytes(), value.getBytes(getDataContext().getCharset()));

		return result;
	}

	@Override
	public QNumeric qInt() {
		return qIntOperation(this.asString(), false);
	}

	@Override
	public QNumeric qInth() {
		return qIntOperation(this.asString(), true);
	}

	private QNumeric qIntOperation(String value, boolean roundingMode) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 0, DecimalType.ZONED, true);
		number.eval(Integer.parseInt(value.trim()));
		return number;
	}

	@Override
	public QNumeric qScan(QCharacter source) {
		return qScan(source.asString(), (Integer) null, null);
	}

	@Override
	public QNumeric qScan(QCharacter source, QIndicator found) {
		return qScan(source.asString(), (Integer) null, found);
	}

	@Override
	public QNumeric qScan(QCharacter source, QNumeric start) {
		return qScan(source.asString(), start.asInteger(), null);
	}

	@Override
	public QNumeric qScan(QCharacter source, QNumeric start, QIndicator found) {
		return qScan(source.asString(), start.asInteger(), found);
	}

	@Override
	public QNumeric qScan(QCharacter source, Number start) {
		return qScan(source.asString(), start, null);
	}

	@Override
	public QNumeric qScan(QCharacter source, Number start, QIndicator found) {
		return qScan(source.asString(), start, found);
	}

	@Override
	public QNumeric qScan(String source) {
		return qScan(source, (Integer) null, null);
	}

	@Override
	public QNumeric qScan(String source, QIndicator found) {
		return qScan(source, (Integer) null, found);
	}

	@Override
	public QNumeric qScan(String source, QNumeric start) {
		return qScan(source, start.asInteger(), null);
	}

	@Override
	public QNumeric qScan(String source, QNumeric start, QIndicator found) {
		return qScan(source, start.asInteger(), found);
	}

	@Override
	public QNumeric qScan(String source, Number start) {
		return qScan(source, start, null);
	}

	@Override
	public QNumeric qScan(String source, Number start, QIndicator found) {

		getDataContext().found().eval(false);

		QDecimal number = getDataContext().getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);
		if (start == null)
			start = 1;

		int i = source.indexOf(asString(), start.intValue() - 1);
		if (i < 0)
			number.eval(0);
		else {
			number.eval(i + 1);
			getDataContext().found().eval(true);
		}
		if (found != null)
			found.eval(number.ge(1));

		return number;
	}

	@Override
	public QString qPlus(QString factor1) {
		return qPlus(factor1.asString());
	}

	@Override
	public QString qPlus(String factor1) {
		QString string = getDataContext().getTemporaryString();
		string.eval(s() + factor1);
		return string;
	}

	@Override
	public String s() {
		return asString();
	}
}
