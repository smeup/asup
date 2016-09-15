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

public class NIOObjectProxy implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	private static NIOObjectProxy instance = null;
	
	protected static NIOObjectProxy getInstance() {

		if(instance == null) {
			synchronized (NIOObjectProxy.class) {
				if(instance == null) {
					instance = new NIOObjectProxy();
				}
			}
		}
		
		return instance;
	}
}
