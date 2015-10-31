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
 *   Franco Lombardo - Further implementation
 */
package org.smeup.sys.os.core.base.api;

import org.smeup.sys.il.core.annotation.Overlay;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QDecimal;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;

@Program(name = "QWCRSVAL")
public class SystemValuesRetriever {
	public @Entry void main(@DataDef(length=10) QCharacter variable,
							@DataDef(precision = 10) QDecimal length,
							@DataDef(precision = 10, value = "1") QDecimal number,
							@DataDef(length = 10) QCharacter names,							
							QUSEC error) {
		"".toCharArray();
	}

	public static class QUSEC extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = "1")
		public QBinary qusbprv;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = "5")
		public QBinary qusbavl;
		@DataDef(length = 7)
		@Overlay(position = "9")
		public QCharacter qusei;
		@DataDef(length = 1)
		@Overlay(position = "16")
		public QCharacter quserved;
	}
}
