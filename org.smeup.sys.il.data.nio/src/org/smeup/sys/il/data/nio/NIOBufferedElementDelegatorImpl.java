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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.smeup.sys.il.data.BufferedDataType;
import org.smeup.sys.il.data.BufferedElementType;
import org.smeup.sys.il.data.DataSpecial;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QBufferedElement;
import org.smeup.sys.il.data.QBufferedElementDelegator;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataFiller;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QString;

public abstract class NIOBufferedElementDelegatorImpl extends NIODataImpl implements QBufferedElementDelegator {

	private static final long serialVersionUID = 1L;

	private QBufferedElement _delegate;

	public NIOBufferedElementDelegatorImpl(QDataContext dataContext) {
		super(dataContext);
	}

	protected NIOBufferedElementDelegatorImpl(QDataContext dataContext, QBufferedElement delegate) {
		super(dataContext);
		this._delegate = delegate;
	}
	
	@Override
	protected final QDataContext getDataContext() {

		if (_dataContext == null && _delegate instanceof QBufferedData) {
			return NIOBufferHelper.getNIOBufferedDataImpl(((QBufferedData) _delegate)).getDataContext();
		} else
			return _dataContext;
	}
	
	@Override
	public BufferedElementType getBufferedElementType() {
		return _delegate.getBufferedElementType();
	}

	@Override
	public void accept(QDataVisitor visitor) {
		if(_delegate == null)
			visitor.visit(this);
		else
			_delegate.accept(visitor);
	}

	@Override
	public void assign(QBufferedData value) {
		_delegate.assign(value);
	}

	@Override
	public void slice(QBufferedData value, int position) {
		_delegate.slice(value, position);
	}

	@Override
	public void clear() {
		if (_delegate != null)
			_delegate.clear();
	}

	@Override
	protected final NIODataImpl _copy(QDataContext dataContext) {

		try {
			NIOBufferedElementDelegatorImpl copy = null;

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			QBufferedElement temp = _delegate;
			_delegate = null;
			oos.writeObject(this);
			_delegate = temp;
			oos.close();

			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			copy = (NIOBufferedElementDelegatorImpl) ois.readObject();
			ois.close();
			if (_delegate != null)
				copy._delegate = (QBufferedElement) NIOBufferHelper.getNIOBufferedElementImpl(_delegate)._copy(dataContext);
			
			copy._dataContext = dataContext;
			
			return copy;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eq(DataSpecial value) {
		return _delegate.eq(value);
	}

	@Override
	public boolean eq(QDataFiller value) {
		return _delegate.eq(value);
	}

	@Override
	public QBufferedData eval(DataSpecial value) {
		_delegate.eval(value);
		return this;
	}

	@Override
	public QBufferedData eval(QDataFiller value) {
		_delegate.eval(value);
		return this;
	}
	
	@Override
	public boolean ge(DataSpecial value) {
		return _delegate.ge(value);
	}

	@Override
	public boolean ge(QDataFiller value) {
		return _delegate.ge(value);
	}

	@Override
	public QBufferedElement getDelegate() {
		return _delegate;
	}

	@Override
	public boolean gt(DataSpecial value) {
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
	public boolean le(DataSpecial value) {
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
	public boolean lt(DataSpecial value) {
		return _delegate.lt(value);
	}

	@Override
	public boolean lt(QDataFiller value) {
		return _delegate.lt(value);
	}

	@Override
	public void move(DataSpecial value) {
		_delegate.move(value);
	}

	@Override
	public void move(DataSpecial value, boolean clear) {
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
	public void move(String value) {
		_delegate.move(value);
	}

	@Override
	public void move(String value, boolean clear) {
		_delegate.move(value, clear);
	}

	@Override
	public void movel(DataSpecial value) {
		_delegate.movel(value);
	}

	@Override
	public void movel(DataSpecial value, boolean clear) {
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
	public void movel(String value) {
		_delegate.movel(value);
	}

	@Override
	public void movel(String value, boolean clear) {
		_delegate.movel(value, clear);
	}

	@Override
	public boolean ne(DataSpecial value) {
		return _delegate.ne(value);
	}

	@Override
	public boolean ne(QDataFiller value) {
		return _delegate.ne(value);
	}

	protected void setDelegate(QBufferedElement delegate) {
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
	public QNumeric qLen() {
		return _delegate.qLen();
	}

	public QPointer qAddr() {
		return _delegate.qAddr();
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
	public boolean isStoreOwner() {
		return _delegate.isStoreOwner();
	}

	public void move(QString value) {
		_delegate.move(value);
	}

	public void move(QString value, boolean clear) {
		_delegate.move(value, clear);
	}

	public void move(QNumeric value) {
		_delegate.move(value);
	}

	public void move(QNumeric value, boolean clear) {
		_delegate.move(value, clear);
	}

	public void movel(QString value) {
		_delegate.movel(value);
	}

	public void movel(QString value, boolean clear) {
		_delegate.movel(value, clear);
	}

	public void movel(QNumeric value) {
		_delegate.movel(value);
	}

	public void movel(QNumeric value, boolean clear) {
		_delegate.movel(value, clear);
	}

	public void move(QBufferedElement value) {
		_delegate.move(value);
	}

	public void move(QBufferedElement value, boolean clear) {
		_delegate.move(value, clear);
	}

	public void movel(QBufferedElement value) {
		_delegate.movel(value);
	}

	public void movel(QBufferedElement value, boolean clear) {
		_delegate.movel(value, clear);
	}

	public byte[] asBytes() {
		return _delegate.asBytes();
	}

	public void reset() {
		_delegate.reset();
	}

	public void snap() {
		_delegate.snap();
	}
	
	@Override
	public BufferedDataType getBufferedDataType() {
		return _delegate.getBufferedDataType();
	}
}