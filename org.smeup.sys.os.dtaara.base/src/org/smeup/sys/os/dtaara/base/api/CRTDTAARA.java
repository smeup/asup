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

@Program(name = "CRTDTAARA")
public @ToDo class CRTDTAARA {
	public static enum QCPFMSG {
	}

	public @Entry void main(@ToDo @DataDef(qualified = true) DATAAREA dataArea, @ToDo @DataDef(length = 1) QEnum<TYPEEnum, QCharacter> type, @ToDo LENGTH length, QAdapter initialValue,
			@DataDef(qualified = true) REMOTEDATAAREA remoteDataArea, @DataDef(length = 8) QEnum<REMOTELOCATIONEnum, QCharacter> remoteLocation, @DataDef(length = 18) QCharacter relationalDatabase,
			@DataDef(length = 10) QEnum<APPCDEVICEDESCRIPTIONEnum, QCharacter> aPPCDeviceDescription, @DataDef(length = 8) QEnum<LOCALLOCATIONEnum, QCharacter> localLocation,
			@DataDef(length = 8) QEnum<MODEEnum, QCharacter> mode, @DataDef(length = 8) QEnum<REMOTENETWORKIDENTIFIEREnum, QCharacter> remoteNetworkIdentifier,
			@DataDef(length = 50) QEnum<TEXTDESCRIPTIONEnum, QCharacter> textDescription, @DataDef(length = 10) QEnum<AUTHORITYEnum, QCharacter> authority) {
	}

	public static class DATAAREA extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*CURLIB")
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			CURLIB, OTHER
		}
	}

	public static enum TYPEEnum {
		@Special(value = "D")
		DEC, @Special(value = "C")
		CHAR, @Special(value = "L")
		LGL, @Special(value = "R")
		DDM
	}

	public static class LENGTH extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary length;
		@DataDef(binaryType = BinaryType.SHORT)
		public QBinary decimalPositions;
	}

	public static class REMOTEDATAAREA extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10)
		public QEnum<LIBRARYEnum, QCharacter> library;

		public static enum LIBRARYEnum {
			LIBL, CURLIB, OTHER
		}
	}

	public static enum REMOTELOCATIONEnum {
		RDB, OTHER
	}

	public static enum APPCDEVICEDESCRIPTIONEnum {
		LOC, OTHER
	}

	public static enum LOCALLOCATIONEnum {
		LOC, NETATR, OTHER
	}

	public static enum MODEEnum {
		NETATR, OTHER
	}

	public static enum REMOTENETWORKIDENTIFIEREnum {
		LOC, NETATR, NONE, OTHER
	}

	public static enum TEXTDESCRIPTIONEnum {
		@Special(value = "")
		BLANK, OTHER
	}

	public static enum AUTHORITYEnum {
		LIBCRTAUT, CHANGE, ALL, USE, EXCLUDE, OTHER
	}
}
