/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QDataWriter;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QIntegratedLanguageDataFactory;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.SortDirection;

public class NIOArrayImpl<D extends NIOBufferedDataImpl> extends NIOBufferedListImpl<D> implements QArray<D> {

	private static final long serialVersionUID = 1L;

	// private D[] _elements;

	private int dimension = 0;

	public NIOArrayImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIOArrayImpl(QDataContext dataContext, D model, int dimension, SortDirection sortDirection) {
		super(dataContext, model, sortDirection);
		this.dimension = dimension;
		// this._elements = (D[]) Array.newInstance(model.getClass(),
		// dimension);
	}

	@Override
	public void clear() {
		NIOBufferHelper.clear(getBuffer(), getPosition(), getSize(), getFiller());
	}

	@Override
	public int capacity() {
		return dimension;
	}

	@Override
	public int count() {
		return capacity();
	}

	@SuppressWarnings("unchecked")
	@Override
	public D get(int index) {

		/*
		 * D element = _elements[index - 1]; if (element == null) { element =
		 * (D) getModel().copy(); int position = 0;
		 * 
		 * if(getLengthSlot() == 0) position = getModel().getSize() * (index -
		 * 1); else position = getLengthSlot() * (index - 1);
		 * 
		 * slice(element, position); _elements[index - 1] = element; }
		 */

		D element = (D) getModel().copy();
		int position = 0;

		if (getListOwner() == null)
			position = getModel().getSize() * (index - 1);
		else
			position = getListOwner().getModel().getSize() * (index - 1);

		assign(element, position + 1);

		return element;
	}

	@Override
	public int getLength() {
		return capacity() * getModel().getLength();
	}

	@Override
	public int getSize() {
		return capacity() * getModel().getSize();
	}

	@SuppressWarnings("unchecked")
	@Override
	public D[] asArray() {

		List<QBufferedData> dataList = new ArrayList<QBufferedData>();
		for (QBufferedData elementTarget : this) {
			dataList.add(elementTarget);
		}

		return (D[]) dataList.toArray();
	}

	@Override
	public void eval(QArray<D> value) {
		
		int capacity = capacity();
		if(value.capacity() < capacity)
			capacity = value.capacity();
		
		QDataWriter dataWriter = QIntegratedLanguageDataFactory.eINSTANCE.createDataWriter();
		for(int e=1; e<=capacity;e++) {
			dataWriter.set(value.get(e));
			get(e).eval(dataWriter);
		}
		
		for(int e=capacity+1; e<=capacity();e++) 
			get(e).clear();
	}

