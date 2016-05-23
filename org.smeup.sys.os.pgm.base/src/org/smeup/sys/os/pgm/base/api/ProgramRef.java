/**
 * Copyright (c) 2012, 2016 Sme.UP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.smeup.sys.os.pgm.base.api;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;

public class ProgramRef extends QDataStructWrapper {

	private static final long serialVersionUID = 1L;

	@DataDef(length = 10)
	public QCharacter name;
	@DataDef(length = 10, value = "*LIBL")
	public QEnum<LibraryEnum, QCharacter> library;

	public static enum LibraryEnum {
		LIBL, CURLIB, USRLIBL, ALL, ALLUSR, OTHER
	}

}
