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

import org.smeup.sys.il.data.DataComparator;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QDatetime;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;

public final class NIOBufferedListHelper {

	public final static int lookup(final NIOBufferedListImpl<?> list, final QBufferedElement argument, final DataComparator comparator, final int startIndex, final int numElements) {

		int result = 0;
		boolean resultIndex = false;

		final NIOBufferedListIterator<?> iterator = new NIOBufferedListIterator<>(list, list.getSortDirection(), startIndex, numElements);
		while (iterator.hasNext()) {
			QBufferedElement bufferedElement = iterator.next();
			bufferedElement = NIOBufferHelper.getNIOBufferedElementImpl(bufferedElement);
			switch (bufferedElement.getBufferedElementType()) {
			case DATETIME:
				final QDatetime datetime = ((QDatetime) bufferedElement);
				switch (comparator) {
				case EQUAL:
					resultIndex = datetime.eq((QDatetime) argument);
					break;
				case GREATER_THAN_EQUAL:
					resultIndex = datetime.ge((QDatetime) argument);
					break;
				case GREATER_THAN:
					resultIndex = datetime.gt((QDatetime) argument);
					break;
				case LESS_THAN_EQUAL:
					resultIndex = datetime.le((QDatetime) argument);
					break;
				case LESS_THAN:
					resultIndex = datetime.lt((QDatetime) argument);
					break;
				case NOT_EQUAL:
					resultIndex = datetime.ne((QDatetime) argument);
					break;
				}
				break;
			case NUMERIC:
				final QNumeric numeric = ((QNumeric) bufferedElement);
				switch (comparator) {
				case EQUAL:
					resultIndex = numeric.eq((QNumeric) argument);
					break;
				case GREATER_THAN_EQUAL:
					resultIndex = numeric.ge((QNumeric) argument);
					break;
				case GREATER_THAN:
					resultIndex = numeric.gt((QNumeric) argument);
					break;
				case LESS_THAN_EQUAL:
					resultIndex = numeric.le((QNumeric) argument);
					break;
				case LESS_THAN:
					resultIndex = numeric.lt((QNumeric) argument);
					break;
				case NOT_EQUAL:
					resultIndex = numeric.ne((QNumeric) argument);
					break;
				}
				break;
			case STRING:
				final QString string = ((QString) bufferedElement);
				switch (comparator) {
				case EQUAL:
					resultIndex = string.eq((QString) argument);
					break;
				case GREATER_THAN_EQUAL:
					resultIndex = string.ge((QString) argument);
					break;
				case GREATER_THAN:
					resultIndex = string.gt((QString) argument);
					break;
				case LESS_THAN_EQUAL:
					resultIndex = string.le((QString) argument);
					break;
				case LESS_THAN:
					resultIndex = string.lt((QString) argument);
					break;
				case NOT_EQUAL:
					resultIndex = string.ne((QString) argument);
					break;
				}
				break;
			}

			if (resultIndex) {
				result = iterator.current();
				break;
			} else {
				boolean exit = false;
				switch (comparator) {
				case EQUAL:
				case NOT_EQUAL:
				case GREATER_THAN_EQUAL:
				case GREATER_THAN:
					break;
				case LESS_THAN_EQUAL:
				case LESS_THAN:
					exit = true;
					break;
				}
				if (exit)
					break;
			}
		}

		return result;
	}

	public final static int lookup(final NIOBufferedListImpl<? extends QBufferedElement> list, final DataSpecial argument, final DataComparator comparator, final int startIndex, final int numElements) {

		int result = 0;
		boolean resultIndex = false;

		final NIOBufferedListIterator<? extends QBufferedElement> iterator = new NIOBufferedListIterator<>(list, list.getSortDirection(), startIndex, numElements);
		while (iterator.hasNext()) {
			final QBufferedElement bufferedElement = iterator.next();

			switch (comparator) {
			case EQUAL:
				resultIndex = bufferedElement.eq(argument);
				break;
			case GREATER_THAN_EQUAL:
				resultIndex = bufferedElement.ge(argument);
				break;
			case GREATER_THAN:
				resultIndex = bufferedElement.gt(argument);
				break;
			case LESS_THAN_EQUAL:
				resultIndex = bufferedElement.le(argument);
				break;
			case LESS_THAN:
				resultIndex = bufferedElement.lt(argument);
				break;
			case NOT_EQUAL:
				resultIndex = bufferedElement.ne(argument);
				break;
			}

			if (resultIndex) {
				result = iterator.current();
				break;
			} else {
				boolean exit = false;
				switch (comparator) {
				case EQUAL:
				case NOT_EQUAL:
				case GREATER_THAN_EQUAL:
				case GREATER_THAN:
					break;
				case LESS_THAN_EQUAL:
				case LESS_THAN:
					exit = true;
					break;
				}
				if (exit)
					break;
			}
		}

		return result;
	}
}