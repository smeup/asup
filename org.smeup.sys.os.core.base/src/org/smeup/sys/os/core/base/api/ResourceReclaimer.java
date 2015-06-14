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
package org.smeup.sys.os.core.base.api;

import org.smeup.sys.dk.core.ToDo;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;

@Program(name = "QWCCRCRC")
public class ResourceReclaimer {

	public @Entry void main(@ToDo @DataDef(length = 1) QEnum<ProgramLevelEnum, QCharacter> programLevel, @ToDo @DataDef(length = 1) QEnum<CloseOptionEnum, QCharacter> closeOption) {
	}

	public static enum ProgramLevelEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "C")
		CALLER
	}

	public static enum CloseOptionEnum {
		@Special(value = "N")
		NORMAL, @Special(value = "A")
		ABNORMAL
	}
}
