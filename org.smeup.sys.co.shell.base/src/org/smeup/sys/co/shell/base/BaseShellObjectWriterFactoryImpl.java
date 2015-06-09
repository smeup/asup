/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.co.shell.base;

import org.smeup.sys.il.core.ctx.QContext;
import org.smeup.sys.il.core.out.QObjectWriter;
import org.smeup.sys.il.core.out.QObjectWriterFactory;

public class BaseShellObjectWriterFactoryImpl implements QObjectWriterFactory {

	@Override
	public QObjectWriter createObjectWriter(QContext context) {

		BaseShellObjectWriterImpl objectWriter = context.make(BaseShellObjectWriterImpl.class);
		objectWriter.setContext(context);
		
		return objectWriter;
	}
}
