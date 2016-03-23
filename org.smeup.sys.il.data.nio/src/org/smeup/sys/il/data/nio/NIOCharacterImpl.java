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

import java.nio.ByteBuffer;

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.DecimalType;

public class NIOCharacterImpl extends NIOStringImpl implements QCharacter {

	private static final long serialVersionUID = 1L;

	protected int _length;

	public NIOCharacterImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIOCharacterImpl(QDataContext dataContext, int length) {
		super(dataContext);
		_length = length;
	}

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);
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
	public void evalr(QString value) {

		byte[] bytes = value.asBytes();
		if (bytes.length > _length) {
			_move(bytes, false);
		} else
			_move(bytes, true);
	}

	@Override
	public void evalr(String value) {

		byte[] bytes = value.getBytes(getDataContext().getCharset());
		if (bytes.length > _length) {
			_move(bytes, false);
		} else
			_move(bytes, true);
	}


	@Override
	protected void cat(byte[] factor1, byte[] factor2, Number space, boolean clear) {
		
		ByteBuffer buffer = getBuffer();
		NIOBufferHelper.prepare(buffer, getPosition(), getLength());

		int remaining = buffer.remaining();
		if(remaining > factor1.length) {
			buffer.put(factor1);
			remaining = remaining - factor1.length;
		}
		else {
			buffer.put(factor1, 0, remaining);
			return;
		}

		if(space != null) {
			int s = space.intValue();
			if(s>remaining) {
				for(int i=0; i<remaining;i++)
					buffer.put(getFiller());
				return;
			}
			else {
				for(int i=0; i<s; i++)
					buffer.put(getFiller());
				
				remaining = remaining - s;
			}
		}

		if(remaining > factor2.length)
			buffer.put(factor2);
		else {
			buffer.put(factor2, 0, remaining);
			return;
		}

		if(clear)
			while(buffer.hasRemaining())
				buffer.put(getFiller());
	}

	@Override
	protected void _clear() {
		NIOBufferHelper.clear(getBuffer(), getPosition(), getSize(), getFiller());
	}

	@Override
	protected void _fill(byte[] value, boolean maxLength) {
		NIOBufferHelper.fill(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	protected void _fillr(byte[] value, boolean maxLength) {
		NIOBufferHelper.fillr(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	protected void _write(byte[] value) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value, true, getFiller());
	}

	@Override
	protected void _move(byte[] value, boolean clear) {
		NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), value, clear, getFiller());
	}

	@Override
	protected void _movel(byte[] value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value, clear, getFiller());
	}

	@Override
	public boolean isVarying() {
		return false;
	}

	@Override
	public QNumeric qCheck(QCharacter base) {
		return qCheck(base.asString(), (Integer)null , null);
	}

	@Override
	public QNumeric qCheck(QCharacter base, QIndicator found) {
		return qCheck(base.asString(), (Integer)null , found);
	}

	@Override
	public QNumeric qCheck(QCharacter base, QNumeric start) {
		return qCheck(base.asString(), start.asInteger() , null);
	}

	@Override
	public QNumeric qCheck(QCharacter base, QNumeric start, QIndicator found) {
		return qCheck(base.asString(), start.asInteger() , found);
	}

	@Override
	public QNumeric qCheck(QCharacter base, Number start) {
		return qCheck(base.asString(), start , null);
	}

	@Override
	public QNumeric qCheck(QCharacter base, Number start, QIndicator found) {
		return qCheck(base.asString(), start , found);
	}

	@Override
	public QNumeric qCheck(String base) {
		return qCheck(base, (Integer)null, null);
	}

	@Override
	public QNumeric qCheck(String base, QIndicator found) {
		return qCheck(base, (Integer)null , found);
	}

	@Override
	public QNumeric qCheck(String base, QNumeric start) {
		return qCheck(base, start.asInteger() , null);
	}

	@Override
	public QNumeric qCheck(String base, QNumeric start, QIndicator found) {
		return qCheck(base, start.asInteger() , found);
	}

	@Override
	public QNumeric qCheck(String base, Number start) {
		return qCheck(base, start, null);
	}

	@Override
	public QNumeric qCheck(String base, Number start, QIndicator found) {
		// TODO use cache
		QDecimal number = getDataContext().getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);
		
		if (start == null)
			start = 1;
		int id = start.intValue()-1;
		
		for (char c : base.substring(start.intValue()-1).toCharArray()) {
			id++;
			int i = asString().indexOf(c);
			if(i<0){
				number.eval(id);
				break;
			}
		}
		if (found != null)
			found.eval(number.gt(0));
		
		return number;
	}

	@Override
	public QNumeric qCheckr(QCharacter base) {
		return qCheckr(base.asString(), (Integer)null , null);
	}

	@Override
	public QNumeric qCheckr(QCharacter base, QIndicator found) {
		return qCheckr(base.asString(), (Integer)null , found);
	}

	@Override
	public QNumeric qCheckr(QCharacter base, QNumeric start) {
		return qCheckr(base.asString(), start.asInteger() , null);
	}

	@Override
	public QNumeric qCheckr(QCharacter base, QNumeric start, QIndicator found) {
		return qCheckr(base.asString(), start.asInteger() , found);
	}

	@Override
	public QNumeric qCheckr(QCharacter base, Number start) {
		return qCheckr(base.asString(), start , null);
	}

	@Override
	public QNumeric qCheckr(QCharacter base, Number start, QIndicator found) {
		return qCheckr(base.asString(), start , found);
	}

	@Override
	public QNumeric qCheckr(String base) {
		return qCheckr(base, (Integer)null, null);
	}

	@Override
	public QNumeric qCheckr(String base, QIndicator found) {
		return qCheckr(base, (Integer)null , found);
	}

	@Override
	public QNumeric qCheckr(String base, QNumeric start) {
		return qCheckr(base, start.asInteger() , null);
	}

	@Override
	public QNumeric qCheckr(String base, QNumeric start, QIndicator found) {
		return qCheckr(base, start.asInteger() , found);
	}

	@Override
	public QNumeric qCheckr(String base, Number start) {
		return qCheckr(base, start, null);
	}
	
	@Override
	public QNumeric qCheckr(String base, Number start, QIndicator found) {
		// TODO use cache
		QDecimal number = getDataContext().getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);
		if (start == null)
			start = base.length();

		char[] chars = base.substring(0, start.intValue()).toCharArray();
		
		for (int ii = chars.length; ii>0; ii--) {
			int i = asString().indexOf(chars[ii-1]);
			if(i<0){
				number.eval(ii);
				break;
			}
		}
		if (found != null)
			found.eval(number.gt(0));
		
		return number;
	}	
	
	@Override
	public QNumeric qLookup(QArray<?> array, QIndicator found) {
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
	public QString qPlus(String factor1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QString qPlus(QString factor1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QNumeric qScan(QCharacter source) {
		return qScan(source.asString(), (Integer) null, null);
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
	public QNumeric qScan(String source) {
		return qScan(source, (Integer) null, null);
	}

	@Override
	public QNumeric qScan(String source, Number start) {
		return qScan(source, start, null);
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
	public QNumeric qScan(String source, Number start, QIndicator found) {

		// TODO use cache
		QDecimal number = getDataContext().getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);

		// default
		if (start == null)
			start = 1;
		
		int i = source.indexOf(asString(), start.intValue() - 1);		
		if (i >= 0) {
			number.eval(i + 1);
			getDataContext().found().eval(true);
		}
		else {
			getDataContext().found().eval(false);
		}
		
		if (found != null)
			found.eval(getDataContext().found());
		
		return number;
	}
	
	@Override
	public void xlate(byte from, String to, QString source) {
		xlate(new String(new byte[] { from }), to, source.asString());
	}

	@Override
	public void xlate(QString from, QString to, QString source) {
		xlate(from.asString(), to.asString(), source.asString(), 1, false);
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
		xlate(from, to, source.asString(), start, clear);
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
	public void xlate(String from, String to, String source, QNumeric start) {
		xlate(from, to, source, start.i(), false);
	}

	@Override
	public void xlate(String from, String to, String source, QNumeric start, boolean clear) {
		xlate(from, to, source, start.i(), clear);
	}

	@Override
	public void xlate(String from, String to, String source, Number start, boolean clear) {
		StringBuffer sb = new StringBuffer();
		int startId = 0;
		for (char c : source.toCharArray()) {
			if(startId > getLength())
				break;
			startId++;
			int i = from.indexOf(c);
			if(startId<start.intValue() || (i < 0) || (i + 1 > to.length()))
				sb.append(c);
			else
				sb.append(to.substring(i, i + 1));
		}
		movel(sb.toString(), clear);
	}
	
}