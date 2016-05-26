package org.smeup.sys.os.pgm.base.api;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;

@Program(name = "QWVRCSTK")
public class CallStackRetriever {

	public static enum QCPFMSG {
	}

	private CSTK0100 cstk0100;

	public static enum FORMATEnum {
		CSTK0100, CSTK0200, CSTK0300;
	}

	@Main
	public void main(@DataDef(length = 32767) QCharacter receiverVariable, @DataDef(binaryType = BinaryType.SHORT) QBinary receiveVariableLength,
			@DataDef(length = 8) QEnum<FORMATEnum, QCharacter> formatName, JOBIDINFO jobIdentificationInformation, @DataDef(length = 8) QCharacter formatJobId, @DataDef() ERRORCODE errorCode) {

		receiverVariable.clear();
		errorCode.clear();
		cstk0100.clear();

		switch (formatName.asEnum()) {
		case CSTK0100:
			// TODO
			cstk0100.clear();
			receiverVariable.eval(cstk0100);
			break;
		case CSTK0200:
			break;
		case CSTK0300:
			break;
		}
	}

	// Format CSTK0100
	public static class CSTK0100 extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary bytesReturned;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary bytesAvailable;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary numberCallStackEntriesThread;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary offsetCallStackEntryInformation;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary numberCallStackEntriesReturned;
		@DataDef(length = 8)
		public QCharacter returnedThreadIdentifier;
		@DataDef(length = 1)
		public QCharacter informationStatus;
		public QPointer reserved;
	}

	public static class JOBIDINFO extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter jobName;
		@DataDef(length = 10)
		public QCharacter userName;
		@DataDef(length = 6)
		public QCharacter jobNumber;
		@DataDef(length = 16)
		public QCharacter internalJobIdentifier;
		@DataDef(length = 2)
		public QCharacter reserved;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary threadIndicator;
		@DataDef(length = 8)
		public QCharacter threadIdentifier;
	}

	public static class ERRORCODE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary bytesProvided;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary bytesAvailable;
		@DataDef(length = 7)
		public QCharacter exceptionId;
		@DataDef(length = 1)
		public QCharacter reserved;
		@DataDef(length = 128)
		public QCharacter exceprionData;
	}
}
