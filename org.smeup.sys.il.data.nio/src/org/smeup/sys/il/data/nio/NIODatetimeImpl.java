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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.data.def.TimeFormat;

public class NIODatetimeImpl extends NIOBufferedDataImpl implements QDatetime {

	private static final long serialVersionUID = 1L;
	protected static final byte INIT = (byte) -16;

	private DatetimeType _type;
	private DateFormat _dateFormat;
	private TimeFormat _timeFormat;

	public NIODatetimeImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIODatetimeImpl(QDataContext dataContext, DatetimeType type, DateFormat dateFormat, TimeFormat timeFormat) {
		super(dataContext);

		this._type = type;

		if (dateFormat == null)
			this._dateFormat = getDataContext().getDateFormat();
		else
			this._dateFormat = dateFormat;

		if (timeFormat == null)
			this._timeFormat = getDataContext().getTimeFormat();
		else
			this._timeFormat = timeFormat;
	}

	@Override
	public int getLength() {

		int length = 0;

		switch (_type) {
		case DATE:
			switch (_dateFormat) {
			case DMY:
				length = 8;
				break;
			case EUR:
				length = 10;
				break;
			case ISO:
				length = 10;
				break;
			case JIS:
				length = 10;
				break;
			case JOBRUN:
				length = 10;
				break;
			case JUL:
				length = 6;
				break;
			case MDY:
				length = 8;
				break;
			case USA:
				length = 10;
				break;
			case YMD:
				length = 8;
				break;
			}
			break;
		case TIME:
			length = 8;
			break;
		case TIME_STAMP:
			length = 26;
			break;
		}

		return length;
	}

	@Override
	public int getSize() {
		return getLength();
	}

	@Override
	public <E extends Enum<E>> void move(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void movel(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eval(Date value) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eval(QDatetime value) {
		movel(value, true);
	}

	@Override
	protected byte getFiller() {
		return INIT;
	}

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long asTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long t() {
		return asTime();
	}

	@Override
	public <E extends Enum<E>> void adddur(int duration, E format, QDatetime value) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void adddur(QNumeric duration, E format, QDatetime value) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void adddur(int duration, E format) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void adddur(QNumeric duration, E format) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void subdur(int duration, E format, QDatetime value) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void subdur(QNumeric duration, E format, QDatetime value) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void subdur(int duration, E format) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> void subdur(QNumeric duration, E format) {
		// TODO Auto-generated method stub

	}

	@Override
	public <E extends Enum<E>> QNumeric qSubdt(E portion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E extends Enum<E>> QNumeric qDiff(QDatetime value, E format) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void time() {
		String result = getDateFormat(_type, _dateFormat, null, _timeFormat, null).format(Calendar.getInstance());
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), result.getBytes(getDataContext().getCharset()), true, getFiller());
	}

	@Override
	public boolean eq(String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return new String(asBytes(), getDataContext().getCharset());
	}

	@Override
	public Date asDate() {

		try {
			Date date = getDateFormat(_type, _dateFormat, null, _timeFormat, null).parse(new String(asBytes(), getDataContext().getCharset()));
			return date;
		} catch (ParseException e) {
			throw new IntegratedLanguageDataRuntimeException(e);
		}
	}

	@Override
	public String qEditd(DateFormat dateFormat, String dateSeparator, TimeFormat timeFormat, String timeSeparator) {
		String result = getDateFormat(_type, dateFormat, dateSeparator, timeFormat, timeSeparator).format(asDate());
		return result;
	}

	private SimpleDateFormat getDateFormat(DatetimeType datetimeType, DateFormat dateFormat, String dateSeparator, TimeFormat timeFormat, String timeSeparator) {
		
		SimpleDateFormat simpleDateFormat = null;
		switch (datetimeType) {
		case DATE:
			simpleDateFormat = new SimpleDateFormat(toJavaFormat(dateFormat, dateSeparator));
			break;
		case TIME:
			simpleDateFormat = new SimpleDateFormat(toJavaFormat(timeFormat, timeSeparator));
			break;
		case TIME_STAMP:
			simpleDateFormat = new SimpleDateFormat(toJavaFormat(dateFormat, dateSeparator) + "'T'" + toJavaFormat(timeFormat, timeSeparator));
			break;
		}

		return simpleDateFormat;
	}
	
	private String toJavaFormat(DateFormat dateFormat, String separator) {

		String format = null;
		switch (dateFormat) {
		case DMY:
			format = "dd-MM-yy";
		case EUR:
			format = "yyyy-MM-dd";
		case ISO:
			format = "yyyy-MM-dd";
		case JIS:
			format = "yyyy-MM-dd";
		case JOBRUN:
			format = "yy-MM-dd";
		case JUL:
			format = "yy-D";
		case MDY:
			format = "MM-dd-yy";
		case USA:
			format = "yyyy-MM-dd";
		case YMD:
			format = "yy-MM-dd";
		}

		if (separator != null)
			format = format.replaceAll("-", separator);

		return format;
	}

	private String toJavaFormat(TimeFormat timeFormat, String separator) {

		String format = null;
		switch (timeFormat) {
		case EUR:
			format = "HH:mm:ssz";
		case HMS:
			format = "HH:mm:ssz";
		case ISO:
			format = "HH:mm:ssz";
		case JIS:
			format = "HH:mm:ssz";
		case JOBRUN:
			format = "HH:mm:ssz";
		case USA:
			format = "HH:mm:ssz";
		}

		if (separator != null)
			format = format.replaceAll(":", separator);

		return format;
	}
}