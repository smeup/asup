package org.smeup.sys.os.core.base.api;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;

@Program(name = "QWTCCRLJ")
public class JobReleaser {

	public static enum QCPFMSG {
	}

	@Main
	public void main(@DataDef(qualified = true) JOBNAME jobName, @DataDef(length = 10) QEnum<DUPLICATEJOBOPTIONEnum, QCharacter> duplicateJobOption) {
		"".toCharArray();
	}

	public static class JOBNAME extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10)
		public QCharacter user;
		@DataDef(length = 6)
		public QCharacter number;
	}

	public static enum DUPLICATEJOBOPTIONEnum {
		SELECT, MSG
	}
}
