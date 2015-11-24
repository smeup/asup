/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Franco Lombardo - Initial API and implementation
 */
package org.smeup.sys.os.usrprf.base.api;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QEnum;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;

@Program(name = "QSYDLUP")
public @Supported class UserProfileDeleter {
	public static enum QCPFMSG {
	}

	@Main
	public void main(
			@Supported @DataDef(length = 10) QCharacter userProfile,
			QEnum<OWNEDOBJECTOPTIONEnum, OWNEDOBJECTOPTION> ownedObjectOption,
			QEnum<PRIMARYGROUPOPTIONEnum, PRIMARYGROUPOPTION> primaryGroupOption,
			@DataDef(length = 10) QEnum<EIMASSOCIATIONEnum, QCharacter> eIMAssociation) {
	}

	public static class OWNEDOBJECTOPTION extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 7)
		public QEnum<OWNEDOBJECTVALUEEnum, QCharacter> ownedObjectValue;
		@DataDef(length = 10)
		public QCharacter userProfileNameIfCHGOWN;

		public static enum OWNEDOBJECTVALUEEnum {
			CHGOWN
		}
	}

	public static enum OWNEDOBJECTOPTIONEnum {
		NODLT, DLT, OTHER
	}

	public static class PRIMARYGROUPOPTION extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QEnum<PRIMARYGROUPVALUEEnum, QCharacter> primaryGroupValue;
		@DataDef(length = 10)
		public QEnum<NEWPRIMARYGROUPEnum, QCharacter> newPrimaryGroup;
		@DataDef(length = 10, value = "*OLDPGP")
		public QEnum<NEWPRIMARYGROUPAUTHORITYEnum, QCharacter> newPrimaryGroupAuthority;

		public static enum PRIMARYGROUPVALUEEnum {
			CHGPGP
		}

		public static enum NEWPRIMARYGROUPEnum {
			NONE, OTHER
		}

		public static enum NEWPRIMARYGROUPAUTHORITYEnum {
			OLDPGP, PRIVATE, ALL, CHANGE, USE, EXCLUDE
		}
	}

	public static enum PRIMARYGROUPOPTIONEnum {
		NOCHG, OTHER
	}

	public static enum EIMASSOCIATIONEnum {
		DLT, NODLT
	}
}
