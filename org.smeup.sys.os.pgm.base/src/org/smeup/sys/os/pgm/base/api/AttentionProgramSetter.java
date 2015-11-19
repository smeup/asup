package org.smeup.sys.os.pgm.base.api;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;

@Program(name = "QWTCCSTA")
public class AttentionProgramSetter {
	public static enum QCPFMSG {
	}

	@Main
	public void main(@DataDef(qualified = true) ProgramRef program, @DataDef(length = 4) QEnum<SETATTENTIONKEYEnum, QCharacter> setAttentionKey) {
	}

	public static enum SETATTENTIONKEYEnum {
		ON, OFF
	}
}