	@Override
	protected byte getFiller() {
		return getModel().getFiller();
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

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		// TODO Auto-generated method stub
		return false;
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
	public <E extends Enum<E>> boolean ne(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public QArray<D> qSubarr(int start, QDecimal elements) {
		return qSubarr(start, elements.asInteger());
	}

	@Override
	public QArray<D> qSubarr(QDecimal start, QDecimal elements) {
		return qSubarr(start.asInteger(), elements.asInteger());
	}

	@Override
	public QArray<D> qSubarr(QDecimal start, int elements) {
		return qSubarr(start.asInteger(), elements);
	}

	@Override
	public QArray<D> qSubarr(int start, int elements) {

		NIOArrayImpl<D> subArray = new NIOArrayImpl<D>(getDataContext(), getModel(), elements, getSortDirection());
		assign(subArray, getModel().getSize() * (start - 1) + 1);

		return subArray;
	}

	@Override
	public void plus(QArray<D> array) {
		plus(array, null);
	}

	@Override
	public void plus(QArray<D> array, String roundingMode) {
		if (this.getModel() instanceof QNumeric) {
			for (int i = 1; i <= this.capacity(); i++) {
				if (i > array.capacity())
					break;
				((QNumeric) this.get(i)).plus((QNumeric) array.get(i));
			}
		}
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
	public void plus(long value) {
		plus(value, null);
	}

	@Override
	public void plus(long value, String roundingMode) {
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
	public void plus(double value) {
		plus(value, null);
	}

	@Override
	public void plus(double value, String roundingMode) {
		operationPlus(value, roundingMode);
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
	public void divide(QArray<D> array) {
		divide(array, null);
	}

	@Override
	public void divide(QArray<D> array, String roundingMode) {
		if (this.getModel() instanceof QNumeric) {
			for (int i = 1; i <= this.capacity(); i++) {
				if (i > array.capacity())
					break;
				((QNumeric) this.get(i)).divide((QNumeric) array.get(i));
			}
		}
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
	public void divide(long value) {
		divide(value, null);
	}

	@Override
	public void divide(long value, String roundingMode) {
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
	public void divide(double value) {
		divide(value, null);
	}

	@Override
	public void divide(double value, String roundingMode) {
		operationDivide(value, roundingMode);
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
	public void minus(QArray<D> array) {
		minus(array, null);
	}

	@Override
	public void minus(QArray<D> array, String roundingMode) {
		if (this.getModel() instanceof QNumeric) {
			for (int i = 1; i <= this.capacity(); i++) {
				if (i > array.capacity())
					break;
				((QNumeric) this.get(i)).minus((QNumeric) array.get(i));
			}
		}
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
	public void minus(long value) {
		minus(value, null);
	}

	@Override
	public void minus(long value, String roundingMode) {
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
	public void minus(double value) {
		minus(value, null);
	}

	@Override
	public void minus(double value, String roundingMode) {
		operationMinus(value, roundingMode);
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
	public void mult(QArray<D> array) {
		mult(array, null);
	}

	@Override
	public void mult(QArray<D> array, String roundingMode) {
		if (this.getModel() instanceof QNumeric) {
			for (int i = 1; i <= this.capacity(); i++) {
				if (i > array.capacity())
					break;
				((QNumeric) this.get(i)).mult((QNumeric) array.get(i));
			}
		}
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
	public void mult(long value) {
		mult(value, null);
	}

	@Override
	public void mult(long value, String roundingMode) {
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
	public void mult(double value) {
		mult(value, null);
	}

	@Override
	public void mult(double value, String roundingMode) {
		operationMult(value, roundingMode);
	}

	@Override
	public void mult(QNumeric value) {
		mult(value, null);
	}

	@Override
	public void mult(QNumeric value, String roundingMode) {
		operationMult(value.asDouble(), roundingMode);
	}

	private void operationDivide(Number value, String roundingMode) {
		if (this.getModel() instanceof QNumeric) {
			for (int i = 1; i <= this.capacity(); i++) {
				((QNumeric) this.get(i)).divide(value.doubleValue());
			}
		}
	}

	private void operationMult(Number value, String roundingMode) {
		if (this.getModel() instanceof QNumeric) {
			for (int i = 1; i <= this.capacity(); i++) {
				((QNumeric) this.get(i)).mult(value.doubleValue());
			}
		}
	}

	private void operationMinus(Number value, String roundingMode) {
		if (this.getModel() instanceof QNumeric) {
			for (int i = 1; i <= this.capacity(); i++) {
				((QNumeric) this.get(i)).minus(value.doubleValue());
			}
		}
	}

	private void operationPlus(Number value, String roundingMode) {
		if (this.getModel() instanceof QNumeric) {
			for (int i = 1; i <= this.capacity(); i++) {
				((QNumeric) this.get(i)).plus(value.doubleValue());
			}
		}
	}

	@Override
	public void eval(QNumeric value) {
		for (D element : this)
			((QNumeric) element).eval(value);
	}

	@Override
	public void eval(int value) {
		for (D element : this)
			((QNumeric) element).eval(value);
	}

	@Override
	public void eval(String value) {
		for (D element : this)
			((QString) element).eval(value);
	}

	@Override
	public void accept(QDataVisitor visitor) {

		if (visitor.visit(this)) {

			Iterator<D> datas = this.iterator();
			while (datas.hasNext())
				datas.next().accept(visitor);
			visitor.endVisit(this);
		}
	}

	@Override
	public void eval(QString value) {
		for (D element : this)
			((QString) element).eval(value);		
	}
}