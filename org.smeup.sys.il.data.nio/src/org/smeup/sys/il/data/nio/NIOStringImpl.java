package org.smeup.sys.il.data.nio;

import java.nio.ByteBuffer;
import java.util.Arrays;

import org.smeup.sys.il.data.BufferedElementType;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.DatetimeFormat;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QCharacter;
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
	protected static final byte HIVAL = (byte)9;
	
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
		cat(factor1, false);
	}

	@Override
	public final void cat(QString factor1, boolean clear) {
		if (clear)
			this.clear();
		
		eval(trimR() + factor1.asString());
	}

	@Override
	public final void cat(QString factor1, Number space) {
		cat(factor1.asString(), space, false);
	}

	@Override
	public final void cat(QString factor1, Number space, boolean clear) {
		cat(factor1.asString(), space, clear);
	}

	@Override
	public final void cat(QString factor1, QNumeric space) {
		cat(factor1.asString(), space.i(), false);
	}

	@Override
	public final void cat(QString factor1, QNumeric space, boolean clear) {
		cat(factor1.asString(), space.i(), clear);
	}

	@Override
	public final void cat(QString factor1, QString factor2) {
		cat(factor1.asString(), factor2.asString(), (Number) null, false);
	}

	@Override
	public final void cat(QString factor1, QString factor2, boolean clear) {
		cat(factor1.asString(), factor2.asString(), (Number) null, clear);
	}

	@Override
	public final void cat(QString factor1, QString factor2, Number space) {
		cat(factor1.asString(), factor2.asString(), space, false);
	}

	@Override
	public final void cat(QString factor1, QString factor2, Number space, boolean clear) {
		cat(factor1.asString(), factor2.asString(), space, clear);
	}

	@Override
	public final void cat(QString factor1, QString factor2, QNumeric space) {
		cat(factor1.asString(), factor2.asString(), space.i(), false);
	}

	@Override
	public final void cat(QString factor1, QString factor2, QNumeric space, boolean clear) {
		cat(factor1.asString(), factor2.asString(), space.i(), clear);
	}

	@Override
	public final void cat(QString factor1, String factor2) {
		cat(factor1.asString(), factor2, (Number) null, false);
	}

	@Override
	public final void cat(QString factor1, String factor2, boolean clear) {
		cat(factor1.asString(), factor2, (Number) null, clear);
	}

	@Override
	public final void cat(QString factor1, String factor2, Number space) {
		cat(factor1.asString(), factor2, space, false);
	}

	@Override
	public final void cat(QString factor1, String factor2, Number space, boolean clear) {
		cat(factor1.asString(), factor2, space, clear);
	}

	@Override
	public final void cat(String factor1) {
		cat(factor1, false);
	}

	@Override
	public final void cat(String factor1, boolean clear) {
		cat(factor1, (String) null, (Number) null, clear);
	}

	@Override
	public final void cat(String factor1, Number space) {
		cat(factor1, space, false);
	}

	@Override
	public final void cat(String factor1, Number space, boolean clear) {
		cat(factor1, (String) null, space, clear);
	}

	@Override
	public final void cat(String factor1, QNumeric space) {
		cat(factor1, space.i(), false);
	}

	@Override
	public final void cat(String factor1, QNumeric space, boolean clear) {
		cat(factor1, space.i(), clear);
	}

	@Override
	public final void cat(String factor1, QString factor2) {
		cat(factor1, factor2.asString(), (Number) null, false);
	}

	@Override
	public final void cat(String factor1, QString factor2, boolean clear) {
		cat(factor1, factor2.asString(), (Number) null, clear);
	}

	@Override
	public final void cat(String factor1, QString factor2, Number space) {
		cat(factor1, factor2.asString(), space, false);
	}

	@Override
	public final void cat(String factor1, QString factor2, Number space, boolean clear) {
		cat(factor1, factor2.asString(), space, clear);
	}

	@Override
	public final void cat(String factor1, QString factor2, QNumeric space) {
		cat(factor1, factor2.asString(), space.i(), false);
	}

	@Override
	public final void cat(String factor1, QString factor2, QNumeric space, boolean clear) {
		cat(factor1, factor2.asString(), space.i(), clear);
	}

	@Override
	public final void cat(String factor1, String factor2) {
		cat(factor1, factor2, (Number) null, false);
	}

	@Override
	public final void cat(String factor1, String factor2, boolean clear) {
		cat(factor1, factor2, (Number) null, clear);
	}

	@Override
	public final void cat(String factor1, String factor2, Number space) {
		cat(factor1, factor2, space, false);
	}

	@Override
	public final void cat(String factor1, String factor2, QNumeric space) {
		cat(factor1, factor2, space.i(), false);
	}

	@Override
	public final void cat(String factor1, String factor2, QNumeric space, boolean clear) {
		cat(factor1, factor2, space.i(), clear);
	}

	@Override
	public final void cat(String factor1, String factor2, Number space, boolean clear) {
		if (factor2 == null) {
			if (space == null)
				eval(this + factor1);
			else {
				String value = trimR();
				int length = value.length() + space.intValue();
				NIOBufferHelper.movel(getBuffer(), getPosition(), length, value.getBytes(getDataContext().getCharset()), clear, INIT);
				NIOBufferHelper.movel(getBuffer(), getPosition() + length, getLength(), factor1.getBytes(getDataContext().getCharset()), clear, INIT);
			}
		} else {
			if (space == null)
				eval(factor1 + factor2);
			else {
				// TODO trim?!?
				String value = factor1.trim();
				int length = value.length() + space.intValue();
				NIOBufferHelper.movel(getBuffer(), getPosition(), length, value.getBytes(getDataContext().getCharset()), clear, INIT);
				NIOBufferHelper.movel(getBuffer(), getPosition() + length, getLength(), factor2.getBytes(getDataContext().getCharset()), clear, INIT);
			}
		}

	}

	@SuppressWarnings("unused")
	private void cat(byte[] factor1, byte[] factor2, Number space, boolean clear) {
		
		ByteBuffer buffer = getBuffer();
		NIOBufferHelper.prepare(buffer, getPosition(), getSize());
		buffer.put(factor1);
		for(int i=0; i<space.intValue();i++)
			buffer.put(getFiller());
		
		buffer.put(factor2);

		if(clear)
			for (int i = buffer.position(); i < buffer.limit(); i++)
				buffer.put(getFiller());
	}
	
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
		if(value)
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
	public final void evalr(QString value) {
		// TODO verify
		move(value, true);
	}

	@Override
	public final void evalr(String value) {
		// TODO verify
		move(value, true);
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

		if(!value.isContiguous())
			throw new UnsupportedOperationException("Invalid operation MOVEA with not contiguous array");
		
		if(value.get(1).isVarying())
			throw new UnsupportedOperationException("Invalid operation MOVEA with varying array");
		
		int position = ((value.getLength() / value.capacity()) * (startIndex - 1));
		
		NIOBufferedDataImpl arrayBuffer = NIOBufferHelper.getNIOBufferedDataImpl(value);
		
		int length = getLength();
		if(length > value.getLength())
			length = value.getLength();
		
		byte[] bytes = NIOBufferHelper.read(arrayBuffer.getBuffer(), arrayBuffer.getPosition()+position, length); 
		
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
		return qSubst(start, (Number)null);
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

		// TODO remove double encoding
		// TODO cache? 
		String str = trim();
		NIOCharacterImpl character = new NIOCharacterImpl(getDataContext(), str.length());
		character.allocate();
		character.eval(str);

		return character;
	}

	@Override
	public QCharacter qTriml() {

		// TODO remove double encoding
		// TODO cache? 
		String str = trimL();
		NIOCharacterImpl character = new NIOCharacterImpl(getDataContext(), str.length());
		character.allocate();
		character.eval(str);

		return character;
	}

	@Override
	public QCharacter qTrimr() {
		
		// TODO remove double encoding
		// TODO cache? 
		String str = trimR();
		NIOCharacterImpl character = new NIOCharacterImpl(getDataContext(), str.length());
		character.allocate();
		character.eval(str);

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

		boolean isNumeric = false;
		try {
			Double.parseDouble(asString());
			isNumeric = true;
		} catch (Exception e) {
			numeric.eval(false);
		}

		if (numeric != null)
			numeric.eval(isNumeric);

		boolean isBlank = eq(DataSpecial.BLANKS);
		if (blank != null)
			blank.eval(isBlank);

		if (blankNumeric != null) {
			blankNumeric.eval(false);
			if (isNumeric && isBlank)
				blankNumeric.eval(true);
		}
	}

	@Override
	public String toString() {
		return asString();
	}
	
	@Override
	public final String trim() {
		return asString().trim();
	}

	@Override
	public final String trimL() {
		return QStrings.qINSTANCE.trimL(asString());
	}

	@Override
	public final String trimR() {
		return QStrings.qINSTANCE.trimR(asString());
	}
}