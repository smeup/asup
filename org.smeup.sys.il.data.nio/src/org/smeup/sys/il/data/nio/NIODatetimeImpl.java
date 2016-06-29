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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.smeup.sys.il.data.BufferedElementType;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.DatetimeFormat;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.DatetimeType;
import org.smeup.sys.il.data.def.DecimalType;
import org.smeup.sys.il.data.def.TimeFormat;

public class NIODatetimeImpl extends NIOBufferedElementImpl implements QDatetime {

	private static final long serialVersionUID = 1L;
	protected static final byte INIT = (byte) 64;
	protected static final GregorianCalendar CLEAR = new GregorianCalendar(0001,00,01);
	protected static final GregorianCalendar LOVAL = new GregorianCalendar(2039,11,31);
	protected static final GregorianCalendar HIVAL = new GregorianCalendar(1940,00,01);

	private DatetimeType _type;
	private DateFormat _dateFormat;
	private TimeFormat _timeFormat;
	
	public NIODatetimeImpl(QDataContext dataContext, DatetimeType type, DateFormat dateFormat, TimeFormat timeFormat, boolean allocate) {
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
		
		if(allocate) {
			checkAllocation();
			_buffer = ByteBuffer.allocate(getSize());
			_clear();
		}
	}

	@Override
	public boolean isEmpty() {

		for (byte b : asBytes())
			if (b != INIT)
				return false;
		return true;
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
				length = 8;
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
			case YYMD:
				length = 10;
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
	public final QBufferedData eval(DataSpecial value) {
		_write(_toBytes(value));
		return this;
	}

	@Override
	public void eval(QDatetime value) {
		movel(value, true);
	}

	@Override
	public long asTime() {
		return asDate().getTime();
	}

	@Override
	public long t() {
		return asTime();
	}

	@Override
	public void adddur(int duration, DatetimeFormat format, QDatetime value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void adddur(QNumeric duration, DatetimeFormat format, QDatetime value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void adddur(int duration, DatetimeFormat format) {
		// TODO Auto-generated method stub

	}

	@Override
	public void adddur(QNumeric duration, DatetimeFormat format) {
		// TODO Auto-generated method stub

	}

	@Override
	public void subdur(int duration, DatetimeFormat format, QDatetime value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void subdur(QNumeric duration, DatetimeFormat format, QDatetime value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void subdur(int duration, DatetimeFormat format) {
		// TODO Auto-generated method stub

	}

	@Override
	public void subdur(QNumeric duration, DatetimeFormat format) {
		// TODO Auto-generated method stub

	}

	@Override
	public QNumeric qDiff(QDatetime value, DatetimeFormat format) {

		QDecimal number = getDataContext().getDataFactory().createDecimal(10, 0, DecimalType.ZONED, true);

		Date a = this.asDate();
		Date b = value.asDate();
		
		
		long diff = (this.asDate().getTime() - value.asDate().getTime()) * 1000;
		
		switch (format) {
		case DAY:
		case DAYS:
			number.eval(diff / (24 * 60 * 60 * 1000));
			break;
		case ISO:
			break;
		case MILLISECONDS:
			number.eval(diff);
			break;
		case SECONDS:
			number.eval(diff / 1000);
			break;
		case MINUTES:
			number.eval(diff / (60 * 1000));
			break;
		case HOURS:
			number.eval(diff / (60 * 60 * 1000));
			break;
		case MONTH:
		case MONTHS:
			number.eval(diff / (30 * 24 * 60 * 60 * 1000));
			break;
		case YEAR:
		case YEARS:
			number.eval(diff / (365 * 30 * 24 * 60 * 60 * 1000));
			break;
		}
		
		return number;
		
	}

	@Override
	public void eval(Date value) {
		String result = getDateFormat(_type, _dateFormat, null, _timeFormat, null).format(value);
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), result.getBytes(getDataContext().getCharset()));
	}

	@Override
	public void time() {
		String result = getDateFormat(_type, _dateFormat, null, _timeFormat, null).format(Calendar.getInstance().getTime());
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), result.getBytes(getDataContext().getCharset()));
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
			String stringDate = new String(asBytes(), getDataContext().getCharset());
			Date date = getDateFormat(_type, _dateFormat, null, _timeFormat, null).parse(stringDate);
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
			simpleDateFormat = new SimpleDateFormat(toJavaFormat(dateFormat, dateSeparator) + "-" + toJavaFormat(timeFormat, timeSeparator) + ".SSSSSS");
			break;
		}

		return simpleDateFormat;
	}
	
