package org.smeup.sys.os.core.base.api;

import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;

@Program(name = "QTONPING")
public @ToDo class TcpConnectionVerify {
	public static enum QCPFMSG {
		TCP0000
	}

	@Main
	public void main(@ToDo @DataDef(length = 255) QEnum<REMOTESYSTEMEnum, QCharacter> remoteSystem, @DataDef(length = 64) QCharacter remoteInternetAddress,
			@DataDef(length = 10) QEnum<ADDRESSVERSIONFORMATEnum, QCharacter> addressVersionFormat, @ToDo MESSAGEMODE messageMode,
			@ToDo @DataDef(binaryType = BinaryType.INTEGER) QBinary packetLengthinBytes, @ToDo @DataDef(binaryType = BinaryType.INTEGER) QBinary numberOfPackets,
			@DataDef(binaryType = BinaryType.INTEGER) QBinary waitTimeinSeconds, @DataDef(length = 64) QEnum<LOCALINTERNETADDRESSEnum, QCharacter> localInternetAddress,
			@DataDef(binaryType = BinaryType.SHORT) QEnum<TYPEOFSERVICEEnum, QBinary> typeOfService,
			@DataDef(binaryType = BinaryType.INTEGER) QEnum<IPTIMETOLIVEHOPLIMITEnum, QBinary> iPTimeToLivehopLimit) {
	}

	public static enum REMOTESYSTEMEnum {
		INTNETADR, OTHER
	}

	public static enum ADDRESSVERSIONFORMATEnum {
		CALC, IP4, IP6
	}

	public static class MESSAGEMODE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10, value = "*VERBOSE")
		public QEnum<RESPONSEMESSAGEDETAILEnum, QCharacter> responseMessageDetail;
		@DataDef(length = 10, value = "*COMP")
		public QEnum<SUMMARYIFRESPONSEERRORSEnum, QCharacter> summaryIfResponseErrors;

		public static enum RESPONSEMESSAGEDETAILEnum {
			VERBOSE, QUIET
		}

		public static enum SUMMARYIFRESPONSEERRORSEnum {
			COMP, ESCAPE
		}
	}

	public static enum LOCALINTERNETADDRESSEnum {
		ANY, OTHER
	}

	public static enum TYPEOFSERVICEEnum {
		@Special(value = "2") MINDELAY, @Special(value = "3") MAXTHRPUT, @Special(value = "4") MAXRLB, @Special(value = "5") MINCOST, @Special(value = "6") NORMAL
	}

	public static enum IPTIMETOLIVEHOPLIMITEnum {
		@Special(value = "0") DFT, OTHER
	}
}
