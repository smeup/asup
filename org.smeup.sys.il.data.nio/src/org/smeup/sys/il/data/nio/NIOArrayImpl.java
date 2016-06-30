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

import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.SortDirection;

public class NIOArrayImpl<D extends QBufferedElement> extends NIOBufferedListImpl<D> implements QArray<D> {

	private static final long serialVersionUID = 1L;

	private D[] _elements;
	// private int capacity = 0;

	@SuppressWarnings("unchecked")
	public NIOArrayImpl(QDataContext dataContext, D model, int dimension, SortDirection sortDirection, boolean allocate) {
		super(dataContext, model, sortDirection);

		this._elements = (D[]) Array.newInstance(model.getClass(), dimension);
		// capacity = dimension;

		if (allocate) {
			checkAllocation();
			_buffer = ByteBuffer.allocate(getSize());

			clear();
		}
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

		/*
		 * D[] array = (D[]) Array.newInstance(getModel().getClass(), capacity);
		 * for (int x = 0; x < capacity; x++) array[x] = get(x + 1);
		 * 
		 * return array;
		 */
	}

	@Override
	public int capacity() {
		return _elements.length;
		// return capacity;
	}

	@Override
	public int count() {
		return _elements.length;
		// return capacity;
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

		NIOArrayImpl<D> subArray = new NIOArrayImpl<D>(getDataContext(), getModel(), elements, getSortDirection(), false);
		if (!isContiguous())
			subArray.setListOwner(getListOwner());

		slice(subArray, getModel().getSize() * (start - 1) + 1);

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

		D modelCharacter = (D) new NIOCharacterImpl(getDataContext(), length.intValue(), false);
		NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), modelCharacter, capacity(), getSortDirection(), false);
		newArray.setListOwner(this);
		slice(newArray, start.intValue());

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
	public void movea(QDataFiller value, boolean clear) {
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

		byte[] bytes = value.asBytes();
		if (clear) {
			switch (getModel().getBufferedElementType()) {
			case DATETIME:
				movea(targetIndex, bytes, NIODatetimeImpl.INIT);
				break;
			case NUMERIC:
				movea(targetIndex, bytes, NIODecimalImpl.INIT);
				break;
			case STRING:
				movea(targetIndex, bytes, NIOStringImpl.INIT);
				break;
			}
		} else
			movea(targetIndex, bytes, null);
	}

	@Override
	public void movea(int targetIndex, String value) {
		movea(targetIndex, value, false);
	}

	@Override
	public void movea(int targetIndex, String value, boolean clear) {

		byte[] bytes = value.getBytes(getDataContext().getCharset());
		if (clear) {
			switch (getModel().getBufferedElementType()) {
			case DATETIME:
				movea(targetIndex, bytes, NIODatetimeImpl.INIT);
				break;
			case NUMERIC:
				movea(targetIndex, bytes, NIODecimalImpl.INIT);
				break;
			case STRING:
				movea(targetIndex, bytes, NIOStringImpl.INIT);
				break;
			}
		} else
			movea(targetIndex, bytes, null);
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
	public void movea(QNumeric targetIndex, QArray<?> value, int sourceIndex, boolean clear) {
		movea(targetIndex.i(), value, sourceIndex, clear);
	}

	@Override
	public void movea(QNumeric targetIndex, QArray<?> value, QNumeric sourceIndex, boolean clear) {
		movea(targetIndex.i(), value, sourceIndex.i(), clear);
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
		movea(1, value, clear);
	}

	@Override
	public void movea(QBufferedElement value, boolean clear) {
		movea(1, value, clear);
	}

	private void movea(int targetIndex, byte[] value, Byte filler) {
		int position = ((this.getLength() / this.capacity()) * (targetIndex - 1));
		if (filler != null)
			NIOBufferHelper.movel(getBuffer(), position, getSize(), value, filler);
		else
			NIOBufferHelper.movel(getBuffer(), position, getSize(), value);
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

			if (clear) {
				switch (getModel().getBufferedElementType()) {
				case DATETIME:
					NIOBufferHelper.movel(getBuffer(), positionTarget, getSize(), bytes, NIODatetimeImpl.INIT);
					break;
				case NUMERIC:
					NIOBufferHelper.movel(getBuffer(), positionTarget, getSize(), bytes, NIODecimalImpl.INIT);
					break;
				case STRING:
					NIOBufferHelper.movel(getBuffer(), positionTarget, getSize(), bytes, NIODecimalImpl.INIT);
					break;
				}
			} else
				NIOBufferHelper.movel(getBuffer(), positionTarget, getSize(), bytes);
		}
	}

	@Override
	public void sorta() {

		byte filler = 0;
		switch (getModel().getBufferedElementType()) {
		case DATETIME:
			filler = NIODatetimeImpl.INIT;
			break;
		case NUMERIC:
			filler = NIODecimalImpl.INIT;
			break;
		case STRING:
			filler = NIOStringImpl.INIT;
			break;
		}

		final byte fillerComparator = filler;
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
						return NIOComparatorHelper.compareBytes(b1, b2, fillerComparator);
					case DESCEND:
						return NIOComparatorHelper.compareBytes(b1, b2, fillerComparator) * -1;
					}
					return -1;
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
						return NIOComparatorHelper.compareBytes(param1, param2, fillerComparator);
					case DESCEND:
						return NIOComparatorHelper.compareBytes(param1, param2, fillerComparator) * -1;
					}
					return -1;
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
		NIOBufferedElementImpl firstElement = NIOBufferHelper.getNIOBufferedElementImpl(get(1));
		firstElement.clear();
		NIOBufferHelper.fill(getBuffer(), getPosition() + firstElement.getSize(), getSize(), NIOBufferHelper.read(firstElement));
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

		NIOBufferedElementImpl firstElement = NIOBufferHelper.getNIOBufferedElementImpl(get(targetIndex));
		firstElement.movel(value, clear);
		NIOBufferHelper.fill(getBuffer(), getPosition() + targetIndex * firstElement.getSize(), getSize(), NIOBufferHelper.read(firstElement));
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

		NIOBufferedElementImpl firstElement = NIOBufferHelper.getNIOBufferedElementImpl(get(targetIndex));
		firstElement.eval(value);
		NIOBufferHelper.fill(getBuffer(), getPosition() + targetIndex * firstElement.getSize(), getSize(), NIOBufferHelper.read(firstElement));
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

	@Override
	public QArray<D> qDiv(QNumeric value) {
		return qDivOperation(value.asNumber(), false);
	}

	@Override
	public QArray<D> qDiv(QNumeric value, boolean halfAdjust) {
		return qDivOperation(value.asNumber(), halfAdjust);
	}

	@Override
	public QArray<D> qDiv(Number value) {
		return qDivOperation(value, false);
	}

	@Override
	public QArray<D> qDiv(Number value, boolean halfAdjust) {
		return qDivOperation(value, halfAdjust);
	}

	private QArray<D> qDivOperation(Number value, boolean halfAdjust) {

		NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);
		for (D element : newArray) {
			((QNumeric) element).divide(value.doubleValue(), halfAdjust);
		}

		return newArray;
	}

	@Override
	public QArray<D> qMult(QNumeric value) {
		return qMultOperation(value.asNumber(), false);
	}

	@Override
	public QArray<D> qMult(QNumeric value, boolean halfAdjust) {
		return qMultOperation(value.asNumber(), halfAdjust);
	}

	@Override
	public QArray<D> qMult(Number value) {
		return qMultOperation(value, false);
	}

	@Override
	public QArray<D> qMult(Number value, boolean halfAdjust) {
		return qMultOperation(value, halfAdjust);
	}

	private QArray<D> qMultOperation(Number value, boolean halfAdjust) {

		NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);
		for (D element : newArray) {
			((QNumeric) element).mult(value.doubleValue(), halfAdjust);
		}

		return newArray;
	}

	@Override
	public QArray<D> qMinus(QArray<D> value) {

		NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);

		if (getModel() instanceof QNumeric) {
			int i = 0;
			for (D element : newArray) {
				i++;
				((QNumeric) element).minus((QNumeric) value.get(i), false);
			}
		}
		// TODO

		return newArray;
	}

	@Override
	public QArray<D> qMult(QArray<D> value) {

		NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);

		if (getModel() instanceof QNumeric) {
			int i = 0;
			for (D element : newArray) {
				i++;
				((QNumeric) element).mult((QNumeric) value.get(i), false);
			}
		}
		// TODO

		return newArray;
	}

	@Override
	public QArray<D> qPlus(QArray<D> value) {
		NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);

		if (getModel() instanceof QNumeric) {
			int i = 0;
			for (D element : newArray) {
				i++;
				((QNumeric) element).plus((QNumeric) value.get(i), false);
			}
		}
		// TODO

		return newArray;
	}

	@Override
	public QArray<D> qPlus(QString value) {

		NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);

		for (D element : newArray) {
			((QString) element).cat(value);
		}

		return newArray;
	}

	@Override
	public QArray<D> qPlus(String value) {

		NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);

		for (D element : newArray) {
			((QString) element).cat(value);
		}

		return newArray;
	}

	@Override
	public QArray<D> qPlus(Number value) {
		return qPlusOperation(value, false);
	}

	@Override
	public QArray<D> qPlus(QNumeric value) {
		return qPlusOperation(value.asNumber(), false);
	}

	private QArray<D> qPlusOperation(Number value, boolean halfAdjust) {

		NIOArrayImpl<D> newArray = new NIOArrayImpl<D>(getDataContext(), getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);
		for (D element : newArray) {
			((QNumeric) element).plus(value.doubleValue(), halfAdjust);
		}

		return newArray;
	}

	@Override
	public QArray<QCharacter> qTrim() {

		NIOArrayImpl<QCharacter> newArray = new NIOArrayImpl<QCharacter>(getDataContext(), (QCharacter) getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);
		for (QCharacter element : newArray) {
			element.eval(element.trim());
		}

		return newArray;
	}

	@Override
	public QArray<QCharacter> qTriml() {

		NIOArrayImpl<QCharacter> newArray = new NIOArrayImpl<QCharacter>(getDataContext(), (QCharacter) getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);
		for (QCharacter element : newArray) {
			element.eval(element.trimL());
		}

		return newArray;
	}

	@Override
	public QArray<QCharacter> qTrimr() {

		NIOArrayImpl<QCharacter> newArray = new NIOArrayImpl<QCharacter>(getDataContext(), (QCharacter) getModel(), capacity(), getSortDirection(), true);
		newArray.movea(this);
		for (QCharacter element : newArray) {
			element.eval(element.trimR());
		}

		return newArray;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected NIODataImpl _copyDef(QDataContext dataContext) {
		NIOArrayImpl<D> copy = new NIOArrayImpl<D>(dataContext, (D) NIOBufferHelper.getNIOBufferedElementImpl(getModel())._copyDef(dataContext), capacity(), getSortDirection(), false);
		return copy;
	}
}