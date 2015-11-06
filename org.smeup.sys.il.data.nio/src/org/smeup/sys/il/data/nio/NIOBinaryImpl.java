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

import java.nio.ByteBuffer;

import org.smeup.sys.il.core.IntegratedLanguageCoreRuntimeException;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.def.BinaryType;

public class NIOBinaryImpl extends NIONumericImpl implements QBinary {

	private static final long serialVersionUID = 1L;
	private static byte FILLER = (byte) 0;

	private BinaryType _type;
	private boolean _unsigned;

	public NIOBinaryImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIOBinaryImpl(QDataContext dataContext, BinaryType type, boolean unsigned) {
		super(dataContext);
		this._type = type;
		this._unsigned = unsigned;
	}

	@Override
	protected byte getFiller() {
		return FILLER;
	}

	@Override
	public boolean isSigned() {
		return !_unsigned;
	}

	@Override
	public int getLength() {
		switch (_type) {
		case BYTE:
			return 1;
		case SHORT:
			return 2;
		case INTEGER:
			return 4;
		case LONG:
			return 8;
		}

		throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: sdbfsdsd456dfhg");
	}

	@Override
	public int getSize() {
		return getLength();
	}

	@Override
	public Number readNumber() {

		ByteBuffer buffer = getBuffer();
		int position = getPosition();

		NIOBufferHelper.prepare(buffer, position, getSize());
		switch (_type) {
		case BYTE:
			return buffer.get(position);
		case SHORT:
			return buffer.getShort(position);
		case INTEGER:
			return buffer.getInt(position);
		case LONG:
			return buffer.getLong(position);
		}

		throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: zv8rv8ewtrwe");
	}

	@Override
	public void writeNumber(Number number, String roundingMode) {

		ByteBuffer buffer = getBuffer();
		int position = getPosition();

		NIOBufferHelper.prepare(buffer, position, getSize());
		switch (_type) {
		case BYTE:
			buffer.put(position, (byte) number.intValue());
			return;
		case SHORT:
			buffer.putShort(position, number.shortValue());
			return;
		case INTEGER:
			buffer.putInt(position, number.intValue());
			return;
		case LONG:
			buffer.putLong(position, number.longValue());
			return;
		}

		throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: dsbf8w68etrwe");
	}

	@Override
	public int compareNumber(Number value) {

		ByteBuffer buffer = getBuffer();
		int position = getPosition();

		try {

			switch (_type) {
			case BYTE:
				return ((Byte) buffer.get(position)).compareTo((Byte) value);
			case SHORT:
				return ((Short) buffer.getShort(position)).compareTo((Short) value);
			case INTEGER:
				return ((Integer) buffer.getInt(position)).compareTo((Integer) value);
			case LONG:
				return ((Long) buffer.getLong(position)).compareTo((Long) value);
			}
		} catch (ClassCastException e) {
			System.err.println(e.getMessage());
			return -1;
		}

		throw new IntegratedLanguageCoreRuntimeException("Unexpected condition: sv8df5sd7fsd6");
	}

	@Override
	public double asDouble() {
		return asInteger();
	}
	
	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}
}