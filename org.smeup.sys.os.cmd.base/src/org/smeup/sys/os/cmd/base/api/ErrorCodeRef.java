/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.cmd.base.api;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.def.BinaryType;

public class ErrorCodeRef extends QDataStructWrapper {

	private static final long serialVersionUID = 1L;

	@DataDef(binaryType = BinaryType.INTEGER)
	public QBinary bytesProvided;
	@DataDef(binaryType = BinaryType.INTEGER)
	public QBinary bytesAvailable;
	@DataDef(length = 7)
	public QCharacter exceptionName;
	@DataDef(length = 1)
	public QCharacter reserved01;
}
