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
package org.smeup.sys.os.type.base.api;

import org.smeup.sys.dk.core.ToDo;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QStroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;

@Program(name = "QWCCALOC")
public class ObjectAllocator {

	public @Entry void main(@ToDo @DataDef(dimension = 50) QStroller<ObjectSpecification> objectSpecifications, @ToDo @DataDef(binaryType = BinaryType.SHORT) QEnum<WaitTimeEnum, QBinary> waitTime,
			@ToDo @DataDef(length = 1) QEnum<LockScopeEnum, QCharacter> lockScope, @ToDo @DataDef(length = 1) QEnum<LockConflictActionEnum, QCharacter> lockConflictAction) {

		int i = 0;
		for (ObjectSpecification objectSpecification : objectSpecifications) {
			i++;

			if (objectSpecification.isEmpty())
				continue;

			if (!objectSpecification.toString().trim().isEmpty())
				System.out.println(i + ":" + objectSpecification);

			switch (lockScope.asEnum()) {
			case JOB:
				break;
			case LCKSPC:
				break;
			case THREAD:
				break;
			}

			if (!objectSpecification.lockState.isEmpty())
				switch (objectSpecification.lockState.asEnum()) {
				case EXCL:
					break;
				case EXCLRD:
					break;
				case SHRNUP:
					break;
				case SHRRD:
					break;
				case SHRUPD:
					break;
				}
		}

	}

	public static class ObjectSpecification extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(qualified = true)
		public Object object;
		@DataDef(length = 7)
		public QEnum<ObjectTypeEnum, QCharacter> objectType;
		@DataDef(binaryType = BinaryType.SHORT)
		public QEnum<LockStateEnum, QBinary> lockState;
		@DataDef(length = 10)
		public QEnum<MemberIfDataBaseFileEnum, QCharacter> memberIfDataBaseFile;

		public static class Object extends QDataStructWrapper {
			private static final long serialVersionUID = 1L;
			@DataDef(length = 10)
			public QCharacter name;
			@DataDef(length = 10, value = "*LIBL")
			public QEnum<LibraryEnum, QCharacter> library;

			public static enum LibraryEnum {
				LIBL, CURLIB, OTHER
			}
		}

		public static enum ObjectTypeEnum {
			@Special(value = "AUTL")
			AUTL, @Special(value = "BNDDIR")
			BNDDIR, @Special(value = "CLD")
			CLD, @Special(value = "CRQD")
			CRQD, @Special(value = "CSI")
			CSI, @Special(value = "CSPMAP")
			CSPMAP, @Special(value = "CSPTBL")
			CSPTBL, @Special(value = "DEVD")
			DEVD, @Special(value = "DTAARA")
			DTAARA, @Special(value = "DTADCT")
			DTADCT, @Special(value = "DTAQ")
			DTAQ, @Special(value = "FCT")
			FCT, @Special(value = "FILE")
			FILE, @Special(value = "FNTRSC")
			FNTRSC, @Special(value = "FNTTBL")
			FNTTBL, @Special(value = "FORMDF")
			FORMDF, @Special(value = "IMGCLG")
			IMGCLG, @Special(value = "IPXD")
			IPXD, @Special(value = "LIB")
			LIB, @Special(value = "LOCALE")
			LOCALE, @Special(value = "MEDDFN")
			MEDDFN, @Special(value = "MENU")
			MENU, @Special(value = "MGTCOL")
			MGTCOL, @Special(value = "MODULE")
			MODULE, @Special(value = "MSGQ")
			MSGQ, @Special(value = "NODL")
			NODL, @Special(value = "NTBD")
			NTBD, @Special(value = "NWSCFG")
			NWSCFG, @Special(value = "NWSD")
			NWSD, @Special(value = "OVL")
			OVL, @Special(value = "PAGDFN")
			PAGDFN, @Special(value = "PAGSEG")
			PAGSEG, @Special(value = "PDFMAP")
			PDFMAP, @Special(value = "PDG")
			PDG, @Special(value = "PGM")
			PGM, @Special(value = "PNLGRP")
			PNLGRP, @Special(value = "PSFCFG")
			PSFCFG, @Special(value = "QMFORM")
			QMFORM, @Special(value = "QMQRY")
			QMQRY, @Special(value = "QRYDFN")
			QRYDFN, @Special(value = "SBSD")
			SBSD, @Special(value = "SCHIDX")
			SCHIDX, @Special(value = "SQLPKG")
			SQLPKG, @Special(value = "SRVPGM")
			SRVPGM, @Special(value = "SSND")
			SSND, @Special(value = "S36")
			S36, @Special(value = "TIMZON")
			TIMZON, @Special(value = "USRIDX")
			USRIDX, @Special(value = "USRQ")
			USRQ, @Special(value = "USRSPC")
			USRSPC, @Special(value = "VLDL")
			VLDL, @Special(value = "WSCST")
			WSCST
		}

		public static enum LockStateEnum {
			@Special(value = "1")
			SHRRD, @Special(value = "2")
			SHRNUP, @Special(value = "3")
			SHRUPD, @Special(value = "4")
			EXCLRD, @Special(value = "5")
			EXCL
		}

		public static enum MemberIfDataBaseFileEnum {
			@Special(value = "X'40'")
			FIRST, OTHER
		}
	}

	public static enum WaitTimeEnum {
		@Special(value = "-1")
		CLS, OTHER
	}

	public static enum LockScopeEnum {
		@Special(value = "J")
		JOB, @Special(value = "T")
		THREAD, @Special(value = "L")
		LCKSPC
	}

	public static enum LockConflictActionEnum {
		@Special(value = "N")
		NORQSRLS, @Special(value = "Y")
		RQSRLS
	}

}