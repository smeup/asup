package org.smeup.sys.os.dtaara.base.api;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;

@Program(name = "QLIDLDTAARA")
public @ToDo class DataAreaDeleter {
	public static enum QCPFMSG {
	}

	public @Entry void main(@DataDef(qualified = true) DATAAREA dataArea) {
	}

	public static class DATAAREA extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<NAMEGENERICEnum, QCharacter> nameGeneric;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum NAMEGENERICEnum {
			ALL, OTHER
		}

		public static enum LIBRARYEnum {
			LIBL, CURLIB, USRLIBL, ALLUSR, ALL, OTHER
		}
	}
}
