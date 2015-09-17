package org.smeup.sys.os.dtaara.base.api;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QAdapter;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;

@Program(name = "QWCCCHVC")
public @ToDo class DataAreaModifier {
	public static enum QCPFMSG {
	}

	public @Entry void main(
			@DataDef(qualified = true) QEnum<DATAAREAEnum, DATAAREA> dataArea,
			@ToDo QAdapter nuovoValore) {
	}

	public static class DATAAREA extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum DATAAREAEnum {
		LDA, GDA, PDA, OTHER
	}
}
