/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.os.core.QSystemManager;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.rt.core.QApplicationManager;
import org.smeup.sys.rt.repo.QRepositoryManager;

@Program(name = "QWCCSDSC") 
public class SystemEnder {

	@Inject
	private QApplicationManager applicationManager;
	@Inject
	private QRepositoryManager repositoryManager;
	@Inject
	private QSystemManager systemManager;
	@Inject
	private QJob job;
	
	@Main
	public void main(@Supported @DataDef(length = 4) QEnum<RESTARTEnum, QCharacter> restart, @Supported @DataDef(length = 4) QEnum<UPGRADEEnum, QCharacter> upgrade) {
		
		systemManager.stop();
		
		switch (upgrade.asEnum()) {
		case NO:
			break;
		case YES:
			repositoryManager.updateAll(job);
			break;
		}
		
		switch (restart.asEnum()) {
		case NO:			
			applicationManager.stop();
			break;
		case YES:
			applicationManager.restart();
			break;
		}
	}

	public static enum RESTARTEnum {
		@Special("*NO")
		NO, @Special("*YES")
		YES
	}

	public static enum UPGRADEEnum {
		@Special("*NO")
		NO, @Special("*YES")
		YES
	}
}
