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
 *   Franco Lombardo - Further implementation
 */
package org.smeup.sys.os.core.base.api;

import javax.inject.Inject;

import org.smeup.sys.il.data.QBinary;
import org.smeup.sys.il.data.QCharacter;
import org.smeup.sys.il.data.QDataStructWrapper;
import org.smeup.sys.il.data.annotation.DataDef;
import org.smeup.sys.il.data.annotation.Main;
import org.smeup.sys.il.data.annotation.Program;
import org.smeup.sys.il.data.def.BinaryType;
import org.smeup.sys.os.core.jobs.QJob;
import org.smeup.sys.os.core.jobs.QJobLogManager;

@Program(name = "QWCRSVAL")
public class SystemValuesRetriever {

	
	@Inject
	private QJob job;
	@Inject
	private QJobLogManager jobLogManager;

	private DATAHEADER dataHeader;
	private DATAVALUE dataValue;
	
	@Main
	public void main(@DataDef(length = 1024) QCharacter variable, 
			@DataDef(binaryType = BinaryType.INTEGER) QBinary length, 
			@DataDef(binaryType = BinaryType.INTEGER) QBinary number,
			@DataDef(length = 10) QCharacter names, 
			ErrorCodeRef error) {

	
		if(names.eq("QSYSLIBL")){
			dataValue.clear();
			dataValue.systemValue.eval(names);
			dataValue.typeData.eval("C");
			dataValue.dataV.eval(job.getSystem().getSystemLibrary());
			dataValue.dataLength.eval(dataValue.dataV.qTrimr().getSize());

			//
			dataHeader.clear();
			dataHeader.numberValuesReturned.eval(1);
			dataHeader.offsetValue.eval(8);
			dataHeader.dataH.eval(dataValue);
			
			variable.eval(dataHeader);
		} else {
			error.bytesAvailable.eval(1);
			jobLogManager.error(job, "QWCRSVAL - SystemValuesRetriever - value: " + names.trimR() + " not implemented");
		}
	}

	
	public static class DATAHEADER extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary numberValuesReturned;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary offsetValue;
		@DataDef(length = 1000)
		public QCharacter dataH;
	}
	
	public static class DATAVALUE extends QDataStructWrapper {
		private static final long serialVersionUID = 1L;
		@DataDef(length = 10)
		public QCharacter systemValue;
		@DataDef(length = 1)
		public QCharacter typeData;
		@DataDef(length = 1)
		public QCharacter informationStatus;
		@DataDef(binaryType = BinaryType.INTEGER)
		public QBinary dataLength;
		@DataDef(length = 500)
		public QCharacter dataV;
	}
	
	
}
