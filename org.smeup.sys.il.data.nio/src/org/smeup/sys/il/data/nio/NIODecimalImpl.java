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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QNumeric;

public abstract class NIODecimalImpl extends NIONumericImpl implements QDecimal {

	private static final long serialVersionUID = 1L;

	protected transient NIODecimalDef _decimalDef;

	public NIODecimalImpl(final QDataContext dataContext, final int precision, final int scale) {
		super(dataContext);

		if(scale > precision) {
			if(precision == 1)
				_decimalDef = NIODecimalDef.getInstance(precision, 0);
			else
				throw new IntegratedLanguageDataRuntimeException("Unexpected condition lr64rsdf89i9nvieasrb8y6ta9r");
		}
		else
			_decimalDef = NIODecimalDef.getInstance(precision, scale);
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
	protected final byte[] _toBytes(final DataSpecial value) {

		switch (value) {
		case ZERO:
		case ZEROS:
			return _decimalDef.zoned_init;
		case LOVAL:
			return _decimalDef.zoned_loval;
		case HIVAL:
			return _decimalDef.zoned_hival;
		case BLANK:
		case BLANKS:
			return _decimalDef.zoned_init;
		case ON:
		case OFF:
		case NULL:
		case OMIT:
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition 237rvbwe87vb9stf");
		}

		return null;
	}

	protected final BigDecimal _toBigDecimal(Number number, boolean halfAdjust) {

		BigDecimal bd = null;
		if (number instanceof BigDecimal)
			bd = (BigDecimal) number;

		if (bd == null || bd.precision() > getPrecision() || bd.scale() > getScale()) {
			if (halfAdjust)
				bd = new BigDecimal(_decimalDef.formatUP.format(number));
			else
				bd = new BigDecimal(_decimalDef.formatDW.format(number));
		}
		
		return bd;
	}

	@Override
	public final void accept(final QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public final QNumeric qUns() {

		final NIONumericImpl number = new NIODecimalPackedImpl(getDataContext(), getPrecision(), getScale(), true);
		if (asShort() > 0)
			number.eval(this);
		else
			number.eval(this.asDouble() * -1);

		return number;
	}

	@Override
	public final QNumeric qLen() {
		QDecimal qLen = new NIODecimalPackedImpl(getDataContext(), 5, 0, true);
		qLen.eval(getLength());
		return qLen;
	}

	private final void readObject(final ObjectInputStream stream) throws IOException, ClassNotFoundException {

		stream.defaultReadObject();

		final int precision = stream.readInt();
		final int scale = stream.readInt();
		_decimalDef = NIODecimalDef.getInstance(precision, scale);
	}

	private final void writeObject(final ObjectOutputStream stream) throws IOException {

		stream.defaultWriteObject();

		stream.writeInt(getPrecision());
		stream.writeInt(getScale());
	}
}