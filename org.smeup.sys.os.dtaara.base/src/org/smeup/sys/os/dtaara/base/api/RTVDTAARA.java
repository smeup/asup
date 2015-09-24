package org.smeup.sys.os.dtaara.base.api;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QAdapter;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;

@Program(name = "RTVDTAARA")
public @ToDo class RTVDTAARA {
	public static enum QCPFMSG {
	}

	public @Entry void main(@ToDo DATAAREASPECIFICATION dataAreaSpecification, @ToDo QAdapter cLVariableForReturnedValue) {
	}

	public static class DATAAREASPECIFICATION extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(qualified = true)
		public QEnum<DATAAREAEnum, DATAAREASPECIFICATION.DATAAREA> dataArea;
		@DataDef(value = "*ALL")
		public QEnum<SUBSTRINGSPECIFICATIONSEnum, DATAAREASPECIFICATION.SUBSTRINGSPECIFICATIONS> substringSpecifications;

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

		public static class SUBSTRINGSPECIFICATIONS extends QDataStructWrapper {
			private static final long serialVersionUID = 1L;
			@DataDef(binaryType = BinaryType.SHORT)
			public QBinary substringStartingPosition;
			@DataDef(binaryType = BinaryType.SHORT)
			public QBinary substringLength;
		}

		public static enum SUBSTRINGSPECIFICATIONSEnum {
			@Special(value = "0")
			ALL, OTHER
		}
	}
}
