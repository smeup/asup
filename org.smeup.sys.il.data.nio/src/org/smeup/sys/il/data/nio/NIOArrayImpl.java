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

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedList;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.SortDirection;

public class NIOArrayImpl<D extends NIOBufferedDataImpl> extends NIOBufferedListImpl<D> implements QArray<D> {

	private static final long serialVersionUID = 1L;

	private D[] _elements;
	private QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
	
	@SuppressWarnings("unchecked")
	public NIOArrayImpl(QDataContext dataContext, D model, int dimension, SortDirection sortDirection) {
		super(dataContext, model, sortDirection);

		this._elements = (D[]) Array.newInstance(model.getClass(), dimension);
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
	public void clear() {
		NIOBufferHelper.clear(this);
	}

	@Override
	public int count() {
		return _elements.length;
	}

	@Override
	public void divide(double value) {
		divide(value, null);
	}

	@Override
	public void divide(double value, String roundingMode) {
		operationDivide(value, roundingMode);
	}

	@Override
	public void divide(int value) {
		divide(value, null);
	}

	@Override
	public void divide(int value, String roundingMode) {
		operationDivide(value, roundingMode);
	}

	@Override
	public void divide(long value) {
		divide(value, null);
	}

	@Override
	public void divide(long value, String roundingMode) {
		operationDivide(value, roundingMode);
	}

	@Override
	public void divide(QArray<D> array) {
		divide(array, null);
	}

	@Override
	public void divide(QArray<D> array, String roundingMode) {
		for (int i = 1; i <= this.capacity(); i++) {
			if (i > array.capacity())
				break;
			((QNumeric) this.get(i)).divide((QNumeric) array.get(i));
		}
	}

	@Override
	public void divide(QNumeric value) {
		divide(value, null);
	}

	@Override
	public void divide(QNumeric value, String roundingMode) {
		operationDivide(value.asDouble(), roundingMode);
	}

	@Override
	public void divide(short value) {
		divide(value, null);
	}

	@Override
	public void divide(short value, String roundingMode) {
		operationDivide(value, roundingMode);
	}

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		// TODO Auto-generated method stub
		return false;
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
	protected byte getFiller() {
		return getModel().getFiller();
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isContiguous() {
		return getListOwner() == null;
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void minus(double value) {
		minus(value, null);
	}

	@Override
	public void minus(double value, String roundingMode) {
		operationMinus(value, roundingMode);
	}

	@Override
	public void minus(int value) {
		minus(value, null);
	}

	@Override
	public void minus(int value, String roundingMode) {
		operationMinus(value, roundingMode);
	}

	@Override
	public void minus(long value) {
		minus(value, null);
	}

	@Override
	public void minus(long value, String roundingMode) {
		operationMinus(value, roundingMode);
	}

	@Override
	public void minus(QArray<D> array) {
		minus(array, null);
	}

	@Override
	public void minus(QArray<D> array, String roundingMode) {
		for (int i = 1; i <= this.capacity(); i++) {
			if (i > array.capacity())
				break;
			((QNumeric) this.get(i)).minus((QNumeric) array.get(i));
		}
	}

	@Override
	public void minus(QNumeric value) {
		minus(value, null);
	}

	@Override
	public void minus(QNumeric value, String roundingMode) {
		operationMinus(value.asDouble(), roundingMode);
	}

	@Override
	public void minus(short value) {
		minus(value, null);
	}

	@Override
	public void minus(short value, String roundingMode) {
		operationMinus(value, roundingMode);
	}

	@Override
	public void mult(double value) {
		mult(value, null);
	}

	@Override
	public void mult(double value, String roundingMode) {
		operationMult(value, roundingMode);
	}

	@Override
	public void mult(int value) {
		mult(value, null);
	}

	@Override
	public void mult(int value, String roundingMode) {
		operationMult(value, roundingMode);
	}

	@Override
	public void mult(long value) {
		mult(value, null);
	}

	@Override
	public void mult(long value, String roundingMode) {
		operationMult(value, roundingMode);
	}

	@Override
	public void mult(QArray<D> array) {
		mult(array, null);
	}

	@Override
	public void mult(QArray<D> array, String roundingMode) {
		for (int i = 1; i <= this.capacity(); i++) {
			if (i > array.capacity())
				break;
			((QNumeric) this.get(i)).mult((QNumeric) array.get(i));
		}
	}

	@Override
	public void mult(QNumeric value) {
		mult(value, null);
	}

	@Override
	public void mult(QNumeric value, String roundingMode) {
		operationMult(value.asDouble(), roundingMode);
	}

	@Override
	public void mult(short value) {
		mult(value, null);
	}

	@Override
	public void mult(short value, String roundingMode) {
		operationMult(value, roundingMode);
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	private void operationDivide(Number value, String roundingMode) {
		for (int i = 1; i <= this.capacity(); i++) {
			((QNumeric) this.get(i)).divide(value.doubleValue());
		}
	}

	private void operationMinus(Number value, String roundingMode) {
		for (int i = 1; i <= this.capacity(); i++) {
			((QNumeric) this.get(i)).minus(value.doubleValue());
		}
	}

	private void operationMult(Number value, String roundingMode) {
		for (int i = 1; i <= this.capacity(); i++) {
			((QNumeric) this.get(i)).mult(value.doubleValue());
		}
	}

	private void operationPlus(Number value, String roundingMode) {
		for (int i = 1; i <= this.capacity(); i++) {
			((QNumeric) this.get(i)).plus(value.doubleValue());
		}
	}

	@Override
	public void plus(double value) {
		plus(value, null);
	}

	@Override
	public void plus(double value, String roundingMode) {
		operationPlus(value, roundingMode);
	}

	@Override
	public void plus(int value) {
		plus(value, null);
	}

	@Override
	public void plus(int value, String roundingMode) {
		operationPlus(value, roundingMode);
	}

	@Override
	public void plus(long value) {
		plus(value, null);
	}

	@Override
	public void plus(long value, String roundingMode) {
		operationPlus(value, roundingMode);
	}

	@Override
	public void plus(QArray<D> array) {
		plus(array, null);
	}

	@Override
	public void plus(QArray<D> array, String roundingMode) {
		for (int i = 1; i <= this.capacity(); i++) {
			if (i > array.capacity())
				break;
			((QNumeric) this.get(i)).plus((QNumeric) array.get(i));
		}
	}

	@Override
	public void plus(QNumeric value) {
		plus(value, null);
	}

	@Override
	public void plus(QNumeric value, String roundingMode) {
		operationPlus(value.asDouble(), roundingMode);
	}

	@Override
	public void plus(short value) {
		plus(value, null);
	}

	@Override
	public void plus(short value, String roundingMode) {
		operationPlus(value, roundingMode);
	}

	@Override
	public QArray<D> qSubarr(int start, int elements) {

		NIOArrayImpl<D> subArray = new NIOArrayImpl<D>(getDataContext(), getModel(), elements, getSortDirection());
		assign(subArray, getModel().getSize() * (start - 1) + 1);

		return subArray;
	}

	@Override
	public QArray<D> qSubarr(int start, QDecimal elements) {
		return qSubarr(start, elements.asInteger());
	}

	@Override
	public QArray<D> qSubarr(QDecimal start, int elements) {
		return qSubarr(start.asInteger(), elements);
	}

	@Override
	public QArray<D> qSubarr(QDecimal start, QDecimal elements) {
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

		return (QArray<QCharacter>)newArray;
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
	public void eval(QBufferedList<D> value) {

		int capacity = capacity();
		if (value.capacity() < capacity)
			capacity = value.capacity();

		for (int e = 1; e <= capacity; e++) {
			dataWriter.set(value.get(e));
			get(e).accept(dataWriter);
		}

		for (int e = capacity + 1; e <= capacity(); e++)
			get(e).clear();
	}	

	// TODO ???
	@Override
	public void movel(QBufferedData value, boolean clear) {

		if (value instanceof QArray<?>)
			movea((QArray<?>) value, clear);
		else
			for (QBufferedData element : this)
				element.movel(value, clear);
	}

	@Override
	public void movea(QBufferedData value) {
		movea(value, false);
	}

	@Override
	public void movea(QDataFiller value) {
		movea(1, value);
	}

	@Override
	public void movea(int targetIndex, QDataFiller value) {
		for (int i = targetIndex; i <= capacity(); i++)
			get(i).accept(value);
	}

	@Override
	public void movea(String value) {
		movea(value, false);
	}

	@Override
	public <E extends Enum<E>> void movea(E value) {
		movea(1, value, false);
	}

	@Override
	public <E extends Enum<E>> void movea(E value, boolean clear) {
		movea(1, value, clear);
	}

	@Override
	public <E extends Enum<E>> void movea(QNumeric targetIndex, E value) {
		movea(targetIndex.asInteger(), value, false);
	}

	@Override
	public <E extends Enum<E>> void movea(int targetIndex, E value, boolean clear) {
		for (int i = targetIndex; i <= capacity(); i++)
			get(i).eval(value);
	}

	@Override
	public <E extends Enum<E>> void movea(int targetIndex, E value) {
		movea(targetIndex, value, false);
	}

	@Override
	public <E extends Enum<E>> void movea(QNumeric targetIndex, E value, boolean clear) {
		movea(targetIndex.asInteger(), value, clear);
	}

	@Override
	public void movea(QNumeric targetIndex, QBufferedData value) {
		movea(targetIndex.i(), value);
	}

	@Override
	public void movea(int targetIndex, QArray<?> value) {
		movea(targetIndex, value, false);
	}

	@Override
	public void movea(int targetIndex, QBufferedData value) {
		movea(targetIndex, value, false);
	}

	@Override
	public void movea(QNumeric targetIndex, QArray<?> value, boolean clear) {
		movea(targetIndex.asInteger(), value, clear);
	}

	@Override
	public void movea(int targetIndex, QBufferedData value, boolean clear) {
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
	public void movea(QArray<?> value, QNumeric sourceIndex) {
		movea(value, sourceIndex.i());
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		movea(1, value, 1, clear);
	}

	@Override
	public void movea(QArray<?> value, QNumeric sourceIndex, boolean clear) {
		movea(value, sourceIndex.i(), clear);
	}

	@Override
	public void movea(QArray<?> value, int sourceIndex) {
		movea(value, sourceIndex, false);
	}

	@Override
	public void movea(QArray<?> value, int sourceIndex, boolean clear) {
		movea(1, value, sourceIndex, clear);
	}

	@Override
	public void movea(String value, boolean clear) {
		NIOBufferHelper.movel(getBuffer(), getPosition(), value.length(), value.getBytes(getDataContext().getCharset()), clear, getFiller());		
	}

	@Override
	public void movea(QBufferedData value, boolean clear) {
		if (clear)
			this.clear();
		
		NIOBufferHelper.movel(getBuffer(), getPosition(), value.getSize(), value.asBytes(), clear, getFiller());
	}
	
	private void movea(int targetIndex, byte[] value, boolean clear, byte filler) {
		if (clear)
			this.clear();

		int position = ((this.getLength() / this.capacity()) * (targetIndex - 1));
		NIOBufferHelper.movel(getBuffer(), position, value.length, value, clear, filler);
	}

	@Override
	public void movea(int targetIndex, QArray<?> value, int sourceIndex, boolean clear) {

		int positionSource = ((value.getLength() / value.capacity()) * (sourceIndex - 1));
		int positionTarget = ((this.getLength() / this.capacity()) * (targetIndex - 1));

		// TODO test me
		byte[] bytes = value.asBytes();
		bytes = Arrays.copyOfRange(bytes, positionSource, bytes.length);
		NIOBufferHelper.movel(getBuffer(), positionTarget, value.getSize(), bytes, clear, getFiller());
	}
}