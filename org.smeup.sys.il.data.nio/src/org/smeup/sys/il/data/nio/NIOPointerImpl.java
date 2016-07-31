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

import org.smeup.sys.il.data.IntegratedLanguageDataRuntimeException;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QNumeric;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QStorable;
import org.smeup.sys.il.data.QString;

public final class NIOPointerImpl extends NIODataImpl implements QPointer {

	private static final long serialVersionUID = 1L;
	protected QStorable _storage = null;

	public NIOPointerImpl(final QDataContext dataContext, final QStorable storage) {
		super(dataContext);
		this._storage = storage;
	}

	@Override
	protected final QDataContext getDataContext() {

		if (_dataContext == null && _storage instanceof QBufferedData)
			return NIOBufferHelper.getNIOBufferedDataImpl((_storage)).getDataContext();
		else
			return _dataContext;
	}

	@Override
	public final boolean isNull() {
		return _storage == null;
	}

	@Override
	public final void assign(final QBufferedData target) {
		NIOBufferHelper.assign(this, target);
	}

	@Override
	public final void eval(final QPointer value) {
		this._storage = ((NIOPointerImpl) value)._storage;
	}

	@Override
	public final void dealloc() {
		this._storage = null;
	}

	@Override
	public final void accept(final QDataVisitor visitor) {
		visitor.visit(this);
	}

	public final QString qStr() {
		return qStr(getByteSize(_storage));
	}

	public final QString qStr(final int length) {

		final QCharacter character = getDataContext().getDataFactory().createCharacter(length, false, false);
		_storage.assign(character);

		return character;
	}

	@Override
	public final QString qStr(final QNumeric length) {
		return qStr(length.i());
	}

	@Override
	public final void clear() {
		this._storage = null;
	}

	@Override
	public final boolean isEmpty() {
		if (_storage == null)
			return true;
		else
			return _storage.isEmpty();
	}

	@Override
	public final NIODataImpl _copyDef(final QDataContext dataContext) {

		try {

			NIODataImpl copy = null;

			final ByteArrayOutputStream baos = new ByteArrayOutputStream();
			final ObjectOutputStream oos = new ObjectOutputStream(baos);

			final QStorable tempStorage = _storage;

			_storage = null;
			oos.writeObject(this);

			_storage = tempStorage;
			oos.close();

			final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			final ObjectInputStream ois = new ObjectInputStream(bais);
			copy = (NIODataImpl) ois.readObject();
			copy._dataContext = dataContext;
			ois.close();

			return copy;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public final ByteBuffer getBuffer() {
		if (_storage != null)
			return NIOBufferHelper.getBuffer(_storage);
		else
			return null;
	}

	@Override
	public final int getPosition() {
		return _storage.getPosition();
	}

	private final int getByteSize(final QStorable storable) {
		if (storable instanceof QBufferedData)
			return ((QBufferedData) storable).getSize();
		else
			throw new IntegratedLanguageDataRuntimeException("Invalid storage: " + storable);
	}

	@Override
	public final String toString() {
		return "SPP:" + _storage.hashCode();
	}

	@Override
	public final QPointer qMinus(final Number value) {
		return new NIOPointerImpl(getDataContext(), new NIOStorageImpl(getBuffer(), getPosition() - value.intValue()));
	}

	@Override
	public final QPointer qMinus(final QNumeric value) {
		return qMinus(value.n());
	}

	@Override
	public final QPointer qPlus(final Number value) {
		return new NIOPointerImpl(getDataContext(), new NIOStorageImpl(getBuffer(), getPosition() + value.intValue()));
	}

	@Override
	public final QPointer qPlus(final QNumeric value) {
		return qPlus(value.n());
	}

	@Override
	public final QPointer minus(final Number value) {
		if (!(_storage instanceof NIOStorageImpl))
			throw new UnsupportedOperationException();

		final NIOStorageImpl nioStorageImpl = (NIOStorageImpl) _storage;
		nioStorageImpl.setPosition(getPosition() - value.intValue());

		return this;
	}

	@Override
	public final QPointer minus(final QNumeric value) {
		return minus(value.n());
	}

	@Override
	public final QPointer plus(final Number value) {
		if (!(_storage instanceof NIOStorageImpl))
			throw new UnsupportedOperationException();

		final NIOStorageImpl nioStorageImpl = (NIOStorageImpl) _storage;
		nioStorageImpl.setPosition(getPosition() + value.intValue());

		return this;
	}

	@Override
	public final QPointer plus(final QNumeric value) {
		return plus(value.n());
	}

	@Override
	public final boolean eq(final QPointer value) {
		if (value == null)
			if (isNull())
				return true;
			else
				return false;

		return NIOBufferHelper.equalsAddress(this, value, 1);
	}

	@Override
	public final boolean ne(final QPointer value) {
		return !eq(value);
	}
}
