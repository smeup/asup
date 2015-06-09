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
import org.smeup.sys.il.data.QIndicator;

public class NIOIndicatorImpl extends NIOBufferedDataImpl implements QIndicator {

	private static final long serialVersionUID = 1L;
	protected static byte OFF = (byte) -16;
	protected static byte ON = (byte) -15;

	public NIOIndicatorImpl() {
		super();
	}

	@Override
	public boolean asBoolean() {
		byte byte_ = asBytes()[0];
		return byte_ != OFF && byte_ != (byte) 48;
	}

	@Override
	public boolean eq(boolean value) {
		return asBoolean() == value;
	}

	@Override
	public boolean ne(boolean value) {
		return !eq(value);
	}

	@Override
	public boolean eq(QIndicator value) {
		return eq(value.asBoolean());
	}

	@Override
	public boolean ne(QIndicator value) {
		return !eq(value);
	}

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		if (value.name().equalsIgnoreCase("ON"))
			return eq(true);
		else
			return eq(false);
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		return !eq(value);
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		if (value.name().equalsIgnoreCase("ON"))
			eval(true);
		else
			eval(false);
	}

	@Override
	public boolean b() {
		return asBoolean();
	}

	@Override
	public void eval(QBufferedData value) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), 1, value.asBytes(), true, OFF);
	}

	@Override
	public int getLength() {
		return 1;
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean eq(String value) {
		return toString().equals(value);
	}

	@Override
	public void eval(boolean value) {
		if (value)
			NIOBufferHelper.movel(getBuffer(), getPosition(), 1, new byte[] { ON }, true, OFF);
		else
			NIOBufferHelper.movel(getBuffer(), getPosition(), 1, new byte[] { OFF }, true, OFF);
	}

	@Override
	public void eval(String value) {
		eval(!value.equals("0"));
	}

	@Override
	protected byte getFiller() {
		return OFF;
	}
}
