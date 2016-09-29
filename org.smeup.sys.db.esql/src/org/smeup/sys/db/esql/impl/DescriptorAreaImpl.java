/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.db.esql.impl;

import org.smeup.sys.db.esql.QDescriptorArea;
import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.def.BinaryType;

public class DescriptorAreaImpl extends QDataStructWrapper implements QDescriptorArea {

	private static final long serialVersionUID = 1L;
	@DataDef(length = 8)
	public QCharacter sqldaid;
	@DataDef(binaryType = BinaryType.INTEGER)
	public QBinary sqldabc;
	@DataDef(binaryType = BinaryType.SHORT)
	public QBinary sqln;
	@DataDef(binaryType = BinaryType.SHORT)
	public QBinary sqld;
	@DataDef(dimension = 10, length = 80)
	public QArray<QCharacter> sql_var;

}
