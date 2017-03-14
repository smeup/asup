package org.smeup.sys.os.core.base.api;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Overlay;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.data.def.DateFormat;

@Program(name = "QWCCVTDT")
public class DateTimeConvertFormat {
	public static enum QCPFMSG {
	}

	@Main
	public void main(@DataDef(length = 10) QEnum<DateFormat, QCharacter> inputFormat, @DataDef(length = 20) QCharacter inputVariable, @DataDef(length = 10) QEnum<DateFormat, QCharacter> outputFormat,
			@DataDef(length = 20) QCharacter outputVariable, QUSEC qusec, @DataDef(length = 10) QEnum<TIMEZONEEnum, QCharacter> inputTimeZone,
			@DataDef(length = 10) QEnum<TIMEZONEEnum, QCharacter> outputTimeZone, @DataDef(length = 20) QCharacter timeZoneInformation,
			@DataDef(binaryType = BinaryType.INTEGER) QCharacter lengthTimeZoneInformation, @DataDef(length = 1) QCharacter precisionIndicator, @DataDef(length = 1) QCharacter inputTimeIndicator) {
		
			// TODO verificare fusi orari oggetto *TIMZON
			outputVariable.eval(inputVariable);
			qusec.qusbavl.eval(0);
	}

	public static enum TIMEZONEEnum {
		SYS, UTC, JOB
	}

	public static class QUSEC extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER, value = "16")
		@Overlay(position = 1)
		public QBinary qusbprv;
		@DataDef(binaryType = BinaryType.INTEGER)
		@Overlay(position = 5)
		public QBinary qusbavl;
		@DataDef(length = 7)
		@Overlay(position = 9)
		public QCharacter qusei;
		@DataDef(length = 1)
		@Overlay(position = 16)
		public QCharacter quserved;
	}

}
