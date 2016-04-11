/**
* *  Copyright (c) 2012, 2016 Sme.UP and others.
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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.SortDirection;

public class NIOArrayImpl<D extends NIOBufferedElementImpl> extends NIOBufferedListImpl<D> implements QArray<D> {

	private static final long serialVersionUID = 1L;

	private D[] _elements;
	private SortDirection sortDirection = null;

	@SuppressWarnings("unchecked")
	public NIOArrayImpl(QDataContext dataContext, D model, int dimension, SortDirection sortDirection) {
		super(dataContext, model);

		this.sortDirection = sortDirection;
		this._elements = (D[]) Array.newInstance(model.getClass(), dimension);
	}

	protected final SortDirection getSortDirection() {
		return this.sortDirection;
	}

	@Override
	public void accept(QDataVisitor visitor) {

		if (visitor.visit(this)) {

			Iterator<D> datas = this.iterator();
			while (datas.hasNext())
				datas.next().accept(visitor);
		}

		visitor.endVisit(this);
	}

	@Override
	public D[] asArray() {
		return Arrays.copyOf(_elements, capacity());
	}

	@Override
	public int capacity() {
		return _elements.length;
	}

	@Override
	public int count() {
		return _elements.length;
	}

	@Override
	public void divide(Number value) {
		divide(value, false);
	}

	@Override
	public void divide(Number value, boolean halfAdjust) {
		operationDivide(value, halfAdjust);
	}

	@Override
	public void divide(QArray<D> array) {
		divide(array, false);
	}

	@Override
	public void divide(QArray<D> array, boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++) {
			if (i > array.capacity())
				break;
			((QNumeric) this.get(i)).divide((QNumeric) array.get(i), halfAdjust);
		}
	}

	@Override
	public void divide(QNumeric value) {
		divide(value, false);
	}

	@Override
	public void divide(QNumeric value, boolean halfAdjust) {
		operationDivide(value.asDouble(), halfAdjust);
	}

	@SuppressWarnings("unchecked")
	@Override
	public D get(int index) {

		D element = _elements[index - 1];
		if (element != null)
			return element;

		element = (D) getModel().copy();

		int position = 0;
		if (getListOwner() == null)
			position = getModel().getSize() * (index - 1);
		else
			position = getListOwner().getModel().getSize() * (index - 1);

		assign(element, position + 1);

		_elements[index - 1] = element;

		return element;
	}

	@Override
	public boolean isContiguous() {
		return getListOwner() == null;
	}

	@Override
	public void minus(Number value) {
		minus(value, false);
	}

	@Override
	public void minus(Number value, boolean halfAdjust) {
		operationMinus(value, halfAdjust);
	}

	@Override
	public void minus(QArray<D> array) {
		minus(array, false);
	}

	@Override
	public void minus(QArray<D> array, boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++) {
			if (i > array.capacity())
				break;
			((QNumeric) this.get(i)).minus((QNumeric) array.get(i), halfAdjust);
		}
	}

	@Override
	public void minus(QNumeric value) {
		minus(value, false);
	}

	@Override
	public void minus(QNumeric value, boolean halfAdjust) {
		operationMinus(value.asDouble(), halfAdjust);
	}

	@Override
	public void mult(Number value) {
		mult(value, false);
	}

	@Override
	public void mult(Number value, boolean halfAdjust) {
		operationMult(value, halfAdjust);
	}

	@Override
	public void mult(QArray<D> array) {
		mult(array, false);
	}

	@Override
	public void mult(QArray<D> array, boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++) {
			if (i > array.capacity())
				break;
			((QNumeric) this.get(i)).mult((QNumeric) array.get(i), halfAdjust);
		}
	}

	@Override
	public void mult(QNumeric value) {
		mult(value, false);
	}

	@Override
	public void mult(QNumeric value, boolean halfAdjust) {
		operationMult(value.asDouble(), halfAdjust);
	}

	private void operationDivide(Number value, boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++) {
			((QNumeric) this.get(i)).divide(value.doubleValue(), halfAdjust);
		}
	}

	private void operationMinus(Number value, boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++) {
			((QNumeric) this.get(i)).minus(value.doubleValue(), halfAdjust);
		}
	}

	private void operationMult(Number value, boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++) {
			((QNumeric) this.get(i)).mult(value.doubleValue(), halfAdjust);
		}
	}

	private void operationPlus(Number value, boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++) {
			((QNumeric) this.get(i)).plus(value.doubleValue(), halfAdjust);
		}
	}

	@Override
	public void plus(Number value) {
		plus(value, false);
	}

	@Override
	public void plus(Number value, boolean halfAdjust) {
		operationPlus(value, halfAdjust);
	}

	@Override
	public void plus(QArray<D> array) {
		plus(array, false);
	}

	@Override
	public void plus(QArray<D> array, boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++) {
			if (i > array.capacity())
				break;
			((QNumeric) this.get(i)).plus((QNumeric) array.get(i), halfAdjust);
		}
	}

	@Override
	public void plus(QNumeric value) {
		plus(value, false);
	}

	@Override
	public void plus(QNumeric value, boolean halfAdjust) {
		operationPlus(value.asDouble(), halfAdjust);
	}

	@Override
	public QArray<D> qSubarr(int start, int elements) {
		
		NIOArrayImpl<D> subArray = new NIOArrayImpl<D>(getDataContext(), getModel(), elements, getSortDirection());
		if(!isContiguous())
			subArray.setListOwner(getListOwner());

		assign(subArray, getModel().getSize() * (start - 1) + 1);
		
		return subArray;
	}

	@Override
	public QArray<D> qSubarr(int start, QNumeric elements) {
		return qSubarr(start, elements.asInteger());
	}

	@Override
	public QArray<D> qSubarr(QDecimal start, int elements) {
		return qSubarr(start.asInteger(), elements);
	}

	@Override
	public QArray<D> qSubarr(QNumeric start, QNumeric elements) {
		return qSubarr(start.asInteger(), elements.asInteger());
	}

	@Override
	public QArray<QCharacter> qSubst(Number start) {
		return qSubst(start, getModel().getLength());
	}

	@SuppressWarnings("unchecked")
	@Override
	public QArray<QCharacter> qSubst(Number start, Number length) {

		D modelCharacter = (D) new NIOCharacterImpl(getDataContext(), length.intValue());
		NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), modelCharacter, capacity(), getSortDirection());
		newArray.setListOwner(this);
		assign(newArray, start.intValue());

		return (QArray<QCharacter>) newArray;
	}

	@Override
	public QArray<QCharacter> qSubst(Number start, QNumeric length) {
		return qSubst(start, length.asInteger());
	}

	@Override
	public QArray<QCharacter> qSubst(QNumeric start) {
		return qSubst(start, getModel().getLength());
	}

	@Override
	public QArray<QCharacter> qSubst(QNumeric start, Number length) {
		return qSubst(start.asInteger(), length);
	}

	@Override
	public QArray<QCharacter> qSubst(QNumeric start, QNumeric length) {
		return qSubst(start, length.asInteger());
	}

	@Override
	public void movea(QBufferedElement value) {
		movea(value, false);
	}

	@Override
	public void movea(QDataFiller value) {
		movea(1, value);
	}

	@Override
	public void movea(String value) {
		movea(value, false);
	}

	@Override
	public void movea(QNumeric targetIndex, QBufferedElement value) {
		movea(targetIndex.i(), value);
	}

	@Override
	public void movea(int targetIndex, QArray<?> value) {
		movea(targetIndex, value, false);
	}

	@Override
	public void movea(int targetIndex, QBufferedElement value) {
		movea(targetIndex, value, false);
	}

	@Override
	public void movea(QNumeric targetIndex, QArray<?> value, boolean clear) {
		movea(targetIndex.asInteger(), value, clear);
	}

	@Override
	public void movea(int targetIndex, QBufferedElement value, boolean clear) {
		movea(targetIndex, value.asBytes(), clear, getFiller());
	}

	@Override
	public void movea(int targetIndex, String value) {
		movea(targetIndex, value, false);
	}

	@Override
	public void movea(int targetIndex, String value, boolean clear) {
		movea(targetIndex, value.getBytes(getDataContext().getCharset()), clear, NIOCharacterImpl.INIT);
	}

	@Override
	public void movea(QNumeric targetIndex, QArray<?> value, int sourceIndex) {
		movea(targetIndex.i(), value, sourceIndex);
	}

	@Override
	public void movea(QNumeric targetIndex, QArray<?> value, QNumeric sourceIndex) {
		movea(targetIndex.i(), value, sourceIndex.i());
	}

	@Override
	public void movea(int targetIndex, QArray<?> value, QNumeric sourceIndex) {
		movea(targetIndex, value, sourceIndex.i());
	}

	@Override
	public void movea(int targetIndex, QArray<?> value, int sourceIndex) {
		movea(targetIndex, value, sourceIndex, false);
	}

	@Override
	public void movea(int targetIndex, QArray<?> value, boolean clear) {
		movea(targetIndex, value, 1, clear);
	}

	@Override
	public void movea(String value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), value.getBytes(getDataContext().getCharset()), clear, getFiller());
	}

	@Override
	public void movea(QBufferedElement value, boolean clear) {
		if (clear)
			this.clear();

		NIOBufferHelper.movel(getBuffer(), getPosition(), value.getSize(), value.asBytes(), clear, getFiller());
	}

	private void movea(int targetIndex, byte[] value, boolean clear, byte filler) {
		if (clear)
			this.clear();

		int position = ((this.getLength() / this.capacity()) * (targetIndex - 1));
		NIOBufferHelper.movel(getBuffer(), position, getSize(), value, clear, filler);
	}

	@Override
	public void movea(QArray<?> value, int sourceIndex) {
		movea(1, value, sourceIndex, false);
	}

	@Override
	public void movea(QArray<?> value, int sourceIndex, boolean clear) {
		movea(1, value, sourceIndex, clear);
	}

	@Override
	public void movea(int targetIndex, QArray<?> value, int sourceIndex, boolean clear) {

		if (!value.isContiguous())
			throw new UnsupportedOperationException("Invalid operation MOVEA with not contiguous array");

		if (getModel().getClass() != ((NIOArrayImpl<?>) value).getModel().getClass()) {
			int e = 0;
			for (int i = sourceIndex; i <= capacity(); i++) {
				get(targetIndex + e).move(value.get(i), true);
				e++;
			}
		} else {

			int positionSource = ((value.getLength() / value.capacity()) * (sourceIndex - 1));
			int positionTarget = ((this.getLength() / this.capacity()) * (targetIndex - 1));

			NIOBufferedDataImpl arrayBuffer = NIOBufferHelper.getNIOBufferedDataImpl(value);

			int length = getLength();
			if (length > value.getLength())
				length = value.getLength();

			byte[] bytes = NIOBufferHelper.read(arrayBuffer.getBuffer(), arrayBuffer.getPosition() + positionSource, length);
			NIOBufferHelper.movel(getBuffer(), positionTarget, getSize(), bytes, clear, getFiller());
		}
	}

	@Override
	public void sorta() {

		if (getListOwner() != null) {
			List<byte[]> dataList = new ArrayList<byte[]>();

			for (int e = 1; e <= capacity(); e++) {
				dataList.add(getListOwner().get(e).asBytes());
			}

			Collections.sort(dataList, new Comparator<byte[]>() {
				@Override
				public int compare(byte[] param1, byte[] param2) {

					byte[] b1 = Arrays.copyOfRange(param1, getPosition(), getPosition() + getModel().getLength());
					byte[] b2 = Arrays.copyOfRange(param2, getPosition(), getPosition() + getModel().getLength());

					switch (getSortDirection()) {
					case ASCEND:
						return NIOBufferHelper.compareBytes(b1, b2, getFiller());
					case DESCEND:
						return NIOBufferHelper.compareBytes(b1, b2, getFiller()) * -1;
					}

					return NIOBufferHelper.compareBytes(b1, b2, getFiller());
				}
			});

			int i = 1;
			for (byte[] bd : dataList) {
				((NIOBufferedElementImpl) getListOwner().get(i))._write(bd);
				i++;
			}

		} else {

			List<byte[]> dataList = new ArrayList<byte[]>();
			for (QBufferedElement elementTarget : this) {
				dataList.add(elementTarget.asBytes());
			}

			Collections.sort(dataList, new Comparator<byte[]>() {
				@Override
				public int compare(byte[] param1, byte[] param2) {

					switch (getSortDirection()) {
					case ASCEND:
						return NIOBufferHelper.compareBytes(param1, param2, getFiller());
					case DESCEND:
						return NIOBufferHelper.compareBytes(param1, param2, getFiller()) * -1;
					}

					return NIOBufferHelper.compareBytes(param1, param2, getFiller());
				}
			});

			int i = 1;
			for (byte[] bd : dataList) {
				((NIOBufferedElementImpl) this.get(i))._write(bd);
				i++;
			}
		}
	}

	@Override
	public void clear() {
		for (D element : this)
			element.clear();
	}

	@Override
	public void movea(DataSpecial value) {
		movea(value, false);
	}

	@Override
	public void movea(DataSpecial value, boolean clear) {
		movea(1, value, clear);
	}

	@Override
	public void movea(int targetIndex, DataSpecial value) {
		movea(targetIndex, value, false);
	}

	@Override
	public void movea(int targetIndex, DataSpecial value, boolean clear) {
		for (int i = targetIndex; i <= capacity(); i++)
			get(i).movel(value, clear);
	}

	@Override
	public void movea(QNumeric targetIndex, DataSpecial value) {
		movea(targetIndex.asInteger(), value);
	}

	@Override
	public void movea(QNumeric targetIndex, DataSpecial value, boolean clear) {
		movea(targetIndex.asInteger(), value, clear);
	}

	@Override
	public void movea(int targetIndex, QDataFiller value) {
		for (int i = targetIndex; i <= capacity(); i++)
			get(i).eval(value);
	}

	@Override
	public void movea(QNumeric targetIndex, QDataFiller value) {
		movea(targetIndex.asInteger(), value);
	}

	@Override
	public void movea(QNumeric targetIndex, QBufferedElement value, boolean clear) {
		movea(targetIndex.asInteger(), value, clear);
	}

	@Override
	public void movea(QNumeric targetIndex, String value) {
		movea(targetIndex.asInteger(), value);
	}

	@Override
	public void movea(QNumeric targetIndex, String value, boolean clear) {
		movea(targetIndex.asInteger(), value, clear);
	}

	@Override
	public void movea(QArray<?> value) {
		movea(value, false);
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		movea(value, 1, clear);
	}

	@Override
	public void movea(QArray<?> value, QNumeric sourceIndex) {
		movea(value, sourceIndex.asInteger());
	}

	@Override
	public void movea(QArray<?> value, QNumeric sourceIndex, boolean clear) {
		movea(value, sourceIndex.asInteger(), clear);
	}

	@Override
	public void move(QArray<?> value) {
		move(value, false);
	}

	@Override
	public void move(QArray<?> value, boolean clear) {

		int capacity = capacity();
		if (value.capacity() < capacity)
			capacity = value.capacity();

		for (int e = 1; e <= capacity; e++) {
			get(e).move(value.get(e), clear);
		}

		for (int e = capacity + 1; e <= capacity(); e++)
			get(e).clear();
	}

	@Override
	public void movel(QArray<?> value) {
		movel(value, false);
	}

	@Override
	public void movel(QArray<?> value, boolean clear) {

		int capacity = capacity();
		if (value.capacity() < capacity)
			capacity = value.capacity();

		for (int e = 1; e <= capacity; e++) {
			get(e).movel(value.get(e), clear);
		}

		for (int e = capacity + 1; e <= capacity(); e++)
			get(e).clear();
	}

	@Override
	public void movea(int targetIndex, QArray<?> value, QNumeric sourceIndex, boolean clear) {
		movea(targetIndex, value, sourceIndex.asInteger(), clear);
	}

	@Override
	public void movea(QNumeric targetIndex, QArray<?> value) {
		movea(targetIndex, value, false);
	}
}