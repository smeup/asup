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

import java.util.Arrays;
import java.util.BitSet;

import org.smeup.sys.il.data.BufferedElementType;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.DatetimeFormat;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.QStroller;
import org.smeup.sys.il.data.def.DecimalType;
import org.smeup.sys.mi.core.util.QStrings;

public abstract class NIOStringImpl extends NIOBufferedElementImpl implements QString {

	private static final long serialVersionUID = 1L;
	protected static final byte INIT = 0x40;
	protected static final byte LOVAL = 0x00;
	protected static final byte HIVAL = (byte) 0xFF;

	protected int _length;

	public NIOStringImpl(final QDataContext dataContext, final int length) {
		super(dataContext);
		_length = length;
	}

	@Override
	protected final byte[] _toBytes(final DataSpecial value) {

		final byte[] bytes = new byte[getLength()];
		switch (value) {
		case LOVAL:
			Arrays.fill(bytes, NIOStringImpl.LOVAL);
			break;
		case BLANK:
		case BLANKS:
			Arrays.fill(bytes, NIOStringImpl.INIT);
			break;
		case OFF:
			Arrays.fill(bytes, NIOIndicatorImpl.OFF);
			break;
		case ZERO:
		case ZEROS:
			Arrays.fill(bytes, NIONumericImpl.INIT);
			break;
		case ON:
			Arrays.fill(bytes, NIOIndicatorImpl.ON);
			break;
		case HIVAL:
			Arrays.fill(bytes, NIOStringImpl.HIVAL);
			break;
		case NULL:
			Arrays.fill(bytes, (byte) 0x00);
			break;
		case OMIT:
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition 237rvbwe87vb9stf");
		}

		return bytes;
	}

	@Override
	protected final byte[] _toBytes(final Number value) {
		// TODO
		final String s = value.toString().replaceAll("\\.", "").replaceAll("\\,", "");
		return _toBytes(s);
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
		return value.asBytes();
	}

	@Override
	protected final byte[] _toBytes(final String value) {
		return value.getBytes(getDataContext().getCharset());
	}

	@Override
	public final String asString() {
		return new String(asBytes(), getDataContext().getCharset());
	}

	@Override
	public final void cat(final QString factor1) {
		cat(this.asBytes(), factor1.asBytes(), null, false);
	}

	@Override
	public final void cat(final QString factor1, final boolean clear) {
		cat(this.asBytes(), factor1.asBytes(), null, clear);
	}

	@Override
	public final void cat(final QString factor1, final Number space) {
		cat(NIOBufferHelper.trimR(this), factor1.asBytes(), space, false);
	}

	@Override
	public final void cat(final QString factor1, final Number space, final boolean clear) {
		cat(NIOBufferHelper.trimR(this), factor1.asBytes(), space, clear);
	}

	@Override
	public final void cat(final QString factor1, final QNumeric space) {
		cat(NIOBufferHelper.trimR(this), factor1.asBytes(), space.asInteger(), false);
	}

	@Override
	public final void cat(final QString factor1, final QNumeric space, final boolean clear) {
		cat(NIOBufferHelper.trimR(this), factor1.asBytes(), space.asInteger(), clear);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2) {
		cat(factor1.asBytes(), factor2.asBytes(), null, false);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2, final boolean clear) {
		cat(factor1.asBytes(), factor2.asBytes(), null, clear);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2, final Number space) {
		cat(NIOBufferHelper.trimR(factor1), factor2.asBytes(), space, false);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2, final Number space, final boolean clear) {
		cat(NIOBufferHelper.trimR(factor1), factor2.asBytes(), space, clear);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2, final QNumeric space) {
		cat(NIOBufferHelper.trimR(factor1), factor2.asBytes(), space.i(), false);
	}

	@Override
	public final void cat(final QString factor1, final QString factor2, final QNumeric space, final boolean clear) {
		cat(NIOBufferHelper.trimR(factor1), factor2.asBytes(), space.i(), clear);
	}

	@Override
	public final void cat(final QString factor1, final String factor2) {
		cat(factor1.asBytes(), factor2.getBytes(getDataContext().getCharset()), null, false);
	}

	@Override
	public final void cat(final byte factor1, final String factor2) {
		cat(new byte[] { factor1 }, factor2.getBytes(getDataContext().getCharset()), null, false);
	}

