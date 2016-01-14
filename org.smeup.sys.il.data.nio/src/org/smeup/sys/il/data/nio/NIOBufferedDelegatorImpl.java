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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedDataDelegator;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;

public abstract class NIOBufferedDelegatorImpl extends NIODataImpl implements QBufferedData, QBufferedDataDelegator {

	private static final long serialVersionUID = 1L;

	private QBufferedData _delegate;

	public NIOBufferedDelegatorImpl(QDataContext dataContext) {
		super(dataContext);
	}

	protected NIOBufferedDelegatorImpl(QDataContext dataContext, QBufferedData delegate) {
		super(dataContext);
		this._delegate = delegate;
	}

	@Override
	public void accept(QDataVisitor visitor) {
		if(_delegate == null)
			visitor.visit(this);
		else
			_delegate.accept(visitor);
	}

	@Override
	public byte[] asBytes() {
		return _delegate.asBytes();
	}

	@Override
	public void assign(QBufferedData value) {
		_delegate.assign(value);
	}

	@Override
	public void assign(QBufferedData value, int position) {
		_delegate.assign(value, position);
	}

	@Override
	public void clear() {
		if (_delegate != null)
			_delegate.clear();
	}

	@Override
	public NIODataImpl copy() {

		try {
			NIOBufferedDelegatorImpl copy = null;

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			QBufferedData temp = _delegate;
			QDataContext tempDataContext = getDataContext();
			_delegate = null;
			_dataContext = null;
			oos.writeObject(this);
			_delegate = temp;
			_dataContext = tempDataContext;
			oos.close();

			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			copy = (NIOBufferedDelegatorImpl) ois.readObject();
			ois.close();
			if (_delegate != null) {
				copy._delegate = NIOBufferHelper.getNIOBufferedDataImpl(_delegate).copy();
			}
			copy._dataContext = _dataContext;
			return copy;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public <E extends Enum<E>> boolean eq(E value) {
		return _delegate.eq(value);
	}

	@Override
	public boolean eq(QDataFiller value) {
		return _delegate.eq(value);
	}

	@Override
	public <E extends Enum<E>> void eval(E value) {
		_delegate.eval(value);
	}

	@Override
	public void eval(QDataFiller value) {
		_delegate.eval(value);
	}

	@Override
	public void eval(byte value) {
		_delegate.eval(value);
	}

	@Override
	public <E extends Enum<E>> boolean ge(E value) {
		return _delegate.ge(value);
	}

	@Override
	public boolean ge(QDataFiller value) {
		return _delegate.ge(value);
	}

	@Override
	public QBufferedData getDelegate() {
		return _delegate;
	}

	@Override
	public <E extends Enum<E>> boolean gt(E value) {
		return _delegate.gt(value);
	}

	@Override
	public boolean gt(QDataFiller value) {
		return _delegate.gt(value);
	}

	@Override
	public boolean isEmpty() {
		return _delegate.isEmpty();
	}

	@Override
	public boolean isNull() {
		if (_delegate == null)
			return true;

		return _delegate.isNull();
	}

	@Override
	public <E extends Enum<E>> boolean le(E value) {
		return _delegate.le(value);
	}

	@Override
	public boolean le(QDataFiller value) {
		return _delegate.le(value);
	}

	@Override
	public int getLength() {
		return _delegate.getLength();
	}

	@Override
	public <E extends Enum<E>> boolean lt(E value) {
		return _delegate.lt(value);
	}

	@Override
	public boolean lt(QDataFiller value) {
		return _delegate.lt(value);
	}

	@Override
	public <E extends Enum<E>> void move(E value) {
		_delegate.move(value);
	}

	@Override
	public <E extends Enum<E>> void move(E value, boolean clear) {
		_delegate.move(value, clear);
	}

	@Override
	public void move(int value) {
		_delegate.move(value);
	}

	@Override
	public void move(int value, boolean clear) {
		_delegate.move(value, clear);
	}

	@Override
	public void move(Number value) {
		_delegate.move(value);
	}

	@Override
	public void move(Number value, boolean clear) {
		_delegate.move(value, clear);
	}

	@Override
	public void move(QBufferedData value) {
		_delegate.move(value);
	}

	@Override
	public void move(QBufferedData value, boolean clear) {
		_delegate.move(value, clear);
	}

	@Override
	public void move(String value) {
		_delegate.move(value);
	}

	@Override
	public void move(String value, boolean clear) {
		_delegate.move(value, clear);
	}

	@Override
	public void movea(QArray<?> value) {
		_delegate.movea(value);
	}

	@Override
	public void movea(QArray<?> value, boolean clear) {
		_delegate.movea(value, clear);
	}

	@Override
	public void movea(String value) {
		_delegate.movea(value);
	}

	@Override
	public void movea(String value, boolean clear) {
		_delegate.movea(value, clear);
	}

	@Override
	public <E extends Enum<E>> void movel(E value) {
		_delegate.movel(value);
	}

	@Override
	public <E extends Enum<E>> void movel(E value, boolean clear) {
		_delegate.movel(value, clear);
	}

	@Override
	public void movel(int value) {
		_delegate.movel(value);
	}

	@Override
	public void movel(int value, boolean clear) {
		_delegate.movel(value, clear);
	}

	@Override
	public void movel(Number value) {
		_delegate.movel(value);
	}

	@Override
	public void movel(Number value, boolean clear) {
		_delegate.movel(value, clear);
	}

	@Override
	public void movel(QBufferedData value) {
		_delegate.movel(value);
	}

	@Override
	public void movel(QBufferedData value, boolean clear) {
		_delegate.movel(value, clear);
	}

	@Override
	public void movel(String value) {
		_delegate.movel(value);
	}

	@Override
	public void movel(String value, boolean clear) {
		_delegate.movel(value, clear);
	}

	@Override
	public <E extends Enum<E>> boolean ne(E value) {
		return _delegate.ne(value);
	}

	@Override
	public boolean ne(QDataFiller value) {
		return _delegate.ne(value);
	}

	protected void setDelegate(QBufferedData delegate) {
		this._delegate = delegate;
	}

	@Override
	public int getSize() {
		return _delegate.getSize();
	}

	@Override
	public String toString() {
		return _delegate.toString();
	}

	@Override
	public void move(QDataFiller value) {
		_delegate.move(value);
	}

	@Override
	public void move(QDataFiller value, boolean clear) {
		_delegate.move(value, clear);
	}

	@Override
	public void movel(QDataFiller value) {
		_delegate.movel(value);
	}

	@Override
	public void movel(QDataFiller value, boolean clear) {
		_delegate.movel(value, clear);
	}

	@Override
	public boolean eq(QBufferedData value) {
		return _delegate.eq(value);
	}

	@Override
	public boolean ne(QBufferedData value) {
		return _delegate.ne(value);
	}

	@Override
	public QNumeric qLen() {
		return _delegate.qLen();
	}

	public QPointer qAddr() {
		return _delegate.qAddr();
	}

	public boolean eq(byte value) {
		return _delegate.eq(value);
	}

	public boolean ne(byte value) {
		return _delegate.ne(value);
	}

	public boolean ge(byte value) {
		return _delegate.ge(value);
	}

	public boolean gt(byte value) {
		return _delegate.gt(value);
	}

	public boolean le(byte value) {
		return _delegate.le(value);
	}

	public boolean lt(byte value) {
		return _delegate.lt(value);
	}

	public void movea(QArray<?> value, int startIndex) {
		_delegate.movea(value, startIndex);
	}

	public void movea(QArray<?> value, QNumeric startIndex) {
		_delegate.movea(value, startIndex);
	}

	public void movea(QArray<?> value, int startIndex, boolean clear) {
		_delegate.movea(value, startIndex, clear);
	}

	public void movea(QArray<?> value, QNumeric startIndex, boolean clear) {
		_delegate.movea(value, startIndex, clear);
	}

	@Override
	public Object getStore() {
		return _delegate.getStore();
	}

	@Override
	public int getPosition() {
		return _delegate.getPosition();
	}

	@Override
	public void fill(QBufferedData value) {
		_delegate.fill(value);
	}

	public boolean ge(QBufferedData value) {
		return _delegate.ge(value);
	}

	public boolean gt(QBufferedData value) {
		return _delegate.gt(value);
	}

	public boolean le(QBufferedData value) {
		return _delegate.le(value);
	}

	public boolean lt(QBufferedData value) {
		return _delegate.lt(value);
	}

	@Override
	public boolean isStoreOwner() {
		return _delegate.isStoreOwner();
	}
}