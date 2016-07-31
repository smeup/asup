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
import org.smeup.sys.il.data.QAdapter;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.def.DecimalType;

public final class NIOAdapterImpl extends NIOBufferedElementDelegatorImpl implements QAdapter {

	private static final long serialVersionUID = 1L;

	public NIOAdapterImpl(final QDataContext dataContext) {
		super(dataContext);
	}

	@Override
	public final void eval(final QAdapter value) {
		eval(value.getDelegate());
	}

	@Override
	public final void eval(final Object value) {

		if (value instanceof Byte) {
			final Byte number = (Byte) value;
			final QDecimal numeric = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
			numeric.eval(number);
			setDelegate(numeric);

		} else if (value instanceof Short) {
			final Short number = (Short) value;
			final QDecimal numeric = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
			numeric.eval(number);
			setDelegate(numeric);

		} else if (value instanceof Integer) {
			final Integer number = (Integer) value;
			final QDecimal numeric = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
			numeric.eval(number);
			setDelegate(numeric);

		} else if (value instanceof Long) {
			final Long number = (Long) value;
			final QDecimal numeric = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
			numeric.eval(number);
			setDelegate(numeric);

		} else {
			final String string = value.toString();
			try {
				final long number = Long.parseLong(string);
				final QDecimal numeric = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
				numeric.eval(number);
				setDelegate(numeric);
			} catch (final NumberFormatException e) {
				int stringLength = string.length();
				if (stringLength == 0)
					stringLength = 32;
				final NIOCharacterImpl character = new NIOCharacterFixedImpl(getDataContext(), string);

				setDelegate(character);
			}
		}
	}

	@Override
	public final QBufferedData eval(final DataSpecial value) {
		getDelegate().eval(value);
		return this;
	}
}
