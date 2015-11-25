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

import java.util.Iterator;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.SortDirection;

public class NIOScrollerImpl<D extends QBufferedData> extends NIOBufferedListImpl<D> implements QScroller<D> {

	private static final long serialVersionUID = 1L;

	private int _dimension;
	private int _lastIndex;

	public NIOScrollerImpl(QDataContext dataContext) {
		super(dataContext);
	}

	public NIOScrollerImpl(QDataContext dataContext, D model, int dimension, SortDirection sortDirection) {
		super(dataContext, model, sortDirection);
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

		int position = 0;
		
		if(getListOwner() == null)
			position = getModel().getSize() * (index - 1);
		else
			position = getListOwner().getModel().getLength() * (index - 1);

		assign(getModel(), position+1);

		_lastIndex = index;

		return (D) getModel();
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
	protected byte getFiller() {
		return ((NIOBufferedDataImpl)getModel()).getFiller();
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
	
	@Override
	public void accept(QDataVisitor visitor) {

		if (visitor.visit(this)) {

			Iterator<D> datas = this.iterator();
			while (datas.hasNext())
				datas.next().accept(visitor);
			visitor.endVisit(this);
		}
	}
}