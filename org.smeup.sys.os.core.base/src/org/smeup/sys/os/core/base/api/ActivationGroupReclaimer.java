/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Giuliano Giancristofaro - Initial API and implementation
 */
package org.smeup.sys.os.core.base.api;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;

@Program(name = "QWVCCDLA")
public class ActivationGroupReclaimer {

	public static enum QCPFMSG {
		CPF1653, CPF1654
	}

	public @Main void main(@ToDo @DataDef(length = 10) QEnum<ACTIVATIONGROUPEnum, QCharacter> activationGroup, @ToDo @DataDef(length = 1) QEnum<CLOSEOPTIONEnum, QCharacter> closeOption) {
	}

	public static enum ACTIVATIONGROUPEnum {
		ELIGIBLE, OTHER
	}

	public static enum CLOSEOPTIONEnum {
		@Special(value = "N")
		NORMAL, @Special(value = "A")
		ABNORMAL
	}

}
