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

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.smeup.sys.co.shell.QShellOutputWrapper;

public class BaseShellOutputWrapperImpl implements QShellOutputWrapper {

	private Map<String, Writer> writers = new HashMap<String, Writer>();

	@Override
	public void flush(String contextID) throws IOException {
		if (writers.containsKey(contextID))
			writers.get(contextID).flush();
	}

	@Override
	public void write(String contextID, String value) throws IOException {
		if (writers.containsKey(contextID))
			writers.get(contextID).write(value);
	}

	@Override
	public void register(String contextID, Writer writer) {
		writers.put(contextID, writer);
	}

	@Override
	public void unregister(String contextID) {
		writers.remove(contextID);
	}

	@Override
	public boolean contains(String contextID) {
		return writers.containsKey(contextID);
	}

}
