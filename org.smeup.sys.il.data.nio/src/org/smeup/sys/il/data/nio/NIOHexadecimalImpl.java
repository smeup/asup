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

import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QHexadecimal;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;

public final class NIOHexadecimalImpl extends NIOCharacterImpl implements QHexadecimal {

	private static final long serialVersionUID = 1L;

	public NIOHexadecimalImpl(final QDataContext dataContext, final int length, final boolean allocate) {
		super(dataContext, length);
	}

	@Override
	public final String toString() {

		final String string = getHexString(asBytes());

		return string;
	}

	@Override
	public final int getLength() {
		return _length;
	}

	@Override
	public final int getSize() {
		return _length;
	}

	@Override
	public final void eval(final String value) {

		final byte[] bytes = new byte[value.length() / 2];

		for (int i = 0; i < bytes.length; i++) {
			final String hex = new String(value.substring(2 * i, 2 * i + 2));
			bytes[i] = (byte) Integer.parseInt(hex, 16);
		}

		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), bytes, INIT);
	}

	private static final char[] BYTE2HEX = ("000102030405060708090A0B0C0D0E0F" + "101112131415161718191A1B1C1D1E1F" + "202122232425262728292A2B2C2D2E2F" + "303132333435363738393A3B3C3D3E3F"
			+ "404142434445464748494A4B4C4D4E4F" + "505152535455565758595A5B5C5D5E5F" + "606162636465666768696A6B6C6D6E6F" + "707172737475767778797A7B7C7D7E7F" + "808182838485868788898A8B8C8D8E8F"
			+ "909192939495969798999A9B9C9D9E9F" + "A0A1A2A3A4A5A6A7A8A9AAABACADAEAF" + "B0B1B2B3B4B5B6B7B8B9BABBBCBDBEBF" + "C0C1C2C3C4C5C6C7C8C9CACBCCCDCECF" + "D0D1D2D3D4D5D6D7D8D9DADBDCDDDEDF"
			+ "E0E1E2E3E4E5E6E7E8E9EAEBECEDEEEF" + "F0F1F2F3F4F5F6F7F8F9FAFBFCFDFEFF").toCharArray();;

	public final static String getHexString(final byte[] bytes) {
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
	public final void eval(final QHexadecimal value) {
		value.eval(this);
	}

	@Override
	public final void accept(final QDataVisitor visitor) {
		visitor.visit((QHexadecimal) this);
	}

	@Override
	protected final NIODataImpl _copyDef(final QDataContext dataContext) {
		final NIOHexadecimalImpl copy = new NIOHexadecimalImpl(dataContext, _length, false);
		return copy;
	}

	@Override
	public final boolean isVarying() {
		return false;
	}

	@Override
	protected final void cat(final byte[] factor1, final byte[] factor2, final Number space, final boolean clear) {
		System.err.println("Unexpected condition: 78rfsd8tfsdf8s");
	}

	@Override
	protected final void _clear() {
		NIOBufferHelper.fill(getBuffer(), getPosition(), getSize(), INIT);
	}

	@Override
	protected final void _fill(final byte[] value, final boolean maxLength) {
		NIOBufferHelper.fill(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	protected final void _fillr(final byte[] value, final boolean maxLength) {
		NIOBufferHelper.fillr(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	protected final void _move(final byte[] value, final boolean clear) {
		if (clear)
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), value, INIT);
		else
			NIOBufferHelper.move(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	protected final void _movel(final byte[] value, final boolean clear) {
		if (clear)
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value, INIT);
		else
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value);
	}

	@Override
	protected final void _write(final byte[] value) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value, INIT);
	}

	@Override
	protected final byte[] _toBytes() {
		return NIOBufferHelper.read(getBuffer(), getPosition(), getLength());
	}

	@Override
	public final QNumeric qLen() {

//		final QDecimal number = getDataContext().getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);
		final QDecimal number = ((NIODataContextImpl)getDataContext()).DATA_LENGTH;
		number.eval(getLength());

		return number;
	}

	@Override
	public final void snap() {
		if (!isEmpty())
			getDataContext().snap(this);
	}

	@Override
	public final void reset() {

		final QBufferedData snapData = getDataContext().getSnap(this);
		if (snapData != null)
			NIOBufferHelper.write(this, snapData);
		else
			clear();
	}

	@Override
	public final boolean isEmpty() {
		return eq(DataSpecial.BLANKS);
	}

	@Override
	public final QBufferedData eval(final DataSpecial value) {
		_write(_toBytes(value));
		return this;
	}

	@Override
	public final void evalr(final QString value) {

		final byte[] bytes = value.asBytes();
		if (bytes.length > _length)
			_move(bytes, false);
		else
			_move(bytes, true);
	}

	@Override
	public final void evalr(final String value) {

		final byte[] bytes = value.getBytes(getDataContext().getCharset());
		if (bytes.length > _length)
			_move(bytes, false);
		else
			_move(bytes, true);
	}
}