	@Override
	public final void cat(final QString factor1, final String factor2, final boolean clear) {
		cat(factor1.asBytes(), factor2.getBytes(getDataContext().getCharset()), null, clear);
	}

	@Override
	public final void cat(final QString factor1, final String factor2, final Number space) {
		cat(NIOBufferHelper.trimR(factor1), factor2.getBytes(getDataContext().getCharset()), space, false);
	}

	@Override
	public final void cat(final QString factor1, final String factor2, final Number space, final boolean clear) {
		cat(NIOBufferHelper.trimR(factor1), factor2.getBytes(getDataContext().getCharset()), space, clear);
	}

	@Override
	public final void cat(final String factor1) {
		cat(this.asBytes(), factor1.getBytes(getDataContext().getCharset()), null, false);
	}

	@Override
	public final void cat(final String factor1, final boolean clear) {
		cat(this.asBytes(), factor1.getBytes(getDataContext().getCharset()), null, clear);
	}

	@Override
	public final void cat(final String factor1, final Number space) {
		cat(NIOBufferHelper.trimR(this), factor1.getBytes(getDataContext().getCharset()), space, false);
	}

	@Override
	public final void cat(final String factor1, final Number space, final boolean clear) {
		cat(NIOBufferHelper.trimR(this), factor1.getBytes(getDataContext().getCharset()), space, clear);
	}

	@Override
	public final void cat(final String factor1, final QNumeric space) {
		cat(NIOBufferHelper.trimR(this), factor1.getBytes(getDataContext().getCharset()), space.asInteger(), false);
	}

	@Override
	public final void cat(final String factor1, final QNumeric space, final boolean clear) {
		cat(NIOBufferHelper.trimR(this), factor1.getBytes(getDataContext().getCharset()), space.asInteger(), clear);
	}

	@Override
	public final void cat(final String factor1, final QString factor2) {
		cat(factor1.getBytes(getDataContext().getCharset()), factor2.asBytes(), null, false);
	}

	@Override
	public final void cat(final String factor1, final QString factor2, final boolean clear) {
		cat(factor1.getBytes(getDataContext().getCharset()), factor2.asBytes(), null, clear);
	}

