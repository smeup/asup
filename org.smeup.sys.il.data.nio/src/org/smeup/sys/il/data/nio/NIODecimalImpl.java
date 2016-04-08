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

import java.util.Arrays;

import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDecimal;

public abstract class NIODecimalImpl extends NIONumericImpl implements QDecimal {

	private static final long serialVersionUID = 1L;
	protected static final byte INIT = (byte) -16;
	protected static final byte LOVAL = (byte) -39;
	protected static final byte HIVAL = (byte) -7;

	public NIODecimalImpl(QDataContext dataContext, int precision, int scale) {
		super(dataContext);
	}

	@Override
	protected final byte getFiller() {
		return INIT;
	}

	@Override
	public final int getLength() {
		return getPrecision();
	}

	@Override
	public final boolean isSigned() {
		return true;
	}
	
	@Override
	public final void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	protected final byte[] _toBytes(DataSpecial value) {

		byte[] bytes = new byte[getLength()];
		switch (value) {
		case LOVAL:
			Arrays.fill(bytes, HIVAL);
			bytes[bytes.length-1] = LOVAL;
			break;
		case BLANK:
		case BLANKS:
			Arrays.fill(bytes, NIOCharacterImpl.INIT);
			break;
		case OFF:
		case ZERO:
		case ZEROS:
			Arrays.fill(bytes, INIT);
			break;
		case ON:
			Arrays.fill(bytes, NIOIndicatorImpl.ON);
			break;
		case HIVAL:
			Arrays.fill(bytes, HIVAL);
			break;
		case NULL:
		case OMIT:
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition 237rvbwe87vb9stf");
		}

		return bytes;
	}
}