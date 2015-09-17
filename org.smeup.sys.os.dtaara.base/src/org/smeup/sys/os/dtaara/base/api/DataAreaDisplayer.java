package org.smeup.sys.os.dtaara.base.api;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;

@Program(name = "QWCCDSVC")
public class DataAreaDisplayer {
	public static enum QCPFMSG {
	}

	public @Entry void main(
			@DataDef(qualified = true) QEnum<DATAAREAEnum, DATAAREA> dataArea,
			@DataDef(length = 1) QEnum<OUTPUTEnum, QCharacter> output,
			@DataDef(length = 1) QEnum<OUTPUTFORMATEnum, QCharacter> outputFormat,
			@DataDef(length = 1) QEnum<SYSTEMEnum, QCharacter> system) {
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

	public static enum OUTPUTEnum {
		@Special(value = "*")
		TERM_STAR, @Special(value = "L")
		PRINT
	}

	public static enum OUTPUTFORMATEnum {
		@Special(value = "C")
		CHAR, @Special(value = "H")
		HEX
	}

	public static enum SYSTEMEnum {
		@Special(value = "L")
		LCL, @Special(value = "R")
		RMT
	}
}
