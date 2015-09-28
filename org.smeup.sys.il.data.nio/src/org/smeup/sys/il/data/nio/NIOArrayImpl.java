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
import java.util.List;

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.SortDirection;

public class NIOArrayImpl<D extends NIOBufferedDataImpl> extends NIOBufferedListImpl<D> implements QArray<D> {

	private static final long serialVersionUID = 1L;

//	private D[] _elements;
	
	private int dimension = 0;

	
	public NIOArrayImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIOArrayImpl(QDataContext dataContext, D model, int dimension, SortDirection sortDirection) {
		super(dataContext, model, sortDirection);
		this.dimension = dimension;
//		this._elements = (D[]) Array.newInstance(model.getClass(), dimension);
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
			
/*		D element = _elements[index - 1];
		if (element == null) {
			element = (D) getModel().copy();
			int position = 0;
			
			if(getLengthSlot() == 0)
				position = getModel().getSize() * (index - 1);
			else
				position = getLengthSlot() * (index - 1);
			
			slice(element, position);
			_elements[index - 1] = element;
		}*/
		
		D element = (D) getModel().copy();
		int position = 0;
		
		if(getListOwner() == null)
			position = getModel().getSize() * (index - 1);
		else
			position = getListOwner().getModel().getLength() * (index - 1);		
		
		assign(element, position+1);

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
		if (value == null)
			return;

		movea(value, true);
	}

	@Override
	protected byte getFiller() {
		return getModel().getFiller();
	}

	@Override
	public void set(int index, D value) {
		get(index).eval(value);
	}

	@Override
	public void set(QNumeric index, D value) {
		set(index.asInteger(), value);
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
		assign(subArray, getModel().getSize()*(start-1)+1);
					
		return subArray;
	}
}