/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
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

import org.smeup.sys.il.data.QArray;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;

@Program(name = "QWCRTVCA")
public class CurrentAttributesRetriever {

	@Main
	public void main(@DataDef(length = 1000) QCharacter rcvvar, @DataDef(binaryType = BinaryType.BYTE, value = "1000") QBinary rcvlen, @DataDef(length = 8) QCharacter format,
			@DataDef(binaryType = BinaryType.BYTE) QBinary numval, @DataDef(dimension = 100, binaryType = BinaryType.BYTE) QArray<QBinary> $ky, QUSEC qusec) {

		"".toCharArray();
	}

	public static class QUSEC extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.BYTE)
		public QBinary qusbprv;
		@DataDef(binaryType = BinaryType.BYTE)
		public QBinary qusbavl;
		@DataDef(length = 7)
		public QCharacter qusei;
		@DataDef(length = 1)
		public QCharacter quserved;
	}

}
