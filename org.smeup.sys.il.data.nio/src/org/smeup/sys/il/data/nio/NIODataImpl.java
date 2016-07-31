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

import org.smeup.sys.il.data.QData;
import org.smeup.sys.il.data.QDataContext;

public abstract class NIODataImpl implements QData {

	private static final long serialVersionUID = 1L;

	protected transient QDataContext _dataContext;

	public NIODataImpl(final QDataContext dataContext) {
		this._dataContext = dataContext;
	}

	protected abstract QDataContext getDataContext();

	protected abstract NIODataImpl _copyDef(QDataContext dataContext);
}
