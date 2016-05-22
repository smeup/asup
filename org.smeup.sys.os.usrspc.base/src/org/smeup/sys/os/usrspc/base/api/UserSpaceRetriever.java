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
	
	@Main
	public void main(@DataDef(qualified = true) UserSpaceRef userSpaceRef, 
					 @DataDef(binaryType = BinaryType.INTEGER) QBinary startPosition, 
					 @DataDef(binaryType = BinaryType.INTEGER) QBinary dataLength,
					 QPointer receiverPointer,
					 ERROR errorCode) {
		
		QResourceReader<QUserSpace> userSpaceReader = resourceManager.getResourceReader(job, QUserSpace.class, userSpaceRef.library.asEnum(), userSpaceRef.library.asData().trimR());
		QUserSpace userSpace = userSpaceReader.lookup(userSpaceRef.name.trimR());
		if(userSpace == null) {
			errorCode.exceptionID.eval("002762");
			return;
		}
		
		QString receiverVariable = receiverPointer.qStr();
		if(userSpace.getContent() != null)
			receiverVariable.eval(userSpace.getContent().substring(startPosition.i()-1, startPosition.i()+dataLength.i()-1));
		else if(userSpace.getContentArray() != null) {
			byte[] bytes = Arrays.copyOfRange(userSpace.getContentArray(), startPosition.i()-1, startPosition.i()+dataLength.i()-2);
			receiverVariable.eval(new String(bytes, dataContext.getCharset()));
		}
	}

	public static class ERROR extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary bytesProvided;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary bytesAvailable;
		@DataDef(length = 7)
		public QCharacter exceptionID;
		@DataDef(length = 1)
		public QCharacter reserved01;
	}
}
