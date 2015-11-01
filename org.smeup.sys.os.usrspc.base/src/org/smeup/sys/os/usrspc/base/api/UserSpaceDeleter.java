/**
 *  Copyright (c) 2012, 2015 Sme.UP and others.
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
import org.smeup.sys.il.data.annotation.Entry;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.il.memo.QResourceManager;
import org.smeup.sys.il.memo.QResourceWriter;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.usrspc.QUserSpace;

@Program(name = "QUSDLTUS")
public class UserSpaceDeleter {

	@Inject
	private QJob job;
	@Inject
	private QResourceManager resourceManager;

	public @Entry void main(@DataDef(qualified = true) UserSpace userSpace, ErrorCode errorCode) {
		QResourceWriter<QUserSpace> userSpaceResource = resourceManager.getResourceWriter(job, QUserSpace.class, userSpace.library.trimR());
		QUserSpace qUserSpace = userSpaceResource.lookup(userSpace.name.trimR());
		if (qUserSpace == null){
			errorCode.£$01e2.eval(43);
			// TODO
			System.err.println("User Space not found: " + userSpace.name);
			//			throw new OperatingSystemRuntimeException("User Space not found: " + userSpace.name);
			return;
		}
		userSpaceResource.delete(qUserSpace);
	}

	public static class UserSpace extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter name;
		@DataDef(length = 10, value = "*LIBL")
		public QCharacter library;
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
