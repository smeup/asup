/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse public final License v1.0
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

public final class NIODatetimeImpl extends NIOBufferedElementImpl implements QDatetime {

	private static final long serialVersionUID = 1L;
	protected static final byte INIT = (byte) 64;
	protected static final GregorianCalendar CLEAR = new GregorianCalendar(0001, 00, 01);
	protected static final GregorianCalendar LOVAL = new GregorianCalendar(2039, 11, 31);
	protected static final GregorianCalendar HIVAL = new GregorianCalendar(1940, 00, 01);

	private final DatetimeType _type;
	private DateFormat _dateFormat;
	private TimeFormat _timeFormat;

	public NIODatetimeImpl(final QDataContext dataContext, final DatetimeType type, final DateFormat dateFormat, final TimeFormat timeFormat, final boolean allocate) {
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

		if (allocate) {
			_storage = ByteBuffer.allocate(getSize());
			clear();
		}
	}

	@Override
	public final void clear() {
		final String result = getDateFormat(_type, _dateFormat, null, _timeFormat, null).format(CLEAR.getTime());
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), result.getBytes(getDataContext().getCharset()), INIT);
	}

	@Override
	public final boolean isEmpty() {

		for (final byte b : asBytes())
			if (b != INIT)
				return false;
		return true;
	}

	@Override
	public final int getLength() {

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
	public final int getSize() {
		return getLength();
	}

	@Override
	public final QBufferedData eval(final DataSpecial value) {
		_write(_toBytes(value));
		return this;
	}

	@Override
	public final void eval(final QDatetime value) {
		movel(value, true);
	}

	@Override
	public final long asTime() {
		return asDate().getTime();
	}

	@Override
	public final long t() {
		return asTime();
	}

	@Override
	public final void adddur(final int duration, final DatetimeFormat format, final QDatetime value) {
		// TODO Auto-generated method stub

	}

	@Override
	public final void adddur(final QNumeric duration, final DatetimeFormat format, final QDatetime value) {
		// TODO Auto-generated method stub

	}

	@Override
	public final void adddur(final int duration, final DatetimeFormat format) {
		// TODO Auto-generated method stub

	}

	@Override
	public final void adddur(final QNumeric duration, final DatetimeFormat format) {
		// TODO Auto-generated method stub

	}

	@Override
	public final void subdur(final int duration, final DatetimeFormat format, final QDatetime value) {
		// TODO Auto-generated method stub

	}

	@Override
	public final void subdur(final QNumeric duration, final DatetimeFormat format, final QDatetime value) {
		// TODO Auto-generated method stub

	}

	@Override
	public final void subdur(final int duration, final DatetimeFormat format) {
		// TODO Auto-generated method stub

	}

	@Override
	public final void subdur(final QNumeric duration, final DatetimeFormat format) {
		// TODO Auto-generated method stub

	}

	@Override
	public final QNumeric qDiff(final QDatetime value, final DatetimeFormat format) {

		final QDecimal number = getDataContext().getDataFactory().createDecimal(10, 0, DecimalType.ZONED, true);

		final long diff = (this.asDate().getTime() - value.asDate().getTime()) * 1000;

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
	public final void eval(final Date value) {
		final String result = getDateFormat(_type, _dateFormat, null, _timeFormat, null).format(value);
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), result.getBytes(getDataContext().getCharset()));
	}

	@Override
	public final void time() {
		final String result = getDateFormat(_type, _dateFormat, null, _timeFormat, null).format(Calendar.getInstance().getTime());
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), result.getBytes(getDataContext().getCharset()));
	}

	@Override
	public final void accept(final QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public final String toString() {
		return new String(asBytes(), getDataContext().getCharset());
	}

	@Override
	public final Date asDate() {

		try {
			final String stringDate = new String(asBytes(), getDataContext().getCharset());
			final Date date = getDateFormat(_type, _dateFormat, null, _timeFormat, null).parse(stringDate);
			return date;
		} catch (final ParseException e) {
			throw new IntegratedLanguageDataRuntimeException(e);
		}
	}

	@Override
	public final String qEditd(final DateFormat dateFormat, final String dateSeparator, final TimeFormat timeFormat, final String timeSeparator) {
		final String result = getDateFormat(_type, dateFormat, dateSeparator, timeFormat, timeSeparator).format(asDate());
		return result;
	}

	private final SimpleDateFormat getDateFormat(final DatetimeType datetimeType, final DateFormat dateFormat, final String dateSeparator, final TimeFormat timeFormat, final String timeSeparator) {

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

	private final String toJavaFormat(final DateFormat dateFormat, final String separator) {

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

		if (separator != null)
			format = format.replaceAll("-", separator);

		return format;
	}

	private final String toJavaFormat(final TimeFormat timeFormat, final String separator) {

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

		if (separator != null)
			format = format.replaceAll(".", separator);

		return format;
	}

	@Override
	protected final void _write(final byte[] value) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value, INIT);
	}

	@Override
	protected final void _fill(final byte[] value, final boolean maxLength) {
		NIOBufferHelper.fill(getBuffer(), getPosition(), getLength(), value);
	}

	@Override
	protected final void _fillr(final byte[] value, final boolean maxLength) {
		NIOBufferHelper.fillr(getBuffer(), getPosition(), getLength(), value);
	}

	@Override
	protected final void _move(final byte[] value, final boolean clear) {
		if (clear)
			NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value, INIT);
		else
			NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value);
	}

	@Override
	protected final void _movel(final byte[] value, final boolean clear) {
		if (clear)
			NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value, INIT);
		else
			NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value);
	}

	@Override
	public final byte[] asBytes() {
		return NIOBufferHelper.read(getBuffer(), getPosition(), getLength());
	}

	@Override
	public final BufferedElementType getBufferedElementType() {
		return BufferedElementType.DATETIME;
	}

	@Override
	protected final byte[] _toBytes(final DataSpecial value) {

		byte[] bytes = null;
		switch (value) {
		case LOVAL: {
			final String result = getDateFormat(_type, _dateFormat, null, _timeFormat, null).format(LOVAL.getTime());
			bytes = result.getBytes(getDataContext().getCharset());
			break;
		}
		case HIVAL: {
			final String result = getDateFormat(_type, _dateFormat, null, _timeFormat, null).format(HIVAL.getTime());
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
	protected final byte[] _toBytes(final String value) {
		return value.getBytes(getDataContext().getCharset());
	}

	@Override
	protected final byte[] _toBytes(final QString value) {
		return value.asBytes();
	}

	@Override
	protected final byte[] _toBytes(final Number value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected final byte[] _toBytes(final QNumeric value) {
		return value.asBytes();
	}

	@Override
	protected final byte[] _toBytes(final QDatetime value) {
		return value.asBytes();
	}

	@Override
	public final boolean ge(final QDatetime value) {
		return asDate().compareTo(value.asDate()) >= 0;
	}

	@Override
	public final boolean gt(final QDatetime value) {
		return asDate().compareTo(value.asDate()) > 0;
	}

	@Override
	public final boolean le(final QDatetime value) {
		return asDate().compareTo(value.asDate()) <= 0;
	}

	@Override
	public final boolean lt(final QDatetime value) {
		return asDate().compareTo(value.asDate()) < 0;
	}

	@Override
	public final boolean ne(final QDatetime value) {
		return asDate().compareTo(value.asDate()) != 0;
	}

	@Override
	public final boolean eq(final QDatetime value) {
		return asDate().compareTo(value.asDate()) == 0;
	}

	@Override
	public boolean eq(Date value) {
		return asDate().compareTo(value) == 0;
	}

	@Override
	protected final NIODataImpl _copyDef(final QDataContext dataContext) {
		final NIODatetimeImpl copy = new NIODatetimeImpl(dataContext, _type, _dateFormat, _timeFormat, false);
		return copy;
	}

	
	@Override
	public final void reset() {

		if (_reset != null)
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), _reset);
		else
			clear();
	}

	@Override
	public final QNumeric qLen() {

		final QDecimal number = getDataContext().getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);
		number.eval(getLength());

		return number;
	}

	@Override
	public final void snap() {
		if (!isEmpty())
			_reset = NIOBufferHelper.read(this);
	}
}