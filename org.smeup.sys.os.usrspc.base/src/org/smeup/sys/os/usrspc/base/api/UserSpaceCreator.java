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
package org.smeup.sys.os.usrspc.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.usrspc.QOperatingSystemUserSpaceFactory;
import org.smeup.sys.os.usrspc.QUserSpace;

@Program(name = "QUSCRTUS")
public class UserSpaceCreator {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	
	@Main
	public void main(@DataDef(qualified = true) UserSpaceRef userSpaceRef, 
					 @DataDef(length = 10) QCharacter extendedAttribute, 
					 @DataDef(binaryType = BinaryType.INTEGER) QBinary initialSize,
 					 @DataDef(length = 1) QCharacter initialValue, 
 					 @DataDef(length = 10) QCharacter publicAuthority, 
					 @DataDef(length = 50) QCharacter textDescription,
					 @DataDef(length = 10) QCharacter replace, 
					 ErrorCode errorCode, 
					 @DataDef(length = 10) QCharacter domain, 
					 @DataDef(binaryType = BinaryType.BYTE) QBinary transferSizeRequest,
					 @DataDef(length = 1) QCharacter optimumSpaceAlignement) {
				
		try {
			QResourceWriter<QUserSpace> userSpaceWriter = resourceManager.getResourceWriter(job, QUserSpace.class, userSpaceRef.library.asEnum(), userSpaceRef.library.asData().trimR());
			
			QUserSpace userSpace = QOperatingSystemUserSpaceFactory.eINSTANCE.createUserSpace();
			userSpace.setAttribute(extendedAttribute.trimR());
			userSpace.setName(userSpaceRef.name.trimR());
			userSpace.setText(textDescription.trimR());

			userSpaceWriter.save(userSpace, replace.trimR().equalsIgnoreCase("*YES"));
			errorCode.£$01e2.eval(1);
		}
		catch(Exception e) {
			errorCode.£$01e2.eval(43);			
		}
	}

	public static class ErrorCode extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER, value = "272")
		public QBinary £$01e1;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary £$01e2;
		@DataDef(length = 7)
		public QCharacter £$01e3;
		@DataDef(length = 1)
		public QCharacter £$01e4;
		@DataDef(length = 256)
		public QCharacter £$01e5;
	}
}
