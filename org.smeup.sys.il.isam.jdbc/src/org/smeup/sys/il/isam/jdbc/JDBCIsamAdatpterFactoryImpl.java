/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.smeup.sys.il.isam.jdbc;

import org.eclipse.datatools.modelbase.sql.constraints.Index;
import org.smeup.sys.il.core.ctx.QAdapterFactory;
import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.isam.QIndex;

public class JDBCIsamAdatpterFactoryImpl implements QAdapterFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(QContext context, Object adaptable, Class<T> adapterType) {

		T adaptee = null;

		if (adaptable instanceof Index) {
			Index index = (Index) adaptable;

			if (QIndex.class.isAssignableFrom(adapterType))
				adaptee = (T) adaptIndexToIsamIndex(index);
		}

		return adaptee;
	}

	private QIndex adaptIndexToIsamIndex(Index index) {
		return new JDBCIndexAdapter(index);
	}

}
