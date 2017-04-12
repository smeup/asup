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
 */
package org.smeup.sys.os.usrprf.base.api;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.core.base.api.ErrorCodeRef;

@Program(name = "QSYCUSRA")
public class UserProfileCheckAuthority {

	@Main
	public void main(
			@DataDef(length = 1) QCharacter authorityIndicator, 
			@DataDef(length = 10) QCharacter userProfile, 
			@DataDef(length = 20) QCharacter qualifiedObjectName, 
			@DataDef(length = 10) QCharacter objectType, 
			@DataDef(length = 10) QCharacter authority, 
			@DataDef(binaryType = BinaryType.INTEGER) QBinary numberOfAuthorities,
			@DataDef(binaryType = BinaryType.INTEGER) QBinary callLevel,
			ErrorCodeRef errorCode) {
		
		errorCode.clear();
		authorityIndicator.eval("Y");
	}
}
