/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Giuliano Giancristofaro - Initial API and implementation
 */
package org.smeup.sys.os.file.base.api;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.usrspc.base.api.UserSpaceRef;

@Program(name = "QDBLDBR")
public class DatabaseRelationsList {

	@Main
	public void main(UserSpaceRef qualifiedUserSpaceName, 
			@DataDef(length = 8) QCharacter formatName, 
			FileRef qualifiedFileName, 
			@DataDef(length = 10) QCharacter member,
			@DataDef(length = 10) QCharacter recordFormat, 
			ErrorCode errorCode) {

		"".toCharArray();

	}

	public static class JOBL0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter fileNameUsed;
		@DataDef(length = 10)
		public QCharacter fileLibraryNameUsed;
		@DataDef(length = 10)
		public QCharacter dependentFileName;
		@DataDef(length = 10)
		public QCharacter dependentLibraryName;
		@DataDef(length = 1)
		public QCharacter dependencyType;
		@DataDef(length = 3)
		public QCharacter reserved;
		@DataDef(binaryType = BinaryType.INTEGER) 
		public QBinary joinReferenceNumber;
		@DataDef(length = 10)
		public QCharacter constraintLibraryName;
		@DataDef(binaryType = BinaryType.INTEGER) 
		public QBinary constraintNameLength;
		@DataDef(length = 258)
		public QCharacter constraintName;
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