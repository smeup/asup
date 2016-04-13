package org.smeup.sys.il.data.nio;

import java.nio.ByteBuffer;

import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QStorable;

public class NIOStorageImpl implements QStorable {
	
	
	private ByteBuffer byteBuffer = null;
	private int position = 0;
	
	public NIOStorageImpl(ByteBuffer byteBuffer, int position) {
		this.byteBuffer = byteBuffer;
		this.position = position;
	}
	
	public NIOStorageImpl(int storageLength) {
		this.byteBuffer = ByteBuffer.allocate(storageLength);
	}

	@Override
	public boolean isEmpty() {
		return byteBuffer.capacity() == 0;
	}

	@Override
	public Object getStore() {
		return byteBuffer;
	}

	protected void setPosition(int position) {
		this.position = position;
	}
	
	@Override
	public int getPosition() {
		return position;
	}

	@Override
	public void assign(QBufferedData target, int position) {
		NIOBufferHelper.assign(this, target, position);
	}

	@Override
	public void assign(QBufferedData target) {
		NIOBufferHelper.assign(this, target);
	}
}
