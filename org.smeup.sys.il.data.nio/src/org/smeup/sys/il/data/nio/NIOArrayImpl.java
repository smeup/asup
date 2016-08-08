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
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.smeup.sys.il.data.DataComparator;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.SortDirection;

public final class NIOArrayImpl<D extends QBufferedElement> extends NIOBufferedListImpl<D> implements QArray<D> {

	private static final long serialVersionUID = 1L;

	private final D[] _elements;
	// private int capacity = 0;

	@SuppressWarnings("unchecked")
	public NIOArrayImpl(final QDataContext dataContext, final D model, final int dimension, final SortDirection sortDirection, final boolean allocate) {
		super(dataContext, model, sortDirection);

		this._elements = (D[]) Array.newInstance(model.getClass(), dimension);
		// capacity = dimension;

		if (allocate) {
			_storage = ByteBuffer.allocate(getSize());

			clear();
		}
	}

	@Override
	public final void accept(final QDataVisitor visitor) {

		if (visitor.visit(this)) {

			final Iterator<D> datas = this.iterator();
			while (datas.hasNext())
				datas.next().accept(visitor);
		}

		visitor.endVisit(this);
	}

	@Override
	public final D[] asArray() {

		return Arrays.copyOf(_elements, capacity());

		/*
		 * D[] array = (D[]) Array.newInstance(getModel().getClass(), capacity);
		 * for (int x = 0; x < capacity; x++) array[x] = get(x + 1);
		 *
		 * return array;
		 */
	}

	@Override
	public final int capacity() {
		return _elements.length;
		// return capacity;
	}

	@Override
	public final int count() {
		return _elements.length;
		// return capacity;
	}

	@Override
	public final void divide(final Number value) {
		divide(value, false);
	}

	@Override
	public final void divide(final Number value, final boolean halfAdjust) {
		operationDivide(value, halfAdjust);
	}

	@Override
	public final void divide(final QArray<D> array) {
		divide(array, false);
	}

