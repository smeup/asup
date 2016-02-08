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
package org.smeup.sys.os.msgf.base;

import java.util.HashMap;
import java.util.Map;

import org.smeup.sys.os.msgf.QMessageFile;

public class BaseMessageFileOverrideMap {

	private Map<String, QMessageFile> files = null;

	public BaseMessageFileOverrideMap() {
		this.files = new HashMap<String, QMessageFile>();
	}

	public QMessageFile getFile(String name) {
		QMessageFile file = files.get(name);
		return file;
	}

	public void registerFile(String name, QMessageFile file) {
		this.files.put(name, file);
	}
}