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

import java.math.BigDecimal;
import java.math.BigInteger;

import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDecimal;

public abstract class NIODecimalImpl extends NIONumericImpl implements QDecimal {


	private static final long serialVersionUID = 1L;
	protected static final byte INIT = (byte) -16;

	public NIODecimalImpl(QDataContext dataContext, int precision, int scale) {
		super(dataContext);
	}

	@Override
	protected byte getFiller() {
		return INIT;
	}

	@Override
	public int getLength() {
		return getPrecision();
	}

	@Override
	public boolean isSigned() {
		return true;
	}

	@Override
	public void eval(BigInteger value, String roundingMode) {
		writeNumber(value.doubleValue(), roundingMode);
	}

	@Override
	public void eval(BigDecimal value, String roundingMode) {
		writeNumber(value.doubleValue(), roundingMode);
	}

	@Override
	public int compareNumber(Number value) {

		double d1 = 0;
		try {
			d1 = asDouble();
		} catch (NumberFormatException e) {
			// TODO
			// System.err.println("Unexpected condition ahf989af9h9hh9af: " +
			// e);
		}
		double d2 = value.doubleValue();

		int result = Double.compare(d1, d2);

		return result;
	}
}