	@Override
	public final void divide(final QArray<D> array, final boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++) {
			if (i > array.capacity())
				break;
			((QNumeric) this.get(i)).divide((QNumeric) array.get(i), halfAdjust);
		}
	}

	@Override
	public final void divide(final QNumeric value) {
		divide(value, false);
	}

	@Override
	public final void divide(final QNumeric value, final boolean halfAdjust) {
		operationDivide(value.asDouble(), halfAdjust);
	}

	@SuppressWarnings("unchecked")
	@Override
	public final D get(final int index) {

		D element = _elements[index - 1];
		if (element != null)
			return element;

		element = (D) ((NIODataImpl) getModel())._copyDef(getDataContext());

		int position = 0;
		int modelSize = 0;
		if (getListOwner() == null)
			modelSize = getModel().getSize();
		else
			modelSize = getListOwner().getModel().getSize();

		position = modelSize * (index - 1);

		slice(element, position + 1);

		_elements[index - 1] = element;

		return element;
	}

	@Override
	public final boolean isContiguous() {
		return getListOwner() == null;
	}

	@Override
	public final void minus(final Number value) {
		minus(value, false);
	}

	@Override
	public final void minus(final Number value, final boolean halfAdjust) {
		operationMinus(value, halfAdjust);
	}

	@Override
	public final void minus(final QArray<D> array) {
		minus(array, false);
	}

	@Override
	public final void minus(final QArray<D> array, final boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++) {
			if (i > array.capacity())
				break;
			((QNumeric) this.get(i)).minus((QNumeric) array.get(i), halfAdjust);
		}
	}

	@Override
	public final void minus(final QNumeric value) {
		minus(value, false);
	}

	@Override
	public final void minus(final QNumeric value, final boolean halfAdjust) {
		operationMinus(value.asDouble(), halfAdjust);
	}

	@Override
	public final void mult(final Number value) {
		mult(value, false);
	}

	@Override
	public final void mult(final Number value, final boolean halfAdjust) {
		operationMult(value, halfAdjust);
	}

	@Override
	public final void mult(final QArray<D> array) {
		mult(array, false);
	}

	@Override
	public final void mult(final QArray<D> array, final boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++) {
			if (i > array.capacity())
				break;
			((QNumeric) this.get(i)).mult((QNumeric) array.get(i), halfAdjust);
		}
	}

	@Override
	public final void mult(final QNumeric value) {
		mult(value, false);
	}

	@Override
	public final void mult(final QNumeric value, final boolean halfAdjust) {
		operationMult(value.asDouble(), halfAdjust);
	}

	private final void operationDivide(final Number value, final boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++)
			((QNumeric) this.get(i)).divide(value.doubleValue(), halfAdjust);
	}

	private final void operationMinus(final Number value, final boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++)
			((QNumeric) this.get(i)).minus(value.doubleValue(), halfAdjust);
	}

	private final void operationMult(final Number value, final boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++)
			((QNumeric) this.get(i)).mult(value.doubleValue(), halfAdjust);
	}

	private final void operationPlus(final Number value, final boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++)
			((QNumeric) this.get(i)).plus(value.doubleValue(), halfAdjust);
	}

	@Override
	public final void plus(final Number value) {
		plus(value, false);
	}

	@Override
	public final void plus(final Number value, final boolean halfAdjust) {
		operationPlus(value, halfAdjust);
	}

	@Override
	public final void plus(final QArray<D> array) {
		plus(array, false);
	}

	@Override
	public final void plus(final QArray<D> array, final boolean halfAdjust) {
		for (int i = 1; i <= this.capacity(); i++) {
			if (i > array.capacity())
				break;
			((QNumeric) this.get(i)).plus((QNumeric) array.get(i), halfAdjust);
		}
	}

	@Override
	public final void plus(final QNumeric value) {
		plus(value, false);
	}

	@Override
	public final void plus(final QNumeric value, final boolean halfAdjust) {
		operationPlus(value.asDouble(), halfAdjust);
	}

	@Override
	public final QArray<D> qSubarr(final int start, final int elements) {

		final NIOArrayImpl<D> subArray = new NIOArrayImpl<D>(getDataContext(), getModel(), elements, getSortDirection(), false);
		subArray.setListOwner(getListOwner());

		slice(subArray, getModel().getSize() * (start - 1) + 1);

		return subArray;
	}

	@Override
	public final QArray<D> qSubarr(final int start, final QNumeric elements) {
		return qSubarr(start, elements.asInteger());
	}

	@Override
	public final QArray<D> qSubarr(final QDecimal start, final int elements) {
		return qSubarr(start.asInteger(), elements);
	}

	@Override
	public final QArray<D> qSubarr(final QNumeric start, final QNumeric elements) {
		return qSubarr(start.asInteger(), elements.asInteger());
	}

	@Override
	public final QArray<QCharacter> qSubst(final Number start) {
		return qSubst(start, getModel().getLength());
	}

	@SuppressWarnings("unchecked")
	@Override
	public final QArray<QCharacter> qSubst(final Number start, final Number length) {
//		final D modelCharacter = (D) NIOBufferHelper.getNIOBufferedElementImpl(getModel())._copyDef(getDataContext());
		D modelCharacter = null;
		if (getModel() instanceof NIOCharacterFixedImpl) {
			modelCharacter = (D) new NIOCharacterFixedImpl(getDataContext(), length.intValue(), false);
		} else {
			modelCharacter = (D) new NIOCharacterVaryingImpl(getDataContext(), length.intValue(), false);
		}

		final NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), modelCharacter, capacity(), getSortDirection(), false);
		newArray.setListOwner(this);
		slice(newArray, start.intValue());

		return (QArray<QCharacter>) newArray;
	}

	@Override
	public final QArray<QCharacter> qSubst(final Number start, final QNumeric length) {
		return qSubst(start, length.asInteger());
	}

	@Override
	public final QArray<QCharacter> qSubst(final QNumeric start) {
		return qSubst(start, getModel().getLength());
	}

	@Override
	public final QArray<QCharacter> qSubst(final QNumeric start, final Number length) {
		return qSubst(start.asInteger(), length);
	}

	@Override
	public final QArray<QCharacter> qSubst(final QNumeric start, final QNumeric length) {
		return qSubst(start, length.asInteger());
	}

	@Override
	public final void movea(final QBufferedElement value) {
		movea(value, false);
	}

	@Override
	public final void movea(final QDataFiller value) {
		movea(1, value);
	}

	@Override
	public final void movea(final QDataFiller value, final boolean clear) {
		movea(1, value);
	}

	@Override
	public final void movea(final String value) {
		movea(value, false);
	}

	@Override
	public final void movea(final QNumeric targetIndex, final QBufferedElement value) {
		movea(targetIndex.i(), value);
	}

	@Override
	public final void movea(final int targetIndex, final QArray<?> value) {
		movea(targetIndex, value, false);
	}

	@Override
	public final void movea(final int targetIndex, final QBufferedElement value) {
		movea(targetIndex, value, false);
	}

	@Override
	public final void movea(final QNumeric targetIndex, final QArray<?> value, final boolean clear) {
		movea(targetIndex.asInteger(), value, clear);
	}

	@Override
	public final void movea(final int targetIndex, final QBufferedElement value, final boolean clear) {

		final byte[] bytes = value.asBytes();
		if (clear)
			switch (getModel().getBufferedElementType()) {
			case DATETIME:
				movea(targetIndex, bytes, NIODatetimeImpl.INIT);
				break;
			case NUMERIC:
				movea(targetIndex, bytes, NIONumericImpl.INIT);
				break;
			case STRING:
				movea(targetIndex, bytes, NIOStringImpl.INIT);
				break;
			}
		else
			movea(targetIndex, bytes, null);
	}

	@Override
	public final void movea(final int targetIndex, final String value) {
		movea(targetIndex, value, false);
	}

	@Override
	public final void movea(final int targetIndex, final String value, final boolean clear) {

		final byte[] bytes = value.getBytes(getDataContext().getCharset());
		if (clear)
			switch (getModel().getBufferedElementType()) {
			case DATETIME:
				movea(targetIndex, bytes, NIODatetimeImpl.INIT);
				break;
			case NUMERIC:
				movea(targetIndex, bytes, NIONumericImpl.INIT);
				break;
			case STRING:
				movea(targetIndex, bytes, NIOStringImpl.INIT);
				break;
			}
		else
			movea(targetIndex, bytes, null);
	}

	@Override
	public final void movea(final QNumeric targetIndex, final QArray<?> value, final int sourceIndex) {
		movea(targetIndex.i(), value, sourceIndex);
	}

	@Override
	public final void movea(final QNumeric targetIndex, final QArray<?> value, final QNumeric sourceIndex) {
		movea(targetIndex.i(), value, sourceIndex.i());
	}

	@Override
	public final void movea(final QNumeric targetIndex, final QArray<?> value, final int sourceIndex, final boolean clear) {
		movea(targetIndex.i(), value, sourceIndex, clear);
	}

	@Override
	public final void movea(final QNumeric targetIndex, final QArray<?> value, final QNumeric sourceIndex, final boolean clear) {
		movea(targetIndex.i(), value, sourceIndex.i(), clear);
	}

	@Override
	public final void movea(final int targetIndex, final QArray<?> value, final QNumeric sourceIndex) {
		movea(targetIndex, value, sourceIndex.i());
	}

	@Override
	public final void movea(final int targetIndex, final QArray<?> value, final int sourceIndex) {
		movea(targetIndex, value, sourceIndex, false);
	}

	@Override
	public final void movea(final int targetIndex, final QArray<?> value, final boolean clear) {
		movea(targetIndex, value, 1, clear);
	}

	@Override
	public final void movea(final String value, final boolean clear) {
		movea(1, value, clear);
	}

	@Override
	public final void movea(final QBufferedElement value, final boolean clear) {
		movea(1, value, clear);
	}

	private final void movea(final int targetIndex, final byte[] value, final Byte filler) {
		final int position = ((this.getLength() / this.capacity()) * (targetIndex - 1));
		if (filler != null)
			NIOBufferHelper.movel(getBuffer(), position, getSize(), value, filler);
		else
			NIOBufferHelper.movel(getBuffer(), position, getSize(), value);
	}

	@Override
	public final void movea(final QArray<?> value, final int sourceIndex) {
		movea(1, value, sourceIndex, false);
	}

	@Override
	public final void movea(final QArray<?> value, final int sourceIndex, final boolean clear) {
		movea(1, value, sourceIndex, clear);
	}

	@Override
	public final void movea(final int targetIndex, final QArray<?> value, final int sourceIndex, final boolean clear) {

		if (!value.isContiguous())
			throw new UnsupportedOperationException("Invalid operation MOVEA with not contiguous array");

		if (getModel().getClass() != ((NIOArrayImpl<?>) value).getModel().getClass()) {
			int e = 0;
			for (int i = sourceIndex; i <= capacity(); i++) {
				get(targetIndex + e).move(value.get(i), true);
				e++;
			}
		} else {

			int positionTarget = 0;

			if (getPosition() > 0)
				positionTarget = getPosition() + ((this.getLength() / this.capacity()) * (targetIndex - 1));
			else
				positionTarget = ((this.getLength() / this.capacity()) * (targetIndex - 1));
			final int positionSource = ((value.getLength() / value.capacity()) * (sourceIndex - 1));

			final NIOBufferedDataImpl arrayBuffer = NIOBufferHelper.getNIOBufferedDataImpl(value);

			int length = getLength();
			if (length > value.getLength())
				length = value.getLength();

			final byte[] bytes = NIOBufferHelper.read(arrayBuffer.getBuffer(), arrayBuffer.getPosition() + positionSource, length);

			if (clear)
				switch (getModel().getBufferedElementType()) {
				case DATETIME:
					NIOBufferHelper.movel(getBuffer(), positionTarget, getSize(), bytes, NIODatetimeImpl.INIT);
					break;
				case NUMERIC:
					NIOBufferHelper.movel(getBuffer(), positionTarget, getSize(), bytes, NIONumericImpl.INIT);
					break;
				case STRING:
					NIOBufferHelper.movel(getBuffer(), positionTarget, getSize(), bytes, NIONumericImpl.INIT);
					break;
				}
			else
				NIOBufferHelper.movel(getBuffer(), positionTarget, getSize(), bytes);
		}
	}

	@Override
	public final void sorta() {

		byte filler = 0;
		switch (getModel().getBufferedElementType()) {
		case DATETIME:
			filler = NIODatetimeImpl.INIT;
			break;
		case NUMERIC:
			filler = NIONumericImpl.INIT;
			break;
		case STRING:
			filler = NIOStringImpl.INIT;
			break;
		}

		final byte fillerComparator = filler;
		if (getListOwner() != null) {
			final List<byte[]> dataList = new ArrayList<byte[]>();

			for (int e = 1; e <= capacity(); e++)
				dataList.add(getListOwner().get(e).asBytes());

			Collections.sort(dataList, new Comparator<byte[]>() {

				@Override
				public final int compare(final byte[] param1, final byte[] param2) {

					final byte[] b1 = Arrays.copyOfRange(param1, getPosition(), getPosition() + getModel().getLength());
					final byte[] b2 = Arrays.copyOfRange(param2, getPosition(), getPosition() + getModel().getLength());

					switch (getSortDirection()) {
					case ASCEND:
						return NIOComparatorHelper.compareBytes(b1, b2, fillerComparator);
					case DESCEND:
						return NIOComparatorHelper.compareBytes(b1, b2, fillerComparator) * -1;
					}
					return -1;
				}
			});

			int i = 1;
			for (final byte[] bd : dataList) {
				((NIOBufferedElementImpl) getListOwner().get(i))._write(bd);
				i++;
			}

		} else {

			final List<byte[]> dataList = new ArrayList<byte[]>();
			for (final QBufferedElement elementTarget : this)
				dataList.add(elementTarget.asBytes());

			Collections.sort(dataList, new Comparator<byte[]>() {

				@Override
				public final int compare(final byte[] param1, final byte[] param2) {

					switch (getSortDirection()) {
					case ASCEND:
						return NIOComparatorHelper.compareBytes(param1, param2, fillerComparator);
					case DESCEND:
						return NIOComparatorHelper.compareBytes(param1, param2, fillerComparator) * -1;
					}
					return -1;
				}
			});

			int i = 1;
			for (final byte[] bd : dataList) {
				((NIOBufferedElementImpl) this.get(i))._write(bd);
				i++;
			}
		}
	}

	@Override
	public final void clear() {

		if (isContiguous()) {
			final NIOBufferedElementImpl firstElement = NIOBufferHelper.getNIOBufferedElementImpl(get(1));
			firstElement.clear();
			NIOBufferHelper.fill(getBuffer(), getPosition() + firstElement.getSize(), getSize(), NIOBufferHelper.read(firstElement));
		} else
			for (final D elelement : this)
				elelement.clear();
	}

	@Override
	public final void movea(final DataSpecial value) {
		movea(value, false);
	}

	@Override
	public final void movea(final DataSpecial value, final boolean clear) {
		movea(1, value, clear);
	}

	@Override
	public final void movea(final int targetIndex, final DataSpecial value) {
		movea(targetIndex, value, false);
	}

	@Override
	public final void movea(final int targetIndex, final DataSpecial value, final boolean clear) {

		if (!isContiguous())
			throw new UnsupportedOperationException("Invalid operation MOVEA with not contiguous array");

		final NIOBufferedElementImpl firstElement = NIOBufferHelper.getNIOBufferedElementImpl(get(targetIndex));
		firstElement.eval(value);
		NIOBufferHelper.fill(getBuffer(), getPosition() + targetIndex * firstElement.getSize(), getSize(), NIOBufferHelper.read(firstElement));
	}

	@Override
	public final void movea(final QNumeric targetIndex, final DataSpecial value) {
		movea(targetIndex.asInteger(), value);
	}

	@Override
	public final void movea(final QNumeric targetIndex, final DataSpecial value, final boolean clear) {
		movea(targetIndex.asInteger(), value, clear);
	}

	@Override
	public final void movea(final int targetIndex, final QDataFiller value) {

		if (!isContiguous())
			throw new UnsupportedOperationException("Invalid operation MOVEA with not contiguous array");

		final NIOBufferedElementImpl firstElement = NIOBufferHelper.getNIOBufferedElementImpl(get(targetIndex));
		firstElement.eval(value);
		NIOBufferHelper.fill(getBuffer(), getPosition() + targetIndex * firstElement.getSize(), getSize(), NIOBufferHelper.read(firstElement));
	}

	@Override
	public final void movea(final QNumeric targetIndex, final QDataFiller value) {
		movea(targetIndex.asInteger(), value);
	}

	@Override
	public final void movea(final QNumeric targetIndex, final QBufferedElement value, final boolean clear) {
		movea(targetIndex.asInteger(), value, clear);
	}

	@Override
	public final void movea(final QNumeric targetIndex, final String value) {
		movea(targetIndex.asInteger(), value);
	}

	@Override
	public final void movea(final QNumeric targetIndex, final String value, final boolean clear) {
		movea(targetIndex.asInteger(), value, clear);
	}

	@Override
	public final void movea(final QArray<?> value) {
		movea(value, false);
	}

	@Override
	public final void movea(final QArray<?> value, final boolean clear) {
		movea(value, 1, clear);
	}

	@Override
	public final void movea(final QArray<?> value, final QNumeric sourceIndex) {
		movea(value, sourceIndex.asInteger());
	}

	@Override
	public final void movea(final QArray<?> value, final QNumeric sourceIndex, final boolean clear) {
		movea(value, sourceIndex.asInteger(), clear);
	}

	@Override
	public final void move(final QArray<?> value) {
		move(value, false);
	}

	@Override
	public final void move(final QArray<?> value, final boolean clear) {

		int capacity = capacity();
		if (value.capacity() < capacity)
			capacity = value.capacity();

		for (int e = 1; e <= capacity; e++)
			get(e).move(value.get(e), clear);

		for (int e = capacity + 1; e <= capacity(); e++)
			get(e).clear();
	}

	@Override
	public final void movel(final QArray<?> value) {
		movel(value, false);
	}

	@Override
	public final void movel(final QArray<?> value, final boolean clear) {

		int capacity = capacity();
		if (value.capacity() < capacity)
			capacity = value.capacity();

		for (int e = 1; e <= capacity; e++)
			get(e).movel(value.get(e), clear);

		for (int e = capacity + 1; e <= capacity(); e++)
			get(e).clear();
	}

	@Override
	public final void movea(final int targetIndex, final QArray<?> value, final QNumeric sourceIndex, final boolean clear) {
		movea(targetIndex, value, sourceIndex.asInteger(), clear);
	}

	@Override
	public final void movea(final QNumeric targetIndex, final QArray<?> value) {
		movea(targetIndex, value, false);
	}

	@Override
	public final QArray<D> qDiv(final QNumeric value) {
		return qDivOperation(value.asNumber(), false);
	}

	@Override
	public final QArray<D> qDiv(final QNumeric value, final boolean halfAdjust) {
		return qDivOperation(value.asNumber(), halfAdjust);
	}

	@Override
	public final QArray<D> qDiv(final Number value) {
		return qDivOperation(value, false);
	}

	@Override
	public final QArray<D> qDiv(final Number value, final boolean halfAdjust) {
		return qDivOperation(value, halfAdjust);
	}

	private final QArray<D> qDivOperation(final Number value, final boolean halfAdjust) {

		final NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);
		for (final D element : newArray)
			((QNumeric) element).divide(value.doubleValue(), halfAdjust);

		return newArray;
	}

	@Override
	public final QArray<D> qMult(final QNumeric value) {
		return qMultOperation(value.asNumber(), false);
	}

	@Override
	public final QArray<D> qMult(final QNumeric value, final boolean halfAdjust) {
		return qMultOperation(value.asNumber(), halfAdjust);
	}

	@Override
	public final QArray<D> qMult(final Number value) {
		return qMultOperation(value, false);
	}

	@Override
	public final QArray<D> qMult(final Number value, final boolean halfAdjust) {
		return qMultOperation(value, halfAdjust);
	}

	private final QArray<D> qMultOperation(final Number value, final boolean halfAdjust) {

		final NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);
		for (final D element : newArray)
			((QNumeric) element).mult(value.doubleValue(), halfAdjust);

		return newArray;
	}

	@Override
	public final QArray<D> qMinus(final QArray<D> value) {

		final NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);

		if (getModel() instanceof QNumeric) {
			int i = 0;
			for (final D element : newArray) {
				i++;
				((QNumeric) element).minus((QNumeric) value.get(i), false);
			}
		}
		// TODO

		return newArray;
	}

	@Override
	public final QArray<D> qMult(final QArray<D> value) {

		final NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);

		if (getModel() instanceof QNumeric) {
			int i = 0;
			for (final D element : newArray) {
				i++;
				((QNumeric) element).mult((QNumeric) value.get(i), false);
			}
		}
		// TODO

		return newArray;
	}

	@Override
	public final QArray<D> qPlus(final QArray<D> value) {
		final NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);

		if (getModel() instanceof QNumeric) {
			int i = 0;
			for (final D element : newArray) {
				i++;
				((QNumeric) element).plus((QNumeric) value.get(i), false);
			}
		}
		// TODO

		return newArray;
	}

	@Override
	public final QArray<D> qPlus(final QString value) {

		final NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);

		for (final D element : newArray)
			((QString) element).cat(value);

		return newArray;
	}

	@Override
	public final QArray<D> qPlus(final String value) {

		final NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);

		for (final D element : newArray)
			((QString) element).cat(value);

		return newArray;
	}

	@Override
	public final QArray<D> qPlus(final Number value) {
		return qPlusOperation(value, false);
	}

	@Override
	public final QArray<D> qPlus(final QNumeric value) {
		return qPlusOperation(value.asNumber(), false);
	}

	private final QArray<D> qPlusOperation(final Number value, final boolean halfAdjust) {

		final NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);
		for (final D element : newArray)
			((QNumeric) element).plus(value.doubleValue(), halfAdjust);

		return newArray;
	}

	@Override
	public final QArray<QCharacter> qTrim() {

		final NIOArrayImpl<QCharacter> newArray = new NIOArrayImpl<QCharacter>(getDataContext(), (QCharacter) getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);
		for (final QCharacter element : newArray)
			element.eval(element.trim());

		return newArray;
	}

	@Override
	public final QArray<QCharacter> qTriml() {

		final NIOArrayImpl<QCharacter> newArray = new NIOArrayImpl<QCharacter>(getDataContext(), (QCharacter) getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);
		for (final QCharacter element : newArray)
			element.eval(element.trimL());

		return newArray;
	}

	@Override
	public final QArray<QCharacter> qTrimr() {

		final NIOArrayImpl<QCharacter> newArray = new NIOArrayImpl<QCharacter>(getDataContext(), (QCharacter) getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);
		for (final QCharacter element : newArray)
			element.eval(element.trimR());

		return newArray;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected NIODataImpl _copyDef(final QDataContext dataContext) {
		final NIOArrayImpl<D> copy = new NIOArrayImpl<D>(dataContext, (D) NIOBufferHelper.getNIOBufferedElementImpl(getModel())._copyDef(dataContext), capacity(), getSortDirection(), false);
		return copy;
	}

	@Override
	public final QBinary qLookup(final String argument) {
		return qLookup(argument, 1);
	}

	@Override
	public final QBinary qLookup(final String argument, final QNumeric start) {
		return qLookup(argument, start.asNumber());
	}

	@Override
	public final QBinary qLookup(final String argument, final Number start, final Number elements) { 
		return writeLastIndex(NIOBufferedListHelper.lookup(this, new NIOCharacterFixedImpl(getDataContext(), argument), DataComparator.EQUAL, start.intValue(), elements.intValue()));
	}

	@Override
	public final QBinary qLookup(final String argument, final Number start, final DataComparator comparator) {
		return writeLastIndex(NIOBufferedListHelper.lookup(this, new NIOCharacterFixedImpl(getDataContext(), argument), comparator, start.intValue(), capacity()));
	}

	@Override
	public final QBinary qLookup(final String argument, final Number start) {
		return writeLastIndex(NIOBufferedListHelper.lookup(this, new NIOCharacterFixedImpl(getDataContext(), argument), DataComparator.EQUAL, start.intValue(), capacity()));
	}

	@Override
	public final QBinary qLookup(final String argument, final QIndicator found) {

		final int index = NIOBufferedListHelper.lookup(this, new NIOCharacterFixedImpl(getDataContext(), argument), DataComparator.EQUAL, 1, capacity());
		setContextIndicators(index, found);
		
		return writeLastIndex(index);
	}

	@Override
	public final QBinary qLookup(final String argument, final QNumeric start, final QIndicator found) {

		final int index = NIOBufferedListHelper.lookup(this, new NIOCharacterFixedImpl(getDataContext(), argument), DataComparator.EQUAL, start.asInteger(), capacity());
		setContextIndicators(index, found);
		if (index > 0)
			start.eval(index);
		else
			start.eval(1);
		
		return writeLastIndex(index);
	}

	@Override
	public final QBinary qLookup(final String argument, final Number start, final QNumeric elements) {
		return writeLastIndex(NIOBufferedListHelper.lookup(this, new NIOCharacterFixedImpl(getDataContext(), argument), DataComparator.EQUAL, start.intValue(), elements.asInteger()));
	}

	@Override
	public final QBinary qLookup(final String argument, final QNumeric start, final QNumeric elements) {
		return writeLastIndex(NIOBufferedListHelper.lookup(this, new NIOCharacterFixedImpl(getDataContext(), argument), DataComparator.EQUAL, start.asInteger(), elements.asInteger()));
	}

	@Override
	public final QBinary qLookup(final int argument) {
		return qLookup(argument, 1);
	}

	@Override
	public final QBinary qLookup(final int argument, final QNumeric start) {
		return qLookup(argument, start.asNumber());
	}

	@Override
	public final QBinary qLookup(final int argument, final Number start) {
		return writeLastIndex(NIOBufferedListHelper.lookup(this, new NIODecimalPackedImpl(getDataContext(), argument), DataComparator.EQUAL, start.intValue(), capacity()));
	}

	@Override
	public final QBinary qLookup(final Number argument, final QIndicator found) {

		final int index = NIOBufferedListHelper.lookup(this, new NIODecimalPackedImpl(getDataContext(), argument.intValue()), DataComparator.EQUAL, 1, capacity());
		setContextIndicators(index, found);
		
		return writeLastIndex(index);		
	}

	@Override
	public final void move(final DataSpecial value) {
		move(value, false);
	}

	@Override
	public final void move(final DataSpecial value, final boolean clear) {

		for (final D element : this)
			element.move(value, clear);
	}

	@Override
	public final void move(final Number value) {
		move(value, false);
	}

	@Override
	public final void move(final Number value, final boolean clear) {

		for (final D element : this)
			element.move(value, clear);
	}

	@Override
	public final void move(final QBufferedElement value) {
		move(value, false);
	}

	@Override
	public final void move(final QBufferedElement value, final boolean clear) {

		for (final D element : this)
			element.move(value, clear);
	}

	@Override
	public final void move(final QDataFiller value) {
		move(value, false);
	}

	@Override
	public final void move(final QDataFiller value, final boolean clear) {

		for (final D element : this)
			element.move(value, clear);
	}

	@Override
	public final void move(final String value) {
		move(value, false);
	}

	@Override
	public final void move(final String value, final boolean clear) {

		for (final D element : this)
			element.move(value, clear);
	}

	@Override
	public final void movel(final DataSpecial value) {
		movel(value, false);
	}

	@Override
	public final void movel(final DataSpecial value, final boolean clear) {

		for (final D element : this)
			element.movel(value, clear);
	}

	@Override
	public final void movel(final Number value) {
		movel(value, false);
	}

	@Override
	public final void movel(final Number value, final boolean clear) {

		for (final D element : this)
			element.movel(value, clear);
	}

	@Override
	public final void movel(final QBufferedElement value) {
		movel(value, false);
	}

	@Override
	public final void movel(final QBufferedElement value, final boolean clear) {

		for (final D element : this)
			element.movel(value, clear);
	}

	@Override
	public final void movel(final QDataFiller value) {
		movel(value, false);
	}

	@Override
	public final void movel(final QDataFiller value, final boolean clear) {

		for (final D element : this)
			element.movel(value, clear);
	}

	@Override
	public final void movel(final String value) {
		movel(value, false);
	}

	@Override
	public final void movel(final String value, final boolean clear) {

		for (final D element : this)
			element.movel(value, clear);
	}

	@Override
	public final QBufferedData eval(final DataSpecial value) {

		for (final D element : this)
			element.eval(value);

		return this;
	}

	@Override
	public final QBufferedData eval(final QDataFiller value) {

		for (final D element : this)
			element.eval(value);

		return this;
	}
	
	@Override
	public final void reset() {

		if (_reset != null)
			NIOBufferHelper.movel(getBuffer(), getPosition(), getSize(), _reset);
		else
			clear();
	}
}