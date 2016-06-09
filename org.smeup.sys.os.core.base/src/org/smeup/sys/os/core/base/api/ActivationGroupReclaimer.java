/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Giuliano Giancristofaro - Initial API and implementation
 *   Mattia Rocchi - Implementation
 */
package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.QExceptionManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.pgm.QActivationGroup;
import org.smeup.sys.os.pgm.QActivationGroupManager;

@Program(name = "QWVCCDLA")
public class ActivationGroupReclaimer {

	@Inject
	private QActivationGroupManager activationGroupManager;
	@Inject
	private QExceptionManager exceptionManager;
	@Inject
	private QJob job;
	
	public static enum QCPFMSG {
		CPF1653, CPF1654
	}

	@Main
	public void main(@DataDef(length = 10) QEnum<ACTIVATIONGROUPEnum, QCharacter> activationGroup, @DataDef(length = 1) QEnum<CLOSEOPTIONEnum, QCharacter> closeOption) {
		
		switch (activationGroup.asEnum()) {
		case ELIGIBLE:
			activationGroupManager.closeAll(job);
			break;
		case OTHER:
			QActivationGroup qActivationGroup = activationGroupManager.lookup(job, activationGroup.asData().trimR());
			if(qActivationGroup == null)
				throw exceptionManager.prepareException(job, QCPFMSG.CPF1653, activationGroup);

			if(!activationGroupManager.close(job, qActivationGroup))
				throw exceptionManager.prepareException(job, QCPFMSG.CPF1654, activationGroup);
			
			break;
		}		
	}

	public static enum ACTIVATIONGROUPEnum {
		ELIGIBLE, OTHER
	}

	public static enum CLOSEOPTIONEnum {
		@Special(value = "N")
		NORMAL, @Special(value = "A")
		ABNORMAL
	}
}