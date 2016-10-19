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
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.memo.Scope;

@Program(name = "QUSLJOB")
public class JobList {

	@Main
	public void main(@DataDef(qualified = true) UserSpaceRef UserSpaceRef, @DataDef(length = 8) QCharacter formatName, @DataDef(qualified = true) JobName jobName,
			@DataDef(length = 10) QEnum<Status, QCharacter> status, ErrorCode errorCode, @DataDef(length = 1) QCharacter jobType,
			@DataDef(binaryType = BinaryType.INTEGER, value = " 0") QBinary numberFiedsToReturn,
			@DataDef(dimension = 100, binaryType = BinaryType.INTEGER, value = " 0") QArray<QBinary> keyOfFiledsToReturn, @DataDef(length = 48) QCharacter continuationHandle) {

		"".toCharArray();
	}

	public static class JOBL0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter jobNameUsed;
		@DataDef(length = 10)
		public QCharacter jobUserUsed;
		@DataDef(length = 6)
		public QCharacter jobNumberUsed;
		@DataDef(length = 16)
		public QCharacter internalJobIdentifier;
		@DataDef(length = 10)
		public QCharacter status;
		@DataDef(length = 1)
		public QCharacter jobType;
		@DataDef(length = 1)
		public QCharacter jobSubtype;
		@DataDef(length = 2)
		public QCharacter reserved;
	}

	public static class JOBL0200 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 56)
		public QCharacter jobl0100Format;
		@DataDef(length = 1)
		public QCharacter jobInformationStatus;
		@DataDef(length = 3)
		public QCharacter reserved;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary numberOfFieldReturned;
		// TODO continue ds... 
	}
	
	public static class UserSpaceRef extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<Scope, QCharacter> library;
	}
	
	public static enum Status {
		@Special(value = "*ACTIVE") ACTIVE, @Special(value = "*JOBQ") JOBQ, @Special(value = "*OUTQ") OUTQ, @Special(value = "*ALL") ALL
	}

	public static class ErrorCode extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER, value = "144")
		public QBinary aebytprv;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary aebytavl;
		@DataDef(length = 7)
		public QCharacter aeexcpid;
		@DataDef(length = 1)
		public QCharacter £mu_apierror_1;
		@DataDef(length = 128)
		public QCharacter aeexcpdta;
	}

}
