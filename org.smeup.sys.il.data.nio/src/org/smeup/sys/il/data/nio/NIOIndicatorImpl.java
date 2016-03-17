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

import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QIndicator;

public class NIOIndicatorImpl extends NIOCharacterImpl implements QIndicator {

	private static final long serialVersionUID = 1L;
	protected static final byte OFF = (byte) -16;
	protected static final byte ON = (byte) -15;

	public NIOIndicatorImpl(QDataContext dataContext) {
		super(dataContext);
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
	public boolean b() {
		return asBoolean();
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
	public void eval(String value) {
		if (value.equals("0"))
			eval(false);
		else if (value.equals("1"))
			eval(true);
		else
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition 237etxvq86rea invalid value "+value);
	}

	@Override
	protected byte getFiller() {
		return OFF;
	}

	@Override
	public QCharacter qTrim() {
		return this;
	}

	@Override
	public QCharacter qTriml() {
		return this;
	}

	@Override
	public QCharacter qTrimr() {
		return this;
	}

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit((QIndicator) this);
	}

	@Override
	public String toString() {
		return Boolean.toString(asBoolean());
	}
}
