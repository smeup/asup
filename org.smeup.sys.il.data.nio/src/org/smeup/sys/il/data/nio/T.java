package org.smeup.sys.il.data.nio;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class T {

	public static void main(String[] args) {

		ByteBuffer b = ByteBuffer.allocate(10);
		b.put(3, (byte)'A');
		b.put(4, (byte)'D');
		b.put(5, (byte)'C');
		System.out.println(b.array());
		System.out.println(new String(b.array()).trim());
		
		long timeIni = 0;
		long times = 1000000;
		ByteBuffer bb = ByteBuffer.allocateDirect(1000);
		
		timeIni = System.currentTimeMillis();
		for(int i=0; i<times; i++) {
			Arrays.fill(bb.array(), (byte)0xF0);
		}
		System.out.println(System.currentTimeMillis()-timeIni);
		
		timeIni = System.currentTimeMillis();
		for(int i=0; i<times; i++) {
			NIOBufferHelper.fill(bb, 0, bb.capacity(), (byte)0xF0);
		}
		System.out.println(System.currentTimeMillis()-timeIni);
	}

}
