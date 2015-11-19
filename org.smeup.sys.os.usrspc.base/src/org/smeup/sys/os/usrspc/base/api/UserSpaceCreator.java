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
package org.smeup.sys.os.usrspc.base.api;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;

@Program(name = "QUSCRTUS")
public class UserSpaceCreator {

	@Main
	public void main(@DataDef(qualified = true) UserSpace userSpace, @DataDef(length = 10) QCharacter extendedAttribute, @DataDef(binaryType = BinaryType.BYTE) QBinary initialSize,
			@DataDef(length = 1) QCharacter initialValue, @DataDef(length = 10) QCharacter publicAuthority, @DataDef(length = 50) QCharacter textDescription,
			@DataDef(length = 10) QCharacter replace, ErrorCode errorCode, @DataDef(length = 10) QCharacter domain, @DataDef(binaryType = BinaryType.BYTE) QBinary transferSizeRequest,
			@DataDef(length = 1) QCharacter optimumSpaceAlignement) {
		// TODO
		errorCode.£$01e2.eval(1);

	}

	public static class UserSpace extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QCharacter library;
	}

	public static class ErrorCode extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER, value = "272")
		public QBinary £$01e1;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary £$01e2;
		@DataDef(length = 7)
		public QCharacter £$01e3;
		@DataDef(length = 1)
		public QCharacter £$01e4;
		@DataDef(length = 256)
		public QCharacter £$01e5;
	}
}
