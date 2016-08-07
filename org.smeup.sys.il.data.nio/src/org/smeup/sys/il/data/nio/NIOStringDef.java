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

import java.io.Serializable;
import java.util.Arrays;

public final class NIOStringDef implements Serializable {

	private static final long serialVersionUID = 1L;

	// TODO 2.5 Gb Max
	private static NIOStringDef stringDefs[] = new NIOStringDef[32767];
	
	protected final byte[] LOVAL;
	protected final byte[] HIVAL;
	protected final byte[] BLANKS;
	protected final byte[] ZEROS;
	protected final byte[] ON;
	protected final byte[] OFF;
	protected final byte[] NULL;
	
	public NIOStringDef(final int length) {

		LOVAL = new byte[length];
		Arrays.fill(LOVAL, NIOStringImpl.LOVAL);

		HIVAL = new byte[length];
		Arrays.fill(HIVAL, NIOStringImpl.HIVAL);

		BLANKS = new byte[length];
		Arrays.fill(BLANKS, NIOStringImpl.INIT);

		ZEROS = new byte[length];
		Arrays.fill(ZEROS, NIONumericImpl.INIT);
		
		ON = new byte[length];
		Arrays.fill(ON, NIOIndicatorImpl.ON);
		
		OFF = ZEROS;
		
		NULL = LOVAL;		
	}


	public static NIOStringDef getInstance(final int length) {

		try {
			NIOStringDef stringDef = stringDefs[length];
			if (stringDef == null)
				synchronized (stringDefs) {
					stringDef = stringDefs[length];
					if (stringDef == null) {
						stringDef = new NIOStringDef(length);
						stringDefs[length] = stringDef;
					}
				}

			return stringDef;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
