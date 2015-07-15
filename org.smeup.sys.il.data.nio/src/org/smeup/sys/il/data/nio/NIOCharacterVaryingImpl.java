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

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;

public class NIOCharacterVaryingImpl extends NIOCharacterImpl {

	private static final long serialVersionUID = 1L;

	private short length;

	public NIOCharacterVaryingImpl() {
		super();
	}

	public NIOCharacterVaryingImpl(int size) {
		super(size);
	}


	@Override
	public void clear() {
		super.clear();
		this.length = 0;
	}

	@Override
	public byte[] asBytes() {
		return NIOBufferHelper.readBytes(getBuffer(), getPosition(), getLength());
	}

	@Override
	public void eval(boolean value) {
		// TODO Auto-generated method stub
		super.eval(value);
	}

	@Override
	public void eval(QBufferedData value) {

		// TODO remove
		if (value == null)
			return;

		this.length = (value.getLength() > getSize() ? (short) getSize() : (short) value.getLength());

		super.eval(value);
	}

	@Override
	public void eval(String value) {

		if (value == null) {
			clear();
			return;
		}

		this.length = (value.length() > getSize() ? (short) getSize() : (short) value.length());

		super.eval(value);
	}

	@Override
	public int getLength() {
		return this.length;
	}

	@Override
	public int getSize() {
		return super.getSize();
	}

	@Override
	public void move(boolean value) {
		// TODO Auto-generated method stub
		super.move(value);
	}

	@Override
	public void move(int value, boolean clear) {
		// TODO Auto-generated method stub
		super.move(value, clear);
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value.asBytes(), clear, getFiller());
	}

	@Override
	public void move(String value, boolean clear) {

		try {
			NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value.getBytes(getEncoding()), clear, getFiller());
		} catch (UnsupportedEncodingException e) {
			NIOBufferHelper.move(getBuffer(), getPosition(), getLength(), value.getBytes(), clear, getFiller());
		}
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		// TODO Auto-generated method stub
		super.movea(value, clear);
	}

	@Override
	public void movel(boolean value) {
		// TODO Auto-generated method stub
		super.movel(value);
	}

	@Override
	public void movel(int value, boolean clear) {
		// TODO Auto-generated method stub
		super.movel(value, clear);
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {

		NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value.asBytes(), clear, getFiller());
	}

	@Override
	public void movel(String value, boolean clear) {

		try {
			NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value.getBytes(getEncoding()), clear, getFiller());
		} catch (UnsupportedEncodingException e) {
			NIOBufferHelper.movel(getBuffer(), getPosition(), getLength(), value.getBytes(), clear, getFiller());
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public String trim() {
		// TODO Auto-generated method stub
		return super.trim();
	}

	@Override
	public String trimL() {
		// TODO Auto-generated method stub
		return super.trimL();
	}

	@Override
	public String trimR() {
		// TODO Auto-generated method stub
		return super.trimR();
	}

	@Override
	public void cat(String factor1, String factor2, int space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, String factor2) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2);
	}

	@Override
	public void cat(String factor1) {
		// TODO Auto-generated method stub
		super.cat(factor1);
	}

	@Override
	public void cat(String factor1, String factor2, QNumeric space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, QString factor2, int space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, QString factor2, QNumeric space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, QString factor2, int space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, String factor2, int space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, QString factor2, Number space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(QString factor1, String factor2, Number space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public void cat(String factor1, QString factor2) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2);
	}

	@Override
	public void cat(QString factor1, QString factor2) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2);
	}

	@Override
	public void cat(QString factor1, String factor2) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2);
	}

	@Override
	public void cat(QString factor1) {
		// TODO Auto-generated method stub
		super.cat(factor1);
	}

	@Override
	public boolean eq(String value) {
		// TODO Auto-generated method stub
		return super.eq(value);
	}

	@Override
	public boolean ge(String value) {
		// TODO Auto-generated method stub
		return super.ge(value);
	}

	@Override
	public boolean gt(String value) {
		// TODO Auto-generated method stub
		return super.gt(value);
	}

	@Override
	public boolean le(String value) {
		// TODO Auto-generated method stub
		return super.le(value);
	}

	@Override
	public boolean lt(String value) {
		// TODO Auto-generated method stub
		return super.lt(value);
	}

	@Override
	public boolean ne(String value) {
		// TODO Auto-generated method stub
		return super.ne(value);
	}

	@Override
	public <E extends Enum<E>> void move(E value) {
		// TODO Auto-generated method stub
		super.move(value);
	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		// TODO Auto-generated method stub
		super.move(value, clear);
	}

	@Override
	public <E extends Enum<E>> void movel(E value) {
		// TODO Auto-generated method stub
		super.movel(value);
	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		// TODO Auto-generated method stub
		super.movel(value, clear);
	}

	@Override
	public String asString() {
		return super.asString();
	}

	@Override
	public void in() {
		// TODO Auto-generated method stub
		super.in();
	}

	@Override
	public void out() {
		// TODO Auto-generated method stub
		super.out();
	}

	@Override
	public void eval(byte value) {

		this.length = 1;

		super.eval(value);
	}

	@Override
	public void cat(QString factor1, Number space) {
		// TODO Auto-generated method stub
		super.cat(factor1, space);
	}

	@Override
	public void cat(String factor1, Number space) {
		// TODO Auto-generated method stub
		super.cat(factor1, space);
	}

	@Override
	public void cat(QString factor1, QNumeric space) {
		// TODO Auto-generated method stub
		super.cat(factor1, space);
	}

	@Override
	public void cat(String factor1, QNumeric space) {
		// TODO Auto-generated method stub
		super.cat(factor1, space);
	}

	@Override
	public void cat(QString factor1, QString factor2, QNumeric space) {
		// TODO Auto-generated method stub
		super.cat(factor1, factor2, space);
	}

	@Override
	public boolean le(QString value) {
		// TODO Auto-generated method stub
		return super.le(value);
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		// TODO Auto-generated method stub
		super.eval(value);
	}

	@Override
	public void xlate(QString from, QString to, QString target) {
		// TODO Auto-generated method stub
		super.xlate(from, to, target);
	}

	@Override
	public void xlate(String from, String to, QString target) {
		// TODO Auto-generated method stub
		super.xlate(from, to, target);
	}

	@Override
	public void xlate(byte from, String to, QString target) {
		// TODO Auto-generated method stub
		super.xlate(from, to, target);
	}
}