/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.esql.impl;

import org.smeup.sys.db.esql.QDescriptorVariable;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QBufferedData;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QIndicator;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.def.BinaryType;

public class DescriptorVariableImpl extends QDataStructWrapper implements QDescriptorVariable {

	private static final long serialVersionUID = 1L;
	
	
	@DataDef(length = 30)
	public QCharacter name;
	@DataDef(length = 30)
	public QCharacter label;
	@DataDef(binaryType = BinaryType.SHORT)
	public QBinary type;
	@DataDef(binaryType = BinaryType.SHORT)
	public QBinary ccsid;	
	@DataDef(binaryType = BinaryType.SHORT)
	public QBinary length;
	@DataDef(binaryType = BinaryType.SHORT)
	public QBinary scale;
	@DataDef
	public QIndicator nullable;
	
	private transient QBufferedData data;
	
	public QBufferedData getBufferedData() {
		return this.data;
	}
	
	public QBufferedData setBufferedData(QBufferedData data) {
		return this.data = data;
	}
}