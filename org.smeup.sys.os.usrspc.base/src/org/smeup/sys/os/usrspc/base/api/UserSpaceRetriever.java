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

import java.util.Arrays;

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

@Program(name = "QUSRTVUS")
public class UserSpaceRetriever {

	@Inject
	private QResourceManager resourceManager;
	@Inject
	private QJob job;
	@Inject
	private QDataContext dataContext;

	private transient QUserSpace lastUserSpace = null;
	
	public static enum QCPFMSG {
		CPF3C0F, CPF3C01, CPF3C06
	}

	@Main
	public void main(@DataDef(qualified = true) UserSpaceRef userSpaceRef, 
					 @DataDef(binaryType = BinaryType.INTEGER) QBinary startPosition,
					 @DataDef(binaryType = BinaryType.INTEGER) QBinary dataLength, 
					 QPointer receiverPointer, 
					 ERROR errorCode) {

		
		errorCode.clear();
		
		if(startPosition.eq(1))
			lastUserSpace = null;
		
		QUserSpace userSpace = null;
		if(lastUserSpace != null && lastUserSpace.getName().equalsIgnoreCase(userSpaceRef.name.trimR()))
			userSpace = lastUserSpace;
		else {
			QResourceReader<QUserSpace> userSpaceReader = resourceManager.getResourceReader(job, QUserSpace.class, userSpaceRef.library.asEnum(), userSpaceRef.library.asData().trimR());
			userSpace = userSpaceReader.lookup(userSpaceRef.name.trimR());
			lastUserSpace = userSpace;
		}
		
		if (userSpace == null) {
			errorCode.exceptionName.eval(QCPFMSG.CPF3C01.name());
			return;
		}

		byte[] bytes = userSpace.getContentArray();
		if (bytes == null) {
			errorCode.exceptionName.eval(QCPFMSG.CPF3C06.name());
			return;
		}

		if (startPosition.gt(bytes.length)) {
			errorCode.exceptionName.eval(QCPFMSG.CPF3C0F.name());
			return;
		}

		QString receiverVariable = receiverPointer.qStr();
		int endPosition = startPosition.i() - 1 + dataLength.i();
		if(endPosition > bytes.length)
			endPosition = bytes.length;
		
		bytes = Arrays.copyOfRange(bytes, startPosition.i() - 1, endPosition);
		receiverVariable.eval(new String(bytes, dataContext.getCharset()));
		
	}

	public static class ERROR extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;

		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary bytesProvided;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary bytesAvailable;
		@DataDef(length = 7)
		public QCharacter exceptionName;
		@DataDef(length = 1)
		public QCharacter reserved01;
	}
}
