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

import java.lang.reflect.Array;

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QNumeric;

public class NIOArrayImpl<D extends NIOBufferedDataImpl> extends NIOBufferedListImpl<D> implements QArray<D> {

	private static final long serialVersionUID = 1L;

	private D[] _elements;
	private NIOBufferedDataImpl _model;
	private int lengthSlot = 0;
	
	public NIOArrayImpl() {
		super();
	}

	@SuppressWarnings({ "unchecked" })
	public NIOArrayImpl(NIOBufferedDataImpl model, int dimension) {
		super();
		this._model = model;
		this._elements = (D[]) Array.newInstance(model.getClass(), dimension);
	}

	protected NIOBufferedDataImpl getModel() {
		return _model;
	}

	protected void setModel(NIOBufferedDataImpl _model) {
		this._model = _model;
	}
	
	protected int getLengthSlot() {
		return lengthSlot;
	}

	protected void setLengthSlot(int lengthSlot) {
		this.lengthSlot = lengthSlot;
	}

	@Override
	public void clear() {
		NIOBufferHelper.clear(getBuffer(), getPosition(), getSize(), getFiller());
	}

	@Override
	public int capacity() {
		return _elements.length;
	}

	@Override
	public int count() {
		return capacity();
	}

	@SuppressWarnings("unchecked")
	@Override
	public D get(int index) {

		D element = _elements[index - 1];
		if (element == null) {
			element = (D) _model.copy();
			int position = 0;
			
			if(getLengthSlot() == 0)
				position = _model.getSize() * (index - 1);
			else
				position = getLengthSlot() * (index - 1);
			
			slice(element, position);
			_elements[index - 1] = element;
		}
		return element;
	}

	@Override
	public int getLength() {
		return _elements.length * _model.getLength();
	}

	@Override
	public int getSize() {
		return _elements.length * _model.getSize();
	}

	@Override
	public D[] asArray() {
		return _elements;
	}

	@Override
	public String asString() {
		return asString();
	}

	@Override
	public void eval(QArray<D> value) {
		if (value == null)
			return;

		movea(value, true);
	}

	@Override
	protected byte getFiller() {
		return _model.getFiller();
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
}