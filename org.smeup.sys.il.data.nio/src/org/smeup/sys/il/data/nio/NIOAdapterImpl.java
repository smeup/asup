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

import org.smeup.sys.il.data.QAdapter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.def.DecimalType;

public class NIOAdapterImpl extends NIOBufferedElementDelegatorImpl implements QAdapter {

	private static final long serialVersionUID = 1L;

	public NIOAdapterImpl(QDataContext dataContext) {
		super(dataContext);
	}

	@Override
	public void eval(QAdapter value) {
		eval(value.getDelegate());
	}

	@Override
	public void eval(Object value) {

		if (value instanceof Byte) {
			Byte number = (Byte) value;
			QDecimal numeric = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
			numeric.eval(number);
			setDelegate(numeric);

		} else if (value instanceof Short) {
			Short number = (Short) value;
			QDecimal numeric = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
			numeric.eval(number);
			setDelegate(numeric);

		} else if (value instanceof Integer) {
			Integer number = (Integer) value;
			QDecimal numeric = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
			numeric.eval(number);
			setDelegate(numeric);

		} else if (value instanceof Long) {
			Long number = (Long) value;
			QDecimal numeric = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
			numeric.eval(number);
			setDelegate(numeric);

		} else {
			String string = value.toString();
			try {
				long number = Long.parseLong(string);
				QDecimal numeric = getDataContext().getDataFactory().createDecimal(15, 5, DecimalType.ZONED, true);
				numeric.eval(number);
				setDelegate(numeric);
			} catch (NumberFormatException e) {
				int stringLength = string.length();
				if (stringLength == 0)
					stringLength = 32;
				NIOCharacterImpl character = new NIOCharacterImpl(getDataContext(), stringLength, true);
				character.eval(string);

				setDelegate(character);
			}
		}
	}
}
