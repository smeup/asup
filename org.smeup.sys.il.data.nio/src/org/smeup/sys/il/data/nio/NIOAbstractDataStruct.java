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
import java.io.ObjectStreamClass;
import java.nio.ByteBuffer;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataVisitor;
import org.smeup.sys.il.data.QStorable;

public abstract class NIOAbstractDataStruct extends NIOCharacterImpl implements QDataStruct {

	private static final long serialVersionUID = 1L;

	public NIOAbstractDataStruct(QDataContext dataContext, int length) {
		super(dataContext, length, false);
	}

	protected void _allocate() {
		checkAllocation();
		_buffer = ByteBuffer.allocate(getSize());			
		NIOBufferHelper.fill(_buffer, 0, _buffer.capacity(), INIT);			
	}
	
	protected abstract void addElement(String name, QBufferedData element, int position);
	
	@Override
	protected void _clear() {
		super._clear();

		for (QBufferedData element : this.getElements())
			element.clear();
	}

	@Override
	public boolean isEmpty() {

		for (QBufferedData element : this.getElements())
			if (!element.isEmpty())
				return false;

		return super.isEmpty();
	}

	@Override
	public void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void snap() {

		if (!isEmpty())
			getDataContext().snap(this);

		for (QBufferedData element : getElements())
			element.snap();
	}
	
	@Override
	protected final NIODataImpl _copy(QDataContext dataContext) {

		try {

			NIODataImpl copy = null;

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);

			QStorable tempStorage = _storage;
			ByteBuffer tempBuffer = _buffer;
			int tempPosition = _position;

			_storage = null;
			_buffer = null;
			_position = 0;
			oos.writeObject(this);
			_storage = tempStorage;
			_buffer = tempBuffer;
			_position = tempPosition;

			baos.close();
			oos.close();

			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais) {
				@Override
				protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
					try {
						return super.resolveClass(desc);
					} catch (Exception e) {
						if (NIOAbstractDataStruct.this instanceof NIODataStructWrapperHandler) {
							NIODataStructWrapperHandler nioDataStructWrapperHandler = (NIODataStructWrapperHandler) NIOAbstractDataStruct.this;
							Class<?> c = nioDataStructWrapperHandler._wrapped.getClass().getClassLoader().loadClass(desc.getName());
							return c;
						}

						throw e;
					}
				}
			};
			copy = (NIODataImpl) ois.readObject();
			copy._dataContext = dataContext;
			bais.close();
			ois.close();

			return copy;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}