/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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
import org.smeup.sys.os.core.jobs.QJobCapability;

public class BaseShellOutputWrapperImpl implements QShellOutputWrapper {

	private Map<String, Writer> writers = new HashMap<String, Writer>();

	@Override
	public void flush(QJobCapability capability) throws IOException {
		if (writers.containsKey(capability.getObjectURI().toString()))
			writers.get(capability).flush();
	}

	@Override
	public void write(QJobCapability capability, String content) throws IOException {
		if (writers.containsKey(capability.getObjectURI().toString()))
			writers.get(capability.getObjectURI().toString()).write(content);
	}

	@Override
	public void register(QJobCapability capability, Writer writer) {
		writers.put(capability.getObjectURI().toString(), writer);
	}

	@Override
	public void unregister(QJobCapability capability) {
		writers.remove(capability.getObjectURI().toString());
	}

	@Override
	public boolean contains(QJobCapability capability) {
		return writers.containsKey(capability.getObjectURI().toString());
	}
}
