package org.smeup.sys.il.data.nio;

import java.util.Arrays;

import org.smeup.sys.il.data.BufferedElementType;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.DatetimeFormat;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataArea;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.DecimalType;
import org.smeup.sys.mi.core.util.QStrings;

public abstract class NIOStringImpl extends NIOBufferedElementImpl implements QString {

	private static final long serialVersionUID = 1L;
	protected static final byte INIT = (byte) 64;
	protected static final byte LOVAL = (byte) 0;
	protected static final byte HIVAL = (byte) -7;

	public NIOStringImpl(QDataContext dataContext) {
		super(dataContext);
	}

	@Override
	protected byte[] _toBytes() {
		return NIOBufferHelper.read(getBuffer(), getPosition(), getLength());
	}

	@Override
	protected final byte[] _toBytes(DataSpecial value) {

		byte[] bytes = new byte[getLength()];
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
			Arrays.fill(bytes, NIODecimalZonedImpl.INIT);
			break;
		case ON:
			Arrays.fill(bytes, NIOIndicatorImpl.ON);
			break;
		case HIVAL:
			Arrays.fill(bytes, NIOStringImpl.HIVAL);
			break;
		case NULL:
		case OMIT:
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition 237rvbwe87vb9stf");
		}

		return bytes;
	}

	@Override
	protected final byte[] _toBytes(Number value) {
		// TODO
		String s = value.toString().replaceAll("\\.", "").replaceAll("\\,", "");
		return _toBytes(s);
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

	@Override
	public final String asString() {
		return new String(asBytes(), getDataContext().getCharset());
	}

	@Override
	public final void cat(QString factor1) {
		cat(this.asBytes(), factor1.asBytes(), null, false);
	}

	@Override
	public final void cat(QString factor1, boolean clear) {
		cat(this.asBytes(), factor1.asBytes(), null, clear);
	}

	@Override
	public final void cat(QString factor1, Number space) {
		cat(NIOBufferHelper.trimR(this), factor1.asBytes(), space, false);
	}

	@Override
	public final void cat(QString factor1, Number space, boolean clear) {
		cat(NIOBufferHelper.trimR(this), factor1.asBytes(), space, clear);
	}

	@Override
	public final void cat(QString factor1, QNumeric space) {
		cat(NIOBufferHelper.trimR(this), factor1.asBytes(), space.asInteger(), false);
	}

	@Override
	public final void cat(QString factor1, QNumeric space, boolean clear) {
		cat(NIOBufferHelper.trimR(this), factor1.asBytes(), space.asInteger(), clear);
	}

	@Override
	public final void cat(QString factor1, QString factor2) {
		cat(factor1.asBytes(), factor2.asBytes(), null, false);
	}

	@Override
	public final void cat(QString factor1, QString factor2, boolean clear) {
		cat(factor1.asBytes(), factor2.asBytes(), null, clear);
	}

	@Override
	public final void cat(QString factor1, QString factor2, Number space) {
		cat(NIOBufferHelper.trimR(factor1), factor2.asBytes(), space, false);
	}

	@Override
	public final void cat(QString factor1, QString factor2, Number space, boolean clear) {
		cat(NIOBufferHelper.trimR(factor1), factor2.asBytes(), space, clear);
	}

	@Override
	public final void cat(QString factor1, QString factor2, QNumeric space) {
		cat(NIOBufferHelper.trimR(factor1), factor2.asBytes(), space.i(), false);
	}

	@Override
	public final void cat(QString factor1, QString factor2, QNumeric space, boolean clear) {
		cat(NIOBufferHelper.trimR(factor1), factor2.asBytes(), space.i(), clear);
	}

	@Override
	public final void cat(QString factor1, String factor2) {
		cat(factor1.asBytes(), factor2.getBytes(getDataContext().getCharset()), null, false);
	}

	@Override
	public final void cat(byte factor1, String factor2) {
		cat(new byte[] { factor1 }, factor2.getBytes(getDataContext().getCharset()), null, false);
	}

	@Override
	public final void cat(QString factor1, String factor2, boolean clear) {
		cat(factor1.asBytes(), factor2.getBytes(getDataContext().getCharset()), null, clear);
	}

	@Override
	public final void cat(QString factor1, String factor2, Number space) {
		cat(NIOBufferHelper.trimR(factor1), factor2.getBytes(getDataContext().getCharset()), space, false);
	}

	@Override
	public final void cat(QString factor1, String factor2, Number space, boolean clear) {
		cat(NIOBufferHelper.trimR(factor1), factor2.getBytes(getDataContext().getCharset()), space, clear);
	}

	@Override
	public final void cat(String factor1) {
		cat(this.asBytes(), factor1.getBytes(getDataContext().getCharset()), null, false);
	}

	@Override
	public final void cat(String factor1, boolean clear) {
		cat(this.asBytes(), factor1.getBytes(getDataContext().getCharset()), null, clear);
	}

	@Override
	public final void cat(String factor1, Number space) {
		cat(NIOBufferHelper.trimR(this), factor1.getBytes(getDataContext().getCharset()), space, false);
	}

	@Override
	public final void cat(String factor1, Number space, boolean clear) {
		cat(NIOBufferHelper.trimR(this), factor1.getBytes(getDataContext().getCharset()), space, clear);
	}

	@Override
	public final void cat(String factor1, QNumeric space) {
		cat(NIOBufferHelper.trimR(this), factor1.getBytes(getDataContext().getCharset()), space.asInteger(), false);
	}

	@Override
	public final void cat(String factor1, QNumeric space, boolean clear) {
		cat(NIOBufferHelper.trimR(this), factor1.getBytes(getDataContext().getCharset()), space.asInteger(), clear);
	}

	@Override
	public final void cat(String factor1, QString factor2) {
		cat(factor1.getBytes(getDataContext().getCharset()), factor2.asBytes(), null, false);
	}

	@Override
	public final void cat(String factor1, QString factor2, boolean clear) {
		cat(factor1.getBytes(getDataContext().getCharset()), factor2.asBytes(), null, clear);
	}

	@Override
	public final void cat(String factor1, QString factor2, Number space) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.asBytes(), space, false);
	}

	@Override
	public final void cat(String factor1, QString factor2, Number space, boolean clear) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.asBytes(), space, clear);
	}

	@Override
	public final void cat(String factor1, QString factor2, QNumeric space) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.asBytes(), space.asInteger(), false);
	}

	@Override
	public final void cat(String factor1, QString factor2, QNumeric space, boolean clear) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.asBytes(), space.asInteger(), clear);
	}

	@Override
	public final void cat(String factor1, String factor2) {
		cat(factor1.getBytes(getDataContext().getCharset()), factor2.getBytes(getDataContext().getCharset()), null, false);
	}

	@Override
	public final void cat(String factor1, String factor2, boolean clear) {
		cat(factor1.getBytes(getDataContext().getCharset()), factor2.getBytes(getDataContext().getCharset()), null, clear);
	}

	@Override
	public final void cat(String factor1, String factor2, Number space) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.getBytes(getDataContext().getCharset()), space, false);
	}

	@Override
	public final void cat(String factor1, String factor2, QNumeric space) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.getBytes(getDataContext().getCharset()), space.asInteger(), false);
	}

	@Override
	public final void cat(String factor1, String factor2, QNumeric space, boolean clear) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.getBytes(getDataContext().getCharset()), space.asInteger(), clear);
	}

	@Override
	public void cat(String factor1, String factor2, Number space, boolean clear) {
		cat(QStrings.qINSTANCE.trimR(factor1).getBytes(getDataContext().getCharset()), factor2.getBytes(getDataContext().getCharset()), space, clear);
	}

	protected abstract void cat(byte[] factor1, byte[] factor2, Number space, boolean clear);

	@Override
	public final boolean eq(QHexadecimal value) {
		// TODO verify
		return NIOBufferHelper.compareBytes(this, value.asBytes()) == 0;
	}

	@Override
	public final boolean eq(QString value) {
		return NIOBufferHelper.compareBytes(this, _toBytes(value)) == 0;
	}

	@Override
	public final boolean eq(String value) {
		return NIOBufferHelper.compareBytes(this, _toBytes(value)) == 0;
	}

	@Override
	public final void eval(boolean value) {
		if (value)
			eval(DataSpecial.ON);
		else
			eval(DataSpecial.OFF);
	}

	@Override
	public final void eval(QIndicator value) {
		_write(value.asBytes());
	}

	@Override
	public final void eval(QString value) {
		_write(value.asBytes());
	}

	@Override
	public void eval(String value) {
		_write(value.getBytes(getDataContext().getCharset()));
	}

	@Override
	public final void eval(QDataArea<? extends QString> value) {
		_write(value.get().asBytes());
	}

	@Override
	public final boolean ge(QHexadecimal value) {
		// TODO verify
		return NIOBufferHelper.compareBytes(this, value.asBytes()) >= 0;
	}

	@Override
	public final boolean ge(QString value) {
		return NIOBufferHelper.compareBytes(this, value.asBytes()) >= 0;
	}

	@Override
	public final boolean ge(String value) {
		return NIOBufferHelper.compareBytes(this, _toBytes(value)) >= 0;
	}

	@Override
	public final BufferedElementType getBufferedElementType() {
		return BufferedElementType.STRING;
	}

	@Override
	protected byte getFiller() {
		return NIOStringImpl.INIT;
	}

	@Override
	public final boolean gt(QString value) {
		return NIOBufferHelper.compareBytes(this, _toBytes(value)) > 0;
	}

	@Override
	public final boolean gt(String value) {
		return NIOBufferHelper.compareBytes(this, _toBytes(value)) > 0;
	}

	@Override
	public boolean isEmpty() {

		for (byte b : asBytes())
			if (b != getFiller())
				return false;
		return true;
	}

	@Override
	public final boolean le(QHexadecimal value) {
		// TODO verify
		return NIOBufferHelper.compareBytes(this, value.asBytes()) <= 0;
	}

	@Override
	public final boolean le(QString value) {
		return NIOBufferHelper.compareBytes(this, value.asBytes()) <= 0;
	}

	@Override
	public final boolean le(String value) {
		return NIOBufferHelper.compareBytes(this, _toBytes(value)) <= 0;
	}

	@Override
	public final boolean lt(QString value) {
		return NIOBufferHelper.compareBytes(this, _toBytes(value)) < 0;
	}

	@Override
	public final boolean lt(String value) {
		return NIOBufferHelper.compareBytes(this, value.getBytes(getDataContext().getCharset())) < 0;
	}

	@Override
	public final void movea(QArray<? extends QString> value) {
		movea(value, false);
	}

	@Override
	public final void movea(QArray<? extends QString> value, boolean clear) {
		movea(value, 1, clear);
	}

	@Override
	public final void movea(QArray<? extends QString> value, int startIndex) {
		movea(value, startIndex, false);
	}

	@Override
	public final void movea(QArray<? extends QString> value, int startIndex, boolean clear) {

		if (!value.isContiguous())
			throw new UnsupportedOperationException("Invalid operation MOVEA with not contiguous array");

		if (value.get(1).isVarying())
			throw new UnsupportedOperationException("Invalid operation MOVEA with varying array");

		int position = ((value.getLength() / value.capacity()) * (startIndex - 1));

		NIOBufferedDataImpl arrayBuffer = NIOBufferHelper.getNIOBufferedDataImpl(value);

		int length = getLength();
		if (length > value.getLength())
			length = value.getLength();

		byte[] bytes = NIOBufferHelper.read(arrayBuffer.getBuffer(), arrayBuffer.getPosition() + position, length);

		_movel(bytes, clear);
	}

	@Override
	public final void movea(QArray<? extends QString> value, QNumeric startIndex) {
		movea(value, startIndex.i());
	}

	@Override
	public final void movea(QArray<? extends QString> value, QNumeric startIndex, boolean clear) {
		movea(value, startIndex.i(), clear);
	}

	@Override
	public final boolean ne(QHexadecimal value) {
		return !eq(value);
	}

	@Override
	public final boolean ne(QString value) {
		return !eq(value);
	}

	@Override
	public final boolean ne(String value) {
		return !eq(value);
	}

	@Override
	public final QDatetime qDate(DatetimeFormat format) {
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

	private QNumeric qIntOperation(String value, boolean roundingMode) {
		// TODO use cache
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 0, DecimalType.ZONED, true);
		number.eval(Integer.parseInt(value));
		return number;
	}

	@Override
	public final QCharacter qSubst(Number start) {
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
		QCharacter character = new NIOCharacterImpl(getDataContext(), length.intValue());
		if (isVarying())
			this.assign(character, start.intValue() + 2);
		else
			this.assign(character, start.intValue());

		return character;
	}

	@Override
	public final QCharacter qSubst(Number start, QNumeric length) {
		return qSubst(start, length.i());
	}

	@Override
	public final QCharacter qSubst(QNumeric start) {
		return qSubst(start.i());
	}

	@Override
	public final QCharacter qSubst(QNumeric start, Number length) {
		return qSubst(start.i(), length);
	}

	@Override
	public final QCharacter qSubst(QNumeric start, QNumeric length) {
		return qSubst(start.i(), length.i());
	}

	@Override
	public QCharacter qTrim() {

		// TODO cache?
		byte[] bytes = NIOBufferHelper.trim(this);
		NIOCharacterImpl character = new NIOCharacterImpl(getDataContext(), bytes.length);
		character.allocate();
		NIOBufferHelper.movel(character.getBuffer(), 0, bytes.length, bytes, false, getFiller());

		return character;
	}

	@Override
	public QCharacter qTrim(String trimmed) {

		// TODO replace me
		byte[] bytes = NIOBufferHelper.trim(this);
		NIOCharacterImpl character = new NIOCharacterImpl(getDataContext(), bytes.length);
		character.allocate();
		NIOBufferHelper.movel(character.getBuffer(), 0, bytes.length, bytes, false, getFiller());

		return character;
	}

	@Override
	public QCharacter qTrim(QString trimmed) {

		// TODO replace me
		byte[] bytes = NIOBufferHelper.trim(this);
		NIOCharacterImpl character = new NIOCharacterImpl(getDataContext(), bytes.length);
		character.allocate();
		NIOBufferHelper.movel(character.getBuffer(), 0, bytes.length, bytes, false, getFiller());

		return character;
	}

	@Override
	public QCharacter qTriml() {

		// TODO cache?
		byte[] bytes = NIOBufferHelper.trimL(this);
		NIOCharacterImpl character = new NIOCharacterImpl(getDataContext(), bytes.length);
		character.allocate();
		NIOBufferHelper.movel(character.getBuffer(), 0, bytes.length, bytes, false, getFiller());

		return character;
	}

	@Override
	public QCharacter qTrimr() {

		// TODO cache?
		byte[] bytes = NIOBufferHelper.trimR(this);
		NIOCharacterImpl character = new NIOCharacterImpl(getDataContext(), bytes.length);
		character.allocate();
		NIOBufferHelper.movel(character.getBuffer(), 0, bytes.length, bytes, false, getFiller());

		return character;
	}

	@Override
	public final String s() {
		return asString();
	}

	@Override
	public final void testn(QIndicator numeric) {
		testn(numeric, null);
	}

	@Override
	public final void testn(QIndicator numeric, QIndicator blank) {
		testn(numeric, blank, null);
	}

	@Override
	public final void testn(QIndicator numeric, QIndicator blank, QIndicator blankNumeric) {

		boolean isBlank = eq(DataSpecial.BLANKS);
		if (blank != null)
			blank.eval(isBlank);

		boolean isBlankNumeric = false;
		if (!isBlank)
			isBlankNumeric = asString().startsWith(" ");
		if (blankNumeric != null) {
			blankNumeric.eval(isBlankNumeric);
		}

		boolean isNumeric = false;
		if (!isBlank && !isBlankNumeric)
			try {
				Double.parseDouble(asString());
				isNumeric = true;
			} catch (Exception e) {
				isNumeric = false;
			}

		if (numeric != null)
			numeric.eval(isNumeric);

	}

	@Override
	public String toString() {
		return asString();
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
}