	private String toJavaFormat(DateFormat dateFormat, String separator) {

		String format = null;
		
		switch (dateFormat) {
		case DMY:
			format = "dd/MM/yy";
			break;
		case EUR:
			format = "dd.MM.yyyy";
			break;
		case ISO:
			format = "yyyy-MM-dd";
			break;
		case JIS:
			format = "yyyy-MM-dd";
			break;
		case JOBRUN:
			format = "yy-MM-dd";
			break;
		case JUL:
			format = "yy-D";
			break;
		case MDY:
			format = "MM/dd/yy";
			break;
		case USA:
			format = "MM/dd/yyyy";
			break;
		case YMD:
			format = "yy/MM/dd";
			break;
		case YYMD:
			format = "yyyy/MM/dd";
			break;
		}

		if (separator != null) {
			format = format.replaceAll("-", separator);
		} 

		return format;
	}

	private String toJavaFormat(TimeFormat timeFormat, String separator) {

		String format = null;
		
		switch (timeFormat) {
		case EUR:			
			format = "HH.mm.ss";
			break;
		case HMS:
			format = "HH:mm:ss";
			break;
		case ISO:			
			format = "HH.mm.ss";
			break;
		case JIS:			
			format = "HH:mm:ss";
			break;
		case JOBRUN:			
			format = "HH.mm.ss";
			break;
		case USA:			
			format = "HH:mm a";
			break;
		}

		if (separator != null) { 			
			format = format.replaceAll(".", separator);			
		} 		
		
		return format;
	}

	@Override
	protected void _clear() {
		String result = getDateFormat(_type, _dateFormat, null, _timeFormat, null).format(CLEAR.getTime());
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), result.getBytes(getDataContext().getCharset()), INIT);
	}

	@Override
	protected void _write(byte[] value) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value, INIT);
	}

	@Override
	protected void _fill(byte[] value, boolean maxLength) {
		NIOBufferHelper.fill(getBuffer(), getPosition(), getLength(), value);
	}

	@Override
	protected void _fillr(byte[] value, boolean maxLength) {
		NIOBufferHelper.fillr(getBuffer(), getPosition(), getLength(), value);
	}
	
	@Override
	protected void _move(byte[] value, boolean clear) {
		if(clear)
			NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value, INIT);
		else
			NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value);
	}

	@Override
	protected void _movel(byte[] value, boolean clear) {
		if(clear)
			NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value, INIT);
		else
			NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value);
	}

	@Override
	protected byte[] _toBytes() {
		return NIOBufferHelper.read(getBuffer(), getPosition(), getLength());
	}

	@Override
	public BufferedElementType getBufferedElementType() {
		return BufferedElementType.DATETIME;
	}

	@Override
	protected byte[] _toBytes(DataSpecial value) {

		byte[] bytes = null;
		switch (value) {
		case LOVAL: {
			String result = getDateFormat(_type, _dateFormat, null, _timeFormat, null).format(LOVAL.getTime());
			bytes = result.getBytes(getDataContext().getCharset());
			break;
		}
		case HIVAL: {
			String result = getDateFormat(_type, _dateFormat, null, _timeFormat, null).format(HIVAL.getTime());
			bytes = result.getBytes(getDataContext().getCharset());
			break;
		}
		case BLANK:
		case BLANKS:
		case OFF:
		case ZERO:
		case ZEROS: 
		case ON:
		case NULL:
		case OMIT:
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition 237rvbwe87vb9stf");
		}

		return bytes;
	}

	@Override
	protected byte[] _toBytes(String value) {
		return value.getBytes(getDataContext().getCharset());
	}

	@Override
	protected byte[] _toBytes(QString value) {
		return value.asBytes();
	}

	@Override
	protected byte[] _toBytes(Number value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected byte[] _toBytes(QNumeric value) {
		return value.asBytes();
	}

	@Override
	protected byte[] _toBytes(QDatetime value) {
		return value.asBytes();
	}

	@Override
	public boolean ge(QDatetime value) {
		return asDate().compareTo(value.asDate()) >= 0;
	}

	@Override
	public boolean gt(QDatetime value) {
		return asDate().compareTo(value.asDate()) > 0;
	}

	@Override
	public boolean le(QDatetime value) {
		return asDate().compareTo(value.asDate()) <= 0;
	}

	@Override
	public boolean lt(QDatetime value) {
		return asDate().compareTo(value.asDate()) < 0;
	}

	@Override
	public boolean ne(QDatetime value) {
		return asDate().compareTo(value.asDate()) != 0;
	}

	@Override
	public boolean eq(QDatetime value) {
		return asDate().compareTo(value.asDate()) == 0;
	}
	
	@Override
	protected NIODataImpl _copy(QDataContext dataContext) {
		NIODatetimeImpl copy = new NIODatetimeImpl(dataContext, _type, _dateFormat, _timeFormat, false);
		return copy;
	}
}