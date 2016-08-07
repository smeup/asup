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

import java.util.Iterator;

import org.smeup.sys.il.data.BufferedDataType;
import org.smeup.sys.il.data.BufferedElementType;
import org.smeup.sys.il.data.DataComparator;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QBufferedList;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QList;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.SortDirection;
import org.smeup.sys.il.data.def.DecimalType;

public abstract class NIOBufferedListImpl<D extends QBufferedElement> extends NIOBufferedDataImpl implements QBufferedList<D> {

	private static final long serialVersionUID = 1L;
	private NIOBufferedListImpl<?> listOwner;

	private D _model;
	private SortDirection sortDirection = null;
	protected QDecimal lastIndex;

	public NIOBufferedListImpl(final QDataContext dataContext, final D model, final SortDirection sortDirection) {
		super(dataContext);

		this._model = model;
		this.sortDirection = sortDirection;
		this.lastIndex = dataContext.getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);
	}

	protected final SortDirection getSortDirection() {
		return this.sortDirection;
	}

	@Override
	public final void assign(final QBufferedData target) {
		NIOBufferHelper.assign(this, target);
	}

	@Override
	public final void slice(final QBufferedData target, final int position) {
		NIOBufferHelper.slice(this, target, position);
	}

	@Override
	public final void eval(final Number value) {
		eval(value, false);
	}

	@Override
	public final void eval(final Number value, final boolean halfAdjust) {

		/*
		 * NIOBufferedElementImpl firstElement =
		 * NIOBufferHelper.getNIOBufferedElementImpl(get(1)); ((QNumeric)
		 * firstElement).eval(value, halfAdjust);
		 * NIOBufferHelper.fill(getBuffer(), getPosition() +
		 * firstElement.getSize(), getSize(),
		 * NIOBufferHelper.read(firstElement));
		 */

		for (final D element : this)
			((QNumeric) element).eval(value, halfAdjust);
	}

	@Override
	public final void eval(final QList<D> value) {

		int capacity = capacity();
		if (value.capacity() < capacity)
			capacity = value.capacity();

		final BufferedElementType bufferedElementType = getModel().getBufferedElementType();
		for (int e = 1; e <= capacity; e++)
			switch (bufferedElementType) {
			case DATETIME:
				get(e).movel(value.get(e), true);
				break;
			case NUMERIC:
				((QNumeric) get(e)).eval((QNumeric) value.get(e));
				break;
			case STRING:
				((QString) get(e)).eval((QString) value.get(e));
				break;
			}

		for (int e = capacity + 1; e <= capacity(); e++)
			get(e).clear();
	}

	@Override
	public final void eval(final QList<? extends QNumeric> value, final boolean halfAdjust) {
		eval(value, halfAdjust, false);
	}

	@Override
	public final void eval(final QList<? extends QNumeric> value, final boolean halfAdjust, final boolean maxPrecision) {

		int capacity = capacity();
		if (value.capacity() < capacity)
			capacity = value.capacity();

		for (int e = 1; e <= capacity; e++)
			((QNumeric) get(e)).eval(value.get(e), halfAdjust, maxPrecision);

		for (int e = capacity + 1; e <= capacity(); e++)
			get(e).clear();
	}

	@Override
	public final void eval(final QNumeric value) {
		eval(value, false);
	}

	@Override
	public final void eval(final QNumeric value, final boolean halfAdjust) {

		/*
		 * NIOBufferedElementImpl firstElement =
		 * NIOBufferHelper.getNIOBufferedElementImpl(get(1)); ((QNumeric)
		 * firstElement).eval(value, halfAdjust);
		 * NIOBufferHelper.fill(getBuffer(), getPosition() +
		 * firstElement.getSize(), getSize(),
		 * NIOBufferHelper.read(firstElement));
		 */

		for (final D element : this)
			((QNumeric) element).eval(value, halfAdjust);
	}

	@Override
	public final void eval(final QString value) {

		/*
		 * NIOBufferedElementImpl firstElement =
		 * NIOBufferHelper.getNIOBufferedElementImpl(get(1)); ((QString)
		 * firstElement).eval(value); NIOBufferHelper.fill(getBuffer(),
		 * getPosition() + firstElement.getSize(), getSize(),
		 * NIOBufferHelper.read(firstElement));
		 */

		for (final D element : this)
			((QString) element).eval(value);
	}

	@Override
	public final void eval(final String value) {

		/*
		 * NIOBufferedElementImpl firstElement =
		 * NIOBufferHelper.getNIOBufferedElementImpl(get(1)); ((QString)
		 * firstElement).eval(value); NIOBufferHelper.fill(getBuffer(),
		 * getPosition() + firstElement.getSize(), getSize(),
		 * NIOBufferHelper.read(firstElement));
		 */

		for (final D element : this)
			((QString) element).eval(value);
	}

	@Override
	public final D get(final QNumeric index) {
		return get(index.asInteger());
	}

	@Override
	public final int getLength() {
		return capacity() * getModel().getLength();
	}

	protected final D getModel() {
		return _model;
	}

	@Override
	public final int getSize() {
		return capacity() * getModel().getSize();
	}

	@Override
	public final boolean isEmpty() {

		for (final D element : this)
			if (!element.isEmpty())
				return false;

		return true;
	}

	@Override
	public final Iterator<D> iterator() {
		return new NIOListIteratorImpl<D>(this);
	}

	protected final void setListOwner(final NIOBufferedListImpl<?> listOwner) {
		this.listOwner = listOwner;
	}

	protected final NIOBufferedListImpl<?> getListOwner() {
		return this.listOwner;
	}

	protected final void setModel(final D _model) {
		this._model = _model;
	}

	@Override
	public final String toString() {

		final StringBuffer sb = new StringBuffer();
		final QDecimal i = getDataContext().getDataFactory().createDecimal(4, 0, DecimalType.PACKED, true);
		i.eval(1);
		for (i.i(); i.le(capacity()); i.plus(1)) {
			final D element = get(i);
			if (i.gt(1))
				sb.append("\n");

			sb.append(i + "[");
			sb.append(new String(element.asBytes(), getDataContext().getCharset()));
			sb.append("]");

			if (sb.length() > 5000)
				break;
		}

		return sb.toString();
	}

	@Override
	public final BufferedDataType getBufferedDataType() {
		return BufferedDataType.LIST;
	}

	@Override
	public final QDecimal qLookup(final D argument) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, 1, capacity()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final D argument, final QNumeric start) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.asInteger(), capacity()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final D argument, final Number start) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.intValue(), capacity()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final D argument, final QNumeric start, final QNumeric elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.asInteger(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final D argument, final Number start, final Number elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.intValue(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final D argument, final Number start, final QNumeric elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.intValue(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final D argument, final QNumeric start, final Number elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.asInteger(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public final void qLookup(final D argument, final QIndicator equal) {

		final int i = qLookup(DataComparator.EQUAL, argument, 1, capacity());
		setContextIndicators(i, equal);
	}

	@Override
	public final void qLookup(final D argument, final QNumeric start, final QIndicator equal) {

		final int i = qLookup(DataComparator.EQUAL, argument, start.asInteger(), capacity());
		setContextIndicators(i, equal);
		if (i > 0)
			start.eval(i);
		else
			start.eval(1);
	}

	@Override
	public final void qLookup(final D argument, final Number start, final QIndicator equal) {

		final int i = qLookup(DataComparator.EQUAL, argument, start.intValue(), capacity());
		setContextIndicators(i, equal);
	}

	@Override
	public final QDecimal qLookup(final DataSpecial argument) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, 1, capacity()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final DataSpecial argument, final QNumeric start) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.asInteger(), capacity()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final DataSpecial argument, final Number start) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.intValue(), capacity()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final DataSpecial argument, final QNumeric start, final QNumeric elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.asInteger(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final DataSpecial argument, final Number start, final Number elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.intValue(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final DataSpecial argument, final Number start, final QNumeric elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.intValue(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final DataSpecial argument, final QNumeric start, final Number elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.asInteger(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public final void qLookup(final DataSpecial argument, final QIndicator equal) {

		final int i = qLookup(DataComparator.EQUAL, argument, 1, capacity());
		setContextIndicators(i, equal);
	}

	@Override
	public final void qLookup(final DataSpecial argument, final QNumeric start, final QIndicator equal) {

		final int i = qLookup(DataComparator.EQUAL, argument, start.asInteger(), capacity());
		setContextIndicators(i, equal);
		if (i > 0)
			start.eval(i);
		else
			start.eval(1);
	}

	@Override
	public final void qLookup(final DataSpecial argument, final Number start, final QIndicator equal) {

		final int i = qLookup(DataComparator.EQUAL, argument, start.intValue(), capacity());
		setContextIndicators(i, equal);
	}

	@Override
	public final QDecimal qLookup(final D argument, final DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, 1, capacity()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final D argument, final QNumeric start, final DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.asInteger(), capacity()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final D argument, final Number start, final DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.intValue(), capacity()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final D argument, final QNumeric start, final QNumeric elements, final DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.asInteger(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final D argument, final Number start, final Number elements, final DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.intValue(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final D argument, final Number start, final QNumeric elements, final DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.intValue(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final D argument, final QNumeric start, final Number elements, final DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.asInteger(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public final void qLookup(final D argument, final QIndicator equal, final DataComparator comparator) {

		final int i = qLookup(comparator, argument, 1, capacity());
		setContextIndicators(i, equal);
	}

	@Override
	public final void qLookup(final D argument, final QNumeric start, final QIndicator equal, final DataComparator comparator) {

		final int i = qLookup(comparator, argument, start.asInteger(), capacity());
		setContextIndicators(i, equal);
		if (i > 0)
			start.eval(i);
		else
			start.eval(1);
	}

	@Override
	public final void qLookup(final D argument, final Number start, final QIndicator equal, final DataComparator comparator) {

		final int i = qLookup(comparator, argument, start.intValue(), capacity());
		setContextIndicators(i, equal);
	}

	@Override
	public final QDecimal qLookup(final DataSpecial argument, final DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, 1, capacity()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final DataSpecial argument, final QNumeric start, final DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.asInteger(), capacity()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final DataSpecial argument, final Number start, final DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.intValue(), capacity()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final DataSpecial argument, final QNumeric start, final QNumeric elements, final DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.asInteger(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final DataSpecial argument, final Number start, final Number elements, final DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.intValue(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final DataSpecial argument, final Number start, final QNumeric elements, final DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.intValue(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public final QDecimal qLookup(final DataSpecial argument, final QNumeric start, final Number elements, final DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.asInteger(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public final void qLookup(final DataSpecial argument, final QIndicator equal, final DataComparator comparator) {

		final int i = qLookup(comparator, argument, 1, capacity());
		setContextIndicators(i, equal);
	}

	@Override
	public final void qLookup(final DataSpecial argument, final QNumeric start, final QIndicator equal, final DataComparator comparator) {

		final int i = qLookup(comparator, argument, start.asInteger(), capacity());
		setContextIndicators(i, equal);
		if (i > 0)
			start.eval(i);
		else
			start.eval(1);
	}

	@Override
	public final void qLookup(final DataSpecial argument, final Number start, final QIndicator equal, final DataComparator comparator) {

		final int i = qLookup(comparator, argument, start.intValue(), capacity());
		setContextIndicators(i, equal);
	}

	private final int qLookup(final DataComparator comparator, final D argument, final int startIndex, final int numElements) {
		return NIOBufferedListHelper.lookup(this, argument, comparator, startIndex, numElements);
	}

	private final int qLookup(final DataComparator comparator, final DataSpecial argument, final int startIndex, final int numElements) {
		return NIOBufferedListHelper.lookup(this, argument, comparator, startIndex, numElements);
	}

	@Override
	public final QDecimal qXfoot() {

		// TODO calculate precision
		final QDecimal total = getDataContext().getDataFactory().createDecimal(21, 6, DecimalType.PACKED, true);

		@SuppressWarnings("unchecked")
		final QList<QNumeric> numericList = (QList<QNumeric>) this;
		for (final QNumeric element : numericList)
			total.plus(element);

		return total;
	}

	@Override
	public final QIndicator qFound() {
		return getDataContext().found();
	}

	@Override
	public final QIndicator qEqual() {
		return getDataContext().equal();
	}

	protected final void setContextIndicators(final int index, final QIndicator found) {

		if (index > 0) {
			found.eval(true);
			getDataContext().equal().eval(true);
			getDataContext().found().eval(true);
		} else {
			found.eval(false);
			getDataContext().equal().eval(false);
			getDataContext().found().eval(false);
		}
	}

	@Override
	public final QNumeric qLen() {

		final QDecimal number = getDataContext().getDataFactory().createDecimal(8, 0, DecimalType.ZONED, true);
		number.eval(getLength());

		return number;
	}

	@Override
	public final void snap() {
		if (!isEmpty())
			_reset = NIOBufferHelper.read(this);
	}
}