	@Override
	public final void cat(final String factor1, final QString factor2, final Number space) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.asBytes(), space, false);
	}

	@Override
	public final void cat(final String factor1, final QString factor2, final Number space, final boolean clear) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.asBytes(), space, clear);
	}

	@Override
	public final void cat(final String factor1, final QString factor2, final QNumeric space) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.asBytes(), space.asInteger(), false);
	}

	@Override
	public final void cat(final String factor1, final QString factor2, final QNumeric space, final boolean clear) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.asBytes(), space.asInteger(), clear);
	}

	@Override
	public final void cat(final String factor1, final String factor2) {
		cat(factor1.getBytes(getDataContext().getCharset()), factor2.getBytes(getDataContext().getCharset()), null, false);
	}

	@Override
	public final void cat(final String factor1, final String factor2, final boolean clear) {
		cat(factor1.getBytes(getDataContext().getCharset()), factor2.getBytes(getDataContext().getCharset()), null, clear);
	}

	@Override
	public final void cat(final String factor1, final String factor2, final Number space) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.getBytes(getDataContext().getCharset()), space, false);
	}

	@Override
	public final void cat(final String factor1, final String factor2, final QNumeric space) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.getBytes(getDataContext().getCharset()), space.asInteger(), false);
	}

	@Override
	public final void cat(final String factor1, final String factor2, final QNumeric space, final boolean clear) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.getBytes(getDataContext().getCharset()), space.asInteger(), clear);
	}

	@Override
	public final void cat(final String factor1, final String factor2, final Number space, final boolean clear) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.getBytes(getDataContext().getCharset()), space, clear);
	}

	protected abstract void cat(byte[] factor1, byte[] factor2, Number space, boolean clear);

	protected abstract void setLength(short length);

	@Override
	public final boolean eq(final QHexadecimal value) {
		// TODO verify
		return NIOComparatorHelper.compareBytes(this, value.asBytes()) == 0;
	}

	@Override
	public final boolean eq(final QString value) {
		return NIOComparatorHelper.compareBytes(this, _toBytes(value)) == 0;
	}

	@Override
	public final boolean eq(final String value) {
		return NIOComparatorHelper.compareBytes(this, _toBytes(value)) == 0;
	}

	@Override
	public final QBufferedData eval(final DataSpecial value) {
		setLength((short) _length);
		_write(_toBytes(value));
		return this;
	}

	@Override
	public final void evalr(final QString value) {

		setLength((short) _length);

		final byte[] bytes = value.asBytes();
		if (bytes.length > _length)
			_move(bytes, false);
		else
			_move(bytes, true);
	}

	@Override
	public final void evalr(final String value) {

		setLength((short) _length);

		final byte[] bytes = value.getBytes(getDataContext().getCharset());
		if (bytes.length > _length)
			_move(bytes, false);
		else
			_move(bytes, true);
	}

	@Override
	public final void eval(final boolean value) {
		if (value)
			eval(DataSpecial.ON);
		else
			eval(DataSpecial.OFF);
	}

	@Override
	public final void eval(final QIndicator value) {
		_write(value.asBytes());
	}

	@Override
	public final void eval(final QString value) {
		_write(value.asBytes());
	}

	@Override
	public final void eval(final QDataArea<? extends QString> value) {
		_write(value.get().asBytes());
	}

	@Override
	public final void eval(final QScroller<? extends QString> value) {
		_write(value.current().asBytes());
	}

	@Override
	public final void eval(final QStroller<? extends QDataStruct> value) {
		_write(value.current().asBytes());
	}

	@Override
	public final boolean ge(final QHexadecimal value) {
		// TODO verify
		return NIOComparatorHelper.compareBytes(this, value.asBytes()) >= 0;
	}

	@Override
	public final boolean ge(final QString value) {
		return NIOComparatorHelper.compareBytes(this, value.asBytes()) >= 0;
	}

	@Override
	public final boolean ge(final String value) {
		return NIOComparatorHelper.compareBytes(this, _toBytes(value)) >= 0;
	}

	@Override
	public final BufferedElementType getBufferedElementType() {
		return BufferedElementType.STRING;
	}

	@Override
	public final boolean gt(final QString value) {
		return NIOComparatorHelper.compareBytes(this, _toBytes(value)) > 0;
	}

	@Override
	public final boolean gt(final String value) {
		return NIOComparatorHelper.compareBytes(this, _toBytes(value)) > 0;
	}

	@Override
	public final boolean le(final QHexadecimal value) {
		// TODO verify
		return NIOComparatorHelper.compareBytes(this, value.asBytes()) <= 0;
	}

	@Override
	public final boolean le(final QString value) {
		return NIOComparatorHelper.compareBytes(this, value.asBytes()) <= 0;
	}

	@Override
	public final boolean le(final String value) {
		return NIOComparatorHelper.compareBytes(this, _toBytes(value)) <= 0;
	}

	@Override
	public final boolean lt(final QString value) {
		return NIOComparatorHelper.compareBytes(this, _toBytes(value)) < 0;
	}

	@Override
	public final boolean lt(final String value) {
		return NIOComparatorHelper.compareBytes(this, _toBytes(value)) < 0;
	}

	@Override
	public final void movea(final QArray<? extends QString> value) {
		movea(value, false);
	}

	@Override
	public final void movea(final QArray<? extends QString> value, final boolean clear) {
		movea(value, 1, clear);
	}

	@Override
	public final void movea(final QArray<? extends QString> value, final int startIndex) {
		movea(value, startIndex, false);
	}

	@Override
	public final void movea(final QArray<? extends QString> value, final int startIndex, final boolean clear) {

		if (!value.isContiguous())
			throw new UnsupportedOperationException("Invalid operation MOVEA with not contiguous array");

		if (value.get(1).isVarying())
			throw new UnsupportedOperationException("Invalid operation MOVEA with varying array");

		final int position = ((value.getLength() / value.capacity()) * (startIndex - 1));

		final NIOBufferedDataImpl arrayBuffer = NIOBufferHelper.getNIOBufferedDataImpl(value);

		int length = getLength();
		if (length > value.getLength())
			length = value.getLength();

		final byte[] bytes = NIOBufferHelper.read(arrayBuffer.getBuffer(), arrayBuffer.getPosition() + position, length);

		_movel(bytes, clear);
	}

	@Override
	public final void movea(final QArray<? extends QString> value, final QNumeric startIndex) {
		movea(value, startIndex.i());
	}

	@Override
	public final void movea(final QArray<? extends QString> value, final QNumeric startIndex, final boolean clear) {
		movea(value, startIndex.i(), clear);
	}

	@Override
	public final boolean ne(final QHexadecimal value) {
		return !eq(value);
	}

	@Override
	public final boolean ne(final QString value) {
		return !eq(value);
	}

	@Override
	public final boolean ne(final String value) {
		return !eq(value);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base) {
		return qCheck(base.asString(), (Integer) null, null);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base, final QIndicator found) {
		return qCheck(base.asString(), (Integer) null, found);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base, final QNumeric start) {
		return qCheck(base.asString(), start.asInteger(), null);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base, final QNumeric start, final QIndicator found) {
		return qCheck(base.asString(), start.asInteger(), found);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base, final Number start) {
		return qCheck(base.asString(), start, null);
	}

	@Override
	public final QNumeric qCheck(final QCharacter base, final Number start, final QIndicator found) {
		return qCheck(base.asString(), start, found);
	}

	@Override
	public final QNumeric qCheck(final String base) {
		return qCheck(base, (Integer) null, null);
	}

	@Override
	public final QNumeric qCheck(final String base, final QIndicator found) {
		return qCheck(base, (Integer) null, found);
	}

	@Override
	public final QNumeric qCheck(final String base, final QNumeric start) {
		return qCheck(base, start.asInteger(), null);
	}

	@Override
	public final QNumeric qCheck(final String base, final QNumeric start, final QIndicator found) {
		return qCheck(base, start.asInteger(), found);
	}

	@Override
	public final QNumeric qCheck(final String base, final Number start) {
		return qCheck(base, start, null);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base) {
		return qCheckr(base.asString(), (Integer) null, null);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base, final QIndicator found) {
		return qCheckr(base.asString(), (Integer) null, found);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base, final QNumeric start) {
		return qCheckr(base.asString(), start.asInteger(), null);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base, final QNumeric start, final QIndicator found) {
		return qCheckr(base.asString(), start.asInteger(), found);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base, final Number start) {
		return qCheckr(base.asString(), start, null);
	}

	@Override
	public final QNumeric qCheckr(final QCharacter base, final Number start, final QIndicator found) {
		return qCheckr(base.asString(), start, found);
	}

	@Override
	public final QNumeric qCheckr(final String base) {
		return qCheckr(base, (Integer) null, null);
	}

	@Override
	public final QNumeric qCheckr(final String base, final QIndicator found) {
		return qCheckr(base, (Integer) null, found);
	}

	@Override
	public final QNumeric qCheckr(final String base, final QNumeric start) {
		return qCheckr(base, start.asInteger(), null);
	}

	@Override
	public final QNumeric qCheckr(final String base, final QNumeric start, final QIndicator found) {
		return qCheckr(base, start.asInteger(), found);
	}

	@Override
	public final QNumeric qCheckr(final String base, final Number start) {
		return qCheckr(base, start, null);
	}

	@Override
	public final QNumeric qCheck(final String base, Number start, final QIndicator found) {
		// TODO use cache
		final QDecimal number = getDataContext().getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);
		if (start == null)
			start = 1;

		int id = start.intValue() - 1;

		for (final char c : asString().substring(start.intValue() - 1).toCharArray()) {
			id++;
			final int i = base.indexOf(c);
			if (i < 0) {
				number.eval(id);
				break;
			}
		}
		if (found != null)
			found.eval(number.gt(0));
		else
			getDataContext().found().eval(number.gt(0));

		return number;
	}

	@Override
	public final QNumeric qCheckr(final String base, Number start, final QIndicator found) {
		// TODO use cache
		final QDecimal number = getDataContext().getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);
		if (start == null || start.intValue() > getLength())
			start = getLength();

		final char[] chars = asString().substring(0, start.intValue()).toCharArray();
		for (int ii = chars.length; ii > 0; ii--) {
			final int i = base.indexOf(chars[ii - 1]);
			if (i < 0) {
				number.eval(ii);
				break;
			}
		}

		if (found != null)
			found.eval(number.gt(0));
		else
			getDataContext().found().eval(number.gt(0));

		return number;
	}

	@Override
	public final QIndicator qFound() {
		return getDataContext().found();
	}

	@Override
	public final QDatetime qDate(final DatetimeFormat format) {
		throw new IntegratedLanguageDataRuntimeException("Unexpected condition ew8br8wervew6tfs");
	}

	@Override
	public final QNumeric qInt() {
		return qIntOperation(this.trim(), false);
	}

	@Override
	public final QNumeric qInth() {
		return qIntOperation(this.trim(), true);
	}

	private final QNumeric qIntOperation(final String value, final boolean roundingMode) {
		// TODO use cache
		final QDecimal number = getDataContext().getDataFactory().createDecimal(15, 0, DecimalType.ZONED, true);
		number.eval(Integer.parseInt(value));
		return number;
	}

	@Override
	public final QString qPlus(final String factor1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public final QString qPlus(final QString factor1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public final QNumeric qScan(final byte argument) {
		return qScan(new String(new byte[] { argument }, getDataContext().getCharset()), (Integer) null, null);
	}

	@Override
	public final QNumeric qScan(final byte argument, final QNumeric start) {
		return qScan(new String(new byte[] { argument }, getDataContext().getCharset()), start, null);
	}

	@Override
	public final QNumeric qScan(final byte argument, final Number start) {
		return qScan(new String(new byte[] { argument }, getDataContext().getCharset()), start, null);
	}

	@Override
	public final QNumeric qScan(final QCharacter argument) {
		return qScan(argument.asString(), (Integer) null, null);
	}

	@Override
	public final QNumeric qScan(final QCharacter argument, final Number start) {
		return qScan(argument.asString(), start, null);
	}

	@Override
	public final QNumeric qScan(final QCharacter argument, final Number start, final QIndicator found) {
		return qScan(argument.asString(), start, found);
	}

	@Override
	public final QNumeric qScan(final QCharacter argument, final QIndicator found) {
		return qScan(argument.asString(), (Integer) null, found);
	}

	@Override
	public final QNumeric qScan(final QCharacter argument, final QNumeric start) {
		return qScan(argument.asString(), start.asInteger(), null);
	}

	@Override
	public final QNumeric qScan(final QCharacter argument, final QNumeric start, final QIndicator found) {
		return qScan(argument.asString(), start.asInteger(), found);
	}

	@Override
	public final QNumeric qScan(final String argument) {
		return qScan(argument, (Integer) null, null);
	}

	@Override
	public final QNumeric qScan(final String argument, final Number start) {
		return qScan(argument, start, null);
	}

	@Override
	public final QNumeric qScan(final String argument, final QIndicator found) {
		return qScan(argument, (Integer) null, found);
	}

	@Override
	public final QNumeric qScan(final String argument, final QNumeric start) {
		return qScan(argument, start.asInteger(), null);
	}

	@Override
	public final QNumeric qScan(final String argument, final QNumeric start, final QIndicator found) {
		return qScan(argument, start.asInteger(), found);
	}

	@Override
	public final QNumeric qScan(final String argument, Number start, final QIndicator found) {

		// TODO use cache
		final QDecimal number = getDataContext().getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);

		// default
		if (start == null)
			start = 1;

		final int i = asString().indexOf(argument, start.intValue() - 1);
		if (i >= 0) {
			number.eval(i + 1);
			getDataContext().found().eval(true);
		} else
			getDataContext().found().eval(false);

		if (found != null)
			found.eval(getDataContext().found());

		return number;
	}

	@Override
	public final QCharacter qSubst(final Number start) {
		return qSubst(start, (Number) null);
	}

	@Override
	public final QCharacter qSubst(Number start, Number length) {

		// TODO ???
		if (start == null)
			start = 1;

		if (length == null)
			length = getLength() - start.intValue() + 1;

		// TODO cache ?
		final QCharacter character = new NIOCharacterFixedImpl(getDataContext(), length.intValue(), false);
		if (isVarying())
			this.slice(character, start.intValue() + 2);
		else
			this.slice(character, start.intValue());

		return character;
	}

	@Override
	public final QCharacter qSubst(final Number start, final QNumeric length) {
		return qSubst(start, length.i());
	}

	@Override
	public final QCharacter qSubst(final QNumeric start) {
		return qSubst(start.i());
	}

	@Override
	public final QCharacter qSubst(final QNumeric start, final Number length) {
		return qSubst(start.i(), length);
	}

	@Override
	public final QCharacter qSubst(final QNumeric start, final QNumeric length) {
		return qSubst(start.i(), length.i());
	}

	@Override
	public final QCharacter qTrim() {

		// TODO cache?
		final byte[] bytes = NIOBufferHelper.trim(this);
		final NIOCharacterImpl character = new NIOCharacterFixedImpl(getDataContext(), bytes.length, true);
		NIOBufferHelper.movel(character.getBuffer(), 0, bytes.length, bytes);

		return character;
	}

	@Override
	public final QCharacter qTrim(final String trimmed) {

		// TODO replace me
		final byte[] bytes = NIOBufferHelper.trim(this);
		final NIOCharacterImpl character = new NIOCharacterFixedImpl(getDataContext(), bytes.length, true);
		NIOBufferHelper.movel(character.getBuffer(), 0, bytes.length, bytes);

		return character;
	}

	@Override
	public final QCharacter qTrim(final QString trimmed) {

		// TODO replace me
		final byte[] bytes = NIOBufferHelper.trim(this);
		final NIOCharacterImpl character = new NIOCharacterFixedImpl(getDataContext(), bytes.length, true);
		NIOBufferHelper.movel(character.getBuffer(), 0, bytes.length, bytes);

		return character;
	}

	@Override
	public final QCharacter qTriml() {

		// TODO cache?
		final byte[] bytes = NIOBufferHelper.trimL(this);
		final NIOCharacterImpl character = new NIOCharacterFixedImpl(getDataContext(), bytes.length, true);
		NIOBufferHelper.movel(character.getBuffer(), 0, bytes.length, bytes);

		return character;
	}

	@Override
	public final QCharacter qTrimr() {

		// TODO cache?
		final byte[] bytes = NIOBufferHelper.trimR(this);
		final NIOCharacterImpl character = new NIOCharacterFixedImpl(getDataContext(), bytes.length, true);
		NIOBufferHelper.movel(character.getBuffer(), 0, bytes.length, bytes);

		return character;
	}

	@Override
	public final String s() {
		return asString();
	}

	@Override
	public final void testn(final QIndicator numeric) {
		testn(numeric, null);
	}

	@Override
	public final void testn(final QIndicator numeric, final QIndicator blank) {
		testn(numeric, blank, null);
	}

	@Override
	public final void testn(final QIndicator numeric, final QIndicator blank, final QIndicator blankNumeric) {

		final boolean isBlank = eq(DataSpecial.BLANKS);
		if (blank != null)
			blank.eval(isBlank);

		boolean isBlankNumeric = false;
		if (!isBlank)
			isBlankNumeric = asString().startsWith(" ");
		if (blankNumeric != null)
			blankNumeric.eval(isBlankNumeric);

		boolean isNumeric = false;
		if (!isBlank && !isBlankNumeric)
			try {
				Double.parseDouble(asString());
				isNumeric = true;
			} catch (final Exception e) {
				isNumeric = false;
			}

		if (numeric != null)
			numeric.eval(isNumeric);

	}

	@Override
	public final String trim() {
		return new String(NIOBufferHelper.trim(this), getDataContext().getCharset());
	}

	@Override
	public final String trimL() {
		return new String(NIOBufferHelper.trimL(this), getDataContext().getCharset());
	}

	@Override
	public final String trimR() {
		return new String(NIOBufferHelper.trimR(this), getDataContext().getCharset());
	}

	@Override
	public final QBufferedData eval(final byte value) {
		_write(new byte[] { value });
		return this;
	}

	@Override
	public final boolean eq(final byte value) {
		return NIOComparatorHelper.compareBytes(this, new byte[] { value }) == 0;
	}

	@Override
	public final boolean ge(final byte value) {
		return NIOComparatorHelper.compareBytes(this, new byte[] { value }) >= 0;
	}

	@Override
	public final boolean gt(final byte value) {
		return NIOComparatorHelper.compareBytes(this, new byte[] { value }) > 0;
	}

	@Override
	public final boolean le(final byte value) {
		return NIOComparatorHelper.compareBytes(this, new byte[] { value }) <= 0;
	}

	@Override
	public final boolean lt(final byte value) {
		return NIOComparatorHelper.compareBytes(this, new byte[] { value }) < 0;
	}

	@Override
	public final boolean ne(final byte value) {
		return !eq(value);
	}

	@Override
	public final void bitoff(final byte value) {

		bitoff(formatBitMask(value));
	}

	@Override
	public final void bitoff(final String bitMask) {

		final BitSet bitSet = BitSet.valueOf(asBytes());
		for (final char c : bitMask.toCharArray()) {
			final int i = Integer.parseInt("" + c);
			bitSet.set(7 - i, false);
		}

		byte[] bytes = bitSet.toByteArray();
		if (bytes.length == 0)
			bytes = new byte[] { (byte) 0x00 };

		_write(bytes);
	}

	@Override
	public final void biton(final byte value) {
		biton(formatBitMask(value));
	}

	@Override
	public final void biton(final QString bitMask) {
		biton(bitMask.asString());
	}

	@Override
	public final void biton(final String bitMask) {

		final BitSet bitSet = BitSet.valueOf(asBytes());
		for (final char c : bitMask.toCharArray()) {
			final int i = Integer.parseInt("" + c);
			bitSet.set(7 - i, true);
		}

		byte[] bytes = bitSet.toByteArray();
		if (bytes.length == 0)
			bytes = new byte[] { (byte) 0x00 };

		_write(bytes);
	}

	@Override
	public final void testb(final byte value, final QIndicator off) {
		testb(formatBitMask(value), off, null, null);
	}

	@Override
	public final void testb(final String bitMask, final QIndicator off) {
		testb(bitMask, off, null, null);
	}

	@Override
	public final void testb(final QString bitMask, final QIndicator off) {
		testb(bitMask.asString(), off, null, null);
	}

	@Override
	public final void testb(final byte value, final QIndicator off, final QIndicator on) {
		testb(formatBitMask(value), off, on, null);
	}

	@Override
	public final void testb(final String bitMask, final QIndicator off, final QIndicator on) {
		testb(bitMask, off, on, null);
	}

	@Override
	public final void testb(final QString bitMask, final QIndicator off, final QIndicator on) {
		testb(bitMask.asString(), off, on, null);
	}

	@Override
	public final void testb(final byte value, final QIndicator off, final QIndicator on, final QIndicator equal) {
		testb(formatBitMask(value), off, on, equal);
	}

	@Override
	public final void testb(final QString bitMask, final QIndicator off, final QIndicator on, final QIndicator equal) {
		testb(bitMask.asString(), off, on, equal);
	}

	@Override
	public final void testb(final String bitMask, final QIndicator off, final QIndicator on, final QIndicator equal) {

		boolean rOff = true;
		boolean rEqual = true;

		final BitSet bitSet = BitSet.valueOf(asBytes());
		for (final char c : bitMask.toCharArray()) {
			final int i = Integer.parseInt("" + c);
			if (rOff && bitSet.get(7 - i))
				rOff = false;
			if (rEqual && !bitSet.get(7 - i))
				rEqual = false;
		}

		if (off != null)
			off.eval(rOff);

		if (equal != null)
			if (equal != off)
				equal.eval(rEqual);

		if (on != null)
			on.eval(rOff || rEqual);

	}

	@Override
	public final void xlate(final byte from, final String to, final QString source) {
		xlate(new String(new byte[] { from }), to, source.asString());
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source) {
		xlate(from.asString(), to.asString(), source.asString(), 1, false);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source, final boolean clear) {
		xlate(from.asString(), to.asString(), source.asString(), 1, clear);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source, final Number start) {
		xlate(from.asString(), to.asString(), source.asString(), start, false);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source, final Number start, final boolean clear) {
		xlate(from.asString(), to.asString(), source.asString(), start, clear);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source, final QNumeric start) {
		xlate(from.asString(), to.asString(), source.asString(), start.i(), false);
	}

	@Override
	public final void xlate(final QString from, final QString to, final QString source, final QNumeric start, final boolean clear) {
		xlate(from.asString(), to.asString(), source.asString(), start.i(), clear);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source) {
		xlate(from.asString(), to.asString(), source, 1, false);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source, final boolean clear) {
		xlate(from.asString(), to.asString(), source, 1, clear);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source, final Number start) {
		xlate(from.asString(), to.asString(), source, start, false);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source, final Number start, final boolean clear) {
		xlate(from.asString(), to.asString(), source, start, clear);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source, final QNumeric start) {
		xlate(from.asString(), to.asString(), source, start.i(), false);
	}

	@Override
	public final void xlate(final QString from, final QString to, final String source, final QNumeric start, final boolean clear) {
		xlate(from.asString(), to.asString(), source, start.i(), clear);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source) {
		xlate(from.asString(), to, source.asString(), 1, false);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source, final boolean clear) {
		xlate(from.asString(), to, source.asString(), 1, clear);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source, final Number start) {
		xlate(from.asString(), to, source.asString(), start, false);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source, final Number start, final boolean clear) {
		xlate(from.asString(), to, source.asString(), start, clear);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source, final QNumeric start) {
		xlate(from.asString(), to, source.asString(), start.i(), false);
	}

	@Override
	public final void xlate(final QString from, final String to, final QString source, final QNumeric start, final boolean clear) {
		xlate(from.asString(), to, source.asString(), start.i(), clear);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source) {
		xlate(from, to.asString(), source.asString(), 1, false);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source, final boolean clear) {
		xlate(from, to.asString(), source.asString(), 1, clear);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source, final Number start) {
		xlate(from, to.asString(), source.asString(), start, false);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source, final Number start, final boolean clear) {
		xlate(from, to.asString(), source.asString(), start, clear);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source, final QNumeric start) {
		xlate(from, to.asString(), source.asString(), start.i(), false);
	}

	@Override
	public final void xlate(final String from, final QString to, final QString source, final QNumeric start, final boolean clear) {
		xlate(from, to.asString(), source.asString(), start.i(), clear);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source) {
		xlate(from, to, source.asString(), 1, false);
	}

	@Override
	public final void xlate(final String from, final byte to, final QString source) {
		xlate(from, new String(new byte[] { to }, getDataContext().getCharset()), source.asString(), 1, false);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source, final boolean clear) {
		xlate(from, to, source.asString(), 1, clear);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source, final Number start) {
		xlate(from, to, source.asString(), start, false);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source, final Number start, final boolean clear) {
		xlate(from, to, source.asString(), start, clear);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source, final QNumeric start) {
		xlate(from, to, source.asString(), start.i(), false);
	}

	@Override
	public final void xlate(final String from, final String to, final QString source, final QNumeric start, final boolean clear) {
		xlate(from, to, source.asString(), start.i(), clear);
	}

	@Override
	public final void xlate(final String from, final String to, final String source) {
		xlate(from, to, source, 1, false);
	}

	@Override
	public final void xlate(final String from, final String to, final String source, final boolean clear) {
		xlate(from, to, source, 1, clear);
	}

	@Override
	public final void xlate(final String from, final String to, final String source, final Number start) {
		xlate(from, to, source, start, false);
	}

	@Override
	public final void xlate(final String from, final String to, final String source, final QNumeric start) {
		xlate(from, to, source, start.i(), false);
	}

	@Override
	public final void xlate(final String from, final String to, final String source, final QNumeric start, final boolean clear) {
		xlate(from, to, source, start.i(), clear);
	}

	@Override
	public final void xlate(final String from, final String to, final String source, final Number start, final boolean clear) {
		final StringBuffer sb = new StringBuffer();
		int startId = 0;
		for (final char c : source.toCharArray()) {
			if (startId > getLength())
				break;
			startId++;
			final int i = from.indexOf(c);
			if (startId < start.intValue() || (i < 0) || (i + 1 > to.length()))
				sb.append(c);
			else
				sb.append(to.substring(i, i + 1));
		}
		movel(sb.toString(), clear);
	}

	private final String formatBitMask(final byte value) {

		final String binaryString = Integer.toBinaryString(value);
		final StringBuffer bitMask = new StringBuffer(8);

		for (int i = 24; i < 32; i++)
			if (binaryString.charAt(i) == '1')
				bitMask.append(i - 24);

		return bitMask.toString();
	}
}