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
import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QNumeric;

public abstract class NIODecimalImpl extends NIONumericImpl implements QDecimal {

	private static final long serialVersionUID = 1L;

	private final NIODecimalDef decimalDef;

	public NIODecimalImpl(final QDataContext dataContext, final int precision, final int scale) {
		super(dataContext);

		decimalDef = NIODecimalDef.getInstance(precision, scale);
	}

	protected final NIODecimalDef getDecimalDef() {
		return decimalDef;
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

		byte[] bytes = null;
		switch (value) {
		case ZERO:
		case ZEROS:
			bytes = getDecimalDef().getZonedInit();
			break;
		case LOVAL:
			bytes = getDecimalDef().getZonedLoval();
			break;
		case HIVAL:
			bytes = getDecimalDef().getZonedHival();
			break;
		case BLANK:
		case BLANKS:
			bytes = getDecimalDef().getZonedInit();
			break;
		case ON:
		case OFF:
		case NULL:
		case OMIT:
			throw new IntegratedLanguageDataRuntimeException("Unexpected condition 237rvbwe87vb9stf");
		}

		return bytes;
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
}