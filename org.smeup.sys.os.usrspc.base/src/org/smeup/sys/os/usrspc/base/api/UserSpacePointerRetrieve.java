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
import org.smeup.sys.il.data.QDataContext;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.QPointer;
import org.smeup.sys.il.data.QString;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceReader;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.usrspc.QUserSpace;

@Program(name = "QUSPTRUS")
public class UserSpacePointerRetrieve {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QDataContext dataContext;

	@Main
	public void main(@DataDef(qualified = true) UserSpaceRef userSpaceRef, QPointer returnPointer, ErrorCode errorCode) {

		QUserSpace userSpace = null;
		QResourceReader<QUserSpace> userSpaceReader = resourceManager.getResourceReader(job, QUserSpace.class, userSpaceRef.library.asEnum(), userSpaceRef.library.asData().trimR());
		userSpace = userSpaceReader.lookup(userSpaceRef.name.trimR());

		if (userSpace == null) {
			System.err.println("User space not found");
			return;
		}

		byte[] bytes = userSpace.getContentArray();
//		bytes = Arrays.copyOfRange(bytes, 0, 0);
		QString receiverVariable = dataContext.getDataFactory().createCharacter(bytes.length, false, true);
		receiverVariable.eval(new String(bytes, dataContext.getCharset()));
		returnPointer.eval(receiverVariable.qAddr());
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
