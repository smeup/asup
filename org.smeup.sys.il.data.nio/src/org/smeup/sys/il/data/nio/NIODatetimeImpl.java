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

import java.util.Date;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.def.DateFormat;
import org.smeup.sys.il.data.def.DatetimeType;

public class NIODatetimeImpl extends NIOBufferedDataImpl implements QDatetime {

	private static final long serialVersionUID = 1L;
	private static byte INIT = (byte) 32;

	private DatetimeType _type;
	private String _format;

	public NIODatetimeImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIODatetimeImpl(QDataContext dataContext, DatetimeType type, String format) {
		super(dataContext);
		
		this._type = type;
		this._format = format;

		// default format
		if (format == null || format.isEmpty())
			switch (type) {
			case DATE:
				this._format = "*ISO";
				break;
			case TIME:
				this._format = "*ISO";
				break;
			case TIME_STAMP:
				this._format = "*ISOISO";
				break;
			}
	}

	/*
	 * @Override public void reset() { if (_value != null)
	 * NIOBufferHelper.movel(getBuffer(), getPosition(), length(), _value, true,
	 * INIT); else Arrays.fill(getBuffer().array(), getPosition(), getPosition()
	 * + length(), INIT);
	 *
	 * }
	 */

	@Override
	public int getLength() {

		int length = 0;

		switch (_type) {
		case DATE:
			DateFormat dateFormat = DateFormat.get(_format);
			switch (dateFormat) {
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
			break;
		case TIME_STAMP:
			break;
		}

		return length;
	}

	@Override
	public int getSize() {
		return getLength();
	}

	@Override
	public void move(String value, boolean clear) {
		// TODO Auto-generated method stub

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
	public void movel(String value, boolean clear) {
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
	public String asString() {
		return new String(asBytes());
	}

	@Override
	public void eval(QBufferedData value) {
		movel(value.toString(), true);
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
}