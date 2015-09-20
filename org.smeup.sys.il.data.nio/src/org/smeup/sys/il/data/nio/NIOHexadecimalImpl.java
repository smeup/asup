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

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QHexadecimal;

public class NIOHexadecimalImpl extends NIOBufferedDataImpl implements QHexadecimal {

	private static final long serialVersionUID = 1L;
	private static byte INIT = (byte) -1;

	private int _length;

	public NIOHexadecimalImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIOHexadecimalImpl(QDataContext dataContext, int length) {
		super(dataContext);
		this._length = length;
	}

	@Override
	public String asString() {

		String string = getHexString(asBytes());

		return string;
	}

	@Override
	public void eval(QBufferedData value) {
		eval(value.toString());
	}

	@Override
	public int getLength() {
		return _length;
	}

	@Override
	public int getSize() {
		return _length;
	}

	/*
	 * @Override public void reset() { if (_value != null)
	 * NIOBufferHelper.movel(getBuffer(), getPosition(), _length, _value, true,
	 * INIT); else Arrays.fill(getBuffer().array(), getPosition(), getPosition()
	 * + _length, INIT); }
	 */

	@Override
	public void eval(String value) {

		byte[] bytes = new byte[value.length() / 2];

		for (int i = 0; i < bytes.length; i++) {
			String hex = new String(value.substring(2 * i, 2 * i + 2));
			bytes[i] = (byte) Integer.parseInt(hex, 16);
		}
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), bytes, true, getFiller());
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void move(String value, boolean clear) {
		// TODO Auto-generated method stub
		value.toString();
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
		value.toString();
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
	protected byte getFiller() {
		return INIT;
	}

	private static final char[] BYTE2HEX = ("000102030405060708090A0B0C0D0E0F" + "101112131415161718191A1B1C1D1E1F" + "202122232425262728292A2B2C2D2E2F" + "303132333435363738393A3B3C3D3E3F"
			+ "404142434445464748494A4B4C4D4E4F" + "505152535455565758595A5B5C5D5E5F" + "606162636465666768696A6B6C6D6E6F" + "707172737475767778797A7B7C7D7E7F" + "808182838485868788898A8B8C8D8E8F"
			+ "909192939495969798999A9B9C9D9E9F" + "A0A1A2A3A4A5A6A7A8A9AAABACADAEAF" + "B0B1B2B3B4B5B6B7B8B9BABBBCBDBEBF" + "C0C1C2C3C4C5C6C7C8C9CACBCCCDCECF" + "D0D1D2D3D4D5D6D7D8D9DADBDCDDDEDF"
			+ "E0E1E2E3E4E5E6E7E8E9EAEBECEDEEEF" + "F0F1F2F3F4F5F6F7F8F9FAFBFCFDFEFF").toCharArray();;

	public static String getHexString(byte[] bytes) {
		final int len = bytes.length;
		final char[] chars = new char[len << 1];
		int hexIndex;
		int idx = 0;
		int ofs = 0;
		while (ofs < len) {
			hexIndex = (bytes[ofs++] & 0xFF) << 1;
			chars[idx++] = BYTE2HEX[hexIndex++];
			chars[idx++] = BYTE2HEX[hexIndex];
		}
		return new String(chars);

	}

	@Override
	public void eval(QHexadecimal value) {
		value.eval(this);
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
}