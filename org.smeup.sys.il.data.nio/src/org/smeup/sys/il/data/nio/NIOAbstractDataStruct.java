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

import java.nio.ByteBuffer;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStruct;
import org.smeup.sys.il.data.QDataVisitor;

public abstract class NIOAbstractDataStruct extends NIOCharacterImpl implements QDataStruct {

	private static final long serialVersionUID = 1L;

	public NIOAbstractDataStruct(QDataContext dataContext, int length) {
		super(dataContext, length, false);
	}

	protected final void _allocate() {
		checkAllocation();
		_buffer = ByteBuffer.allocate(getSize());			
		NIOBufferHelper.fill(_buffer, 0, _buffer.capacity(), INIT);			
	}
	
	protected abstract void addElement(String name, QBufferedData element, int position);
	
	@Override
	protected final void _clear() {
		super._clear();

		for (QBufferedData element : this.getElements())
			element.clear();
	}

	@Override
	public final boolean isEmpty() {

		for (QBufferedData element : this.getElements())
			if (!element.isEmpty())
				return false;

		return super.isEmpty();
	}

	@Override
	public final void accept(QDataVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public final void snap() {

		if (!isEmpty())
			getDataContext().snap(this);

		for (QBufferedData element : getElements())
			element.snap();
	}
	
	@Override
	protected final NIODataImpl _copyDef(QDataContext dataContext) {
		return NIOBufferHelper.copy(dataContext, this);
	}
}