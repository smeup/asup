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

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContainer;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.SortDirection;

public class NIOScrollerImpl<D extends QBufferedData> extends NIOBufferedListImpl<D> implements QScroller<D> {

	private static final long serialVersionUID = 1L;

	private int _dimension;
	private int _lastIndex;

	public NIOScrollerImpl(QDataContainer dataContainer) {
		super(dataContainer);
	}

	public NIOScrollerImpl(QDataContainer dataContainer, D model, int dimension, SortDirection sortDirection) {
		super(dataContainer, model, sortDirection);
		_dimension = dimension;
	}

	@Override
	public int count() {
		return _dimension;
	}

	@Override
	public void allocate() {
		super.allocate();

		clear();

		absolute(1);
	}

	@Override
	public int capacity() {
		return _dimension;
	}

	@Override
	public D get(int index) {

		if (_lastIndex == index)
			return (D) getModel();

//		int size = _model.getSize();	
//		int position = size * (index - 1);
		
		int position = 0;
		
		if(getListOwner() == null)
			position = getModel().getSize() * (index - 1);
		else
			position = getListOwner().getModel().getLength() * (index - 1);

		slice(getModel(), position);

		_lastIndex = index;

		return (D) getModel();
	}

	@Override
	public int getLength() {
		return _dimension * getModel().getLength();
	}

	@Override
	public int getSize() {
		return _dimension * getModel().getSize();
	}

	@Override
	public D absolute(int position) {
		return get(position);
	}

	@Override
	public D current() {
		return (D) getModel();
	}

	@Override
	public D first() {
		return get(1);
	}

	@Override
	public D last() {
		return get(_dimension);
	}

	@Override
	public D next() {
		return get(_lastIndex + 1);
	}

	@Override
	public D previous() {
		return get(_lastIndex - 1);
	}

	@Override
	public String asString() {
		return asString();
	}

	@Override
	protected byte getFiller() {
		return ((NIOBufferedDataImpl)getModel()).getFiller();
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
	public D[] asArray() {
		throw new UnsupportedOperationException();
	}
}