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

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.DecimalType;

public class NIOCharacterImpl extends NIOBufferedDataImpl implements QCharacter {


	private static final long serialVersionUID = 1L;
	private static final byte INIT = (byte) 64; // 32;
	// TODO inseriti in NioBufferedDataImpl
//	private static final String ENCODING = "IBM-280";// "ISO-8859-1";
//	private static final Charset CHARSET = Charset.forName(ENCODING);
	
	protected int _length;

	public NIOCharacterImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIOCharacterImpl(QDataContext dataContext, int length) {
		super(dataContext);
		_length = length;
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
	public void evalr(QBufferedData value) {
		evalr(value.s());
	}

	@Override
	public void eval(byte value) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), _length, new byte[] { value }, true, INIT);
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
	public void move(String value, boolean clear) {

		try {
			NIOBufferHelper.move(getBuffer(), getPosition(), _length, value.getBytes(getEncoding()), clear, INIT);
		} catch (UnsupportedEncodingException e) {
			NIOBufferHelper.move(getBuffer(), getPosition(), _length, value.getBytes(), clear, INIT);
		}
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
	public void movel(String value, boolean clear) {

		if (value == null)
			value = "";

		try {
			NIOBufferHelper.movel(getBuffer(), getPosition(), _length, value.getBytes(getEncoding()), clear, INIT);
		} catch (UnsupportedEncodingException e) {
			NIOBufferHelper.movel(getBuffer(), getPosition(), _length, value.getBytes(), clear, INIT);
		}
	}

	@Override
	public String asString() {
		return new String(asBytes());
	}

	@Override
	public String toString() {
		try {
			return new String(asBytes(), getEncoding());
		} catch (UnsupportedEncodingException e) {
			return new String(asBytes());
		} catch (Exception e) {
			// TODO
			return "";
		}
	}

	@Override
	public String trim() {
		return toString().trim();
	}

	@Override
	public String trimL() {
		return trimL(toString());
	}

	@Override
	public String trimR() {
		return trimR(toString());
	}

	/* cat */
	@Override
	public QCharacter cat(QString factor1) {
		cat(factor1, false);
		return this;
	}

	@Override
	public void cat(QString factor1, boolean clear) {
		if(clear)
			this.clear();
		eval(trimR() + factor1.toString());
	}
	
	@Override
	public QCharacter cat(String factor1) {
		cat(factor1, false);
		return this;
	}

	@Override
	public void cat(String factor1, boolean clear) {
		cat(factor1, (String)null, 0, clear);
	}
	
	@Override
	public void cat(String factor1, QString factor2) {
		cat(factor1, factor2.s(), 0);
	}

	@Override
	public void cat(String factor1, QString factor2, boolean clear) {
		cat(factor1, factor2.s(), 0, clear);
	}

	@Override
	public void cat(QString factor1, QString factor2) {
		cat(factor1.s(), factor2.s(), 0);
	}

	@Override
	public void cat(QString factor1, QString factor2, boolean clear) {
		cat(factor1.s(), factor2.s(), 0, clear);
	}
	
	@Override
	public void cat(QString factor1, String factor2) {
		cat(factor1.s(), factor2, 0);
	}

	@Override
	public void cat(QString factor1, String factor2, boolean clear) {
	}
	
	@Override
	public void cat(String factor1, String factor2) {
		cat(factor1, factor2, 0, false);
	}

	@Override
	public void cat(String factor1, String factor2, boolean clear) {
		cat(factor1, factor2, 0, clear);
	}
	
	@Override
	public void cat(QString factor1, Number space) {
		cat(factor1.s(), space, false);
	}

	@Override
	public void cat(QString factor1, Number space, boolean clear) {
		cat(factor1.s(), space, clear);
	}
	
	@Override
	public void cat(QString factor1, QNumeric space) {
		cat(factor1.s(), space.i(), false);
	}

	@Override
	public void cat(QString factor1, QNumeric space, boolean clear) {
		cat(factor1.s(), space.i(), clear);
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
	public void cat(String factor1, String factor2, int space) {
		cat(factor1, factor2, space, false);
	}

	@Override
	public void cat(String factor1, String factor2, int space, boolean clear) {
		if(factor2 == null){
			if (space == 0)
				eval(trimR() + factor1);
			else {
				try {
					String value = trimR();
					int length = value.length() + space;
					NIOBufferHelper.movel(getBuffer(), getPosition(), length, value.getBytes(getEncoding()), clear, INIT);
					NIOBufferHelper.movel(getBuffer(), getPosition() + length, _length, factor1.getBytes(getEncoding()), clear, INIT);
				} catch (UnsupportedEncodingException e) {
					throw new RuntimeException(e);
				}
			}
		}else{
			if (space == 0)
				eval(factor1.trim() + factor2.toString());
			else {
				try {
					String value = factor1.trim();
					int length = value.length() + space;
					NIOBufferHelper.movel(getBuffer(), getPosition(), length, value.getBytes(getEncoding()), clear, INIT);
					NIOBufferHelper.movel(getBuffer(), getPosition() + length, _length, factor2.getBytes(getEncoding()), clear, INIT);
				} catch (UnsupportedEncodingException e) {
					throw new RuntimeException(e);
				}
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
	public void cat(String factor1, QString factor2, int space) {
		cat(factor1, factor2.s(), space, false);
	}

	@Override
	public void cat(String factor1, QString factor2, int space, boolean clear) {
		cat(factor1, factor2.s(), space, clear);
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space) {
		cat(factor1, factor2.s(), space.i(), false);
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space, boolean clear) {
		cat(factor1, factor2.s(), space.i(), clear);
	}

	@Override
	public void cat(QString factor1, QString factor2, int space) {
		cat(factor1.s(), factor2.s(), space, false);
	}

	@Override
	public void cat(QString factor1, QString factor2, int space, boolean clear) {
		cat(factor1.s(), factor2.s(), space, clear);
	}
	
	@Override
	public void cat(QString factor1, QString factor2, QNumeric space) {
		cat(factor1.s(), factor2.s(), space.i(), false);
	}

	@Override
	public void cat(QString factor1, QString factor2, QNumeric space, boolean clear) {
		cat(factor1.s(), factor2.s(), space.i(), clear);
	}
	
	@Override
	public void cat(QString factor1, String factor2, int space) {
		cat(factor1.s(), factor2, space, false);
	}

	@Override
	public void cat(QString factor1, String factor2, int space, boolean clear) {
		cat(factor1.s(), factor2, space, clear);
	}
	
	@Override
	public void cat(String factor1, Number space) {
		cat(factor1, space, false);
	}

	@Override
	public void cat(String factor1, Number space, boolean clear) {
		cat(factor1, (String)null, space.intValue(), clear);
	}
	
	@Override
	public void cat(QString factor1, QString factor2, Number space) {
		cat(factor1.s(), factor2.s(), space.intValue(), false);
	}

	@Override
	public void cat(QString factor1, QString factor2, Number space, boolean clear) {
		cat(factor1.s(), factor2.s(), space.intValue(), clear);
	}

	@Override
	public void cat(QString factor1, String factor2, Number space) {
		cat(factor1.s(), factor2, space.intValue(), false);
	}

	@Override
	public void cat(QString factor1, String factor2, Number space, boolean clear) {
		cat(factor1.s(), factor2, space.intValue(), clear);
	}
	
	@Override
	public boolean eq(String value) {

		switch (defaultComparator) {
		case ASCII:
			return trimR().equals(trimR(value));

		case EBCDIC:
			return compareString(value) == 0;
		}

		return false;
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

		switch (defaultComparator) {
		case ASCII:
			return trimR().compareTo(trimR(value)) >= 0;

		case EBCDIC:
			return compareString(value) >= 0;
		}

		return false;
	}

	@Override
	public boolean gt(String value) {


		switch (defaultComparator) {
		case ASCII:
			return trimR().compareTo(trimR(value)) > 0;

		case EBCDIC:
			return compareString(value) > 0;
		}

		return false;
	}

	@Override
	public boolean le(String value) {

		switch (defaultComparator) {
		case ASCII:
			return trimR().compareTo(trimR(value)) <= 0;

		case EBCDIC:
			return compareString(value) <= 0;
		}

		return false;
	}

	@Override
	public boolean lt(String value) {

		switch (defaultComparator) {
		case ASCII:
			return trimR().compareTo(trimR(value)) <= 0;

		case EBCDIC:
			return compareString(value) <= 0;
		}

		return false;
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
		return eq(value.toString());
	}

	@Override
	public boolean ge(QString value) {
		return ge(value.toString());
	}

	@Override
	public boolean gt(QString value) {
		return gt(value.toString());
	}

	@Override
	public boolean le(QString value) {
		return le(value.toString());
	}

	@Override
	public boolean lt(QString value) {
		return lt(value.toString());
	}

	@Override
	public boolean ne(QString value) {
		return ne(value.toString());
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
			return " ";
		else if (value.name().equals("ZEROS"))
			Arrays.fill(charArray, '0');
		else if (value.name().equals("ZERO"))
			return "0";
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
	public void eval(QBufferedData value) {
		movel(value, true);
	}

	@Override
	protected byte getFiller() {
		return INIT;
	}

	// TODO rimosso, introdotto in NioBufferedDataImpl
//	protected String getEncoding() {
//		return ENCODING;
//	}

	@Override
	public void xlate(QString from, QString to, QString source) {
		xlate(from.s(), to.s(), source, 1, false);
	}

	@Override
	public void xlate(String from, String to, QString source) {
		xlate(from, to, source, 1, false);
	}

	@Override
	public void xlate(String from, String to, QString source, boolean clear) {
		xlate(from, to, source, 1, clear);
	}

	@Override
	public void xlate(String from, String to, QString source, Number start) {
		xlate(from, to, source, start, false);
	}

	@Override
	public void xlate(String from, String to, QString source, Number start, boolean clear) {
		xlate(from, to, source.s(), start, false);
	}

	@Override
	public void xlate(String from, String to, QString source, QNumeric start) {
		xlate(from, to, source, start, false);
	}

	@Override
	public void xlate(String from, String to, QString source, QNumeric start, boolean clear) {
		xlate(from, to, source, start.i(), clear);
	}

	@Override
	public void xlate(String from, QString to, QString source) {
		xlate(from, to, source, 1, false);
	}

	@Override
	public void xlate(String from, QString to, QString source, boolean clear) {
		xlate(from, to, source, 1, clear);
	}

	@Override
	public void xlate(String from, QString to, QString source, Number start) {
		xlate(from, to, source, start, false);
	}

	@Override
	public void xlate(String from, QString to, QString source, Number start, boolean clear) {
		xlate(from, to.s(), source, start, clear);
	}

	@Override
	public void xlate(String from, QString to, QString source, QNumeric start) {
		xlate(from, to, source, start.i(), false);
	}

	@Override
	public void xlate(String from, QString to, QString source, QNumeric start, boolean clear) {
		xlate(from, to, source, start.i(), clear);
	}

	@Override
	public void xlate(QString from, String to, QString source) {
		xlate(from, to, source, 1, false);
	}

	@Override
	public void xlate(QString from, String to, QString source, boolean clear) {
		xlate(from, to, source, 1, clear);
	}

	@Override
	public void xlate(QString from, String to, QString source, Number start) {
		xlate(from, to, source, start, false);
	}

	@Override
	public void xlate(QString from, String to, QString source, Number start, boolean clear) {
		xlate(from.s(), to, source, start, clear);
	}

	@Override
	public void xlate(QString from, String to, QString source, QNumeric start) {
		xlate(from, to, source, start, false);
	}

	@Override
	public void xlate(QString from, String to, QString source, QNumeric start, boolean clear) {
		xlate(from.s(), to, source, start, clear);
	}
	
	@Override
	public void xlate(byte from, String to, QString source) {
		// TODO Auto-generated method stub
	}

	@Override
	public void xlate(QString from, QString to, String source) {
		xlate(from, to, source, 1, false);
	}

	@Override
	public void xlate(QString from, QString to, String source, boolean clear) {
		xlate(from, to, source, 1, clear);
	}

	@Override
	public void xlate(QString from, QString to, String source, Number start) {
		xlate(from, to, source, start, false);
	}

	@Override
	public void xlate(QString from, QString to, String source, Number start, boolean clear) {
		xlate(from.s(), to.s(), source, start, clear);
	}

	@Override
	public void xlate(QString from, QString to, String source, QNumeric start) {
		xlate(from, to, source, start, false);
	}

	@Override
	public void xlate(QString from, QString to, String source, QNumeric start, boolean clear) {
		xlate(from.s(), to.s(), source, start.i(), clear);
	}

	@Override
	public void xlate(QString from, QString to, QString source, boolean clear) {
		xlate(from, to, source, 1, clear);
	}

	@Override
	public void xlate(QString from, QString to, QString source, Number start) {
		xlate(from, to, source, start, false);
	}

	@Override
	public void xlate(QString from, QString to, QString source, Number start, boolean clear) {
		xlate(from.s(), to.s(), source.s(), start, clear);
	}

	@Override
	public void xlate(QString from, QString to, QString source, QNumeric start) {
		xlate(from, to, source, start, false);
	}

	@Override
	public void xlate(QString from, QString to, QString source, QNumeric start, boolean clear) {
		xlate(from.s(), to.s(), source.s(), start.i(), clear);
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
			if(startId >= start.intValue() && (to.length()>=i && i>=0)){
				sb.append(to.substring(i, i+1));
			}else{
				sb.append(c);
			}
			startId++;
		}
		movel(sb.toString(), clear);
	}

	@Override
	public void xlate(String from, String to, String source, QNumeric start) {
		xlate(from, to, source, start, false);
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
			Double.parseDouble(toString());
		} catch (Exception e) {
			numeric.eval(false);
		}
	}

	public int compareString(String value) {

/*		ByteBuffer b1 = ByteBuffer.wrap(asBytes());
		ByteBuffer b2 = ByteBuffer.wrap(value.getBytes(CHARSET));
		int result = b1.compareTo(b2);

		System.out.println(bytesToHex(asBytes()));
		System.out.println(bytesToHex(value.getBytes(CHARSET)));*/
		
//		int result = compareBytes(asBytes(), value.getBytes(CHARSET));
		int result = compareBytes(asBytes(), value.getBytes(getCharset()));
		
		/*try {
			return compareBytes(asBytes(), b2.getBytes(getEncoding()));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}*/

		return result;
	}
	@Override
	public QNumeric qInt() {
		return qIntOperation(this.s(), false);
	}

	@Override
	public QNumeric qInth() {
		return qIntOperation(this.s(), true);
	}

	private QNumeric qIntOperation(String value, boolean roundingMode) {
		QDecimal number = getDataContext().getDataFactory().createDecimal(15, 0, DecimalType.ZONED, true);
		number.eval(Integer.parseInt(value.trim()));
		return number;
	}
	
	@Override
	public QNumeric qScan(QCharacter source) {
		return qScan(source.s(), (Integer)null, null);
	}

	@Override
	public QNumeric qScan(QCharacter source, QIndicator found) {
		return qScan(source.s(), (Integer)null, found);
	}

	@Override
	public QNumeric qScan(QCharacter source, QNumeric start) {
		return qScan(source.s(), start.asInteger(), null);
	}

	@Override
	public QNumeric qScan(QCharacter source, QNumeric start, QIndicator found) {
		return qScan(source.s(), start.asInteger(), found);
	}

	@Override
	public QNumeric qScan(QCharacter source, Number start) {
		return qScan(source.s(), start, null);
	}

	@Override
	public QNumeric qScan(QCharacter source, Number start, QIndicator found) {
		return qScan(source.s(), start, found);
	}

	@Override
	public QNumeric qScan(String source) {
		return qScan(source, (Integer)null, null);
	}

	@Override
	public QNumeric qScan(String source, QIndicator found) {
		return qScan(source, (Integer)null, found);
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
		
		int i = source.indexOf(toString(), start.intValue()-1);
		if(i<0) 
			number.eval(0);
		else {
			number.eval(i+1);
			getDataContext().found().eval(true);
		}
		if(found != null)
			found.eval(number.ge(1));
		
		return number;
	}

	@Override
	public QString qPlus(QString factor1) {
		return qPlus(factor1.s());
	}

	@Override
	public QString qPlus(String factor1) {		
		QString string = getDataContext().getTemporaryString();
		string.eval(s()+factor1);
		return string;
	}
}
