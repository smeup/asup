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
package org.smeup.sys.os.file.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.smeup.sys.os.file.QFileOverride;

public class BaseFileOverrideMap {

	private Map<String, QFileOverride> files = null;

	public BaseFileOverrideMap() {
		this.files = new HashMap<String, QFileOverride>();
	}

	public QFileOverride get(String name) {
		QFileOverride fileOverride = files.get(name);
		return fileOverride;
	}

	public void set(String name, QFileOverride fileOverride) {
		this.files.put(name, fileOverride);
	}
	
	public List<QFileOverride> list() {
		return new ArrayList<QFileOverride>(this.files.values());
	}
	
	public void remove(String name) {
		this.files.remove(name);
	}
	
	public void removeAll() {
		this.files.clear();
	}
}