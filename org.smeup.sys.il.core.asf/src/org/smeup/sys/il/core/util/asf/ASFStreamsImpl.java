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
package org.smeup.sys.il.core.util.asf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.smeup.sys.il.core.util.QStreams;

public class ASFStreamsImpl implements QStreams {

	@Override
	public void copy(InputStream input, OutputStream output) {
		try {
			org.apache.commons.io.IOUtils.copy(input, output);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
