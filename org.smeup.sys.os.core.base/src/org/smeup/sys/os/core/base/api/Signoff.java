package org.smeup.sys.os.core.base.api;
import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobManager;

@Program(name="QWCCLFEC") public @Supported class Signoff {
  public static enum QCPFMSG {}
  
	@Inject
	private QJob job;
	@Inject
	private QJobManager jobManager;
  
  public @Main void main(@ToDo @DataDef(length=7) QEnum<LOGEnum,QCharacter> log){
	jobManager.close(job);  
  }
  
  public static enum LOGEnum {
	  NOLIST,   
	  LIST
  }
}
