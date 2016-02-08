/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 */
package org.smeup.sys.dk.parser.ibmi.cl.model.pgm;

import java.util.List;
import java.util.LinkedList;

public class CLObject extends CLAbstractComponent{

	List<CLRow> rows = null;

	public CLObject() {
		rows = new LinkedList<CLRow>();
	}

	public void setRows(List<CLRow> rows) {
		this.rows = rows;
	}

	public void addRow(CLRow row) {
		rows.add(row);
	}

	public List<CLRow> getRows() {
		return this.rows;
	}

	@Override
	public CLComponentType getComponentType() {
		return CLComponentType.CL;
	}
}
