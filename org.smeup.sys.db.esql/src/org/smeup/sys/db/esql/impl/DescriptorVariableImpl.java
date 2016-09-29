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
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.def.BinaryType;

public class DescriptorVariableImpl extends QDataStructWrapper implements QDescriptorVariable {

	private static final long serialVersionUID = 1L;
	@DataDef(binaryType = BinaryType.SHORT)
	public QBinary sqltype;
	@DataDef(binaryType = BinaryType.SHORT)
	public QBinary sqllen;
	@DataDef(length = 12)
	public QCharacter sqlres;
	@DataDef(length = 16)
	public QCharacter sqlinfo1;
	@DataDef(length = 16)
	@Overlay(name = "sqlinfo1", position = 1)
	public QCharacter sqldata;
	@DataDef(length = 16)
	public QCharacter sqlinfo2;
	@DataDef(length = 16)
	@Overlay(name = "sqlinfo2", position = 1)
	public QCharacter sqlind;
	@DataDef(binaryType = BinaryType.SHORT)
	public QBinary sqlnamelen;
	@DataDef(length = 30)
	public QCharacter sqlname;
}
