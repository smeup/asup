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

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataContext;

public abstract class NIOCharacterImpl extends NIOStringImpl implements QCharacter {

	private static final long serialVersionUID = 1L;

	public NIOCharacterImpl(final QDataContext dataContext, final int length) {
		super(dataContext, length);
	}
}