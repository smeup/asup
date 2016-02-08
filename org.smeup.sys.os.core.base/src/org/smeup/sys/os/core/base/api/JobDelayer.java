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
 *   Mattia Rocchi   - Further implementation
 */
package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.dk.core.annotation.Supported;
import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.core.jobs.QJobManager;

@Program(name = "QWCDLYJB")
public @Supported class JobDelayer {

	@Inject
	private QJobManager jobManager;
	
	public static enum QCPFMSG {
	}

	@Main
	public void main(@Supported @DataDef(binaryType = BinaryType.INTEGER) QBinary seconds, @Supported @DataDef(length = 8) QCharacter resumeTime) {
		
		if(!seconds.isEmpty())
			jobManager.delay(seconds.asInteger() * 1000);
		else 
			jobManager.delay(resumeTime.trimR());
	}
}
