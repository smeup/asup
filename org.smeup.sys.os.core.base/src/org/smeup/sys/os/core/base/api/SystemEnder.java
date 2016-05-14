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
import org.smeup.sys.dk.core.annotation.ToDo;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.QScroller;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.annotation.Special;
import org.smeup.sys.il.data.def.BinaryType;
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
	public void main(@ToDo @DataDef(length = 1) QEnum<HOWTOENDEnum, QCharacter> howToEnd,
			@Supported @DataDef(binaryType = BinaryType.INTEGER) QEnum<CONTROLLEDENDDELAYTIMEEnum, QBinary> controlledEndDelayTime,
			@Supported @DataDef(length = 4) QEnum<UPGRADEEnum, QCharacter> upgrade,
			@Supported RESTARTOPTIONS restartOptions, @DataDef(length = 1) QEnum<IPLSOURCEEnum, QCharacter> iPLSource,
			@DataDef(length = 10) QCharacter imageCatalog,
			@DataDef(dimension = 3, length = 10) QScroller<QEnum<ENDSUBSYSTEMOPTIONEnum, QCharacter>> endSubsystemOption,
			@DataDef(length = 1) QEnum<TIMEOUTOPTIONEnum, QCharacter> timeoutOption,
			@DataDef(length = 10) QEnum<CONFIRMEnum, QCharacter> confirm) {

		systemManager.stop();

		switch (upgrade.asEnum()) {
		case NO:
			break;
		case YES:
			repositoryManager.updateAll(job);
			break;
		}

		switch (restartOptions.restartAfterPowerDown.asEnum()) {
		case NO:
			applicationManager.stop();
			break;
		case YES:
			applicationManager.restart();
			break;
		}
	}

	public static enum HOWTOENDEnum {
		@Special(value = "C") CNTRLD, @Special(value = "I") IMMED
	}

	public static enum CONTROLLEDENDDELAYTIMEEnum {
		@Special(value = "999999") NOLIMIT, OTHER
	}

	public static enum UPGRADEEnum {
		NO, YES
	}

	public static class RESTARTOPTIONS extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 1, value = "*NO")
		public QEnum<RESTARTAFTERPOWERDOWNEnum, QCharacter> restartAfterPowerDown;
		@DataDef(length = 1, value = "*IPLA")
		public QEnum<RESTARTTYPEEnum, QCharacter> restartType;

		public static enum RESTARTAFTERPOWERDOWNEnum {
			@Special(value = "N") NO, @Special(value = "Y") YES
		}

		public static enum RESTARTTYPEEnum {
			@Special(value = "I") IPLA, @Special(value = "S") SYS, @Special(value = "F") FULL
		}
	}

	public static enum IPLSOURCEEnum {
		@Special(value = "P") PANEL, @Special(value = "A") A, @Special(value = "B") B, @Special(value = "D") D, @Special(value = "I") IMGCLG
	}

	public static enum ENDSUBSYSTEMOPTIONEnum {
		DFT, NOJOBLOG, CHGPTY, CHGTSL
	}

	public static enum TIMEOUTOPTIONEnum {
		@Special(value = "C") CONTINUE, @Special(value = "M") MSD, @Special(value = "S") SYSREFCDE
	}

	public static enum CONFIRMEnum {
		ENVVAR, INTERACT, YES, NO
	}
}
