/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
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
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.os.cmd.base.api.ErrorCodeRef;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.usrspc.QUserSpace;

@Program(name = "QUSCUSAT")
public class UserSpaceChanger {

	@Inject
	private QJob job;
	@Inject
	private QResourceManager resourceManager;
	
	@Main
	public void main(@DataDef(length = 10) QCharacter returnedLibrary, 
					 @DataDef(qualified = true) UserSpaceRef userSpaceRef, 
					 AttributeToChange attributeToChange, 
					 ErrorCodeRef errorCode) {

		errorCode.clear();
		QResourceReader<QUserSpace> userSpaceReader = resourceManager.getResourceReader(job, QUserSpace.class, userSpaceRef.library.asEnum(), userSpaceRef.library.asData().trimR());
		QUserSpace userSpace = userSpaceReader.lookup(userSpaceRef.name.trimR());
		
		
		if(userSpace.getLibrary().startsWith("QTMP"))
			returnedLibrary.eval("QTEMP");
		else
			returnedLibrary.eval(userSpace.getLibrary());
	}

	public static class AttributeToChange extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary £$01d1;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary £$01d2;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary £$01d3;
		@DataDef(length = 1)
		public QCharacter £$01d4;
	}
}
