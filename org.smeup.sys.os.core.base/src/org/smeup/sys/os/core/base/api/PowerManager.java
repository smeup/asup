package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.rt.core.QApplicationManager;

public  @Program(name = "QWCCSDSC")  class PowerManager {

	@Inject
	private QApplicationManager applicationManager;
	
	public @Entry void main(@Supported @DataDef(length = 4) QEnum<RESTARTEnum, QCharacter> restart) {
		if (RESTARTEnum.YES.equals(restart.asEnum())){
			applicationManager.restart();
		} else {
			applicationManager.stop();			
		}
	}
	
	public static enum RESTARTEnum {
		@Special("*NO") 
		NO,
		@Special("*YES") 		
		YES
	}
}
