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
import java.nio.ByteBuffer;

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

	public NIOBufferedElementDelegatorImpl(final QDataContext dataContext) {
		super(dataContext);
	}

	protected NIOBufferedElementDelegatorImpl(final QDataContext dataContext, final QBufferedElement delegate) {
		super(dataContext);
		this._delegate = delegate;
	}

	@Override
	protected final QDataContext getDataContext() {

		if (_dataContext == null && _delegate instanceof QBufferedData)
			return NIOBufferHelper.getNIOBufferedDataImpl((_delegate)).getDataContext();
		else
			return _dataContext;
	}

	@Override
	public final BufferedElementType getBufferedElementType() {
		return _delegate.getBufferedElementType();
	}

	@Override
	public final void accept(final QDataVisitor visitor) {
		if (_delegate == null)
			visitor.visit(this);
		else
			_delegate.accept(visitor);
	}

	@Override
	public final void assign(final QBufferedData value) {
		_delegate.assign(value);
	}

	@Override
	public final void slice(final QBufferedData value) {
		_delegate.slice(value);
	}

	@Override
	public final void slice(final QBufferedData value, final int position) {
		_delegate.slice(value, position);
	}

	@Override
	public final void clear() {
		if (_delegate != null)
			_delegate.clear();
	}

	@Override
	protected final NIODataImpl _copyDef(final QDataContext dataContext) {

		try {
			NIOBufferedElementDelegatorImpl copy = null;

			final ByteArrayOutputStream baos = new ByteArrayOutputStream();
			final ObjectOutputStream oos = new ObjectOutputStream(baos);
			final QBufferedElement temp = _delegate;
			_delegate = null;
			oos.writeObject(this);
			_delegate = temp;
			oos.close();

			final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			final ObjectInputStream ois = new ObjectInputStream(bais);
			copy = (NIOBufferedElementDelegatorImpl) ois.readObject();
			ois.close();
			if (_delegate != null)
				copy._delegate = (QBufferedElement) NIOBufferHelper.getNIOBufferedElementImpl(_delegate)._copyDef(dataContext);

			copy._dataContext = dataContext;

			return copy;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public final boolean eq(final DataSpecial value) {
		return _delegate.eq(value);
	}

	@Override
	public final boolean eq(final QDataFiller value) {
		return _delegate.eq(value);
	}

	@Override
	public final QBufferedData eval(final QDataFiller value) {
		_delegate.eval(value);
		return this;
	}

	@Override
	public final boolean ge(final DataSpecial value) {
		return _delegate.ge(value);
	}

	@Override
	public final boolean ge(final QDataFiller value) {
		return _delegate.ge(value);
	}

	@Override
	public final QBufferedElement getDelegate() {
		return _delegate;
	}

	@Override
	public final boolean gt(final DataSpecial value) {
		return _delegate.gt(value);
	}

	@Override
	public final boolean gt(final QDataFiller value) {
		return _delegate.gt(value);
	}

	@Override
	public final boolean isEmpty() {
		return _delegate.isEmpty();
	}

	@Override
	public final boolean isNull() {
		if (_delegate == null)
			return true;

		return _delegate.isNull();
	}

	@Override
	public final boolean le(final DataSpecial value) {
		return _delegate.le(value);
	}

	@Override
	public final boolean le(final QDataFiller value) {
		return _delegate.le(value);
	}

	@Override
	public final int getLength() {
		return _delegate.getLength();
	}

	@Override
	public final boolean lt(final DataSpecial value) {
		return _delegate.lt(value);
	}

	@Override
	public final boolean lt(final QDataFiller value) {
		return _delegate.lt(value);
	}

	@Override
	public final void move(final DataSpecial value) {
		_delegate.move(value);
	}

	@Override
	public final void move(final DataSpecial value, final boolean clear) {
		_delegate.move(value, clear);
	}

	@Override
	public final void move(final Number value) {
		_delegate.move(value);
	}

	@Override
	public final void move(final Number value, final boolean clear) {
		_delegate.move(value, clear);
	}

	@Override
	public final void move(final String value) {
		_delegate.move(value);
	}

	@Override
	public final void move(final String value, final boolean clear) {
		_delegate.move(value, clear);
	}

	@Override
	public final void movel(final DataSpecial value) {
		_delegate.movel(value);
	}

	@Override
	public final void movel(final DataSpecial value, final boolean clear) {
		_delegate.movel(value, clear);
	}

	@Override
	public final void movel(final Number value) {
		_delegate.movel(value);
	}

	@Override
	public final void movel(final Number value, final boolean clear) {
		_delegate.movel(value, clear);
	}

	@Override
	public final void movel(final String value) {
		_delegate.movel(value);
	}

	@Override
	public final void movel(final String value, final boolean clear) {
		_delegate.movel(value, clear);
	}

	@Override
	public final boolean ne(final DataSpecial value) {
		return _delegate.ne(value);
	}

	@Override
	public final boolean ne(final QDataFiller value) {
		return _delegate.ne(value);
	}

	protected final void setDelegate(final QBufferedElement delegate) {
		this._delegate = delegate;
	}

	@Override
	public final int getSize() {
		return _delegate.getSize();
	}

	@Override
	public final String toString() {
		return _delegate.toString();
	}

	@Override
	public final void move(final QDataFiller value) {
		_delegate.move(value);
	}

	@Override
	public final void move(final QDataFiller value, final boolean clear) {
		_delegate.move(value, clear);
	}

	@Override
	public final void movel(final QDataFiller value) {
		_delegate.movel(value);
	}

	@Override
	public final void movel(final QDataFiller value, final boolean clear) {
		_delegate.movel(value, clear);
	}

	@Override
	public final QNumeric qLen() {
		return _delegate.qLen();
	}

	public final QPointer qAddr() {
		return _delegate.qAddr();
	}

	@Override
	public final ByteBuffer getBuffer() {
		return _delegate.getBuffer();
	}

	@Override
	public final int getPosition() {
		return _delegate.getPosition();
	}

	@Override
	public final boolean isStoreOwner() {
		return _delegate.isStoreOwner();
	}

	public final void move(final QString value) {
		_delegate.move(value);
	}

	public final void move(final QString value, final boolean clear) {
		_delegate.move(value, clear);
	}

	public final void move(final QNumeric value) {
		_delegate.move(value);
	}

	public final void move(final QNumeric value, final boolean clear) {
		_delegate.move(value, clear);
	}

	public final void movel(final QString value) {
		_delegate.movel(value);
	}

	public final void movel(final QString value, final boolean clear) {
		_delegate.movel(value, clear);
	}

	public final void movel(final QNumeric value) {
		_delegate.movel(value);
	}

	public final void movel(final QNumeric value, final boolean clear) {
		_delegate.movel(value, clear);
	}

	public final void move(final QBufferedElement value) {
		_delegate.move(value);
	}

	public final void move(final QBufferedElement value, final boolean clear) {
		_delegate.move(value, clear);
	}

	public final void movel(final QBufferedElement value) {
		_delegate.movel(value);
	}

	public final void movel(final QBufferedElement value, final boolean clear) {
		_delegate.movel(value, clear);
	}

	public final byte[] asBytes() {
		return _delegate.asBytes();
	}

	public final void reset() {
		_delegate.reset();
	}

	public final void snap() {
		_delegate.snap();
	}

	@Override
	public final BufferedDataType getBufferedDataType() {
		return _delegate.getBufferedDataType();
	}
}