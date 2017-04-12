package org.smeup.sys.os.pgm.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;

@Program(name = "QWTCCSTA")
public class AttentionProgramSetter {

	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;
	
	public static enum QCPFMSG {
	}

	@Main
	public void main(@DataDef(qualified = true) ProgramRef program, @DataDef(length = 4) QEnum<SETATTENTIONKEYEnum, QCharacter> setAttentionKey) {

		jobLogManager.error(job, "***TODO*** Implement API - QWTCCSTA - AttentionProgramSetter");	
		System.err.println("***TODO*** Implement API - QWTCCSTA - AttentionProgramSetter");
	}

	public static enum SETATTENTIONKEYEnum {
		ON, OFF
	}
}
