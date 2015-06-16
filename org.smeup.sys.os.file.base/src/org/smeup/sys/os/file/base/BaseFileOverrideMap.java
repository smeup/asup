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
package org.smeup.sys.os.file.base;

import java.util.HashMap;
import java.util.Map;

import org.smeup.sys.os.file.QFile;

public class BaseFileOverrideMap {

	private Map<String, QFile> files = null;

	public BaseFileOverrideMap() {
		this.files = new HashMap<String, QFile>();
	}

	public QFile getFile(String name) {
		QFile file = files.get(name);
		return file;
	}

	public void registerFile(String name, QFile file) {
		this.files.put(name, file);
	}
}