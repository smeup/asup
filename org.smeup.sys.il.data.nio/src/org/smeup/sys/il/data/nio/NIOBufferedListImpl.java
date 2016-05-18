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
import org.smeup.sys.il.data.QDataFiller;
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
	private QDecimal lastIndex;

	public NIOBufferedListImpl(QDataContext dataContext, D model, SortDirection sortDirection) {
		super(dataContext);
		this._model = model;
		this.sortDirection = sortDirection;
		this.lastIndex = dataContext.getDataFactory().createDecimal(5, 0, DecimalType.ZONED, true);
	}

	protected final SortDirection getSortDirection() {
		return this.sortDirection;
	}

	@Override
	public QBufferedData eval(DataSpecial value) {
		for (D element : this)
			element.eval(value);

		return this;
	}

	@Override
	public final void eval(Number value) {
		for (D element : this)
			((QNumeric) element).eval(value);
	}

	@Override
	public void eval(Number value, boolean halfAdjust) {
		for (D element : this)
			((QNumeric) element).eval(value, halfAdjust);
	}

	@Override
	public QBufferedData eval(QDataFiller value) {
		for (D element : this)
			element.eval(value);

		return this;
	}

	@Override
	public final void eval(QList<D> value) {

		int capacity = capacity();
		if (value.capacity() < capacity)
			capacity = value.capacity();

		BufferedElementType bufferedElementType = getModel().getBufferedElementType();
		for (int e = 1; e <= capacity; e++) {
			switch (bufferedElementType) {
			case DATETIME:
				get(e).movel(value.get(e), true);
				break;
			case NUMERIC:
				get(e).move(value.get(e), true);
				break;
			case STRING:
				((QString)get(e)).eval((QString)value.get(e));
				break;
			}
		}

		for (int e = capacity + 1; e <= capacity(); e++)
			get(e).clear();
	}

	@Override
	public void eval(QList<? extends QNumeric> value, boolean halfAdjust) {
		eval(value, halfAdjust, false);
	}
	
	@Override
	public void eval(QList<? extends QNumeric> value, boolean halfAdjust, boolean maxPrecision) {

		assert QNumeric.class.isAssignableFrom(getModel().getClass());

		int capacity = capacity();
		if (value.capacity() < capacity)
			capacity = value.capacity();

		for (int e = 1; e <= capacity; e++) {
			((QNumeric) get(e)).eval(value.get(e), halfAdjust, maxPrecision);
		}

		for (int e = capacity + 1; e <= capacity(); e++)
			get(e).clear();
	}

	@Override
	public final void eval(QNumeric value) {
		for (D element : this)
			((QNumeric) element).eval(value);
	}

	@Override
	public void eval(QNumeric value, boolean halfAdjust) {
		for (D element : this)
			((QNumeric) element).eval(value, halfAdjust);
	}

	@Override
	public final void eval(QString value) {
		for (D element : this)
			((QString) element).eval(value);
	}

	@Override
	public final void eval(String value) {
		for (D element : this)
			((QString) element).eval(value);
	}

	@Override
	public final D get(QNumeric index) {
		return get(index.asInteger());
	}

	@Override
	public final int getLength() {
		return capacity() * getModel().getLength();
	}

	protected final NIOBufferedListImpl<?> getListOwner() {
		return this.listOwner;
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

		for (D element : this) {
			if (!element.isEmpty())
				return false;
		}

		return true;
	}

	@Override
	public final Iterator<D> iterator() {
		return new NIOListIteratorImpl<D>(this);
	}

	@Override
	public void move(DataSpecial value) {
		move(value, false);
	}

	@Override
	public void move(DataSpecial value, boolean clear) {
		for (D element : this)
			element.move(value, clear);
	}

	@Override
	public void move(Number value) {
		move(value, false);
	}

	@Override
	public void move(Number value, boolean clear) {
		for (D element : this)
			element.move(value, clear);
	}

	@Override
	public void move(QBufferedElement value) {
		move(value, false);
	}

	@Override
	public void move(QBufferedElement value, boolean clear) {
		for (D element : this)
			element.move(value, clear);
	}

	@Override
	public void move(QDataFiller value) {
		move(value, false);
	}

	@Override
	public void move(QDataFiller value, boolean clear) {
		for (D element : this)
			element.move(value, clear);
	}

	@Override
	public void move(String value) {
		move(value, false);
	}

	@Override
	public void move(String value, boolean clear) {
		for (D element : this)
			element.move(value, clear);
	}

	@Override
	public void movel(DataSpecial value) {
		movel(value, false);
	}

	@Override
	public void movel(DataSpecial value, boolean clear) {
		for (D element : this)
			element.movel(value, clear);
	}

	@Override
	public void movel(Number value) {
		movel(value, false);
	}

	@Override
	public void movel(Number value, boolean clear) {
		for (D element : this)
			element.movel(value, clear);
	}

	@Override
	public void movel(QBufferedElement value) {
		movel(value, false);
	}

	@Override
	public void movel(QBufferedElement value, boolean clear) {
		for (D element : this)
			element.movel(value, clear);
	}

	@Override
	public void movel(QDataFiller value) {
		movel(value, false);
	}

	@Override
	public void movel(QDataFiller value, boolean clear) {
		for (D element : this)
			element.movel(value, clear);
	}

	@Override
	public void movel(String value) {
		movel(value, false);
	}

	@Override
	public void movel(String value, boolean clear) {
		for (D element : this)
			element.movel(value, clear);
	}

	protected final void setListOwner(NIOBufferedListImpl<?> listOwner) {
		this.listOwner = listOwner;
	}

	protected final void setModel(D _model) {
		this._model = _model;
	}

	@Override
	public final String toString() {

		StringBuffer sb = new StringBuffer();
		QDecimal i = getDataContext().getDataFactory().createDecimal(4, 0, DecimalType.PACKED, true);
		i.eval(1);
		for (i.i(); i.le(capacity()); i.plus(1)) {
			D element = get(i);
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
	public BufferedDataType getBufferedDataType() {
		return BufferedDataType.LIST;
	}

	@Override
	public QDecimal qLookup(D argument) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, 1, capacity()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(D argument, QNumeric start) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.asInteger(), capacity()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(D argument, Number start) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.intValue(), capacity()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(D argument, QNumeric start, QNumeric elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.asInteger(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(D argument, Number start, Number elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.intValue(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(D argument, Number start, QNumeric elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.intValue(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(D argument, QNumeric start, Number elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.asInteger(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public void qLookup(D argument, QIndicator found) {

		int i = qLookup(DataComparator.EQUAL, argument, 1, capacity());
		found.eval(i > 0);

		getDataContext().found().eval(found);
	}

	@Override
	public void qLookup(D argument, QNumeric start, QIndicator found) {

		int i = qLookup(DataComparator.EQUAL, argument, start.asInteger(), capacity());
		if (i > 0) {
			found.eval(true);
			start.eval(i);
		} else {
			found.eval(false);
			start.eval(1);
		}

		getDataContext().found().eval(found);
	}

	@Override
	public void qLookup(D argument, Number start, QIndicator found) {

		int i = qLookup(DataComparator.EQUAL, argument, 1, capacity());
		found.eval(i > 0);

		getDataContext().found().eval(found);
	}

	@Override
	public QDecimal qLookup(DataSpecial argument) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, 1, capacity()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(DataSpecial argument, QNumeric start) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.asInteger(), capacity()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(DataSpecial argument, Number start) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.intValue(), capacity()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(DataSpecial argument, QNumeric start, QNumeric elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.asInteger(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(DataSpecial argument, Number start, Number elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.intValue(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(DataSpecial argument, Number start, QNumeric elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.intValue(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(DataSpecial argument, QNumeric start, Number elements) {
		lastIndex.eval(qLookup(DataComparator.EQUAL, argument, start.asInteger(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public void qLookup(DataSpecial argument, QIndicator found) {

		int i = qLookup(DataComparator.EQUAL, argument, 1, capacity());
		found.eval(i > 0);

		getDataContext().found().eval(found);
	}

	@Override
	public void qLookup(DataSpecial argument, QNumeric start, QIndicator found) {

		int i = qLookup(DataComparator.EQUAL, argument, start.asInteger(), capacity());
		if (i > 0) {
			found.eval(true);
			start.eval(i);
		} else {
			found.eval(false);
			start.eval(1);
		}

		getDataContext().found().eval(found);
	}

	@Override
	public void qLookup(DataSpecial argument, Number start, QIndicator found) {

		int i = qLookup(DataComparator.EQUAL, argument, 1, capacity());
		found.eval(i > 0);

		getDataContext().found().eval(found);
	}

	@Override
	public QDecimal qLookup(D argument, DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, 1, capacity()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(D argument, QNumeric start, DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.asInteger(), capacity()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(D argument, Number start, DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.intValue(), capacity()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(D argument, QNumeric start, QNumeric elements, DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.asInteger(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(D argument, Number start, Number elements, DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.intValue(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(D argument, Number start, QNumeric elements, DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.intValue(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(D argument, QNumeric start, Number elements, DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.asInteger(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public void qLookup(D argument, QIndicator found, DataComparator comparator) {

		int i = qLookup(comparator, argument, 1, capacity());
		found.eval(i > 0);

		getDataContext().found().eval(found);
	}

	@Override
	public void qLookup(D argument, QNumeric start, QIndicator found, DataComparator comparator) {

		int i = qLookup(comparator, argument, start.asInteger(), capacity());
		if (i > 0) {
			found.eval(true);
			start.eval(i);
		} else {
			found.eval(false);
			start.eval(1);
		}

		getDataContext().found().eval(found);
	}

	@Override
	public void qLookup(D argument, Number start, QIndicator found, DataComparator comparator) {

		int i = qLookup(comparator, argument, 1, capacity());
		found.eval(i > 0);

		getDataContext().found().eval(found);
	}

	@Override
	public QDecimal qLookup(DataSpecial argument, DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, 1, capacity()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(DataSpecial argument, QNumeric start, DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.asInteger(), capacity()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(DataSpecial argument, Number start, DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.intValue(), capacity()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(DataSpecial argument, QNumeric start, QNumeric elements, DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.asInteger(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(DataSpecial argument, Number start, Number elements, DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.intValue(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(DataSpecial argument, Number start, QNumeric elements, DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.intValue(), elements.asInteger()));
		return lastIndex;
	}

	@Override
	public QDecimal qLookup(DataSpecial argument, QNumeric start, Number elements, DataComparator comparator) {
		lastIndex.eval(qLookup(comparator, argument, start.asInteger(), elements.intValue()));
		return lastIndex;
	}

	@Override
	public void qLookup(DataSpecial argument, QIndicator found, DataComparator comparator) {

		int i = qLookup(comparator, argument, 1, capacity());
		found.eval(i > 0);

		getDataContext().found().eval(found);
	}

	@Override
	public void qLookup(DataSpecial argument, QNumeric start, QIndicator found, DataComparator comparator) {

		int i = qLookup(comparator, argument, start.asInteger(), capacity());
		if (i > 0) {
			found.eval(true);
			start.eval(i);
		} else {
			found.eval(false);
			start.eval(1);
		}

		getDataContext().found().eval(found);
	}

	@Override
	public void qLookup(DataSpecial argument, Number start, QIndicator found, DataComparator comparator) {

		int i = qLookup(comparator, argument, 1, capacity());
		found.eval(i > 0);

		getDataContext().found().eval(found);
	}

	private int qLookup(DataComparator comparator, D argument, int startIndex, int numElements) {
		return NIOBufferedListHelper.lookup(this, argument, comparator, startIndex, numElements);
	}

	private int qLookup(DataComparator comparator, DataSpecial argument, int startIndex, int numElements) {
		return NIOBufferedListHelper.lookup(this, argument, comparator, startIndex, numElements);
	}

	@Override
	public QDecimal qXfoot() {
		
		// TODO calculate precision
		QDecimal total = getDataContext().getDataFactory().createDecimal(21, 6, DecimalType.PACKED, true);
		
		@SuppressWarnings("unchecked")
		QList<QNumeric> numericList = (QList<QNumeric>)this;
		for (QNumeric element : numericList) {
			total.plus(element);
		}
		
		return total;
	}
}